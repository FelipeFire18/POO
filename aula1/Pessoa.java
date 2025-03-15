package aula1;

/**
 *
 * @author aluno
 */
public class Pessoa {

   private String nome, idade, endereco, sexo, telefone;
   
   public Pessoa(){}
   
   public Pessoa(String nome, String idade, String endereco, String sexo, String telefone){
       this.nome = nome;
       this.idade = idade;
       this.endereco = endereco;
       this.sexo = sexo;
       this.telefone = telefone;
   }

    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public String getIdade() {
        
        return idade;
    }

    public void setIdade(String idade) {
        
        this.idade = idade;
    }

    public String getEndereco() {
        
        return endereco;
    }

    public void setEndereco(String endereco) {
        
        this.endereco = endereco;
    }
   
   
    
}
