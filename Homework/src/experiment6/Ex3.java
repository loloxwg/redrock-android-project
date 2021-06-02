package experiment6;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class StudentInfo {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students?");
        int num = in.nextInt();
        ArrayList<StudentInfo> studentInfos = new ArrayList<>();
        if (num > 0) {
            System.out.println("Please input the names of students:");
        }
        for (int i = 0; i < num; i++) {
            StudentInfo studentInfo = new StudentInfo();
            String name = in.next();
            studentInfo.setName(name);
            studentInfos.add(studentInfo);
        }
        System.out.println("All the students bellow:");
        for (int j=0;j<studentInfos.size();j++){
            StudentInfo studentInfo =studentInfos.get(j);
            System.out.println(j+1+":"+studentInfo.name);
        }
        in.close();
    }
}
