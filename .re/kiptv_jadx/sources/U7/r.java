package U7;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U7.q f10218b = new U7.q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f10219a;

    public static final java.lang.Throwable a(java.lang.Object obj) {
        U7.p pVar = obj instanceof U7.p ? (U7.p) obj : null;
        if (pVar != null) {
            return pVar.f10217a;
        }
        return null;
    }

    public static final java.lang.Object b(java.lang.Object obj) {
        if (obj instanceof U7.q) {
            return null;
        }
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof U7.r) {
            return kotlin.jvm.internal.m.a(this.f10219a, ((U7.r) obj).f10219a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f10219a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f10219a;
        if (obj instanceof U7.p) {
            return ((U7.p) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
