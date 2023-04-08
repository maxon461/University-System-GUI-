package prac_z_plikiem_gui;
import main.*;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import managers.*;
import headers.*;
public class dodaj_do_data {
    
  public void dodaj_osob_z_pliku(Data data) {
    try {

      FileInputStream fos = new FileInputStream("text.txt");
      ObjectInputStream out = new ObjectInputStream(fos);
      ArrayList<Osoba> obj1 = ((ArrayList<Osoba>) out.readObject());
      data.osoba.addAll(obj1);
      out.close();
      fos.close();

    } catch (ClassNotFoundException | IOException e) {
      System.out.println("Blad");
      e.printStackTrace();
    }
    Main_Frame_gui start = new Main_Frame_gui();
    start.menu(data);
  }
    
}
