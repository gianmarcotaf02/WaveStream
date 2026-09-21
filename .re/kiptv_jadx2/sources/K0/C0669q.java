package K0;

import java.util.concurrent.CancellationException;

public final class C0669q extends CancellationException {
    public C0669q(long j) {
        super(B2.a.k(j, "Timed out waiting for ", " ms"));
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(w.f6737c);
        return this;
    }
}
