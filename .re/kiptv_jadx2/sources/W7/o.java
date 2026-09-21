package W7;

import java.util.concurrent.CancellationException;

public final class o extends CancellationException {
    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
