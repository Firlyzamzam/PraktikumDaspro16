package PraktikumDaspro16;
import java.util.Scanner;
public class StudiKasus216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan, status; 
        int jumlahDokumen, peringkatJuara;

        System.out.println("Masukkan nama mahasiswa: ");
        namaMahasiswa = scanner.nextLine();
        System.out.println("Masukkan jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = scanner.nextLine();
       

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")||
            jenisKegiatan.equalsIgnoreCase("BAKORMA")||
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {
        System.out.println("Masukkan jumlah dokumen yang diupload (0-4): ");
        jumlahDokumen = scanner.nextInt();
        System.out.println("Masukkan peringkat juara (1/2/3/0 jika tidak juara): ");
        peringkatJuara = scanner.nextInt();
            if (jumlahDokumen >= 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    status = "Lengkap, dana penghargaan diberikan";
                } else {
                    status = "peserta tidak memperoleh dana penghargaan karena tidak masuk peringkat 1-3";
                }
            } else {
                jumlahDokumen = 4 - jumlahDokumen;
                status = "Dokumen tidak lengkap (kurang " + jumlahDokumen + " dokumen), dana penghargaan tidak diberikan";
            }
        } else {
            status = "Jenis kegiatan tidak valid.";
        }
        System.out.println(status);
    }
}
