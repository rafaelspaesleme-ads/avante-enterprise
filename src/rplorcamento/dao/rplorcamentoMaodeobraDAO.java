/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import rplorcamento.conexao.rplorcamentoConexao;
import rplorcamento.modelo.rplorcamentoMaodeobraModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoMaodeobraDAO {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = rplorcamentoConexao.getInstance().getConnection();
        String sql = "SELECT * FROM maodeobra";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(rplorcamentoMaodeobraModel maodeobra) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into bd_rplorcamento.maodeobra values(?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, maodeobra.getId());
            insereSt.setString(2, maodeobra.getTipoProfissional());
            insereSt.setString(3, maodeobra.getTurnoTrabalho());
            insereSt.setInt(4, maodeobra.getDiasDeTrabalho());
            insereSt.setDouble(5, maodeobra.getSalarioDiario());
            insereSt.setDouble(6, maodeobra.getSalarioFinal());
            insereSt.setString(7, maodeobra.getReferencia());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar maodeobra: " + e.getMessage() + "\n");
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
    public static rplorcamentoMaodeobraModel RecuperaObjCodigo(int maodeobra) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        rplorcamentoMaodeobraModel mao = new rplorcamentoMaodeobraModel();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.maodeobra where id =" + String.valueOf(maodeobra));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                mao = new rplorcamentoMaodeobraModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vTipoProfissional = objRsSt.getString("tipo_profissional");
                String vTurnoTrabalho = objRsSt.getString("turno_trabalho");
                int vDiasDeTrabalho = Integer.parseInt(objRsSt.getString("dias_de_trabalho"));
                double vSalarioDiario = Double.parseDouble(objRsSt.getString("salario_diario"));
                double vSalarioFinal = Double.parseDouble(objRsSt.getString("salario_final"));
                String vReferencia = objRsSt.getString("referencia");

                mao.setId(vID);
                mao.setTipoProfissional(vTipoProfissional);
                mao.setTurnoTrabalho(vTurnoTrabalho);
                mao.setDiasDeTrabalho(vDiasDeTrabalho);
                mao.setSalarioDiario(vSalarioDiario);
                mao.setSalarioFinal(vSalarioFinal);
                mao.setReferencia(vReferencia);
            }

            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);

        }

        return mao;
    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do Nome
    public static List<rplorcamentoMaodeobraModel> RecuperaObjts(String maodeobra) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        List<rplorcamentoMaodeobraModel> mao = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.maodeobra where nome_funcionario like '%" + maodeobra + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                rplorcamentoMaodeobraModel m = new rplorcamentoMaodeobraModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vTipoProfissional = objRsSt.getString("tipo_profissional");
                String vTurnoTrabalho = objRsSt.getString("turno_trabalho");
                int vDiasDeTrabalho = Integer.parseInt(objRsSt.getString("dias_de_trabalho"));
                double vSalarioDiario = Double.parseDouble(objRsSt.getString("salario_diario"));
                double vSalarioFinal = Double.parseDouble(objRsSt.getString("salario_final"));
                String vReferencia = objRsSt.getString("referencia");

                m.setId(vID);
                m.setTipoProfissional(vTipoProfissional);
                m.setTurnoTrabalho(vTurnoTrabalho);
                m.setDiasDeTrabalho(vDiasDeTrabalho);
                m.setSalarioDiario(vSalarioDiario);
                m.setSalarioFinal(vSalarioFinal);
                m.setReferencia(vReferencia);

                mao.add(m);
            }
            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar objetos: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        return mao;
    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(rplorcamentoMaodeobraModel maodeobra) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update bd_rplorcamento.maodeobra set id = ?, "
                + "  tipo_profissional = ?, "
                + "  turno_trabalho = ?, "
                + "  dias_de_trabalho = ?, "
                + "  salario_diario = ?, "
                + "  salario_final = ?, "
                + "  referencia = ? "
                + "  where id = " + maodeobra.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, maodeobra.getId());
            insereSt.setString(2, maodeobra.getTipoProfissional());
            insereSt.setString(3, maodeobra.getTurnoTrabalho());
            insereSt.setInt(4, maodeobra.getDiasDeTrabalho());
            insereSt.setDouble(5, maodeobra.getSalarioDiario());
            insereSt.setDouble(6, maodeobra.getSalarioFinal());
            insereSt.setString(7, maodeobra.getReferencia());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar maodeobra: " + e.getMessage());
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
    public static void excluir(rplorcamentoMaodeobraModel maodeobra) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from bd_rplorcamento.maodeobra where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, maodeobra.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir maodeobra: " + e.getMessage() + "\n");
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
