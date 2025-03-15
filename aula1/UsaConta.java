package aula1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class UsaConta {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Scanner scan = new Scanner(System.in);

        System.out.println("---Menu---");
        System.out.println("0 - Sair / 1 - Calcular");
        int resposta = scan.nextInt();
        while (resposta == 1) {
            if (resposta == 0) {
                System.out.println("Muito Obrigado por escolher nossos serviços!");
            } else if (resposta == 1) {

                //definindo os nomes
                System.out.println("Digite seu nome: ");
                conta1.setNome(scan.next());

                //depositando valores nas contas
                double valor;
                double percentual;

                System.out.println("Por favor insira o valor que deseja depositar: ");
                valor = scan.nextDouble();
                System.out.println("Agora digite o percentual: ");
                percentual = scan.nextDouble();

                conta1.depositar(valor, percentual);

                System.out.println("Conta 1 - Nome: " + conta1.getNome());
                System.out.printf("Conta 1 - Saldo: %.2f \n", conta1.getSaldo());

                System.out.println("---Menu---");
                System.out.println("0 - Sair / 1 - Calcular novamente");
                resposta = scan.nextInt();
            }
        }
    }
}
