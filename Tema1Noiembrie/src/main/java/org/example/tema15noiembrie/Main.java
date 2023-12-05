package org.example.tema15noiembrie;

import org.example.Tema8Noiembrie;
import org.example.tema15noiembrie.A;
import org.example.tema15noiembrie.B;

public class Main {
    public static void main(String[] args) {
        Tema8Noiembrie obiect1 = new Tema8Noiembrie(10, 20, 30);
        Tema8Noiembrie obiect2 = new Tema8Noiembrie(5, 15, 25);

        Tema8Noiembrie obiect3 = new Tema8Noiembrie();
        obiect3.setN1(7);
        obiect3.setN2(14);
        obiect3.setN3(21);

        Tema8Noiembrie obiect4 = new Tema8Noiembrie();
        obiect4.setN1(3);
        obiect4.setN2(6);
        obiect4.setN3(9);


        obiect1.afiseazaValori();
        obiect1.afiseazaMedia();

        obiect2.afiseazaValori();
        obiect2.afiseazaMedia();

        obiect3.afiseazaValori();
        obiect3.afiseazaMedia();

        obiect4.afiseazaValori();
        obiect4.afiseazaMedia();



        B b = new B();
        b.metoda();
        A obiecta = new A();
        A obiectb = new A(5, 10.5);
        A obiectc = new A(3, 7.8);

        obiecta.afisareComponente();
        obiectb.afisareComponente();
        obiectc.afisareComponente();


        A.setNumarStatic(15);

        System.out.println("Valoarea variabilei statice pentru obiectul 1: " + A.getNumarStatic());
        System.out.println("Valoarea variabilei statice pentru obiectul 2: " + A.getNumarStatic());
        System.out.println("Valoarea variabilei statice pentru obiectul 3: " + A.getNumarStatic());

    }
    }



