package j$.time.zone;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements java.security.PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f23862a;

    public h(java.util.ArrayList arrayList) {
        this.f23862a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        java.lang.String property = java.lang.System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                j$.time.zone.i iVar = (j$.time.zone.i) j$.time.zone.i.class.cast(java.lang.Class.forName(property, true, j$.time.zone.i.class.getClassLoader()).newInstance());
                j$.time.zone.i.b(iVar);
                this.f23862a.add(iVar);
                return null;
            } catch (java.lang.Exception e6) {
                throw new java.lang.Error(e6);
            }
        }
        j$.time.zone.i.b(new j$.time.zone.i());
        return null;
    }
}
