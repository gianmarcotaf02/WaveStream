package H6;

/* JADX INFO: renamed from: H6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0414d implements p153r8.l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p194x6.j f4430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f4431i;

    public C0414d(int i3, p194x6.j jVar) {
        switch (i3) {
            case 1:
                this.f4430h = jVar;
                this.f4431i = new java.util.concurrent.ConcurrentHashMap();
                break;
            default:
                this.f4430h = jVar;
                this.f4431i = new java.util.concurrent.ConcurrentHashMap();
                break;
        }
    }

    public java.lang.Object a(java.lang.Class key) {
        kotlin.jvm.internal.m.e(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f4431i;
        java.lang.Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        java.lang.Object objInvoke = this.f4430h.invoke(key);
        java.lang.Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    @Override // p153r8.l0
    public kotlinx.serialization.KSerializer h(E6.InterfaceC0331d interfaceC0331d) {
        java.lang.Object objPutIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f4431i;
        java.lang.Class clsX = com.google.android.gms.internal.play_billing.AbstractC1833d1.x(interfaceC0331d);
        java.lang.Object c2700k = concurrentHashMap.get(clsX);
        if (c2700k == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsX, (c2700k = new p153r8.C2700k((kotlinx.serialization.KSerializer) this.f4430h.invoke(interfaceC0331d))))) != null) {
            c2700k = objPutIfAbsent;
        }
        return ((p153r8.C2700k) c2700k).f26976a;
    }
}
