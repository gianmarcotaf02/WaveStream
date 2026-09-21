package p056g0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p056g0.a {
    public final p056g0.f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p056g0.j f21765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21766m;

    public h(p056g0.f fVar, int i3) {
        super(i3, fVar.f21762o);
        this.j = fVar;
        this.f21764k = fVar.p();
        this.f21766m = -1;
        b();
    }

    public final void a() {
        if (this.f21764k != this.j.p()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // p056g0.a, java.util.ListIterator
    public final void add(java.lang.Object obj) {
        a();
        int i3 = this.f21748h;
        p056g0.f fVar = this.j;
        fVar.add(i3, obj);
        this.f21748h++;
        this.f21749i = fVar.d();
        this.f21764k = fVar.p();
        this.f21766m = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        p056g0.f fVar = this.j;
        java.lang.Object[] objArr = fVar.f21760m;
        if (objArr == null) {
            this.f21765l = null;
            return;
        }
        int i3 = (fVar.f21762o - 1) & (-32);
        int i9 = this.f21748h;
        if (i9 > i3) {
            i9 = i3;
        }
        int i10 = (fVar.f21758k / 5) + 1;
        p056g0.j jVar = this.f21765l;
        if (jVar == null) {
            this.f21765l = new p056g0.j(objArr, i9, i3, i10);
            return;
        }
        jVar.f21748h = i9;
        jVar.f21749i = i3;
        jVar.j = i10;
        if (jVar.f21769k.length < i10) {
            jVar.f21769k = new java.lang.Object[i10];
        }
        jVar.f21769k[0] = objArr;
        ?? r9 = i9 == i3 ? 1 : 0;
        jVar.f21770l = r9;
        jVar.b(i9 - r9, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        a();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f21748h;
        this.f21766m = i3;
        p056g0.j jVar = this.f21765l;
        p056g0.f fVar = this.j;
        if (jVar == null) {
            java.lang.Object[] objArr = fVar.f21761n;
            this.f21748h = i3 + 1;
            return objArr[i3];
        }
        if (jVar.hasNext()) {
            this.f21748h++;
            return jVar.next();
        }
        java.lang.Object[] objArr2 = fVar.f21761n;
        int i9 = this.f21748h;
        this.f21748h = i9 + 1;
        return objArr2[i9 - jVar.f21749i];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        a();
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f21748h;
        this.f21766m = i3 - 1;
        p056g0.j jVar = this.f21765l;
        p056g0.f fVar = this.j;
        if (jVar == null) {
            java.lang.Object[] objArr = fVar.f21761n;
            int i9 = i3 - 1;
            this.f21748h = i9;
            return objArr[i9];
        }
        int i10 = jVar.f21749i;
        if (i3 <= i10) {
            this.f21748h = i3 - 1;
            return jVar.previous();
        }
        java.lang.Object[] objArr2 = fVar.f21761n;
        int i11 = i3 - 1;
        this.f21748h = i11;
        return objArr2[i11 - i10];
    }

    @Override // p056g0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i3 = this.f21766m;
        if (i3 == -1) {
            throw new java.lang.IllegalStateException();
        }
        p056g0.f fVar = this.j;
        fVar.e(i3);
        int i9 = this.f21766m;
        if (i9 < this.f21748h) {
            this.f21748h = i9;
        }
        this.f21749i = fVar.d();
        this.f21764k = fVar.p();
        this.f21766m = -1;
        b();
    }

    @Override // p056g0.a, java.util.ListIterator
    public final void set(java.lang.Object obj) {
        a();
        int i3 = this.f21766m;
        if (i3 == -1) {
            throw new java.lang.IllegalStateException();
        }
        p056g0.f fVar = this.j;
        fVar.set(i3, obj);
        this.f21764k = fVar.p();
        b();
    }
}
