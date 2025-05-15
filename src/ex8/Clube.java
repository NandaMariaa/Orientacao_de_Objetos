public class Clube {
    private int titulos = 0;
    private int golsPro = 0;
    private String nome;
    
    Clube( String nome ){
        this.nome = nome;
    }
    
    //--ADD
    public void addTitulo(){
        this.titulos++;
    }
    
    public void addGolsPro( int gols ){
        this.golsPro += gols;
    }
    
    
    //--GET
    public int getTitulos(){
        return this.titulos;
    }
    
    public int getGolsPro(){
        return this.golsPro;
    }
    
    public String getNome(){
        return this.nome;
    }
}