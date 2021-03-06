/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteEstofaria;

import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.Normalizer;
import javax.swing.ImageIcon;

public class ProcurarCliente extends javax.swing.JFrame {
    Principal principal;
    ArrayList<Cliente> lista;
    ArrayList<Cliente> listaAchada;
    ArrayList<Integer> listaAchadaIndexes;
    
    public ProcurarCliente(Principal janela,ArrayList<Cliente> lis,int x) {
        initComponents();
        this.principal = janela;
        this.lista = lis;
        if(x==0)
        botaoAddServico.setVisible(false);
        else
        botaoAddServico.setVisible(true);
        
        this.setSize(690, 450);
        ImageIcon img = new ImageIcon("src/Icons/iconsofa.png");
        this.setIconImage(img.getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientesAchados = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        verFichaCompleta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tituloProcura = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        textoNome = new javax.swing.JTextField();
        botaoProcurarCliente = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botaoAddServico = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        procurarPorNome = new javax.swing.JCheckBox();
        procurarPorChave = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Procurar Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        tabelaClientesAchados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Telefone", "Data Adicionado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientesAchados.setSelectionBackground(new java.awt.Color(255, 255, 153));
        tabelaClientesAchados.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(tabelaClientesAchados);
        if (tabelaClientesAchados.getColumnModel().getColumnCount() > 0) {
            tabelaClientesAchados.getColumnModel().getColumn(0).setResizable(false);
            tabelaClientesAchados.getColumnModel().getColumn(1).setResizable(false);
            tabelaClientesAchados.getColumnModel().getColumn(2).setResizable(false);
            tabelaClientesAchados.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabelaClientesAchados.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 165, 665, 202);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 125, 685, 10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes Encontrados:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 137, 133, 19);

        verFichaCompleta.setText("Ver ficha completa do cliente selecionado");
        verFichaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFichaCompletaActionPerformed(evt);
            }
        });
        getContentPane().add(verFichaCompleta);
        verFichaCompleta.setBounds(415, 136, 260, 23);

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Procurar Cliente");
        jLabel8.setAlignmentX(0.5F);
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-10, 15, 710, 43);

        tituloProcura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloProcura.setForeground(new java.awt.Color(255, 255, 255));
        tituloProcura.setText("Nome do cliente:");
        getContentPane().add(tituloProcura);
        tituloProcura.setBounds(10, 81, 116, 33);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 69, 685, 10);

        textoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoNomeKeyPressed(evt);
            }
        });
        getContentPane().add(textoNome);
        textoNome.setBounds(130, 81, 221, 33);

        botaoProcurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lupa.png"))); // NOI18N
        botaoProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProcurarCliente);
        botaoProcurarCliente.setBounds(357, 81, 36, 33);

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Seta Voltar.png"))); // NOI18N
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar);
        botaoVoltar.setBounds(10, 373, 79, 32);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(405, 0, 0, 9);

        botaoAddServico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoAddServico.setText("Adicionar Serviço");
        botaoAddServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddServicoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAddServico);
        botaoAddServico.setBounds(524, 373, 151, 32);

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 420));
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 410, 690, 20);

        procurarPorNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        procurarPorNome.setForeground(new java.awt.Color(255, 255, 255));
        procurarPorNome.setSelected(true);
        procurarPorNome.setText("Procurar por Nome");
        procurarPorNome.setOpaque(false);
        procurarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarPorNomeActionPerformed(evt);
            }
        });
        jPanel1.add(procurarPorNome);
        procurarPorNome.setBounds(400, 80, 141, 20);

        procurarPorChave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        procurarPorChave.setForeground(new java.awt.Color(255, 255, 255));
        procurarPorChave.setText("Procurar por Palavra Chave");
        procurarPorChave.setOpaque(false);
        procurarPorChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarPorChaveActionPerformed(evt);
            }
        });
        jPanel1.add(procurarPorChave);
        procurarPorChave.setBounds(400, 100, 200, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundo.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarClienteActionPerformed
        if(procurarPorNome.isSelected())
                procuraClienteNome();
            else if(procurarPorChave.isSelected())
                procuraClienteChave();
    }//GEN-LAST:event_botaoProcurarClienteActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void verFichaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFichaCompletaActionPerformed
        int x=tabelaClientesAchados.getSelectedRow();
        
        if(x >= 0){
        Cliente cliente = listaAchada.get(x);
        this.dispose();
        Ficha ficha = new Ficha(principal,this,null,lista.get(listaAchadaIndexes.get(x)),listaAchadaIndexes.get(x),lista);
        ficha.setVisible(true);
        ficha.setLocationRelativeTo(null);
        }else{
            JOptionPane.showMessageDialog(this,"Selecione um cliente na lista!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verFichaCompletaActionPerformed
    
    private void procuraClienteNome(){
        DefaultTableModel tabela = (DefaultTableModel) tabelaClientesAchados.getModel();
        int contador=0;
        listaAchadaIndexes = new ArrayList();
        while(tabelaClientesAchados.getRowCount()>0){
            tabela.removeRow(0);
        }
        
        if(textoNome.getText().trim().equals(""))
            JOptionPane.showMessageDialog(this,"Campo de procura vazio.","Erro",JOptionPane.ERROR_MESSAGE);
        else{
            String nome = remAc(textoNome.getText().trim().toLowerCase());
            listaAchada = new ArrayList();
            for(Cliente X: lista){
                if(remAc(X.getNome().trim().toLowerCase()).equals(nome) | remAc(X.getNome().trim().toLowerCase()).contains(nome)){
                    listaAchada.add(X);
                    listaAchadaIndexes.add(contador);
                }
                contador++;
            }
            if(listaAchada.isEmpty())
                JOptionPane.showMessageDialog(this,"Nenhum cliente encontrado.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            else{    
                for(Cliente Y:listaAchada){
                 String[] dataFinal; 
                 dataFinal = Y.getDataAdd().replace(" de ", "/").split("--");
                 tabela.addRow(new String[] {Y.getNome(),Y.getEndereco(),Y.getTelefone(),dataFinal[0]});   
                }
            }
            
        }
    }
    
    private void procuraClienteChave(){
        DefaultTableModel tabela = (DefaultTableModel) tabelaClientesAchados.getModel();
        int contador=0;
        ArrayList<Cliente> listaF = lista;
        listaAchadaIndexes = new ArrayList();
        while(tabelaClientesAchados.getRowCount()>0){
            tabela.removeRow(0);
        }
        
        if(textoNome.getText().trim().toLowerCase().equals(""))
            JOptionPane.showMessageDialog(this,"Campo de procura vazio.","Erro",JOptionPane.ERROR_MESSAGE);
        else{
            String nome = remAc(textoNome.getText().trim().toLowerCase());
            listaAchada = new ArrayList();
            
            for(Cliente X: listaF){
                if(remAc(X.getBairro().trim().toLowerCase()).equals(nome) | remAc(X.getBairro().trim().toLowerCase()).contains(nome)){
                    if(!listaAchada.contains(X)){
                    listaAchada.add(X);
                    listaAchadaIndexes.add(contador);
                    }
                }
                contador++;
            }
            contador=0;
            for(Cliente X: listaF){
                if(remAc(X.getAnotacao().trim().toLowerCase()).equals(nome) | remAc(X.getAnotacao().trim().toLowerCase()).contains(nome)){
                    if(!listaAchada.contains(X)){
                    listaAchada.add(X);
                    listaAchadaIndexes.add(contador);
                    }
                }
                contador++;
            }
            
            contador=0;
            for(Cliente X: listaF){
                if(remAc(X.getEndereco().trim().toLowerCase()).equals(nome) | remAc(X.getEndereco().trim().toLowerCase()).contains(nome)){
                    if(!listaAchada.contains(X)){
                    listaAchada.add(X);
                    listaAchadaIndexes.add(contador);
                    }
                }
                contador++;
            }
            
            contador=0;
            for(Cliente X: listaF){
                for(Servico Y: X.getServicos()){
                if(remAc(Y.getTrabalho().trim().toLowerCase()).equals(nome) | remAc(Y.getTrabalho().trim().toLowerCase()).contains(nome)){
                    if(!listaAchada.contains(X)){
                        listaAchada.add(X);
                        listaAchadaIndexes.add(contador);
                        }
                    }
                }
                contador++;   
            }
            
            contador=0;
            for(Cliente X: listaF){
                for(Servico Y: X.getServicos()){
                if(remAc(Y.getComentarioAdicional().trim().toLowerCase()).equals(nome) | remAc(Y.getComentarioAdicional().trim().toLowerCase()).contains(nome)){
                    if(!listaAchada.contains(X)){
                        listaAchada.add(X);
                        listaAchadaIndexes.add(contador);
                        }
                    }
                }
                contador++;   
            }
            
            if(listaAchada.isEmpty())
                JOptionPane.showMessageDialog(this,"Nenhum cliente encontrado.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            else{    
                for(Cliente Y:listaAchada){
                 String[] dataFinal; 
                 dataFinal = Y.getDataAdd().replace(" de ", "/").split("--");
                 tabela.addRow(new String[] {Y.getNome(),Y.getEndereco(),Y.getTelefone(),dataFinal[0]});   
                }
            }
            
        }
    }
    
    private void textoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(procurarPorNome.isSelected())
                procuraClienteNome();
            else if(procurarPorChave.isSelected())
                procuraClienteChave();
        }
    }//GEN-LAST:event_textoNomeKeyPressed

    private void procurarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarPorNomeActionPerformed
        procurarPorChave.setSelected(false);
        procurarPorNome.setSelected(true);
        
        tituloProcura.setText("Nome do cliente:");
        textoNome.setText("");
        
    }//GEN-LAST:event_procurarPorNomeActionPerformed

    private void procurarPorChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarPorChaveActionPerformed
        procurarPorNome.setSelected(false);
        procurarPorChave.setSelected(true);
        tituloProcura.setText("Palavra chave:    ");
        textoNome.setText("");
    }//GEN-LAST:event_procurarPorChaveActionPerformed

    private void botaoAddServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddServicoActionPerformed
        this.dispose();
        int x  = tabelaClientesAchados.getSelectedRow();
        
        if(x>=0){
        AdicionaServico add = new AdicionaServico(principal,null,null,this,null,lista.get(listaAchadaIndexes.get(x)),listaAchadaIndexes.get(x),lista);
        add.setVisible(true);
        add.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_botaoAddServicoActionPerformed
    
    public static String remAc(String str) {
    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JanelaProcurarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAddServico;
    private javax.swing.JButton botaoProcurarCliente;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox procurarPorChave;
    private javax.swing.JCheckBox procurarPorNome;
    private javax.swing.JTable tabelaClientesAchados;
    private javax.swing.JTextField textoNome;
    private javax.swing.JLabel tituloProcura;
    private javax.swing.JButton verFichaCompleta;
    // End of variables declaration//GEN-END:variables
}
