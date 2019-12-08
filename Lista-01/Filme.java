public class Filme {
    private String nome;
    private String categoria;
    private int duracao;

    public Filme(String nome, String categoria, int duracao) {
        this.nome = nome;
        this.categoria = categoria;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void statusFilme(){
        System.out.println("Nome: "+getNome());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Duracao: "+getDuracao()+"min");
    }
}
