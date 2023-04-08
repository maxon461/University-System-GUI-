package Dodawanie_kursy_gui;
import main.*;
import managers.Main_Frame_gui;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;    
import java.util.*;
import headers.Kurs;
import headers.Pracownik_administracyjny;
import headers.Student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class wpisanie_kursow {
    public void wpisz_kurs(Data data){
        JFrame window = new JFrame();
        JPanel Info = new JPanel();

        JPanel Read = new JPanel();

        JTextField nazwa = new JTextField("Wpisz nazwe");
            Info.add(nazwa);

            JTextField prowadzacy = new JTextField("Wpisz prowadzacego");
            Info.add(prowadzacy);

            JTextField  ECTS = new JTextField("Wpisz ECTS");
            Info.add(ECTS);

            Info.setLayout(new BoxLayout(Info, BoxLayout.Y_AXIS));

            JButton read = new JButton("Odczytaj");
            read.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                String nazwa_str = nazwa.getText();
                String prowadzacy_str = prowadzacy.getText();
                int ECTS_int = Integer.parseInt(ECTS.getText());
                
                
                Kurs kurs = new Kurs(nazwa_str, prowadzacy_str, ECTS_int);
             
                data.kursy.add(kurs);
                







                window.setVisible(false);
                Main_Frame_gui start = new Main_Frame_gui();
                start.menu(data);
                }
            });
            Read.add(read);


            window.getContentPane().add( Info);
            window.getContentPane().add( Read);
            
            window.setLayout(new GridLayout(1,2));


            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setBounds(400, 400, 700, 700);
            window.setVisible(true);  

    }
}

