package app;

public class StatusHandler {
    private Status status;
    private String msg;

    static StatusHandler createSuccess(String message) {
        StatusHandler statusHandle = new StatusHandler();
        statusHandle.status = Status.SUCCESS;
        statusHandle.msg = message;
        return statusHandle;
    }
    static StatusHandler createError(String errorMsg) {
        StatusHandler statusHandle = new StatusHandler();
        statusHandle.status = Status.ERROR;
        statusHandle.msg = errorMsg;
        return statusHandle;
    }

    public String getMessage() {
        return msg;
    }
}
