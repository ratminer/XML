
public class Main {
	public static void main(String args[]){
		Composite course = new Composite("course");
		Composite cl = new Composite("class");
		
		Leaf code = new Leaf("code");
		Leaf prof = new Leaf("prof");
		Leaf student1 = new Leaf("student");
		Leaf student2 = new Leaf("student");
		
		course.addChild(code);
		course.addChild(prof);
		course.addChild(cl);
		
		cl.addChild(student1);
		cl.addChild(student2);
		
		code.addContent("SYSC3110");
		prof.addContent("Babak");
		student1.addContent("Michael");
		student2.addContent("Alan");
		
		System.out.println(course.toString());
		
	}
}