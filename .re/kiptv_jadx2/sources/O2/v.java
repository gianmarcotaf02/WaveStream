package O2;

import M8.InterfaceC0684l;
import java.io.IOException;

public final class v implements AutoCloseable {

    public final InterfaceC0684l f7949h;

    @Override
    public final void close() throws IOException {
        this.f7949h.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return kotlin.jvm.internal.m.a(this.f7949h, ((v) obj).f7949h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7949h.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f7949h + ')';
    }
}
