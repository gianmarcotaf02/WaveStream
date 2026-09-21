package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements FileIOSpanManager.FileIOCallable {

    public final int f23504a;

    public final Closeable f23505b;

    public final Serializable f23506c;

    public c(Closeable closeable, Serializable serializable, int i3) {
        this.f23504a = i3;
        this.f23505b = closeable;
        this.f23506c = serializable;
    }

    @Override
    public final Object call() {
        switch (this.f23504a) {
            case 0:
                return ((SentryFileInputStream) this.f23505b).lambda$read$1((byte[]) this.f23506c);
            case 1:
                return ((SentryFileInputStream) this.f23505b).lambda$read$0((AtomicInteger) this.f23506c);
            default:
                return ((SentryFileOutputStream) this.f23505b).lambda$write$1((byte[]) this.f23506c);
        }
    }
}
