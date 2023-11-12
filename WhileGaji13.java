import java.util.Scanner;

/**
 * WhileGaji13
 */
public class WhileGaji13 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int jmlKaryawan, jmlJmLembur;
        double gajiLembur = 0, totGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jmlKaryawan = sc.nextInt();

        int i = 0;

        while (i < jmlKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukkan Jabatan Karyawan ke-" + (i+1) + ":");
            jabatan = sc.next();
            
            System.out.print("masukkan Jumlah jam Lembur : ");
            jmlJmLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manager")){
                gajiLembur= jmlJmLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jmlJmLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                continue;
            }

            totGajiLembur += gajiLembur;
            System.out.println("Total Gaji Lembur : " + totGajiLembur);
        }
    }
}

