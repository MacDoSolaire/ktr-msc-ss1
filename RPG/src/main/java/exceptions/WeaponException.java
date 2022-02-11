package exceptions;

public class WeaponException extends Exception{
    public WeaponException() {
        super();
    }

    public WeaponException(String message) {
        super(message);
    }

    public WeaponException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeaponException(Throwable cause) {
        super(cause);
    }

    public WeaponException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
