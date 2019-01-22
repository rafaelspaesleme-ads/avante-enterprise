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
import rplorcamento.modelo.rplorcamentoFornecedorModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoFornecedorDAO {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = rplorcamentoConexao.getInstance().getConnection();
        String sql = "SELECT * FROM fornecedores";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(rplorcamentoFornecedorModel fornecedor) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into bd_rplorcamento.fornecedores values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, fornecedor.getId());
            insereSt.setString(2, fornecedor.getNomeRazaoSocial());
            insereSt.setString(3, fornecedor.getCPFCNPJ());
            insereSt.setString(4, fornecedor.getEndereco());
            insereSt.setString(5, fornecedor.getCEP());
            insereSt.setString(6, fornecedor.getReferencia());
            insereSt.setString(7, fornecedor.getBairro());
            insereSt.setString(8, fornecedor.getCidade());
            insereSt.setString(9, fornecedor.getUF());
            insereSt.setString(10, fornecedor.getRGIE());
            insereSt.setString(11, fornecedor.getTelefone());
            insereSt.setString(12, fornecedor.getCelular());
            insereSt.setString(13, fornecedor.getEmail());
            insereSt.setString(14, fornecedor.getFax());
            String data_nascimento = fornecedor.getNascimento();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());
            insereSt.setDate(15, data2);
            insereSt.setString(16, fornecedor.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar fornecedor: " + e.getMessage() + "\n");
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
    public static rplorcamentoFornecedorModel RecuperaObjCodigo(int fornecedor) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        rplorcamentoFornecedorModel fom = new rplorcamentoFornecedorModel();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.fornecedores where id =" + String.valueOf(fornecedor));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                fom = new rplorcamentoFornecedorModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNomeRazaoSocial = objRsSt.getString("nome_razao_social");
                String vCPFCNPJ = objRsSt.getString("cpf_cnpj");
                String vEndereco = objRsSt.getString("endereco");
                String vCEP = objRsSt.getString("cep");
                String vReferencia = objRsSt.getString("referencia");
                String vBairro = objRsSt.getString("bairro");
                String vCidade = objRsSt.getString("cidade");
                String vUF = objRsSt.getString("uf");
                String vRGIE = objRsSt.getString("rg_ie");
                String vTelefone = objRsSt.getString("telefone");
                String vCelular = objRsSt.getString("celular");
                String vEmail = objRsSt.getString("email");
                String vFax = objRsSt.getString("fax");
                Date vNascimento = Date.valueOf(objRsSt.getString("nascimento"));
                String vObservacao = objRsSt.getString("observacao");

                fom.setId(vID);
                fom.setNomeRazaoSocial(vNomeRazaoSocial);
                fom.setCPFCNPJ(vCPFCNPJ);
                fom.setEndereco(vEndereco);
                fom.setCEP(vCEP);
                fom.setReferencia(vReferencia);
                fom.setBairro(vBairro);
                fom.setCidade(vCidade);
                fom.setUF(vUF);
                fom.setRGIE(vRGIE);
                fom.setTelefone(vTelefone);
                fom.setCelular(vCelular);
                fom.setEmail(vEmail);
                fom.setFax(vFax);
                fom.setNascimento(String.valueOf(vNascimento));
                fom.setObservacao(vObservacao);

            }

            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);

        }

        return fom;
    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do Nome
    public static List<rplorcamentoFornecedorModel> RecuperaObjts(String fornecedor) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        List<rplorcamentoFornecedorModel> fom = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.fornecedores where nome like '%" + fornecedor + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                rplorcamentoFornecedorModel c = new rplorcamentoFornecedorModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNomeRazaoSocial = objRsSt.getString("nome_razao_social");
                String vCPFCNPJ = objRsSt.getString("cpf_cnpj");
                String vEndereco = objRsSt.getString("endereco");
                String vCEP = objRsSt.getString("cep");
                String vReferencia = objRsSt.getString("referencia");
                String vBairro = objRsSt.getString("bairro");
                String vCidade = objRsSt.getString("cidade");
                String vUF = objRsSt.getString("uf");
                String vRGIE = objRsSt.getString("rg_ie");
                String vTelefone = objRsSt.getString("telefone");
                String vCelular = objRsSt.getString("celular");
                String vEmail = objRsSt.getString("email");
                String vFax = objRsSt.getString("fax");
                Date vNascimento = Date.valueOf(objRsSt.getString("nascimento"));
                String vObservacao = objRsSt.getString("observacao");

                c.setId(vID);
                c.setNomeRazaoSocial(vNomeRazaoSocial);
                c.setCPFCNPJ(vCPFCNPJ);
                c.setEndereco(vEndereco);
                c.setCEP(vCEP);
                c.setReferencia(vReferencia);
                c.setBairro(vBairro);
                c.setCidade(vCidade);
                c.setUF(vUF);
                c.setRGIE(vRGIE);
                c.setTelefone(vTelefone);
                c.setCelular(vCelular);
                c.setEmail(vEmail);
                c.setFax(vFax);
                c.setNascimento(String.valueOf(vNascimento));
                c.setObservacao(vObservacao);

                fom.add(c);
            }
            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar objetos: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        return fom;
    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(rplorcamentoFornecedorModel fornecedor) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update bd_rplorcamento.fornecedores set id = ?, "
                + "  nome_razao_social = ?, "
                + "  cpf_cnpj = ?, "
                + "  endereco = ?, "
                + "  cep = ?, "
                + "  referencia = ?, "
                + "  bairro = ?, "
                + "  cidade = ?, "
                + "  uf = ?, "
                + "  rg_ie = ?, "
                + "  telefone = ?, "
                + "  celular = ?, "
                + "  email = ?, "
                + "  fax = ?, "
                + "  nascimento = ?, "
                + "  observacao = ? "
                + "  where id = " + fornecedor.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, fornecedor.getId());
            insereSt.setString(2, fornecedor.getNomeRazaoSocial());
            insereSt.setString(3, fornecedor.getCPFCNPJ());
            insereSt.setString(4, fornecedor.getEndereco());
            insereSt.setString(5, fornecedor.getCEP());
            insereSt.setString(6, fornecedor.getReferencia());
            insereSt.setString(7, fornecedor.getBairro());
            insereSt.setString(8, fornecedor.getCidade());
            insereSt.setString(9, fornecedor.getUF());
            insereSt.setString(10, fornecedor.getRGIE());
            insereSt.setString(11, fornecedor.getTelefone());
            insereSt.setString(12, fornecedor.getCelular());
            insereSt.setString(13, fornecedor.getEmail());
            insereSt.setString(14, fornecedor.getFax());
            String data_nascimento = fornecedor.getNascimento();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());
            insereSt.setDate(15, data2);
            insereSt.setString(16, fornecedor.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor: " + e.getMessage());
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
    public static void excluir(rplorcamentoFornecedorModel fornecedor) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from bd_rplorcamento.fornecedores where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, fornecedor.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor: " + e.getMessage() + "\n");
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
