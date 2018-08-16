package Inheritance;

public class Multilevel extends Singlelevel{
	
	
public static void main(String[] args) {
		
		
		System.out.println("Before Modification "+ParentClass.name);
		ParentClass.name="Testing masters Technologies";
		
		System.out.println("After Modification "+ParentClass.name);
		
		startClass("Java");
		
		ParentClass obj=new Singlelevel();
		
		obj.startClass();
		
		
	}

}
