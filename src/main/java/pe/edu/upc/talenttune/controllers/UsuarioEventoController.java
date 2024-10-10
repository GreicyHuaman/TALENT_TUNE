package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.UsuarioEventoDTO;
import pe.edu.upc.talenttune.entities.UsuarioEvento;
import pe.edu.upc.talenttune.serviceinterfaces.IUsuarioEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR','SEGUIDOR','MANAGER')")
@RequestMapping("/usuarioseventos")
public class UsuarioEventoController {

    @Autowired
    private IUsuarioEventoService uES;

    @GetMapping
    public List<UsuarioEventoDTO> listarUsuarioEvento() {
        return uES.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioEventoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody UsuarioEventoDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioEvento usuarioEvento = m.map(dto, UsuarioEvento.class);
        uES.update(usuarioEvento);
    }

    @PatchMapping
    public void modificar(@RequestBody UsuarioEventoDTO dto) {
        ModelMapper m = new ModelMapper();
        UsuarioEvento usuarioEvento = m.map(dto, UsuarioEvento.class);
        uES.update(usuarioEvento);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uES.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR')")
    public UsuarioEventoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioEventoDTO dto = m.map(uES.findById(id), UsuarioEventoDTO.class);
        return dto;
    }
}
