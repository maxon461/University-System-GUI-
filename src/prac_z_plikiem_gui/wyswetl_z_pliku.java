package prac_z_plikiem_gui;
import main.*;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import managers.*;
import headers.*;
import main.*;
import javax.swing.*;
import java.awt.*;    
import java.util.*;
import headers.Kurs;
import headers.Osoba;
import headers.Student;
import managers.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wyswetl_z_pliku {
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

        try {

            FileInputStream fos = new FileInputStream("text.txt");
            ObjectInputStream out = new ObjectInputStream(fos);
            ArrayList<Osoba> obj1 = ((ArrayList<Osoba>) out.readObject());
            for (Osoba osoba : obj1) {
                JTextArea text = new JTextArea( );
                text.append(osoba.toString());
                text.setLineWrap(true);
                Info.add(text);
              out.close();
              fos.close();
            }
      
          } catch (ClassNotFoundException | IOException e) {
            System.out.println("Blad");
            e.printStackTrace();
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
