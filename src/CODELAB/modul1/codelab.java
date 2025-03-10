import java.util.Scanner;

public class codelab {
    public static void main(String[] args){
        String nama;
        int umur;
        Scanner objInput = new Scanner(System.in);

        System.out.print("masukkan nama: ");
        nama = objInput.nextLine();

        System.out.print("masukkan umur: ");
        umur = objInput.nextInt();

        System.out.println("nama: " + nama);
        System.out.println("umur: " + umur);
    }
}