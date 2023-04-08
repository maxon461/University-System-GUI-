package sortowanie;
import headers.*;
import main.*;
import managers.*;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import org.w3c.dom.Text;
import headers.praca_z_plikiem;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wybor_sortowania {


    




    public void wybor(Data data){
        
            JFrame window = new JFrame();
            JPanel DodajPanel = new JPanel();
            JPanel Text = new JPanel();
            JTextField text = new JTextField("Wybierz opcje ");
            Text.add(text);
    
            window.getContentPane().add(BorderLayout.NORTH , Text);
            window.getContentPane().add(BorderLayout.CENTER , DodajPanel);
    
    
    
            JButton sort_nazw_wiek = new JButton("1.Sortuj po nazwisku i wieku");
            
    
            sort_nazw_wiek.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    Sort_nazwisko_wiek sort_nazwisko_wiek = new Sort_nazwisko_wiek();
                    sort_nazwisko_wiek.sort(data);
                    window.setVisible(false);
                    Main_Frame_gui start = new Main_Frame_gui();
                    start.menu(data);
                }
            });
            DodajPanel.add(sort_nazw_wiek);
          
    
            
    
    
    
    
            JButton sort_nazw = new JButton("2.Sortuj po nazwisku");
            
            sort_nazw.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    Sort_nazwisko sort_nazwisko = new Sort_nazwisko();
                    sort_nazwisko.sort(data);
                    
                    window.setVisible(false);
                    Main_Frame_gui start = new Main_Frame_gui();
                    start.menu(data);
                }
            });
            DodajPanel.add(sort_nazw);
            
    
    
            JButton sort_nazw_im = new JButton("3.Sortuj po nazwisku i imieniu");
           
            sort_nazw_im.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    Sort_nazwisko_imie sort_nazwisko_imie = new Sort_nazwisko_imie();
                    sort_nazwisko_imie.sort(data);
                    
                    window.setVisible(false);
                    Main_Frame_gui start = new Main_Frame_gui();
                    start.menu(data);
                }
            });
            DodajPanel.add(sort_nazw_im);
            
    
            
    
            // DodajPanel.setBounds(0, 0, 500, 800);
            DodajPanel.setLayout(new BoxLayout(DodajPanel, BoxLayout.Y_AXIS));
    
    
    
    
    
    
    
          
    
    
    
    
            
    
    
    
    
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setBounds(400, 400, 400, 200);
            window.setVisible(true); 
        }
    }


