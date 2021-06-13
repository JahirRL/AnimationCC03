public class Modulo{
	public final int lugares=28;
	public int lugaresOcupados=0;
	public boolean profesorPresente=false;
	public int numeroModulo;
	
	public Modulo(int numero){
		numeroModulo=numero;
		System.out.println("Se ha creado el modulo: "+numero+".");
	}
	
	public int obtenerAsientosLibres(){
		return lugares-lugaresOcupados;
	}
	
	public int obtenerAsientosOcupados(){
		return lugaresOcupados;
	}
	
	public int obtenerNumeroModulo(){
		return numeroModulo;
	}
	
	public boolean profesorPresente(){
		return profesorPresente;
	}
	
	public void comenzarClase(){
		profesorPresente=true;
	}
	
	public void claseFinalizada(){
		profesorPresente=false;
		lugaresOcupados=0;
		//Llamado a la funcion estatica que saque graficamente a todos los alumnos
	}
	
	public void ocuparAsiento(){
		lugaresOcupados++;
	}
}

