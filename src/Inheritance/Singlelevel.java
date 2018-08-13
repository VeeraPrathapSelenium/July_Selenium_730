package Inheritance;

public class Singlelevel extends ParentClass {

	public static void main(String[] args) {
		
		
		System.out.println("Before Modification "+ParentClass.name);
		ParentClass.name="Testing masters Technologies";
		
		System.out.println("After Modification "+ParentClass.name);
		
		startClass("Java");
		
		ParentClass obj=new Singlelevel();
		
		obj.startClass();
		
		
	}
	
	
	public static  void startClass(String classname)
	{
		System.out.println("Testing masters Starting classes for "+classname);
	}

}
