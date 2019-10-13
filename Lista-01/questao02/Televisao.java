package questao02;

public class Televisao {
    public float tamanhoTela;
    public String marca;
    public int voltagem;
    public int volume;
    public int canal;

    public Televisao(float tamanhoTela, String marca, int voltagem, int volume){
        this.tamanhoTela = tamanhoTela;
        this.marca = marca;
        this.voltagem = setVoltagem(voltagem);
        this.volume = 5;
    }

    public int setVoltagem(int voltagem) {
        int volts;

        if (voltagem == 1) {
            volts = 220;
        } else if (voltagem == 2) {
            volts = 110;
        } else {
            volts = 0;
        }
        return volts;
    }

    public void ligarTv(){
        System.out.println("Tv ligada!");
    }

    public void desligarTv(){
        System.out.println("Tv desligada!");
    }

    public int aumentarVolume(int volume){
        volume = volume + 1;
        System.out.println("volume"+ volume);
        return volume;
    }

    public int diminuirVolume(int volume){
        volume = volume - 1;
        System.out.println("volume:"+ volume);
        return volume;
    }

    public int subirCanal(int canal){
        canal = canal + 1;
        System.out.println("Canal: "+canal);
        return canal;
    }

    public int descerCanal(int canal) {
        canal = canal - 1;
        System.out.println("Canal: "+canal);
        return canal;
    }

}
