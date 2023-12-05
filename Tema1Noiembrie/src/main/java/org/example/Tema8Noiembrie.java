package org.example;

public class Tema8Noiembrie {
        private int n1, n2, n3;

        public Tema8Noiembrie(int n1, int n2, int n3) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }


        public Tema8Noiembrie() {
            this.n1 = 0;
            this.n2 = 0;
            this.n3 = 0;
        }

        public int getN1() {
            return n1;
        }

        public void setN1(int n1) {
            this.n1 = n1;
        }

        public int getN2() {
            return n2;
        }

        public void setN2(int n2) {
            this.n2 = n2;
        }

        public int getN3() {
            return n3;
        }

        public void setN3(int n3) {
            this.n3 = n3;
        }

        public void afiseazaMedia() {
            double media = (n1 + n2 + n3) / 3.0;
            System.out.println("Media numerelor este: " + media);
        }

        public void afiseazaValori() {
            System.out.println("Valorile numerelor sunt: " + n1 + ", " + n2 + ", " + n3);
        }
    }

