package A8;

import M8.D;
import M8.E;
import java.io.Closeable;

public final class n implements Closeable {

    public final E f425h;

    public final D f426i;
    public final e j;

    public n(E source, D sink, e eVar) {
        this.j = eVar;
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f425h = source;
        this.f426i = sink;
    }

    @Override
    public final void close() {
        this.j.a(true, true, null);
    }
}
