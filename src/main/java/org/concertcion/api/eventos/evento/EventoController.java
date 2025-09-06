package org.concertcion.api.eventos.evento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping(value = "/evento", consumes = "application/json", produces = "application/json")
    public Object handleInsertEventoRequest(@RequestBody Evento evento) {
        try {
            return eventoRepository.save(evento);
        } catch (Exception e) {
            return "Error al insertar evento: " + e.getMessage();
        }
    }

    @GetMapping(value = "/eventos", produces = "application/json")
    public List<Evento> handleGetEventosRequest() {
        return eventoRepository.findAll();
    }
}