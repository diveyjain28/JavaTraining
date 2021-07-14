package july8;

public class StaticVariableExample {
	 int rollno;
     static String college = "ITS";
     static void change(){      college = "BBDIT";      }
     StaticVariableExample(int r){  rollno = r; }
     void display (){System.out.println(rollno+" "+college);}
    public static void main(String args[]){
    	StaticVariableExample s1 = new StaticVariableExample (111);
    	StaticVariableExample s2 = new StaticVariableExample (222);
       s1.display(); //111 ITS
       StaticVariableExample.change();
        s1.display(); // 111 BBDIT
        s2.display(); // 222 BBDIT
       // System.out.println(college);
    }

}
