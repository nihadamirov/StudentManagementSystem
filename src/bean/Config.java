package bean;

import java.io.Serializable;

public class Config implements Serializable {
    private static Config config = null;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean loggedIn;

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public void appendStudent(Student s) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = s;
        students = newStudents;
    }

    public void appendTeacher(Teacher s) {
        Teacher[] newTeacher = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeacher[i] = teachers[i];
        }
        newTeacher[newTeacher.length - 1] = s;
        teachers = newTeacher;
    }

    public static Config instance() { //singleton pattern
        if (config == null) {
            config = new Config();
        }
        return config;
    }
}
