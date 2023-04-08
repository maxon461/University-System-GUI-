package headers;



public abstract class Pracownik extends Osoba {
    protected int staz;
    protected String stanowisko;
    protected int pensja;

    public Pracownik() {
        this.staz = 0;
        this.stanowisko = "none";
        this.pensja = 0;
    }

    public Pracownik(String imie, String nazwisko, int pesel, int wiek, String plec, int staz, String stanowisko,
            int pensja) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.staz = staz;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public int hashCode(){
       return this.getPesel();
    } 
 
    @Override
    public boolean equals(Object obj){
       Pracownik other = (Pracownik) obj;
       if(pesel==other.getPesel()) return true;
       else return false;
    }

    @Override
    public String toString() {
        return "Pracownik [staz=" + staz + ", stanowisko=" + stanowisko + ", pensja=" + pensja + "]";
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }




    public void get_info() {
        super.get_info();
        System.out.println(" staz " + this.staz +
                " stanowisko " + this.stanowisko + " pensja " + this.pensja);
    }

}