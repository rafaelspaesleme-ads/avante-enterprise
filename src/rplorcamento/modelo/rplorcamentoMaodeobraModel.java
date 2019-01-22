/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.modelo;

import java.text.ParseException;
import rplorcamento.dao.rplorcamentoMaodeobraDAO;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoMaodeobraModel {

    private int id = 0;
    private String tipoProfissional = "";
    private String turnoTrabalho = "";
    private int diasDeTrabalho = 0;
    private double salarioDiario = 0.0;
    private double salarioFinal = 0.0;
    private String referencia = "";

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoProfissional() {
        return tipoProfissional;
    }

    public void setTipoProfissional(String tipoProfissional) {
        this.tipoProfissional = tipoProfissional;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }



    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void Salvar() throws ParseException, ClassNotFoundException {
        rplorcamentoMaodeobraDAO.salvar(this);
    }

    public void Atualizar() throws ParseException, ClassNotFoundException {
        rplorcamentoMaodeobraDAO.atualizar(this);
    }

    public void RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        rplorcamentoMaodeobraModel cityTemp = rplorcamentoMaodeobraDAO.RecuperaObjCodigo(iCodigo);
        this.setId(cityTemp.getId());
        this.setTipoProfissional(cityTemp.getTipoProfissional());
        this.setTurnoTrabalho(cityTemp.getTurnoTrabalho());
        this.setDiasDeTrabalho(cityTemp.getDiasDeTrabalho());
        this.setSalarioDiario(cityTemp.getSalarioDiario());
        this.setSalarioFinal(cityTemp.getSalarioFinal());
        this.setReferencia(cityTemp.getReferencia());
    }

    public void Excluir() throws ClassNotFoundException {
        rplorcamentoMaodeobraDAO.excluir(this);
    }

    public int getDiasDeTrabalho() {
        return diasDeTrabalho;
    }

    public void setDiasDeTrabalho(int diasDeTrabalho) {
        this.diasDeTrabalho = diasDeTrabalho;
    }

    public double getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(double salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

}
