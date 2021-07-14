package first;

public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      shortTermStudent ss=new shortTermStudent();
      longTermStudent ls=new longTermStudent();
      ss.setName("DIVEY");
      ss.setId(1);
      ss.setDuration(100);
      ls.setName("JAIN");
      ls.setId(2);
      ls.setCourse("JAVA");
      System.out.println(ss.getId());
      System.out.println(ss.getName());
      System.out.println(ss.getDuration());
      System.out.println(ls.getId());
      System.out.println(ls.getName());
      System.out.println(ls.getCourse());
	}

}

class Stud
{
	String name;
	int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
class shortTermStudent extends Stud{
	int duration;
	
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
class longTermStudent extends Stud
{
	String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}