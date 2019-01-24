/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteEstofaria;

import java.io.Serializable;

public class Servico implements Serializable {
    private String trabalho;
    private String valorCobrado;
    private String valorGasto;
    private String data;
    private String comentarioAdicional;

    public Servico(String trabalho, String valorCobrado, String valorGasto, String data, String comentarioAdicional) {
        this.trabalho = trabalho;
        this.valorCobrado = valorCobrado;
        this.valorGasto = valorGasto;
        this.data = data;
        this.comentarioAdicional = comentarioAdicional;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(String valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public String getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(String valorGasto) {
        this.valorGasto = valorGasto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getComentarioAdicional() {
        return comentarioAdicional;
    }

    public void setComentarioAdicional(String comentarioAdicional) {
        this.comentarioAdicional = comentarioAdicional;
    }
    
    
    
}
