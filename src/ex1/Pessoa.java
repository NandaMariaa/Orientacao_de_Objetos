package ex1;
public class Pessoa {

    //atributos
    private String nome;
    private int idade;
    private boolean maiorDeIdade;

    //parametro: o que entra dentro do () no método.
    private void setNome( String nome ) {

        this.nome=nome;
    
    }

    private void setIdade( int idade ) {

        if (idade < 0) {
            this.idade=0;
        } else {
            this.idade=idade;
        }

        this.maiorDeIdade = ( this.idade >= 18 );

    }

    //getters
    public String getNome() {

        return this.nome;

    }

    public int getIdade() {

        return this.idade;

    }

    //mostrar informações
    public void mostraInfo() {

        //System.out.println(nome + ", " + idade + " anos.");

        if( maiorDeIdade ) {
            System.out.println( nome + ", " + idade + " anos, maior de idade!" );
        }else{
            System.out.println( nome + ", " + idade + " anos, menor de idade!" );
        }

    }

    //construtor
    Pessoa (String nome, int idade) {

        this.nome=nome;
        setIdade(idade);

        if(idade<18) {
            this.maiorDeIdade=false;
        }else{
            this.maiorDeIdade=true;
        }

        //modo alternativo
        //this.maiorDeIdade = ( idade >= 18 );
    }

    //exercicio: criar método faz aniversário.
    public void felizAniversario () {

        setIdade (this.idade + 1);

        System.out.println("Feliz Aniversário!: " + nome + " fez " + idade + " anos! " + "Parabéns " + nome + "!");
        
    }

}
