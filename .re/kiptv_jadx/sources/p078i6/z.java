package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f23209b;

    public z(int i3, java.lang.Object obj) {
        this.f23208a = i3;
        this.f23209b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p078i6.z)) {
            return false;
        }
        p078i6.z zVar = (p078i6.z) obj;
        return this.f23208a == zVar.f23208a && kotlin.jvm.internal.m.a(this.f23209b, zVar.f23209b);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f23208a) * 31;
        java.lang.Object obj = this.f23209b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndexedValue(index=");
        sb.append(this.f23208a);
        sb.append(", value=");
        return B2.a.n(sb, this.f23209b, ')');
    }
}
