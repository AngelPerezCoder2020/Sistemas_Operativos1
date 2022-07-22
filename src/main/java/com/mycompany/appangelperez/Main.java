package com.mycompany.appangelperez;

public class Main {
    private static Operaciones op = new Operaciones();
    public static void main(String[] args){
        comenzar();
        System.out.println("\n\nHemos mostrado por pantalla los números del 1 al 10");
    }
    public static void comenzar(){
        op.Enumerar();
    }
}