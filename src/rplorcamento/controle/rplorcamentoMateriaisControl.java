/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.controle;

import java.text.ParseException;
import java.util.ArrayList;
import rplorcamento.modelo.rplorcamentoMateriaisModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoMateriaisControl {
    
        private final rplorcamentoMateriaisModel objMateriais;

    public rplorcamentoMateriaisControl() {
        this.objMateriais = new rplorcamentoMateriaisModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        
        this.objMateriais.setDescricao(pLista.get(1));
        this.objMateriais.setNomeAbreviado(pLista.get(2));
        this.objMateriais.setChegada(pLista.get(3));
        this.objMateriais.setUnidMedida(pLista.get(4));
        this.objMateriais.setQuantidade(Double.parseDouble(pLista.get(5)));
        this.objMateriais.setVlUnitario(Double.parseDouble(pLista.get(6)));
        this.objMateriais.setVlTotal(Double.parseDouble(pLista.get(7)));
        this.objMateriais.setVlDesconto(Double.parseDouble(pLista.get(8)));
        this.objMateriais.setVlImposto(Double.parseDouble(pLista.get(9)));
        this.objMateriais.setVlFinal(Double.parseDouble(pLista.get(10)));
        this.objMateriais.setFornecedor(pLista.get(11));
        this.objMateriais.setCodFornecedor(Integer.parseInt(pLista.get(12)));
        this.objMateriais.setCpfcnpjFornecedor(pLista.get(13));
        this.objMateriais.setCodProdFornecedor(pLista.get(14));
        this.objMateriais.setTipoVenda(pLista.get(15));
        this.objMateriais.setNumeroNF(pLista.get(16));
        this.objMateriais.setTipoNF(pLista.get(17));
        this.objMateriais.setNumTipoNF(pLista.get(18));
        this.objMateriais.setSerieNF(pLista.get(19));
        this.objMateriais.setFinalidadeNF(pLista.get(20));
        this.objMateriais.setCodBarras(pLista.get(21));
        this.objMateriais.setEmissaoNF(pLista.get(22));
        this.objMateriais.setVencimentoNF(pLista.get(23));
        this.objMateriais.setSaidaProduto(pLista.get(24));
        this.objMateriais.setVencimentoProd(pLista.get(25));
        this.objMateriais.setComprador(pLista.get(26));
        this.objMateriais.setResponsavelEntrega(pLista.get(27));
        this.objMateriais.setCpfcnpjRespEntrega(pLista.get(28));
        this.objMateriais.setContatoRespEntrega(pLista.get(29));

        this.objMateriais.Salvar();

        return this.objMateriais.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objMateriais.setId(Integer.parseInt(pLista.get(0)));
        this.objMateriais.setDescricao(pLista.get(1));
        this.objMateriais.setNomeAbreviado(pLista.get(2));
        this.objMateriais.setChegada(pLista.get(3));
        this.objMateriais.setUnidMedida(pLista.get(4));
        this.objMateriais.setQuantidade(Double.parseDouble(pLista.get(5)));
        this.objMateriais.setVlUnitario(Double.parseDouble(pLista.get(6)));
        this.objMateriais.setVlTotal(Double.parseDouble(pLista.get(7)));
        this.objMateriais.setVlDesconto(Double.parseDouble(pLista.get(8)));
        this.objMateriais.setVlImposto(Double.parseDouble(pLista.get(9)));
        this.objMateriais.setVlFinal(Double.parseDouble(pLista.get(10)));
        this.objMateriais.setFornecedor(pLista.get(11));
        this.objMateriais.setCodFornecedor(Integer.parseInt(pLista.get(12)));
        this.objMateriais.setCpfcnpjFornecedor(pLista.get(13));
        this.objMateriais.setCodProdFornecedor(pLista.get(14));
        this.objMateriais.setTipoVenda(pLista.get(15));
        this.objMateriais.setNumeroNF(pLista.get(16));
        this.objMateriais.setTipoNF(pLista.get(17));
        this.objMateriais.setNumTipoNF(pLista.get(18));
        this.objMateriais.setSerieNF(pLista.get(19));
        this.objMateriais.setFinalidadeNF(pLista.get(20));
        this.objMateriais.setCodBarras(pLista.get(21));
        this.objMateriais.setEmissaoNF(pLista.get(22));
        this.objMateriais.setVencimentoNF(pLista.get(23));
        this.objMateriais.setSaidaProduto(pLista.get(24));
        this.objMateriais.setVencimentoProd(pLista.get(25));
        this.objMateriais.setComprador(pLista.get(26));
        this.objMateriais.setResponsavelEntrega(pLista.get(27));
        this.objMateriais.setCpfcnpjRespEntrega(pLista.get(28));
        this.objMateriais.setContatoRespEntrega(pLista.get(29));

        this.objMateriais.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();

        vetCampos.add(String.valueOf(this.objMateriais.getId()));
        vetCampos.add(this.objMateriais.getDescricao());
        vetCampos.add(this.objMateriais.getNomeAbreviado());
        vetCampos.add(this.objMateriais.getChegada());
        vetCampos.add(this.objMateriais.getUnidMedida());
        vetCampos.add(String.valueOf(this.objMateriais.getQuantidade()));
        vetCampos.add(String.valueOf(this.objMateriais.getVlUnitario()));
        vetCampos.add(String.valueOf(this.objMateriais.getVlTotal()));
        vetCampos.add(String.valueOf(this.objMateriais.getVlDesconto()));
        vetCampos.add(String.valueOf(this.objMateriais.getVlImposto()));
        vetCampos.add(String.valueOf(this.objMateriais.getVlFinal()));
        vetCampos.add(this.objMateriais.getFornecedor());
        vetCampos.add(String.valueOf(this.objMateriais.getCodFornecedor()));
        vetCampos.add(this.objMateriais.getCpfcnpjFornecedor());
        vetCampos.add(this.objMateriais.getCodProdFornecedor());
        vetCampos.add(this.objMateriais.getTipoVenda());
        vetCampos.add(this.objMateriais.getNumeroNF());
        vetCampos.add(this.objMateriais.getTipoNF());
        vetCampos.add(this.objMateriais.getNumTipoNF());
        vetCampos.add(this.objMateriais.getSerieNF());
        vetCampos.add(this.objMateriais.getFinalidadeNF());
        vetCampos.add(this.objMateriais.getCodBarras());
        vetCampos.add(this.objMateriais.getEmissaoNF());
        vetCampos.add(this.objMateriais.getVencimentoNF());
        vetCampos.add(this.objMateriais.getSaidaProduto());
        vetCampos.add(this.objMateriais.getVencimentoProd());
        vetCampos.add(this.objMateriais.getComprador());
        vetCampos.add(this.objMateriais.getResponsavelEntrega());
        vetCampos.add(this.objMateriais.getCpfcnpjRespEntrega());
        vetCampos.add(this.objMateriais.getContatoRespEntrega());

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        this.objMateriais.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }

    public void Excluir(int iChave) throws ClassNotFoundException {
        this.objMateriais.setId(iChave);
        this.objMateriais.Excluir();

    }

    
}
