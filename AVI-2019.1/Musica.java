package com.company;

import java.util.ArrayList;

public class Musica {
    private String titulo;
    ArrayList<String> artistas = new ArrayList<>();
    private double duracao;
    private String genero;
    private String campoHarmonico;
    private String gravadora;

    public Musica(String titulo,double duracao, String genero, char campo, String gravadora){
        setTitulo(titulo);
        setDuracao(duracao);
        setGenero(genero);
        setCampoHarmonico(campo);
        setGravadora(gravadora);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        duracao = this.duracao * 60;
        return duracao;
    }

    public ArrayList<String> getArtistas() {
        return artistas;
    }

    public String getCampoHarmonico() {
        return campoHarmonico;
    }

    public String getGenero() {
        return genero;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public void adicionaArtista(String artista) {
        artistas.add(artista);
    }

//    Método para setar o campo harmônico de acordo com a letra digitada no momento de criação do objeto
    private String setCampoHarmonico(char campo) {
        switch(campo){
            case 'A': this.campoHarmonico = "Lá maior";
            case 'B': this.campoHarmonico = "Si maior";
            case 'C': this.campoHarmonico = "Dó";
            case 'D': this.campoHarmonico = "Ré maior";
            case 'E': this.campoHarmonico = "Mi maior";
            case 'F': this.campoHarmonico = "Fá maior";
            case 'G': this.campoHarmonico = "Sol maior";
        }
         return this.campoHarmonico;
    }

//  Método para exibição dos valores do objeto
    public void run(){
        System.out.println("Titulo "+ getTitulo());
        System.out.println("Artista: "+ getArtistas());
        System.out.println("Gênero: "+getGenero());
        System.out.println("Duração: "+getDuracao());
        System.out.println("Campo Harmônico: "+getCampoHarmonico());
        System.out.println("Gravadora: "+getGravadora());
    }

}
