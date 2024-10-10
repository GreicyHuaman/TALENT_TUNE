package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.UsuarioBandaDTO;
import pe.edu.upc.talenttune.entities.UsuarioBanda;
import pe.edu.upc.talenttune.serviceinterfaces.IUsuarioBandaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR','SEGUIDOR','MANAGER')")
@RequestMapping("/usuariosbandas")
public class UsuarioBandaController {

    @Autowired
    private IUsuarioBandaService uBS;

    @GetMapping
    public List<UsuarioBandaDTO> listarUsuarioBanda() {
        return uBS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioBandaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody UsuarioBandaDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioBanda usuarioBanda = m.map(dto, UsuarioBanda.class);
        uBS.update(usuarioBanda);
    }

    @PatchMapping
    public void modificar(@RequestBody UsuarioBandaDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioBanda usuarioBanda = m.map(dto, UsuarioBanda.class);
        uBS.update(usuarioBanda);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uBS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR')")
    public UsuarioBandaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioBandaDTO dto = m.map(uBS.findById(id), UsuarioBandaDTO.class);
        return dto;
    }
}
