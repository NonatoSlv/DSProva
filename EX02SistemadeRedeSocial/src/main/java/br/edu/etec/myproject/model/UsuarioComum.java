/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */
public class UsuarioComum extends Usuario {
    private String biografia; 

    
    public UsuarioComum(String nome, String email, String biografia) {
        super(nome, email);  
        this.biografia = biografia;
    }

   
    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

 
    public void curtirPost() {
        System.out.println(this.getNome() + " curtiu o post.");
    }

   
    @Override
    public void exibirPerfil() {
        super.exibirPerfil(); 
        System.out.println("Biografia: " + biografia);  
    }
}

