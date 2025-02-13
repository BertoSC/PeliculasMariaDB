package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import org.checkerframework.checker.units.qual.C;

@Entity
public class Pelicula {
    @Id
    @Column(precision= 10)
    private Integer idPelicula;
    @Column (length = 50)
    private String musica;
    @Column (length = 125)
    private String orixinal;
    @Column (length = 125)
    private String ingles;
    @Column (length = 125)
    private String castelan;
    @Column (length = 50)
    private String xenero;
    @Column (precision = 5)
    private Short anoInicio;
    @Column (precision = 5)
    private Short anoFin;
    @Column (length = 125)
    private String pais;
    @Column (precision = 5)
    private Short duracion;
    @Column (length = 25)
    private String outrasDuracions;
    @Column(length = 25)
    private String cor;
    @Column(length = 6)
    private String son;
    @Column (length = 2)
    private String video;
    @Lob
    private String texto;
    @Lob
    private byte[] poster;
    @Column (length = 10)
    private String revisado;

    public Pelicula() {
    }

    public Pelicula(String orixinal, Short anoInicio, Short anoFin) {
        this.orixinal = orixinal;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }

    public Pelicula(Integer idPelicula, String musica, String orixinal, String ingles, String castelan, String xenero, Short anoInicio, Short anoFin, String pais, Short duracion, String outrasDuracions, String cor, String son, String video, String texto, byte[] poster, String revisado) {
        this.idPelicula = idPelicula;
        this.musica = musica;
        this.orixinal = orixinal;
        this.ingles = ingles;
        this.castelan = castelan;
        this.xenero = xenero;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
        this.pais = pais;
        this.duracion = duracion;
        this.outrasDuracions = outrasDuracions;
        this.cor = cor;
        this.son = son;
        this.video = video;
        this.texto = texto;
        this.poster = poster;
        this.revisado = revisado;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getOrixinal() {
        return orixinal;
    }

    public void setOrixinal(String orixinal) {
        this.orixinal = orixinal;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getCastelan() {
        return castelan;
    }

    public void setCastelan(String castelan) {
        this.castelan = castelan;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public Short getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(Short anoInicio) {
        this.anoInicio = anoInicio;
    }

    public Short getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(Short anoFin) {
        this.anoFin = anoFin;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Short getDuracion() {
        return duracion;
    }

    public void setDuracion(Short duracion) {
        this.duracion = duracion;
    }

    public String getOutrasDuracions() {
        return outrasDuracions;
    }

    public void setOutrasDuracions(String outrasDuracions) {
        this.outrasDuracions = outrasDuracions;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    @Override
    public String toString() {
        return  "[" + idPelicula +
                "] " + castelan +
                ", ('" + orixinal + ')' +
                " (" + xenero +
                " de " + anoFin + "), '" + pais + '\'' +
                " " + duracion +
                " minutos. " + System.lineSeparator();
    }
}

