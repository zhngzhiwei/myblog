package demo;

public class Mytest {

	public static void main(String[] args) {
		String str=new String("abc");
		String str1=new String("-1");
		String str2=new String("de");
		String str3=new String("/");
		String str4=new String("fg");
		System.out.println(reversel(str)+str1+(reversel(str2)+str3+reversel(str4)));
	}
	public static String reversel(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
