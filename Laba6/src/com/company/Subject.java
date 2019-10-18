package com.company;

public class Subject {
    private String time;

    private String classrooms;

    private String subjectName;

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getClassrooms ()
    {
        return classrooms;
    }

    public void setClassrooms (String classrooms)
    {
        this.classrooms = classrooms;
    }

    public String getSubjectName ()
    {
        return subjectName;
    }

    public void setSubjectName (String subjectName)
    {
        this.subjectName = subjectName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [time = "+time+", classrooms = "+classrooms+", subjectName = "+subjectName+"]";
    }

    public void time(int i) {
    }

    public void classrooms(int i) {
    }

    public void subjectName(String math) {
    }
}
