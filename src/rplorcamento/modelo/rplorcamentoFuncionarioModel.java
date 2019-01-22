/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.modelo;

import java.text.ParseException;
import rplorcamento.dao.rplorcamentoFuncionarioDAO;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoFuncionarioModel {

    private int id = 0;
    private String nome = "";
    private String cracha = "";
    private String nascimento = "";
    private String ctps = "";
    private String pis = "";
    private String matricula = "";
    private String situacao = "";
    private String rg = "";
    private String cpf = "";
    private String cargo = "";
    private String departamento = "";
    private String setor = "";
    private String endereco = "";
    private String referencia = "";
    private String bairro = "";
    private String cidade = "";
    private String uf = "";
    private String telefone = "";
    private String celular = "";
    private String email = "";
    private String admicao = "";
    private String desligamento = "";
    private String motivoDesligamento = "";
    private String observacao = "";
    private String foto = "";
    private String caminhoFoto = "";
    private int acessoSistema = 0;
    private int recebeSalario = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public String getAdmicao() {
        return admicao;
    }

    public void setAdmicao(String admicao) {
        this.admicao = admicao;
    }

    public String getDesligamento() {
        return desligamento;
    }

    public void setDesligamento(String desligamento) {
        this.desligamento = desligamento;
    }

    public String getMotivoDesligamento() {
        return motivoDesligamento;
    }

    public void setMotivoDesligamento(String motivoDesligamento) {
        this.motivoDesligamento = motivoDesligamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public int getAcessoSistema() {
        return acessoSistema;
    }

    public void setAcessoSistema(int acessoSistema) {
        this.acessoSistema = acessoSistema;
    }

    public int getRecebeSalario() {
        return recebeSalario;
    }

    public void setRecebeSalario(int recebeSalario) {
        this.recebeSalario = recebeSalario;
    }

    public void Salvar() throws ParseException, ClassNotFoundException {
        rplorcamentoFuncionarioDAO.salvar(this);
    }

    public void Atualizar() throws ParseException, ClassNotFoundException {
        rplorcamentoFuncionarioDAO.atualizar(this);
    }

    public void RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        rplorcamentoFuncionarioModel cityTemp = rplorcamentoFuncionarioDAO.RecuperaObjCodigo(iCodigo);

        this.setId(cityTemp.getId());
        this.setNome(cityTemp.getNome());
        this.setCracha(cityTemp.getCracha());
        this.setNascimento(cityTemp.getNascimento());
        this.setCtps(cityTemp.getCtps());
        this.setPis(cityTemp.getPis());
        this.setMatricula(cityTemp.getMatricula());
        this.setSituacao(cityTemp.getSituacao());
        this.setRg(cityTemp.getRg());
        this.setCpf(cityTemp.getCpf());
        this.setCargo(cityTemp.getCargo());
        this.setDepartamento(cityTemp.getDepartamento());
        this.setSetor(cityTemp.getSetor());
        this.setEndereco(cityTemp.getEndereco());
        this.setReferencia(cityTemp.getReferencia());
        this.setBairro(cityTemp.getBairro());
        this.setCidade(cityTemp.getCidade());
        this.setUf(cityTemp.getUf());
        this.setTelefone(cityTemp.getTelefone());
        this.setCelular(cityTemp.getCelular());
        this.setEmail(cityTemp.getEmail());
        this.setAdmicao(cityTemp.getAdmicao());
        this.setDesligamento(cityTemp.getDesligamento());
        this.setObservacao(cityTemp.getObservacao());
        this.setFoto(cityTemp.getFoto());
        this.setCaminhoFoto(cityTemp.getCaminhoFoto());
        this.setAcessoSistema(cityTemp.getAcessoSistema());
        this.setRecebeSalario(cityTemp.getRecebeSalario());
        
    }

    public void Excluir() throws ClassNotFoundException {
        rplorcamentoFuncionarioDAO.excluir(this);
    }

}
