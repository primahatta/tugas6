package prima;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int menu;
        mobil mobil = new mobil();
        Scanner input = new Scanner(System.in);
        System.out.println("- - - - - - - - - - - - - - - - - - ");
        System.out.println("            PRIMA SHOWROOM");
        System.out.println("- - - - - - - - - -  - - - - - - - -");
        System.out.println("1.)JAZZ                   2.)AVANZA");
        System.out.println("3.)XENIA                  4.)MAZDA3");
        System.out.println("5.)FORTUNER               6.)APV");
        System.out.println("7.)XPANDER                8.)BMW");
        System.out.println("9.)BRIO                  10.)RUSH");
        System.out.println("- - - - - - - - - -  - - - - - - - -");
        System.out.print("MASUKAN MOBIL PILIHAN ANDA (NOMOR) = ");
        menu = input.nextInt();
        if (menu==1){
            mobil.jazz();
        } else if (menu==2) {
            mobil.avanza();
        } else if (menu==3) {
            mobil.xenia();
        } else if (menu==4) {
            mobil.mazda3();
        }else if (menu==5){
            mobil.fortuner();
        }else if (menu==6){
            mobil.apv();
        }else if (menu==7){
            mobil.xpander();
        }else if (menu==8){
            mobil.bmw3();
        } else if (menu==9) {
            mobil.brio();
        } else if (menu==10) {
            mobil.rush();
        }else {
            System.out.println("eror!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

    }
}
