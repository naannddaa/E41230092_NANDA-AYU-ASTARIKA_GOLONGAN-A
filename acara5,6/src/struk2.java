import java.util.Scanner;

public class struk2 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     String nama;
     int harga;
     
        System.out.println("                   CAFE CERIA                       ");
        System.out.println("                  ANEKA MINUMAN                     ");
        System.out.println("____________________________________________________");
        System.out.println("                   SPECIAL MENU                     ");
        System.out.println("                1. soft drinks                      ");
        System.out.println("                2. mix juice                        ");
        System.out.println("                3. nescafe                          ");
        System.out.println("                4. soda milk                        ");
        System.out.println("                5. tea                              ");
        System.out.println("____________________________________________________");
        System.out.print("  Masukkan nama pembeli : ");
        nama = input.nextLine();
        System.out.println("");
        
        String angka;
        Scanner scan = new Scanner(System.in);
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        angka = scan.nextLine();
                
        switch (angka) {
            case "1":
                System.out.print("Minuman yang anda pesan adalah SOFT DRINKS");
                break;
            case "2":
                System.out.print("Minuman yang anda pesan adalah MIX JUICE");
                break;
            case "3":
                System.out.print("Minuman yang anda pesan adalah NESCAFE");
                break;
            case "4":
                System.out.print("Minuman yang anda pesan adalah SODA MILK");
                break;
            case "5":
                System.out.print("Minuman yang anda pesan adalah TEA");
                break;
        }
        System.out.println("");
        
        System.out.println("Pesanan anda akan segera kami antar");
        System.out.println("Terima kasih" +" " + nama +" "+ "telah berkunjung di Cafe Ceria");
    }
    
}
