package gameProject;

public class Person implements Entity {
	private int id;
	private String name;
	private String nationalityId;
	private String birthOfYear;
	public Person() {}

	public Person(int id, String name, String nationalityId, String birthOfYear) {
		this.id = id;
		this.name = name;
		this.nationalityId = nationalityId;
		this.birthOfYear = birthOfYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(String birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

}
