package com.company;

public class PassedChecked extends State{

    @Override
    public void completed() {
        if (student.students)
            student.changeState(new studentsStatee(student));
        else (student.changeState(new ReadyState(student)));

    }

    @Override
    public void submittedForReview() {
        if (student.students)
            student.changeState(new studentsStatee(student));
        else (student.changeState(new ReadyState(student)));
}
}
