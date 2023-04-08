package main;


import java.awt.BorderLayout;
import java.sql.Struct;

import javax.swing.*;
import java.util.*;
import headers.*;
import managers.Main_Frame_gui;

public class Data {
    public ArrayList<Osoba> osoba = new ArrayList<Osoba>();
    public ArrayList<Kurs> kursy = new ArrayList<Kurs>();
    

    public void powtarzalne(ArrayList <Osoba> obj){
        HashSet<Osoba> set = new HashSet<>();
        set.addAll(obj);
        obj.clear();
        obj.addAll(set);
    }
    
}
