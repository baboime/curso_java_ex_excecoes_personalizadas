package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número do quarto: ");
		int numeroQuarto = sc.nextInt();
		System.out.print("Data do check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data do check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: Data do check-out deve ser posterior a data do check-in");
		}
		else {
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println(reserva);
			
			System.out.println();
			System.out.println("Informe os dados para atualizar a reserva: ");
			System.out.print("Data do check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			String erro = reserva.atualizaDatas(checkIn, checkOut);
			
			if (erro != null) {
				System.out.println("Erro na reserva: " + erro);
			}
			else {
				System.out.println(reserva);
			}
		}
		sc.close();
	}
}
