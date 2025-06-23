package com.ejemplo;

public class Saludo {
    public String generarSaludo(String nombre, String idioma) {
        switch (idioma.toLowerCase()) {
            case "es":
                return "¡Hola, " + nombre + "!";
            case "en":
                return "Hello, " + nombre + "!";
            case "fr":
                return "Bonjour, " + nombre + "!";
            case "zh":
                return "你好 Nǐ hǎo, " + nombre + "!";
            default:
                return "¡Hola, " + nombre + "!";
        }
    }
}