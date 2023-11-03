package org.example;

import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService studentStreamService = new StreamService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<StudentGroup> getSortedStreamList() {
        return studentStreamService.getSortedStudentBySize();
    }

}
