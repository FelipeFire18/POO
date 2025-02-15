package aula1;

public class Usuario {

    int id;
    private String nome;
    private String endereco;
    private String email;
    private Byte receita;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco(String endereco) {
        return endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setReceita(Byte receita) {
        this.receita = receita;
    }

    public Byte getReceita() {
        return receita;
    }

    public void consultarMedicamento() {
        System.out.println("Método de consulta de medicamento");
    }

    public void comprarMedicamento() {
        System.out.println("Método para comprar medicamentos");
    }

    public void efetuarPagamento() {
        System.out.println("Método para efetuar pagamento");
    }

    public float calcularImposto(float valor_med) {
        if (valor_med > 100){
            float valor = (float) (valor_med * 0.15);
            return valor;
        }
        else{
            float valor = (float) (valor_med * 0.1);
            return valor;
        }
    }
}
