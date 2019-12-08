package com.company;

public class Main {

    public static void main(String[] args) {
       Musica diskMe = new Musica("Disk Me", 3.54, "Pop",'F', "GLobal records");
       diskMe.adicionaArtista("Pablo vittar");
       diskMe.adicionaArtista("Ludmilla");
//       diskMe.run();

       Musica HYESR = new Musica ("Have you ever see the rain", 3.04,"Rock",'C', "Fantasy records");
       HYESR.adicionaArtista("Creedence Clearwater Revival ");
//       HYESR.run();

       diskMe.saoIguais(HYESR);

    }
}
