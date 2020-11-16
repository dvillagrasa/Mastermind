package mocks;

import ui.Reader;

public class MockReader extends Reader {

    private int response;
    private int[] responses;
    private int lastResponse = 0;
    private boolean isSequence = false;
    private boolean boolResponse;

    public MockReader(int response) {
        super();
        this.response = response;
        isSequence = false;
    }

    public MockReader(int response, boolean boolResponse) {
        super();
        this.response = response;
        isSequence = false;
        this.boolResponse = boolResponse;
    }

    public MockReader(int[] responses) {
        super();
        this.responses = responses;
        isSequence = true;
    }

    public MockReader(int[] responses, boolean boolResponse) {
        super();
        this.responses = responses;
        isSequence = true;
        this.boolResponse = boolResponse;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public void setResponses(int[] responses) {
        this.responses = responses;
    }

    private int nextResponse() {
        int actualResponse = isSequence ? responses[lastResponse % responses.length] : response;
        lastResponse++;
        return actualResponse;
    }

    @Override
    public int readInt() {
        return nextResponse();
    }

    @Override
    public int readInt(String question) {
        return this.readInt();
    }

    @Override
    public int readInt(String question, int min, int max) {
        return readInt(question);
    }

    @Override
    public boolean readBool(String question, char yes, char no) {
        return boolResponse;
    }

    
    
   
    
    

}
