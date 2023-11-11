package sevice.menu;

import bean.Config;
import bean.Student;
import servise.menu.inter.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void process() {
        Student[] allStudent = Config.instance().getStudents();
        for (Student student : allStudent) {
            System.out.println(student);
        }
    }
}
