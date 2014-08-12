package metrics;

public class ClassDataAbstractionCoupling {
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	F f= new F();
	G g = new G();
	H h = new H();
	
	Boolean t = new Boolean(true);
	Integer i = new Integer(1);
	String s = "abc";
	Object o = new Object();
}

class A { int n; A() { n = 0; } }
class B { int n; B() { n = 0; } }
class C { int n; C() { n = 0; } }
class D { int n; D() { n = 0; } }
class E { int n; E() { n = 0; } }
class F { int n; F() { n = 0; } }
class G { int n; G() { n = 0; } }
class H { int n; H() { n = 0; } }
