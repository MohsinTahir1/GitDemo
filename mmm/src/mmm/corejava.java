package mmm;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=5;
    float b=(float) 4.9;
    char c='d';
    String name="mohsin";
    boolean d=true;
    double h=4.999;
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(name);
    System.out.println(d);
    System.out.println(h);
    
    
    int []ar= {1,2,3,4,5};
    System.out.println(ar[3]  + "value at index 3");
    for(int i=0;i<ar.length;i++)	
	{
    	System.out.println(ar[i]);
	}
    String s="Rahul Shetty academy";
   String[] splittedstring = s.split("Shetty");
   System.out.println(splittedstring[0]);
   System.out.println(splittedstring[1]);
   System.out.println(splittedstring[1].trim());
   
   
}
}
