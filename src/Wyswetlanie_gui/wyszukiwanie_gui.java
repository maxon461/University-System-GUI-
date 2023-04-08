package Wyswetlanie_gui;


import headers.*;
import main.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class wyszukiwanie_gui {

    public void szukaj(Data data ){
        JFrame window = new JFrame();
    // ramka.getContentPane().removeAll(); 
    // ramka.repaint();
    
    
    JPanel DodajPanel = new JPanel();
    JPanel Text = new JPanel();
    JTextField text = new JTextField("Wyswetlanie");
    Text.add(text);


    window.getContentPane().add(BorderLayout.NORTH , Text);
    window.getContentPane().add(BorderLayout.CENTER , DodajPanel);

    JButton wyswetl_studenta = new JButton("Wyswetl Studenta");
    wyswetl_studenta.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) 
		{
            wyswetl_stud wysw = new wyswetl_stud();
            wysw.wyswetl(data);
            window.setVisible(false);
	}
    });

    DodajPanel.add(wyswetl_studenta);

    JButton wyswetl_pracownika_adm = new JButton("Wyswetl Pracownika Adm");
    wyswetl_pracownika_adm.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            wyswetl_prac_adm wysw = new wyswetl_prac_adm();
            wysw.wyswetl(data);
            window.setVisible(false);
        }
    });
    DodajPanel.add(wyswetl_pracownika_adm);

    JButton wyswetl_pracownika_dyd = new JButton("Wyswetl Pracownika Bad Dyd");
    wyswetl_pracownika_dyd.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        wyswetl_prac_dyd wysw = new wyswetl_prac_dyd();
        wysw.wyswetl(data);
        window.setVisible(false);
        }
    });
    DodajPanel.add(wyswetl_pracownika_dyd);


    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(400, 400, 700, 700);
    window.setVisible(true);    





       

        }

    }
    

