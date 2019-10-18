package com.company;

public class Teachers {
    private String number_of_pairs;

    private String subject;

    private String teachersName;

    private String number_of_students;

    public String getNumber_of_pairs ()
    {
        return number_of_pairs;
    }

    public void setNumber_of_pairs (String number_of_pairs)
    {
        this.number_of_pairs = number_of_pairs;
    }

    public String getSubject ()
    {
        return subject;
    }

    public void setSubject (String subject)
    {
        this.subject = subject;
    }

    public String getTeachersName ()
    {
        return teachersName;
    }

    public void setTeachersName (String teachersName)
    {
        this.teachersName = teachersName;
    }

    public String getNumber_of_students ()
    {
        return number_of_students;
    }

    public void setNumber_of_students (String number_of_students)
    {
        this.number_of_students = number_of_students;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [number_of_pairs = "+number_of_pairs+", subject = "+subject+", teachersName = "+teachersName+", number_of_students = "+number_of_students+"]";
    }

    public void number_of_pairs(int i) {
    }

    public void subject(String math) {
    }

    public void teachersName(String petrov_viktor_viktorovich) {
    }

    public void number_of_students(int i) {
    }
}
