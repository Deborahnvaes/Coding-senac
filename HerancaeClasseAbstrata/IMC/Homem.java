package HerancaeClasseAbstrata.IMC;

public class Homem extends PessoaIMC {

    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }
    
    @Override
    public String resultIMC() {

        String mensagem = "";
        double imc = super.calcularIMC(getPeso(), getAltura());

        if (imc < 20.7) {
            mensagem = "Abaixo do Peso ideal";
        } if ( imc < 26.4 && imc > 20.7) {
            mensagem = "Peso Ideal";
        } if (imc > 26.4 ){
            mensagem = " Acima do peso";
        }
            return mensagem;    
    }
    
}
