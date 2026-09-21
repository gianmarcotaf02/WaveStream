package K0;

/* JADX INFO: renamed from: K0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6709a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof K0.C0663k) {
            return this.f6709a == ((K0.C0663k) obj).f6709a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f6709a);
    }

    public final java.lang.String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f6709a + ')';
    }
}
