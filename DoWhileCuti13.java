import java.util.Scanner;

public class DoWhileCuti13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jatahCuti, jmlHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/n) ? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari : ");
                jmlHari = sc.nextInt();

                if (jmlHari <= jatahCuti) {
                    jatahCuti -= jmlHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                }
            }else {
                System.out.println("Input invalid. masukkan y (ya) atau t(tidak)");
            }
        } while (jatahCuti > 0);
    }
}
