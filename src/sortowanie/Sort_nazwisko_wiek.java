package sortowanie;
import java.util.*;
import headers.*;
import main.Data;

public class Sort_nazwisko_wiek implements Sort  {
    @Override
    public void sort(Data data) {

        Collections.sort(data.osoba, new Comparator<Osoba>() {

            public int compare(Osoba o1, Osoba o2) {
                if (o1.getNazwisko().compareTo(o2.getNazwisko()) == 0) {
                    return Integer.compare(o1.getWiek(), o2.getWiek())*(-1); //malejuca *(-1)

                } else
                    return o1.getNazwisko().compareTo(o2.getNazwisko());
            }
        });

    }
    
}
