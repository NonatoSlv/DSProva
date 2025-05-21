/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etec.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */

public class Carro extends Veiculo {
    private int numeroPortas;

    
    public Carro(String modelo, String cor, int numeroPortas) {
        super(modelo, cor);
        this.numeroPortas = numeroPortas;
    }

  
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

   
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Número de portas: " + this.numeroPortas);
    }
}




