package Dao;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author uemerson
 */
public class ClienteDao {

    public void inserir(Cliente cliente) throws SQLException {
        ConexaoDao conexaoDao = new ConexaoDao();

        String SQL = "INSERT INTO cliente (estado, cidade, nome, endereco) VALUES (?, ?, ?, ?)";

        PreparedStatement pst = conexaoDao.getConnection().prepareStatement(SQL);
        pst.setString(1, cliente.getEstado());
        pst.setString(2, cliente.getCidade());
        pst.setString(3, cliente.getNome());
        pst.setString(4, cliente.getEndereco());
        pst.execute();

        conexaoDao.closeConnection();
    }
    
    public void atualizar(Cliente cliente) throws SQLException{
        String SQL = "UPDATE cliente SET nome = ?, estado = ?, endereco = ?, cidade = ? WHERE id_cliente = ?";
        
        ConexaoDao conexaoDao = new ConexaoDao();
        
        PreparedStatement pst = conexaoDao.getConnection().prepareStatement(SQL);
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getEstado());
        pst.setString(3, cliente.getEndereco());
        pst.setString(4, cliente.getCidade());
        pst.setInt(5, cliente.getId_cliente());
        
        pst.execute();
        conexaoDao.closeConnection();
    }
    
    public void excluir(Cliente cliente) throws SQLException{
        String SQL = "DELETE FROM cliente WHERE id_cliente = ?";
        ConexaoDao conexaoDao = new ConexaoDao();
        PreparedStatement pst = conexaoDao.getConnection().prepareStatement(SQL);
        pst.setInt(1, cliente.getId_cliente());
        
        pst.execute();
        conexaoDao.closeConnection();
    }
    
    public ArrayList<Cliente> listaClientes() throws SQLException {
        ArrayList<Cliente> retorno = new ArrayList<>();
        ConexaoDao conexaoDao = new ConexaoDao();

        String SQL = "SELECT * FROM cliente";

        PreparedStatement pst = conexaoDao.getConnection().prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Cliente cliente = new Cliente();

            cliente.setId_cliente(rs.getInt("id_cliente"));
            cliente.setNome(rs.getString("nome"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setEstado(rs.getString("estado"));

            retorno.add(cliente);
        }

        conexaoDao.closeConnection();

        return retorno;
    }

    public Cliente buscar(Cliente cliente) throws SQLException {
        String SQL = "SELECT * FROM cliente WHERE id_cliente = ?";

        ConexaoDao conexaoDao = new ConexaoDao();

        PreparedStatement pst = conexaoDao.getConnection().prepareStatement(SQL);
        pst.setInt(1, cliente.getId_cliente());
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            Cliente clienteConsulta = new Cliente();

            clienteConsulta.setCidade(rs.getString("cidade"));
            clienteConsulta.setEndereco(rs.getString("endereco"));
            clienteConsulta.setNome(rs.getString("nome"));
            clienteConsulta.setEstado(rs.getString("estado"));

            conexaoDao.closeConnection();

            return clienteConsulta;
        }

        conexaoDao.closeConnection();

        return null;
    }
}
