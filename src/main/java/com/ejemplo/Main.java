package com.ejemplo;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("* PROYECTO DE JAVA PARA EL NADA HARO *");
        System.out.println("*********************************************");
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Nada Haro", "en"));
        System.out.println(saludo.generarSaludo("Nada Haro", "es"));
        System.out.println(saludo.generarSaludo("Nada Haro", "fr"));
        System.out.println(saludo.generarSaludo("Nada Haro", "zh"));
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Nada Haro"));
    }
}