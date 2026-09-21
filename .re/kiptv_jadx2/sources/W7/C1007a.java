package W7;

import V7.InterfaceC0982h;
import java.util.concurrent.CancellationException;

public final class C1007a extends CancellationException {

    public final transient InterfaceC0982h f10726h;

    public C1007a(InterfaceC0982h interfaceC0982h) {
        super("Flow was aborted, no more elements needed");
        this.f10726h = interfaceC0982h;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
