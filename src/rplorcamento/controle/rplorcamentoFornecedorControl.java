/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.controle;

import java.text.ParseException;
import java.util.ArrayList;
import rplorcamento.modelo.rplorcamentoFornecedorModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoFornecedorControl {

    private final rplorcamentoFornecedorModel objFornecedor;

    public rplorcamentoFornecedorControl() {
        this.objFornecedor = new rplorcamentoFornecedorModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objFornecedor.setNomeRazaoSocial(pLista.get(1));
        this.objFornecedor.setCPFCNPJ(pLista.get(2));
        this.objFornecedor.setEndereco(pLista.get(3));
        this.objFornecedor.setCEP(pLista.get(4));
        this.objFornecedor.setReferencia(pLista.get(5));
        this.objFornecedor.setBairro(pLista.get(6));
        this.objFornecedor.setCidade((pLista.get(7)));
        this.objFornecedor.setUF((pLista.get(8)));
        this.objFornecedor.setRGIE(pLista.get(9));
        this.objFornecedor.setTelefone(pLista.get(10));
        this.objFornecedor.setCelular(pLista.get(11));
        this.objFornecedor.setEmail(pLista.get(12));
        this.objFornecedor.setFax(pLista.get(13));
        this.objFornecedor.setNascimento(pLista.get(14));
        this.objFornecedor.setObservacao(pLista.get(15));

        this.objFornecedor.Salvar();

        return this.objFornecedor.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        
        this.objFornecedor.setId(Integer.parseInt(pLista.get(0)));
        this.objFornecedor.setNomeRazaoSocial(pLista.get(1));
        this.objFornecedor.setCPFCNPJ(pLista.get(2));
        this.objFornecedor.setEndereco(pLista.get(3));
        this.objFornecedor.setCEP(pLista.get(4));
        this.objFornecedor.setReferencia(pLista.get(5));
        this.objFornecedor.setBairro(pLista.get(6));
        this.objFornecedor.setCidade((pLista.get(7)));
        this.objFornecedor.setUF((pLista.get(8)));
        this.objFornecedor.setRGIE(pLista.get(9));
        this.objFornecedor.setTelefone(pLista.get(10));
        this.objFornecedor.setCelular(pLista.get(11));
        this.objFornecedor.setEmail(pLista.get(12));
        this.objFornecedor.setFax(pLista.get(13));
        this.objFornecedor.setNascimento(pLista.get(14));
        this.objFornecedor.setObservacao(pLista.get(15));

        this.objFornecedor.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();

        vetCampos.add(String.valueOf(this.objFornecedor.getId()));
        vetCampos.add(this.objFornecedor.getNomeRazaoSocial());
        vetCampos.add(this.objFornecedor.getCPFCNPJ());
        vetCampos.add(this.objFornecedor.getEndereco());
        vetCampos.add(this.objFornecedor.getCEP());
        vetCampos.add(this.objFornecedor.getReferencia());
        vetCampos.add(this.objFornecedor.getBairro());
        vetCampos.add(this.objFornecedor.getCidade());
        vetCampos.add(this.objFornecedor.getUF());
        vetCampos.add(this.objFornecedor.getRGIE());
        vetCampos.add(this.objFornecedor.getTelefone());
        vetCampos.add(this.objFornecedor.getCelular());
        vetCampos.add(this.objFornecedor.getEmail());
        vetCampos.add(this.objFornecedor.getFax());
        vetCampos.add(String.valueOf(this.objFornecedor.getNascimento()));
        vetCampos.add(this.objFornecedor.getObservacao());

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        this.objFornecedor.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }

    public void Excluir(int iChave) throws ClassNotFoundException {
        this.objFornecedor.setId(iChave);
        this.objFornecedor.Excluir();

    }

}
