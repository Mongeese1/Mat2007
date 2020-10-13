//Luka Bowen i6222534 Q3
public abstract class Person {
	public String name = "";
	public Person() {}

	public Person(final String name) {
		this.name  = name;
	}
	@Override
	public String toString() {
		String str = name;
		return str;
	}
}
