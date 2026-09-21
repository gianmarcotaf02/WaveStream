package t5;

/* JADX INFO: renamed from: t5.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2796e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.D f28167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p175v0.y f28168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.C1681g0 f28169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p020c0.F f28170d;

    public C2796e1(D.D listState, p175v0.y requester) {
        kotlin.jvm.internal.m.e(listState, "listState");
        kotlin.jvm.internal.m.e(requester, "requester");
        this.f28167a = listState;
        this.f28168b = requester;
        this.f28169c = p020c0.AbstractC1703s.y(null);
        this.f28170d = p020c0.AbstractC1703s.r(new p077i5.C2237d(24, this));
    }

    public final void a(int i3) {
        this.f28169c.setValue(java.lang.Integer.valueOf(i3));
    }

    public final p175v0.y b(int i3) {
        if (i3 == ((java.lang.Number) this.f28170d.getValue()).intValue()) {
            return this.f28168b;
        }
        return null;
    }
}
