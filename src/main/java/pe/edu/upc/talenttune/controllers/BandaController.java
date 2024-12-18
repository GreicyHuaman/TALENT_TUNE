package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.BandaDTO;
import pe.edu.upc.talenttune.dtos.BandasMasContratosActivosDTO;
import pe.edu.upc.talenttune.entities.Banda;
import pe.edu.upc.talenttune.serviceinterfaces.IBandaService;

import java.util.ArrayList;
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

    @GetMapping("/BandasMasContratosActivos")
    public List<BandasMasContratosActivosDTO> obtener(){
        List<String[]>lista=bS.BandasMasContratosActivos();
        List<BandasMasContratosActivosDTO>listaDTO=new ArrayList<>();
        for (String[] columna:lista) {
            BandasMasContratosActivosDTO dto=new BandasMasContratosActivosDTO();
            dto.setNombreBanda(columna[0]);
            dto.setContratosActivos(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping("/exists/{nombre}")
    public boolean existsByNombre(@PathVariable("nombre") String nombre) {
        return bS.existsByNombre(nombre);
    }

}
