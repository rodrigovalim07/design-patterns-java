package app;

import entities.Agenda;

public class Programa {

	public static void main(String[] args) {
		reservaDia("Sexta");
		reservaDia("Sábado");
		
	}

	public static void reservaDia(String dia) {
		Agenda agenda = new Agenda();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}
}
