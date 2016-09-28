//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: CozaLozaWoza

package com.cobble.cs.inClass;

public class CozaLozaWoza {

    public static void main(String[] args) {
        for(int i = 1; i <= 110; i++) {

            boolean isMult = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                isMult = true;
            }

            if (i % 5 == 0) {
                System.out.print("Loza");
                isMult = true;
            }

            if (i % 7 == 0) {
                System.out.print("Woza");
                isMult = true;
            }

            if(!isMult)
                System.out.print(i);

            if(i % 11 == 0)
                System.out.println();
            else
                System.out.print(" ");
        }
    }
}