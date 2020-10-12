import java.time.LocalDate;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			LocalDate arrivalDate = Console.getLocalDate("arrival");
			LocalDate departureDate = Console.getLocalDate("departure");

			Reservation res = new Reservation(arrivalDate, departureDate);

			System.out.println("arrival date" + res.getArrivalDateFormatted());
			System.out.println("departure date" + res.getDepartureDateFormatted());
			System.out.println("price" + res.getPricePerNightFormatted());
			System.out
					.println("total price" + res.getTotalPriceFormatted() + "for" + res.getNumberOfNights() + "nights");

			choice = Console.getString("Continue: y/n");
		}
	}

}
