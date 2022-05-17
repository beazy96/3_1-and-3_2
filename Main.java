import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
Service1 s = new Service1();
int x=1;

while(x==1){  
  Scanner scan = new Scanner(System.in);
  System.out.print("Co robisz 1 czy 2:"); 
  int liczba=scan.nextInt();
 
  switch (liczba){
  case 1:
      System.out.print("Podaj imie");  
      Scanner scan1 = new Scanner(System.in);
      String imie = scan1.nextLine();
      System.out.print("Podaj nazwisko"); 
      String nazwisko = scan1.nextLine();
      System.out.print("Podaj wiek");  
      int wiek=scan1.nextInt();
      System.out.print("Podaj date urodz:"); 
      String urodz=scan1.nextLine();

      s.addStudent(new Student(imie, nazwisko, wiek, urodz));
    break;
  case 2:
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    break;

  default:
      System.out.print("xxxxxxxx ");
}

}

    } catch (IOException e) {

    }
  }
}