/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.modelo;

import java.text.ParseException;
import rplorcamento.dao.rplorcamentoMateriaisDAO;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoMateriaisModel {

    private int id = 0;
    private String descricao = "";
    private String nomeAbreviado = "";
    private String chegada = "";
    private String unidMedida = "";
    private double quantidade = 0.0;
    private double vlUnitario = 0.00;
    private double vlTotal = 0.00;
    private double vlDesconto = 0.00;
    private double vlImposto = 0.00;
    private double vlFinal = 0.00;
    private String fornecedor = "";
    private int codFornecedor = 0;
    private String cpfcnpjFornecedor = "";
    private String codProdFornecedor = "";
    private String tipoVenda = "";
    private String numeroNF = "";
    private String tipoNF = "";
    private String numTipoNF = "";
    private String serieNF = "";
    private String finalidadeNF = "";
    private String codBarras = "";
    private String emissaoNF = "";
    private String vencimentoNF = "";
    private String saidaProduto = "";
    private String vencimentoProd = "";
    private String comprador = "";
    private String responsavelEntrega = "";
    private String cpfcnpjRespEntrega = "";
    private String contatoRespEntrega = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeAbreviado() {
        return nomeAbreviado;
    }

    public void setNomeAbreviado(String nomeAbreviado) {
        this.nomeAbreviado = nomeAbreviado;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getUnidMedida() {
        return unidMedida;
    }

    public void setUnidMedida(String unidMedida) {
        this.unidMedida = unidMedida;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlImposto() {
        return vlImposto;
    }

    public void setVlImposto(double vlImposto) {
        this.vlImposto = vlImposto;
    }

    public double getVlFinal() {
        return vlFinal;
    }

    public void setVlFinal(double vlFinal) {
        this.vlFinal = vlFinal;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getCpfcnpjFornecedor() {
        return cpfcnpjFornecedor;
    }

    public void setCpfcnpjFornecedor(String cpfcnpjFornecedor) {
        this.cpfcnpjFornecedor = cpfcnpjFornecedor;
    }

    public String getCodProdFornecedor() {
        return codProdFornecedor;
    }

    public void setCodProdFornecedor(String codProdFornecedor) {
        this.codProdFornecedor = codProdFornecedor;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
    }

    public String getNumTipoNF() {
        return numTipoNF;
    }

    public void setNumTipoNF(String numTipoNF) {
        this.numTipoNF = numTipoNF;
    }

    public String getSerieNF() {
        return serieNF;
    }

    public void setSerieNF(String serieNF) {
        this.serieNF = serieNF;
    }

    public String getFinalidadeNF() {
        return finalidadeNF;
    }

    public void setFinalidadeNF(String finalidadeNF) {
        this.finalidadeNF = finalidadeNF;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getEmissaoNF() {
        return emissaoNF;
    }

    public void setEmissaoNF(String emissaoNF) {
        this.emissaoNF = emissaoNF;
    }

    public String getVencimentoNF() {
        return vencimentoNF;
    }

    public void setVencimentoNF(String vencimentoNF) {
        this.vencimentoNF = vencimentoNF;
    }

    public String getSaidaProduto() {
        return saidaProduto;
    }

    public void setSaidaProduto(String saidaProduto) {
        this.saidaProduto = saidaProduto;
    }

    public String getVencimentoProd() {
        return vencimentoProd;
    }

    public void setVencimentoProd(String vencimentoProd) {
        this.vencimentoProd = vencimentoProd;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getResponsavelEntrega() {
        return responsavelEntrega;
    }

    public void setResponsavelEntrega(String responsavelEntrega) {
        this.responsavelEntrega = responsavelEntrega;
    }

    public String getCpfcnpjRespEntrega() {
        return cpfcnpjRespEntrega;
    }

    public void setCpfcnpjRespEntrega(String cpfcnpjRespEntrega) {
        this.cpfcnpjRespEntrega = cpfcnpjRespEntrega;
    }

    public String getContatoRespEntrega() {
        return contatoRespEntrega;
    }

    public void setContatoRespEntrega(String contatoRespEntrega) {
        this.contatoRespEntrega = contatoRespEntrega;
    }
    
    
    public void Salvar() throws ParseException, ClassNotFoundException {
        rplorcamentoMateriaisDAO.salvar(this);
    }

    public void Atualizar() throws ParseException, ClassNotFoundException {
        rplorcamentoMateriaisDAO.atualizar(this);
    }
    
    public void RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        rplorcamentoMateriaisModel cityTemp = rplorcamentoMateriaisDAO.RecuperaObjCodigo(iCodigo);
        this.setId(cityTemp.getId());
        this.setDescricao(cityTemp.getDescricao());
        this.setChegada(cityTemp.getChegada());
        this.setUnidMedida(cityTemp.getUnidMedida());
        this.setQuantidade(cityTemp.getQuantidade());
        this.setVlUnitario(cityTemp.getVlUnitario());
        this.setVlTotal(cityTemp.getVlTotal());
        this.setVlDesconto(cityTemp.getVlDesconto());
        this.setVlImposto(cityTemp.getVlImposto());
        this.setVlFinal(cityTemp.getVlFinal());
        this.setFornecedor(cityTemp.getFornecedor());
        this.setCodFornecedor(cityTemp.getCodFornecedor());
        this.setCpfcnpjFornecedor(cityTemp.getCpfcnpjFornecedor());
        this.setCodProdFornecedor(cityTemp.getCodProdFornecedor());
        this.setTipoVenda(cityTemp.getTipoVenda());
        this.setNumeroNF(cityTemp.getNumeroNF());
        this.setTipoNF(cityTemp.getTipoNF());
        this.setNumTipoNF(cityTemp.getNumTipoNF());
        this.setSerieNF(cityTemp.getSerieNF());
        this.setFinalidadeNF(cityTemp.getFinalidadeNF());
        this.setCodBarras(cityTemp.getCodBarras());
        this.setEmissaoNF(cityTemp.getEmissaoNF());
        this.setVencimentoNF(cityTemp.getVencimentoNF());
        this.setSaidaProduto(cityTemp.getSaidaProduto());
        this.setVencimentoProd(cityTemp.getVencimentoProd());
        this.setComprador(cityTemp.getComprador());
        this.setResponsavelEntrega(cityTemp.getResponsavelEntrega());
        this.setCpfcnpjRespEntrega(cityTemp.getCpfcnpjRespEntrega());
        this.setContatoRespEntrega(cityTemp.getContatoRespEntrega());
        
    }

    public void Excluir() throws ClassNotFoundException {
        rplorcamentoMateriaisDAO.excluir(this);
    }

    
    
}
