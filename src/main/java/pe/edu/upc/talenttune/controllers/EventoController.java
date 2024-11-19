package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.EventoDTO;
import pe.edu.upc.talenttune.entities.Evento;
import pe.edu.upc.talenttune.serviceinterfaces.IEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private IEventoService eS;

    @GetMapping
    public List<EventoDTO> listar() {
        return eS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EventoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody EventoDTO dto) {
        ModelMapper m = new ModelMapper();
        Evento ev = m.map(dto, Evento.class);
        eS.insert(ev);
    }

    @PatchMapping
    public void modificar(@RequestBody EventoDTO dto) {
        ModelMapper m = new ModelMapper();
        Evento ev = m.map(dto, Evento.class);
        eS.update(ev);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EventoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        EventoDTO dto = m.map(eS.listById(id), EventoDTO.class);
        return dto;
    }
}
