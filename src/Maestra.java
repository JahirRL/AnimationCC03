import java.util.Random;

public class Maestra extends Thread{
	public Monitor monitor;
	public int moduloAsignado;
	public int entradaSeleccionada;
	Random aleatorio=new Random();
	public Fondo fCC03;
	Dibujo nuevoD;
	int tiempo=50;
	
	
	public Maestra(Monitor monitor, Fondo fCC03){
		aleatorio=new Random();
        this.monitor=monitor;
        this.fCC03=fCC03;
        nuevoD=new Dibujo(1);
        moduloAsignado=-1;
	}
	
	public void run(){
		
		while(moduloAsignado!=monitor.verificarDisponibilidadM()){//Teacher gets a module
			moduloAsignado=monitor.verificarDisponibilidadM();
		}
        
		if(moduloAsignado!=-1){//If the teacher found a free module
		    
            entradaSeleccionada=monitor.seleccionarEntrada();
            
			entrar(entradaSeleccionada);
            
            entrarAlModulo(entradaSeleccionada,moduloAsignado);
            
            monitor.profesorEntra(moduloAsignado);
			
			tomarAsiento(moduloAsignado);
			
			try{
				sleep(50000);//Duration of the class
			} catch (InterruptedException e) {}
			
			salirDelEdificio(moduloAsignado);
			
			monitor.claseFinzalizada(moduloAsignado);//Teacher finishes the class
			
			nuevoD.visible=false;		
			
		}
		
		else{
			nuevoD.visible=false;
		}
		 
	}
	
	public void entrar(int entradaSeleccionada){
        nuevoD.visible=true;
        
        switch(entradaSeleccionada){
            case 0:
                nuevoD.x=550;
                nuevoD.y=600;
                break;//Entrance number 1, the principal entrance 
                
            case 1:
                nuevoD.x=200;
                nuevoD.y=300;
                break;//Entrance number 2
                
            case 2:
                nuevoD.x=610;
                nuevoD.y=260;
                break;//Entrance number 2
                
            default:
                break;
        }
        
        //Add the new teacher to the background
        fCC03.agregar(nuevoD);
        fCC03.repaint();
    }
	
	public void entrarAlModulo(int entradaSeleccionada, int moduloAsignado){
		
		int auxiliarx=nuevoD.x;
        int auxiliary=nuevoD.y;
		
        switch(entradaSeleccionada){
            //------------------------------------------------------------En el caso de que haya entrado desde 0------------------------------------------------------------//
            case 0:
                
                switch(moduloAsignado){
                        
                    case 0:
                        
                        while(auxiliary>320){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx>445){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<360){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 1:
                        
                        while(auxiliary>260){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx>450){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 2:
                        
                        while(auxiliary>260){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx<640){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;			
                        
                    case 3:
                        
                        while(auxiliary>320){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx<640){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<360){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }

                        break;
                }
                
                break;
                
                
            //--------------------------------------------------------------------------------------------------------------------------------------------------------------//
                
                
                
            //------------------------------------------------------------En el caso de que haya entrado desde 1------------------------------------------------------------//
            case 1:
                
                switch(moduloAsignado){
                        
                    case 0:
                        
                        while(auxiliarx<445){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<360){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 1:
                        
                        while(auxiliarx<480){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>260){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx>450){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 2:
                        
                        while(auxiliarx<605){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>260){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx<640){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 3:
                        
                        while(auxiliarx<640){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<360){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                }
                
                break;
                
            //--------------------------------------------------------------------------------------------------------------------------------------------------------------//
                
                
            //------------------------------------------------------------En el caso de que haya entrado desde 2------------------------------------------------------------//
            case 2:
                
                switch(moduloAsignado){
                        
                    case 0:
                        
                        while(auxiliarx>550){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<300){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx>450){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<360){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 1:
                        
                        while(auxiliarx<480){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>260){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx>450){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 2:
                        
                        while(auxiliarx<605){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>260){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx<640){
                            try{
                                Thread.sleep(tiempo);
                            } catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 3:
                        
                        while(auxiliary<300){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliarx<640){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<360){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                }
                
                break;
                
            //--------------------------------------------------------------------------------------------------------------------------------------------------------------//
        }
    }
    
    public void tomarAsiento(int moduloAsignado){
        
        int auxiliarx=nuevoD.x;
        int auxiliary=nuevoD.y;
        
        switch(moduloAsignado){
            case 0:
                while(auxiliary<370){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx>290){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                break;
                
            case 1:
                
                while(auxiliarx>425){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliary>120){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                break;
                
            case 2:
                while(auxiliarx<655){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliary>120){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                break;
                
            case 3:
                
                while(auxiliary<370){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx<780){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }

                
                break;
        }
        
    }

    public void salirDelEdificio(int moduloAsignado){
    	
    	int auxiliarx=nuevoD.x;
        int auxiliary=nuevoD.y;
    	
    	switch(moduloAsignado){
            
            case 0:
                
                while(auxiliarx<445){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliary>300){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx>200){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                nuevoD.setX(-30);
                nuevoD.setY(auxiliary);
                fCC03.repaint();
                
    		break;
    		
            
            case 1:
                
                while(auxiliary<260){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx<610){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                
                while(auxiliary>240){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                nuevoD.setX(auxiliarx);
                nuevoD.setY(-30);
                fCC03.repaint();
                
                break;
    		
            case 2:
                
                while(auxiliary<260){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx>550){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                
                while(auxiliary<600){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                nuevoD.setX(auxiliarx);
                nuevoD.setY(-30);
                fCC03.repaint();
                
                break;
                
            case 3:
                
                while(auxiliarx>640){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliary>300){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx>200){
                    
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                nuevoD.setX(-30);
                nuevoD.setY(auxiliary);
                fCC03.repaint();
                
                break;
    		
    	}
    }
}
