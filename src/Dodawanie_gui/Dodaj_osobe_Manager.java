package Dodawanie_gui;

import headers.*;
import main.*;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import org.w3c.dom.Text;
import headers.praca_z_plikiem;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dodaj_osobe_Manager {

   
    private JFrame ramka;
    private JPanel Text;
    private JPanel DodajPanel;
    private JButton dodaj_studenta;
    private JButton dodaj_pracownika_dyd;
    private JButton dodaj_pracownika_adm;


    




    public void dodaj_osobe(Data data){
    ramka = new JFrame();
    // ramka.getContentPane().removeAll(); 
    // ramka.repaint();
    
    
    DodajPanel = new JPanel();
    Text = new JPanel();
    JTextField text = new JTextField("Dodawanie");
    Text.add(text);


    ramka.getContentPane().add(BorderLayout.NORTH , Text);
    ramka.getContentPane().add(BorderLayout.CENTER , DodajPanel);

    dodaj_studenta = new JButton("Dodaj Studenta");
    dodaj_studenta.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) 
		{
            Dodaj_studenta_Manager stud = new Dodaj_studenta_Manager();
            stud.dodaj_studenta(data);
            ramka.setVisible(false);
	}
    });

    DodajPanel.add(dodaj_studenta);

    dodaj_pracownika_adm = new JButton("Dodaj Pracownika Adm");
    dodaj_pracownika_adm.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        Dodaj_pracownika_adm_Managaer adm = new Dodaj_pracownika_adm_Managaer();
        adm.dodaj_prac_adm(data);
        ramka.setVisible(false);
        }
    });
    DodajPanel.add(dodaj_pracownika_adm);

    dodaj_pracownika_dyd = new JButton("Dodaj Pracownika Bad Dyd");
    dodaj_pracownika_dyd.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        Dodaj_pracownika_dyd_Manager dyd = new Dodaj_pracownika_dyd_Manager();
        dyd.dodaj_prac_dyd(data);
        ramka.setVisible(false);
        }
    });
    DodajPanel.add(dodaj_pracownika_dyd);


    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ramka.setBounds(400, 400, 700, 700);
    ramka.setVisible(true);    






    }

   

    
}
