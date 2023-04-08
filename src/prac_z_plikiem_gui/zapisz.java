package prac_z_plikiem_gui;
 import main.*;
 import java.io.*;
import java.util.ArrayList;
import java.util.*;
import managers.*;
public class zapisz {
    public void save(Data data){
        try {

            FileOutputStream fos = new FileOutputStream("text.txt");
      
            ObjectOutputStream out = new ObjectOutputStream(fos);
      
            out.writeObject(data.osoba);
            out.close();
            fos.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
          Main_Frame_gui m = new Main_Frame_gui();
          m.menu(data);
        }
    }
    

