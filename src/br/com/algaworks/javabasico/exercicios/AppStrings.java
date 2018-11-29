package br.com.algaworks.javabasico.exercicios;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AppStrings {

    public static void main(String[] args) {
        // ListaExericicios02.pdf

        String digitada = "UNIFlamengorio";
        
        /*a) O número de caracteres da string.*/
        System.out.println(digitada.length());
        /*b) A string com todas suas letras em maiúsculo.*/
        System.out.println(digitada.toUpperCase());
        
       
        /*c) O número de vogais da string.*/
        
       /* int qtde_vogais = 0;
        char[] vogais = { 'a', 'e', 'i', 'o', 'u' ,'A','E','I','O','U'};

        for (int i = 0; i < digitada.length(); i++) {  
            System.out.println(digitada.charAt(i));
            for (int j = 0; j <= vogais.length; j++) {                
                System.out.println(vogais[j]);
                if (digitada.charAt(i) == vogais[j]) {
                    qtde_vogais++;
                }
            }            
        }
        System.out.println(qtde_vogais);*/
        
        /*d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).*/
        
        if (digitada.startsWith("Uni") || digitada.startsWith("UNI")) {
            System.out.println("d) Se a String começa com UNI (ignorando maiúsculas/minúsculas) ? "
                    + digitada.startsWith(digitada));
        } else {
            System.out.println("d) Se a String começa com UNI (ignorando maiúsculas/minúsculas) ?Não inicia com UNI!");
        }
        
        /*e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).*/
        System.out.println("e) String digitada termina com “RIO” (ignorando maiúsculas/minúsculas)");
        
       /*f) O número de dígitos (0 a 9) da string.*/
        
        for (int i = 0; i < digitada.length(); i++) {
            System.out.println("f) O número de dígitos (0 a 9) da string : [ Posição "+i+" ]=" + digitada.charAt(i));
        }
        
       /*g) Se a string é um palíndromo ou não.*/
        
        /*
         * 2. Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em uma variável inteira), 
         * imprima cada um dos seus dígitos por extenso.
         * Entre o número: 4571 Resultado: quatro, cinco, sete, um
         * */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o numero inteiro : ");
        Integer inteiro=entrada.nextInt();
        
    }

}
