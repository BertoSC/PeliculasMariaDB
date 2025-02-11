package org.example;

public enum Xenero {
    ACCION_AVENTURA("Acción y aventura"),
    ANIMACION("Animación"),
    AVENTURA ("Aventura"),
    CIENCIA_FICCION("Ciencia ficción"),
    COMEDIA ("Comedia"),
    CRIMEN ("Crimen"),
    DRAMA ("Drama"),
    EROTICO ("Erótico"),
    GUERRA ("Guerra"),
    HISTORICO ("Histórico"),
    INFANTIL ("Infantil"),
    MUSICAL ("Musical"),
    POLICIAL ("Policial"),
    TERROR ("Terror"),
    THRILLER ("Thriller"),
    VANGUARDIA ("Vanguardia"),
    WESTERN ("Western");

    String xenero;

    Xenero() {
    }

    Xenero(String xenero){
        this.xenero=xenero;
    }




}
