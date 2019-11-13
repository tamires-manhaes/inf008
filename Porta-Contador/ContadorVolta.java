public class ContadorVolta {
  private int valor = 0;
  
  public void contar(){
      this.valor++;
  }
  
  public void contarMais(int qtd){
      this.valor += qtd;
  }
  
  public void contarContador(ContadorVolta oto){
      this.valor += oto.getValor();
   }
  
  public void zerar(){
      this.valor = 0;
  }
  
  public int getValor(){
      return this.valor;
  }
}
