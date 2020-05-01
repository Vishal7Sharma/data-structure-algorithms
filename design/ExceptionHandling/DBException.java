package design.ExceptionHandling;

public class DBException {

    public static class BadExecution extends BaseException{
        private static final long serialVersionUID = 45678987656789L;
        public BadExecution(String message){
            super(message);
        }
    }

    public static class NoData extends BaseException{
        private static final long serialVersionUID = 889767865786L;
        public NoData(String message){
            super(message);
        }
    }

}