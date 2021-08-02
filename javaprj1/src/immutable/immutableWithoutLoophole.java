package immutable;
class Age1 {
    private int day;
    private int month;
    private int year;
    public int getDay() {         return day;     }
    public void setDay(int day) {     this.day = day;     }
    public int getMonth() {     return month;     }
    public void setMonth(int month) {     this.month = month;     }
    public int getYear() {     return year;     }
    public void setYear(int year) {    this.year = year;     }
}
final class ImmutableStudent1 {
    private final int id;
    private final String name;
    private final Age1 age;
    public ImmutableStudent1(int id, String name, Age1 age) {
    this.name = name;
    this.id = id;
    this.age = age;
    }
    public int getId() {     return id;     }
    public String getName() {    return name;     }
    public Age1 getAge() {
        Age1 cloneAge = new Age1();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }
}

public class immutableWithoutLoophole {
	public static void main(String[] args) {
	    Age1 age = new Age1();
	    age.setDay(1);
	    age.setMonth(1);
	    age.setYear(1992);
	    ImmutableStudent1 student = new ImmutableStudent1(1, "Alex", age);
	    System.out.println("Alex age year before modification = " + student.getAge().getYear());
	    student.getAge().setYear(1993);
	    System.out.println("Alex age year after modification = " + student.getAge().getYear());
	}

}
