package aula1;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {
    
    public Cliente(){}
    
    public Cliente(String cpf, float salario, float imp_renda, String nome, String idade, String endereco, String sexo, String telefone){
        
        super(nome, idade, endereco, sexo, telefone);
        this.cpf = cpf;
        this.salario = salario;
        this.imp_renda = imp_renda;
    }
    
    private String cpf;
    private float salario;
    private float imp_renda;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getImp_renda() {
        return imp_renda;
    }

    public void setImp_renda(float imp_renda) {
        this.imp_renda = imp_renda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void imprimirCliente(){
        
        System.out.println("CPF do cliente: " + this.getCpf());
        System.out.println("Nome do cliente: " + super.getNome());
        System.out.println("Idade do cliente: " + super.getIdade());
        System.out.println("Endereço do cliente: " + super.getEndereco());
        
    }
    
    public float calcularSalario(Cliente oCLiente){
        
        float valor_final = salario - (salario * (imp_renda/100));
        return valor_final;
        
    }
    
}
