import hello_world.Ola;
import questao01.Carro;
import questao02.Televisao;
import questao03.*;

public class Main {

    public static void main(String[] args) {

    	//Hello world
		Ola ola = new Ola();
		ola.escreva();
		//Fim hello world

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

		//Questão 03
		Dvd dvd = new Dvd();
		dvd.ligar(false);
		dvd.aumentarVolume(0);
		//Fim questão 3
    }
}
