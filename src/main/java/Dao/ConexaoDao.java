package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author UEMERSON
 */
public class ConexaoDao {

    private final String url = "jdbc:mysql://localhost:3306/database";
    private final String user = "root";
    private final String password = "uemerson@123";
    private Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(
                    null,
                    "Erro de conexão com o banco de dados!",
                    "Não foi possível conectar com o banco de dados!\n"
                    + "Entre em contato com o desenvolvedor!",
                    JOptionPane.ERROR_MESSAGE);

            System.exit(1);                                                                     //Força a saída do sistema
        }

        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao fechar conexão com o banco de dados!",
                    "Não foi possível fechar conexão com o banco de dados!\n"
                    + "Entre em contato com o desenvolvedor!",
                    JOptionPane.ERROR_MESSAGE);

            System.exit(1);                                                                     //Força a saída do sistema
        }
    }

}
