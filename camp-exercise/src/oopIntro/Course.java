package oopIntro;

public class Course {
	public Course(int id,String name, String imagePath, int completionRate,int teacherId)
	{
		this.id=id;
		this.name=name;
		this.imagePath=imagePath;
		this.completionRate=completionRate;
		this.teacherId=teacherId;
	}
	int id;
	String name;
	int teacherId;
	String imagePath;
	int completionRate;

}
