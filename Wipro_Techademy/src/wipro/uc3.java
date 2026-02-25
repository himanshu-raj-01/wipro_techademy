package wipro;

public class uc3 {
	private boolean engine;
	private int speed;
	private float fuellevel;
	
public  void setcar(int speed,float fuellevel) {
	this.speed=speed;
	this.fuellevel=fuellevel;
	this.engine=true;
}

public int getSpeed()
{
	return speed;
}
public float getFuellevel()
{
	return fuellevel;
}
public boolean engine()
{
return engine;	
}
 
 
 
	public static void main(String[] args) {
		
uc3 c=new uc3();
c.setcar(60,75.5f);
System.out.println("car speed:"+c.getSpeed());
System.out.println("car fuellevel:"+c.getFuellevel());
System.out.println("engine on:"+c.engine());
	}
 
}

























//uc3=3