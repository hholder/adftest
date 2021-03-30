package RESTModel;

public class ResponseMessage {
    private int id;
    private int requestId;
    private String content;
    
    public ResponseMessage() {
        super();
    }
    
    public ResponseMessage(int id, int requestId, String content) {
        super();
        this.id = id;
        this.requestId = requestId;
        this.content = content;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getRequestId() {
        return this.requestId;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
}
