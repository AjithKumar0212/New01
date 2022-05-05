package stringg;

public class stringg {
public static void main(String[] args) {
	String s="selenium";
	String s1=new String("selenium");
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	s1.replace("S","#");
	System.out.println(s1);
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
  
//  System.out.println(s.hashCode());
//  StringBuffer sb=new StringBuffer("selenium");
//  StringBuffer sb2=new StringBuffer("selenium");
//  boolean e = sb.equals(sb2);
//  System.out.println(sb==sb2);
//  System.out.println(e);
//  StringBuilder sd=new StringBuilder("selenium");
//  StringBuilder sd2=new StringBuilder("selenium");
//  
}
}
