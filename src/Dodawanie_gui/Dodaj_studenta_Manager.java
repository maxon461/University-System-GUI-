package Dodawanie_gui;

import main.*;
import managers.Main_Frame_gui;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;    
import java.util.*;
import headers.Kurs;
import headers.Student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dodaj_studenta_Manager {
    public void dodaj_studenta(Data data){
            JFrame window = new JFrame();
            JPanel Info = new JPanel();

            JPanel Read = new JPanel();

            JPanel Kursy = new JPanel();

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

            JTextField  nr_indeksu = new JTextField("Wpisz nr_indeksu");
            Info.add(nr_indeksu);

            JTextField  rok_studiow = new JTextField("Wpisz rok studiow");
            Info.add(rok_studiow);

            JTextField  erasmus = new JTextField("Czy erasmus(Tak czy Nie)");
            Info.add(erasmus);

            JTextField  pierwszy_stopien_studiow = new JTextField("Czy pierwszy stopien(Tak czy Nie)");
            Info.add(pierwszy_stopien_studiow);

            JTextField  stacjonarne = new JTextField("Czy stacjonarne(Tak czy Nie)");
            Info.add(stacjonarne);

            JTextField  kurs_nazwa1 = new JTextField("Wpisz nazwe kursu:");
            JTextField  prowadzacy1 = new JTextField("Wpisz nazwe prowadzacego:");
            JTextField  ECTS1 = new JTextField("Wpisz ECTS:");

            JTextField  kurs_nazwa2 = new JTextField("Wpisz nazwe kursu:");
            JTextField  prowadzacy2 = new JTextField("Wpisz nazwe prowadzacego:");
            JTextField  ECTS2 = new JTextField("Wpisz ECTS:");

            JTextField  kurs_nazwa3 = new JTextField("Wpisz nazwe kursu:");
            JTextField  prowadzacy3 = new JTextField("Wpisz nazwe prowadzacego:");
            JTextField  ECTS3 = new JTextField("Wpisz ECTS:");

            JTextField  kurs_nazwa4 = new JTextField("Wpisz nazwe kursu:");
            JTextField  prowadzacy4 = new JTextField("Wpisz nazwe prowadzacego:");
            JTextField  ECTS4 = new JTextField("Wpisz ECTS:");

            JTextField  kurs_nazwa5 = new JTextField("Wpisz nazwe kursu:");
            JTextField  prowadzacy5 = new JTextField("Wpisz nazwe prowadzacego:");
            JTextField  ECTS5 = new JTextField("Wpisz ECTS:");

            Kursy.add(kurs_nazwa1 );
            Kursy.add(prowadzacy1 );
            Kursy.add(ECTS1 );
            Kursy.add(kurs_nazwa2 );
            Kursy.add(prowadzacy2 );
            Kursy.add(ECTS2 );
            Kursy.add(kurs_nazwa3 );
            Kursy.add(prowadzacy3 );
            Kursy.add(ECTS3 );
            Kursy.add(kurs_nazwa4 );
            Kursy.add(prowadzacy4 );
            Kursy.add(ECTS4 );
            Kursy.add(kurs_nazwa5 );
            Kursy.add(prowadzacy5 );
            Kursy.add(ECTS5 );
            

            Info.setLayout(new BoxLayout(Info, BoxLayout.Y_AXIS));
            Kursy.setLayout(new BoxLayout(Kursy, BoxLayout.Y_AXIS));
            






            JButton read = new JButton("Odczytaj");
            read.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                String imie_str = imie.getText();
                String nazwisko_str = nazwisko.getText();
                int pesel_int = Integer.parseInt(pesel.getText());
                int wiek_int = Integer.parseInt(wiek.getText());
                String plec_str = plec.getText();
                String nrindeksu_str = nr_indeksu.getText();
                int rok_studiow_int = Integer.parseInt(rok_studiow.getText());
                String erasmus_str = erasmus.getText();
                boolean erasmus_b;
                if(erasmus_str.equals("Nie")) erasmus_b=false;
                else erasmus_b=true;
                String pierwszy_stopien_str = pierwszy_stopien_studiow.getText();
                boolean pierwszy_stopien_b;
                boolean drugi_stopien_b;
                if(pierwszy_stopien_str.equals("Tak")) {
                    pierwszy_stopien_b=true;
                    drugi_stopien_b=false;
                }
                else {
                    pierwszy_stopien_b=false;
                    drugi_stopien_b=true;
                }
                String stacjonarne_str = stacjonarne.getText();
                boolean stacjonarne_b;
                if(stacjonarne_str.equals("Tak")) stacjonarne_b=true;
                else stacjonarne_b=false;
                // KURSY
                ArrayList<Kurs> kursy_studenta = new ArrayList<Kurs>();

                if(kurs_nazwa1.getText().equals("Wpisz nazwe kursu:") || prowadzacy1.getText().equals("Wpisz nazwe prowadzacego:") || ECTS1.getText().equals("Wpisz ECTS:")){}
                else{
                String kurs_nazwa1_str = kurs_nazwa1.getText();
                String prowadzacy1_str = prowadzacy1.getText();
                int ECTS1_int =Integer.parseInt(ECTS1.getText()) ;
                kursy_studenta.add(new Kurs(kurs_nazwa1_str, prowadzacy1_str, ECTS1_int));
                }

                if(kurs_nazwa2.getText().equals("Wpisz nazwe kursu:") && prowadzacy2.getText().equals("Wpisz nazwe prowadzacego:") && ECTS2.getText().equals("Wpisz ECTS:")){}
                else{
                String kurs_nazwa2_str = kurs_nazwa2.getText();
                String prowadzacy2_str = prowadzacy2.getText();
                int ECTS2_int =Integer.parseInt(ECTS2.getText()) ;
                kursy_studenta.add(new Kurs(kurs_nazwa2_str, prowadzacy2_str, ECTS2_int));
                }

                if(kurs_nazwa3.getText().equals("Wpisz nazwe kursu:") && prowadzacy3.getText().equals("Wpisz nazwe prowadzacego:") && ECTS3.getText().equals("Wpisz ECTS:")){}
                else{
                String kurs_nazwa3_str = kurs_nazwa3.getText();
                String prowadzacy3_str = prowadzacy3.getText();
                int ECTS3_int =Integer.parseInt(ECTS3.getText()) ;
                kursy_studenta.add(new Kurs(kurs_nazwa3_str, prowadzacy3_str, ECTS3_int));
                }

                if(kurs_nazwa4.getText().equals("Wpisz nazwe kursu:") && prowadzacy4.getText().equals("Wpisz nazwe prowadzacego:") && ECTS4.getText().equals("Wpisz ECTS:")){}
                else{
                String kurs_nazwa4_str = kurs_nazwa4.getText();
                String prowadzacy4_str = prowadzacy4.getText();
                int ECTS4_int =Integer.parseInt(ECTS4.getText()) ;
                kursy_studenta.add(new Kurs(kurs_nazwa4_str, prowadzacy4_str, ECTS4_int));
                }

                if(kurs_nazwa5.getText().equals("Wpisz nazwe kursu:") && prowadzacy5.getText().equals("Wpisz nazwe prowadzacego:") && ECTS5.getText().equals("Wpisz ECTS:")){}
                else{
                String kurs_nazwa5_str = kurs_nazwa5.getText();
                String prowadzacy5_str = prowadzacy5.getText();
                int ECTS5_int =Integer.parseInt(ECTS5.getText()) ;
                kursy_studenta.add(new Kurs(kurs_nazwa5_str, prowadzacy5_str, ECTS5_int));
                }


                Student student = new Student(imie_str, nazwisko_str, pesel_int, wiek_int, plec_str, nrindeksu_str, rok_studiow_int, erasmus_b, pierwszy_stopien_b, drugi_stopien_b, stacjonarne_b ,kursy_studenta);
               
                data.osoba.add(student);
                data.powtarzalne(data.osoba);

                
                window.setVisible(false);
                Main_Frame_gui start = new Main_Frame_gui();
                start.menu(data);
                }
            });
            Read.add(read);

            

            window.getContentPane().add( Info);
            window.getContentPane().add( Kursy);
            window.getContentPane().add( Read);            
            

            window.setLayout(new GridLayout(2,4));


            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setBounds(400, 400, 700, 700);
            window.setVisible(true);  
           
        }
        
}
