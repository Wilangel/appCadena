package com.udc.appcadena.modelo;

public class utilidad {
    // parametro
    private String cadena;

    // constructor
    public utilidad(String cadena) {
        this.cadena = cadena;
    }

    // getter
    public String getCadena() {
        return cadena;
    }

    // setter

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    // metodo cadena normal

    public String cadenaNormal(){
        return cadena;
    }

    // metodo cadena invertida

    public String cadenaInvertida(){
        StringBuilder stringBuilder = new StringBuilder(cadena);
        return stringBuilder.reverse().toString();
    }
}
