package MoreAndMore.ForHalogen.bean;

public class ResponseBean {
	private int code;

    private String message;

    private Object object;

    public ResponseBean(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseBean error(String msg) {
        return new ResponseBean(-1000, msg);
    }

    public static ResponseBean success(String msg) {
        return new ResponseBean(0, msg);
    }

    public ResponseBean(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
