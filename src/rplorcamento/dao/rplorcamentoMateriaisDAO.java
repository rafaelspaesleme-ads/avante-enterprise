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
import rplorcamento.modelo.rplorcamentoMateriaisModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoMateriaisDAO {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = rplorcamentoConexao.getInstance().getConnection();
        String sql = "SELECT * FROM materiais";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(rplorcamentoMateriaisModel material) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into bd_rplorcamento.materiais values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, material.getId());
            insereSt.setString(2, material.getDescricao());
            insereSt.setString(3, material.getNomeAbreviado());

            String data_chegada = material.getChegada();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_chegada).getTime());
            insereSt.setDate(4, data2);

            insereSt.setString(5, material.getUnidMedida());
            insereSt.setDouble(6, material.getQuantidade());
            insereSt.setDouble(7, material.getVlUnitario());
            insereSt.setDouble(8, material.getVlTotal());
            insereSt.setDouble(9, material.getVlDesconto());
            insereSt.setDouble(10, material.getVlImposto());
            insereSt.setDouble(11, material.getVlFinal());
            insereSt.setString(12, material.getFornecedor());
            insereSt.setInt(13, material.getCodFornecedor());
            insereSt.setString(14, material.getCpfcnpjFornecedor());
            insereSt.setString(15, material.getCodProdFornecedor());
            insereSt.setString(16, material.getTipoVenda());
            insereSt.setString(17, material.getNumeroNF());
            insereSt.setString(18, material.getTipoNF());
            insereSt.setString(19, material.getNumTipoNF());
            insereSt.setString(20, material.getSerieNF());
            insereSt.setString(21, material.getFinalidadeNF());
            insereSt.setString(22, material.getCodBarras());

            String data_emissao = material.getEmissaoNF();
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(data_emissao).getTime());
            insereSt.setDate(23, data3);

            String data_vencimentoNF = material.getVencimentoNF();
            DateFormat fmt4 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data4 = new java.sql.Date(fmt4.parse(data_vencimentoNF).getTime());
            insereSt.setDate(24, data4);

            String data_saida = material.getSaidaProduto();
            DateFormat fmt5 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data5 = new java.sql.Date(fmt5.parse(data_saida).getTime());
            insereSt.setDate(25, data5);

            String data_vencimentoProd = material.getVencimentoProd();
            DateFormat fmt6 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data6 = new java.sql.Date(fmt6.parse(data_vencimentoProd).getTime());
            insereSt.setDate(26, data6);

            insereSt.setString(27, material.getComprador());
            insereSt.setString(28, material.getResponsavelEntrega());
            insereSt.setString(29, material.getCpfcnpjRespEntrega());
            insereSt.setString(30, material.getContatoRespEntrega());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar material: " + e.getMessage() + "\n");
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
    public static rplorcamentoMateriaisModel RecuperaObjCodigo(int material) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        rplorcamentoMateriaisModel mat = new rplorcamentoMateriaisModel();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.materiais where id =" + String.valueOf(material));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                mat = new rplorcamentoMateriaisModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vDescricao = objRsSt.getString("descricao");
                String vNomeAbreviado = objRsSt.getString("nome_abreviado");
                Date vChegada = Date.valueOf(objRsSt.getString("chegada"));
                String vUnidMedida = objRsSt.getString("unid_medida");
                double vQuantidade = Double.parseDouble(objRsSt.getString("quantidade"));
                double vVlUnitario = Double.parseDouble(objRsSt.getString("vl_unitario"));
                double vVlTotal = Double.parseDouble(objRsSt.getString("vl_total"));
                double vVlDesconto = Double.parseDouble(objRsSt.getString("vl_desconto"));
                double vVlImposto = Double.parseDouble(objRsSt.getString("vl_imposto"));
                double vVlFinal = Double.parseDouble(objRsSt.getString("vl_final"));
                String vFornecedor = objRsSt.getString("fornecedor");
                int vCodFornecedor = Integer.parseInt(objRsSt.getString("cod_fornecedor"));
                String vCpfCnpjFornecedor = objRsSt.getString("cpf_cnpj_fornecedor");
                String vCodProdFornecedor = objRsSt.getString("cod_produto_fornecedor");
                String vTipoVenda = objRsSt.getString("tipo_venda");
                String vNumeroNF = objRsSt.getString("numero_NF");
                String vTipoNF = objRsSt.getString("tipo_NF");
                String vNumTipoNF = objRsSt.getString("num_tipo_NF");
                String vSerieNF = objRsSt.getString("serie_NF");
                String vFinalidadeNF = objRsSt.getString("finalidade_NF");
                String vCodBarras = objRsSt.getString("cod_barras");
                Date vEmissaoNF = Date.valueOf(objRsSt.getString("emissao_NF"));
                Date vVencimentoNF = Date.valueOf(objRsSt.getString("vencimento_NF"));
                Date vSaidaProduto = Date.valueOf(objRsSt.getString("saida_prod"));
                Date vVencimentoProduto = Date.valueOf(objRsSt.getString("vencimento_prod"));
                String vComprador = objRsSt.getString("comprador");
                String vResponsavelEntrega = objRsSt.getString("responsavel_entrega");
                String vCpfCnpjEntrega = objRsSt.getString("cpf_cnpj_entrega");
                String vContatoEntrega = objRsSt.getString("contato_entrega");

                mat.setId(vID);
                mat.setDescricao(vDescricao);
                mat.setNomeAbreviado(vNomeAbreviado);
                mat.setChegada(String.valueOf(vChegada));
                mat.setUnidMedida(vUnidMedida);
                mat.setQuantidade(vQuantidade);
                mat.setVlUnitario(vVlUnitario);
                mat.setVlTotal(vVlTotal);
                mat.setVlDesconto(vVlDesconto);
                mat.setVlImposto(vVlImposto);
                mat.setVlFinal(vVlFinal);
                mat.setFornecedor(vFornecedor);
                mat.setCodFornecedor(vCodFornecedor);
                mat.setCpfcnpjFornecedor(vCpfCnpjFornecedor);
                mat.setCodProdFornecedor(vCodProdFornecedor);
                mat.setTipoVenda(vTipoVenda);
                mat.setNumeroNF(vNumeroNF);
                mat.setTipoNF(vTipoNF);
                mat.setNumTipoNF(vNumTipoNF);
                mat.setSerieNF(vSerieNF);
                mat.setFinalidadeNF(vFinalidadeNF);
                mat.setCodBarras(vCodBarras);
                mat.setEmissaoNF(String.valueOf(vEmissaoNF));
                mat.setVencimentoNF(String.valueOf(vVencimentoNF));
                mat.setSaidaProduto(String.valueOf(vSaidaProduto));
                mat.setVencimentoProd(String.valueOf(vVencimentoProduto));
                mat.setComprador(vComprador);
                mat.setResponsavelEntrega(vResponsavelEntrega);
                mat.setCpfcnpjRespEntrega(vCpfCnpjEntrega);
                mat.setContatoRespEntrega(vContatoEntrega);

            }

            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);

        }

        return mat;
    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do Nome
    public static List<rplorcamentoMateriaisModel> RecuperaObjts(String material) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        List<rplorcamentoMateriaisModel> mat = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.materiais where nome like '%" + material + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                rplorcamentoMateriaisModel m = new rplorcamentoMateriaisModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vDescricao = objRsSt.getString("descricao");
                String vNomeAbreviado = objRsSt.getString("nome_abreviado");
                Date vChegada = Date.valueOf(objRsSt.getString("chegada"));
                String vUnidMedida = objRsSt.getString("unid_medida");
                double vQuantidade = Double.parseDouble(objRsSt.getString("quantidade"));
                double vVlUnitario = Double.parseDouble(objRsSt.getString("vl_unitario"));
                double vVlTotal = Double.parseDouble(objRsSt.getString("vl_total"));
                double vVlDesconto = Double.parseDouble(objRsSt.getString("vl_desconto"));
                double vVlImposto = Double.parseDouble(objRsSt.getString("vl_imposto"));
                double vVlFinal = Double.parseDouble(objRsSt.getString("vl_final"));
                String vFornecedor = objRsSt.getString("fornecedor");
                int vCodFornecedor = Integer.parseInt(objRsSt.getString("cod_fornecedor"));
                String vCpfCnpjFornecedor = objRsSt.getString("cpf_cnpj_fornecedor");
                String vCodProdFornecedor = objRsSt.getString("cod_produto_fornecedor");
                String vTipoVenda = objRsSt.getString("tipo_venda");
                String vNumeroNF = objRsSt.getString("numero_NF");
                String vTipoNF = objRsSt.getString("tipo_NF");
                String vNumTipoNF = objRsSt.getString("num_tipo_NF");
                String vSerieNF = objRsSt.getString("serie_NF");
                String vFinalidadeNF = objRsSt.getString("finalidade_NF");
                String vCodBarras = objRsSt.getString("cod_barras");
                Date vEmissaoNF = Date.valueOf(objRsSt.getString("emissao_NF"));
                Date vVencimentoNF = Date.valueOf(objRsSt.getString("vencimento_NF"));
                Date vSaidaProduto = Date.valueOf(objRsSt.getString("saida_prod"));
                Date vVencimentoProduto = Date.valueOf(objRsSt.getString("vencimento_prod"));
                String vComprador = objRsSt.getString("comprador");
                String vResponsavelEntrega = objRsSt.getString("responsavel_entrega");
                String vCpfCnpjEntrega = objRsSt.getString("cpf_cnpj_entrega");
                String vContatoEntrega = objRsSt.getString("contato_entrega");

                m.setId(vID);
                m.setDescricao(vDescricao);
                m.setNomeAbreviado(vNomeAbreviado);
                m.setChegada(String.valueOf(vChegada));
                m.setUnidMedida(vUnidMedida);
                m.setQuantidade(vQuantidade);
                m.setVlUnitario(vVlUnitario);
                m.setVlTotal(vVlTotal);
                m.setVlDesconto(vVlDesconto);
                m.setVlImposto(vVlImposto);
                m.setVlFinal(vVlFinal);
                m.setFornecedor(vFornecedor);
                m.setCodFornecedor(vCodFornecedor);
                m.setCpfcnpjFornecedor(vCpfCnpjFornecedor);
                m.setCodProdFornecedor(vCodProdFornecedor);
                m.setTipoVenda(vTipoVenda);
                m.setNumeroNF(vNumeroNF);
                m.setTipoNF(vTipoNF);
                m.setNumTipoNF(vNumTipoNF);
                m.setSerieNF(vSerieNF);
                m.setFinalidadeNF(vFinalidadeNF);
                m.setCodBarras(vCodBarras);
                m.setEmissaoNF(String.valueOf(vEmissaoNF));
                m.setVencimentoNF(String.valueOf(vVencimentoNF));
                m.setSaidaProduto(String.valueOf(vSaidaProduto));
                m.setVencimentoProd(String.valueOf(vVencimentoProduto));
                m.setComprador(vComprador);
                m.setResponsavelEntrega(vResponsavelEntrega);
                m.setCpfcnpjRespEntrega(vCpfCnpjEntrega);
                m.setContatoRespEntrega(vContatoEntrega);

                mat.add(m);
            }
            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar objetos: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        return mat;
    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(rplorcamentoMateriaisModel material) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update bd_rplorcamento.materiais set id = ?, "
                + "  descricao = ?, "
                + "  nome_abreviado = ?, "
                + "  chegada = ?, "
                + "  unid_medida = ?, "
                + "  quantidade = ?, "
                + "  vl_unitario = ?, "
                + "  vl_total = ?, "
                + "  vl_desconto = ?, "
                + "  vl_imposto = ?, "
                + "  vl_final = ?, "
                + "  fornecedor = ?, "
                + "  cod_fornecedor = ?, "
                + "  cpf_cnpj_fornecedor = ?, "
                + "  cod_produto_fornecedor = ?, "
                + "  tipo_venda = ?, "
                + "  numero_NF = ?, "
                + "  tipo_NF = ?, "
                + "  num_tipo_NF = ?, "
                + "  serie_NF = ?, "
                + "  finalidade_NF = ?, "
                + "  cod_barras = ?, "
                + "  emissao_NF = ?, "
                + "  vencimento_NF = ?, "
                + "  saida_prod = ?, "
                + "  vencimento_prod = ?, "
                + "  comprador = ?, "
                + "  responsavel_entrega = ?, "
                + "  cpf_cnpj_entrega = ?, "
                + "  contato_entrega = ? "
                + "  where id = " + material.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, material.getId());
            insereSt.setString(2, material.getDescricao());
            insereSt.setString(3, material.getNomeAbreviado());

            String data_chegada = material.getChegada();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_chegada).getTime());
            insereSt.setDate(4, data2);

            insereSt.setString(5, material.getUnidMedida());
            insereSt.setDouble(6, material.getQuantidade());
            insereSt.setDouble(7, material.getVlUnitario());
            insereSt.setDouble(8, material.getVlTotal());
            insereSt.setDouble(9, material.getVlDesconto());
            insereSt.setDouble(10, material.getVlImposto());
            insereSt.setDouble(11, material.getVlFinal());
            insereSt.setString(12, material.getFornecedor());
            insereSt.setInt(13, material.getCodFornecedor());
            insereSt.setString(14, material.getCpfcnpjFornecedor());
            insereSt.setString(15, material.getCodProdFornecedor());
            insereSt.setString(16, material.getTipoVenda());
            insereSt.setString(17, material.getNumeroNF());
            insereSt.setString(18, material.getTipoNF());
            insereSt.setString(19, material.getNumTipoNF());
            insereSt.setString(20, material.getSerieNF());
            insereSt.setString(21, material.getFinalidadeNF());
            insereSt.setString(22, material.getCodBarras());

            String data_emissao = material.getEmissaoNF();
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(data_emissao).getTime());
            insereSt.setDate(23, data3);

            String data_vencimentoNF = material.getVencimentoNF();
            DateFormat fmt4 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data4 = new java.sql.Date(fmt4.parse(data_vencimentoNF).getTime());
            insereSt.setDate(24, data4);

            String data_saida = material.getSaidaProduto();
            DateFormat fmt5 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data5 = new java.sql.Date(fmt5.parse(data_saida).getTime());
            insereSt.setDate(25, data5);

            String data_vencimentoProd = material.getVencimentoProd();
            DateFormat fmt6 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data6 = new java.sql.Date(fmt6.parse(data_vencimentoProd).getTime());
            insereSt.setDate(26, data6);

            insereSt.setString(27, material.getComprador());
            insereSt.setString(28, material.getResponsavelEntrega());
            insereSt.setString(29, material.getCpfcnpjRespEntrega());
            insereSt.setString(30, material.getContatoRespEntrega());


            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar material: " + e.getMessage());
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
    public static void excluir(rplorcamentoMateriaisModel material) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from bd_rplorcamento.materiais where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, material.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir material: " + e.getMessage() + "\n");
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
