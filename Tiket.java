import java.util.Scanner;

public class Tiket {
    private String username;
    private String password;

    public Tiket(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
    }

    public static double calculateTicketPrice(double ticketPrice, int passengerCount) {
        double insuranceFee = passengerCount * 29000;
        return ticketPrice * passengerCount + insuranceFee;
    }

    public static double calculateHotelPrice(double roomPrice, int roomCount) {
        double discount = 0.45; // 45% discount
        double discountedPrice = roomPrice * (1 - discount);
        return discountedPrice * roomCount;
    }
}
