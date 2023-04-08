package sortowanie;
import java.util.*;
import headers.*;
import main.*;
public class Sort_nazwisko_imie implements Sort {
    @Override
    public void sort(Data data) {

        Collections.sort(data.osoba, new Comparator<Osoba>() {

            public int compare(Osoba o1, Osoba o2) {
                if (o1.getNazwisko().compareTo(o2.getNazwisko()) == 0)
                    return (o1.getImie().compareTo(o2.getImie()));
                else
                    return o1.getNazwisko().compareTo(o2.getNazwisko());
            }
        });

    }
    
}
