package ex2;

public class exemplo2 {

    public static void main(String[] args) {

        Conta c1 = new Conta("Maria",30,0,"cp");
        Conta c2 = new Conta("João",30,0,"cp");
    
        c1.mostraInfo();
        c1.sacar(10);
        c1.depositar(10000);
        c1.sacar(5000);
        c1.mostraInfo();
    }

}
