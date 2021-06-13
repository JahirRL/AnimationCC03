import java.awt.EventQueue;
import java.util.Random;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
//import javax.swing.*;

public class CC03 extends JFrame{

	/**
	 * Declaration of variables
	 */
	private static final long serialVersionUID = 1L;
	public static Fondo fCC03;

	/**
	 * Create the frame.
	 */
	public CC03() {
		//----------Basic specifications of the frame---------//
		this.setTitle("Proyecto (Edificio CC03)");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1080,720);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		//-------Using an image as background-------//
		fCC03 = new Fondo();
		fCC03.setBorder(new EmptyBorder(5, 5, 5, 5));
		fCC03.setLayout(new BorderLayout(0, 0));
		this.add(fCC03);
		//------------------------------------------//
		
		//--------------------------------------------------//
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CC03 frame = new CC03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		Monitor monitor=new Monitor();
		Random aleatorio=new Random();//Random time
		int tiempoM;
		int tiempoA;
		
		for(int i=0;i<500;i++){
			
			Alumno nuevoAlumno=new Alumno(monitor,fCC03);
			nuevoAlumno.start();
			
			Alumno nuevoAlumno1=new Alumno(monitor,fCC03);
			nuevoAlumno1.start();
			
			Alumno nuevoAlumno2=new Alumno(monitor,fCC03);
			nuevoAlumno2.start();
			
			//Alumno nuevoAlumno3=new Alumno(monitor,fCC03);
			//nuevoAlumno3.start();
			
			tiempoA=aleatorio.nextInt(8)*1000;//This are the seconds
			tiempoM=((int)(aleatorio.nextDouble() * 10 + 1));//it takes for new threads to show up
			
			if(tiempoM<=2){//tiempoM it is the chances of the teacher to show up
				Maestra nuevaMaestra=new Maestra(monitor,fCC03);
				nuevaMaestra.start();
			}

			try{
				Thread.sleep(tiempoA);
			}catch(InterruptedException e){ }
		}

	     try {	         
	          Thread.sleep(10000);//Executing the threads making the main sleep
	     }catch (InterruptedException e) { }		

	      System.out.println("\nPrograma Terminado");
	      System.exit(0);
	}
}
