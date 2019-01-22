/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.modelo;

import java.text.ParseException;
import rplorcamento.dao.rplorcamentoFornecedorDAO;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoFornecedorModel {

    private int id = 0;
    private String nomeRazaoSocial = "";
    private String CPFCNPJ = "";
    private String endereco = "";
    private String CEP = "";
    private String referencia = "";
    private String bairro = "";
    private String cidade = "";
    private String UF = "";
    private String RGIE = "";
    private String telefone = "";
    private String celular = "";
    private String email = "";
    private String fax = "";
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getRGIE() {
        return RGIE;
    }

    public void setRGIE(String RGIE) {
        this.RGIE = RGIE;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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
        rplorcamentoFornecedorDAO.salvar(this);
    }

    public void Atualizar() throws ParseException, ClassNotFoundException {
        rplorcamentoFornecedorDAO.atualizar(this);
    }

    public void RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        rplorcamentoFornecedorModel cityTemp = rplorcamentoFornecedorDAO.RecuperaObjCodigo(iCodigo);

        this.setId(cityTemp.getId());
        this.setNomeRazaoSocial(cityTemp.getNomeRazaoSocial());
        this.setCPFCNPJ(cityTemp.getCPFCNPJ());
        this.setEndereco(cityTemp.getEndereco());
        this.setCEP(cityTemp.getCEP());
        this.setReferencia(cityTemp.getReferencia());
        this.setBairro(cityTemp.getBairro());
        this.setCidade(cityTemp.getCidade());
        this.setUF(cityTemp.getUF());
        this.setRGIE(cityTemp.getRGIE());
        this.setTelefone(cityTemp.getTelefone());
        this.setCelular(cityTemp.getCelular());
        this.setEmail(cityTemp.getEmail());
        this.setFax(cityTemp.getFax());
        this.setNascimento(cityTemp.getNascimento());
        this.setObservacao(cityTemp.getObservacao());
    }

    public void Excluir() throws ClassNotFoundException {
        rplorcamentoFornecedorDAO.excluir(this);
    }

}
