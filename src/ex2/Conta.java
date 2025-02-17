package ex2;

public class Conta {

        //atributos
        private String titular;
        private int cpf;
        private float saldo = 0;
        private String tipo;
    
        //construtor
        Conta (String titular, int cpf, float saldo, String tipo) {
    
            this.titular=titular;
            this.cpf=cpf;
            this.saldo=saldo;
            this.tipo=tipo;
    
            if ( tipo.equals("cc")) {
                this.saldo = 50;
            } else if ( tipo.equals("cp")) {
                this.saldo = 0;
            } else {
                System.out.println("Conta Inválida!");
            }
            
        }
       
        //mostrarInformações
        public void mostraInfo() {
    
                System.out.println( "Nome do Titular: " + titular + ", Cpf: " + cpf + ", Saldo em Conta: " + saldo + ", Tipo de Conta: " + tipo);
            
        }
    
        //setters
        public void setTitular( String titular) {
            this.titular=titular;
        }
    
        public void setCPF( int cpf ) {
            this.cpf=cpf;
        }
    
        public void setSaldo( float saldo ) {
            this.saldo=saldo;
        }
    
        public void setTipo( String tipo ) {
            this.tipo=tipo;
        }
    
        //getters
        public String getTitular() {
            return this.titular;
        }
    
        public int getCPF() {
            return this.cpf;
        }
    
        public float getSaldo() {
            return this.saldo;
        }
    
        public String getTipo() {
            return this.tipo;
        }
    
        //sacar
        public void sacar ( int valor ) {
            if (valor < 0 ){
                System.out.println("Tentativa de Saque Invalida; Você não pode sacar um valor inferior a R$ 0,00!");
            } else {
                if ( valor > saldo) {
                    System.out.println("Tentativa de Saque Invalida; Você não tem toda essa grana!");
                } else {
                    this.saldo -= valor;
                    System.out.println("Tentativa de Saque Valida; Valor do saque: " + valor);
                    mostraInfo();
                }
            }
        }
    
        //deposito
        public void depositar ( int valor ) {
            if (valor <= 0 ){
                System.out.println("Tentativa de Deposito Invalido; Valor invalido (Menor de R$ 0,00)");
            } else {
                    this.saldo += valor;
                    System.out.println("Tentativa de Deposito Valido; Valor do deposito: " + valor);
                    mostraInfo();
                }
        }
}
