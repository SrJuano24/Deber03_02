/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber03_02;

import java.awt.Color;
import java.awt.FlowLayout;
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
public class Deber_03_02c extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Deber_03_02c(String title) throws HeadlessException {
        this.setTitle("Grid Layout");
        this.setSize(830, 650);
        this.setLocation(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJlabels();
        this.iniciarJComboBox();
        this.iniciarJButtons();
        this.iniciarJTextFields();
        this.iniciarJCheckBox();

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
        this.jPanelList.get(1).setBounds(new Rectangle(3, 2, 810, 35));

        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(2).setBounds(new Rectangle(15, 45, 300, 30));
        this.jPanelList.get(2).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(9).setBounds(new Rectangle(305, 45, 500, 30));
        this.jPanelList.get(9).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(9).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(3).setBounds(new Rectangle(15, 75, 300, 30));
        this.jPanelList.get(3).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
        this.jPanelList.get(10).setBounds(new Rectangle(305, 75, 500, 30));
        this.jPanelList.get(10).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(10).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(4).setBounds(new Rectangle(15, 104, 300, 30));
        this.jPanelList.get(4).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(11));
        this.jPanelList.get(11).setBounds(new Rectangle(305, 104, 500, 30));
        this.jPanelList.get(11).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(11).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(5).setBounds(new Rectangle(15, 134, 300, 30));
        this.jPanelList.get(5).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(15));
        this.jPanelList.get(15).setBounds(new Rectangle(305, 134, 500, 30));
        this.jPanelList.get(15).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(15).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(6).setBounds(new Rectangle(15, 164, 300, 30));
        this.jPanelList.get(6).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(12));
        this.jPanelList.get(12).setBounds(new Rectangle(305, 164, 500, 30));
        this.jPanelList.get(12).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(12).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(7).setBounds(new Rectangle(15, 194, 300, 30));
        this.jPanelList.get(7).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(13));
        this.jPanelList.get(13).setBounds(new Rectangle(305, 194, 500, 30));
        this.jPanelList.get(13).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(13).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(8).setBounds(new Rectangle(15, 224, 300, 30));
        this.jPanelList.get(8).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(14));
        this.jPanelList.get(14).setBounds(new Rectangle(305, 224, 500, 30));
        this.jPanelList.get(14).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(14).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(30));
        this.jPanelList.get(30).setBounds(new Rectangle(325, 260, 470, 45));
        this.jPanelList.get(30).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(30).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(31));
        this.jPanelList.get(31).setBounds(new Rectangle(325, 305, 470, 23));
        this.jPanelList.get(31).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(16));
        this.jPanelList.get(16).setBounds(new Rectangle(15, 254, 300, 80));
        this.jPanelList.get(16).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(29));
        this.jPanelList.get(29).setBounds(new Rectangle(305, 254, 500, 80));
        this.jPanelList.get(29).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(29).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(17));
        this.jPanelList.get(17).setBounds(new Rectangle(15, 334, 300, 30));
        this.jPanelList.get(17).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(18));
        this.jPanelList.get(18).setBounds(new Rectangle(305, 334, 500, 30));
        this.jPanelList.get(18).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(18).setBackground(Color.white);
        this.jPanelList.get(18).setLayout(new FlowLayout());

        this.jPanelList.get(0).add(this.jPanelList.get(19));
        this.jPanelList.get(19).setBounds(new Rectangle(15, 364, 300, 40));
        this.jPanelList.get(19).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(20));
        this.jPanelList.get(20).setBounds(new Rectangle(305, 364, 500, 40));
        this.jPanelList.get(20).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(20).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(21));
        this.jPanelList.get(21).setBounds(new Rectangle(15, 404, 300, 40));
        this.jPanelList.get(21).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(22));
        this.jPanelList.get(22).setBounds(new Rectangle(305, 404, 500, 40));
        this.jPanelList.get(22).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(22).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(23));
        this.jPanelList.get(23).setBounds(new Rectangle(15, 444, 300, 40));
        this.jPanelList.get(23).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(24));
        this.jPanelList.get(24).setBounds(new Rectangle(305, 444, 500, 40));
        this.jPanelList.get(24).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(24).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(25));
        this.jPanelList.get(25).setBounds(new Rectangle(15, 484, 300, 40));
        this.jPanelList.get(25).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(26));
        this.jPanelList.get(26).setBounds(new Rectangle(305, 484, 500, 40));
        this.jPanelList.get(26).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(26).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(27));
        this.jPanelList.get(27).setBounds(new Rectangle(15, 554, 100, 40));
        this.jPanelList.get(27).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(28));
        this.jPanelList.get(28).setBounds(new Rectangle(125, 554, 100, 40));
        this.jPanelList.get(28).setBackground(Color.white);

    }

    public void iniciarJlabels() {
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();

        this.jLabelList.add(new JLabel("CREAR GRUPO"));
        this.jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 20)));
        this.jPanelList.get(1).add(this.jLabelList.get(0));

        this.jLabelList.add(new JLabel("Periodo Academico:                                     "));
        this.jLabelList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(2).add(this.jLabelList.get(1));

        this.jLabelList.add(new JLabel("Sede:                                                             "));
        this.jLabelList.get(2).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(3).add(this.jLabelList.get(2));

        this.jLabelList.add(new JLabel("Campus/Extension:                                      "));
        this.jLabelList.get(3).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(4).add(this.jLabelList.get(3));

        this.jLabelList.add(new JLabel("Modalidad:                                                   "));
        this.jLabelList.get(4).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(5).add(this.jLabelList.get(4));

        this.jLabelList.add(new JLabel("Carrera:                                                       "));
        this.jLabelList.get(5).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(6).add(this.jLabelList.get(5));

        this.jLabelList.add(new JLabel("Código de Proyecto:                                   "));
        this.jLabelList.get(6).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(7).add(this.jLabelList.get(6));

        this.jLabelList.add(new JLabel("Asignatura:                                                 "));
        this.jLabelList.get(7).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(8).add(this.jLabelList.get(7));

        this.jLabelList.add(new JLabel("2022-2023                                                                                             "));
        this.jLabelList.get(8).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(9).add(this.jLabelList.get(8));

        this.jLabelList.add(new JLabel("MATRIZ CUENCA                                                                              "));
        this.jLabelList.get(9).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(10).add(this.jLabelList.get(9));

        this.jLabelList.add(new JLabel("EL VECINO                                                                                        "));
        this.jLabelList.get(10).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(11).add(this.jLabelList.get(10));

        this.jLabelList.add(new JLabel("PRESENCIAL                                                                                     "));
        this.jLabelList.get(11).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(15).add(this.jLabelList.get(11));

        this.jLabelList.add(new JLabel("AGROPECUARIA                                                                              "));
        this.jLabelList.get(12).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(12).add(this.jLabelList.get(12));

        this.jLabelList.add(new JLabel("AGROPECUARIA[REDISEÑO]-NUEVA O REDISEÑO                "));
        this.jLabelList.get(13).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(13).add(this.jLabelList.get(13));

        this.jLabelList.add(new JLabel("E-CV-IAG-003-BOTÁNICA                                                              "));
        this.jLabelList.get(14).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(14).add(this.jLabelList.get(14));

        this.jLabelList.add(new JLabel("Cupos por Grupo: *                                   "));
        this.jLabelList.get(15).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(17).add(this.jLabelList.get(15));

        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100:         "));
        this.jLabelList.get(16).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(19).add(this.jLabelList.get(16));

        this.jLabelList.add(new JLabel("Seleccionar Jornada del Grupo:               "));
        this.jLabelList.get(17).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(21).add(this.jLabelList.get(17));

        this.jLabelList.add(new JLabel("Oferta para estudiantes:                          "));
        this.jLabelList.get(18).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(23).add(this.jLabelList.get(18));

        this.jLabelList.add(new JLabel("Aplica cambio de Grupo:                         "));
        this.jLabelList.get(19).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(25).add(this.jLabelList.get(19));

        this.jLabelList.add(new JLabel("GRUPO - 1                                                                                            "));
        this.jLabelList.get(20).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(30).add(this.jLabelList.get(20));

        this.jLabelList.add(new JLabel("Nombre de Grupo: *                                  "));
        this.jLabelList.get(21).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(16).add(this.jLabelList.get(21));

        this.jLabelList.add(new JLabel("91 caracteres restantes.                                                                                "));
        this.jLabelList.get(22).setFont((new Font("Times New Roman", Font.BOLD, 14)));
        this.jPanelList.get(31).add(this.jLabelList.get(22));

    }

    public void iniciarJTextFields() {
        this.jTextFieldList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(20));
        this.jLabelList.add(new JLabel("                                                                           "));
        this.jPanelList.get(18).add(this.jTextFieldList.get(0));
        this.jPanelList.get(18).add(this.jLabelList.get(0));
    }

    public void iniciarJComboBox() {
        this.jLabelList = new ArrayList<>();
        this.jComboBoxList = new ArrayList<>();
        var listaAutorizacion = new String[2];
        listaAutorizacion[0] = "SI";
        listaAutorizacion[1] = "NO";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaAutorizacion)));
        this.jComboBoxList.get(0).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                                             "));
        this.jPanelList.get(20).add(this.jComboBoxList.get(0));
        this.jPanelList.get(20).add(this.jLabelList.get(0));

        var listaJornada = new String[2];
        listaJornada[0] = "MATUTINA";
        listaJornada[1] = "VESPERTINA";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaJornada)));
        this.jComboBoxList.get(1).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                            "));
        this.jPanelList.get(22).add(this.jComboBoxList.get(1));
        this.jPanelList.get(22).add(this.jLabelList.get(1));

        var listaCambio = new String[2];
        listaCambio[0] = "SI";
        listaCambio[1] = "NO";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCambio)));
        this.jComboBoxList.get(2).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                                             "));

        this.jPanelList.get(26).add(this.jComboBoxList.get(2));
        this.jPanelList.get(26).add(this.jLabelList.get(2));
    }

    public void iniciarJCheckBox() {

        this.jCheckBoxList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jCheckBoxList.add(new JCheckBox("Nuevos"));
        this.jCheckBoxList.get(0).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                                        "));
        this.jPanelList.get(24).add(this.jCheckBoxList.get(0));
        this.jPanelList.get(24).add(this.jLabelList.get(0));
    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 17)));
        this.jButtonList.get(0).setBackground(new Color(0, 102, 153));
        this.jButtonList.get(0).setForeground(Color.white);
        this.jPanelList.get(27).add(this.jButtonList.get(0));

        this.jButtonList.add(new JButton("Cancelar"));
        this.jButtonList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 17)));
        this.jButtonList.get(1).setBackground(new Color(0, 102, 153));
        this.jButtonList.get(1).setForeground(Color.white);
        this.jPanelList.get(28).add(this.jButtonList.get(1));

    }

}
