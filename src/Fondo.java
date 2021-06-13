import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class Fondo extends JPanel {
	
	ImageIcon imagen;
	BufferedImage imagen2;
	BufferedImage imagen3;
	public LinkedList<Dibujo> listaD;
	public Dibujo auxiliar;
	int contador;
	
	private static final long serialVersionUID = 1L;
	
	public Fondo(){
		super();
		this.setSize(100,100);
		this.setLayout(new GridBagLayout());
		imagen=new ImageIcon(getClass().getResource("Queso.jpg"));
		
		listaD= new LinkedList<Dibujo>();
		
		try{
			imagen2=ImageIO.read(getClass().getClassLoader().getResource("Maestra.jpg"));
		}catch(Exception e){}
		
		try{
			imagen3=ImageIO.read(getClass().getClassLoader().getResource("Alumno.jpg"));
		}catch(Exception e){}
		
	}
	
    public void paintComponent (Graphics g){
    	Dimension tamaño = getSize();
        g.drawImage(imagen.getImage(),0,0,tamaño.width, tamaño.height, null);
        this.setOpaque(false);
        super.paintComponent(g);
        
        /*/Primera fila salon 101
        g.drawImage(imagen3, 670, 405, 15, 30, this);
        g.drawImage(imagen3, 700, 405, 15, 30, this);
        g.drawImage(imagen3, 730, 405, 15, 30, this);
        g.drawImage(imagen3, 760, 405, 15, 30, this);
        g.drawImage(imagen3, 790, 405, 15, 30, this);
        
        //Segunda fila salon 101
        g.drawImage(imagen3, 670, 440, 15, 30, this);
        g.drawImage(imagen3, 700, 440, 15, 30, this);
        g.drawImage(imagen3, 730, 440, 15, 30, this);
        g.drawImage(imagen3, 760, 440, 15, 30, this);
        g.drawImage(imagen3, 790, 440, 15, 30, this);
        
      //Tercera fila salon 101
        g.drawImage(imagen3, 670, 480, 15, 30, this);
        g.drawImage(imagen3, 700, 480, 15, 30, this);
        g.drawImage(imagen3, 730, 480, 15, 30, this);
        g.drawImage(imagen3, 760, 480, 15, 30, this);
        g.drawImage(imagen3, 790, 480, 15, 30, this);
        
      //Cuarta fila salon 101
        g.drawImage(imagen3, 670, 520, 15, 30, this);
        g.drawImage(imagen3, 700, 520, 15, 30, this);
        g.drawImage(imagen3, 730, 520, 15, 30, this);
        g.drawImage(imagen3, 760, 520, 15, 30, this);
        g.drawImage(imagen3, 790, 520, 15, 30, this);
        
      //Quinta fila salon 101
        g.drawImage(imagen3, 690, 555, 15, 30, this);
        g.drawImage(imagen3, 720, 555, 15, 30, this);
        g.drawImage(imagen3, 750, 555, 15, 30, this);
        g.drawImage(imagen3, 780, 555, 15, 30, this);
        
      //Sexta fila salon 101
        g.drawImage(imagen3, 690, 590, 15, 30, this);
        g.drawImage(imagen3, 720, 590, 15, 30, this);
        g.drawImage(imagen3, 750, 590, 15, 30, this);
        g.drawImage(imagen3, 780, 590, 15, 30, this);*/
        
        
        
        /*g.drawImage(imagen2, 300, 370, 15, 30, this);//Maestra 0
        g.drawImage(imagen2, 420, 120, 15, 30, this);//Maestra 1
        g.drawImage(imagen2, 640, 120, 15, 30, this);//Maestra 2
        g.drawImage(imagen2, 780, 370, 15, 30, this);//Maestra 3*/
        
        
        if(listaD.size()!=0){
        	contador=0;
			
			while(contador!=listaD.size()){
				
				auxiliar= listaD.get(contador);
				
				if(auxiliar.visible=true){
					
					if(auxiliar.tipo==1){
						g.drawImage(imagen2, auxiliar.x, auxiliar.y, 15, 30, this);//This if it is a teacher
					}
					
					if(auxiliar.tipo==2){
						g.drawImage(imagen3, auxiliar.x, auxiliar.y, 15, 30, this);//This is it is an student
					}
				}
				
				contador++;
			}
        }
    }
    
    public void agregar(Dibujo nuevo){
    	listaD.add(nuevo);
    }
    
    public void dibuja(LinkedList<Dibujo> nuevo){
    	listaD= nuevo;
    }
    
    public void limpiar(){
    	listaD.clear();
    	repaint();
    }
}