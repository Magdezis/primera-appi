package com.company.intecap.apibooks.model;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name = "Categoria")
public class EntityCategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String nombre ;
    @Column(length = 500)
    private String descripcion;

    public EntityCategoria(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
