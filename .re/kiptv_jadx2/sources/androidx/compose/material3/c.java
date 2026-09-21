package androidx.compose.material3;

import Q0.InterfaceC0775i;
import Z.C1141d0;
import p113n1.f;
import p121o0.p;
import p188x0.C3098s;
import p202z.k;
import v.InterfaceC2886h0;

public final class c implements InterfaceC2886h0 {

    public final boolean f15819a;

    public final float f15820b;

    public final long f15821c;

    public c(boolean z6, float f9, long j) {
        this.f15819a = z6;
        this.f15820b = f9;
        this.f15821c = j;
    }

    @Override
    public final InterfaceC0775i a(k kVar) {
        C1141d0 c1141d0 = new C1141d0(this);
        return new DelegatingThemeAwareRippleNode(kVar, this.f15819a, this.f15820b, c1141d0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15819a == cVar.f15819a && f.c(this.f15820b, cVar.f15820b)) {
            return C3098s.d(this.f15821c, cVar.f15821c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int iC = p.c(this.f15820b, Boolean.hashCode(this.f15819a) * 31, 961);
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f15821c) + iC;
    }
}
