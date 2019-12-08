public class Televisao {
    private int polegadas;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public Televisao(String marca, int polegadas, int voltagem){
        this.polegadas = polegadas;
        if(voltagem != 220 || voltagem != 110){
            this.voltagem = 110;
        }
        this.marca = marca;
        this.canal = 2;
        this.volume = 5;
    }

    public int setConsumo(){
        int consumo;
        consumo =  this.voltagem * this.polegadas;
        return consumo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public void ligar(){
        System.out.println("ligada!");
        System.out.println("Consumo: "+ setConsumo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Canal: "+ getCanal());
    }

    public void desligar(){
        System.out.println("Desligando...");
    }

    public int aumentarVolume(){
        return this.volume++;
    }

    public int diminuirVolume(){
        return this.volume--;
    }

    public int subirCanal(){
        return this.canal++;
    }

    public int descerCanal(){
        return this.canal--;
    }
}
