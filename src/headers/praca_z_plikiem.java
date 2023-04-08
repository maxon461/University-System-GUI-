package headers;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class praca_z_plikiem {

  public Scanner sc = new Scanner(System.in);

  public void wyswetl_z_pliku() {
    try {

      FileInputStream fos = new FileInputStream("text.txt");
      ObjectInputStream out = new ObjectInputStream(fos);
      ArrayList<Osoba> obj1 = ((ArrayList<Osoba>) out.readObject());
      for (Osoba osoba : obj1) {
        osoba.get_info();
        out.close();
        fos.close();
      }

    } catch (ClassNotFoundException | IOException e) {
      System.out.println("Blad");
      e.printStackTrace();
    }

  }

  public void zapisz_dane(ArrayList<Osoba> obj) {
    try {

      FileOutputStream fos = new FileOutputStream("text.txt");

      ObjectOutputStream out = new ObjectOutputStream(fos);

      out.writeObject(obj);
      out.close();
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void dodaj_osob_z_pliku(ArrayList<Osoba> obj) {
    try {

      FileInputStream fos = new FileInputStream("text.txt");
      ObjectInputStream out = new ObjectInputStream(fos);
      ArrayList<Osoba> obj1 = ((ArrayList<Osoba>) out.readObject());
      obj.addAll(obj1);
      out.close();
      fos.close();

    } catch (ClassNotFoundException | IOException e) {
      System.out.println("Blad");
      e.printStackTrace();
    }
  }
}
