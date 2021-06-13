public class Dibujo{
	
	public int x;
	public int y;
	public int tipo;
	public boolean visible;
	
	public Dibujo(int tipo){
		this.x=0;
		this.y=0;
		this.tipo=tipo;
		visible=false;
	}
	
	public int getTipo(){
		return tipo;
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x=x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y=y;
	}
}