package org.example.tema15noiembrie;

class A {
    private int numar1;
    private double numar2;
    private static int numarStatic;


    A() {
        numar1 = 0;
        numar2 = 0.0;
        numarStatic = 0;
    }


    A(int n1, double n2) {
        this.numar1 = n1;
        this.numar2 = n2;
    }


    void afisareComponente() {
        System.out.println("Componentele obiectului: " + numar1 + ", " + numar2 + ", " + numarStatic);
    }


    public static int getNumarStatic() {
        return numarStatic;
    }

    public static void setNumarStatic(int numarStatic) {
        A.numarStatic = numarStatic;
    }
}

