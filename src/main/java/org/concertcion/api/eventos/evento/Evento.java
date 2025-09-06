package org.concertcion.api.eventos.evento;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "eventos")
public class Evento {

    @Id  // Esta es la otra anotación importante
    public String objectId;
    public String nombreEvento;
    public String fechaHoraEvento;
    public String direccion;
    public String representante;
    public Integer precio;
    public Integer cantidadMaxAsistentes;
    public List<String> auspiciadores;

    public Evento() {
    }

    public Evento(String objectId, String nombreEvento, String fechaHoraEvento, String direccion, String representante, Integer precio, Integer cantidadMaxAsistentes, List<String> auspiciadores) {
        this.objectId = objectId;
        this.nombreEvento = nombreEvento;
        this.fechaHoraEvento = fechaHoraEvento;
        this.direccion = direccion;
        this.representante = representante;
        this.precio = precio;
        this.cantidadMaxAsistentes = cantidadMaxAsistentes;
        this.auspiciadores = auspiciadores;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaHoraEvento() {
        return fechaHoraEvento;
    }

    public void setFechaHoraEvento(String fechaHoraEvento) {
        this.fechaHoraEvento = fechaHoraEvento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidadMaxAsistentes() {
        return cantidadMaxAsistentes;
    }

    public void setCantidadMaxAsistentes(Integer cantidadMaxAsistentes) {
        this.cantidadMaxAsistentes = cantidadMaxAsistentes;
    }

    public List<String> getAuspiciadores() {
        return auspiciadores;
    }

    public void setAuspiciadores(List<String> auspiciadores) {
        this.auspiciadores = auspiciadores;
    }
}