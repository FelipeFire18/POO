package aula1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Conta {
    
    private double saldo;
    private String nome;
    double valor;
    double percentual;
    
    public double getSaldo(){
        
        return this.saldo;
        
    }
    
    public void setSaldo(double saldo){
        
        this.saldo = saldo;
        
    }
    
    public String getNome(){
        
        return this.nome;
        
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    
    /**
     * Acumula no saldo um valor x mais 10%
     * @param valor 
     */
    
    public void depositar(double valor, double percentual){
        
        this.saldo = this.saldo + valor + (valor* (percentual/100));
        
    }
    
}
