public class Booking {

    private String customerName;
    private Room room;

    public Booking(String customerName, Room room) {
        this.customerName = customerName;
        this.room = room;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Room getRoom() {
        return room;
    }

    public void displayBooking() {

        System.out.println("\n===== BOOKING DETAILS =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Room Number   : " + room.getRoomNumber());
        System.out.println("Room Category : " + room.getCategory());
    }
}