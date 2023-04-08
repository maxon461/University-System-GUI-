package Wyswetlanie_gui;
import java.util.ArrayList;

import main.*;
import javax.swing.*;
import java.awt.*;    
import java.util.*;
import headers.Kurs;
import headers.Osoba;
import headers.Pracownik_badawczo_dyd;
import headers.Student;
import managers.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wyswetl_prac_dyd implements interface_wyswetl{
    public void wyswetl(Data data){
        JFrame window = new JFrame();
        JPanel Info = new JPanel();

        JPanel Read = new JPanel();

        JButton ok =  new JButton("ok");

        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                window.setVisible(false);
                Main_Frame_gui start = new Main_Frame_gui();
                start.menu(data);
            }
        });

        for(int i=0;i<data.osoba.size();i++){
            if(data.osoba.get(i) instanceof Pracownik_badawczo_dyd){
                JTextArea text = new JTextArea( );
                text.append(data.osoba.get(i).toString());
                text.setLineWrap(true);
                Info.add(text);
            }
        }
        Info.setLayout(new BoxLayout(Info, BoxLayout.Y_AXIS));
        Read.add(ok);
        window.getContentPane().add( Info);
        window.getContentPane().add(Read);

        window.setLayout(new GridLayout(2,1));


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(400, 400, 700, 700);
        window.setVisible(true);  
    }
    
}
