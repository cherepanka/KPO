package com.company;

public class Timetable {

    private Subject[] subject;

    private Teachers[] teachers;

    public Subject[] getSubject ()
    {
        return subject;
    }

    public void setSubject (Subject[] subject)
    {
        this.subject = subject;
    }

    public Teachers[] getTeachers ()
    {
        return teachers;
    }

    public void setTeachers (Teachers[] teachers)
    {
        this.teachers = teachers;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [subject = "+subject+", teachers = "+teachers+"]";
    }

    public void subject(String math) {
    }

    public void teachers(String popov_vasilii_viktorovich) {
    }
}
