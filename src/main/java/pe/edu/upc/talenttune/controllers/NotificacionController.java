package pe.edu.upc.talenttune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talenttune.dtos.MensajeDTO;
import pe.edu.upc.talenttune.dtos.NotificacionDTO;
import pe.edu.upc.talenttune.entities.Notificacion;
import pe.edu.upc.talenttune.serviceinterfaces.INotificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR','SEGUIDOR','MANAGER')")
@RequestMapping("/notificaciones")
public class NotificacionController {

    @Autowired
    private INotificacionService nS;

    @GetMapping
    public List<NotificacionDTO> listarNotificacion(){
        return nS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,NotificacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody NotificacionDTO dto){
        ModelMapper m = new ModelMapper();
        Notificacion notificacion = m.map(dto, Notificacion.class);
        nS.update(notificacion);
    }

    @PatchMapping
    public void modificar(@RequestBody NotificacionDTO dto){
        ModelMapper m = new ModelMapper();
        Notificacion notificacion = m.map(dto, Notificacion.class);
        nS.update(notificacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        nS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('TALENTO','ADMINISTRADOR')")
    public NotificacionDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        NotificacionDTO dto = m.map(nS.findById(id), NotificacionDTO.class);
        return dto;
    }
}
