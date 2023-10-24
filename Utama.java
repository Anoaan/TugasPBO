import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tiket tiket = new Tiket("username", "password");

        System.out.print("Masukkan username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String enteredPassword = scanner.nextLine();

        if (tiket.login(enteredUsername, enteredPassword)) {
            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1/2/3): ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        // Input Data Transaksi
                        System.out.print("Masukkan harga tiket pesawat: ");
                        double ticketPrice = scanner.nextDouble();
                        System.out.print("Masukkan jumlah penumpang: ");
                        int passengerCount = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        System.out.print("Masukkan harga kamar hotel: ");
                        double roomPrice = scanner.nextDouble();
                        System.out.print("Masukkan jumlah kamar: ");
                        int roomCount = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        double totalTicketPrice = Tiket.calculateTicketPrice(ticketPrice, passengerCount);
                        double totalHotelPrice = Tiket.calculateHotelPrice(roomPrice, roomCount);

                        System.out.println("Total Biaya Tiket Pesawat: " + totalTicketPrice);
                        System.out.println("Total Biaya Kamar Hotel: " + totalHotelPrice);
                        break;
                    case 2:
                        // Lihat Data Tiket
                        // Implement viewing ticket data here
                        break;
                    case 3:
                        // Keluar
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                }
            } while (choice != 3);
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        scanner.close();
    }
}
