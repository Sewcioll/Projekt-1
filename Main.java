import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Witaj w programie obliczającym ile benzyny straciłeś na trasie!");
  
    Scanner scan = new Scanner(System.in);
    System.out.println("Ile litrów spala Twoje auto na 100km: ");
    double spalanie = scan.nextDouble();
    System.out.println("Ile km przejechałeś: ");
    double km = scan.nextDouble();
    System.out.println("Podaj akutalną cene paliwa za litr: ");
    double paliwo = scan.nextDouble();
    double wynik1=(km*spalanie)/100;
    double wynik2=wynik1*paliwo;
    System.out.println("Przejechałeś "+ km +", spaliłeś w tym czasie "+ wynik1 +" litry paliwa. Cena za wydane paliwo wynosi: " + wynik2);
    
    
    
  }
}