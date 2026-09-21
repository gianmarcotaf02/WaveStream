package p129p0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f26172b;

    public b(int i3, com.google.common.util.concurrent.D d4, java.lang.Integer num) {
        this.f26171a = i3;
        this.f26172b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p129p0.b)) {
            return false;
        }
        p129p0.b bVar = (p129p0.b) obj;
        return this.f26171a == bVar.f26171a && kotlin.jvm.internal.m.a(null, null) && kotlin.jvm.internal.m.a(this.f26172b, bVar.f26172b);
    }

    public final int hashCode() {
        int iHashCode = ((java.lang.Integer.hashCode(this.f26171a) * 31) + 0) * 31;
        java.lang.Integer num = this.f26172b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f26171a + ", sourceInfo=" + ((java.lang.Object) null) + ", groupOffset=" + this.f26172b + ')';
    }
}
