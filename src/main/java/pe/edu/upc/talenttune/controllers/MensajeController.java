package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.MensajeDTO;
import pe.edu.upc.talenttune.entities.Mensaje;
import pe.edu.upc.talenttune.serviceinterfaces.IMensajeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    @Autowired
    private IMensajeService mS;

    @GetMapping
    public List<MensajeDTO> listarMensaje() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje mensaje = m.map(dto, Mensaje.class);
        mS.insert(mensaje);
    }

    @PatchMapping
    public void modificar(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje mensaje = m.map(dto, Mensaje.class);
        mS.update(mensaje);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MensajeDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        MensajeDTO dto = m.map(mS.findById(id), MensajeDTO.class);
        return dto;
    }

}