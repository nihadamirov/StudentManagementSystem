package sevice.menu;

import bean.Config;
import bean.Teacher;
import servise.menu.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void process() {
        Teacher[] all = Config.instance().getTeachers();
        for (Teacher teacher : all) {
            System.out.println(teacher);
        }
    }
}
