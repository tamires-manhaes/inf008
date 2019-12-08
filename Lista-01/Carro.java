public class Carro {
    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;
    private boolean isLigado;
    private String direcao;

    public Carro( String modelo, double velocidadeInicial, double valorAceleracao, String virarPara){
        this.modelo = modelo;
        this.velocidade = velocidadeInicial;
        this.aceleracao = valorAceleracao;
        this.marcha = 1;
        if(isLigado){
            this.direcao = virar(virarPara);
        }
    }

    public double getVelocidade() {
        return velocidade;
    }

    public boolean getIsLigado(){
        return isLigado;
    }

    public int getMarcha() {
        return marcha;
    }

    public String getDirecao() {
        return direcao;
    }

    public void ligar(){
        if(isLigado != true){
            isLigado = true;
        }
    }

    public void desligar() {
        if (isLigado == true) {
            isLigado = false;
        }
    }

    public double acelerar(){
        if(isLigado){
            this.velocidade += aceleracao;
        }

        return this.velocidade;
    }

    public double desacelerar(){
        if(isLigado){
            this.velocidade -= aceleracao;
        }
        return this.velocidade;
    }

    public int marchaPCima(){
        return this.marcha++;
    }

    public int marchaPBaixo(){
        return this.marcha--;
    }

    public String virar(String direcao){
        return this.direcao;
    }

    public void status(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Está ligado: "+ getIsLigado()) ;
        System.out.println("Velocidade: "+ getVelocidade());
        System.out.println("Marcha: "+ getMarcha());
        System.out.println("Direcao"+ getDirecao());
    }
}
