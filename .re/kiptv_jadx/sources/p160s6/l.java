package p160s6;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f27375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27376i;
    public final /* synthetic */ N7.p j;

    public l(N7.p pVar) {
        this.j = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws java.io.IOException {
        if (this.f27375h == null && !this.f27376i) {
            java.lang.String line = ((java.io.BufferedReader) this.j.f7463b).readLine();
            this.f27375h = line;
            if (line == null) {
                this.f27376i = true;
            }
        }
        return this.f27375h != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.f27375h;
        this.f27375h = null;
        kotlin.jvm.internal.m.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
