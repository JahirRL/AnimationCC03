import java.util.Random;

public class Monitor{
	
	public Modulo[] Modulos=new Modulo[4];
	public Random aleatorio=new Random();
	int moduloAsignado;
    boolean moduloDisponible;
    
	public Monitor(){
		Modulos[0]=new Modulo(101);
		Modulos[1]=new Modulo(102);
		Modulos[2]=new Modulo(105);
		Modulos[3]=new Modulo(106);
	}
	
    public synchronized int seleccionarEntrada(){
        return ((int)(aleatorio.nextDouble() * 3 + 0));
    }
    
	public synchronized int encontrarClase(){
		return ((int)(aleatorio.nextDouble() * 4 + 0));
	}
	
	public synchronized boolean verificarDisponibilidadA(int numero){
		if(Modulos[numero].lugares==0){
			return false;
		}
		
		else{
			if(Modulos[numero].profesorPresente==false){//The teacher is not here yet
				Modulos[numero].lugaresOcupados+=1;//reserves his seat
			}
			
			while(Modulos[numero].profesorPresente==false){
				try {
					wait();
				}catch(Exception e) {}
			}
			
			return true;
		}
	}
	
	public synchronized int verificarDisponibilidadM(){
		int moduloAsignado=((int)(aleatorio.nextDouble() * 4 + 0));
		
		if(Modulos[moduloAsignado].profesorPresente==true){
			//If the place is taken by other teacher, search for another
			moduloDisponible=false;
			
			for(int i=0;i<4;i++){//Search for other
				if(Modulos[i].profesorPresente==false){//If it is free, take it
					moduloDisponible=true;
					moduloAsignado=i;
					break;
				}
			}
			
			if(moduloDisponible==true){
				return moduloAsignado;
			}
            
            else{
                return -1;
            }
		}
		
        else{
            return moduloAsignado;
        }
	}
	
    public synchronized void profesorEntra(int numero){
        Modulos[numero].profesorPresente=true;
        notifyAll();
    }
	
    public synchronized void claseEnCurso(int numero){
        while(Modulos[numero].profesorPresente==true){
            try{
                wait();
            }catch(Exception e){}
        }
    }
	
    public synchronized void claseFinzalizada(int numero){
        Modulos[numero].profesorPresente=false;
        notifyAll();
    }
    
}
