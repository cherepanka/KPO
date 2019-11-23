package com.company;

import javax.security.auth.Subject;

abstract class State<field> {
    protected field student : Subject;


    protected <student> State(student) {
        this.student = student;
    }
    abstract void issued() ;
    abstract void hasBeen();
    abstract void completed();
    abstract void submittedForReview();
    abstract void checkedToBeChecked();
    abstract void notExecuted();
}
