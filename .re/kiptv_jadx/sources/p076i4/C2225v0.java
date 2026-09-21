package p076i4;

/* JADX INFO: renamed from: i4.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2225v0 extends p076i4.j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22946i;

    public C2225v0(java.lang.Object obj) {
        this.f22945h = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f22946i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f22946i) {
            throw new java.util.NoSuchElementException();
        }
        this.f22946i = true;
        return this.f22945h;
    }
}
