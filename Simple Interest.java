import java.util.*;
public class SimpleInterst {
	public  float p,t,r;
	public float res;
	public void simpleInterest(int p,int t,int r) {
		res=(p*t*r)/100;
		System.out.format("The simple interest is %f",res);
		
	}
	float res1;
	public void compoundInterest(int p,int t,int r) {
		res1=(float) ((p*Math.pow((1+(r/100)),t)));
		System.out.format("\nThe compound interest is %f",res1);
	}
	}
