package main;

import java.awt.BorderLayout;
import java.sql.Struct;

import javax.swing.*;
import java.util.*;
import headers.*;
import managers.Main_Frame_gui;

public class main {



    public static void main(String[] args) {
    Data data = new Data();
    Main_Frame_gui menu = new Main_Frame_gui();
    menu.menu(data);
	}

}
