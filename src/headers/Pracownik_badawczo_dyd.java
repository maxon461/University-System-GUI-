package headers;

public class Pracownik_badawczo_dyd extends Pracownik {

    protected int liczba_publikacji;


   
    

    public Pracownik_badawczo_dyd(String imie, String nazwisko, int pesel, int wiek, String plec, int staz,
            String stanowisko, int pensja, int liczba_publikacji) {
        super(imie, nazwisko, pesel, wiek, plec, staz, stanowisko, pensja);
        this.liczba_publikacji = liczba_publikacji;

    }

    public int get_liczba_publikacji() {
        return liczba_publikacji;
    }

    public void get_info() {
        super.get_info();
        System.out.println(" liczba_publikacji " + liczba_publikacji);
        System.out.println("-------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Pracownik_badawczo_dyd [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + ", wiek=" + wiek + "/n" + ", plec="
        + plec + " staz= " + staz + ", stanowisko=" +  stanowisko + ", pensja= " + pensja +
        "liczba_nadgodzin=" + liczba_publikacji + "]";
    }

}
