package encapsulation;

public class School {
	public static void main(String[] args) {
	Student student1=new Student();
	student1.course="Java";
	student1.setName("taous");
	System.out.println(student1.getName());
	student1.setSnn(1234567);
	int social=student1.getSnn();
	System.out.println(social);
        System.out.println("testing1");
		System.out.println("from rachida");
		System.out.println("Hello from Mourad");
}
}
