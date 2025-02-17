public class exemplo1 {

    public static void main(String[] args) throws Exception {
       
        Pessoa p1 = new Pessoa("maria",30);
        Pessoa p2 = new Pessoa("joana",45);
        Pessoa p3 = new Pessoa("kraschowetz",15);
    
        //p1.setNome("Maria");
        //p1.setIdade(30);
        
        p1.mostraInfo();
        p1.felizAniversario();
    
        p2.mostraInfo();
        p2.felizAniversario();
    
        for (int i=0; i <4; i++) {
         p3.mostraInfo();
         p3.felizAniversario();
        }
    
}

}
