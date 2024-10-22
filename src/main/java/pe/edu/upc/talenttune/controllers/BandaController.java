package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.BandaDTO;
import pe.edu.upc.talenttune.entities.Banda;
import pe.edu.upc.talenttune.serviceinterfaces.IBandaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bandas")
public class BandaController {
    @Autowired
    private IBandaService bS;

    @GetMapping
    public List<BandaDTO> listarBanda() {
        return bS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BandaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody BandaDTO dto) {
        ModelMapper m = new ModelMapper();
        Banda banda = m.map(dto, Banda.class);
        bS.insert(banda);
    }

    @PatchMapping
    public void modificar(@RequestBody BandaDTO dto) {
        ModelMapper m = new ModelMapper();
        Banda banda = m.map(dto, Banda.class);
        bS.update(banda);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        bS.delete(id);
    }

    @GetMapping("/{id}")
    public BandaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        BandaDTO dto = m.map(bS.findById(id), BandaDTO.class);
        return dto;
    }
}