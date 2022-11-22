package org.example;

public class Main {
    public static void main(String[] args) {
        int param1 = 10;
        int param2 = 20;
        int param3 = 30;
        var result = suma(param1, param2, param3);
        System.out.println("El resultado de la suma es: "+result);

        Coche miCoche = new Coche();
        miCoche.addPuertas();
        System.out.println("El coche tiene "+miCoche.puertas+" puertas.");
    }

    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}
class Coche {
    public int puertas = 3;

    public void addPuertas() {
        this.puertas++;
    }
}
