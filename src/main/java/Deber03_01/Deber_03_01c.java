/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber03_01;

import java.awt.BorderLayout;
import java.awt.Color;
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
public class Deber_03_01c extends JFrame {

    private List<JPanel> jPanelList;

    public Deber_03_01c() throws HeadlessException {
        this.setTitle("FlowLayout");
        this.setSize(800, 90);
        this.setLocation(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();

        this.setContentPane(this.jPanelList.get(30));

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

        this.jPanelList.get(0).setBackground(Color.lightGray);
        this.jPanelList.get(0).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(0).add(new JLabel("Button 1"));

        this.jPanelList.get(1).setBackground(Color.lightGray);
        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(1).add(new JLabel("2"));

        this.jPanelList.get(2).setBackground(Color.lightGray);
        this.jPanelList.get(2).add(new JLabel("Button 3"));
        this.jPanelList.get(2).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(3).setBackground(Color.lightGray);

        this.jPanelList.get(3).add(new JLabel("Long-Named Button4"));
        this.jPanelList.get(3).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(4).setBackground(Color.lightGray);

        this.jPanelList.get(4).add(new JLabel("Button 5"));
        this.jPanelList.get(4).setBorder(new BevelBorder(BevelBorder.RAISED));

        this.jPanelList.get(5).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(6).setBackground(Color.lightGray);
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

        this.jPanelList.get(25).setLayout(new BorderLayout());
        this.jPanelList.get(25).add(this.jPanelList.get(0), BorderLayout.CENTER);
        this.jPanelList.get(25).add(this.jPanelList.get(5), BorderLayout.NORTH);
        this.jPanelList.get(25).add(this.jPanelList.get(6), BorderLayout.EAST);
        this.jPanelList.get(25).add(this.jPanelList.get(7), BorderLayout.SOUTH);
        this.jPanelList.get(25).add(this.jPanelList.get(8), BorderLayout.WEST);

        this.jPanelList.get(26).setLayout(new BorderLayout());
        this.jPanelList.get(26).add(this.jPanelList.get(1), BorderLayout.CENTER);
        this.jPanelList.get(26).add(this.jPanelList.get(9), BorderLayout.NORTH);
        this.jPanelList.get(26).add(this.jPanelList.get(10), BorderLayout.EAST);
        this.jPanelList.get(26).add(this.jPanelList.get(11), BorderLayout.SOUTH);
        this.jPanelList.get(26).add(this.jPanelList.get(12), BorderLayout.WEST);

        this.jPanelList.get(27).setLayout(new BorderLayout());
        this.jPanelList.get(27).add(this.jPanelList.get(2), BorderLayout.CENTER);
        this.jPanelList.get(27).add(this.jPanelList.get(13), BorderLayout.NORTH);
        this.jPanelList.get(27).add(this.jPanelList.get(14), BorderLayout.EAST);
        this.jPanelList.get(27).add(this.jPanelList.get(15), BorderLayout.SOUTH);
        this.jPanelList.get(27).add(this.jPanelList.get(16), BorderLayout.WEST);

        this.jPanelList.get(28).setLayout(new BorderLayout());
        this.jPanelList.get(28).add(this.jPanelList.get(3), BorderLayout.CENTER);
        this.jPanelList.get(28).add(this.jPanelList.get(17), BorderLayout.NORTH);
        this.jPanelList.get(28).add(this.jPanelList.get(18), BorderLayout.EAST);
        this.jPanelList.get(28).add(this.jPanelList.get(19), BorderLayout.SOUTH);
        this.jPanelList.get(28).add(this.jPanelList.get(20), BorderLayout.WEST);

        this.jPanelList.get(29).setLayout(new BorderLayout());
        this.jPanelList.get(29).add(this.jPanelList.get(4), BorderLayout.CENTER);
        this.jPanelList.get(29).add(this.jPanelList.get(21), BorderLayout.NORTH);
        this.jPanelList.get(29).add(this.jPanelList.get(22), BorderLayout.EAST);
        this.jPanelList.get(29).add(this.jPanelList.get(23), BorderLayout.SOUTH);
        this.jPanelList.get(29).add(this.jPanelList.get(24), BorderLayout.WEST);

        this.jPanelList.get(30).setLayout(new GridLayout(1, 5));
        this.jPanelList.get(30).add(this.jPanelList.get(25));
        this.jPanelList.get(30).add(this.jPanelList.get(26));
        this.jPanelList.get(30).add(this.jPanelList.get(27));
        this.jPanelList.get(30).add(this.jPanelList.get(28));
        this.jPanelList.get(30).add(this.jPanelList.get(29));

    }
}
