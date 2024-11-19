package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.ContratoDTO;
import pe.edu.upc.talenttune.entities.Contrato;
import pe.edu.upc.talenttune.serviceinterfaces.IContratoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private IContratoService ctS;

    @GetMapping
    public List<ContratoDTO> listarContrato() {
        return ctS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ContratoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody ContratoDTO dto) {
        ModelMapper m = new ModelMapper();
        Contrato contrato = m.map(dto, Contrato.class);
        ctS.insert(contrato);
    }

    @PatchMapping
    public void modificar(@RequestBody ContratoDTO dto) {
        ModelMapper m = new ModelMapper();
        Contrato contrato = m.map(dto, Contrato.class);
        ctS.update(contrato);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        ctS.delete(id);
    }

    @GetMapping("/{id}")
    public ContratoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ContratoDTO dto = m.map(ctS.findById(id), ContratoDTO.class);
        return dto;
    }
}
