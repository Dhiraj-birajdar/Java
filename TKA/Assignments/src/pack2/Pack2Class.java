package pack2;
import pack1.PublicExample;
import pack1.ProtectedExample;


public class Pack2Class extends ProtectedExample {

	public static void main(String[] args) {
		
		PublicExample pobj = new PublicExample();
		System.out.println(pobj.publicVariable);
		pobj.publicMethod();
		
		Pack2Class pkobj = new Pack2Class();
		System.out.println(pkobj.protectedVariable);
		
	}
}
