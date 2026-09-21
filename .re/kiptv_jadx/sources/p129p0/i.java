package p129p0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f26179b;

    public i(int i3, java.lang.Integer num) {
        this.f26178a = i3;
        this.f26179b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p129p0.i)) {
            return false;
        }
        p129p0.i iVar = (p129p0.i) obj;
        return this.f26178a == iVar.f26178a && kotlin.jvm.internal.m.a(this.f26179b, iVar.f26179b);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f26178a) * 31;
        java.lang.Integer num = this.f26179b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "ObjectLocation(group=" + this.f26178a + ", dataOffset=" + this.f26179b + ')';
    }
}
