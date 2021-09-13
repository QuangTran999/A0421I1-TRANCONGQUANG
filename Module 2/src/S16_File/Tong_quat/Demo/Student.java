package S16_File.Tong_quat.Demo;

public class Student {
    public String id;
    public String name;
    public int age;
    public String address;

    public Student() {
    }

    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String fomatToFile() {
        return String.format("%s,%s,%d,%s", id, name, age, address);
    }
}
