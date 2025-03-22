package aula2;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class AnimalPrincipal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cavalo Cavalo1 = new Cavalo();
        Cavalo Cavalo2 = new Cavalo("Pangaré", 2, "Vermelho");

        Leao Leao1 = new Leao();
        Leao Leao2 = new Leao(true, 2, "Preto");

        String localFuga;
        String animalCacado;
        String ComidaCavalo;
        String ComidaLeao;

        System.out.println("--- Cadastrar Cavalo ---");
        System.out.println("Digite o Tamanho do Cavalo em metros: ");
        Cavalo1.setTamanho(scan.nextFloat());
        scan.nextLine();
        System.out.println("Agora informe a cor do Cavalo: ");
        Cavalo1.setCor(scan.nextLine());
        System.out.println("Digite o que o cavalo comeu: ");
        ComidaCavalo = scan.nextLine();
        System.out.println("Digite a raça do cavalo: ");
        Cavalo1.setRaca(scan.nextLine());
        System.out.println("Digite para onde o cavalo fugiu: ");
        localFuga = scan.nextLine();

        System.out.println("--- Cadastrar Leão ---");
        System.out.println("Digite o Tamanho do Leão em metros: ");
        Leao1.setTamanho(scan.nextFloat());
        scan.nextLine();
        System.out.println("Agora informe a cor do Leão: ");
        Leao1.setCor(scan.nextLine());
        System.out.println("Digite o que o leão comeu: ");
        ComidaLeao = scan.nextLine();
        System.out.println("Digite se o leão tem juba (True ou False): ");
        Leao1.setJuba(scan.nextBoolean());
        System.out.println("Por último digite o animal que o leão caçou: ");
        animalCacado = scan.next();
        scan.nextLine();

        System.out.println("--- Processando ---");

        Cavalo1.ImprimirCavalo(Cavalo1);
        Cavalo1.Comer(ComidaCavalo);
        Cavalo1.Fugir(localFuga);

        Leao1.imprimirLeao(Leao1);
        Leao1.Comer(ComidaLeao);
        Leao1.cacar(animalCacado);

        System.out.println("--- Carregando animais secundários ---");
        
        System.out.println("Cavalo 2: " + Cavalo2.getTamanho() + "-" + Cavalo2.getCor() + "-" + Cavalo2.getRaca());
        System.out.println("Leão 2: " + Leao2.getTamanho() + "-" + Leao2.getCor() + "-" + Leao2.getJuba());
        
        scan.close();
        System.out.println("--- Sucesso ---");

    }

}
