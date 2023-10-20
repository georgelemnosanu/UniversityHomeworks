package org.example;

import java.io.InputStream;
import java.util.Scanner;

public class Tema_18_octombrie_2023 {

    public int introduceNumber() {
        System.out.println("Introdu Numarul");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean theBigNumber(int num) {
        int a = introduceNumber();
        if (a >= num) {
            System.out.println("Valoarea este mai mare decat" +"  "+ num);
            return true;
        } else {
            System.out.println("Valoarea este inferioara lui " +"  "+ num);

            return false;
        }
    }


            public String restImpartire(){
               int a = introduceNumber();
               int rest =  a / 5;
               String resultText;

                switch (rest) {
                    case 0:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 1:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 2:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 3:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 4:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 5:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 6:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 7:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 8:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    case 9:
                        resultText = "Restul impartirii la 5 este " + rest;
                        break;
                    default:
                        resultText = "Restul este prea mare" ;
                        break;
                }
                System.out.println(resultText);
                return resultText;
            }




    }

