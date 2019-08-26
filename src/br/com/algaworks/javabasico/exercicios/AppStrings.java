package br.com.algaworks.javabasico.exercicios;

public class AppStrings {

    public static void main(String[] args) {
        // ListaExericicios02.pdf

        String digitada = "UNIFlamengorio";

        System.out.println("a) O número de caracteres da string " + digitada.length());

        System.out.println("b) A string com todas suas letras em maiúsculo." + digitada.toUpperCase());

        /* c) O número de vogais da string. */

        if (digitada.startsWith("Uni") || digitada.startsWith("UNI")) {
            System.out.println("d) Se a String começa com UNI (ignorando maiúsculas/minúsculas) ? "
                    + digitada.startsWith(digitada));
        } else {
            System.out.println("d) Se a String começa com UNI (ignorando maiúsculas/minúsculas) ?Não inicia com UNI!");
        }

        System.out.println("e) String digitada termina com “RIO” (ignorando maiúsculas/minúsculas)");

        for (int i = 0; i < digitada.length(); i++) {
            if (i <= 9) {
                System.out.println("f) O número de dígitos (0 a 9) da string : [ Posição " + i + " ]=" + digitada.charAt(i));
            }
         }

        
        for (int i = 0; i < digitada.length(); i++) {
                      
          // String[] left = new String()[];      digitada.charAt(i)== digitada.charAt(i);     
           
           
            
            System.out.println("Se a string é um palíndromo ou não. ");
        }
        
        /*
         * 2. Escreva um programa que dado um valor numérico digitado pelo usuário
         * (armazenado em uma variável inteira), imprima cada um dos seus dígitos por
         * extenso. Entre o número: 4571 Resultado: quatro, cinco, sete, um
         */

//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Informe o numero inteiro : ");
//        //Integer inteiro = entrada.nextInt();

    }

}
