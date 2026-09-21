package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends p078i6.AbstractC2250a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f8054i;

    public /* synthetic */ l(int i3, java.lang.Object obj) {
        this.f8053h = i3;
        this.f8054i = obj;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        switch (this.f8053h) {
            case 0:
                if (obj == null ? true : obj instanceof O7.i) {
                    return super.contains((O7.i) obj);
                }
                return false;
            default:
                return ((p064h0.c) this.f8054i).containsValue(obj);
        }
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        switch (this.f8053h) {
            case 0:
                return ((O7.m) this.f8054i).f8055a.groupCount() + 1;
            default:
                p064h0.c cVar = (p064h0.c) this.f8054i;
                cVar.getClass();
                return cVar.f22433i;
        }
    }

    public O7.i e(int i3) {
        O7.m mVar = (O7.m) this.f8054i;
        java.util.regex.Matcher matcher = mVar.f8055a;
        D6.g gVarW = O7.r.W(matcher.start(i3), matcher.end(i3));
        if (gVarW.f2458h < 0) {
            return null;
        }
        java.lang.String strGroup = mVar.f8055a.group(i3);
        kotlin.jvm.internal.m.d(strGroup, "group(...)");
        return new O7.i(strGroup, gVarW);
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f8053h) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f8053h) {
            case 0:
                return new D1.B(N7.o.p0(p078i6.o.Y0(p078i6.p.z0(this)), new C5.C0132n0(15, this)));
            default:
                p064h0.c cVar = (p064h0.c) this.f8054i;
                p064h0.l[] lVarArr = new p064h0.l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new p064h0.m(2);
                }
                return new p064h0.j(cVar.f22432h, lVarArr);
        }
    }
}
