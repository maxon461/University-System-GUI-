package headers;

import java.io.Serializable;

public class Kurs implements Serializable {
    protected String nazwa;
    protected String prowadzacy;
    protected int ECTS;

    public Kurs() {
        this.nazwa = "None";
        this.prowadzacy = "None";
        this.ECTS = 0;

    }

    public Kurs(String nazwa, String prowadzacy, int ECTS) {
        this.nazwa = nazwa;
        this.prowadzacy = prowadzacy;
        this.ECTS = ECTS;
    }

    public int get_ECTS() {
        return this.ECTS;
    }

    public String get_nazwa_kursu() {
        return nazwa;
    }

    @Override
    public String toString() {
        return "Kurs [nazwa=" + nazwa + ", prowadzacy=" + prowadzacy + ", ECTS=" + ECTS + "]";
    }

    public String get_prowadzacy() {
        return prowadzacy;
    }

    public void show_kurs() {
        System.out.println(
                "Nazwa kursu to " + this.nazwa + " prowadzacy " + this.prowadzacy + " punkty ECTS " + this.ECTS);
                System.out.println("-------------------------------------------------------------");
        
    }

}
