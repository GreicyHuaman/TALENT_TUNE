package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.EdadPromedioTalentoDTO;
import pe.edu.upc.talenttune.dtos.UsuarioDTO;
import pe.edu.upc.talenttune.entities.Usuario;
import pe.edu.upc.talenttune.serviceinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService uS;


    @GetMapping
    public List<UsuarioDTO> listarUsuarios() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(dto, Usuario.class);
        uS.insert(usuario);
    }

    @PatchMapping
    public void modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(dto, Usuario.class);
        uS.update(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.findById(id), UsuarioDTO.class);
        return dto;
    }

    @GetMapping("/Promedio")
    public List<EdadPromedioTalentoDTO> edadPromedioTalento() {
        List<String[]> lista = uS.edadPromedioTalento();
        List<EdadPromedioTalentoDTO> listaDTO = new ArrayList<>();
        for (String[]columna : lista) {
            EdadPromedioTalentoDTO dto = new EdadPromedioTalentoDTO();
            dto.setEdadPromedio(Integer.parseInt(columna[0]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping("ultimoUsuario")
    public int encontrarUltimoUsuario(){
        return uS.findLastUserRegister();
    }


}

