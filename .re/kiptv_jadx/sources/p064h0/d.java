package p064h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p064h0.l[] f22434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22435i;
    public boolean j = true;

    public d(p064h0.k kVar, p064h0.l[] lVarArr) {
        this.f22434h = lVarArr;
        lVarArr[0].a(kVar.f22450d, java.lang.Integer.bitCount(kVar.f22447a) * 2, 0);
        this.f22435i = 0;
        a();
    }

    public final void a() {
        int i3 = this.f22435i;
        p064h0.l[] lVarArr = this.f22434h;
        p064h0.l lVar = lVarArr[i3];
        if (lVar.j < lVar.f22452i) {
            return;
        }
        while (-1 < i3) {
            int iB = b(i3);
            if (iB == -1) {
                p064h0.l lVar2 = lVarArr[i3];
                int i9 = lVar2.j;
                java.lang.Object[] objArr = lVar2.f22451h;
                if (i9 < objArr.length) {
                    int length = objArr.length;
                    lVar2.j = i9 + 1;
                    iB = b(i3);
                }
            }
            if (iB != -1) {
                this.f22435i = iB;
                return;
            }
            if (i3 > 0) {
                p064h0.l lVar3 = lVarArr[i3 - 1];
                int i10 = lVar3.j;
                int length2 = lVar3.f22451h.length;
                lVar3.j = i10 + 1;
            }
            lVarArr[i3].a(p064h0.k.f22446e.f22450d, 0, 0);
            i3--;
        }
        this.j = false;
    }

    public final int b(int i3) {
        p064h0.l[] lVarArr = this.f22434h;
        p064h0.l lVar = lVarArr[i3];
        int i9 = lVar.j;
        if (i9 < lVar.f22452i) {
            return i3;
        }
        java.lang.Object[] objArr = lVar.f22451h;
        if (i9 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        java.lang.Object obj = objArr[i9];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        p064h0.k kVar = (p064h0.k) obj;
        if (i3 == 6) {
            p064h0.l lVar2 = lVarArr[i3 + 1];
            java.lang.Object[] objArr2 = kVar.f22450d;
            lVar2.a(objArr2, objArr2.length, 0);
        } else {
            lVarArr[i3 + 1].a(kVar.f22450d, java.lang.Integer.bitCount(kVar.f22447a) * 2, 0);
        }
        return b(i3 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.j) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = this.f22434h[this.f22435i].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
