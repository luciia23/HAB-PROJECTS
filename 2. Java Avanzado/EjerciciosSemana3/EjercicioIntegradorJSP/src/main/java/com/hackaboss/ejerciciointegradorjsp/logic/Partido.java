package com.hackaboss.ejerciciointegradorjsp.logic;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "equipoLocal_id")
    private Equipo equipoLocal;
    @ManyToOne
    @JoinColumn(name = "equipoVisitante_id")
    private Equipo equipoVisitante;
    private int resultadoLocal;
    private int resultadoVisitante;

    public Partido() {
    }

    public Partido(Long id, Date fecha, Equipo equipoLocal, Equipo equipoVisitante, int resultadoLocal, int resultadoVisitante) {
        this.id = id;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultadoLocal = resultadoLocal;
        this.resultadoVisitante = resultadoVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getResultadoLocal() {
        return resultadoLocal;
    }

    public void setResultadoLocal(int resultadoLocal) {
        this.resultadoLocal = resultadoLocal;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(int resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }

    public String getFechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(fecha);
    }

}
