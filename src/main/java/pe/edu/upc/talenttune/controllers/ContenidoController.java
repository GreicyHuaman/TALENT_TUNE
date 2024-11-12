package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.CategoriaContenidoDTO;
import pe.edu.upc.talenttune.dtos.ContenidoDTO;
import pe.edu.upc.talenttune.entities.Contenido;
import pe.edu.upc.talenttune.serviceinterfaces.IContenidoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contenidos")
public class ContenidoController {

    @Autowired
    private IContenidoService coS;

    @GetMapping
    public List<ContenidoDTO> listarContenido() {
        return coS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ContenidoDTO.class);
        }).collect(Collectors.toList());

    }

    @PostMapping
    public void registrar(@RequestBody ContenidoDTO dto) {
        ModelMapper m = new ModelMapper();
        Contenido contenido = m.map(dto, Contenido.class);
        coS.insert(contenido);
    }

    @PatchMapping
    public void modificar(@RequestBody ContenidoDTO dto) {
        ModelMapper m = new ModelMapper();
        Contenido contenido = m.map(dto, Contenido.class);
        coS.update(contenido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        coS.delete(id);
    }

    @GetMapping("/{id}")
    public ContenidoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ContenidoDTO dto = m.map(coS.findById(id), ContenidoDTO.class);
        return dto;
    }
    @GetMapping("/ContenidoPorCategoria/{tipoCategoria}")
    public List<CategoriaContenidoDTO> CatPorContenido(@PathVariable String tipoCategoria) {
        List<String[]> lista = coS.CatPorContenido(tipoCategoria);
        List<CategoriaContenidoDTO> listaDTO = new ArrayList<>();
        for (String[]columna : lista) {
            CategoriaContenidoDTO dto = new CategoriaContenidoDTO();
            dto.setIdContenido(Integer.parseInt(columna[0]));
            dto.setTitulo(columna[1]);
            dto.setContenido(columna[2]);
            dto.setFechaPublicacion(LocalDate.parse(columna[3]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
