package aula1;

/**
 *
 * @author aluno
 */

import java.util.Scanner;

public class PessoaPrincipal {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Definindo o cliente;
        
        Cliente oCliente = new Cliente();
        System.out.println("--- Cadastro Cliente");
        System.out.println("Digite seu CPF: ");
        oCliente.setCpf(scan.nextLine());
        System.out.println("Agora digite seu nome: ");
        oCliente.setNome(scan.nextLine());
        System.out.println("Agora digite seu endereço: ");
        oCliente.setEndereco(scan.nextLine());
        System.out.println("Digite sua idade: ");
        oCliente.setIdade(scan.nextLine());
        System.out.println("Nos informe seu salário: ");
        oCliente.setSalario(scan.nextFloat());
        System.out.println("Por último nos informe seu Imposto de Renda: ");
        oCliente.setImp_renda(scan.nextFloat());
        
        oCliente.imprimirCliente();
        System.out.printf("Seu salário após o calculo do imposto é: %.2f", oCliente.calcularSalario(oCliente));
        
        //Definindo o fornecedor;
        
//        Fornecedor oFornecedor = new Fornecedor("200.930.01-16", "Fernando", "KM 04", "16");
        scan.nextLine();
        Fornecedor oFornecedor = new Fornecedor();
        System.out.println("\n --- Cadastro Fornecedor---");
        System.out.println("Nos informe seu CNPJ: ");
        oFornecedor.setCNPJ(scan.nextLine());
        System.out.println("Agora digite seu nome: ");
        oFornecedor.setNome(scan.nextLine());
        System.out.println("Agora seu endereço: ");
        oFornecedor.setEndereco(scan.nextLine());
        System.out.println("Agora Sua idade: ");
        oFornecedor.setIdade(scan.nextLine());
        System.out.println("O valor do produto");
        oFornecedor.setValor_prod(scan.nextFloat());
        System.out.println("Para finalizar digite o imposto do produto: ");
        oFornecedor.setImposto(scan.nextFloat());
        
        oFornecedor.imprimirFornecedor();
        System.out.printf("O valor final do seu produto é: %.2f \n", oFornecedor.calcularImposto(oFornecedor));
        
    }
    
}
