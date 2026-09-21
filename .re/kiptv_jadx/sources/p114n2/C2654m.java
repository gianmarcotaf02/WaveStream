package p114n2;

/* JADX INFO: renamed from: n2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2654m extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f25641b = new java.util.LinkedHashMap();

    @Override // androidx.lifecycle.e0
    public final void d() {
        java.util.LinkedHashMap linkedHashMap = this.f25641b;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.j0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = java.lang.System.identityHashCode(this);
        R8.i.i(16);
        sb.append(com.google.crypto.tink.shaded.protobuf.AbstractC1909d.l0(16, ((long) iIdentityHashCode) & 4294967295L));
        sb.append("} ViewModelStores (");
        java.util.Iterator it = this.f25641b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
