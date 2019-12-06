package com.company;

@Endpoint

public class SubjectEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    private SubjectRepository subjectRepository;

    @Autowired

    public SubjectEndpoint(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
    @PayloadRoot
            (namespace = NAMESPACE_URI, localPart = "getSubjectRequest")
    @ResponsePayload

    public GetSubjectResponse getSubject(@RequestPayload GetSubjectRequest request) {
        GetSubjectResponse response = new GetSubjectResponse();
        response.setSubject( subjectRepository.findSubject( request.getName() ) );
        return response;
    }
}
