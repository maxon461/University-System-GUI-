package usuwanie_manager;


import headers.Pracownik;
import headers.Student;
import main.Data;
import headers.*;

public class usuwanie {

    public usuwanie() {
    }

    public void usun_prac_po_imieniu(Data data , String imie){
        for(Osoba obj : data.osoba){
            if ((obj instanceof Pracownik) && (obj.getImie().equals(imie))){
                data.osoba.remove(obj);
                
            }
        }
    }

    public void usun_prac_po_nazwisku(Data data , String nazwisko){
        for(Osoba obj : data.osoba){
            if ((obj instanceof Pracownik) && (obj.getNazwisko().equals(nazwisko))){
                data.osoba.remove(obj);
                
            }
        }
    }

    public void usun_prac_po_stazu(Data data , int staz){
        for(Osoba obj : data.osoba){
            if  ((obj instanceof Pracownik) && (((Pracownik)obj).getStaz()==staz)){
                data.osoba.remove(obj);
               
            }
        }
    }

    public void usun_prac_po_stanowisku(Data data , String stanowisko){
        for(Osoba obj : data.osoba){
            if ((obj instanceof Pracownik) && (((Pracownik)obj).getStanowisko().equals(stanowisko))){
                data.osoba.remove(obj);
                
            }
        }
    }


    public void usun_stud_po_imieniu(Data data , String imie){
        for(Osoba obj : data.osoba){
            if  ((obj instanceof Student) && (obj.getImie().equals(imie))){
                data.osoba.remove(obj);
                
            }
        }
    }

    public void usun_stud_po_nazwisku(Data data , String nazwisko){
        for(Osoba obj : data.osoba){
            if ( (obj instanceof Student)  &&  (obj.getNazwisko().equals(nazwisko))){
                data.osoba.remove(obj);
                
            }
        }
    }



    public void usun_stud_po_indeksie(Data data , String indeks){
        for(Osoba obj : data.osoba){
            if ((obj instanceof Pracownik) && (((Student)obj).get_indeks().equals(indeks))){
                data.osoba.remove(obj);
               
                
            }
        }
    }

    public void usun_stud_po_roku_stud(Data data , int rok_studiow){
        for(Osoba obj : data.osoba){
            if ((obj instanceof Student) && (((Student)obj).get_rok_studiow()==(rok_studiow))){
                data.osoba.remove(obj);
                
            }
        }
    }
    
    public void usun_kurs_po_nazwie(Data data , String nazwa){
        for(int i=0;i<data.kursy.size();i++){
            if ( (data.kursy.get(i).get_nazwa_kursu().equals(nazwa))){
                data.kursy.remove(i);
                i--;
            }
        }
    }

    public void usun_kurs_po_prowadzacym(Data data , String prowadzacy){
        for(int i=0;i<data.kursy.size();i++){
            if ( (data.kursy.get(i).get_prowadzacy().equals(prowadzacy))){
                data.kursy.remove(i);
                i--;
            }
        }
    }

    public void usun_kurs_po_ECTS(Data data , int ECTS){
        for(int i=0;i<data.kursy.size();i++){
            if ( (data.kursy.get(i).get_ECTS()==(ECTS))){
                data.kursy.remove(i);
                i--;
            }
        }
    }


    
}
