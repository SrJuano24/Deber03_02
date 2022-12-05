/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber03_02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import p61.unidad03_03vista.*;
import p61.unidad03_02vista.*;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Juano
 */
public class Deber_03_02a extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Deber_03_02a(String title) throws HeadlessException {
        this.setTitle("BorderLayout");
        this.setSize(375, 300);
        this.setLocation(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJTextFields();
        this.iniciarJComboBox();
        this.iniciarJButtons();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);

    }

    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(null);
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).setBackground(Color.white);
        
        this.jPanelList.get(1).setBackground(new Color(0, 102, 153));
        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(1).setBounds(new Rectangle(3, 2, 356, 35));

        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(2).setBounds(new Rectangle(3, 50, 110, 20));
        this.jPanelList.get(2).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(3).setBounds(new Rectangle(5, 68, 50, 20));
        this.jPanelList.get(3).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(4).setBounds(new Rectangle(140, 50, 150, 30));
        this.jPanelList.get(4).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(5).setBounds(new Rectangle(5, 110, 120, 25));
        this.jPanelList.get(5).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(6).setBounds(new Rectangle(143, 105, 105, 30));
        this.jPanelList.get(6).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(7).setBounds(new Rectangle(5, 155, 80, 25));
        this.jPanelList.get(7).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(8).setBounds(new Rectangle(5, 180, 110, 25));
        this.jPanelList.get(8).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(9).setBounds(new Rectangle(140, 163, 215, 25));
        this.jPanelList.get(9).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(10));
        this.jPanelList.get(10).setBounds(new Rectangle(130, 220, 100, 38));
        this.jPanelList.get(10).setBackground(Color.white);
    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();

        this.jLabelList.add(new JLabel("INSCRIBETE"));
        this.jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 20)));
        this.jPanelList.get(1).add(this.jLabelList.get(0));

        this.jLabelList.add(new JLabel("Ingrese su"));
        this.jLabelList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(7).add(this.jLabelList.get(1));

        this.jLabelList.add(new JLabel("Identificacion:*"));
        this.jLabelList.get(2).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(8).add(this.jLabelList.get(2));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(9).add(this.jTextFieldList.get(0));

    }

    public void iniciarJComboBox() {

        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Seleccione una"));
        this.jLabelList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(2).add(this.jLabelList.get(0));

        this.jLabelList.add(new JLabel("Sede:*"));
        this.jLabelList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(3).add(this.jLabelList.get(1));

        this.jLabelList.add(new JLabel("Tipo Documento:"));
        this.jLabelList.get(2).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(5).add(this.jLabelList.get(2));

        this.jComboBoxList = new ArrayList<>();
        var listaCedes = new String[3];
        listaCedes[0] = "MATRIZ CUENCA";
        listaCedes[1] = "MATRIZ QUITO";
        listaCedes[2] = "MATRIZ GUAYAQUIL";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCedes)));
        this.jPanelList.get(4).add(this.jComboBoxList.get(0));

        var listaDocumento = new String[2];
        listaDocumento[0] = "CEDULA";
        listaDocumento[1] = "PASAPORTE";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaDocumento)));
        this.jPanelList.get(6).add(this.jComboBoxList.get(1));

    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        this.jButtonList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 17)));
        this.jPanelList.get(10).add(this.jButtonList.get(0));

    }
}
