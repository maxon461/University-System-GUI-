package headers;


import java.util.ArrayList;

public class Student extends Osoba {
   protected String nr_indeksu;
   protected int rok_studiow;
   public ArrayList<Kurs> lista_kursow = new ArrayList<>();

   protected boolean erasmus;
   protected boolean pierwszy_stopien_studiow;
   protected boolean drugi_stopien_studiow;
   protected boolean studia_stacjonarne;

   public Student() {
      super();
      this.nr_indeksu = "0";
      this.rok_studiow = 0;
      this.erasmus = false;
      this.pierwszy_stopien_studiow = false;
      this.drugi_stopien_studiow = false;
      this.studia_stacjonarne = false;
   }

   public Student(String imie, String nazwisko, int pesel, int wiek, String plec, String nr_indeksu, int rok_studiow,
         boolean erasmus, boolean pierwszy_stopien_studiow,
         boolean drugi_stopien_stopien, boolean studia_stacjonarne , ArrayList<Kurs> kursy) {
      super(imie, nazwisko, pesel, wiek, plec);
      this.nr_indeksu = nr_indeksu;
      this.rok_studiow = rok_studiow;

      this.erasmus = erasmus;
      this.pierwszy_stopien_studiow = pierwszy_stopien_studiow;
      this.drugi_stopien_studiow = drugi_stopien_stopien;
      this.studia_stacjonarne = studia_stacjonarne;
      this.lista_kursow = kursy;
   }

   public void get_booleans() {
      if (erasmus) {
         System.out.println(" Erasmus jest ");
      } else {
         System.out.println(" Nie ma erasmusa ");
      }

      if (pierwszy_stopien_studiow) {
         System.out.println("Pierwszy rok studiow");
      } else
         System.out.println(" Drugi rok studiow ");

      if(studia_stacjonarne){
         System.out.println("Stacjonarne");
      }
      else {
         System.out.println("Nie stacjonarne");
      }
   }

   public Kurs get_pewny_Kurs(int x) {
      return lista_kursow.get(x);
   }

   public void get_lista_kursow() {
      for (int i = 0; i < lista_kursow.size(); i++) {
         lista_kursow.get(i).show_kurs();
      }
   }

   public String get_indeks() {
      return nr_indeksu;
   }

   public int get_rok_studiow() {
      return rok_studiow;
   }

   public boolean get_erasmus() {
      return erasmus;
   }

   public boolean get_pierwszy_stopien() {
      return pierwszy_stopien_studiow;
   }

   public boolean get_drugi_stopien() {
      return drugi_stopien_studiow;
   }

   public boolean get_studia_stacjonarne() {
      return studia_stacjonarne;
   }

   public void dodaj_kurs(Kurs kurs){
      this.lista_kursow.add(kurs);
   }

   public void get_info() {
      super.get_info();
      get_booleans();
      get_lista_kursow();
      System.out.println("-------------------------------------------------------------");

   }

   @Override
   public int hashCode(){
      return this.get_indeks().hashCode();
   } 

   @Override
   public boolean equals(Object obj){
      Student other = (Student) obj;
      if(this.get_indeks().equals(other.get_indeks())) return true;
      else return false;
   }

   @Override
   public String toString() {
      return "Student [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + ", wiek=" + wiek + ", plec="
       + plec + " nr_indeksu=" + nr_indeksu + ", rok_studiow=" + rok_studiow 
            + ", erasmus=" + erasmus + ", pierwszy_stopien_studiow=" + pierwszy_stopien_studiow
            + ", drugi_stopien_studiow=" + drugi_stopien_studiow + ", studia_stacjonarne=" + studia_stacjonarne + ", lista_kursow=" + lista_kursow + "]";
   }

  

}
