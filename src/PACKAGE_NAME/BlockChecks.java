package PACKAGE_NAME;

public class BlockChecks {
	int executableStatementCount(){
		int n;
		n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0;
		n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0;
		n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0; n = 0;
		n = 0;
		return n;
	}
	
	void emptyCatchBlock(){
		try {
			
		} catch(Exception e) {}
	}
	
	void emptyDoBlock(){
		do {} while(true);
	}
	
	void emptyForBlock1(){
		for(int i = 0; i < 2; i++){}
	}
	
	void emptyForBlock2(){
		for(int i = 0;; i++){}
	}
	
	void emptyWhileBlock(){
		while(true){}
	}
	
	void emptyThenBlock1(){
		if(true){}
	}
	
	void emptyThenBlock2(){
		if(true){} else {int n = 1;}
	}
	
	void emptyElseBlock(){
		if(true){int n  = 1;} else {}
	}
	
	void emptyTryBlock1(){
		try { } catch (Exception e) { System.err.println(e); }
	}
	
	void emptyTryBlock2(){
		try { } finally { System.err.println(""); }
	}
	
	void emptyFinallyBlock(){
		try { System.err.println("try"); } finally {  }
	}
	
	// emptyInitializer
	{
	}
	
	void avoidNestedBlocks(){
		int n = 0;
		{n = 1;} 
		n = 2;
	}

}
