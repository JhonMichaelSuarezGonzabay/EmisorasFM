import java.util.Scanner;

public class Emisoras {
    double frecuencias=81.0;

    
    public void subirVolumen() {
    	if(frecuencias>179.5) {
    		frecuencias=80.0;
    		System.out.println("Su frecuencia actual es "+ frecuencias +"\n");
    	}
    	else {
    		frecuencias+=0.5;
    		System.out.println("Su frecuencia actual es " + frecuencias +"\n");	
    	}
    	menu();
    }
    public void bajarVolumen() {
    	if(frecuencias<80.5) {
    		frecuencias=180.0;
    		System.out.println("Su frecuencia actual es " + frecuencias +"\n");
    	}
    	else if(frecuencias>80){
    		frecuencias-=0.5;
    		System.out.println("Su frecuencia actual es " + frecuencias +"\n");
    	}
    	menu();
    }

    	
    public void menu() {
		System.out.println("QUE DESEA HACER\n");
		System.out.println("1.subir volumen");
		System.out.println("2.bajar volumen");

		
		System.out.println("DIGITE OPCION:");
		Scanner entra = new Scanner(System.in);
		int opcion=entra.nextInt();
		switch (opcion) {
		case 1:subirVolumen();;break;
		case 2:bajarVolumen();;break;	
		default: System.out.println("OPCION INCORRECTA");break;
		}		
	}
	
	public static void main(String[] args) {
		Emisoras emisoras=new Emisoras();
		emisoras.menu();
	}
}