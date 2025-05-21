/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.teste;

import br.edu.etec.myproject.model.Influenciador;
import br.edu.etec.myproject.model.Usuario;
import br.edu.etec.myproject.model.UsuarioComum;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        UsuarioComum usuarioComum = new UsuarioComum("Andrey", "andrey@example.com", "Adoro carros e video games.");
        usuarioComum.setSeguidores(100); 
        System.out.println("### Perfil de Usuario Comum ###");
        usuarioComum.seguir(new Usuario("Yas", "Yas@example.com"));  
        usuarioComum.postar("Meu novo jogo!");
        usuarioComum.curtirPost();  
        usuarioComum.exibirPerfil(); 
        
        System.out.println("\n");  

        
        Influenciador influenciador = new Influenciador("Yasmin", "Yasmin@example.com");
        influenciador.setSeguidores(5000);
        influenciador.setParcerias(12);  
        System.out.println("### Perfil de Influenciador ###");
        influenciador.seguir(usuarioComum);
        influenciador.postar("Olha minha nova parceria com a Microsoft!");
        influenciador.postarPublicidade("Empresa Microsoft");
        influenciador.exibirPerfil();  
    }
}


