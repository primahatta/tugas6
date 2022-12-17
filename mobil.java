package prima;

import java.util.Scanner;

public class mobil implements jenis{
    private String nama,cc;
    private int lama;

    @Override
    public void jazz() {
        Scanner j = new Scanner(System.in);
        int harga=700000,tot1;
        String mobil1="JAZZ",plat1="AA.4047.DD";
        System.out.print("NAMA PENYEWA     = ");
        nama =j.next();
        System.out.println("NAMA MOBIL       = "+mobil1);
        System.out.println("NO PLAT          = "+plat1);
        System.out.printf("LAMA SEWA(HARI)  = ");
        lama = j.nextInt();
        tot1 = lama*harga;
        System.out.println("TOTAL PEMBAYARAN = "+tot1);



    }

    @Override
    public void avanza() {
        Scanner a = new Scanner(System.in);
        int harga2=700000,tot2;
        String mobil2="AVANZA",plat2="AD.1010.DD";
        System.out.printf("NAMA PENYEWA     = ");
        nama =a.next();
        System.out.println("NAMA MOBIL       = "+mobil2);
        System.out.println("NO PLAT          = "+plat2);
        System.out.printf("LAMA SEWA(HARI)  = ");
        lama = a.nextInt();
        tot2 = lama*harga2;
        System.out.println("TOTAL PEMBAYARAN = "+tot2);
    }

    @Override
    public void xenia() {
        Scanner x = new Scanner(System.in);
        int harga3=400000,tot3;
        String mobil3="XENIA",plat3="AD.2323.DD";
        System.out.print("NAMA PENYEWA     = ");
        nama =x.next();
        System.out.println("NAMA MOBIL       = "+mobil3);
        System.out.println("NO PLAT          = "+plat3);
        System.out.print("LAMA SEWA(HARI)  = ");
        lama = x.nextInt();
        tot3 = lama*harga3;
        System.out.println("TOTAL PEMBAYARAN = "+tot3);

    }

    @Override
    public void mazda3() {
        Scanner m = new Scanner(System.in);
        int harga4=1100000,tot4;
        String mobil4="MAZDA 3",plat4="AA.1010.DD";
        System.out.print("NAMA PENYEWA     = ");
        nama =m.next();
        System.out.println("NAMA MOBIL       = "+mobil4);
        System.out.println("NO PLAT          = "+plat4);
        System.out.print("LAMA SEWA(HARI)  = ");
        lama = m.nextInt();
        tot4 = lama*harga4;
        System.out.println("TOTAL PEMBAYARAN = "+tot4);



    }

    @Override
    public void fortuner() {
        Scanner f = new Scanner(System.in);
        int harga5=1200000,tot5;
        String mobil5="FORTUNER",plat5="AB.1010.DD";
        System.out.println("NAMA PENYEWA     = ");
        nama =f.next();
        System.out.println("NAMA MOBIL       = "+mobil5);
        System.out.println("NO PLAT          = "+plat5);
        System.out.println("LAMA SEWA(HARI)  = ");
        lama = f.nextInt();
        tot5 = lama*harga5;
        System.out.println("TOTAL PEMBAYARAN = "+tot5);


    }

    @Override
    public void apv() {
        Scanner p = new Scanner(System.in);
        int harga6=650000,tot6;
        String mobil6="APV",plat6="AA.1010.FF";
        System.out.println("NAMA PENYEWA     = ");
        nama =p.next();
        System.out.println("NAMA MOBIL       = "+mobil6);
        System.out.println("NO PLAT          = "+plat6);
        System.out.println("LAMA SEWA(HARI)  = ");
        lama = p.nextInt();
        tot6 = lama*harga6;
        System.out.println("TOTAL PEMBAYARAN = "+tot6);


    }

    @Override
    public void xpander() {
        Scanner d = new Scanner(System.in);
        int harga7=850000,tot7;
        String mobil7="XPANDER",plat7="Z.1010.DD";
        System.out.println("NAMA PENYEWA     = ");
        nama =d.next();
        System.out.println("NAMA MOBIL       = "+mobil7);
        System.out.println("NO PLAT          = "+plat7);
        System.out.println("LAMA SEWA(HARI)  = ");
        lama = d.nextInt();
        tot7 = lama*harga7;
        System.out.println("TOTAL PEMBAYARAN = "+tot7);


    }

    @Override
    public void bmw3() {
        Scanner b = new Scanner(System.in);
        int harga8=2000000,tot8;
        String mobil8="BMW",plat8="B.1010.DD";
        System.out.println("NAMA PENYEWA     = ");
        nama =b.next();
        System.out.println("NAMA MOBIL       = "+mobil8);
        System.out.println("NO PLAT          = "+plat8);
        System.out.println("LAMA SEWA(HARI)  = ");
        lama = b.nextInt();
        tot8 = lama*harga8;
        System.out.println("TOTAL PEMBAYARAN = "+tot8);


    }

    @Override
    public void brio() {
        Scanner r = new Scanner(System.in);
        int harga9=500000,tot9;
        String mobil9="BRIO",plat9="AA.2765.AB";
        System.out.println("NAMA PENYEWA     = ");
        nama =r.next();
        System.out.println("NAMA MOBIL       = "+mobil9);
        System.out.println("NO PLAT          = "+plat9);
        System.out.println("LAMA SEWA(HARI)  = ");
        lama = r.nextInt();
        tot9 = lama*harga9;
        System.out.println("TOTAL PEMBAYARAN = "+tot9);


    }

    @Override
    public void rush() {
        Scanner u = new Scanner(System.in);
        int harga10=1000000,tot10;
        String mobil10="RUSH",plat10="AD.5476.DD";
        System.out.println("NAMA PENYEWA     = ");
        nama =u.next();
        System.out.println("NAMA MOBIL       = "+mobil10);
        System.out.println("NO PLAT          = "+plat10);
        System.out.println("LAMA SEWA(HARI)  = ");
        lama = u.nextInt();
        tot10 = lama*harga10;
        System.out.println("TOTAL PEMBAYARAN = "+tot10);


    }
}
