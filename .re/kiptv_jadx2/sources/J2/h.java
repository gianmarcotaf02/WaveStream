package J2;

import E2.l;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class h implements e {

    public final l f6006a;

    public final boolean f6007b;

    public final H2.h f6008c;

    public h(l lVar, boolean z6, H2.h hVar) {
        this.f6006a = lVar;
        this.f6007b = z6;
        this.f6008c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m.a(this.f6006a, hVar.f6006a) && this.f6007b == hVar.f6007b && this.f6008c == hVar.f6008c;
    }

    public final int hashCode() {
        return this.f6008c.hashCode() + p.f(this.f6006a.hashCode() * 31, 31, this.f6007b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f6006a + ", isSampled=" + this.f6007b + ", dataSource=" + this.f6008c + ')';
    }
}
