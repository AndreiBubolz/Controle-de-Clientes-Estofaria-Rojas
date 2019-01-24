/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteEstofaria;

import java.util.Calendar;

public final class Data {
    private String dataAtual;
    
    public Data(){
        Calendar hoje = Calendar.getInstance();
        dataAtual = (hoje.getTime()).toString();
        
        this.setDataAtual(converteIngPortData(dataAtual));
        this.setDataAtual(padronizaData(dataAtual));
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(String dataAtual) {
        this.dataAtual = dataAtual;
    }

    
    public static String converteIngPortData(String data){
        String[] dataHoraString = data.split(" ");
        String[] dataHoraString2 = data.split(" ",2);
        String dataFinal=null;
        
        String[] mes = dataHoraString2[1].split(" ");
        String[] mes2= dataHoraString2[1].split(" ",2);
        String mesFinal=null;
        
        
        switch (mes2[0]) {
            case "Jan":
                mesFinal = "Janeiro "+mes2[1];
                break;
            case "Feb":
                mesFinal = "Fevereiro "+mes2[1];
                break;
            case "Mar":
                mesFinal = "Março "+mes2[1];
                break;
            case "Apr":
                mesFinal = "Abril "+mes2[1];
                break;
            case "May":
                mesFinal = "Maio "+mes2[1];
                break;
            case "Jun":
                mesFinal = "Junho "+mes2[1];
                break;
            case "Jul":
                mesFinal = "Julho "+mes2[1];
                break;
            case "Aug":
                mesFinal = "Agosto "+mes2[1];
                break;
            case "Sep":
                mesFinal = "Setembro "+mes2[1];
                break;
            case "Oct":
                mesFinal = "Outubro "+mes2[1];
                break;
            case "Nov":
                mesFinal = "Novembro "+mes2[1];
                break;
            case "Dec":
                mesFinal = "Dezembro "+mes2[1];
                break;
            default:
                break;
        }
        
        switch (dataHoraString[0]) {
            case "Mon":
                dataFinal = "Segunda "+mesFinal;
                break;
            case "Tue":
                dataFinal = "Terça "+mesFinal;
                break;
            case "Wed":
                dataFinal = "Quarta "+mesFinal;
                break;
            case "Thu":
                dataFinal = "Quinta "+mesFinal;
                break;
            case "Fri":
                dataFinal = "Sexta "+mesFinal;
                break;
            case "Sat":
                dataFinal = "Sábado "+mesFinal;
                break;
            case "Sun":
                dataFinal = " Domingo "+mesFinal;
                break;
            default:
                break;
        }

       return dataFinal; 
    }
        
        public static String padronizaData(String data){
            String dataPadrao="";
            String[] dataTxt = data.split(" ");
            
            dataPadrao = dataTxt[2]+" de "+dataTxt[1]+" de "+dataTxt[5]+" -- "+dataTxt[0]+" "+dataTxt[3];
            
            return dataPadrao;
        }
}
