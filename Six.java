
public class Six {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        int[] marks1 = {88, 90, 74};
        int[] marks2 = {70, 66, 80};
        int[] marks3 = {86, 54, 34};
        int[] marks4 = {100, 99, 99};
        int[] marks5 = {98, 98, 98};

        Student s1 = new Student("Dilki", marks1);
        Student s2 = new Student("Malki", marks2);
        Student s3 = new Student("Pinki", marks3);
        Student s4 = new Student("Dhammika", marks4);
        Student s5 = new Student("Kulathunga", marks5);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            s.getAverage();
            System.out.println("-----------------------");
        }

    }
}