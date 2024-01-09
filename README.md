# StudentManagementSystem

## About

`StudentManagementSystem` is a project developed in Java (Standard Edition) and based on OOP principles. This project is designed for the management of students and teachers.

## Features

- Users can log into the system or create a new account.
- Users can add a student or a teacher.
- Users can view the complete list of added students and teachers.
- Users can view only the list of students or teachers.
- Users can create an email for teachers.
- Users can exit the system.

## Menu

The menu offers the following selections:

- `LOGIN(1, "Login", new MenuLoginService())`: Log into the system.
- `REGISTER(2, "Register", new MenuRegisterService())`: Create a new account.
- `ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService())`: Add a teacher.
- `ADD_STUDENT(4, "Add student", new MenuAddStudentService())`: Add a student.
- `SHOW_ALL_TEACHER(5, "Show all teachers", new MenuShowTeacherService())`: Show the complete list of teachers.
- `SHOW_ALL_STUDENT(6, "Show all students", new MenuShowStudentService())`: Show the complete list of students.
- `EMAIL(7,"Create E-mail", new MenuCreateEmailService())`: Create an email for teachers.
- `EXIT(0, "Exit", new MenuExit())`: Exit the system.
- `UNKNOW`: For unknown commands.

## Usage

To use the project, first clone the repository using the `git clone` command. Then, open it in your IDE and run the `Main` class. Follow the menu to select the appropriate commands.
