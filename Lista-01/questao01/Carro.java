package questao01;

public class Carro {
    public String modelo;
    public float velocidade;
    public float aceleracao;
    public int marcha;

    public Carro(){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
    }

    public void ligar(String modelo){
        System.out.println("O "+ modelo +"está ligado!");
    }

    public void desligar(String modelo){
        System.out.println("O "+modelo+" está desligado");
    }

    public void acelerar(float velocidade){
        System.out.println("Acelerando para a velocidade "+ velocidade+"h/km");
    }

    public void desacelerar(float velocidade){
        System.out.println("Desacelerando para "+velocidade+"...");
    }

    public void viraDireita(){
        System.out.println("Virando a direita...");
    }

    public void viraEsquerda(){
        System.out.println("Virando a esqueda...");
    }

    public void marchaPcima(){
        System.out.println("Marcha para cima...");
    }

    public void marchaPbaixo(){
        System.out.println("Marcha para baixo...");
    }
}
