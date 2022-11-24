/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Juano
 */
public class Deber_03_01b extends JFrame {

    private List<JPanel> jPanelList;

    public Deber_03_01b() throws HeadlessException {
        this.setTitle("GridLayout");
        this.setSize(350, 200);
        this.setLocation(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.setContentPane(this.jPanelList.get(39));
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

        this.jPanelList.get(0).setBackground(Color.lightGray);
        this.jPanelList.get(0).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(0).add(new JLabel("Button 1"));

        this.jPanelList.get(1).setBackground(Color.lightGray);
        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(1).add(new JLabel("Button 2"));

        this.jPanelList.get(2).setBackground(Color.lightGray);
        this.jPanelList.get(2).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(2).add(new JLabel("Button 3"));

        this.jPanelList.get(3).setBackground(Color.lightGray);
        this.jPanelList.get(3).add(new JLabel("Long-Named Button4"));
        this.jPanelList.get(3).setBorder(new BevelBorder(BevelBorder.RAISED));

        this.jPanelList.get(4).setBackground(Color.lightGray);
        this.jPanelList.get(4).add(new JLabel("Button5"));
        this.jPanelList.get(4).setBorder(new BevelBorder(BevelBorder.RAISED));

        this.jPanelList.get(5).setBackground(Color.lightGray);
        this.jPanelList.get(5).add(new JLabel(""));

        this.jPanelList.get(6).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(7).setBackground(Color.lightGray);
        this.jPanelList.get(8).setBackground(Color.lightGray);
        this.jPanelList.get(9).setBackground(Color.lightGray);

        this.jPanelList.get(10).setBackground(Color.lightGray);
        this.jPanelList.get(11).setBackground(Color.lightGray);
        this.jPanelList.get(12).setBackground(Color.lightGray);
        this.jPanelList.get(13).setBackground(Color.lightGray);

        this.jPanelList.get(14).setBackground(Color.lightGray);
        this.jPanelList.get(15).setBackground(Color.lightGray);
        this.jPanelList.get(16).setBackground(Color.lightGray);
        this.jPanelList.get(17).setBackground(Color.lightGray);

        this.jPanelList.get(18).setBackground(Color.lightGray);
        this.jPanelList.get(19).setBackground(Color.lightGray);
        this.jPanelList.get(20).setBackground(Color.lightGray);
        this.jPanelList.get(21).setBackground(Color.lightGray);

        this.jPanelList.get(22).setBackground(Color.lightGray);
        this.jPanelList.get(23).setBackground(Color.lightGray);
        this.jPanelList.get(24).setBackground(Color.lightGray);
        this.jPanelList.get(25).setBackground(Color.lightGray);

        this.jPanelList.get(26).setBackground(Color.lightGray);
        this.jPanelList.get(27).setBackground(Color.lightGray);
        this.jPanelList.get(28).setBackground(Color.lightGray);
        this.jPanelList.get(29).setBackground(Color.lightGray);

        this.jPanelList.get(30).setLayout(new BorderLayout());
        this.jPanelList.get(30).add(this.jPanelList.get(0), BorderLayout.CENTER);
        this.jPanelList.get(30).add(this.jPanelList.get(6), BorderLayout.NORTH);
        this.jPanelList.get(30).add(this.jPanelList.get(7), BorderLayout.EAST);
        this.jPanelList.get(30).add(this.jPanelList.get(8), BorderLayout.SOUTH);
        this.jPanelList.get(30).add(this.jPanelList.get(9), BorderLayout.WEST);

        this.jPanelList.get(31).setLayout(new BorderLayout());
        this.jPanelList.get(31).add(this.jPanelList.get(1), BorderLayout.CENTER);
        this.jPanelList.get(31).add(this.jPanelList.get(10), BorderLayout.NORTH);
        this.jPanelList.get(31).add(this.jPanelList.get(11), BorderLayout.EAST);
        this.jPanelList.get(31).add(this.jPanelList.get(12), BorderLayout.SOUTH);
        this.jPanelList.get(31).add(this.jPanelList.get(13), BorderLayout.WEST);

        this.jPanelList.get(32).setLayout(new BorderLayout());
        this.jPanelList.get(32).add(this.jPanelList.get(2), BorderLayout.CENTER);
        this.jPanelList.get(32).add(this.jPanelList.get(14), BorderLayout.NORTH);
        this.jPanelList.get(32).add(this.jPanelList.get(15), BorderLayout.EAST);
        this.jPanelList.get(32).add(this.jPanelList.get(16), BorderLayout.SOUTH);
        this.jPanelList.get(32).add(this.jPanelList.get(17), BorderLayout.WEST);

        this.jPanelList.get(33).setLayout(new BorderLayout());
        this.jPanelList.get(33).add(this.jPanelList.get(3), BorderLayout.CENTER);
        this.jPanelList.get(33).add(this.jPanelList.get(18), BorderLayout.NORTH);
        this.jPanelList.get(33).add(this.jPanelList.get(19), BorderLayout.EAST);
        this.jPanelList.get(33).add(this.jPanelList.get(20), BorderLayout.SOUTH);
        this.jPanelList.get(33).add(this.jPanelList.get(21), BorderLayout.WEST);

        this.jPanelList.get(34).setLayout(new BorderLayout());
        this.jPanelList.get(34).add(this.jPanelList.get(4), BorderLayout.CENTER);
        this.jPanelList.get(34).add(this.jPanelList.get(22), BorderLayout.NORTH);
        this.jPanelList.get(34).add(this.jPanelList.get(23), BorderLayout.EAST);
        this.jPanelList.get(34).add(this.jPanelList.get(24), BorderLayout.SOUTH);
        this.jPanelList.get(34).add(this.jPanelList.get(25), BorderLayout.WEST);
        
         this.jPanelList.get(35).setLayout(new BorderLayout());
        this.jPanelList.get(35).add(this.jPanelList.get(5), BorderLayout.CENTER);
        this.jPanelList.get(35).add(this.jPanelList.get(26), BorderLayout.NORTH);
        this.jPanelList.get(35).add(this.jPanelList.get(27), BorderLayout.EAST);
        this.jPanelList.get(35).add(this.jPanelList.get(28), BorderLayout.SOUTH);
        this.jPanelList.get(35).add(this.jPanelList.get(29), BorderLayout.WEST);


        this.jPanelList.get(36).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(36).add(this.jPanelList.get(30));
        this.jPanelList.get(36).add(this.jPanelList.get(31));

        this.jPanelList.get(37).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(37).add(this.jPanelList.get(32));
        this.jPanelList.get(37).add(this.jPanelList.get(33));

        this.jPanelList.get(38).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(38).add(this.jPanelList.get(34));
        this.jPanelList.get(38).add(this.jPanelList.get(35));

        this.jPanelList.get(39).setLayout(new GridLayout(3, 1));
        this.jPanelList.get(39).add(this.jPanelList.get(36));
        this.jPanelList.get(39).add(this.jPanelList.get(37));
        this.jPanelList.get(39).add(this.jPanelList.get(38));

    }

}
