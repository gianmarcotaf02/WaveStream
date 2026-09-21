package p005a5;

/* JADX INFO: renamed from: a5.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1390r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f15026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15027b;

    public C1390r4(java.lang.Object value, long j) {
        kotlin.jvm.internal.m.e(value, "value");
        this.f15026a = value;
        this.f15027b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1390r4)) {
            return false;
        }
        p005a5.C1390r4 c1390r4 = (p005a5.C1390r4) obj;
        return kotlin.jvm.internal.m.a(this.f15026a, c1390r4.f15026a) && this.f15027b == c1390r4.f15027b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f15027b) + (this.f15026a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "MemoryCacheEntry(value=" + this.f15026a + ", timestampMs=" + this.f15027b + ")";
    }
}
