
public class C extends B {
public void add()
{System.out.println("This is C class add function");
	}
public void display() {
	super.add();
}
public static void main(String[] args) {
C c=new C();
c.add();
c.display();
c.show();//super keyword chaining
}
}
