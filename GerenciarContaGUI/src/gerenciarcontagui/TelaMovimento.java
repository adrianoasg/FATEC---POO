package gerenciarcontagui;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaMovimento extends JFrame 
    implements WindowListener, ActionListener {
    //Definir atributos
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    protected Dimension dLabel, dTextField, dFrame, dTextArea, dButton;
    protected Caixa mCaixa;
    
    //Construtor da classe
    public TelaMovimento(){
        mCaixa = new Caixa();
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        
        this.setTitle("Controle de Caixa"); //Titulo janela
        this.setResizable(false); //não redimensioar janela
        this.setSize(dFrame); //Definir o tamanho
        this.setLocation(400, 200); //Localização da janela
        this.setLayout(null); //Resp. prog. definir onde vao os objetos
        
        //DEfinir os elementos da tela
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        this.add(lblValor);
        
        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        this.add(lblSaldo);
        
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        this.add(txtValor);
        
        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        this.add(txtSaldo);
        
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        this.add(cmdEntrada);
        cmdEntrada.addActionListener(this);
        
        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        this.add(cmdRetirada);
        cmdRetirada.addActionListener(this);
        
        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        this.add(cmdConsulta);
        cmdConsulta.addActionListener(this);
        
        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180,185);
        this.add(cmdSair);
        cmdSair.addActionListener(this);
        
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        this.add(txtMsg);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
       
    }

    @Override
    public void windowClosing(WindowEvent e) {
         //Depois da janela fechada
        System.exit(0); //Encerra o programa.
    }

    @Override
    public void windowClosed(WindowEvent e) {
       
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
   
    }

    @Override
    public void windowActivated(WindowEvent e) {
   
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double valor=0;
        if(e.getSource()==cmdSair){
            JOptionPane.showMessageDialog(null, "Fechando o programa");
            System.exit(0);
        }
        if(e.getSource()==cmdEntrada){
            valor = Double.parseDouble(txtValor.getText());
            String retorno = mCaixa.depositar(valor);
            txtMsg.append(retorno + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==cmdRetirada){
            valor = Double.parseDouble(txtValor.getText());
            String retorno ="";
            try {
                retorno = mCaixa.sacar(valor);
            } catch (SemSaldoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            txtMsg.append(retorno + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(String.valueOf(mCaixa.getSaldo()));
            txtMsg.append("Consulta Realizada \n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
        
    }
    
}
