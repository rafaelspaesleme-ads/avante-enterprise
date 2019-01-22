/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.dao;

import java.sql.Blob;
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
import rplorcamento.modelo.rplorcamentoFuncionarioModel;
import static sun.security.krb5.Confounder.bytes;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoFuncionarioDAO {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = rplorcamentoConexao.getInstance().getConnection();
        String sql = "SELECT * FROM funcionarios";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(rplorcamentoFuncionarioModel funcionario) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into bd_rplorcamento.funcionarios values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, funcionario.getId());
            insereSt.setString(2, funcionario.getNome());
            insereSt.setString(3, funcionario.getCracha());
            String data_nascimento = funcionario.getNascimento();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());
            insereSt.setDate(4, data2);
            insereSt.setString(5, funcionario.getCtps());
            insereSt.setString(6, funcionario.getPis());
            insereSt.setString(7, String.valueOf(funcionario.getId()));
            insereSt.setString(8, funcionario.getSituacao());
            insereSt.setString(9, funcionario.getRg());
            insereSt.setString(10, funcionario.getCpf());
            insereSt.setString(11, funcionario.getCargo());
            insereSt.setString(12, funcionario.getDepartamento());
            insereSt.setString(13, funcionario.getSetor());
            insereSt.setString(14, funcionario.getEndereco());
            insereSt.setString(15, funcionario.getReferencia());
            insereSt.setString(16, funcionario.getBairro());
            insereSt.setString(17, funcionario.getCidade());
            insereSt.setString(18, funcionario.getUf());
            insereSt.setString(19, funcionario.getTelefone());
            insereSt.setString(20, funcionario.getCelular());
            insereSt.setString(21, funcionario.getEmail());
            String data_admicao = funcionario.getAdmicao();
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(data_admicao).getTime());
            insereSt.setDate(22, data3);
            String data_desligamento = funcionario.getDesligamento();
            DateFormat fmt4 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data4 = new java.sql.Date(fmt4.parse(data_desligamento).getTime());
            insereSt.setDate(23, data4);
            insereSt.setString(24, funcionario.getMotivoDesligamento());
            insereSt.setString(25, funcionario.getObservacao());
            String umaString = funcionario.getFoto();
            byte[] umByteArray = umaString.getBytes();
            insereSt.setBytes(26, umByteArray);
            insereSt.setString(27, funcionario.getCaminhoFoto());
            insereSt.setInt(28, funcionario.getAcessoSistema());
            insereSt.setInt(29, funcionario.getRecebeSalario());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar funcionario: " + e.getMessage() + "\n");
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
    public static rplorcamentoFuncionarioModel RecuperaObjCodigo(int funcionario) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        rplorcamentoFuncionarioModel fun = new rplorcamentoFuncionarioModel();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.funcionarios where id =" + String.valueOf(funcionario));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                fun = new rplorcamentoFuncionarioModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNome = objRsSt.getString("nome");
                String vCracha = objRsSt.getString("cracha");
                Date vNascimento = Date.valueOf(objRsSt.getString("nascimento"));
                String vCtps = objRsSt.getString("ctps");
                String vPis = objRsSt.getString("pis");
                String vMatricula = objRsSt.getString("matricula");
                String vSituacao = objRsSt.getString("situacao");
                String vRg = objRsSt.getString("rg");
                String vCpf = objRsSt.getString("cpf");
                String vCargo = objRsSt.getString("cargo");
                String vDepartamento = objRsSt.getString("departamento");
                String vSetor = objRsSt.getString("setor");
                String vEndereco = objRsSt.getString("endereco");
                String vReferencia = objRsSt.getString("referencia");
                String vBairro = objRsSt.getString("bairro");
                String vCidade = objRsSt.getString("cidade");
                String vUf = objRsSt.getString("uf");
                String vTelefone = objRsSt.getString("telefone");
                String vCelular = objRsSt.getString("celular");
                String vEmail = objRsSt.getString("email");
                Date vAdmicao = Date.valueOf(objRsSt.getString("admicao"));
                Date vDesligamento = Date.valueOf(objRsSt.getString("desligamento"));
                String vMotivoDesligamento = objRsSt.getString("motivo_desligamento");
                String vObservacao = objRsSt.getString("observacao");
                Byte vFoto = Byte.parseByte(objRsSt.getString("foto"));
                String vCaminhoFoto = objRsSt.getString("caminho_foto");
                int vAcessoSistema = Integer.parseInt(objRsSt.getString("acesso_sistema"));
                int vRecebeSalario = Integer.parseInt(objRsSt.getString("recebe_salario"));

                fun.setId(vID);
                fun.setNome(vNome);
                fun.setCracha(vCracha);
                fun.setNascimento(String.valueOf(vNascimento));
                fun.setCtps(vCtps);
                fun.setPis(vPis);
                fun.setMatricula(vMatricula);
                fun.setSituacao(vSituacao);
                fun.setRg(vRg);
                fun.setCpf(vCpf);
                fun.setCargo(vCargo);
                fun.setDepartamento(vDepartamento);
                fun.setSetor(vSetor);
                fun.setEndereco(vEndereco);
                fun.setReferencia(vReferencia);
                fun.setBairro(vBairro);
                fun.setCidade(vCidade);
                fun.setUf(vUf);
                fun.setTelefone(vTelefone);
                fun.setCelular(vCelular);
                fun.setEmail(vEmail);
                fun.setAdmicao(String.valueOf(vAdmicao));
                fun.setDesligamento(String.valueOf(vDesligamento));
                fun.setMotivoDesligamento(vMotivoDesligamento);
                fun.setObservacao(vObservacao);
                fun.setFoto(String.valueOf(vFoto));
                fun.setCaminhoFoto(vCaminhoFoto);
                fun.setAcessoSistema(vAcessoSistema);
                fun.setRecebeSalario(vRecebeSalario);

            }

            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);

        }

        return fun;
    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do Nome
    public static List<rplorcamentoFuncionarioModel> RecuperaObjts(String funcionario) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        List<rplorcamentoFuncionarioModel> fun = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from bd_rplorcamento.funcionarios where nome like '%" + funcionario + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                rplorcamentoFuncionarioModel c = new rplorcamentoFuncionarioModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNome = objRsSt.getString("nome");
                String vCracha = objRsSt.getString("cracha");
                Date vNascimento = Date.valueOf(objRsSt.getString("nascimento"));
                String vCtps = objRsSt.getString("ctps");
                String vPis = objRsSt.getString("pis");
                String vMatricula = objRsSt.getString("matricula");
                String vSituacao = objRsSt.getString("situacao");
                String vRg = objRsSt.getString("rg");
                String vCpf = objRsSt.getString("cpf");
                String vCargo = objRsSt.getString("cargo");
                String vDepartamento = objRsSt.getString("departamento");
                String vSetor = objRsSt.getString("setor");
                String vEndereco = objRsSt.getString("endereco");
                String vReferencia = objRsSt.getString("referencia");
                String vBairro = objRsSt.getString("bairro");
                String vCidade = objRsSt.getString("cidade");
                String vUf = objRsSt.getString("uf");
                String vTelefone = objRsSt.getString("telefone");
                String vCelular = objRsSt.getString("celular");
                String vEmail = objRsSt.getString("email");
                Date vAdmicao = Date.valueOf(objRsSt.getString("admicao"));
                Date vDesligamento = Date.valueOf(objRsSt.getString("desligamento"));
                String vMotivoDesligamento = objRsSt.getString("motivo_desligamento");
                String vObservacao = objRsSt.getString("observacao");
                Byte vFoto = Byte.parseByte(objRsSt.getString("foto"));
                String vCaminhoFoto = objRsSt.getString("caminho_foto");
                int vAcessoSistema = Integer.parseInt(objRsSt.getString("acesso_sistema"));
                int vRecebeSalario = Integer.parseInt(objRsSt.getString("recebe_salario"));

                c.setId(vID);
                c.setNome(vNome);
                c.setCracha(vCracha);
                c.setNascimento(String.valueOf(vNascimento));
                c.setCtps(vCtps);
                c.setPis(vPis);
                c.setMatricula(vMatricula);
                c.setSituacao(vSituacao);
                c.setRg(vRg);
                c.setCpf(vCpf);
                c.setCargo(vCargo);
                c.setDepartamento(vDepartamento);
                c.setSetor(vSetor);
                c.setEndereco(vEndereco);
                c.setReferencia(vReferencia);
                c.setBairro(vBairro);
                c.setCidade(vCidade);
                c.setUf(vUf);
                c.setTelefone(vTelefone);
                c.setCelular(vCelular);
                c.setEmail(vEmail);
                c.setAdmicao(String.valueOf(vAdmicao));
                c.setDesligamento(String.valueOf(vDesligamento));
                c.setMotivoDesligamento(vMotivoDesligamento);
                c.setObservacao(vObservacao);
                c.setFoto(String.valueOf(vFoto));
                c.setCaminhoFoto(vCaminhoFoto);
                c.setAcessoSistema(vAcessoSistema);
                c.setRecebeSalario(vRecebeSalario);

                fun.add(c);
            }
            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar objetos: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        return fun;
    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(rplorcamentoFuncionarioModel funcionario) throws ParseException, ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update bd_rplorcamento.funcionarios set id = ?, "
                + "  nome = ?, "
                + "  cracha = ?, "
                + "  nascimento = ?, "
                + "  ctps = ?, "
                + "  pis = ?, "
                + "  matricula = ?, "
                + "  situacao = ?, "
                + "  rg = ?, "
                + "  cpf = ?, "
                + "  cargo = ?, "
                + "  departamento = ?, "
                + "  setor = ?, "
                + "  endereco = ?, "
                + "  referencia = ?, "
                + "  bairro = ?, "
                + "  cidade = ?, "
                + "  uf = ?, "
                + "  telefone = ?, "
                + "  celular = ?, "
                + "  email = ?, "
                + "  admicao = ?, "
                + "  desligamento = ?, "
                + "  motivo_desligamento = ?, "
                + "  observacao = ?, "
                + "  foto = ?, "
                + "  caminho_foto = ?, "
                + "  acesso_sistema = ?, "
                + "  recebe_salario = ? "
                + "  where id = " + funcionario.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, funcionario.getId());
            insereSt.setString(2, funcionario.getNome());
            insereSt.setString(3, funcionario.getCracha());
            String data_nascimento = funcionario.getNascimento();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());
            insereSt.setDate(4, data2);
            insereSt.setString(5, funcionario.getCtps());
            insereSt.setString(6, funcionario.getPis());
            insereSt.setString(7, funcionario.getMatricula());
            insereSt.setString(8, funcionario.getSituacao());
            insereSt.setString(9, funcionario.getRg());
            insereSt.setString(10, funcionario.getCpf());
            insereSt.setString(11, funcionario.getCargo());
            insereSt.setString(12, funcionario.getDepartamento());
            insereSt.setString(13, funcionario.getSetor());
            insereSt.setString(14, funcionario.getEndereco());
            insereSt.setString(15, funcionario.getReferencia());
            insereSt.setString(16, funcionario.getBairro());
            insereSt.setString(17, funcionario.getCidade());
            insereSt.setString(18, funcionario.getUf());
            insereSt.setString(19, funcionario.getTelefone());
            insereSt.setString(20, funcionario.getCelular());
            insereSt.setString(21, funcionario.getEmail());
            String data_admicao = funcionario.getAdmicao();
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(data_admicao).getTime());
            insereSt.setDate(22, data3);
            String data_desligamento = funcionario.getDesligamento();
            DateFormat fmt4 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data4 = new java.sql.Date(fmt4.parse(data_desligamento).getTime());
            insereSt.setDate(23, data4);
            insereSt.setString(24, funcionario.getMotivoDesligamento());
            insereSt.setString(25, funcionario.getObservacao());
            insereSt.setString(26, funcionario.getFoto());
            insereSt.setString(27, funcionario.getCaminhoFoto());
            insereSt.setInt(28, funcionario.getAcessoSistema());
            insereSt.setInt(29, funcionario.getRecebeSalario());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar funcionario: " + e.getMessage());
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
    public static void excluir(rplorcamentoFuncionarioModel funcionario) throws ClassNotFoundException {
        Connection cnx = rplorcamentoConexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from bd_rplorcamento.funcionarios where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, funcionario.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionario: " + e.getMessage() + "\n");
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
