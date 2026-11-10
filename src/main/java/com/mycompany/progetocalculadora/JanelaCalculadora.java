/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.progetocalculadora;

/*Importações para Controle da Janela*/
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/*Importações para executar o calculo*/
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/*Importações para controlar o Teclado*/
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

/**
 *
 * @author pedagogico
 */
public class JanelaCalculadora extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName());

    /**
     * Creates new form JanelaCalculadora
     */
    public JanelaCalculadora() {
        /*Inicializa os componentes da Janela*/
        initComponents();
        
        /*Colocar o icone na Janela*/
        this.getContentPane().setBackground(new java.awt.Color(0, 204, 255));
        URL caminhoIcone = getClass().getResource("/Imagens/ImaCal.png");
        Image imagemIcone = new ImageIcon(caminhoIcone).getImage();
        setIconImage(imagemIcone);
        setVisible(true);
        
        /*Aplica ações nos botões do teclado numero*/
        addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e){
                Color corOriginal = btn9.getBackground();
                
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD9){
                    System.out.println("Você apertou 9!");
                    btn9.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "9";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn9.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD8){
                    System.out.println("Você apertou 8!");
                    btn8.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "8";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn8.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD7){
                    System.out.println("Você apertou 7!");
                    btn7.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "7";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn7.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD6){
                    System.out.println("Você apertou 6!");
                    btn6.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "6";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn6.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5){
                    System.out.println("Você apertou 5!");
                    btn5.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "5";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn5.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD4){
                    System.out.println("Você apertou 4!");
                    btn4.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "4";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn4.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3){
                    System.out.println("Você apertou 3!");
                    btn3.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "3";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn3.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD2){
                    System.out.println("Você apertou 2!");
                    btn2.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "2";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn2.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD1){
                    System.out.println("Você apertou 1!");
                    btn1.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "1";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn1.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD0){
                    System.out.println("Você apertou 0!");
                    btn0.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "0";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btn0.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_MULTIPLY){
                    System.out.println("Você apertou Multiplicação!");
                    btnMultiplicacao.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "*";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btnMultiplicacao.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_ADD){
                    System.out.println("Você apertou Soma!");
                    btnMais.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "+";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btnMais.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_SUBTRACT){
                    System.out.println("Você apertou Sublitação!");
                    btnMenos.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "-";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btnMenos.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_DECIMAL){
                    System.out.println("Você apertou Virgula!");
                    btnPonto.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += ".";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btnPonto.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_DIVIDE){
                    System.out.println("Você apertou Divisão!");
                    btnDivisao.setBackground(new java.awt.Color(255, 0, 0));
                    String txt = lblTela.getText();
                    txt += "/";
                    lblTela.setText(txt);
                    Timer timer = new Timer(500, (ActionEvent avt) -> {
                        btnDivisao.setBackground(corOriginal);
                    });
                    timer.setRepeats(false);
                    timer.start();
                }else if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    System.out.println("Você apertou Enter!");
                    Expression exp = new ExpressionBuilder(lblTela.getText()).build();
                    lblTela.setText(Double.toString(exp.evaluate()));
                }else if(e.getKeyCode() == KeyEvent.VK_SEPARATOR){
                    String operacao  = lblTela.getText();
                    if(operacao != null && !operacao.isEmpty()){
                        lblTela.setText(operacao.substring(0, operacao.length() - 1));
                    }
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e){
                
            }
            @Override
            public void keyTyped(KeyEvent e){
                
            }
        });
        
        setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton16 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblTela = new javax.swing.JTextArea();
        btnPorsentagem = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnApagarUmaUnidade = new javax.swing.JButton();

        jButton16.setText("-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(0, 204, 255));
        setResizable(false);

        btn1.setBackground(new java.awt.Color(0, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(this::btn1ActionPerformed);

        btn2.setBackground(new java.awt.Color(0, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(this::btn2ActionPerformed);

        btn3.setBackground(new java.awt.Color(0, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(this::btn3ActionPerformed);

        btn4.setBackground(new java.awt.Color(0, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(this::btn4ActionPerformed);

        btn5.setBackground(new java.awt.Color(0, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(this::btn5ActionPerformed);

        btn6.setBackground(new java.awt.Color(0, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(this::btn6ActionPerformed);

        btn7.setBackground(new java.awt.Color(0, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(this::btn7ActionPerformed);

        btn8.setBackground(new java.awt.Color(0, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(this::btn8ActionPerformed);

        btn9.setBackground(new java.awt.Color(0, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(this::btn9ActionPerformed);

        btn0.setBackground(new java.awt.Color(0, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(this::btn0ActionPerformed);

        btnIgual.setBackground(new java.awt.Color(0, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(this::btnIgualActionPerformed);

        btnC.setBackground(new java.awt.Color(0, 255, 255));
        btnC.setText("C");
        btnC.addActionListener(this::btnCActionPerformed);

        btnMais.setBackground(new java.awt.Color(0, 255, 255));
        btnMais.setText("+");
        btnMais.addActionListener(this::btnMaisActionPerformed);

        btnMultiplicacao.setBackground(new java.awt.Color(0, 255, 255));
        btnMultiplicacao.setText("x");
        btnMultiplicacao.addActionListener(this::btnMultiplicacaoActionPerformed);

        btnMenos.setBackground(new java.awt.Color(0, 255, 255));
        btnMenos.setText("-");
        btnMenos.addActionListener(this::btnMenosActionPerformed);

        lblTela.setColumns(20);
        lblTela.setRows(5);
        jScrollPane1.setViewportView(lblTela);

        btnPorsentagem.setBackground(new java.awt.Color(0, 255, 255));
        btnPorsentagem.setText("%");
        btnPorsentagem.addActionListener(this::btnPorsentagemActionPerformed);

        btnDivisao.setBackground(new java.awt.Color(0, 255, 255));
        btnDivisao.setText("\\");
            btnDivisao.addActionListener(this::btnDivisaoActionPerformed);

            btnPonto.setBackground(new java.awt.Color(0, 255, 255));
            btnPonto.setText(".");
            btnPonto.addActionListener(this::btnPontoActionPerformed);

            btnApagarUmaUnidade.setBackground(new java.awt.Color(0, 255, 255));
            btnApagarUmaUnidade.setText("<-");
            btnApagarUmaUnidade.addActionListener(this::btnApagarUmaUnidadeActionPerformed);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApagarUmaUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPorsentagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnApagarUmaUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPorsentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20))
            );

            btn1.getAccessibleContext().setAccessibleName("btn1");
            btn2.getAccessibleContext().setAccessibleName("btn2");
            btn3.getAccessibleContext().setAccessibleName("btn3");
            btn4.getAccessibleContext().setAccessibleName("btn4");
            btn5.getAccessibleContext().setAccessibleName("btn5");
            btn6.getAccessibleContext().setAccessibleName("btn6");
            btn7.getAccessibleContext().setAccessibleName("btn7");
            btn8.getAccessibleContext().setAccessibleName("btn8");
            btn9.getAccessibleContext().setAccessibleName("btn9");
            btn0.getAccessibleContext().setAccessibleName("btn0");
            btnIgual.getAccessibleContext().setAccessibleName("btn=");
            btnC.getAccessibleContext().setAccessibleName("btnC");
            btnMais.getAccessibleContext().setAccessibleName("btn+");
            btnMultiplicacao.getAccessibleContext().setAccessibleName("btnx");
            btnMenos.getAccessibleContext().setAccessibleName("btn-");
            btnPorsentagem.getAccessibleContext().setAccessibleName("btn%");
            btnDivisao.getAccessibleContext().setAccessibleName("btn\\");
                btnPonto.getAccessibleContext().setAccessibleName("btn.");
                btnApagarUmaUnidade.getAccessibleContext().setAccessibleName("btn<-");

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        String operacao  = lblTela.getText();
        operacao += "*";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        String operacao  = lblTela.getText();
        if(operacao != null && !operacao.isEmpty()){
            lblTela.setText(null);
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Expression e = new ExpressionBuilder(lblTela.getText()).build();
        lblTela.setText(Double.toString(e.evaluate()));
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        String operacao  = lblTela.getText();
        operacao += ".";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "9";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "8";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "7";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "6";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       String operacao  = lblTela.getText();
        operacao += "5";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "4";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       String operacao  = lblTela.getText();
        operacao += "3";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "2";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "1";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String operacao  = lblTela.getText();
        operacao += "0";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        String operacao  = lblTela.getText();
        operacao += "+";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        String operacao  = lblTela.getText();
        operacao += "-";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        String operacao  = lblTela.getText();
        operacao += "/";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnPorsentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorsentagemActionPerformed
       String operacao  = lblTela.getText();
        operacao += "%";
        lblTela.setText(operacao);
    }//GEN-LAST:event_btnPorsentagemActionPerformed

    private void btnApagarUmaUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarUmaUnidadeActionPerformed
        String operacao  = lblTela.getText();
        if(operacao != null && !operacao.isEmpty()){
            lblTela.setText(operacao.substring(0, operacao.length() - 1));
        }
    }//GEN-LAST:event_btnApagarUmaUnidadeActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JanelaCalculadora().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnApagarUmaUnidade;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorsentagem;
    private javax.swing.JButton jButton16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lblTela;
    // End of variables declaration//GEN-END:variables
}
