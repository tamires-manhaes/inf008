package questao03;

public class Dvd {
    public boolean ligado = false;
    public int volume = 2;


    public void ligar(boolean ligado){
        if(ligado == false){
            ligado = true;
            System.out.println("Dvd ligado!");
        } else {
            System.out.println("Dvd já está ligado!");
        }
    }

    public int aumentarVolume(int volume){
        volume = volume + 1;
        System.out.println("Volume: "+volume);
        return volume;
    }

    public int diminuirVolume(int volume){
        volume = volume - 1;
        System.out.println("Volume: "+volume);
        return volume;
    }


}