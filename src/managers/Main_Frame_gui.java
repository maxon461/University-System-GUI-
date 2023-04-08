package managers;

import headers.*;
import main.*;
import java.util.*;
import javax.swing.*;
import wyszukiwanie.*;
import Dodawanie_gui.Dodaj_osobe_Manager;
import Dodawanie_kursy_gui.wpisanie_kursow;
import Wyswetlanie_gui.wyszukiwanie_gui;
import Dodawanie_kursy_gui.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prac_z_plikiem_gui.*;
import sortowanie.wybor_sortowania;
import usuwanie_gui.usun;
public class Main_Frame_gui{

    protected JFrame ramka;
    protected JPanel MainPanel;
    protected JPanel Text;
    private JButton dodaj_osobeButton;
    private JButton dodaj_pracownikaButton;
    private JButton wyswetlButton;
    private JButton znajdzButton;
    private JButton odczytaj_dane_osob_z_plikuButton;
    private JButton zapisz_dane_do_plikuButton;
    private JButton dodaj_osob_do_plikuButton;
    private JButton sortowanieButton;
    private JButton usuwanieButton;

    






   


    public void menu(Data data){
    ramka = new JFrame();

    ramka.setTitle("Uczelnia");
    MainPanel = new JPanel();

    Text = new JPanel();

    ramka.getContentPane().add(BorderLayout.NORTH ,  Text );
    ramka.getContentPane().add( BorderLayout.CENTER , MainPanel );

    JTextField text = new JTextField("Menu Glowne");
    text.setEditable(false);
    Text.add(text);

    

    dodaj_osobeButton = new JButton("Dodaj Osobe");
    dodaj_osobeButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) 
		{
            Dodaj_osobe_Manager dodaj = new Dodaj_osobe_Manager();
            dodaj.dodaj_osobe(data);
            ramka.setVisible(false);
	}
    });

    MainPanel.add(dodaj_osobeButton);

    dodaj_pracownikaButton = new JButton("Dodaj Kurs");
    dodaj_pracownikaButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            wpisanie_kursow dodaj_kurs = new wpisanie_kursow();
            dodaj_kurs.wpisz_kurs(data);
                                
        }
    });
    MainPanel.add( dodaj_pracownikaButton);

    wyswetlButton = new JButton("Wyswetl");
    wyswetlButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) 
		{
            wyszukiwanie_gui wyszukiwamie = new wyszukiwanie_gui();
            wyszukiwamie.szukaj(data);
            ramka.setVisible(false);
	}
    });
    MainPanel.add( wyswetlButton);

    znajdzButton = new JButton("Znajdz");
    znajdzButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Opcje wyszukiwanie = new Opcje();
            wyszukiwanie.wyszuk_opcje(data);
            ramka.setVisible(false);
        }
    });
    MainPanel.add( znajdzButton);

    odczytaj_dane_osob_z_plikuButton = new JButton("Wyswetl dane osob z pliku");
    odczytaj_dane_osob_z_plikuButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        wyswetl_z_pliku wyswetlanie = new wyswetl_z_pliku();
        wyswetlanie.wyswetl(data);
        ramka.setVisible(false);
        }

    });
    MainPanel.add( odczytaj_dane_osob_z_plikuButton);

    zapisz_dane_do_plikuButton = new JButton("Zapisz dane wszystkich osob do pliku");
    zapisz_dane_do_plikuButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            zapisz save = new zapisz();
            save.save(data);
            ramka.setVisible(false);
        }
    });
    MainPanel.add( zapisz_dane_do_plikuButton);

    dodaj_osob_do_plikuButton = new JButton("Dodac osob od pliku(ktory teraz sa w Arrayliscie)");
    dodaj_osob_do_plikuButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent  e){
            dodaj_do_data dodaj = new dodaj_do_data();
            dodaj.dodaj_osob_z_pliku(data);
            ramka.setVisible(false);
        }
    });
    MainPanel.add( dodaj_osob_do_plikuButton);

    sortowanieButton = new JButton("Sortowanie");
    sortowanieButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            wybor_sortowania wybor = new wybor_sortowania();
            wybor.wybor(data);
            ramka.setVisible(false);
        }
    });
    MainPanel.add( sortowanieButton);

    usuwanieButton = new JButton("Usuwanie");
    usuwanieButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            usun usuwanie = new usun();
            usuwanie.usun_opcje(data);
            ramka.setVisible(false);

        }
    });
    MainPanel.add(usuwanieButton);

    

    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ramka.setBounds(400, 400, 700, 700);
    ramka.setVisible(true);


    }

   

   
}
