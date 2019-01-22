/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplorcamento.controle;

import java.text.ParseException;
import java.util.ArrayList;
import rplorcamento.modelo.rplorcamentoFuncionarioModel;

/**
 *
 * @author PCPROGRAMADOR
 */
public class rplorcamentoFuncionarioControl {
    
     

    private final rplorcamentoFuncionarioModel objFuncionario;

    public rplorcamentoFuncionarioControl() {
        this.objFuncionario = new rplorcamentoFuncionarioModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objFuncionario.setNome(pLista.get(1));
        this.objFuncionario.setCracha(pLista.get(2));
        this.objFuncionario.setNascimento(pLista.get(3));
        this.objFuncionario.setCtps(pLista.get(4));
        this.objFuncionario.setPis(pLista.get(5));
        this.objFuncionario.setMatricula(pLista.get(6));
        this.objFuncionario.setSituacao((pLista.get(7)));
        this.objFuncionario.setRg((pLista.get(8)));
        this.objFuncionario.setCpf(pLista.get(9));
        this.objFuncionario.setCargo(pLista.get(10));
        this.objFuncionario.setDepartamento(pLista.get(11));
        this.objFuncionario.setSetor(pLista.get(12));
        this.objFuncionario.setEndereco(pLista.get(13));
        this.objFuncionario.setReferencia(pLista.get(14));
        this.objFuncionario.setBairro(pLista.get(15));
        this.objFuncionario.setCidade(pLista.get(16));
        this.objFuncionario.setUf(pLista.get(17));
        this.objFuncionario.setTelefone(pLista.get(18));
        this.objFuncionario.setCelular(pLista.get(19));
        this.objFuncionario.setEmail(pLista.get(20));
        this.objFuncionario.setAdmicao(pLista.get(21));
        this.objFuncionario.setDesligamento(pLista.get(22));
        this.objFuncionario.setMotivoDesligamento(pLista.get(23));
        this.objFuncionario.setObservacao(pLista.get(24));
        this.objFuncionario.setFoto(pLista.get(25));
        this.objFuncionario.setCaminhoFoto(pLista.get(26));
        this.objFuncionario.setAcessoSistema(Integer.parseInt(pLista.get(27)));
        this.objFuncionario.setRecebeSalario(Integer.parseInt(pLista.get(28)));

        this.objFuncionario.Salvar();

        return this.objFuncionario.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException, ClassNotFoundException {
        this.objFuncionario.setId(Integer.parseInt(pLista.get(0)));
        this.objFuncionario.setNome(pLista.get(1));
        this.objFuncionario.setCracha(pLista.get(2));
        this.objFuncionario.setNascimento(pLista.get(3));
        this.objFuncionario.setCtps(pLista.get(4));
        this.objFuncionario.setPis(pLista.get(5));
        this.objFuncionario.setMatricula(pLista.get(6));
        this.objFuncionario.setSituacao((pLista.get(7)));
        this.objFuncionario.setRg((pLista.get(8)));
        this.objFuncionario.setCpf(pLista.get(9));
        this.objFuncionario.setCargo(pLista.get(10));
        this.objFuncionario.setDepartamento(pLista.get(11));
        this.objFuncionario.setSetor(pLista.get(12));
        this.objFuncionario.setEndereco(pLista.get(13));
        this.objFuncionario.setReferencia(pLista.get(14));
        this.objFuncionario.setBairro(pLista.get(15));
        this.objFuncionario.setCidade(pLista.get(16));
        this.objFuncionario.setUf(pLista.get(17));
        this.objFuncionario.setTelefone(pLista.get(18));
        this.objFuncionario.setCelular(pLista.get(19));
        this.objFuncionario.setEmail(pLista.get(20));
        this.objFuncionario.setAdmicao(pLista.get(21));
        this.objFuncionario.setDesligamento(pLista.get(22));
        this.objFuncionario.setMotivoDesligamento(pLista.get(23));
        this.objFuncionario.setObservacao(pLista.get(24));
        this.objFuncionario.setFoto(pLista.get(25));
        this.objFuncionario.setCaminhoFoto(pLista.get(26));
        this.objFuncionario.setAcessoSistema(Integer.parseInt(pLista.get(27)));
        this.objFuncionario.setRecebeSalario(Integer.parseInt(pLista.get(28)));


        this.objFuncionario.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();

        vetCampos.add(String.valueOf(this.objFuncionario.getId()));
        vetCampos.add(this.objFuncionario.getNome());
        vetCampos.add(this.objFuncionario.getCracha());
        vetCampos.add(String.valueOf(this.objFuncionario.getNascimento()));
        vetCampos.add(this.objFuncionario.getCtps());
        vetCampos.add(this.objFuncionario.getPis());
        vetCampos.add(this.objFuncionario.getMatricula());
        vetCampos.add(this.objFuncionario.getSituacao());
        vetCampos.add(this.objFuncionario.getRg());
        vetCampos.add(this.objFuncionario.getCpf());
        vetCampos.add(this.objFuncionario.getCargo());
        vetCampos.add(this.objFuncionario.getDepartamento());
        vetCampos.add(this.objFuncionario.getSetor());
        vetCampos.add(this.objFuncionario.getEndereco());
        vetCampos.add(this.objFuncionario.getReferencia());
        vetCampos.add(this.objFuncionario.getBairro());
        vetCampos.add(this.objFuncionario.getCidade());
        vetCampos.add(this.objFuncionario.getUf());
        vetCampos.add(this.objFuncionario.getTelefone());
        vetCampos.add(this.objFuncionario.getCelular());
        vetCampos.add(this.objFuncionario.getEmail());
        vetCampos.add(this.objFuncionario.getAdmicao());
        vetCampos.add(this.objFuncionario.getDesligamento());
        vetCampos.add(this.objFuncionario.getMotivoDesligamento());
        vetCampos.add(this.objFuncionario.getObservacao());
        vetCampos.add(this.objFuncionario.getFoto());
        vetCampos.add(this.objFuncionario.getCaminhoFoto());
        vetCampos.add(String.valueOf(this.objFuncionario.getAcessoSistema()));
        vetCampos.add(String.valueOf(this.objFuncionario.getRecebeSalario()));

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) throws ClassNotFoundException {
        this.objFuncionario.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }

    public void Excluir(int iChave) throws ClassNotFoundException {
        this.objFuncionario.setId(iChave);
        this.objFuncionario.Excluir();

    }

    
}
