import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        Student2 Student = new Student2("Kien", 30, "HT");
        Student2 Student1 = new Student2("Nam", 26, "HN");
        Student2 Student2 = new Student2("Anh", 38, "HT" );
        Student2 Student3 = new Student2("Tung", 38, "HT" );
        List<Student2> lists = new ArrayList<Student2>();
        lists.add(Student);
        lists.add(Student1);
        lists.add(Student2);
        lists.add(Student3);
        Collections.sort(lists);
        for(Student2 st : lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student2 st : lists){
            System.out.println(st.toString());
        }
    }
}
