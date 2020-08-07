import java.util.Scanner;

public class Emisoras {
    double frecuencias=81.0;
    int subir = 1;
    int bajar = 2;
    
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
    private void error() {
		if(subir !=1 && bajar != 2);
		System.out.println("OPCION NO ENCONTRADA");
		
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
		case 3:error();;break;
		case 4:error();;break;
		case 5:error();;break;
		case 6:error();;break;
		case 7:error();;break;
		case 8:error();;break;
		case 9:error();;break;
		}		
	}
	
	public static void main(String[] args) {
		Emisoras emisoras=new Emisoras();
		emisoras.menu();
	}
}