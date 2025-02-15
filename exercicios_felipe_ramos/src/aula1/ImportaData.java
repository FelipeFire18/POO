package aula1;

import java.util.Date;

public class ImportaData {
    
    public void mostrarData (Date objDate){
            System.out.println("A data de hoje em mili segundos é: " + objDate.getTime());
}
    public void compararNumero(){
        int x = 10;
        int y = 20;
        if (x > y){
            System.out.println("O maior número é: " + x);
        }
        else{
            System.out.println("O maior número é: "+ y);}
    }
    
    public static void main(String[] args) {
        Date objDate = new Date();
        ImportaData msData = new ImportaData();
        ImportaData mNumber = new ImportaData();
        msData.mostrarData(objDate);
        mNumber.compararNumero();
    }
    
}
