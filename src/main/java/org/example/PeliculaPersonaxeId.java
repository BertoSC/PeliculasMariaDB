package org.example;

import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

public class PeliculaPersonaxeId implements Serializable {
    Integer idPersonaxe;
    Integer idPelicula;
    String ocupacion;

    public PeliculaPersonaxeId() {
    }

    public Integer getIdPersonaxe() {
        return idPersonaxe;
    }

    public void setIdPersonaxe(Integer idPersonaxe) {
        this.idPersonaxe = idPersonaxe;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeliculaPersonaxeId that = (PeliculaPersonaxeId) o;
        return Objects.equals(idPersonaxe, that.idPersonaxe) && Objects.equals(idPelicula, that.idPelicula) && Objects.equals(ocupacion, that.ocupacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersonaxe, idPelicula, ocupacion);
    }

    @Override
    public String toString() {
        return "PeliculaPersonaxeId{" +
                "idPersonaxe=" + idPersonaxe +
                ", idPelicula=" + idPelicula +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }
}
