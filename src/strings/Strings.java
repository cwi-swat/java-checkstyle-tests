package strings;

public class Strings {
	
	private StringBuffer sb1;
	private StringBuilder sb2;
	
	String stringInstantion1(){
		String s = new String("abc");
		return s;
	}
	
	String stringToString1(String s){
		return s.toString();
	}
	
	String inefficientStringBuffering1(String s){
		StringBuffer sb =  new  StringBuffer(s + "abc");
		return sb.toString();
	}
	
	String inefficientStringBuffering2(String s){
		StringBuffer sb =  new  StringBuffer("abc");
		sb.append(s + "def");
		return sb.toString();		
	}
	String inefficientStringBuffering3(String s){
		StringBuilder sb =  new  StringBuilder(s + "abc");
		return sb.toString();
	}
	
	String inefficientStringBuffering4(String s){
		StringBuilder sb =  new  StringBuilder("abc");
		sb.append(s + "def");
		return sb.toString();		
	}
	
	boolean unnnessaryCaseChange1(String s){
		return s.toUpperCase().equals("baz");
	}

	boolean useStringBufferLength(String s){
		StringBuffer sb =  new  StringBuffer("abc");
		return sb.toString().equals("");
	}
	
	String appendCharacterWithChar1(){
		StringBuffer sb =  new  StringBuffer("abc");
		sb.append("c");
		return sb.toString();
	}
	
	String consecutiveLiteralAppends1(){
		StringBuffer sb =  new  StringBuffer("abc");
		sb.append("def").append("ghi");
		return sb.toString();
	}
	
	String consecutiveLiteralAppends2(){
		StringBuilder sb =  new  StringBuilder("abc");
		sb.append("def").append("ghi");
		return sb.toString();
	}
	
	int useIndexOfChar1(String s){
		return s.indexOf("a");
	}
	
	boolean inefficientEmptyStringCheck1(String s){
		return s.trim().length() == 0;
	}
}
