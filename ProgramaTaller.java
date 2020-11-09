package Entregable1.copy;

import java.util.Scanner;
public class ProgramaTaller {
	public static void main(String[] args) {
		boolean km = true;
		
				//aquí nos pide que introduzcamos los datos que luego podremos ver y editar)
		Scanner sc = new Scanner(System.in);

		System.out.println("introduzca el modelo");
		String modelo = sc.nextLine();

		System.out.println("introduzca el kilometraje");
		int Km = sc.nextInt();
		while (Km < 0) {
			System.out.println("km incorrectos,vuelve a introducir los km");
			Km = sc.nextInt();
		}

		System.out.println("introduzca el nombre del dueño");
		sc.nextLine();
		String dueño = sc.nextLine();

		System.out.println("introduzca el modelo del segundo coche");
		String modelo2 = sc.nextLine();
		
		System.out.println("introduzca el kilometraje del segundo coche");
		int Km2 = sc.nextInt();
		while (Km2 < 0) {
			System.out.println("km incorrectos,vuelve a introducir los km");
			Km2 = sc.nextInt();
		}

		System.out.println("introduzca el nombre del dueño del segundo coche");
		sc.nextLine();
		String dueño2 = sc.nextLine();

//una vez introducidos los datos, el programa da una serie de comandos para acceder a las opciones
		Coche coche1;
		coche1 = new Coche(modelo, Km, dueño);
		Coche coche2;
		coche2 = new Coche(modelo, Km, dueño);
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println("qué quieres hacer");

		System.out.println("verModelo1 para saber el modelo del primer coche");
		System.out.println("verKm1 para saber el kilometraje del primer coche");
		System.out.println("verDueño1 para saber el nombre del dueño del primer coche");

		System.out.println("verModelo2 para saber el modelo del segundo coche");
		System.out.println("verKm2 para saber el kilometraje del segundo coche");
		System.out.println("verDueño2 para saber el nombre del dueño del segundo coche");

		System.out.println("modModelo1 para modificar el modelo del primer coche");
		System.out.println("modKm1 para modificar el kilometraje del primer coche");
		System.out.println("modDueño1 para modificar el nombre del dueño del primer coche");

		System.out.println("modModelo2 para modificar el modelo del segundo coche");
		System.out.println("modKm2 para modificar el kilometraje del segundo coche");
		System.out.println("modDueño2 para modificar el nombre del dueño del segundo coche");

		System.out.println("estado1 para saber el estado del primer coche");
		System.out.println("estado2 para saber el estado del segundo coche");
		System.out.println("rep1 para reparar el primer coche");
		System.out.println("rep2 para reparar el segundo coche");

		System.out.println("exit para salir del programa");
		//el bucle en el que el usuario empieza a interactuar una vez introduce uno de los comandos 
		boolean salir = false;

		while (!salir) {
		
			
			String eleccion = sc.nextLine();
			switch (eleccion) {
			
			case "verModelo1": {
				System.out.println(coche1.getModelo());
			}
			case "verKm1":{
				System.out.println(coche1.getKm());
				break;
			}
			case "verDueño1":{
				System.out.println(coche1.getDueño());
				break;
			}
			case "verModelo2":{
				System.out.println(coche2.getModelo());				
				break;
			}
			case "verKm2":{
				System.out.println(coche2.getKm());
				break;
			}
			case "verDueño2":{
				System.out.println(coche2.getDueño());
				break;
			}
			case "modModelo1":{
				System.out.println("introduce el nuevo modelo");
				coche1.setmodelo(sc.nextLine());
				System.out.println("el modelo ha sido cambiado exitosamente");
				break;
			}
			case "ModKm1":{
				System.out.println("introduce el nuevo kilometraje");
				coche1.setKm(sc.nextInt());
				System.out.println("el kilometraje ha cambiado");
				break;
			}
			case "ModDueño1":{
				System.out.println("introduzca el nombre del nuevo dueño");
				coche1.setdueño(sc.nextLine());
				System.out.println("el dueño ha sido cambiado exitosamente");
				break;
			}
			case "ModModelo2":{
				System.out.println("cambie el modelo");
				coche2.setmodelo(sc.nextLine());
				System.out.println("el modelo ha sido cambiado exitosamente");
				break;
			}
			case "ModKm2":{
				System.out.println("Introduzca el nuevo Kilometraje");
				coche2.setKm(sc.nextInt());
				System.out.println("el kilometraje ha cambiado");
				break;
			}
			case "ModDueño2"  :{
				System.out.println("Introduzca el nombre del nuevo modelo");
				coche2.setdueño(sc.nextLine());
				System.out.println("el dueño ha sido cambiado exitosamente");
				break;
			//en esta parte se accede al boolean de reparado, en el veremos si está reparado, y si no lo está. usamos los reps para cambiar el booleano a true para reparar los coches
			}
			case "estado1" :{
				System.out.println(coche1);
				break;
			}
			case "estado2" :{
				System.out.println(coche2);
				break;
			}
			case "rep1" :{
				coche1.setreparado(true);
				System.out.println(coche1);
				break;
			}
			case "rep2" :{
				coche2.setreparado(true);
				System.out.println(coche2);
				break;
			}
			//una vez el cliente ha terminado de revisar lo que estaba haciendo, escribe el comando exita para salir de la aplicación
			case "exit" :{
				System.out.println("espero haber sido de ayuda");
				System.exit(0);
				break;
			}
			//para que el programa no de error, le ponemos un default para que en el caso de que no le demos al programa lo que quiere, en vez de lanzar una exemption, nos diga que los datos son inccorrectos y que introduzcamos datos válidos
			default:
				System.out.println("Por favor introduce una opcion válida");
			}

		}
		sc.close();
		

	}

}
