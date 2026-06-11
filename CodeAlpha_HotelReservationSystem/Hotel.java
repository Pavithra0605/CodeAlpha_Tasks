import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;

    public Hotel() {

        rooms = new ArrayList<>();
        bookings = new ArrayList<>();

        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Deluxe"));
        rooms.add(new Room(103, "Suite"));
        rooms.add(new Room(104, "Standard"));
        rooms.add(new Room(105, "Deluxe"));
    }

    public void viewRooms() {

        System.out.println("\n===== AVAILABLE ROOMS =====");

        for (Room room : rooms) {

            if (room.isAvailable()) {

                System.out.println(
                        "Room No: " + room.getRoomNumber()
                                + " | Category: "
                                + room.getCategory());
            }
        }
    }

    public void bookRoom(int roomNumber, String customerName) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber
                    && room.isAvailable()) {

                room.setAvailable(false);

                bookings.add(
                        new Booking(customerName, room));

                System.out.println("\nBooking Successful!");
                System.out.println("Payment Status: Paid");

                return;
            }
        }

        System.out.println("\nRoom not available!");
    }

    public void cancelBooking(int roomNumber) {

        for (Booking booking : bookings) {

            if (booking.getRoom()
                    .getRoomNumber() == roomNumber) {

                booking.getRoom()
                        .setAvailable(true);

                bookings.remove(booking);

                System.out.println(
                        "\nBooking Cancelled Successfully!");

                return;
            }
        }

        System.out.println("\nBooking not found!");
    }

    public void viewBookings() {

        if (bookings.isEmpty()) {

            System.out.println("\nNo bookings found.");
            return;
        }

        for (Booking booking : bookings) {

            booking.displayBooking();
        }
    }
}