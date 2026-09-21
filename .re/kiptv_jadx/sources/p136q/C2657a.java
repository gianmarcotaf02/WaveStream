package p136q;

/* JADX INFO: renamed from: q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2657a implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26370i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f26371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f26372l;

    public C2657a(int i3) {
        this.f26369h = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26370i < this.f26369h;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object objE;
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f26370i;
        switch (this.f26371k) {
            case 0:
                objE = ((p136q.C2661e) this.f26372l).e(i3);
                break;
            case 1:
                objE = ((p136q.C2661e) this.f26372l).i(i3);
                break;
            default:
                objE = ((p136q.C2662f) this.f26372l).f26382i[i3];
                break;
        }
        this.f26370i++;
        this.j = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new java.lang.IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f26370i - 1;
        this.f26370i = i3;
        switch (this.f26371k) {
            case 0:
                ((p136q.C2661e) this.f26372l).g(i3);
                break;
            case 1:
                ((p136q.C2661e) this.f26372l).g(i3);
                break;
            default:
                ((p136q.C2662f) this.f26372l).d(i3);
                break;
        }
        this.f26369h--;
        this.j = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2657a(p136q.C2662f c2662f) {
        this(c2662f.j);
        this.f26371k = 2;
        this.f26372l = c2662f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2657a(p136q.C2661e c2661e, int i3) {
        this(c2661e.j);
        this.f26371k = i3;
        switch (i3) {
            case 1:
                this.f26372l = c2661e;
                this(c2661e.j);
                break;
            default:
                this.f26372l = c2661e;
                break;
        }
    }
}
