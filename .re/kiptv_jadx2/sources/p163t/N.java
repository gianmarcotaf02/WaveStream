package p163t;

import java.util.concurrent.CancellationException;
import p170u.a;

public final class N extends CancellationException {
    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(a.f28648a);
        return this;
    }
}
