package p175v0;

import kotlin.jvm.internal.InterfaceC2542g;
import kotlin.jvm.internal.m;
import p070h6.e;
import p194x6.j;

public final class v implements InterfaceC2542g {

    public final j f29101h;

    public v(j jVar) {
        this.f29101h = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v) || obj == null) {
            return false;
        }
        return m.a(this.f29101h, ((InterfaceC2542g) obj).getFunctionDelegate());
    }

    @Override
    public final e getFunctionDelegate() {
        return this.f29101h;
    }

    public final int hashCode() {
        return this.f29101h.hashCode();
    }
}
