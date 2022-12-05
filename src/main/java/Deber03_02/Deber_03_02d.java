/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber03_02;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
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
import javax.swing.border.LineBorder;

/**
 *
 * @author Juano
 */
public class Deber_03_02d extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Deber_03_02d(String title) throws HeadlessException {
        this.setTitle("Grid Layout");
        this.setSize(1140, 230);
        this.setLocation(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJComboBox();

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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(null);
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(3).setBackground(Color.white);
        this.jPanelList.get(3).setBounds(new Rectangle(20, 35, 200, 35));
        this.jPanelList.get(3).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(4).setBackground(Color.white);
        this.jPanelList.get(4).setBounds(new Rectangle(230, 35, 290, 35));
        this.jPanelList.get(4).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(5).setBackground(Color.white);
        this.jPanelList.get(5).setBounds(new Rectangle(530, 35, 250, 35));
        this.jPanelList.get(5).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(6).setBackground(Color.white);
        this.jPanelList.get(6).setBounds(new Rectangle(20, 75, 530, 35));
        this.jPanelList.get(6).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(7).setBackground(Color.white);
        this.jPanelList.get(7).setBounds(new Rectangle(560, 75, 230, 35));
        this.jPanelList.get(7).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(8).setBackground(Color.white);
        this.jPanelList.get(8).setBounds(new Rectangle(800, 75, 290, 35));
        this.jPanelList.get(8).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(9).setBackground(Color.white);
        this.jPanelList.get(9).setBounds(new Rectangle(20, 120, 430, 35));
        this.jPanelList.get(9).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(2).setBounds(new Rectangle(10, 10, 1100, 170));
        this.jPanelList.get(2).setBackground(Color.white);
        this.jPanelList.get(2).setBorder(new LineBorder(Color.GRAY));

    }

    public void iniciarJComboBox() {
        this.jComboBoxList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        var listaCedes = new String[3];
        listaCedes[0] = "MATRIZ CUENCA";
        listaCedes[1] = "MATRIZ QUITO";
        listaCedes[2] = "MATRIZ GUAYAQUIL";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCedes)));
        this.jLabelList.add(new JLabel("Sede:"));
        this.jComboBoxList.get(0).setBackground(Color.white);
        this.jLabelList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(3).add(this.jLabelList.get(0));
        this.jPanelList.get(3).add(this.jComboBoxList.get(0));

        var listaCampus = new String[3];
        listaCampus[0] = "EL VECINO";
        listaCampus[1] = "MATRIZ QUITO";
        listaCampus[2] = "MATRIZ GUAYAQUIL";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCampus)));
        this.jLabelList.add(new JLabel("Campus/Extension:"));
        this.jLabelList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(4).add(this.jLabelList.get(1));
        this.jComboBoxList.get(1).setBackground(Color.white);
        this.jPanelList.get(4).add(this.jComboBoxList.get(1));

        var listaAsignaturas = new String[4];
        listaAsignaturas[0] = "AGROPECUARIA                 ";
        listaAsignaturas[1] = "ELECTRONICA                  ";
        listaAsignaturas[2] = "ELECTRICIDAD                 ";
        listaAsignaturas[3] = "BIOMEDICINA                  ";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaAsignaturas)));
        this.jLabelList.add(new JLabel("Carrera:"));
        this.jComboBoxList.get(2).setBackground(Color.white);
        this.jLabelList.get(2).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(5).add(this.jLabelList.get(2));
        this.jPanelList.get(5).add(this.jComboBoxList.get(2));

        var listacodigo = new String[4];
        listacodigo[0] = "AGROPECUARIA [REDISEÑO]-NUEVA O REDISEÑO                   ";
        listacodigo[1] = "ELECTRONICA [REDISEÑO]-NUEVA O REDISEÑO                  ";
        listacodigo[2] = "ELECTRICIDAD [REDISEÑO]-NUEVA O REDISEÑO                 ";
        listacodigo[3] = "BIOMEDICINA [REDISEÑO]-NUEVA O REDISEÑO                  ";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listacodigo)));
        this.jComboBoxList.get(3).setBackground(Color.white);
        this.jLabelList.add(new JLabel("Codigo del Proyecto"));
        this.jLabelList.get(3).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(6).add(this.jLabelList.get(3));
        this.jPanelList.get(6).add(this.jComboBoxList.get(3));

        var listamodalidad = new String[2];
        listamodalidad[0] = "PRESENCIAL           ";
        listamodalidad[1] = "VIRTUAL              ";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listamodalidad)));
        this.jLabelList.add(new JLabel("Modalidad"));
        this.jComboBoxList.get(4).setBackground(Color.white);
        this.jLabelList.get(4).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(7).add(this.jLabelList.get(4));
        this.jPanelList.get(7).add(this.jComboBoxList.get(4));

        var listaperiodo = new String[2];
        listaperiodo[0] = "2021 - 2022        ";
        listaperiodo[1] = "2022 - 2023        ";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaperiodo)));
        this.jLabelList.add(new JLabel("Periodo Académico"));
        this.jComboBoxList.get(5).setBackground(Color.white);
        this.jLabelList.get(5).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(8).add(this.jLabelList.get(5));
        this.jPanelList.get(8).add(this.jComboBoxList.get(5));

        this.jLabelList.add(new JLabel("Fecha Inicio Clases: 20/03/2022 al 06/08/2022"));
        this.jLabelList.get(6).setFont((new Font("Agency FB", Font.BOLD, 20)));
        this.jPanelList.get(9).add(this.jLabelList.get(6));

    }
}
