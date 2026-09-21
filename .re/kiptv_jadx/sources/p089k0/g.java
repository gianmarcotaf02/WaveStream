package p089k0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24414a = 0;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntRef(element = ");
        sb.append(this.f24414a);
        sb.append(")@");
        int iHashCode = hashCode();
        R8.i.i(16);
        java.lang.String string = java.lang.Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
