/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */
public class Usuario {
  
    private String nome;
    private String email;
    private int seguidores;

  
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.seguidores = 0;  
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    
    public void seguir(Usuario outroUsuario) {
        System.out.println(this.nome + " está seguindo " + outroUsuario.getNome());
      
    }

   
    public void postar(String conteudo) {
        System.out.println(this.nome + " postou: " + conteudo);
    }

    
    public void exibirPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Seguidores: " + seguidores);
    }
}

