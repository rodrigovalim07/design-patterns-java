package app;

import entities.AgendaSingletonEAGER;
import entities.AgendaSingletonEnum;
import entities.AgendaSingletonLAZY;

public class ProgramaComSingleton {

	public static void main(String[] args) {
		
		// verificando se a instancia do objeto se mantém no mesmo local de memória
		// tem como burlar e instanciar objetos com ponteiros diferentes
//		AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
//		AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
//		System.out.println(agenda1);
//		System.out.println(agenda2);
		
		AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
		AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
		System.out.println(agenda1.hashCode());
		System.out.println(agenda2.hashCode());
		
		reservaDiaEnum("Sexta");
		reservaDiaEnum("Sábado");
		
	}

	public static void reservaDiaEAGER(String dia) {
		AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}

	public static void reservaDiaLAZY(String dia) {
		AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}
	
	public static void reservaDiaEnum(String dia) {
		AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
		agenda.ocupa(dia);
		System.out.println(agenda.getDias());
	}
}
