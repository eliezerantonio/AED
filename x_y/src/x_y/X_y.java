/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x_y;

public class X_y {

    public static void main(String[] args) {
        int x;
        int y;
        int n = 60;
        int b = 50;

        if (b == 50 && n == 60) {
            x = b;
            y = n;
            System.out.println(y);
            System.out.println(x);
            System.out.println("________________________");
            for (int c = 0; c < 2; c++) {
                x = c - 10;
                System.out.println(x);

                for (int d= 0; d < 3; d=d+1) {

                    y = y + x;
                    y = y - 20;
                    System.out.println(y);
                    System.out.println("_____________________");
                }
                System.out.println("Loop d++");
                System.out.println(y);
            }
            System.out.println("Resultado Final");
            System.out.println(y);
            System.out.println(x);
        }

    }
}
