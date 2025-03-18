// Kelas Animal
class Animal {
    // Atribut
    private String name;
    private String type;
    private String sound;

    // Konstruktor
    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    // Metode untuk menampilkan informasi hewan
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Sound: " + sound);
        System.out.println(); // Untuk memberikan jarak antar output
    }
}

// Kelas Main
public class Codelab1 {
    public static void main(String[] args) {
        // Membuat objek Animal
        Animal animal1 = new Animal("Cat", "Mammal", "Nyann~~");
        Animal animal2 = new Animal("Dog", "Mammal", "Woof-Woof!!");

        // Memanggil metode displayInfo() untuk kedua objek
        System.out.println("Animal 1 Info:");
        animal1.displayInfo();

        System.out.println("Animal 2 Info:");
        animal2.displayInfo();
    }
}