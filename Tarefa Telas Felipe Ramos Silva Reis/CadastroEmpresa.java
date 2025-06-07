package swingpoo;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import static swingpoo.Tela.mascara;

/**
 *
 * @author aluno
 */
public class CadastroEmpresa {
    
    public static void montarTelaCadastro() throws IOException{
        final JFrame oJFrameCadastro = new JFrame("Cadastro de Empresa");
        
        oJFrameCadastro.setBounds(450,170,580,500);
        oJFrameCadastro.setLayout(null);
        
        JLabel oJLabelCNPJ = new JLabel("CNPJ");
        oJLabelCNPJ.setBounds(10,10,60,25);
        oJLabelCNPJ.setHorizontalAlignment(JLabel.RIGHT);
        oJFrameCadastro.add(oJLabelCNPJ);
        
        JFormattedTextField oJTextFieldCNPJ = new JFormattedTextField(mascara("##.###.###/#####-#:#"));
        oJTextFieldCNPJ.setBounds(75,10,120,25);
        oJTextFieldCNPJ.setLayout(null);
        oJFrameCadastro.add(oJTextFieldCNPJ);
        
        JLabel oJLabelRZSoc = new JLabel("RZ.Soc:");
        oJLabelRZSoc.setBounds(10,40,60,25);
        oJLabelRZSoc.setHorizontalAlignment(JLabel.RIGHT);
        oJFrameCadastro.add(oJLabelRZSoc);
        
        final JTextField oJTextFieldRZSoc = new JTextField();
        oJTextFieldRZSoc.setBounds(75,40,400,25);
        oJTextFieldRZSoc.setLayout(null);
        oJFrameCadastro.add(oJTextFieldRZSoc);
        
        JLabel oJLabelTipo = new JLabel("Tipo:");
        oJLabelTipo.setBounds(300,75,40,25);
        oJLabelTipo.setHorizontalAlignment(JLabel.RIGHT);
        oJFrameCadastro.add(oJLabelTipo);
        
        final JComboBox<String> oJComboBox = new JComboBox<>();
        oJComboBox.setBounds(353,75,120,25);
        oJComboBox.addItem("-Selecione-");
        oJComboBox.addItem("LTDA");
        oJComboBox.addItem("MEI");
        oJFrameCadastro.add(oJComboBox);
        
        JLabel oJLabelDataFund = new JLabel("DT Fund:");
        oJLabelDataFund.setBounds(10,75,60,25);
        oJLabelDataFund.setHorizontalAlignment(JLabel.RIGHT);
        oJFrameCadastro.add(oJLabelDataFund);
        
        final JFormattedTextField oJTextFieldDataFund = new JFormattedTextField(mascara("##/##/####"));
        
        oJTextFieldDataFund.setBounds(75,75,120,25);
        oJTextFieldDataFund.setLayout(null);
        oJFrameCadastro.add(oJTextFieldDataFund);
        
        JButton oJButtonGravar = newJButton("Gravar");
        
        oJFrameCadastro.setVisible(true);
    }
}
