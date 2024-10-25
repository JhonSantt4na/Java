package TratamentoErro.versaoBoa;

import TratamentoErro.versaoBoa.model.Entities.ReservationBoa;
import TratamentoErro.versaoBoa.model.Exceptions.DoMainException;

import java.rmi.UnexpectedException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaBoa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			// Como o construtor ja está no try ja sera tratado
			System.out.print("Room Number: ");
			int number = sc.nextInt();
			
			System.out.print("Check-in Date ( dd/MM/yyyy ): ");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-Out Date ( dd/MM/yyyy ): ");
			Date checkOut = sdf.parse(sc.next());
			
			ReservationBoa reservation = new ReservationBoa(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in Date ( dd/MM/yyyy ): ");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-Out Date ( dd/MM/yyyy ): ");
			checkOut = sdf.parse(sc.next());
			
			// Compilador reclama que tem uma excção ou propaga ou trata a com o catch
			reservation.updateDate(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e){
			System.out.println("Invalid date format");
		}
		catch (DoMainException e) {
			System.out.println("Error In Reservation: " + e.getMessage());
			// sendo getMessage a que eu passei no methodo
		} catch (RuntimeException e) { // caso aconteca qualquer outra exeption ele vai fazer o cache para o rumtimeexeption
			System.out.println("Unexpected Error");
		}
		sc.close();
	}
}
