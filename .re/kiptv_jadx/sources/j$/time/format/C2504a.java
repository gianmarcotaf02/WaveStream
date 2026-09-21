package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2504a extends j$.time.format.A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j$.time.format.z f23688d;

    public C2504a(j$.time.format.z zVar) {
        this.f23688d = zVar;
    }

    @Override // j$.time.format.A
    public final java.lang.String b(j$.time.chrono.l lVar, j$.time.temporal.q qVar, long j, j$.time.format.F f9, java.util.Locale locale) {
        return this.f23688d.a(j, f9);
    }

    @Override // j$.time.format.A
    public final java.lang.String c(j$.time.temporal.q qVar, long j, j$.time.format.F f9, java.util.Locale locale) {
        return this.f23688d.a(j, f9);
    }

    @Override // j$.time.format.A
    public final java.util.Iterator d(j$.time.chrono.l lVar, j$.time.temporal.q qVar, j$.time.format.F f9, java.util.Locale locale) {
        java.util.List list = (java.util.List) this.f23688d.f23750b.get(f9);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.A
    public final java.util.Iterator e(j$.time.temporal.q qVar, j$.time.format.F f9, java.util.Locale locale) {
        java.util.List list = (java.util.List) this.f23688d.f23750b.get(f9);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
