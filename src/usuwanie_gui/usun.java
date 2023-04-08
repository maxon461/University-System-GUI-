package usuwanie_gui;
import main.*;
import managers.Main_Frame_gui;
import usuwanie_manager.usuwanie;
import headers.*;
import main.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class usun {
    public void usun_opcje(Data data){
        JFrame window = new JFrame();
        JPanel DodajPanel = new JPanel();
        JPanel Text = new JPanel();
        JTextField text = new JTextField("Wybierz opcje ");
        Text.add(text);

        window.getContentPane().add(BorderLayout.NORTH , Text);
        window.getContentPane().add(BorderLayout.CENTER , DodajPanel);



        JButton prac_po_im = new JButton("1.Usun pracownika po imieniu");
        JTextField imie = new JTextField();

        prac_po_im.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = imie.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_prac_po_imieniu(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(prac_po_im);
        DodajPanel.add(imie);

        




        JButton prac_po_nazw = new JButton("2.Usun pracownika po nazwisku");
        JTextField nazwisko = new JTextField();
        prac_po_nazw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = nazwisko.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_prac_po_nazwisku(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(prac_po_nazw);
        DodajPanel.add(nazwisko);


        JButton prac_po_stan = new JButton("3.Usun pracownika po stanowisku");
        JTextField stanowisko = new JTextField();
        prac_po_stan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = stanowisko.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_prac_po_stanowisku(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(prac_po_stan);
        DodajPanel.add(stanowisko);

        JButton prac_po_staz = new JButton("4.Usun pracownika po stazu");
        JTextField staz = new JTextField();
        prac_po_staz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = staz.getText();
                int x = Integer.parseInt(str);
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_prac_po_stazu(data, x);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(prac_po_staz);
        DodajPanel.add(staz);


        JButton stud_po_im = new JButton("5.Usun studenta po imieniu");
        JTextField stud_imie = new JTextField();
        stud_po_im.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = stud_imie.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_stud_po_imieniu(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(stud_po_im);
        DodajPanel.add(stud_imie);


        JButton stud_po_nazw = new JButton("6.Usun studenta po nazwisku");
        JTextField stud_nazw = new JTextField();
        stud_po_nazw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = stud_nazw.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_stud_po_nazwisku(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(stud_po_nazw);
        DodajPanel.add(stud_nazw);

        JButton stud_po_indeks = new JButton("7.Usun studenta po indeksie");
        JTextField stud_indeks = new JTextField();

        stud_po_indeks.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = stud_indeks.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_stud_po_indeksie(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(stud_po_indeks);
        DodajPanel.add(stud_indeks);

        JButton stud_po_rok = new JButton("8.Usun studenta po roku studiow");
        JTextField rok = new JTextField();
        stud_po_rok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = rok.getText();
                int x = Integer.parseInt(str);
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_stud_po_roku_stud(data, x);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(stud_po_rok);
        DodajPanel.add(rok);
        

        JButton kurs_po_nazw = new JButton("9.Usun kurs po nazwie");
        JTextField kurs_nazwa1 = new JTextField();
        kurs_po_nazw.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = kurs_nazwa1.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_kurs_po_nazwie(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(kurs_po_nazw);
        DodajPanel.add(kurs_nazwa1);


        JButton kurs_po_prow = new JButton("10.Usun kurs po prowadzacym");
        JTextField prowadzacy = new JTextField();
        kurs_po_prow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = prowadzacy.getText();
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_kurs_po_prowadzacym(data, str);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(kurs_po_prow);
        DodajPanel.add(prowadzacy);



        JButton kurs_po_ECTS = new JButton("11.Usun kurs po ECTS");
        JTextField ECTS = new JTextField();
        kurs_po_ECTS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str  = ECTS.getText();
                int x = Integer.parseInt(str);
                usuwanie usuwanie = new usuwanie();
                usuwanie.usun_kurs_po_ECTS(data, x);
                window.setVisible(false);
                Main_Frame_gui main = new Main_Frame_gui();
                main.menu(data);
            }
        });
        DodajPanel.add(kurs_po_ECTS);
        DodajPanel.add(ECTS);
        




        
        DodajPanel.setLayout(new GridLayout(14, 2));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(400, 400, 1000, 800);
        window.setVisible(true); 

    }
    
}
