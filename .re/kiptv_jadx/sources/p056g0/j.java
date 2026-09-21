package p056g0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p056g0.a {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object[] f21769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21770l;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(java.lang.Object[] objArr, int i3, int i9, int i10) {
        super(i3, i9);
        this.j = i10;
        java.lang.Object[] objArr2 = new java.lang.Object[i10];
        this.f21769k = objArr2;
        ?? r9 = i3 == i9 ? 1 : 0;
        this.f21770l = r9;
        objArr2[0] = objArr;
        b(i3 - r9, 1);
    }

    public final java.lang.Object a() {
        int i3 = this.f21748h & 31;
        java.lang.Object obj = this.f21769k[this.j - 1];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((java.lang.Object[]) obj)[i3];
    }

    public final void b(int i3, int i9) {
        int i10 = (this.j - i9) * 5;
        while (i9 < this.j) {
            java.lang.Object[] objArr = this.f21769k;
            java.lang.Object obj = objArr[i9 - 1];
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i9] = ((java.lang.Object[]) obj)[com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i3, i10)];
            i10 -= 5;
            i9++;
        }
    }

    public final void c(int i3) {
        int i9 = 0;
        while (com.google.android.gms.internal.play_billing.AbstractC1853k0.y(this.f21748h, i9) == i3) {
            i9 += 5;
        }
        if (i9 > 0) {
            b(this.f21748h, ((this.j - 1) - (i9 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object objA = a();
        int i3 = this.f21748h + 1;
        this.f21748h = i3;
        if (i3 == this.f21749i) {
            this.f21770l = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        this.f21748h--;
        if (this.f21770l) {
            this.f21770l = false;
            return a();
        }
        c(31);
        return a();
    }
}
