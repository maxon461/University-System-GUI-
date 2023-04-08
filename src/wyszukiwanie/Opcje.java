package wyszukiwanie;
import main.*;
import headers.*;
import main.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opcje {
    public void wyszuk_opcje(Data data){
        JFrame window = new JFrame();
        JPanel DodajPanel = new JPanel();
        JPanel Text = new JPanel();
        JTextField text = new JTextField("Wybierz opcje ");
        Text.add(text);

        window.getContentPane().add(BorderLayout.NORTH , Text);
        window.getContentPane().add(BorderLayout.CENTER , DodajPanel);



        JButton prac_po_im = new JButton("1.Szukaj pracownika po imieniu");
        JTextField imie = new JTextField();

        prac_po_im.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = imie.getText();
                Prac_po_im szukaj = new Prac_po_im();
                szukaj.wyswetl(data , str);
                window.setVisible(false);
            }
        });
        DodajPanel.add(prac_po_im);
        DodajPanel.add(imie);

        




        JButton prac_po_nazw = new JButton("2.Szukaj pracownika po nazwisku");
        JTextField nazwisko = new JTextField();
        prac_po_nazw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = nazwisko.getText();
                Prac_po_nazw szukaj = new Prac_po_nazw();
                szukaj.wyswetl(data , str);
                
                window.setVisible(false);
            }
        });
        DodajPanel.add(prac_po_nazw);
        DodajPanel.add(nazwisko);


        JButton prac_po_stan = new JButton("3.Szukaj pracownika po stanowisku");
        JTextField stanowisko = new JTextField();
        prac_po_stan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = stanowisko.getText();
                Prac_po_stan szukaj = new Prac_po_stan();
                szukaj.wyswetl(data , str);
                window.setVisible(false);
            }
        });
        DodajPanel.add(prac_po_stan);
        DodajPanel.add(stanowisko);

        JButton prac_po_staz = new JButton("4.Szukaj pracownika po stazu");
        JTextField staz = new JTextField();
        prac_po_staz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = staz.getText();
                int x = Integer.parseInt(str);
                Prac_po_staz szukaj = new Prac_po_staz();
                szukaj.wyswetl(data , x);
                window.setVisible(false);
            }
        });
        DodajPanel.add(prac_po_staz);
        DodajPanel.add(staz);


        JButton prac_po_pensja = new JButton("5.Szukaj pracownika po pensji");
        JTextField pensja = new JTextField();
        prac_po_pensja.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = pensja.getText();
                int x = Integer.parseInt(str);
                Prac_po_pensja szukaj = new Prac_po_pensja();
                szukaj.wyswetl(data , x);
                window.setVisible(false);
            }
        });
        DodajPanel.add(prac_po_pensja);
        DodajPanel.add(pensja);

        JButton prac_adm_po_liczb = new JButton("6.Szukaj pracownika adm po liczbie nadgodzin");
        JTextField liczba_nadg = new JTextField();
        prac_adm_po_liczb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                String str  = liczba_nadg.getText();
                int x = Integer.parseInt(str);
                Prac_po_liczb_pub szukaj = new Prac_po_liczb_pub();
                szukaj.wyswetl(data , x);
                window.setVisible(false);
            }
        });
        DodajPanel.add(prac_adm_po_liczb);
        DodajPanel.add(liczba_nadg);


        JButton stud_po_im = new JButton("7.Szukaj studenta po imieniu");
        JTextField stud_imie = new JTextField();
        stud_po_im.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = stud_imie.getText();
                Stud_po_imie szukaj = new Stud_po_imie();
                szukaj.wyswetl(data , str);
                window.setVisible(false);
            }
        });
        DodajPanel.add(stud_po_im);
        DodajPanel.add(stud_imie);


        JButton stud_po_nazw = new JButton("8.Szukaj studenta po nazwisku");
        JTextField stud_nazw = new JTextField();
        stud_po_nazw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = stud_nazw.getText();
                Stud_po_nazw szukaj = new Stud_po_nazw();
                szukaj.wyswetl(data , str);
                window.setVisible(false);
            }
        });
        DodajPanel.add(stud_po_nazw);
        DodajPanel.add(stud_nazw);

        JButton stud_po_indeks = new JButton("9.Szukaj studenta po indeksie");
        JTextField stud_indeks = new JTextField();

        stud_po_indeks.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = stud_indeks.getText();
                Stud_po_indeks szukaj = new Stud_po_indeks();
                szukaj.wyswetl(data , str);
                window.setVisible(false);
            }
        });
        DodajPanel.add(stud_po_indeks);
        DodajPanel.add(stud_indeks);

        JButton stud_po_rok = new JButton("10.Szukaj studenta po roku studiow");
        JTextField rok = new JTextField();
        stud_po_rok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = rok.getText();
                int x = Integer.parseInt(str);
                Stud_po_rok szukaj = new Stud_po_rok();
                szukaj.wyswetl(data , x);
                
                window.setVisible(false);
            }
        });
        DodajPanel.add(stud_po_rok);
        DodajPanel.add(rok);

        JButton stud_po_kurs = new JButton("11.Szukaj studenta po kursie");
        JTextField kurs_nazwa = new JTextField();
        stud_po_kurs.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = kurs_nazwa.getText();
               
                Stud_po_kurs szukaj = new Stud_po_kurs();
                szukaj.wyswetl(data , str);
                
                window.setVisible(false);
            }
        });
        DodajPanel.add(stud_po_kurs);
        DodajPanel.add(kurs_nazwa);

        JButton kurs_po_nazw = new JButton("12.Szukaj kurs po nazwie");
        JTextField kurs_nazwa1 = new JTextField();
        kurs_po_nazw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = kurs_nazwa1.getText();
               
                Kurs_po_nazwa szukaj = new Kurs_po_nazwa();
                szukaj.wyswetl(data , str);


                
                window.setVisible(false);
            }
        });
        DodajPanel.add(kurs_po_nazw);
        DodajPanel.add(kurs_nazwa1);


        JButton kurs_po_prow = new JButton("13.Szukaj kurs po prowadzacym");
        JTextField prowadzacy = new JTextField();
        kurs_po_prow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = prowadzacy.getText();
               
                Kurs_po_prow szukaj = new Kurs_po_prow();
                szukaj.wyswetl(data , str);
                
                window.setVisible(false);
            }
        });
        DodajPanel.add(kurs_po_prow);
        DodajPanel.add(prowadzacy);



        JButton kurs_po_ECTS = new JButton("14.Szukaj kurs po ECTS");
        JTextField ECTS = new JTextField();
        kurs_po_ECTS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = ECTS.getText();
                int x = Integer.parseInt(str);
                Kurs_po_ECTS szukaj = new Kurs_po_ECTS();
                szukaj.wyswetl(data , x);
                
                window.setVisible(false);
            }
        });
        DodajPanel.add(kurs_po_ECTS);
        DodajPanel.add(ECTS);



        // DodajPanel.setBounds(0, 0, 500, 800);
        DodajPanel.setLayout(new GridLayout(14, 2));







      




        




        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(400, 400, 1000, 800);
        window.setVisible(true); 
    }
    
}
