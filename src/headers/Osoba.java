package headers;

import java.io.Serializable;

public abstract class Osoba implements Serializable {
    protected String imie;
    protected String nazwisko;
    protected int pesel;
    protected int wiek;
    protected String plec;

    public Osoba() {
        this.imie = "None";
        this.nazwisko = "None";
        this.pesel = 0;
        this.wiek = 0;
        this.plec = "None";
    }

    public Osoba(String imie, String nazwisko, int pesel, int wiek, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.plec = plec;

    }

    
    public String toString() {
        return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + ", wiek=" + wiek + ", plec="
                + plec + "]";
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public void get_info() {
        System.out.println("Imie osoby jest " + this.imie + " nazwisko " + this.nazwisko +
                " pesel " + this.pesel + " wiek " + this.wiek + " plec " + this.plec);
    }

}
