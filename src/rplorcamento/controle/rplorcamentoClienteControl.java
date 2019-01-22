/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.controle;

import java.text.ParseException;
import java.util.ArrayList;
import rplorcamento.modelo.rplorcamentoClienteModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoClienteControl {

    private final rplorcamentoClienteModel objCliente;

    public rplorcamentoClienteControl() {
        this.objCliente = new rplorcamentoClienteModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objCliente.setNomeRazaoSocial(pLista.get(1));
        this.objCliente.setRGIE(pLista.get(2));
        this.objCliente.setNomeFantasiaApelido(pLista.get(3));
        this.objCliente.setCPFCNPJ(pLista.get(4));
        this.objCliente.setEndereco(pLista.get(5));
        this.objCliente.setBairro(pLista.get(6));
        this.objCliente.setCidade((pLista.get(7)));
        this.objCliente.setCEP(pLista.get(8));
        this.objCliente.setUF((pLista.get(9)));
        this.objCliente.setTelefone(pLista.get(10));
        this.objCliente.setCelular(pLista.get(11));
        this.objCliente.setEmail(pLista.get(12));
        this.objCliente.setReferencia(pLista.get(13));
        this.objCliente.setNascimento(pLista.get(14));
        this.objCliente.setObservacao(pLista.get(15));

        this.objCliente.Salvar();

        return this.objCliente.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        
        this.objCliente.setId(Integer.parseInt(pLista.get(0)));
        this.objCliente.setNomeRazaoSocial(pLista.get(1));
        this.objCliente.setRGIE(pLista.get(2));
        this.objCliente.setNomeFantasiaApelido(pLista.get(3));
        this.objCliente.setCPFCNPJ(pLista.get(4));
        this.objCliente.setEndereco(pLista.get(5));
        this.objCliente.setBairro(pLista.get(6));
        this.objCliente.setCidade((pLista.get(7)));
        this.objCliente.setCEP(pLista.get(8));
        this.objCliente.setUF((pLista.get(9)));
        this.objCliente.setTelefone(pLista.get(10));
        this.objCliente.setCelular(pLista.get(11));
        this.objCliente.setEmail(pLista.get(12));
        this.objCliente.setReferencia(pLista.get(13));
        this.objCliente.setNascimento(pLista.get(14));
        this.objCliente.setObservacao(pLista.get(15));

        this.objCliente.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();

        vetCampos.add(String.valueOf(this.objCliente.getId()));
        vetCampos.add(this.objCliente.getNomeRazaoSocial());
        vetCampos.add(this.objCliente.getRGIE());
        vetCampos.add(this.objCliente.getNomeFantasiaApelido());
        vetCampos.add(this.objCliente.getCPFCNPJ());
        vetCampos.add(this.objCliente.getEndereco());
        vetCampos.add(this.objCliente.getBairro());
        vetCampos.add(this.objCliente.getCidade());
        vetCampos.add(this.objCliente.getCEP());
        vetCampos.add(this.objCliente.getUF());
        vetCampos.add(this.objCliente.getTelefone());
        vetCampos.add(this.objCliente.getCelular());
        vetCampos.add(this.objCliente.getEmail());
        vetCampos.add(this.objCliente.getReferencia());
        vetCampos.add(String.valueOf(this.objCliente.getNascimento()));
        vetCampos.add(this.objCliente.getObservacao());

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        this.objCliente.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }

    public void Excluir(int iChave) throws ClassNotFoundException {
        this.objCliente.setId(iChave);
        this.objCliente.Excluir();

    }

}
