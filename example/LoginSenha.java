package org.example;

import javax.swing.*;
import java.util.Scanner;

public class LoginSenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String singin;
        String password;
        String login;
        String senha;

        System.out.println("Cadastre um login: ");
        singin= ler.next();
        System.out.println("Cadastre uma senha: ");
        password = ler.next();


        System.out.println("Faça login para entrar: ");
        login = ler.next();
        System.out.println("Digite sua senha: ");
        senha = ler.next();
        if (login.equals(singin) && senha.equals(password)){
            System.out.println("Bem vindo!! Usúario logado");
        }else{
            System.out.println("Usuário ou senha incorretos");
        }


    }
}
