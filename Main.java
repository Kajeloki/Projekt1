import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe x");
    int liczba=0;
    int najwieksza=0;
    int prawienajwieksza=0;
    int i=0;
    liczba=scanner.nextInt();
    while(liczba!=123)
      {
        if(liczba>najwieksza)
        {
          prawienajwieksza=najwieksza;
          najwieksza=liczba;
          
        }
         if(liczba>prawienajwieksza&&liczba<najwieksza)
        {
          prawienajwieksza=liczba;
          
          
        }
       
        i++;
        liczba=scanner.nextInt();
      }
     System.out.println("Najwieksza "+najwieksza);
    System.out.println("Prawie najwieksza "+prawienajwieksza);
  }
}