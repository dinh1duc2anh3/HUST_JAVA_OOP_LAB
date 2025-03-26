package Parent;

public class Child extends Parent{
	protected void doSomething() {}; 
		//ko thể override được method của lớp cha do có quyền truy cập nhỏ hơn
		//	nếu cha là public thì con phải là public
		//	nếu cha là protected thì con có thể là protected hoặc public
		//	nếu cha là private thì lớp con ko thể override được
	protected void doSomething2() {}; 
		//khác return type với method trong lớp cha
		//chỉ có overloading là trong cùng lớp nhưng cùng tên, cùng return type, nhưng khác chữ kí
	
}
