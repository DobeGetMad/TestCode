package exerciseOne;

public class Programmer implements Person {

	public static void main(String[] args) {

	}

	public String name;
	public String surname;
	public int years;




	public Programmer(String name, String surname, int years) {
		super();
		this.name = name;
		this.surname = surname;
		this.years = years;
	}



	@Override
	public void personInfo() {
		System.out.println(name);
		System.out.println(surname);
		System.out.println(years);

	}

}
