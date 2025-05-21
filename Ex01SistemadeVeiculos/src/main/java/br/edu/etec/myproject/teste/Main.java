/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.teste;

import etec.edu.etec.myproject.model.Carro;
import etec.edu.etec.myproject.model.Veiculo;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
      
        Veiculo veiculo1 = new Veiculo("Ferrari", "vermelha");
        veiculo1.acelerar(200);  
        veiculo1.frear(20);     

 
        veiculo1.exibirInformacoes();

        System.out.println(); 

       
        Carro carro1 = new Carro("Bugatti", "Azul", 2);
        carro1.acelerar(230);  
        carro1.frear(30);     

       
        carro1.exibirInformacoes();
    }
}

