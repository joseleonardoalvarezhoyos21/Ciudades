import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Paises {
	HashMap<String,ArrayList<String>> mapaPais=new HashMap<String,ArrayList<String>>();
	ArrayList<String> ciudades;
			
	int menu=0;
	String pais="";
	String ciudad="";
	
	public void iniciar() {
		do {
		System.out.println("entro a iniciar");
		menu= Integer.parseInt(JOptionPane.showInputDialog("****************menu****************\n\n"
				+ "1. Registrar\n"
				+ "2. Registrar Ciudades\n"
				+ "3. Consultar por pais la lista asociada\n"
				+ "4. Consultar Ciudades\n"
				+ "5. Salir.\n"));
		procesos(menu);
		}while(menu !=5);
		
		
	}

	public void procesos(int menu) {
		
		
		switch (menu) {
		case 1:
			registrar();
		
			break;
		case 2: 
			registrarCiudades();
			break;
		case 3:
			consultarPorPais();
			break;
		case 4: 
			consultarCiudades();
			break;
		case 5:
			System.out.println("Gracias por usar el codigo");
			
		default:
			break;
			
		}
	
		
	}

	private void consultarCiudades() {
		ciudad= JOptionPane.showInputDialog("Ingrese la ciudad a consultar:");
		
		
        boolean ciudadEncontrada =false;
        
        for(String paiis : mapaPais.keySet()) {
      	  
      	  ciudades = mapaPais.get(paiis);
      	  
      	    if(ciudades.contains(ciudad)) {
      	    	
      	    	System.out.println(ciudad+" pertenece a "+paiis);
      	    	ciudadEncontrada =true;
      	    	
      	    }
        }
		
		
			
		
		
		
		
		
	}

	private void consultarPorPais() {
		String busqueda=JOptionPane.showInputDialog("ingrese el pais a buscar");
        HashMap<String, ArrayList<String>> hashMap;
        if (mapaPais.containsKey(busqueda)) {
            System.out.printf("El pais "+ pais +"si esta");
        }else {
            System.out.printf("El pais "+ pais + "No esta");
        }
		

		
	}

	private void registrarCiudades() {
		pais= JOptionPane.showInputDialog("Primero Ingrese el Nombre del pais para registrar sus ciudades y verificar si existe.");
		if(!mapaPais.containsKey(pais)) {
		
			System.out.println("El país no ha sido registrado. Registre el país primero.");
			return;
		}
			
		ciudad= JOptionPane.showInputDialog("Ingrese la ciudades a registrar");
		ciudades = mapaPais.get(pais);
		ciudades.add(ciudad);
		System.out.println("Ciudad registrada exitosamente");
		System.out.println(mapaPais);
		
	
		
	}

	private void registrar() {
		pais=JOptionPane.showInputDialog("Ingrese el pais: ");
		int pregunta;
		ciudades= new ArrayList<>();
			
		pregunta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ciudades: "));
		for(int i=0; i<pregunta; i++) {
			ciudad=JOptionPane.showInputDialog("ingrese la ciudad");
			ciudades.add(ciudad);
			mapaPais.put(pais,ciudades);
		}
		System.out.println(mapaPais);
		iniciar();
		
		
		
		
	
		
	}
	

}
