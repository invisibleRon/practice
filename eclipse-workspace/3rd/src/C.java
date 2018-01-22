
public class C extends inbox{
public void sub(){

System.out.println("This is to test Check box");
}
public static void main(String[] args) {
	C c=new C();
	c.sub(); //This comes from c
	c.inbox_TC(); //this comes from inbox 
	c.dologin_TC(); // this comes from login
			
}
}
