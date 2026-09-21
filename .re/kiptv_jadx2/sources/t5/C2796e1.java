package t5;

import p020c0.AbstractC1703s;
import p020c0.C1681g0;
import p077i5.C2237d;

public final class C2796e1 {

    public final D.D f28167a;

    public final p175v0.y f28168b;

    public final C1681g0 f28169c;

    public final p020c0.F f28170d;

    public C2796e1(D.D listState, p175v0.y requester) {
        kotlin.jvm.internal.m.e(listState, "listState");
        kotlin.jvm.internal.m.e(requester, "requester");
        this.f28167a = listState;
        this.f28168b = requester;
        this.f28169c = AbstractC1703s.y(null);
        this.f28170d = AbstractC1703s.r(new C2237d(24, this));
    }

    public final void a(int i3) {
        this.f28169c.setValue(Integer.valueOf(i3));
    }

    public final p175v0.y b(int i3) {
        if (i3 == ((Number) this.f28170d.getValue()).intValue()) {
            return this.f28168b;
        }
        return null;
    }
}
