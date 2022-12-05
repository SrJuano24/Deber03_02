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
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juano
 */
public class Deber_03_02b extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Deber_03_02b(String title) throws HeadlessException {
        this.setTitle("BorderLayout");
        this.setSize(505, 920);
        this.setLocation(600, 0);
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
        this.jPanelList.get(1).setBounds(new Rectangle(3, 2, 485, 30));

        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(3).setBackground(new Color(0, 102, 153));
        this.jPanelList.get(3).setBounds(new Rectangle(20, 45, 68, 30));

        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(4).setBounds(new Rectangle(10, 85, 68, 30));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(5).setBounds(new Rectangle(250, 85, 215, 25));
        this.jPanelList.get(4).setBackground(Color.white);
        this.jPanelList.get(5).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(6).setBounds(new Rectangle(10, 120, 70, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(7).setBounds(new Rectangle(250, 120, 215, 25));
        this.jPanelList.get(6).setBackground(Color.white);
        this.jPanelList.get(7).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(8).setBounds(new Rectangle(10, 150, 100, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(9).setBounds(new Rectangle(250, 150, 215, 25));
        this.jPanelList.get(8).setBackground(Color.white);
        this.jPanelList.get(9).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(10));
        this.jPanelList.get(10).setBounds(new Rectangle(10, 180, 60, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(11));
        this.jPanelList.get(11).setBounds(new Rectangle(250, 180, 215, 25));
        this.jPanelList.get(10).setBackground(Color.white);
        this.jPanelList.get(11).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(12));
        this.jPanelList.get(12).setBounds(new Rectangle(10, 210, 190, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(13));
        this.jPanelList.get(13).setBounds(new Rectangle(250, 210, 215, 25));
        this.jPanelList.get(12).setBackground(Color.white);
        this.jPanelList.get(13).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(14));
        this.jPanelList.get(14).setBounds(new Rectangle(10, 240, 130, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(15));
        this.jPanelList.get(15).setBounds(new Rectangle(250, 240, 215, 25));
        this.jPanelList.get(14).setBackground(Color.white);
        this.jPanelList.get(15).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(16));
        this.jPanelList.get(16).setBounds(new Rectangle(10, 270, 130, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(17));
        this.jPanelList.get(17).setBounds(new Rectangle(250, 270, 215, 25));
        this.jPanelList.get(16).setBackground(Color.white);
        this.jPanelList.get(17).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(18));
        this.jPanelList.get(18).setBounds(new Rectangle(10, 300, 120, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(19));
        this.jPanelList.get(19).setBounds(new Rectangle(250, 300, 215, 25));
        this.jPanelList.get(18).setBackground(Color.white);
        this.jPanelList.get(19).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(20));
        this.jPanelList.get(20).setBounds(new Rectangle(10, 330, 75, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(21));
        this.jPanelList.get(21).setBounds(new Rectangle(250, 330, 215, 25));
        this.jPanelList.get(20).setBackground(Color.white);
        this.jPanelList.get(21).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(22));
        this.jPanelList.get(22).setBounds(new Rectangle(10, 410, 470, 30));
        this.jPanelList.get(22).setBackground(new Color(0, 102, 153));

        this.jPanelList.get(0).add(this.jPanelList.get(24));
        this.jPanelList.get(24).setBounds(new Rectangle(35, 450, 60, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(25));
        this.jPanelList.get(25).setBounds(new Rectangle(15, 470, 80, 25));
        this.jPanelList.get(24).setBackground(Color.white);
        this.jPanelList.get(25).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(26));
        this.jPanelList.get(26).setBounds(new Rectangle(115, 450, 80, 25));
        this.jPanelList.get(26).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(27));
        this.jPanelList.get(27).setBounds(new Rectangle(25, 510, 70, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(29));
        this.jPanelList.get(29).setBounds(new Rectangle(115, 505, 125, 30));
        this.jPanelList.get(27).setBackground(Color.white);
        this.jPanelList.get(29).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(28));
        this.jPanelList.get(28).setBounds(new Rectangle(10, 555, 85, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(30));
        this.jPanelList.get(30).setBounds(new Rectangle(110, 550, 120, 30));
        this.jPanelList.get(28).setBackground(Color.white);
        this.jPanelList.get(30).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(31));
        this.jPanelList.get(31).setBounds(new Rectangle(45, 600, 50, 30));
        this.jPanelList.get(0).add(this.jPanelList.get(32));
        this.jPanelList.get(32).setBounds(new Rectangle(115, 595, 150, 30));
        this.jPanelList.get(31).setBackground(Color.white);
        this.jPanelList.get(32).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(33));
        this.jPanelList.get(33).setBounds(new Rectangle(25, 650, 70, 30));
        this.jPanelList.get(0).add(this.jPanelList.get(34));
        this.jPanelList.get(34).setBounds(new Rectangle(115, 645, 150, 30));
        this.jPanelList.get(33).setBackground(Color.white);
        this.jPanelList.get(34).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(35));
        this.jPanelList.get(35).setBounds(new Rectangle(25, 700, 70, 30));
        this.jPanelList.get(0).add(this.jPanelList.get(36));
        this.jPanelList.get(36).setBounds(new Rectangle(115, 695, 100, 30));
        this.jPanelList.get(35).setBackground(Color.white);
        this.jPanelList.get(36).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(37));
        this.jPanelList.get(37).setBounds(new Rectangle(30, 750, 65, 30));
        this.jPanelList.get(0).add(this.jPanelList.get(38));
        this.jPanelList.get(38).setBounds(new Rectangle(30, 770, 65, 25));
        this.jPanelList.get(0).add(this.jPanelList.get(39));
        this.jPanelList.get(39).setBounds(new Rectangle(115, 750, 85, 30));
        this.jPanelList.get(0).add(this.jPanelList.get(40));
        this.jPanelList.get(40).setBounds(new Rectangle(380, 800, 85, 38));
        this.jPanelList.get(40).setBackground(Color.white);
        this.jPanelList.get(37).setBackground(Color.white);

        this.jPanelList.get(38).setBackground(Color.white);

        this.jPanelList.get(39).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(2).setBounds(new Rectangle(5, 55, 480, 320));
        this.jPanelList.get(2).setBackground(Color.white);
        this.jPanelList.get(2).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(23));
        this.jPanelList.get(23).setBounds(new Rectangle(5, 405, 480, 395));
        this.jPanelList.get(23).setBackground(Color.white);
        this.jPanelList.get(23).setBorder(new LineBorder(Color.GRAY));

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();

        this.jLabelList.add(new JLabel("DATOS PERSONALES"));
        this.jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(1).add(this.jLabelList.get(0));

        this.jLabelList.add(new JLabel("Personal"));
        this.jLabelList.get(1).setForeground(Color.white);
        this.jLabelList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(3).add(this.jLabelList.get(1));

        this.jLabelList.add(new JLabel("Apellidos:"));
        this.jLabelList.get(2).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(4).add(this.jLabelList.get(2));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(5).add(this.jTextFieldList.get(0));

        this.jLabelList.add(new JLabel("Nombres:"));
        this.jLabelList.get(3).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(6).add(this.jLabelList.get(3));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(7).add(this.jTextFieldList.get(1));

        this.jLabelList.add(new JLabel("Nacionalidad:"));
        this.jLabelList.get(4).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(8).add(this.jLabelList.get(4));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(9).add(this.jTextFieldList.get(2));

        this.jLabelList.add(new JLabel("Genero:"));
        this.jLabelList.get(5).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(10).add(this.jLabelList.get(5));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(11).add(this.jTextFieldList.get(3));

        this.jLabelList.add(new JLabel("Correo electronico personal:"));
        this.jLabelList.get(6).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(12).add(this.jLabelList.get(6));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(13).add(this.jTextFieldList.get(4));

        this.jLabelList.add(new JLabel("Fecha Nacimiento:"));
        this.jLabelList.get(7).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(14).add(this.jLabelList.get(7));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(15).add(this.jTextFieldList.get(5));

        this.jLabelList.add(new JLabel("Telefono Domicilio:"));
        this.jLabelList.get(8).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(16).add(this.jLabelList.get(8));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(17).add(this.jTextFieldList.get(6));

        this.jLabelList.add(new JLabel("Telefono Celular:"));
        this.jLabelList.get(9).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(18).add(this.jLabelList.get(9));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(19).add(this.jTextFieldList.get(7));

        this.jLabelList.add(new JLabel("Whatsapp:"));
        this.jLabelList.get(10).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(20).add(this.jLabelList.get(10));

        this.jTextFieldList.add(new JTextField(20));
        this.jPanelList.get(21).add(this.jTextFieldList.get(8));

        this.jLabelList.add(new JLabel("INFORMACION DE LA CARRERA"));
        this.jLabelList.get(11).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(22).add(this.jLabelList.get(11));
        this.jLabelList.get(11).setForeground(Color.white);

        this.jLabelList.add(new JLabel("Periodo"));
        this.jLabelList.get(12).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(24).add(this.jLabelList.get(12));

        this.jLabelList.add(new JLabel("Academico:"));
        this.jLabelList.get(13).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(25).add(this.jLabelList.get(13));

        this.jLabelList.add(new JLabel("2022 - 2023"));
        this.jLabelList.get(14).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(26).add(this.jLabelList.get(14));

        this.jLabelList.add(new JLabel("Carrera: *"));
        this.jLabelList.get(15).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(27).add(this.jLabelList.get(15));

        this.jLabelList.add(new JLabel("Modalidad: *"));
        this.jLabelList.get(16).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(28).add(this.jLabelList.get(16));

        this.jLabelList.add(new JLabel("Sede: *"));
        this.jLabelList.get(17).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(31).add(this.jLabelList.get(17));

        this.jLabelList.add(new JLabel("Campus: *"));
        this.jLabelList.get(18).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(33).add(this.jLabelList.get(18));

        this.jLabelList.add(new JLabel("Jornada: *"));
        this.jLabelList.get(19).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(35).add(this.jLabelList.get(19));

        this.jLabelList.add(new JLabel("Fecha de "));
        this.jLabelList.get(20).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(37).add(this.jLabelList.get(20));

        this.jLabelList.add(new JLabel("Registro:"));
        this.jLabelList.get(21).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(38).add(this.jLabelList.get(21));

        this.jLabelList.add(new JLabel("04/12/2022"));
        this.jLabelList.get(22).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(39).add(this.jLabelList.get(22));

    }

    public void iniciarJComboBox() {
        this.jComboBoxList = new ArrayList<>();
        var listaAsignaturas = new String[4];
        listaAsignaturas[0] = "ARQUTECTURA";
        listaAsignaturas[1] = "ELECTRONICA";
        listaAsignaturas[2] = "ELECTRICIDAD";
        listaAsignaturas[3] = "BIOMEDICINA";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaAsignaturas)));
        this.jComboBoxList.get(0).setBackground(Color.white);
        this.jPanelList.get(29).add(this.jComboBoxList.get(0));

        var listamodaliad = new String[2];
        listamodaliad[0] = "PRESENCIAL";
        listamodaliad[1] = "VIRTAL";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listamodaliad)));
        this.jComboBoxList.get(1).setBackground(Color.white);
        this.jPanelList.get(30).add(this.jComboBoxList.get(1));

        var listaCedes = new String[3];
        listaCedes[0] = "MATRIZ CUENCA";
        listaCedes[1] = "MATRIZ QUITO";
        listaCedes[2] = "MATRIZ GUAYAQUIL";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCedes)));
        this.jComboBoxList.get(2).setBackground(Color.white);
        this.jPanelList.get(32).add(this.jComboBoxList.get(2));

        var listaCampus = new String[3];
        listaCampus[0] = "EL VECINO";
        listaCampus[1] = "MATRIZ QUITO";
        listaCampus[2] = "MATRIZ GUAYAQUIL";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCampus)));
        this.jComboBoxList.get(3).setBackground(Color.white);
        this.jPanelList.get(34).add(this.jComboBoxList.get(3));

        var listaJornada = new String[2];
        listaJornada[0] = "MATUTINA";
        listaJornada[1] = "NOCTURNA";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaJornada)));
        this.jComboBoxList.get(4).setBackground(Color.white);
        this.jPanelList.get(36).add(this.jComboBoxList.get(4));

    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        this.jButtonList.get(0).setFont((new Font("Times New Roman", Font.ITALIC, 17)));
        this.jButtonList.get(0).setForeground(Color.white);
        this.jButtonList.get(0).setBackground(new Color(0, 102, 153));
        this.jPanelList.get(40).add(this.jButtonList.get(0));

    }
}
