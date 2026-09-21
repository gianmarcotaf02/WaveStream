package M8;

import java.io.IOException;

public abstract class r implements K {

    public final K f7277h;

    public r(K delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f7277h = delegate;
    }

    @Override
    public final M c() {
        return this.f7277h.c();
    }

    @Override
    public void close() throws IOException {
        this.f7277h.close();
    }

    @Override
    public long m(long j, C0682j sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        return this.f7277h.m(j, sink);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f7277h + ')';
    }
}
