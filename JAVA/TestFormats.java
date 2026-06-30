public class TestFormats{
	public static void main(String[] args){
		long myBillion=1_000_000_000;//underscore is just writing convenience
		String s=String.format("%,d", myBillion);
		String p=String.format("I have %.2f,bugs to fix",456687.0897860);
		String t=String.format("%,6.1f",42.000);
		System.out.println(s);
		System.out.println(p);
		System.out.println(t);

}
}
