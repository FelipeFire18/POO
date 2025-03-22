package aula2;

/**
 *
 * @author aluno
 */
public class Cavalo extends Animal {
    
    private String raca;
    
    public Cavalo(){}
    
    public Cavalo(String raca, float tamanho, String cor){
        
        super(tamanho, cor);
        this.raca = raca;
        
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void Fugir(String local){
    
        System.out.println("O cavalo fugiu para " + local);
    
    }
    
    public void ImprimirCavalo(Cavalo cavalo){
    
        System.out.println("Tamanho do Cavalo: " + cavalo.getTamanho());
        System.out.println("Cor do Cavalo: " + cavalo.getCor());
        System.out.println("Raça do Cavalo: " + cavalo.getRaca());
        
    }
    
}
