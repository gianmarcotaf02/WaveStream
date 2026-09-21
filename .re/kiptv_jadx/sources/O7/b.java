package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8028h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8029i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public D6.g f8030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O7.c f8032m;

    public b(O7.c cVar) {
        this.f8032m = cVar;
        cVar.getClass();
        int iS = O7.r.s(0, 0, cVar.f8033a.length());
        this.f8029i = iS;
        this.j = iS;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    public final void a() {
        p070h6.k kVar;
        int i3 = this.j;
        if (i3 < 0) {
            this.f8028h = 0;
            this.f8030k = null;
            return;
        }
        O7.c cVar = this.f8032m;
        int i9 = cVar.f8034b;
        if (i9 > 0) {
            int i10 = this.f8031l + 1;
            this.f8031l = i10;
            if (i10 >= i9) {
                this.f8030k = new D6.g(this.f8029i, O7.q.H0(cVar.f8033a), 1);
                this.j = -1;
            } else if (i3 > cVar.f8033a.length() && (kVar = (p070h6.k) cVar.f8035c.invoke(cVar.f8033a, java.lang.Integer.valueOf(this.j))) != null) {
                int iIntValue = ((java.lang.Number) kVar.f22539h).intValue();
                int iIntValue2 = ((java.lang.Number) kVar.f22540i).intValue();
                this.f8030k = O7.r.W(this.f8029i, iIntValue);
                int i11 = iIntValue + iIntValue2;
                this.f8029i = i11;
                this.j = i11 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f8030k = new D6.g(this.f8029i, O7.q.H0(cVar.f8033a), 1);
                this.j = -1;
            }
        } else if (i3 > cVar.f8033a.length()) {
            this.f8030k = new D6.g(this.f8029i, O7.q.H0(cVar.f8033a), 1);
            this.j = -1;
        } else {
            int iIntValue3 = ((java.lang.Number) kVar.f22539h).intValue();
            int iIntValue4 = ((java.lang.Number) kVar.f22540i).intValue();
            this.f8030k = O7.r.W(this.f8029i, iIntValue3);
            int i12 = iIntValue3 + iIntValue4;
            this.f8029i = i12;
            this.j = i12 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f8028h = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8028h == -1) {
            a();
        }
        return this.f8028h == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f8028h == -1) {
            a();
        }
        if (this.f8028h == 0) {
            throw new java.util.NoSuchElementException();
        }
        D6.g gVar = this.f8030k;
        kotlin.jvm.internal.m.c(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f8030k = null;
        this.f8028h = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
