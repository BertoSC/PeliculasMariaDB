package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class PeliculaPersonaxeId implements Serializable {
    private Integer idPelicula;
    private Integer idPersonaxe;
    private String ocupacion;

    public PeliculaPersonaxeId() {
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Integer getIdPersonaxe() {
        return idPersonaxe;
    }

    public void setIdPersonaxe(Integer idPersonaxe) {
        this.idPersonaxe = idPersonaxe;
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
        return Objects.equals(idPelicula, that.idPelicula) && Objects.equals(idPersonaxe, that.idPersonaxe) && Objects.equals(ocupacion, that.ocupacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPelicula, idPersonaxe, ocupacion);
    }

    @Override
    public String toString() {
        return "PeliculaPersonaxeId{" +
                "idPelicula=" + idPelicula +
                ", idPersonaxe=" + idPersonaxe +
                ", ocupacion=" + ocupacion +
                '}';
    }
}
