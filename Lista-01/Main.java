public class Main {
    public static void main(String[] args) {
         //   Questão 1
         Carro honda = new Carro("honda hrv", 30, 5, "direita");
         honda.ligar();
         honda.acelerar();
         honda.marchaPCima();
         honda.virar("esquerda");
         honda.status();

         //	 Questão 2
         Televisao tv = new Televisao("Aoc", 21,120);
         tv.ligar();
         tv.aumentarVolume();
         tv.subirCanal();

        //  Questão 3
        Filme avengers = new Filme("Avengers", "Ação", 270);
        Dvd dvd = new Dvd(true,3);
        avengers.statusFilme();
        dvd.inserirFilme(avengers);
        dvd.ligar();
        dvd.aumentarVolume();
        dvd.status();
    }
}