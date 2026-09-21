package p020c0;

import kotlin.jvm.internal.m;

public final class B0 extends AbstractC1703s {

    public final AbstractC1703s f18099d;

    public final int f18100e;

    public B0(AbstractC1703s abstractC1703s, int i3) {
        this.f18099d = abstractC1703s;
        this.f18100e = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b9 = (B0) obj;
        return m.a(b9.f18099d, this.f18099d) && b9.f18100e == this.f18100e;
    }

    public final int hashCode() {
        return this.f18099d.hashCode() + (this.f18100e * 31);
    }
}
