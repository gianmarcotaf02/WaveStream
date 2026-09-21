package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f16318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E2.d f16319b;

    public U(p086j6.e eVar) {
        this.f16318a = new java.util.LinkedHashMap();
        this.f16319b = new E2.d(eVar);
    }

    public final java.lang.Object a(java.lang.String str) {
        java.lang.Object value;
        E2.d dVar = this.f16319b;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) dVar.f2771h;
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) dVar.f2773k;
        try {
            V7.U u6 = (V7.U) linkedHashMap2.get(str);
            if (u6 != null && (value = ((V7.n0) u6).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (java.lang.ClassCastException unused) {
            linkedHashMap.remove(str);
            ((java.util.LinkedHashMap) dVar.j).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public U() {
        this.f16318a = new java.util.LinkedHashMap();
        this.f16319b = new E2.d(p078i6.x.f23206h);
    }
}
