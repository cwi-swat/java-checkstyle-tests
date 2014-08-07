package classDesignChecks;

public class ThrowsCount {
	void throwsCount(int n) throws Exception{
		int m;
		switch(n){
		case 1: throw new Exception();
		case 2: throw new Exception();
		case 3: throw new Exception();
		default: m = 0;
		}

	}
}
