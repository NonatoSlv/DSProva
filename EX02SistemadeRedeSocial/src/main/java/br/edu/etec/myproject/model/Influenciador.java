/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */
public class Influenciador extends Usuario {
    private int parcerias; 

   
    public Influenciador(String nome, String email) {
        super(nome, email);  
        this.parcerias = 0;  
    }

   
    public int getParcerias() {
        return parcerias;
    }

    public void setParcerias(int parcerias) {
        this.parcerias = parcerias;
    }

    
    public void postarPublicidade(String marca) {
        System.out.println(this.getNome() + " postou uma publicidade de " + marca);
      
    }

    
    @Override
    public void exibirPerfil() {
        super.exibirPerfil();  
        System.out.println("Parcerias Comerciais: " + parcerias);  
    }
}
