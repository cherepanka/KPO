package com.company;

public Subject findSubject(String name){
        Assert.notNull(name);
        Subject result=null;
        for(Subject subject: subjectq){
        if(name.equals(subject.getName())){
        result=subject;
        }
        }
        return result;
        }

