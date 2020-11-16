/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajoaquim;

/**
 *
 * @author eliezer
 */
public class EmpresaJoaquim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("eliezer Antonio", 20, 35000);
        funcionario.desconto(0.03, 0.07);
        funcionario.bonus(0.1);
        funcionario.estados();

    }

}
