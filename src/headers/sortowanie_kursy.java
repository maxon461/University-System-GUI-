package headers;

import java.util.*;
import java.lang.Integer;

public class sortowanie_kursy {

    

    public void sort_kursy_ECTS_prowadzacy(ArrayList<Kurs> obj) {
        Collections.sort(obj, new Comparator<Kurs>() {

            public int compare(Kurs o1, Kurs o2) {
                if (Integer.compare(o1.ECTS, o2.ECTS)==0) {
                    return o1.prowadzacy.compareTo(o2.prowadzacy);

                } else
                    return (Integer.compare(o1.ECTS, o2.ECTS));
            }
        });

        
    }

}
