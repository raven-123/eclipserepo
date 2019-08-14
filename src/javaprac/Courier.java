package javaprac;

public class Courier {
	public  int  volume(int a,int b,int c)
	{
		return a*b*c;
	}
	
	
	public int volume(Box b)
	{
		return b.h*b.l*b.w;
	}

}
