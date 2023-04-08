package headers;

import java.util.ArrayList;

public class Obsluga {
    String name;

    public Obsluga() {
        name = "Steve";
    }

    public void szukaj_prac_za_imie(ArrayList<Osoba> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Pracownik) && (obj.get(i).getImie().equals(value))) {
                obj.get(i).get_info();
            }
        }

    }

    public void szukaj_stud_za_imie(ArrayList<Osoba> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Student) && (obj.get(i).getImie().equals(value))) {
                obj.get(i).get_info();
            }
        }

    }

    public void szukaj_prac_za_nazwisko(ArrayList<Osoba> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Pracownik) && (obj.get(i).getNazwisko().equals(value))) {
                obj.get(i).get_info();
            }
        }

    }

    public void szukaj_stud_za_nazwisko(ArrayList<Osoba> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Student) && (obj.get(i).getNazwisko().equals(value))) {
                obj.get(i).get_info();
            }
        }

    }

    public void szukaj_prac_za_stanowisko(ArrayList<Osoba> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Pracownik) && (((Pracownik) obj.get(i)).getStanowisko().equals(value))) {
                obj.get(i).get_info();
            }
        }
    }

    public void szukaj_prac_za_staz(ArrayList<Osoba> obj, int value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Pracownik) && (((Pracownik) obj.get(i)).getStaz() == value)) {
                obj.get(i).get_info();
            }
        }
    }

    public void szukaj_prac_za_pensja(ArrayList<Osoba> obj, int value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Pracownik) && (((Pracownik) obj.get(i)).getPensja() == value)) {
                obj.get(i).get_info();
            }
        }
    }

    public void szukaj_prac_za_licz_nadgodzin(ArrayList<Osoba> obj, int value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Pracownik_administracyjny)
                    && (((Pracownik_administracyjny) obj.get(i)).get_liczba_nadgodzin() == value)) {
                obj.get(i).get_info();
            }
        }
    }

    public void szukaj_stud_za_indeks(ArrayList<Osoba> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Student) && (((Student) obj.get(i)).get_indeks().equals(value))) {
                obj.get(i).get_info();
            }
        }
    }

    public void szukaj_stud_za_rok_studiow(ArrayList<Osoba> obj, int value) {
        for (int i = 0; i < obj.size(); i++) {
            if ((obj.get(i) instanceof Student) && (((Student) obj.get(i)).get_rok_studiow() == value)) {
                obj.get(i).get_info();
            }
        }
    }

    public void szukaj_stud_za_kurs(ArrayList<Osoba> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            for (int j = 0; j < ((Student) obj.get(i)).lista_kursow.size(); j++)
                if ((obj.get(i) instanceof Student)
                        && (((Student) obj.get(i)).lista_kursow.get(j).get_nazwa_kursu().equals(value))) {
                    obj.get(i).get_info();
                }
        }
    }

    public void szukaj_kursy_ECTS(ArrayList<Kurs> obj, int ECTS_value) {
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).get_ECTS() == ECTS_value) {
                obj.get(i).show_kurs();

            }
        }
    }

    public void szukaj_kursy_nazwa(ArrayList<Kurs> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).get_nazwa_kursu().equals(value)) {
                obj.get(i).show_kurs();

            }
        }
    }

    public void szukaj_kursy_prowadzacy(ArrayList<Kurs> obj, String value) {
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).get_prowadzacy().equals(value)) {
                obj.get(i).show_kurs();

            }
        }
    }

    public void wyswetl_studenta(ArrayList<Osoba> obj) {
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i) instanceof Student /* można zmienić na Pracowników i też będę działać */) {
                obj.get(i).get_info();
            }
        }
    }

    public void wyswetl_prac_adm(ArrayList<Osoba> obj) {
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i) instanceof Pracownik_administracyjny /* można zmienić na Pracowników i też będę działać */) {
                obj.get(i).get_info();
            }
        }
    }

    public void wyswetl_prac_dyd(ArrayList<Osoba> obj) {
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i) instanceof Pracownik_badawczo_dyd /* można zmienić na Pracowników i też będę działać */) {
                obj.get(i).get_info();
            }
        }
    }

    public void wyswetl_kursy(ArrayList<Kurs> obj) {
        for (int i = 0; i < obj.size(); i++) {
            obj.get(i).show_kurs();
        }
    }
}
