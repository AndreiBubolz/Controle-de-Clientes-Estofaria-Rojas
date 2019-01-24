
package PacoteEstofaria;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ficha extends javax.swing.JFrame {
    ArrayList<Cliente> lista;
    Cliente cliente;
    public Principal principal;
    public FichaServicos janelaServicos;
    public ProcurarCliente janelaProcura;
    public ListarClientes listar;
    public int posicao;
    
    public Ficha(Principal princ,ProcurarCliente pro,ListarClientes list,Cliente cli,int pos,ArrayList<Cliente> lis) {
        initComponents();
        this.janelaProcura = pro;
        this.posicao = pos;
        this.lista = lis;
        this.cliente = cli;
        this.listar = list;
        
        enviaCliente();
        principal = princ;
        janelaServicos = new FichaServicos(principal,cliente.getServicos(),this,posicao,lista);
        this.cancelarEdicao.setVisible(false);
        this.salvarEdicao.setVisible(false);
        
        this.setSize(490, 668);
        ImageIcon img = new ImageIcon("src/Icons/iconsofa.png");
        this.setIconImage(img.getImage());
    }   

   //Função para enviar ficha do cliente selecionado para nova janela de ficha.
    public void enviaCliente(){
        
        String nomeC = cliente.getNome();
        String nome[] = nomeC.split(" ", 2);
        
        tituloFicha.setText("Ficha de "+ nome[0]);
        textoNomeFicha.setText(cliente.getNome());
        textoTelFicha.setText(cliente.getTelefone());
        textoCelFicha.setText(cliente.getCelular());
        textoEndFicha.setText(cliente.getEndereco());
        textoBairroFicha.setText(cliente.getBairro());
        textoID.setText(cliente.getID());
        textoNotaFicha.setText(cliente.getAnotacao());
        String[] dataSep = cliente.getDataAdd().split(" -- ");
        textoDataAdd.setText(dataSep[0]);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoTelFicha = new javax.swing.JTextField();
        textoNomeFicha = new javax.swing.JTextField();
        textoCelFicha = new javax.swing.JTextField();
        tituloFicha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoNotaFicha = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        botaoVoltarFicha = new javax.swing.JButton();
        jLabel2Ficha = new javax.swing.JLabel();
        jLabel3Ficha = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        jLabel4Ficha = new javax.swing.JLabel();
        jLabel5Ficha = new javax.swing.JLabel();
        textoEndFicha = new javax.swing.JTextField();
        jLabel6Ficha = new javax.swing.JLabel();
        jLabel1Ficha = new javax.swing.JLabel();
        jLabel4Ficha1 = new javax.swing.JLabel();
        textoBairroFicha = new javax.swing.JTextField();
        botaoMostrarServicos = new javax.swing.JToggleButton();
        salvarEdicao = new javax.swing.JButton();
        cancelarEdicao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        editarCliente = new javax.swing.JButton();
        excluirCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textoDataAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ficha de Cliente.");
        setAlwaysOnTop(true);
        setLocation(location());
        setPreferredSize(new java.awt.Dimension(493, 640));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        textoTelFicha.setEditable(false);
        textoTelFicha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoTelFichaKeyTyped(evt);
            }
        });
        getContentPane().add(textoTelFicha);
        textoTelFicha.setBounds(133, 204, 340, 30);

        textoNomeFicha.setEditable(false);
        getContentPane().add(textoNomeFicha);
        textoNomeFicha.setBounds(133, 162, 340, 30);

        textoCelFicha.setEditable(false);
        textoCelFicha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCelFichaKeyTyped(evt);
            }
        });
        getContentPane().add(textoCelFicha);
        textoCelFicha.setBounds(133, 246, 340, 30);

        tituloFicha.setFont(new java.awt.Font("Lucida Sans", 3, 46)); // NOI18N
        tituloFicha.setForeground(new java.awt.Color(204, 255, 255));
        tituloFicha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFicha.setAlignmentX(0.5F);
        tituloFicha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(tituloFicha);
        tituloFicha.setBounds(-10, 20, 510, 60);

        textoNotaFicha.setEditable(false);
        textoNotaFicha.setColumns(20);
        textoNotaFicha.setLineWrap(true);
        textoNotaFicha.setRows(5);
        jScrollPane1.setViewportView(textoNotaFicha);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(133, 414, 340, 170);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 141, 493, 10);

        botaoVoltarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Seta Voltar.png"))); // NOI18N
        botaoVoltarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarFichaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltarFicha);
        botaoVoltarFicha.setBounds(130, 600, 81, 30);

        jLabel2Ficha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2Ficha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2Ficha.setText("Telefone");
        getContentPane().add(jLabel2Ficha);
        jLabel2Ficha.setBounds(10, 203, 113, 22);

        jLabel3Ficha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3Ficha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3Ficha.setText("Celular");
        getContentPane().add(jLabel3Ficha);
        jLabel3Ficha.setBounds(10, 245, 113, 22);

        textoID.setEditable(false);
        getContentPane().add(textoID);
        textoID.setBounds(133, 372, 340, 30);

        jLabel4Ficha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4Ficha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4Ficha.setText("Endereço");
        getContentPane().add(jLabel4Ficha);
        jLabel4Ficha.setBounds(10, 287, 113, 22);

        jLabel5Ficha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5Ficha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5Ficha.setText("Anotação");
        getContentPane().add(jLabel5Ficha);
        jLabel5Ficha.setBounds(10, 412, 119, 22);

        textoEndFicha.setEditable(false);
        getContentPane().add(textoEndFicha);
        textoEndFicha.setBounds(133, 288, 340, 30);

        jLabel6Ficha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6Ficha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6Ficha.setText("Identificação");
        getContentPane().add(jLabel6Ficha);
        jLabel6Ficha.setBounds(10, 371, 113, 22);

        jLabel1Ficha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1Ficha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Ficha.setText("Nome ");
        getContentPane().add(jLabel1Ficha);
        jLabel1Ficha.setBounds(10, 162, 113, 30);

        jLabel4Ficha1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4Ficha1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4Ficha1.setText("Bairro");
        getContentPane().add(jLabel4Ficha1);
        jLabel4Ficha1.setBounds(10, 329, 119, 22);

        textoBairroFicha.setEditable(false);
        getContentPane().add(textoBairroFicha);
        textoBairroFicha.setBounds(133, 330, 340, 30);

        botaoMostrarServicos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoMostrarServicos.setText("Mostrar Serviços");
        botaoMostrarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostrarServicosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMostrarServicos);
        botaoMostrarServicos.setBounds(315, 600, 160, 30);

        salvarEdicao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvarEdicao.setText("Salvar");
        salvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarEdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(salvarEdicao);
        salvarEdicao.setBounds(325, 600, 150, 30);

        cancelarEdicao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarEdicao.setText("Cancelar Edição");
        cancelarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarEdicao);
        cancelarEdicao.setBounds(130, 600, 150, 30);

        jPanel1.setMinimumSize(new java.awt.Dimension(490, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 640));
        jPanel1.setLayout(null);

        editarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editarCliente.setText("Editar Cliente");
        editarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(editarCliente);
        editarCliente.setBounds(220, 100, 120, 30);

        excluirCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        excluirCliente.setText("Excluir Cliente");
        excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteActionPerformed(evt);
            }
        });
        jPanel1.add(excluirCliente);
        excluirCliente.setBounds(350, 100, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicionado em:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 87, 120, 20);

        textoDataAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoDataAdd.setForeground(new java.awt.Color(153, 255, 255));
        textoDataAdd.setText("24 de Dezembro de 2016");
        jPanel1.add(textoDataAdd);
        textoDataAdd.setBounds(10, 110, 200, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundo.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Ação ao clicar em voltar na ficha.
    private void botaoVoltarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarFichaActionPerformed
        this.dispose();
        janelaServicos.dispose();
        if(janelaProcura != null)
            janelaProcura.setVisible(true);
        else if(listar != null)
            listar.setVisible(true);
        else
            principal.setVisible(true);
          
    }//GEN-LAST:event_botaoVoltarFichaActionPerformed
    
    //Ação ao clicar no botão de fechar (X); (VOltar Menu)
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        janelaServicos.dispose();
        principal.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    private void botaoMostrarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostrarServicosActionPerformed
        this.setLocationRelativeTo(null);
        int x = this.getX();
        int y = this.getY();
        
        this.setLocation(x-510, y);
        
        
        if(cliente.getServicos().isEmpty()){
            JOptionPane.showMessageDialog(this,"Nenhum serviço associado ao cliente "+cliente.getNome()+".","Erro",JOptionPane.ERROR_MESSAGE);
            botaoMostrarServicos.setSelected(false);
            }
        else{
            if(botaoMostrarServicos.isSelected()){
                this.setLocation(130, 50);
                botaoMostrarServicos.setText("Esconder Serviços");
                janelaServicos.setVisible(true);
                janelaServicos.setLocation(this.getX()+500, this.getY()+22);
            }else{
                this.setLocationRelativeTo(null);
                //this.setLocation(tamanhoTela.width/2, tamanhoTela.height/2);
                botaoMostrarServicos.setText("Mostrar Serviços");
                janelaServicos.setVisible(false);
            }
          }
    }//GEN-LAST:event_botaoMostrarServicosActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        janelaServicos.setLocation(this.getX()+500, this.getY()+22);
    }//GEN-LAST:event_formComponentMoved

    private void cancelarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEdicaoActionPerformed
        int n = JOptionPane.showConfirmDialog(this,"Cancelar edição?","Cancelar?",JOptionPane.YES_NO_OPTION);
            if(n==0){
            textoNomeFicha.setEditable(false);
            textoTelFicha.setEditable(false);
            textoCelFicha.setEditable(false);
            textoEndFicha.setEditable(false);
            textoNotaFicha.setEditable(false);
            textoBairroFicha.setEditable(false);
            textoID.setEditable(false);
            String[] dataSep = cliente.getDataAdd().split(" -- ");
            textoDataAdd.setText(dataSep[0]);

            salvarEdicao.setVisible(false);
            cancelarEdicao.setVisible(false);

            botaoVoltarFicha.setVisible(true);
            botaoMostrarServicos.setVisible(true);

            editarCliente.setVisible(true);
            excluirCliente.setVisible(true);
            
            textoNomeFicha.setText(cliente.getNome());
            textoTelFicha.setText(cliente.getTelefone());
            textoCelFicha.setText(cliente.getCelular());
            textoEndFicha.setText(cliente.getEndereco());
            textoBairroFicha.setText(cliente.getBairro());
            textoID.setText(cliente.getID());
            textoNotaFicha.setText(cliente.getAnotacao());
            jLabel2.setVisible(true);
            }
    }//GEN-LAST:event_cancelarEdicaoActionPerformed

    private void editarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteActionPerformed
            
            textoDataAdd.setText("Editando cliente...");
            textoNomeFicha.setEditable(true);
            textoTelFicha.setEditable(true);
            textoCelFicha.setEditable(true);
            textoEndFicha.setEditable(true);
            textoNotaFicha.setEditable(true);
            textoBairroFicha.setEditable(true);
            textoID.setEditable(true);
            jLabel2.setVisible(false);   
            salvarEdicao.setVisible(true);
            cancelarEdicao.setVisible(true);

            botaoVoltarFicha.setVisible(false);
            botaoMostrarServicos.setVisible(false);
            
            editarCliente.setVisible(false);
            excluirCliente.setVisible(false);
            
    }//GEN-LAST:event_editarClienteActionPerformed

    private void salvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarEdicaoActionPerformed
        int n = JOptionPane.showConfirmDialog(this,"Salvar edição?","Cancelar?",JOptionPane.YES_NO_OPTION);
            if(n==0){
            textoNomeFicha.setEditable(false);
            textoTelFicha.setEditable(false);
            textoCelFicha.setEditable(false);
            textoEndFicha.setEditable(false);
            textoNotaFicha.setEditable(false);
            textoBairroFicha.setEditable(false);
            textoID.setEditable(false);
            String[] dataSep = cliente.getDataAdd().split(" -- ");
            textoDataAdd.setText(dataSep[0]);

            salvarEdicao.setVisible(false);
            cancelarEdicao.setVisible(false);

            botaoVoltarFicha.setVisible(true);
            botaoMostrarServicos.setVisible(true);

            editarCliente.setVisible(true);
            excluirCliente.setVisible(true);
            
            jLabel2.setVisible(true);
        
        cliente.setNome(textoNomeFicha.getText().trim());
        cliente.setEndereco(textoEndFicha.getText().trim());
        cliente.setBairro(textoBairroFicha.getText().trim());
        cliente.setTelefone(textoTelFicha.getText().trim());
        cliente.setCelular(textoCelFicha.getText().trim());
        cliente.setID((textoID.getText().trim()));
        cliente.setAnotacao(textoNotaFicha.getText().trim());
        
        lista.set(posicao, cliente);
        
        principal.clientes = lista;
        
        ManipuladorDeArquivos manip = new ManipuladorDeArquivos();
        manip.salvarLista(this.lista);
                    
        principal.atualizaUltimosClientes();
       
       }
    }//GEN-LAST:event_salvarEdicaoActionPerformed

    private void excluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteActionPerformed
        int n = JOptionPane.showConfirmDialog(this,"Deseja realmente excluir o cliente?","Excluir?",JOptionPane.YES_NO_OPTION);
        
        if(n==0){
        lista.remove(posicao);
        
        principal.clientes = lista;
        
        ManipuladorDeArquivos manip = new ManipuladorDeArquivos();
        manip.salvarLista(this.lista);
        
        principal.atualizaUltimosClientes();
        this.dispose();
        principal.setVisible(true);
        
        JOptionPane.showMessageDialog(principal,"Cliente removido com sucesso!","Sucesso!",JOptionPane.INFORMATION_MESSAGE);
        
       }
    }//GEN-LAST:event_excluirClienteActionPerformed

    private void textoTelFichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoTelFichaKeyTyped
        String caracteres="0987654321-.)(";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_textoTelFichaKeyTyped

    private void textoCelFichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCelFichaKeyTyped
        String caracteres="0987654321-.)(";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_textoCelFichaKeyTyped

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
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JanelaFicha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton botaoMostrarServicos;
    private javax.swing.JButton botaoVoltarFicha;
    private javax.swing.JButton cancelarEdicao;
    private javax.swing.JButton editarCliente;
    private javax.swing.JButton excluirCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Ficha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Ficha;
    private javax.swing.JLabel jLabel3Ficha;
    private javax.swing.JLabel jLabel4Ficha;
    private javax.swing.JLabel jLabel4Ficha1;
    private javax.swing.JLabel jLabel5Ficha;
    private javax.swing.JLabel jLabel6Ficha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton salvarEdicao;
    private static javax.swing.JTextField textoBairroFicha;
    private static javax.swing.JTextField textoCelFicha;
    private javax.swing.JLabel textoDataAdd;
    private static javax.swing.JTextField textoEndFicha;
    private static javax.swing.JTextField textoID;
    private static javax.swing.JTextField textoNomeFicha;
    private static javax.swing.JTextArea textoNotaFicha;
    private static javax.swing.JTextField textoTelFicha;
    private static javax.swing.JLabel tituloFicha;
    // End of variables declaration//GEN-END:variables
}
