package ada.edu.demo.webtest.exception;

public class StudentException extends Exception {
    Integer errorCode;

    public StudentException(Integer ec, String message) {
        super(message);
        errorCode = ec;
    }

    @Override
    public String getMessage() {
        return "Entity error ("+errorCode+") : " + super.getMessage();
    }

    public String errorCode() {
        throw new UnsupportedOperationException("Unimplemented method 'errorCode'");
    }

    public Integer errorNum() {
        return errorCode;
    }
}
