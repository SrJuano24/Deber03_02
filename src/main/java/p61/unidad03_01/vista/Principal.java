/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_01.vista;

import javax.swing.JFrame;

/**
 *
 * @author Juano
 */
public class Principal {

    public static void main(String[] args) {

        var ventana1 = new Ventana0301a("Ecuador");
        ventana1.iniciarComponente();
        var ventana2 = new Ventana0301a("Qatar");
        ventana2.iniciarComponente();
        var ventana3 = new Ventana0301a("PaisesBajos");
        ventana3.iniciarComponente();
        var ventana4 = new Ventana0301a("Senegal");
        ventana4.iniciarComponente();
        
        
        

        ventana1.setVisible(true);
        ventana2.setVisible(true);
        ventana3.setVisible(true);
        ventana4.setVisible(true);

        /*
        var ventana0301a = new JFrame();
        ventana0301a.setTitle("Ventana Unidad 03.01a");
        ventana0301a.setSize(800, 600);
        ventana0301a.setLocation(200, 100);
        ventana0301a.setVisible(true);
        ventana0301a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        var ventana0301b = new JFrame();
        ventana0301b.setTitle("Ventana Unidad 03.01b");
        ventana0301b.setSize(800, 600);
        ventana0301b.setLocation(200, 100);
        ventana0301b.setVisible(true);
        ventana0301b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var ventana0301c = new JFrame();
        ventana0301c.setTitle("Ventana Unidad 03.01c");
        ventana0301c.setSize(800, 600);
        ventana0301c.setLocation(200, 100);
        ventana0301c.setVisible(true);
        ventana0301c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var ventana0301d = new JFrame();
        ventana0301d.setTitle("Ventana Unidad 03.01d");
        ventana0301d.setSize(800, 600);
        ventana0301d.setLocation(200, 100);
        ventana0301d.setVisible(true);
        ventana0301d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         */
    }

}
