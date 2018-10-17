package templateMethod;

public abstract class bspClass {
	
	final void templateMethod() {
		operation1();
		operation2();
		konkreteOperation();
		hook();
	}
	
	abstract void operation1();
	abstract void operation2();
	
	final void konkreteOperation() {
		
	}
	
	void hook() {
		
	}
}
