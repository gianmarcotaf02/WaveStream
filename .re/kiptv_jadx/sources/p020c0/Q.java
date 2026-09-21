package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f18184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f18185b;

    public Q(java.lang.Integer num, java.lang.Object obj) {
        this.f18184a = num;
        this.f18185b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p020c0.Q)) {
            return false;
        }
        p020c0.Q q9 = (p020c0.Q) obj;
        return this.f18184a.equals(q9.f18184a) && kotlin.jvm.internal.m.a(this.f18185b, q9.f18185b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f18184a.hashCode() * 31;
        java.lang.Object obj = this.f18185b;
        if (obj instanceof java.lang.Enum) {
            iHashCode = ((java.lang.Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JoinedKey(left=");
        sb.append(this.f18184a);
        sb.append(", right=");
        return B2.a.n(sb, this.f18185b, ')');
    }
}
