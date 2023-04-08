package headers;

public class Pracownik_administracyjny extends Pracownik {
    protected int liczba_nadgodzin;

    public Pracownik_administracyjny(String imie, String nazwisko, int pesel, int wiek, String plec, int staz,
            String stanowisko, int pensja, int liczba_nadgodzin) {
        super(imie, nazwisko, pesel, wiek, plec, staz, stanowisko, pensja);
        this.liczba_nadgodzin = liczba_nadgodzin;
    }

    public int get_liczba_nadgodzin() {
        return liczba_nadgodzin;
    }

    public void get_info() {
        super.get_info();
        System.out.println(" liczba nadgodzin " + liczba_nadgodzin);
        System.out.println("-------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Pracownik_administracyjny [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + ", wiek=" + wiek + "/n" + ", plec="
        + plec + " staz= " + staz + ", stanowisko=" +  stanowisko + ", pensja= " + pensja +
        "liczba_nadgodzin=" + liczba_nadgodzin + "]";
    }

}
