
package PacoteEstofaria;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeRegExp.source;


public class ManipuladorDeArquivos {
    
    /*public void salvaClienteUnico(Cliente cliente){
    ObjectOutputStream escreve = null;
        try {
            escreve = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("clientes.dat")));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar cliente único.","Erro",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar cliente único.","Erro",JOptionPane.ERROR_MESSAGE);
        }
       
        try {
            escreve.writeObject(cliente);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar cliente único.","Erro",JOptionPane.ERROR_MESSAGE);
        }
           
        try {
            escreve.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao salvar cliente único.","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    */
    public void salvarLista(ArrayList<Cliente> listaClientes){
        
        
    ObjectOutputStream escreve = null;
        try {
            escreve = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("clientes.dat")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar lista de clientes(1)","Erro",JOptionPane.ERROR_MESSAGE);
        }
       
    for(Cliente X: listaClientes)
        try {
            escreve.writeObject(X);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar lista de clientes(2)","Erro",JOptionPane.ERROR_MESSAGE);
        }
           
    try {
            escreve.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar lista de clientes(3)","Erro",JOptionPane.ERROR_MESSAGE);
        }
   }
        
    //Faz o usuário escolher um arquivo salvo anteriormente, recupera todos os dados de interesse e recomeça a execução.
    public ArrayList<Cliente> carregarLista(){
       
       ArrayList<Cliente> listaClientes = new ArrayList();
       
       FileInputStream input = null;
        try {
            input = new FileInputStream("clientes.dat");
        } catch (FileNotFoundException ex) {
            return listaClientes;
        }
       ObjectInputStream le = null;
        try {
            le = new ObjectInputStream(input);
        } catch (IOException ex) {
            return listaClientes;
        }
       
       while(true){
                Object cli = null;
           try {
               cli = le.readObject();
           } catch (IOException | ClassNotFoundException ex) {
               return listaClientes;
           }
                Cliente cliente = (Cliente)cli;
                listaClientes.add(cliente);
        }
        
   }     
    

    public void criaBackup(ArrayList<Cliente> listaClientes){
        ObjectOutputStream escreve = null;
        try {
            escreve = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Backup/clientes.dat")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar lista de clientes(1)","Erro",JOptionPane.ERROR_MESSAGE);
        }
       
    for(Cliente X: listaClientes)
        try {
            escreve.writeObject(X);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar lista de clientes(2)","Erro",JOptionPane.ERROR_MESSAGE);
        }
           
    try {
            escreve.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar lista de clientes(3)","Erro",JOptionPane.ERROR_MESSAGE);
        }
   }
        
    public void preBackup(){
        Data data = new Data();
       
        File fonte = new File("clientes.dat");
        
        File destino = new File("Arquivos Salvos/clientes_"+data.getDataAtual().replace(":", "'")+".dat");
        
        if (destino.exists())
            destino.delete();

        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            try {
                sourceChannel = new FileInputStream(fonte).getChannel();
            } catch (FileNotFoundException ex) {
                return;
            }
            try {
                destinationChannel = new FileOutputStream(destino).getChannel();
            } catch (FileNotFoundException ex) {
                return;
            }
            try {
                sourceChannel.transferTo(0, sourceChannel.size(),
                        destinationChannel);
            } catch (IOException ex) {
                Logger.getLogger(ManipuladorDeArquivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen())
                try {
                    sourceChannel.close();
            } catch (IOException ex) {
                Logger.getLogger(ManipuladorDeArquivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (destinationChannel != null && destinationChannel.isOpen())
                try {
                    destinationChannel.close();
            } catch (IOException ex) {
                Logger.getLogger(ManipuladorDeArquivos.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
   }
}