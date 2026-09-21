package p179v4;

import C4.a;
import java.util.Objects;

public final class q {

    public final Class f29185a;

    public final a f29186b;

    public q(Class cls, a aVar) {
        this.f29185a = cls;
        this.f29186b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f29185a.equals(this.f29185a) && qVar.f29186b.equals(this.f29186b);
    }

    public final int hashCode() {
        return Objects.hash(this.f29185a, this.f29186b);
    }

    public final String toString() {
        return this.f29185a.getSimpleName() + ", object identifier: " + this.f29186b;
    }
}
