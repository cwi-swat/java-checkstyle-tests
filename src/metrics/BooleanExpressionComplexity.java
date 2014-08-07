package metrics;

public class BooleanExpressionComplexity {
	boolean b1 = (false && (true && (false && (true && false))));
	boolean b2 = (false || (true || (false || (true || false))));
	boolean b3 = (false && (true || (false && (true || false))));
	boolean b4 = !(false && (true || (false && (true || false))));
}
