package oopIntro;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "c#", "www.resimler.com/pic/1", 97, 1);
		Course course2 = new Course(2, "Java", "www.resimler.com/pic/2", 5, 1);

		Course[] courses = new Course[] { course1, course2 };
		for (Course course : courses) {
			System.out.println("Kurs id:" + course.id + " Kurs Ad�:" + course.name + " Resim URl:" + course.imagePath
					+ " Tamamlama Oran�:" + course.completionRate + " ��retmen Id:" + course.teacherId);
		}
		System.out.println("---------------------------");
		Subscription sub1=new Subscription(1,3,2,"Phyton","28/07/2021");
		Subscription sub2=new Subscription(2,2,1,"�leri Seviye Java","28/10/2021");
		
		Subscription[] subs=new Subscription[]{sub1,sub2};
		for (Subscription sub : subs) {
			System.out.println("Abonelik Id:"+sub.id+"Eylem Id:"+sub.actionId+
					"�ye Id:"+sub.userId+"Abonelik Ad�:"+sub.name+"Abonelik Tarihi"+sub.date);
		}
		System.out.println("---------------------------");
		Course course3=new Course(3,"�leri seviye C#","www.resimler.com/pic/2",0,1);
		CourseManager courseManager=new CourseManager();
		courseManager.Add(course3);
		courseManager.Delete(course2);

	}
	public static int Topla(int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		return toplam;
	}
	

}
