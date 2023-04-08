package sortowanie;
import java.util.*;
import headers.*;
import main.*;
public class Sort_nazwisko implements Sort {
    @Override
    public void sort(Data data) {
        Collections.sort(data.osoba, new Comparator<Osoba>() {

            public int compare(Osoba o1, Osoba o2) {
                return o1.getNazwisko().compareTo(o2.getNazwisko());
            }
        });

    }


    
}
