public class Student {
    private String name;

    public Student() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student[] s1 = new Student[5];
        for (int i = 0; i < 5; i++) {
            s1[i] = new Student();
        }
        String[] names = {"abc", "def", "ghi", "jkl", "mno"};
        for (int i = 0; i < 5; i++) {
            s1[i].setName(names[i]);
        }
        System.out.println("Names are");
        for (int i = 0; i < 5; i++) {
            System.out.println(s1[i].getName());
        }
    }
}