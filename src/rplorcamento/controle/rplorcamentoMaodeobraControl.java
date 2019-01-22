/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.controle;

import java.text.ParseException;
import java.util.ArrayList;
import rplorcamento.modelo.rplorcamentoMaodeobraModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoMaodeobraControl {

    private final rplorcamentoMaodeobraModel objMaodeobra;

    public rplorcamentoMaodeobraControl() {
        this.objMaodeobra = new rplorcamentoMaodeobraModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objMaodeobra.setTipoProfissional(pLista.get(1));
        this.objMaodeobra.setTurnoTrabalho(pLista.get(2));
        this.objMaodeobra.setDiasDeTrabalho(Integer.parseInt(pLista.get(3)));
        this.objMaodeobra.setSalarioDiario(Double.parseDouble(pLista.get(4)));
        this.objMaodeobra.setSalarioFinal(Double.parseDouble(pLista.get(5)));
        this.objMaodeobra.setReferencia(pLista.get(6));

        this.objMaodeobra.Salvar();

        return this.objMaodeobra.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objMaodeobra.setTipoProfissional(pLista.get(1));
        this.objMaodeobra.setTurnoTrabalho(pLista.get(2));
        this.objMaodeobra.setDiasDeTrabalho(Integer.parseInt(pLista.get(3)));
        this.objMaodeobra.setSalarioDiario(Double.parseDouble(pLista.get(4)));
        this.objMaodeobra.setSalarioFinal(Double.parseDouble(pLista.get(5)));
        this.objMaodeobra.setReferencia(pLista.get(6));

        this.objMaodeobra.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();

        vetCampos.add(String.valueOf(this.objMaodeobra.getId()));
        vetCampos.add(this.objMaodeobra.getTipoProfissional());
        vetCampos.add(this.objMaodeobra.getTurnoTrabalho());
        vetCampos.add(String.valueOf(this.objMaodeobra.getDiasDeTrabalho()));
        vetCampos.add(String.valueOf(this.objMaodeobra.getSalarioDiario()));
        vetCampos.add(String.valueOf(this.objMaodeobra.getSalarioFinal()));
        vetCampos.add(this.objMaodeobra.getReferencia());

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        this.objMaodeobra.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }

    public void Excluir(int iChave) throws ClassNotFoundException {
        this.objMaodeobra.setId(iChave);
        this.objMaodeobra.Excluir();

    }

}
