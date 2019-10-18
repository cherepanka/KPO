package com.company;

public class Lesson {
    private Timetable timetable;

    public Timetable getTimetable ()
    {
        return timetable;
    }

    public void setTimetable (Timetable timetable)
    {
        this.timetable = timetable;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timetable = "+timetable+"]";
    }
}
