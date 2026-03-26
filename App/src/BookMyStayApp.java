public class BookMyStayApp {
    public static void main (String[] args){
        abstract class Room {
            private String type;
            private int beds;
            private double size;
            private double price;

            public Room(String type, int beds, double size, double price) {
                this.type = type;
                this.beds = beds;
                this.size = size;
                this.price = price;
            }

            public void displayDetails() {
                System.out.println("Room Type: " + type);
                System.out.println("Beds: " + beds);
                System.out.println("Size: " + size + " sq.ft");
                System.out.println("Price: ₹" + price);
            }
        }

// Single Room
        class SingleRoom extends Room {
            public SingleRoom() {
                super("Single Room", 1, 200, 1500);
            }
        }

// Double Room
        class DoubleRoom extends Room {
            public DoubleRoom() {
                super("Double Room", 2, 350, 2500);
            }
        }

// Suite Room
        class SuiteRoom extends Room {
            public SuiteRoom() {
                super("Suite Room", 3, 600, 5000);
            }
        }

// Main Application
        public class HotelApp {
            public static void main(String[] args) {

                // Polymorphism
                Room single = new SingleRoom();
                Room doubleRoom = new DoubleRoom();
                Room suite = new SuiteRoom();

                // Static availability variables
                int singleAvailability = 5;
                int doubleAvailability = 3;
                int suiteAvailability = 2;

                System.out.println("=== Room Information ===\n");

                single.displayDetails();
                System.out.println("Available: " + singleAvailability);
                System.out.println();

                doubleRoom.displayDetails();
                System.out.println("Available: " + doubleAvailability);
                System.out.println();

                suite.displayDetails();
                System.out.println("Available: " + suiteAvailability);
                System.out.println();

                System.out.println("Application terminated.");
            }
        }
    }
}
