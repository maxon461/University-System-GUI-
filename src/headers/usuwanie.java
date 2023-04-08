package headers;

import java.util.ArrayList;

public class usuwanie {

    public usuwanie() {
    }

    public void usun_prac_po_imieniu(ArrayList<Osoba> obj , String imie){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Pracownik ) && (obj.get(i).getImie().equals(imie))){
                obj.remove(i);
                i--;
            }
        }
    }

    public void usun_prac_po_nazwisku(ArrayList<Osoba> obj , String nazwisko){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Pracownik ) && (obj.get(i).getNazwisko().equals(nazwisko))){
                obj.remove(i);
                i--;
            }
        }
    }

    public void usun_prac_po_stazu(ArrayList<Osoba> obj , int staz){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Pracownik ) && (((Pracownik)obj.get(i)).getStaz()==(staz))){
                obj.remove(i);
                i--;
            }
        }
    }

    public void usun_prac_po_stanowisku(ArrayList<Osoba> obj , String stanowisko){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Pracownik ) && (((Pracownik)obj.get(i)).getStanowisko().equals(stanowisko))){
                obj.remove(i);
                i--;
            }
        }
    }


    public void usun_stud_po_imieniu(ArrayList<Osoba> obj , String imie){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Student ) && (obj.get(i).getImie().equals(imie))){
                obj.remove(i);
                i--;
            }
        }
    }

    public void usun_stud_po_nazwisku(ArrayList<Osoba> obj , String nazwisko){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Student ) && (obj.get(i).getNazwisko().equals(nazwisko))){
                obj.remove(i);
                i--;
            }
        }
    }



    public void usun_stud_po_indeksie(ArrayList<Osoba> obj , String indeks){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Student ) && (((Student)obj.get(i)).get_indeks().equals(indeks))){
                obj.remove(i);
                i--;
                
            }
        }
    }

    public void usun_stud_po_roku_stud(ArrayList<Osoba> obj , int rok_studiow){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i) instanceof Student ) && (((Student)obj.get(i)).get_rok_studiow()==(rok_studiow))){
                obj.remove(i);
                i--;
            }
        }
    }
    
    public void usun_kurs_po_nazwie(ArrayList<Kurs> obj , String nazwa){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i).get_nazwa_kursu().equals(nazwa))){
                obj.remove(i);
                i--;
            }
        }
    }

    public void usun_kurs_po_prowadzacym(ArrayList<Kurs> obj , String prowadzacy){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i).get_prowadzacy().equals(prowadzacy))){
                obj.remove(i);
                i--;
            }
        }
    }

    public void usun_kurs_po_ECTS(ArrayList<Kurs> obj , int ECTS){
        for(int i=0;i<obj.size();i++){
            if ( (obj.get(i).get_ECTS()==(ECTS))){
                obj.remove(i);
                i--;
            }
        }
    }


    
}
