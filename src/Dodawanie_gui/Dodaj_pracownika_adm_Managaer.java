package Dodawanie_gui;

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

public class Dodaj_pracownika_adm_Managaer {
    public void dodaj_prac_adm(Data data){
        JFrame window = new JFrame();
        JPanel Info = new JPanel();

        JPanel Read = new JPanel();

        JTextField imie = new JTextField("Wpisz imie");
            Info.add(imie);

            JTextField nazwisko = new JTextField("Wpisz nazwisko");
            Info.add(nazwisko);

            JTextField  pesel = new JTextField("Wpisz pesel");
            Info.add(pesel);

            JTextField  wiek = new JTextField("Wpisz wiek");
            Info.add(wiek);

            JTextField  plec = new JTextField("Wpisz plec");
            Info.add(plec);

            JTextField  staz = new JTextField("Wpisz staz");
            Info.add(staz);

            JTextField  stanowisko = new JTextField("Wpisz stanowisko");
            Info.add(stanowisko);

            JTextField  pensja = new JTextField("Wpisz pensje");
            Info.add(pensja);

            JTextField  liczba_nadgodzin = new JTextField("Wpisz liczbe nadgodzin");
            Info.add(liczba_nadgodzin);

            Info.setLayout(new BoxLayout(Info, BoxLayout.Y_AXIS));




            JButton read = new JButton("Odczytaj");
            read.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                String imie_str = imie.getText();
                String nazwisko_str = nazwisko.getText();
                int pesel_int = Integer.parseInt(pesel.getText());
                int wiek_int = Integer.parseInt(wiek.getText());
                String plec_str = plec.getText();
                int staz_int = Integer.parseInt(staz.getText());
                String stanowisko_str = stanowisko.getText();
                int pensja_int = Integer.parseInt(pensja.getText());
                int liczba_nadgodzin_int = Integer.parseInt(liczba_nadgodzin.getText());
                
                Pracownik_administracyjny pracownik_adm = new Pracownik_administracyjny(imie_str, nazwisko_str, pesel_int, wiek_int, plec_str, staz_int, stanowisko_str, pensja_int, liczba_nadgodzin_int);
             
                data.osoba.add(pracownik_adm);
                
                data.powtarzalne(data.osoba);






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
