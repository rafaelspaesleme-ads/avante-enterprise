/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.controle;

import java.text.ParseException;
import java.util.ArrayList;
import rplorcamento.modelo.rplorcamentoUsuarioModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoUsuarioControl {

    private final rplorcamentoUsuarioModel objUsuario;

    public rplorcamentoUsuarioControl() {
        this.objUsuario = new rplorcamentoUsuarioModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objUsuario.setNomeFuncionario(pLista.get(1));
        this.objUsuario.setMatriculaFuncionario(pLista.get(2));
        this.objUsuario.setNomeUsuario(pLista.get(3));
        this.objUsuario.setNivel(pLista.get(4));
        this.objUsuario.setNomeLogin(pLista.get(5));
        this.objUsuario.setSenha(pLista.get(6));
        this.objUsuario.setSituacao((pLista.get(7)));
        
        this.objUsuario.Salvar();

        return this.objUsuario.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objUsuario.setNomeFuncionario(pLista.get(1));
        this.objUsuario.setMatriculaFuncionario(pLista.get(2));
        this.objUsuario.setNomeUsuario(pLista.get(3));
        this.objUsuario.setNivel(pLista.get(4));
        this.objUsuario.setNomeLogin(pLista.get(5));
        this.objUsuario.setSenha(pLista.get(6));
        this.objUsuario.setSituacao((pLista.get(7)));
        
        this.objUsuario.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();

        vetCampos.add(String.valueOf(this.objUsuario.getId()));
        vetCampos.add(this.objUsuario.getNomeFuncionario());
        vetCampos.add(this.objUsuario.getMatriculaFuncionario());
        vetCampos.add(this.objUsuario.getNomeUsuario());
        vetCampos.add(this.objUsuario.getNivel());
        vetCampos.add(this.objUsuario.getNomeLogin());
        vetCampos.add(this.objUsuario.getSenha());
        vetCampos.add(this.objUsuario.getSituacao());

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        this.objUsuario.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }

    public void Excluir(int iChave) throws ClassNotFoundException {
        this.objUsuario.setId(iChave);
        this.objUsuario.Excluir();

    }

}
