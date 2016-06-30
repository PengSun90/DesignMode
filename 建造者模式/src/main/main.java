package main;

public class main {
	public static void main(String[] args) {

		Person person = new Person.Builder().build();
		System.out.print("person getAge " + person.getAge() + "\n");
		System.out.print("person getName " + person.getName() + "\n");
		System.out.print("person getSex " + person.getSex() + "\n");
		System.out.print("person getWorkOn " + person.getWorkOn() + "\n");
		
		Person person1 = new Person.Builder().setAge(2).setWorkOn("android").build();
		System.out.print("person1 getAge " + person1.getAge() + "\n");
		System.out.print("person1 getName " + person1.getName() + "\n");
		System.out.print("person1 getSex " + person1.getSex() + "\n");
		System.out.print("person1 getWorkOn " + person1.getWorkOn() + "\n");

	}
}
