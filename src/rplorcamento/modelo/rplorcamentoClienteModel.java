/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.modelo;

import java.text.ParseException;
import rplorcamento.dao.rplorcamentoClienteDAO;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoClienteModel {

    private int id = 0;
    private String nomeRazaoSocial = "";
    private String RGIE = "";
    private String nomeFantasiaApelido = "";
    private String CPFCNPJ = "";
    private String endereco = "";
    private String bairro = "";
    private String cidade = "";
    private String CEP = "";
    private String UF = "";
    private String telefone = "";
    private String celular = "";
    private String email = "";
    private String referencia = "";
    private String nascimento = "";
    private String observacao = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public String getRGIE() {
        return RGIE;
    }

    public void setRGIE(String RGIE) {
        this.RGIE = RGIE;
    }

    public String getNomeFantasiaApelido() {
        return nomeFantasiaApelido;
    }

    public void setNomeFantasiaApelido(String nomeFantasiaApelido) {
        this.nomeFantasiaApelido = nomeFantasiaApelido;
    }

    public String getCPFCNPJ() {
        return CPFCNPJ;
    }

    public void setCPFCNPJ(String CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void Salvar() throws ParseException, ClassNotFoundException {
        rplorcamentoClienteDAO.salvar(this);
    }

    public void Atualizar() throws ParseException, ClassNotFoundException {
        rplorcamentoClienteDAO.atualizar(this);
    }
    
    public void RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        rplorcamentoClienteModel cityTemp = rplorcamentoClienteDAO.RecuperaObjCodigo(iCodigo);
        this.setId(cityTemp.getId());
        this.setNomeRazaoSocial(cityTemp.getNomeRazaoSocial());
        this.setRGIE(cityTemp.getRGIE());
        this.setNomeFantasiaApelido(cityTemp.getNomeFantasiaApelido());
        this.setCPFCNPJ(cityTemp.getCPFCNPJ());
        this.setEndereco(cityTemp.getEndereco());
        this.setBairro(cityTemp.getBairro());
        this.setCidade(cityTemp.getCidade());
        this.setCEP(cityTemp.getCEP());
        this.setUF(cityTemp.getUF());
        this.setTelefone(cityTemp.getTelefone());
        this.setCelular(cityTemp.getCelular());
        this.setEmail(cityTemp.getEmail());
        this.setReferencia(cityTemp.getReferencia());
        this.setNascimento(cityTemp.getNascimento());
        this.setObservacao(cityTemp.getObservacao());
    }

    public void Excluir() throws ClassNotFoundException {
        rplorcamentoClienteDAO.excluir(this);
    }

}
