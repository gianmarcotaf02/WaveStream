package p188x0;

import kotlin.jvm.internal.m;
import p181w0.b;

public final class G extends z {

    public final b f31049f;

    public G(b bVar) {
        this.f31049f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return m.a(this.f31049f, ((G) obj).f31049f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31049f.hashCode();
    }

    @Override
    public final b q() {
        return this.f31049f;
    }
}
