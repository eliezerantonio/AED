/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author eliezer7
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota = 2;

        if (nota >= 12 && nota <= 20) {
            System.out.println("Aprovado");
        } else if (nota < 12 && nota > 6) {
            System.out.println("recurso");
        } else if (nota < 0 || nota>20) {
            System.out.println("nota nula");
        } else {
            System.out.println("reprovado");
        }
    }

}
