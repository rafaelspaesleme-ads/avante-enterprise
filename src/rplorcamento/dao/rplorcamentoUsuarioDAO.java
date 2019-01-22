/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import rplorcamento.conexao.rplorcamentoConexao;
import rplorcamento.modelo.rplorcamentoUsuarioModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoUsuarioDAO {
    
        Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = rplorcamentoConexao.getInstance().getConnection();
        String sql = "SELECT * FROM usuario";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(rplorcamentoUsuarioModel usuario) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into bd_rplorcamento.usuario values(?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, usuario.getId());
            insereSt.setString(2, usuario.getNomeFuncionario());
            insereSt.setString(3, usuario.getMatriculaFuncionario());
            insereSt.setString(4, usuario.getNomeUsuario());
            insereSt.setString(5, usuario.getNivel());
            insereSt.setString(6, usuario.getNomeLogin());
            insereSt.setString(7, usuario.getSenha());
            insereSt.setString(8, usuario.getSituacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar usuario: " + e.getMessage() + "\n");
        } finally {
            try {
                insereSt.close();
                cnx.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: " + e.getMessage() + "\n");
            }
        }

    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do ID
    //
    public static rplorcamentoUsuarioModel RecuperaObjCodigo(int usuario) throws ClassNotFoundException {

        Connection cnx = rplorcamentoConexao.GeraConexao();
        rplorcamentoUsuarioModel usu = new rplorcamentoUsuarioModel();
        try {
            Statement objStm = cnx.createStatement();
                objStm.executeQuery("Select * from bd_rplorcamento.usuario where id =" + String.valueOf(usuario));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                usu = new rplorcamentoUsuarioModel();
                
                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNomeFuncionario = objRsSt.getString("nome_funcionario");
                String vMatriculaFuncionario = objRsSt.getString("matricula_funcionario");
                String vNomeUsuario = objRsSt.getString("nome_usuario");
                String vNivel = objRsSt.getString("nivel");
                String vNomeLogin = objRsSt.getString("nome_login");
                String vSenha = objRsSt.getString("senha");
                String vSituacao = objRsSt.getString("situacao");
                
                usu.setId(vID);
                usu.setNomeFuncionario(vNomeFuncionario);
                usu.setMatriculaFuncionario(vMatriculaFuncionario);
                usu.setNomeUsuario(vNomeUsuario);
                usu.setNivel(vNivel);
                usu.setNomeLogin(vNomeLogin);
                usu.setSenha(vSenha);
                usu.setSituacao(vSituacao);
            }

            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);

        }

        return usu;
    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do Nome
    public static List<rplorcamentoUsuarioModel> RecuperaObjts(String usuario) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        List<rplorcamentoUsuarioModel> usu = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.usuario where nome_funcionario like '%" + usuario + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                rplorcamentoUsuarioModel u = new rplorcamentoUsuarioModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNomeFuncionario = objRsSt.getString("nome_funcionario");
                String vMatriculaFuncionario = objRsSt.getString("matricula_funcionario");
                String vNomeUsuario = objRsSt.getString("nome_usuario");
                String vNivel = objRsSt.getString("nivel");
                String vNomeLogin = objRsSt.getString("nome_login");
                String vSenha = objRsSt.getString("senha");
                String vSituacao = objRsSt.getString("situacao");
  
                u.setId(vID);
                u.setNomeFuncionario(vNomeFuncionario);
                u.setMatriculaFuncionario(vMatriculaFuncionario);
                u.setNomeUsuario(vNomeUsuario);
                u.setNivel(vNivel);
                u.setNomeLogin(vNomeLogin);
                u.setSenha(vSenha);
                u.setSituacao(vSituacao);
                
                usu.add(u);
            }
            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar objetos: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        return usu;
    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(rplorcamentoUsuarioModel usuario) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update bd_rplorcamento.usuario set id = ?, "
                + "  nome_funcionario = ?, "
                + "  matricula_funcionario = ?, "
                + "  nome_usuario = ?, "
                + "  nivel = ?, "
                + "  nome_login = ?, "
                + "  senha = ?, "
                + "  situacao = ? "
                + "  where id = " + usuario.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);
            
            insereSt.setInt(1, usuario.getId());
            insereSt.setString(2, usuario.getNomeFuncionario());
            insereSt.setString(3, usuario.getMatriculaFuncionario());
            insereSt.setString(4, usuario.getNomeUsuario());
            insereSt.setString(5, usuario.getNivel());
            insereSt.setString(6, usuario.getNomeLogin());
            insereSt.setString(7, usuario.getSenha());
            insereSt.setString(8, usuario.getSituacao());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuario: " + e.getMessage());
        } finally {
            try {
                insereSt.close();
                cnx.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: " + e.getMessage() + "\n");
            }
        }
    }

    //Codigo fonte de Exclusão de dados no banco
    public static void excluir(rplorcamentoUsuarioModel usuario) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from bd_rplorcamento.usuario where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, usuario.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario: " + e.getMessage() + "\n");
        } finally {
            try {
                insereSt.close();
                cnx.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: " + e.getMessage() + "\n");
            }
        }
    }

    
}
