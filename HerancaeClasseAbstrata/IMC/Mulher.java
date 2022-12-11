package HerancaeClasseAbstrata.IMC;

public class Mulher extends PessoaIMC { 
    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String resultIMC() {

        String mensagem = "";
        double imc = super.calcularIMC(getPeso(), getAltura());
            
        if ( imc < 19 ) {
            mensagem = "Abaixo do Peso Ideal.";

        }
        if ( imc < 25.8 && imc > 19) {
            mensagem = "Peso Ideal";
        } 
        if ( imc > 25.8) {
            mensagem = "Acima do Peso Ideal.";
    } 
        return mensagem;
    }
}   
