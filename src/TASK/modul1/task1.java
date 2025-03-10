import java.sql.SQLOutput;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        String adminusername = "admin";
        String adminpassword = "password";
        String NIM = "202410370110157";
        String nama = "Akmal Dzaky Mahardika";
        System.out.println("Pilih login: \n 1. Admin\n2. Mahasiswa");

        Scanner scan = new Scanner(System.in);

        System.out.print("masukkan pilihan: ");
        int pilihan = scan.nextInt();
        switch (pilihan) {
            case 1:
                scan.nextLine();
                System.out.print("masukkan username: ");
                String username = scan.nextLine();
                System.out.print("masukkan password: ");
                String password = scan.nextLine();
                if (adminusername.equals(username) && (adminpassword.equals(password))){
                    System.out.println("login admin berhasil.");
                } else {
                    System.out.println("username atau password salah");
                }
                break;
            case 2:
                System.out.print("masukkan nama: ");
                String name = scan.nextLine();
                System.out.print("masukkan NIM: ");
                String nomor = scan.nextLine();
                if (nama.equals(name) && (NIM.equals(nomor)))   {
                    System.out.println("login berhasil");
                } else {
                    System.out.println("login tidak berhasil");
                }
                break;
            default:
                System.out.println("input tidak valid!");
        }
    }
}