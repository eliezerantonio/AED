/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eliezer
 */
public class ConexaoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caminho = "jdbc:mysql://localhost:3306/Conexao";
        String utilizador = "root";
        String senha = "1223";
        PreparedStatement cmd;
        String query = "select * from estudante;";
        String queryInto = "    INSERT INTO estudante(nome)VALUES('eliezer')";
        try {
            Connection conexao = DriverManager.getConnection(caminho, utilizador, senha);
            PreparedStatement sql = conexao.prepareStatement(query);
            PreparedStatement sq = conexao.prepareStatement(queryInto);
            ResultSet resultado = sql.executeQuery();
            ResultSet resultad = sq.executeQuery();
            while (resultado.next()) {

                System.out.println("NomeEstudante: " + resultado.getString("NomeEstudante"));
                System.out.println("paisEstudante: " + resultado.getString("paisEstudante"));
                System.out.println("sexoEstudante: " + resultado.getString("sexoEstudante"));
                System.out.println("_______________________________________________________");

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o DB");
        }

    }

}
