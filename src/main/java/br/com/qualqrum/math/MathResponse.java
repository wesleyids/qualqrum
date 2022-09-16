package br.com.qualqrum.math;

public class MathResponse {
    private String message = "ok";
    private Object result;

    public MathResponse(String message, Object result) {
        this.message = message;
        this.result = result;
    }

    public MathResponse(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getResult() {
        return this.result;
    }

}
