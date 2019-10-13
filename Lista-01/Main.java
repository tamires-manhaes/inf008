import questao01.Carro;
import questao02.Televisao;

public class Main {

    public static void main(String[] args) {
    	//Questão 1
	    Carro carro = new Carro();
	    carro.ligar("honda hrv");
	    carro.acelerar(60);
	    carro.viraDireita();
	    carro.marchaPcima();
	    //Fim questão 1

	    //Questão 2
	    Televisao tv = new Televisao(32, "Samsung", 2,7);
	    tv.ligarTv();
	    tv.descerCanal(12);
	    tv.diminuirVolume(3);
	    //Fim questão 2
    }
}
