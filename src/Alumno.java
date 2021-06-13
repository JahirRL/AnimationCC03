import java.util.Random;

public class Alumno extends Thread {
    
    public Monitor monitor;
    public int entradaSeleccionada;
    public int moduloAsignado;
    public int asientoSeleccionado=-1;
    public Fondo fCC03;
    Dibujo nuevoD;
    public Random aleatorio;
    int tiempo=70;
    int i,j;
    
    public static int EspacioReservado1[][]=new int[2][9];
    public static int EspacioReservado2[][]=new int[2][6];
    public static int EspacioReservado3[][]=new int[2][6];
    public static int EspacioReservado4[][]=new int[2][9];
    
    public static int Modulo101[][]=new int[3][28];
    public static int Modulo102[][]=new int[3][28];
    public static int Modulo105[][]=new int[3][28];
    public static int Modulo106[][]=new int[3][28];
    
    public Alumno(Monitor monitor, Fondo fCC03){
        aleatorio=new Random();
        this.monitor=monitor;
        this.fCC03=fCC03;
        nuevoD=new Dibujo(2);
    }
    
    static{
    	
    	//------------zona 1-------//
        EspacioReservado1[0][0]=485;
        EspacioReservado1[0][1]=485;
        EspacioReservado1[0][2]=485;
        EspacioReservado1[0][3]=505;
        EspacioReservado1[0][4]=505;
        EspacioReservado1[0][5]=505;
        EspacioReservado1[0][6]=525;
        EspacioReservado1[0][7]=525;
        EspacioReservado1[0][8]=525;
        
        EspacioReservado1[1][0]=360;
        EspacioReservado1[1][1]=400;
        EspacioReservado1[1][2]=440;
        EspacioReservado1[1][3]=360;
        EspacioReservado1[1][4]=400;
        EspacioReservado1[1][5]=440;
        EspacioReservado1[1][6]=360;
        EspacioReservado1[1][7]=400;
        EspacioReservado1[1][8]=440;
        
        //------------zona 2-------//
        EspacioReservado2[0][0]=500;
        EspacioReservado2[0][1]=500;
        EspacioReservado2[0][2]=500;
        EspacioReservado2[0][3]=520;
        EspacioReservado2[0][4]=520;
        EspacioReservado2[0][5]=520;
        
        EspacioReservado2[1][0]=150;
        EspacioReservado2[1][1]=190;
        EspacioReservado2[1][2]=230;
        EspacioReservado2[1][3]=150;
        EspacioReservado2[1][4]=190;
        EspacioReservado2[1][5]=230;
        
      //------------zona 3-------//
        EspacioReservado3[0][0]=560;
        EspacioReservado3[0][1]=560;
        EspacioReservado3[0][2]=560;
        EspacioReservado3[0][3]=580;
        EspacioReservado3[0][4]=580;
        EspacioReservado3[0][5]=580;
        
        EspacioReservado3[1][0]=150;
        EspacioReservado3[1][1]=190;
        EspacioReservado3[1][2]=230;
        EspacioReservado3[1][3]=150;
        EspacioReservado3[1][4]=190;
        EspacioReservado3[1][5]=230;
        
        
        //------------zona 4-------//
        EspacioReservado4[0][0]=565;
        EspacioReservado4[0][1]=565;
        EspacioReservado4[0][2]=565;
        EspacioReservado4[0][3]=585;
        EspacioReservado4[0][4]=585;
        EspacioReservado4[0][5]=585;
        EspacioReservado4[0][6]=605;
        EspacioReservado4[0][7]=605;
        EspacioReservado4[0][8]=605;
        
        EspacioReservado4[1][0]=360;
        EspacioReservado4[1][1]=400;
        EspacioReservado4[1][2]=440;
        EspacioReservado4[1][3]=360;
        EspacioReservado4[1][4]=400;
        EspacioReservado4[1][5]=440;
        EspacioReservado4[1][6]=360;
        EspacioReservado4[1][7]=400;
        EspacioReservado4[1][8]=440;
        //--------------------------//
        
        for(int i=0;i<28;i++){
        	Modulo101[0][i]=0;
        	Modulo102[0][i]=0;
        	Modulo105[0][i]=0;
        	Modulo106[0][i]=0;
        }
        
        
        Modulo101[1][0]=300;
        Modulo101[1][1]=330;
        Modulo101[1][2]=360;
        Modulo101[1][3]=390;
        Modulo101[1][4]=420;
        Modulo101[1][5]=300;
        Modulo101[1][6]=330;
        Modulo101[1][7]=360;
        Modulo101[1][8]=390;
        Modulo101[1][9]=420;
        Modulo101[1][10]=300;
        Modulo101[1][11]=330;
        Modulo101[1][12]=360;
        Modulo101[1][13]=390;
        Modulo101[1][14]=420;
        Modulo101[1][15]=300;
        Modulo101[1][16]=330;
        Modulo101[1][17]=360;
        Modulo101[1][18]=390;
        Modulo101[1][19]=420;
        Modulo101[1][20]=315;
        Modulo101[1][21]=345;
        Modulo101[1][22]=375;
        Modulo101[1][23]=405;
        Modulo101[1][24]=315;
        Modulo101[1][25]=345;
        Modulo101[1][26]=375;
        Modulo101[1][27]=405;
        
        Modulo101[2][0]=410;
        Modulo101[2][1]=410;
        Modulo101[2][2]=410;
        Modulo101[2][3]=410;
        Modulo101[2][4]=410;
        Modulo101[2][5]=445;
        Modulo101[2][6]=445;
        Modulo101[2][7]=445;
        Modulo101[2][8]=445;
        Modulo101[2][9]=445;
        Modulo101[2][10]=485;
        Modulo101[2][11]=485;
        Modulo101[2][12]=485;
        Modulo101[2][13]=485;
        Modulo101[2][14]=485;
        Modulo101[2][15]=525;
        Modulo101[2][16]=525;
        Modulo101[2][17]=525;
        Modulo101[2][18]=525;
        Modulo101[2][19]=525;
        Modulo101[2][20]=560;
        Modulo101[2][21]=560;
        Modulo101[2][22]=560;
        Modulo101[2][23]=560;
        Modulo101[2][24]=595;
        Modulo101[2][25]=595;
        Modulo101[2][26]=595;
        Modulo101[2][27]=595;
        
        Modulo102[1][0]=380;
        Modulo102[1][1]=380;
        Modulo102[1][2]=380;
        Modulo102[1][3]=380;
        Modulo102[1][4]=350;
        Modulo102[1][5]=350;
        Modulo102[1][6]=350;
        Modulo102[1][7]=350;
        Modulo102[1][8]=320;
        Modulo102[1][9]=320;
        Modulo102[1][10]=320;
        Modulo102[1][11]=320;
        Modulo102[1][12]=290;
        Modulo102[1][13]=290;
        Modulo102[1][14]=290;
        Modulo102[1][15]=290;
        Modulo102[1][16]=260;
        Modulo102[1][17]=260;
        Modulo102[1][18]=260;
        Modulo102[1][19]=260;
        Modulo102[1][20]=230;
        Modulo102[1][21]=230;
        Modulo102[1][22]=230;
        Modulo102[1][23]=230;
        Modulo102[1][24]=200;
        Modulo102[1][25]=200;
        Modulo102[1][26]=200;
        Modulo102[1][27]=200;
        
        Modulo102[2][0]=110;
        Modulo102[2][1]=160;
        Modulo102[2][2]=210;
        Modulo102[2][3]=260;
        Modulo102[2][4]=110;
        Modulo102[2][5]=160;
        Modulo102[2][6]=210;
        Modulo102[2][7]=260;
        Modulo102[2][8]=110;
        Modulo102[2][9]=160;
        Modulo102[2][10]=210;
        Modulo102[2][11]=260;
        Modulo102[2][12]=110;
        Modulo102[2][13]=160;
        Modulo102[2][14]=210;
        Modulo102[2][15]=260;
        Modulo102[2][16]=110;
        Modulo102[2][17]=160;
        Modulo102[2][18]=210;
        Modulo102[2][19]=260;
        Modulo102[2][20]=110;
        Modulo102[2][21]=160;
        Modulo102[2][22]=210;
        Modulo102[2][23]=260;
        Modulo102[2][24]=110;
        Modulo102[2][25]=160;
        Modulo102[2][26]=210;
        Modulo102[2][27]=260;
        
        Modulo105[1][0]=680;
        Modulo105[1][1]=680;
        Modulo105[1][2]=680;
        Modulo105[1][3]=680;
        Modulo105[1][4]=710;
        Modulo105[1][5]=710;
        Modulo105[1][6]=710;
        Modulo105[1][7]=710;
        Modulo105[1][8]=740;
        Modulo105[1][9]=740;
        Modulo105[1][10]=740;
        Modulo105[1][11]=740;
        Modulo105[1][12]=770;
        Modulo105[1][13]=770;
        Modulo105[1][14]=770;
        Modulo105[1][15]=770;
        Modulo105[1][16]=800;
        Modulo105[1][17]=800;
        Modulo105[1][18]=800;
        Modulo105[1][19]=800;
        Modulo105[1][20]=830;
        Modulo105[1][21]=830;
        Modulo105[1][22]=830;
        Modulo105[1][23]=830;
        Modulo105[1][24]=860;
        Modulo105[1][25]=860;
        Modulo105[1][26]=860;
        Modulo105[1][27]=860;
        
        Modulo105[2][0]=110;
        Modulo105[2][1]=160;
        Modulo105[2][2]=210;
        Modulo105[2][3]=260;
        Modulo105[2][4]=110;
        Modulo105[2][5]=160;
        Modulo105[2][6]=210;
        Modulo105[2][7]=260;
        Modulo105[2][8]=110;
        Modulo105[2][9]=160;
        Modulo105[2][10]=210;
        Modulo105[2][11]=260;
        Modulo105[2][12]=110;
        Modulo105[2][13]=160;
        Modulo105[2][14]=210;
        Modulo105[2][15]=260;
        Modulo105[2][16]=110;
        Modulo105[2][17]=160;
        Modulo105[2][18]=210;
        Modulo105[2][19]=260;
        Modulo105[2][20]=110;
        Modulo105[2][21]=160;
        Modulo105[2][22]=210;
        Modulo105[2][23]=260;
        Modulo105[2][24]=110;
        Modulo105[2][25]=160;
        Modulo105[2][26]=210;
        Modulo105[2][27]=260;
        
        Modulo106[1][0]=670;
        Modulo106[1][1]=700;
        Modulo106[1][2]=730;
        Modulo106[1][3]=760;
        Modulo106[1][4]=790;
        Modulo106[1][5]=670;
        Modulo106[1][6]=700;
        Modulo106[1][7]=730;
        Modulo106[1][8]=760;
        Modulo106[1][9]=790;
        Modulo106[1][10]=670;
        Modulo106[1][11]=700;
        Modulo106[1][12]=730;
        Modulo106[1][13]=760;
        Modulo106[1][14]=790;
        Modulo106[1][15]=670;
        Modulo106[1][16]=700;
        Modulo106[1][17]=730;
        Modulo106[1][18]=760;
        Modulo106[1][19]=790;
        Modulo106[1][20]=690;
        Modulo106[1][21]=720;
        Modulo106[1][22]=750;
        Modulo106[1][23]=780;
        Modulo106[1][24]=690;
        Modulo106[1][25]=720;
        Modulo106[1][26]=750;
        Modulo106[1][27]=780;
        
        Modulo106[2][0]=405;
        Modulo106[2][1]=405;
        Modulo106[2][2]=405;
        Modulo106[2][3]=405;
        Modulo106[2][4]=405;
        Modulo106[2][5]=440;
        Modulo106[2][6]=440;
        Modulo106[2][7]=440;
        Modulo106[2][8]=440;
        Modulo106[2][9]=440;
        Modulo106[2][10]=480;
        Modulo106[2][11]=480;
        Modulo106[2][12]=480;
        Modulo106[2][13]=480;
        Modulo106[2][14]=480;
        Modulo106[2][15]=520;
        Modulo106[2][16]=520;
        Modulo106[2][17]=520;
        Modulo106[2][18]=520;
        Modulo106[2][19]=520;
        Modulo106[2][20]=555;
        Modulo106[2][21]=555;
        Modulo106[2][22]=555;
        Modulo106[2][23]=555;
        Modulo106[2][24]=590;
        Modulo106[2][25]=590;
        Modulo106[2][26]=590;
        Modulo106[2][27]=590;
    }
    
    public void run(){
        
        boolean tomar_clase=false;
        
        this.entradaSeleccionada=monitor.seleccionarEntrada();//The student chose an entrance
        
        entrar(entradaSeleccionada);//Making the entrance
        
        hacerEntrada(entradaSeleccionada);
        
        this.moduloAsignado=monitor.encontrarClase();//The student chose a module
        
        esperarMaestro(entradaSeleccionada,moduloAsignado);
        
        tomar_clase=monitor.verificarDisponibilidadA(moduloAsignado);//Verify if the student can the the class (teacher and free seats)
        
        if(tomar_clase==true){//If the student can take he class then do it
            
            entrarAlModulo(moduloAsignado);
            
            tomarAsiento(moduloAsignado);
            
            monitor.claseEnCurso(moduloAsignado);
            
            salirDelEdificio(moduloAsignado);
            
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
        
        //Add the new student to the background
        fCC03.agregar(nuevoD);
        fCC03.repaint();
    }
    
    public void hacerEntrada(int entradaSeleccionada){
        nuevoD.visible=true;
        
        int auxiliarx,auxiliary;
        auxiliarx=nuevoD.x;//Initial
        auxiliary=nuevoD.y;//position
        
        //int lugar=((int)(aleatorio.nextDouble() * 29 + 0));
        //int lugar2=((int)(aleatorio.nextDouble() * 24 + 0));
        
        switch(entradaSeleccionada){
        
            case 0:
                
                while(auxiliarx<550){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) { }
                    
                    auxiliarx+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliary>=490){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) { }
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }

                break;                
                
            case 1:

                while(auxiliarx<=450){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) { }
                    
                    auxiliarx+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                while(auxiliary<=310){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) { }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                
                
                break;
                
            case 2:
            	
                while(auxiliary<=280){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) { }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx>=605){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) { }
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                break;
        }

    }

    public void esperarMaestro(int entradaSeleccionada, int moduloAsignado){
        int auxiliarx=nuevoD.x;
        int auxiliary=nuevoD.y;
        int lugar;
        
        switch(entradaSeleccionada){
        //------------------------------------------------------------En el caso de que haya entrado desde 0------------------------------------------------------------//
            case 0:
            	
                switch(moduloAsignado){
                        
                    case 0:
                        
                    	lugar=((int)(aleatorio.nextDouble() * 9 + 0));
                    	
                        while(auxiliarx>EspacioReservado1[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado1[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                    case 1:
                    	
                    	lugar=((int)(aleatorio.nextDouble() * 6 + 0));
                    	
                        while(auxiliarx<EspacioReservado2[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado2[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                    	
                        break;
                        
                    case 2:
                    	
                    	lugar=((int)(aleatorio.nextDouble() * 6 + 0));
                    	
                        while(auxiliarx<EspacioReservado3[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado3[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 3:
                        lugar=((int)(aleatorio.nextDouble() * 9 + 0));
                        
                        while(auxiliarx<EspacioReservado4[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado4[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
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
                        
                        lugar=((int)(aleatorio.nextDouble() * 9 + 0));
                        
                        while(auxiliarx<EspacioReservado1[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<EspacioReservado1[1][lugar]){
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
                        
                        lugar=((int)(aleatorio.nextDouble() * 6 + 0));
                        
                        while(auxiliarx<EspacioReservado2[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado2[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 2:
                        
                        lugar=((int)(aleatorio.nextDouble() * 6 + 0));
                        
                        while(auxiliarx<EspacioReservado3[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado3[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 3:
                    	
                    	lugar=((int)(aleatorio.nextDouble() * 9 + 0));
                        
                        while(auxiliarx<EspacioReservado4[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx+=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<EspacioReservado4[1][lugar]){
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
                        
                        lugar=((int)(aleatorio.nextDouble() * 9 + 0));
                        
                        while(auxiliarx>EspacioReservado1[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<EspacioReservado1[1][lugar]){
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
                        
                        lugar=((int)(aleatorio.nextDouble() * 6 + 0));
                        
                        while(auxiliarx>EspacioReservado2[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado2[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 2:
                        
                        lugar=((int)(aleatorio.nextDouble() * 6 + 0));
                        
                        while(auxiliarx>EspacioReservado3[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary>EspacioReservado3[1][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e){ }
                            
                            auxiliary-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        break;
                        
                    case 3:
                        
                        lugar=((int)(aleatorio.nextDouble() * 9 + 0));
                        
                        while(auxiliarx>EspacioReservado4[0][lugar]){
                            try{
                                Thread.sleep(tiempo);
                            }catch(InterruptedException e) { }
                            
                            auxiliarx-=5;
                            
                            nuevoD.setX(auxiliarx);
                            nuevoD.setY(auxiliary);
                            fCC03.repaint();
                        }
                        
                        while(auxiliary<EspacioReservado4[1][lugar]){
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
    
    public void entrarAlModulo(int moduloAsignado){
        int auxiliarx=nuevoD.x;
        int auxiliary=nuevoD.y;
        
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
                
                while(auxiliary<260){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) { }
                    
                    auxiliary+=5;
                    
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
                
                while(auxiliary<260){
                    try{
                        Thread.sleep(tiempo);
                    }catch(InterruptedException e) { }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx<635){
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
    }
    
    public void tomarAsiento(int moduloAsignado){
        
        int auxiliarx=nuevoD.x;
        int auxiliary=nuevoD.y;
        
        switch(moduloAsignado){
                
            case 0:
                
                for(int i=0;i<28;i++){
                    if(Modulo101[0][i]==0){
                        this.asientoSeleccionado=i;
                        Modulo101[0][asientoSeleccionado]=-1;
                        break;
                    }
                }
                
                while(auxiliary<Modulo101[2][asientoSeleccionado]){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx>Modulo101[1][asientoSeleccionado]){
                    
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
                
                for(int i=0;i<28;i++){
                	if(Modulo102[0][i]==0){
                		this.asientoSeleccionado=i;
                		Modulo102[0][asientoSeleccionado]=-1;
                		break;
                	}
                }
                
                while(auxiliarx>Modulo102[1][asientoSeleccionado]){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) {}
                    
                    auxiliarx-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliary>Modulo102[2][asientoSeleccionado]){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) {}
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                break;
                
            case 2:
                for(int i=0;i<28;i++){
                    if(Modulo105[0][i]==0){
                        this.asientoSeleccionado=i;
                        Modulo105[0][asientoSeleccionado]=-1;
                        break;
                    }
                }
                
                while(auxiliarx<Modulo105[1][asientoSeleccionado]){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) {}
                    
                    auxiliarx+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliary>Modulo102[2][asientoSeleccionado]){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e) {}
                    
                    auxiliary-=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                break;
                
            case 3:
                
                for(int i=0;i<28;i++){
                    if(Modulo106[0][i]==0){
                        this.asientoSeleccionado=i;
                        Modulo106[0][asientoSeleccionado]=-1;
                        break;
                    }
                }
                
                while(auxiliary<Modulo106[2][asientoSeleccionado]){
                    try{
                        Thread.sleep(tiempo);
                    } catch(InterruptedException e){ }
                    
                    auxiliary+=5;
                    
                    nuevoD.setX(auxiliarx);
                    nuevoD.setY(auxiliary);
                    fCC03.repaint();
                }
                
                while(auxiliarx<Modulo106[1][asientoSeleccionado]){
                    
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
                
                Modulo101[0][this.asientoSeleccionado]=0;
                
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
                
                Modulo102[0][this.asientoSeleccionado]=0;
                
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
                
                Modulo105[0][this.asientoSeleccionado]=0;
                
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
                
                Modulo106[0][this.asientoSeleccionado]=0;
                
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
