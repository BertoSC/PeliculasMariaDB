package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pelisH2");
        EntityManager em = emf.createEntityManager();
        Pelicula peli = em.find(Pelicula.class, 40);
        System.out.println(peli);

        TypedQuery<Pelicula> consulta = em.createQuery("SELECT p.castelan, p.anoFin, p.duracion\n" +
                "FROM Pelicula p\n" +
                "WHERE p.duracion > 120", Pelicula.class);

        List<Pelicula> lista = consulta.getResultList();

        for (Pelicula pel:lista){
            System.out.println(pel);
        }

    }
}