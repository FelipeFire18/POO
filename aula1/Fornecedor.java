package aula1;

/**
 *
 * @author aluno
 */
public class Fornecedor extends Pessoa {
    
    public Fornecedor(){}
    
    public Fornecedor(String CNPJ, float valor_prod, float imposto, String nome, String idade, String endereco, String sexo, String telefone){
        
        super(nome, idade, endereco, sexo, telefone);
        this.CNPJ = CNPJ;
        this.valor_prod = valor_prod;
        this.imposto = imposto;
        
    }
    
    private String CNPJ;
    private float valor_prod;
    private float imposto;

    public float getValor_prod() {
        return valor_prod;
    }

    public void setValor_prod(float valor_prod) {
        this.valor_prod = valor_prod;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public void imprimirFornecedor(){
        
        System.out.println("CNPJ do fornecedor: "+ this.getCNPJ());
        System.out.println("Nome do fornecedor: "+ super.getNome());
        System.out.println("Idade do fornecedor: "+ super.getIdade());
        System.out.println("Endereço do fornecedor: "+ super.getEndereco());
        
    }
    public float calcularImposto(Fornecedor oFornecedor){
        
        float valor_total = valor_prod + (valor_prod * (imposto/100));
        return valor_total;
    }
    
}
