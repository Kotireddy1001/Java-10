// Student Information

class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        s.setAge(20);
        System.out.println(s.getName() + " - " + s.getAge());
    }
}
