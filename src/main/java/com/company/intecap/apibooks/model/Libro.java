package com.company.intecap.apibooks.model;

import jakarta.persistence.*;

import java.io.Serializable;

/* la siguiente clase nos permite crear una tabla en la base de datos
* vemos el nombre de la tabla en el @Table
* Los atributos de la clase corresponden a las columnas de la tabla
* */
@Entity
@Table(name = "Libro")
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;//PERMITE ENVIAR DATOS A TRAVES DE LA RED
    /*
    * permite que la clase se conecte a un arreglo de bite
    * */
    @Id //generacion del identificador de la clase
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generacion en automatico
    private long id;
    private String nombre;
    private String categoria;

    @Column(length = 500)//indicamos el nombre de la columna, y tambien la cantidad de carac
    //caracter aceptados
    private String descripcion;

    //constructor vacio

    public Libro(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
