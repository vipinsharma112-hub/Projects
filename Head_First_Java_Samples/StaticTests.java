class StaticSuper{
	static{
		System.out.println("Super Static Block");
	}
	StaticSuper(){
		System.out.println("Super Constructor");
	}
}
public class StaticTests extends StaticSuper{
	static int rand;
	static{
		rand=(int)(Math.random()*6);
		System.out.println("static Block"+rand );
	}
	StaticTests(){
		System.out.println("Constructor");
	}
	public static void main(String[] args){
		System.out.println("in main");
		StaticTests st=new StaticTests();
	}
}
