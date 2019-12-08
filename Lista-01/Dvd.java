public class Dvd {
    private boolean isLigado;
    private int volume;
    private Filme filme;

    public Dvd(boolean isLigado, int volume){
        this.isLigado = false;
        this.volume = 2;
        this.filme = new Filme(this.filme.getNome(), this.filme.getCategoria(), this.filme.getDuracao());
    }

    public Filme inserirFilme(Filme filme){
        return this.filme;
    }

    public boolean isLigado(){
        return this.isLigado;
    }

    public boolean ligar(){
        return this.isLigado = true;
    }

    public boolean desligar(){
        return this.isLigado = false;
    }

    public Filme getFilme() {
        return filme;
    }

    public void aumentarVolume(){
        if(isLigado()) {
            this.volume++;
        }
    }

    public void diminuirVolume(){
        if(isLigado()) {
            this.volume++;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void status(){
        System.out.println("Volume: "+ getVolume());
    }
}
