package coding;

import java.awt.Event;

public class Coding {
	void avoidInlineConditionals1(int n){
		int m = n > 0 ? n : - n;
	}
	
	void avoidInlineConditionals2(int n){
		int m = 0;
		m = n > 0 ? n : - n;
	}

	void magicNumber(){
		int n = 17;
	}
	
	void missingSwitchDefault(int n){
		switch(n){
		case 0: System.err.println("case 0");
		}
	}
	
	void simplifyBooleanExpressions(){
		boolean b1 = true;
		boolean b2 = (b1 && true);
	}
	
	boolean simplifyBooleanReturn(int n){
		if(n > 0)
			return true;
		else
			return false;
	}
	
	boolean stringLiteralEquality1(){
		return "abc" == "def";
	}
	
	boolean stringLiteralEquality2(){
		return "abc" != "def";
	}
	
	void nestedForDepth(){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				System.err.println("body");
			}
		}
	}
	
	void nestedIfDepth(int a, int b, int c){
		if(a > 1){
			if(b > 1){
				System.err.println("b > 1");
			}
		}
	}
	
	void nestTryDepth(){
		try {
			try {
				System.err.println("inner try");
			} catch(Exception e){System.err.println(e);}
		} catch(Exception e){System.err.println(e);}
	}
	
	@Override
	public Coding clone(){
		return this;
	}
	
	void finalizer(){
	}
	
	void multipleStringLiterals1(){
		String s1 = "xyz";
	}
	void multipleStringLiterals2(){
		String s1 = "xyz";
	}
	
	int returnCount(int a){
		
		if(a > 2) return 2;
		if(a > 1) return 1;
		if(a > 0) return 0;
		return -1;
	}
	
	void defaultComesLast(int n){
		switch(n){
		default: return;
		case 0: System.err.println("case 0");
		}
	}
	
	void fallThrough(int n){
		int m = 0;
		switch(n){
		case 0: m = 0; break;
		case 1: m = 1;
		case 2: m = 2; break;
		default: m = -1;
		}
	}
}
