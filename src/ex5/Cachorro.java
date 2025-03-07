package ex5;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {

            super(nome, peso, "Cachorro");
            
        }

    @Override
    public void fazBarulho() {
        
        System.out.println("Auau");
        
    }
}
