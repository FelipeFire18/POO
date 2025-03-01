package desafio_imc;

/**
 *
 * @author aluno
 */
public class CalculadoraIMC {

    public float calcularIMC(PessoaIMC usuario) {

        return usuario.getPeso() / (usuario.getAltura() * usuario.getAltura());
    }

    public String verificarFaixaObesidade(float imc) {
        
        if (imc < 18.50){
            
            return "Abaixo do peso";
            
        }

        else if (imc >= 18.50 && imc <= 24.99) {

            return "Peso normal";

        }

        else if (imc >= 25.00 && imc <= 29.99) {

            return "Pré-Obesidade";
            
        }

        else if (imc >= 30.00 && imc <= 34.99) {

            return "Obesidade Grau 1";
            
        }

        else if (imc >= 35.00 && imc <= 39.99) {

            return "Obesidade Grau 2";
            
        }

        else {

            return "Obesidade Grau 3";
            
        }

    }

}
