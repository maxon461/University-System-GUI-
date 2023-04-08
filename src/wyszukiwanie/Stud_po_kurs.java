package wyszukiwanie;
import java.util.ArrayList;

import main.*;
import javax.swing.*;
import java.awt.*;    
import java.util.*;
import headers.Kurs;
import headers.Osoba;
import headers.Pracownik_administracyjny;
import headers.*;
import managers.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stud_po_kurs {
    public void wyswetl(Data data , String str){
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
            for(int j=0;j<((Student)data.osoba.get(i)).lista_kursow.size();j++){
            if(data.osoba.get(i) instanceof Student && ((Student)data.osoba.get(i)).lista_kursow.get(j).get_nazwa_kursu().equals(str)){
                JTextArea text = new JTextArea( );
                text.append(data.osoba.get(i).toString());
                text.setLineWrap(true);
                Info.add(text);
            }
        }
        }
        Info.setLayout(new BoxLayout(Info, BoxLayout.Y_AXIS));
        Read.add(ok);
        window.getContentPane().add( Info);
        window.getContentPane().add(Read);

        window.setLayout(new GridLayout(2,1));


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window.setSize(1000,1000);
        window.setBounds(400, 400, 700, 700);
        window.setVisible(true);  
    }
}
