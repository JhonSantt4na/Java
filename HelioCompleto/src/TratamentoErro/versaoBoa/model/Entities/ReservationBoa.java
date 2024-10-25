package TratamentoErro.versaoBoa.model.Entities;

import TratamentoErro.versaoBoa.model.Exceptions.DoMainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationBoa {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ReservationBoa(Integer roomNumber, Date checkin, Date checkout) throws DoMainException {
		if (!checkout.after(checkin)){
			throw  new DoMainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckin() {
		return checkin;
	}
	
	public Date getCheckout() {
		return checkout;
	}
	
	// Methods
	public long duration() {
		long diff= checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	// o methodo vai retorna uma exeção caso tenha um erro
	public void updateDate(Date checkIn, Date checkOut) throws DoMainException{
		// Precisamos colocar a assinatura, para que o metodo possa lança uma execção
		// Passa pelo os if e se e caso passe direto não tera exeção
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DoMainException("Reservation dates for update must be future dates");
			// IllegalArgumentException : quando os argumentos são invalidos
		}
		if (!checkOut.after(checkIn)){
			throw  new DoMainException("heck-out date must be after check-in date");
		}
		this.checkin = checkIn;
		this.checkout = checkOut;
	}
	
	@Override //Sempre colocamos no toString
	public String toString() {
		return "Room: "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkin)
			+ ", check-out: "
			+ sdf.format(checkout)
			+ " "
			+ duration()
			+ " nights";
	}
}
