class SysInRead 
{
	public static void main(String[] args) throws Exception
	{
       //ststic nature code
       int i1= System.in.read();
	   //System.out.println(i1);
       int i2= System.in.read();
       int i3= System.in.read();
       int i4= System.in.read();
       int i5= System.in.read();
       int i6= System.in.read();
       int i7= System.in.read();
		System.out.println("ascii :"+i1);
		System.out.println("ascii :"+i2);
		System.out.println("ascii :"+i3);
		System.out.println("ascii :"+i4);
		System.out.println("ascii :"+i5);
		System.out.println("value :"+(char)i1);
		System.out.println("value :"+(char)i2);
		System.out.println("value :"+(char)i3);
		System.out.println("value :"+(char)i4);
		System.out.println("value :"+(char)i5);
    // dynamic nature 
	System.out.println("enter first value");
	String value="";
	int d;
	while ((d=System.in.read())!=13)
	{     value = value+(char)d;
	}
	System.in.read();//reading 10 and ignoring and making System.in object empty
	int m=Integer.parseInt(value);
		System.out.println("enter second value");
	int d1;
	value="";
	while ((d1=System.in.read())!=13)
	{      value = value+(char)d1;
	}
		System.in.read();//reading 10 and ignoring and making System.in object empty
	int n=Integer.parseInt(value);
     int c=m+n; 
	 System.out.println(c);



	}
}
