package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.CategoriaDTO;
import pe.edu.upc.talenttune.entities.Categoria;
import pe.edu.upc.talenttune.serviceinterfaces.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService cS;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR','SEGUIDOR','MANAGER')")
    public List<CategoriaDTO> listarCategorias() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }

    ;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void registrar(@RequestBody CategoriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Categoria ca = m.map(dto, Categoria.class);
        cS.insert(ca);
    }

    @PatchMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody CategoriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Categoria ca = m.map(dto, Categoria.class);
        cS.update(ca);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR')")
    public CategoriaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CategoriaDTO dto = m.map(cS.findById(id), CategoriaDTO.class);
        return dto;
    }
}
