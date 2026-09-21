package S2;

import v5.L;

public final class q implements k {

    public final E2.l f9292a;

    public final h f9293b;

    public final H2.h f9294c;

    public final N2.a f9295d;

    public final String f9296e;

    public final boolean f9297f;
    public final boolean g;

    public q(E2.l lVar, h hVar, H2.h hVar2, N2.a aVar, String str, boolean z6, boolean z9) {
        this.f9292a = lVar;
        this.f9293b = hVar;
        this.f9294c = hVar2;
        this.f9295d = aVar;
        this.f9296e = str;
        this.f9297f = z6;
        this.g = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f9292a, qVar.f9292a) && kotlin.jvm.internal.m.a(this.f9293b, qVar.f9293b) && this.f9294c == qVar.f9294c && kotlin.jvm.internal.m.a(this.f9295d, qVar.f9295d) && kotlin.jvm.internal.m.a(this.f9296e, qVar.f9296e) && this.f9297f == qVar.f9297f && this.g == qVar.g;
    }

    @Override
    public final h getRequest() {
        return this.f9293b;
    }

    public final int hashCode() {
        int iHashCode = (this.f9294c.hashCode() + ((this.f9293b.hashCode() + (this.f9292a.hashCode() * 31)) * 31)) * 31;
        N2.a aVar = this.f9295d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f9296e;
        return Boolean.hashCode(this.g) + p121o0.p.f((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f9297f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.f9292a);
        sb.append(", request=");
        sb.append(this.f9293b);
        sb.append(", dataSource=");
        sb.append(this.f9294c);
        sb.append(", memoryCacheKey=");
        sb.append(this.f9295d);
        sb.append(", diskCacheKey=");
        sb.append(this.f9296e);
        sb.append(", isSampled=");
        sb.append(this.f9297f);
        sb.append(", isPlaceholderCached=");
        return L.a(sb, this.g, ')');
    }
}
