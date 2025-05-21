/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etec.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */
// Classe base Veiculo
public class Veiculo {
  
    private String modelo;
    private String cor;
    private int velocidade;

    
    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0; 
    }

 
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

   
    public void acelerar(int incremento) {
        this.velocidade += incremento;
    }

    
    public void frear(int decremento) {
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    // Método para exibir informações do veículo
    public void exibirInformacoes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
    }
}

