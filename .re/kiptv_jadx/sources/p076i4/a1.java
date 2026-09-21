package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends p076i4.O0 implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p076i4.O0 f22867h;

    public a1(p076i4.O0 o8) {
        this.f22867h = o8;
    }

    @Override // p076i4.O0
    public final p076i4.O0 a() {
        return this.f22867h;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f22867h.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p076i4.a1) {
            return this.f22867h.equals(((p076i4.a1) obj).f22867h);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f22867h.hashCode();
    }

    public final java.lang.String toString() {
        return this.f22867h + ".reverse()";
    }
}
