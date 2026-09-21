package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f16362a = new java.util.LinkedHashMap();

    public final void a() {
        java.util.LinkedHashMap linkedHashMap = this.f16362a;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.e0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
