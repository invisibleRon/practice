
public class B extends A {
	public void add() {
		System.out.println("This is B class add funn");
	}
	public void show() {
		super.add();
	}
public static void main(String[] args) {
	B b=new B();

	b.show();
    //super.add();
  }
}
