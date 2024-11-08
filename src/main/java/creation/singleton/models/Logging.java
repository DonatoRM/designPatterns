package creation.singleton.models;

public class Logging {
    private static Message message;

    private Logging() {
    }

    private static Message getInstance() {
        if (message == null) {
            message = new Message();
        }
        return message;
    }

    public static Message log() {
        return getInstance();
    }
}
