package com.company;


public class TimeTable {


    private String subjectName;

    private String time;

    private String classroom;

    public TimeTable(String subjectName, String time, String classroom) {
        this.subjectName = subjectName;
        this.time = time;
        this.classroom = classroom;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }
}

