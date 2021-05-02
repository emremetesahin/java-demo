package oopIntro;

public class Subscription {
	public Subscription(int id,int userId,int actionId,String name,String date) {
		this.id=id;
		this.userId=userId;
		this.actionId=actionId;
		this.name=name;
		this.date=date;
	}
	int id;
	int userId;
	int actionId;
	String name;
	String date;
}