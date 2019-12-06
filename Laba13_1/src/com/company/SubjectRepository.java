package com.company;

@Component
public class SubjectRepository {
    private static final List<Subject> subjectq = new ArrayList<Subject>();

    @PostConstruct
    public void initData() {
        Subject math = new Subject();
        math.setName( "Math" );
        math.setTime( "8.30" );
        math.setGroup( "TTp.1-16-1" );
        math.setAudience( 2454 );
        subjectq.add( math );
        Subject physics = new Subj( 241 );
        subjectq.add( physics );
        Subject physics = new Subject();
        physics.setName( "Physics" );
        physics.setTime( "8.30" );
        physics.setGroup( "TTp.1-16-1" );
        physics.setAudience( 2454 );
        subjectq.add( physics );
    }
}

