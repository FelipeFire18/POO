package aula2;

/**
 *
 * @author aluno
 */
public class Animal {
    
    private float tamanho;
    private String cor;

    
    public Animal(){}
    
    public Animal(float tamanho, String cor){
        
        this.tamanho = tamanho;
        this.cor = cor;
        
    }
    
    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void Comer(String comida){
    
        System.out.println("O animal está comendo " + comida);
    
    }

}
