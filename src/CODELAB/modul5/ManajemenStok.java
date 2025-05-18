package modul5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Data awal
        daftarBarang.add(new Barang("Pulpen", 20));
        daftarBarang.add(new Barang("Buku", 15));

        boolean menu = true;

        while (menu) {
            System.out.println("\n=== MENU MANAJEMEN STOK ===");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("4. Tambah Barang Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();

            switch (pilihan) {
                case 1:
                System.out.println("\n=== Update Stok ===");
                for (int i = 0; i < daftarBarang.size(); i++) {
                    System.out.println((i + 1) + ". " + daftarBarang.get(i));
                }

                try {
                    System.out.print("Pilih nomor barang yang ingin di-update: ");
                    int indeks = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indeks >= 0 && indeks < daftarBarang.size()) {
                        System.out.print("Masukkan stok baru: ");
                        int stokBaru = scanner.nextInt();
                        scanner.nextLine();

                        Barang barangLama = daftarBarang.get(indeks);
                        // Buat objek baru dengan nama yang sama dan stok baru
                        Barang barangBaru = new Barang(barangLama.getNama(), stokBaru);

                        // Gantikan objek lama dengan yang baru menggunakan set()
                        daftarBarang.set(indeks, barangBaru);

                        System.out.println("Stok berhasil diperbarui.");
                    } else {
                        System.out.println("Nomor barang tidak valid.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka!");
                    scanner.nextLine();
                }
                    break;

                case 2:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Stok barang kosong.");
                    } else {
                        System.out.println("Daftar Barang:");
                        Iterator<Barang> iterator = daftarBarang.iterator();
                        while (iterator.hasNext()) {
                            System.out.println("Nama: " + iterator.next());
                        }
                       /* for (int i = 0; i < daftarBarang.size(); i++) {
                            Barang b = daftarBarang.get(i);
                            System.out.println(i + ". " + b.getNama() + " - Stok: " + b.getStok());
                        } */
                    }
                    break;

                case 3:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Stok barang kosong.");
                        break;
                    }

                    System.out.println("Daftar Barang:");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarBarang.get(i).getNama() + " - Stok: " + daftarBarang.get(i).getStok());
                    }

                    try {
                        System.out.print("Pilih barang: ");
                        int indeks = scanner.nextInt();

                        Barang barangDipilih = daftarBarang.get(indeks);

                        System.out.print("Jumlah stok yang akan dikurangi: ");
                        int jumlahDiambil = scanner.nextInt();

                        if (jumlahDiambil > barangDipilih.getStok()) {
                            throw new StokTidakCukupException("Stok untuk " + barangDipilih.getNama() + " hanya tersisa " + barangDipilih.getStok());
                        }

                        barangDipilih.setStok(barangDipilih.getStok() - jumlahDiambil);
                        System.out.println("Stok berhasil dikurangi.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scanner.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks barang tidak valid.");
                    } catch (StokTidakCukupException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("\n=== Tambah Barang Baru ===");
                    try {
                        System.out.print("Masukkan nama barang: ");
                        String nama = scanner.nextLine();

                        System.out.print("Masukkan stok awal: ");
                        int stok = scanner.nextInt();
                        scanner.nextLine();

                        Barang barangBaru = new Barang(nama, stok);
                        daftarBarang.add(barangBaru);

                        System.out.println("Barang berhasil ditambahkan.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input stok harus berupa angka!");
                        scanner.nextLine();
                    }
                    break;
                case 0:
                    menu = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }

        scanner.close();
    }
}