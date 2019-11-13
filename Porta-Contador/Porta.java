class Porta{
    private boolean aberta = false;
     
    public Porta(Porta porta){
        this(porta.isAberta());
    }
    
    public Porta(){
        this(false);
    }
    
    public Porta(boolean aberta){
        this.setAberta(aberta);
    }
    
    private void setAberta(boolean aberta){
        this.aberta = aberta;
    }
    
    public void abrir(){
        this.aberta = true;
    }
    
    public void fechar(){
      this.aberta = false;  
    }   
    
    public boolean isAberta(){
        return this.aberta;
    }
    
}