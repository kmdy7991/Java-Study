package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        // Student 객체 참조 값이 student1에 저장된다.
        student1 = new Student();

        // student1이 가지고 있는 객체 참조 값에 name이라는 멤버변수에 값이 대입된다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // Student 배열이 생성되고 참조 값은 students에 저장 -> 초기 값은 null
        Student[] students = new Student[2];
        // 위에서 생성한 student1의 참조값이 복사되어 students의 첫번째 값에 전달
        students[0] = student1;
        students[1] = student2;

        // Java에서 값의 대입은 변수에 들어있는 값을 복사해서 전달한다.
        // student1은 객체 참조 값을 가지고 있으니 students[0]은 student1의 객체 참조 값이 복사되어 전달된다.


        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
    }
}
