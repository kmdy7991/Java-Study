package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 18;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + student2Grade);

        // 배열과 반복문을 사용해 코드의 수정을 최소화
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 18};
        int[] studentGrades = {90, 80, 85};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
        // 여전히 유지보수와 요소의 관리가 용이하지 않음



    }
}
