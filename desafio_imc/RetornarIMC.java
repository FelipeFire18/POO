package desafio_imc;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class RetornarIMC {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        PessoaIMC pessoa1 = new PessoaIMC();
        CalculadoraIMC calculadora = new CalculadoraIMC();
        
        //Começando o Cliclo "While do Menu;
        
        System.out.println("---Menu---");
        System.out.println("Digite o numero correspondente a opção desejada");
        System.out.println("0 - Sair  ||  1 - Calcular IMC");
        int resposta = scan.nextInt();
        while (resposta == 1) {
            
            //Settando os Dados;
            
            System.out.println("Digite seu CPF: ");
            pessoa1.setCpf(scan.nextInt());

            System.out.println("Digite seu nome por favor: ");
            pessoa1.setNome(scan.next());

            System.out.println("Digite seu peso: ");
            pessoa1.setPeso(scan.nextFloat());

            System.out.println("Por último digite sua altura: ");
            pessoa1.setAltura(scan.nextFloat());

            //calculando IMC;
            
            System.out.printf("O seu IMC é: %.2f", calculadora.calcularIMC(pessoa1));

            //Retornando Faixa de Peso;
            
            System.out.println("\n A sua faixa de peso é: " + calculadora.verificarFaixaObesidade(calculadora.calcularIMC(pessoa1)));
            
            //Encerrando o Ciclo do Menu;
            System.out.println("---Menu---");
            System.out.println("Digite o numero correspondente a opção desejada");
            System.out.println("0 - Sair  ||  1 - Calcular IMC novamente");
            resposta = scan.nextInt();

        }

    }

}
