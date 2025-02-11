package org.example;

import jakarta.persistence.*;
@Entity
@IdClass(PeliculaPersonaxeId.class)
public class PeliculaPersonaxe {
    @Id
    @Column(name = "idPelicula", insertable = false, updatable = false)
    private Integer idPelicula;

    @Id
    @Column(name = "idPersonaxe", insertable = false, updatable = false)
    private Integer idPersonaxe;

    @Id
    @Column(name = "ocupacion", insertable = false, updatable = false)
    private String ocupacion;

    @ManyToOne
    @JoinColumn(name = "idPelicula")
    private Pelicula pelicula;


    @ManyToOne
    @JoinColumn(name = "idPersonaxe")
    private Personaxe personaxe;


    @ManyToOne
    @JoinColumn(name = "ocupacion")
    private Ocupacion ocupa;

    @Column(length = 50)
    private String personaxeInterpretado;
    public PeliculaPersonaxe() {
    }

    public PeliculaPersonaxe(Pelicula pelicula, Personaxe personaxe, Ocupacion ocupacion, String personaxeInterpretado) {
        this.pelicula = pelicula;
        this.personaxe = personaxe;
        this.ocupa = ocupacion;
        this.personaxeInterpretado = personaxeInterpretado;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }


    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }


    public Personaxe getPersonaxe() {
        return personaxe;
    }

    public void setPersonaxe(Personaxe personaxe) {
        this.personaxe = personaxe;
    }

    public Ocupacion getOcupacion() {
        return ocupa;
    }

    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupa = ocupacion;
    }

    public String getPersonaxeInterpretado() {
        return personaxeInterpretado;
    }

    public void setPersonaxeInterpretado(String personaxeInterpretado) {
        this.personaxeInterpretado = personaxeInterpretado;
    }

    @Override
    public String toString() {
        return " [" + personaxe +
                "] (" + ocupa +
                ") as '" + personaxeInterpretado + '\'';
    }
}
