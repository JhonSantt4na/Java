package _07_TratamentoErro.VersaoMuitoRuim;

import _07_TratamentoErro.VersaoMuitoRuim.Model.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramMR {
	public static void main(String[] args) throws ParseException {
		// throws ParseException = sem isso o main é um metodo normal que não tem exceção
		// So que como usamos o metodo que pode lanca uma execção o compilador reclama ou agente trata essa esceção ou voce
		// propaga essa execção no metodo que voce esta no caso :
		// meu metodo main não precisa trata e se axceção sera propagada por outro metodo ou propagar tambem criando uma pilha de execão
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in Date ( dd/MM/yyyy ): ");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.print("Check-Out Date ( dd/MM/yyyy ): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)){ // Methodo da data para check se data1.antes(data2)
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in Date ( dd/MM/yyyy ): ");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-Out Date ( dd/MM/yyyy ): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}else if (!checkOut.after(checkIn)){
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else {
				reservation.updateDate(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
			
		}
		// SOLUÇÂO MUITO RUIM
		// Com essa versão temos problema de Delegação pois quem deveria ser responsavel por saber sobre a reserva
		// era a propria reserva e não o aplicativo principal
		sc.close();
	}
}
