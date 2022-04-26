/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.sql.Connection;
import java.util.ArrayList;
import modelo.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Alexandre
 */
public class JDBCProduto {
    
    Connection conexão;
    
    public JDBCProduto(Connection conexão) {
        this.conexão = conexão;
    }
    
    public void inserirProduto(Produto p) {
        
        String sql = "insert into produto (nome, valor, quantidade) values (?, ?, ?)";
        PreparedStatement ps;
        
        try {
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1,p.getNome());
            ps.setInt(2, p.getValor());
            ps.setInt(3,p.getQuantidade());
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Produto> listarProdutos() {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        String sql = "select * from produto";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            while(resposta.next()){
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                int valor = resposta.getInt("valor");
                int quantidade = resposta.getInt("quantidade");
                
                Produto p = new Produto(id, nome, valor, quantidade);
                produtos.add(p);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return produtos;
    }
    
    
    public void apagarTudo(){
        String sql = "delete from produto";
        
        PreparedStatement ps;
        
        try {
            ps = this.conexão.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
