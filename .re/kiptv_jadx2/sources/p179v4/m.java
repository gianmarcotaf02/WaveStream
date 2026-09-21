package p179v4;

import java.util.Objects;

public final class m {

    public final Class f29175a;

    public final Class f29176b;

    public m(Class cls, Class cls2) {
        this.f29175a = cls;
        this.f29176b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f29175a.equals(this.f29175a) && mVar.f29176b.equals(this.f29176b);
    }

    public final int hashCode() {
        return Objects.hash(this.f29175a, this.f29176b);
    }

    public final String toString() {
        return this.f29175a.getSimpleName() + " with primitive type: " + this.f29176b.getSimpleName();
    }
}
