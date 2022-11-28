package ListDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-07-17
 * Time: 16:16
 */
public class PosIndexNotLegalException extends RuntimeException{
    public PosIndexNotLegalException() {
    }

    public PosIndexNotLegalException(String message) {
        super(message);
    }
}
