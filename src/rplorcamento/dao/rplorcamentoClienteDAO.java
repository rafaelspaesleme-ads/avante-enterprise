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
import rplorcamento.modelo.rplorcamentoClienteModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoClienteDAO {
    
    
    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = rplorcamentoConexao.getInstance().getConnection();
        String sql = "SELECT * FROM clientes";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(rplorcamentoClienteModel cliente) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into bd_rplorcamento.clientes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, cliente.getId());
            insereSt.setString(2, cliente.getNomeRazaoSocial());
            insereSt.setString(3, cliente.getRGIE());
            insereSt.setString(4, cliente.getNomeFantasiaApelido());
            insereSt.setString(5, cliente.getCPFCNPJ());
            insereSt.setString(6, cliente.getEndereco());
            insereSt.setString(7, cliente.getBairro());
            insereSt.setString(8, cliente.getCidade());
            insereSt.setString(9, cliente.getCEP());
            insereSt.setString(10, cliente.getUF());
            insereSt.setString(11, cliente.getTelefone());
            insereSt.setString(12, cliente.getCelular());
            insereSt.setString(13, cliente.getEmail());
            insereSt.setString(14, cliente.getReferencia());

            String   data_nascimento = cliente.getNascimento();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());
            insereSt.setDate(15, data2);                 
            insereSt.setString(16, cliente.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar cliente: " + e.getMessage() + "\n");
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
    public static rplorcamentoClienteModel RecuperaObjCodigo(int cliente) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        rplorcamentoClienteModel cid = new rplorcamentoClienteModel();
        try {
            Statement objStm = cnx.createStatement();
                objStm.executeQuery("Select * from bd_rplorcamento.clientes where id =" + String.valueOf(cliente));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                cid = new rplorcamentoClienteModel();
                
                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNomeRazaoSocial = objRsSt.getString("nome_razao_social");
                String vRGIE = objRsSt.getString("rg_ie");
                String vNomeFantasiaApelido = objRsSt.getString("nome_fantasia_apelido");
                String vCPFCNPJ = objRsSt.getString("cpf_cnpj");
                String vEndereco = objRsSt.getString("endereco");
                String vBairro = objRsSt.getString("bairro");
                String vCidade = objRsSt.getString("cidade");
                String vCEP = objRsSt.getString("cep");
                String vUF = objRsSt.getString("uf");
                String vTelefone = objRsSt.getString("telefone");
                String vCelular = objRsSt.getString("celular");
                String vEmail = objRsSt.getString("email");
                String vReferencia = objRsSt.getString("referencia");
                Date vNascimento = Date.valueOf(objRsSt.getString("nascimento"));
                String vObservacao = objRsSt.getString("observacao");
  
                cid.setId(vID);
                cid.setNomeRazaoSocial(vNomeRazaoSocial);
                cid.setRGIE(vRGIE);
                cid.setNomeFantasiaApelido(vNomeFantasiaApelido);
                cid.setCPFCNPJ(vCPFCNPJ);
                cid.setEndereco(vEndereco);
                cid.setBairro(vBairro);
                cid.setCidade(vCidade);
                cid.setCEP(vCEP);
                cid.setUF(vUF);
                cid.setTelefone(vTelefone);
                cid.setCelular(vCelular);
                cid.setEmail(vEmail);
                cid.setReferencia(vReferencia);
                cid.setNascimento(String.valueOf(vNascimento));
                cid.setObservacao(vObservacao);

            }

            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);

        }

        return cid;
    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do Nome
    public static List<rplorcamentoClienteModel> RecuperaObjts(String cliente) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        List<rplorcamentoClienteModel> cid = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.clientes where nome like '%" + cliente + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                rplorcamentoClienteModel c = new rplorcamentoClienteModel();

                                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNomeRazaoSocial = objRsSt.getString("nome_razao_social");
                String vRGIE = objRsSt.getString("rg_ie");
                String vNomeFantasiaApelido = objRsSt.getString("nome_fantasia_apelido");
                String vCPFCNPJ = objRsSt.getString("cpf_cnpj");
                String vEndereco = objRsSt.getString("endereco");
                String vBairro = objRsSt.getString("bairro");
                String vCidade = objRsSt.getString("cidade");
                String vCEP = objRsSt.getString("cep");
                String vUF = objRsSt.getString("uf");
                String vTelefone = objRsSt.getString("telefone");
                String vCelular = objRsSt.getString("celular");
                String vEmail = objRsSt.getString("email");
                String vReferencia = objRsSt.getString("referencia");
                Date vNascimento = Date.valueOf(objRsSt.getString("nascimento"));
                String vObservacao = objRsSt.getString("observacao");
  
                c.setId(vID);
                c.setNomeRazaoSocial(vNomeRazaoSocial);
                c.setRGIE(vRGIE);
                c.setNomeFantasiaApelido(vNomeFantasiaApelido);
                c.setCPFCNPJ(vCPFCNPJ);
                c.setEndereco(vEndereco);
                c.setBairro(vBairro);
                c.setCidade(vCidade);
                c.setCEP(vCEP);
                c.setUF(vUF);
                c.setTelefone(vTelefone);
                c.setCelular(vCelular);
                c.setEmail(vEmail);
                c.setReferencia(vReferencia);
                c.setNascimento(String.valueOf(vNascimento));
                c.setObservacao(vObservacao);
                
                cid.add(c);
            }
            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar objetos: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        return cid;
    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(rplorcamentoClienteModel cliente) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update bd_rplorcamento.clientes set id = ?, "
                + "  nome_razao_social = ?, "
                + "  rg_ie = ?, "
                + "  nome_fantasia_apelido = ?, "
                + "  cpf_cnpj = ?, "
                + "  endereco = ?, "
                + "  bairro = ?, "
                + "  cidade = ?, "
                + "  cep = ?, "
                + "  uf = ?, "
                + "  telefone = ?, "
                + "  celular = ?, "
                + "  email = ?, "
                + "  referencia = ?, "
                + "  nascimento = ?, "
                + "  observacao = ? "
                + "  where id = " + cliente.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, cliente.getId());
            insereSt.setString(2, cliente.getNomeRazaoSocial());
            insereSt.setString(3, cliente.getRGIE());
            insereSt.setString(4, cliente.getNomeFantasiaApelido());
            insereSt.setString(5, cliente.getCPFCNPJ());
            insereSt.setString(6, cliente.getEndereco());
            insereSt.setString(7, cliente.getBairro());
            insereSt.setString(8, cliente.getCidade());
            insereSt.setString(9, cliente.getCEP());
            insereSt.setString(10, cliente.getUF());
            insereSt.setString(11, cliente.getTelefone());
            insereSt.setString(12, cliente.getCelular());
            insereSt.setString(13, cliente.getEmail());
            insereSt.setString(14, cliente.getReferencia());

            String data_nascimento = cliente.getNascimento();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());
            insereSt.setDate(15, data2);                 
            insereSt.setString(16, cliente.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente: " + e.getMessage());
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
    public static void excluir(rplorcamentoClienteModel cliente) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from bd_rplorcamento.clientes where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, cliente.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + e.getMessage() + "\n");
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
