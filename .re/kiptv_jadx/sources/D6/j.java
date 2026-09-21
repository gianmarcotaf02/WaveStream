package D6;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends D6.h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D6.j f2469k = new D6.j(1, 0);

    public j(long j, long j9) {
        super(j, j9, 1L);
    }

    @Override // D6.h
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof D6.j)) {
            return false;
        }
        if (isEmpty() && ((D6.j) obj).isEmpty()) {
            return true;
        }
        D6.j jVar = (D6.j) obj;
        if (this.f2464h == jVar.f2464h) {
            return this.f2465i == jVar.f2465i;
        }
        return false;
    }

    @Override // D6.h
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f2464h;
        long j9 = ((long) 31) * (j ^ (j >>> 32));
        long j10 = this.f2465i;
        return (int) (j9 + (j10 ^ (j10 >>> 32)));
    }

    @Override // D6.h
    public final boolean isEmpty() {
        return this.f2464h > this.f2465i;
    }

    @Override // D6.h
    public final java.lang.String toString() {
        return this.f2464h + ".." + this.f2465i;
    }
}
