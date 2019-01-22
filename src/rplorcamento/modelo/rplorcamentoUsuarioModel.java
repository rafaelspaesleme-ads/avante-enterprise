/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.modelo;

import java.text.ParseException;
import rplorcamento.dao.rplorcamentoUsuarioDAO;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoUsuarioModel {

    private int id = 0;
    private String nomeFuncionario = "";
    private String matriculaFuncionario = "";
    private String nomeUsuario = "";
    private String nivel = "";
    private String nomeLogin = "";
    private String senha = "";
    private String situacao = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void Salvar() throws ParseException, ClassNotFoundException {
        rplorcamentoUsuarioDAO.salvar(this);
    }

    public void Atualizar() throws ParseException, ClassNotFoundException {
        rplorcamentoUsuarioDAO.atualizar(this);
    }

    public void RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        rplorcamentoUsuarioModel cityTemp = rplorcamentoUsuarioDAO.RecuperaObjCodigo(iCodigo);
        this.setId(cityTemp.getId());
        this.setNomeFuncionario(cityTemp.getNomeFuncionario());
        this.setMatriculaFuncionario(cityTemp.getMatriculaFuncionario());
        this.setNomeUsuario(cityTemp.getNomeUsuario());
        this.setNivel(cityTemp.getNivel());
        this.setNomeLogin(cityTemp.getNomeLogin());
        this.setSenha(cityTemp.getSenha());
        this.setSituacao(cityTemp.getSituacao());
    }

    public void Excluir() throws ClassNotFoundException {
        rplorcamentoUsuarioDAO.excluir(this);
    }

}
