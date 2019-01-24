
package PacoteEstofaria;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {
    private String nome;
    private String ID;
    private String telefone;
    private String celular;
    private String endereco;
    private String Bairro;
    private String anotacao;
    private String dataAdd;
    private ArrayList<Servico> servicos;
    
    
    public Cliente(String n,String RGCPF, String tel, String cel, String end, String bai, String nota,String data) {
        this.nome = n;
        this.ID = RGCPF;
        this.telefone = tel;
        this.celular = cel;
        this.endereco = end;
        this.Bairro = bai;
        this.anotacao = nota;
        this.dataAdd = data;
        this.servicos = new ArrayList();
        
    }
    public Cliente(){
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }
    
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataAdd() {
        return dataAdd;
    }

    public String getCelular() {
        return celular;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getAnotacao() {
        return anotacao;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public void setDataAdd(String dataAdd) {
        this.dataAdd = dataAdd;
    }
    
    public void addServico(Servico servico){
        this.servicos.add(servico);
    }
    
    public int getTamanhoListaServicos(){
        return this.servicos.size();
    }
}


