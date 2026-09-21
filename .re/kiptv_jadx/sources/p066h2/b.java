package p066h2;

/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Y1.F f22458d = new Y1.F(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p136q.T f22459b = new p136q.T(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22460c = false;

    @Override // androidx.lifecycle.e0
    public final void d() {
        p136q.T t9 = this.f22459b;
        int iG = t9.g();
        for (int i3 = 0; i3 < iG; i3++) {
            p066h2.a aVar = (p066h2.a) t9.h(i3);
            p166t3.d dVar = aVar.f22455l;
            dVar.a();
            dVar.f27771c = true;
            B7.l lVar = aVar.f22457n;
            if (lVar != null) {
                aVar.h(lVar);
            }
            p066h2.a aVar2 = dVar.f27769a;
            if (aVar2 == null) {
                throw new java.lang.IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f27769a = null;
            if (lVar != null) {
                boolean z6 = lVar.f840i;
            }
            dVar.f27772d = true;
            dVar.f27770b = false;
            dVar.f27771c = false;
            dVar.f27773e = false;
        }
        int i9 = t9.f26357k;
        java.lang.Object[] objArr = t9.j;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        t9.f26357k = 0;
        t9.f26355h = false;
    }
}
