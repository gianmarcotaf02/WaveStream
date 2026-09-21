package p145r0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26684a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p145r0.d) {
            return this.f26684a == ((p145r0.d) obj).f26684a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f26684a);
    }

    public final java.lang.String toString() {
        return Y6.f.j(new java.lang.StringBuilder("AndroidContentDataType(androidAutofillType="), this.f26684a, ')');
    }
}
