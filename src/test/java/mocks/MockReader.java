package mocks;

import ui.Reader;

public class MockReader extends Reader {

    private int response;
    private int[] responses;
    private int lastResponse = 0;
    private boolean isSequence = false;

    public MockReader(int response) {
        super();
        this.response = response;
        isSequence = false;
    }

    public MockReader(int[] responses) {
        super();
        this.responses = responses;
        isSequence = true;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public void setResponses(int[] responses) {
        this.responses = responses;
    }
    
    private int nextResponse() {
        return isSequence ? responses[lastResponse % responses.length] : response;
    }

    @Override
    public int readInt() {
        return nextResponse();
    }

    @Override
    public int readInt(String question) {
        return this.readInt(question);
    }

    @Override
    public int readInt(String question, int min, int max) {
        return this.readInt(question, min, max);
    }

    

   
    
    

}
