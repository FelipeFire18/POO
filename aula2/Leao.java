package aula2;

/**
 *
 * @author aluno
 */
public class Leao extends Animal {
    
    private boolean juba;
    
    public Leao(){}
    
    public Leao(boolean juba, float tamanho, String cor){
        
        super(tamanho, cor);
        this.juba = juba;
        
    }

    public boolean getJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }
    
    public void cacar(String animalCacado){
    
        System.out.println("O leão caçou o " +animalCacado);
        
    }
    
    public void imprimirLeao(Leao leao){
        
        System.out.println("Tamanho do Leão: " + leao.getTamanho());
        System.out.println("Cor do Leão: " + leao.getCor());
        System.out.println("O Lẽao tem juba: " + leao.getJuba());
        
    }
    
}
