package p089k0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.Set f24423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p129p0.d f24424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p038e0.e f24425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p136q.I f24426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p038e0.e f24427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p038e0.e f24428f;
    public final p038e0.e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p136q.I f24429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p136q.H f24430i;
    public java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p136q.I f24431k;

    public k() {
        p038e0.e eVar = new p038e0.e(new p020c0.D0[16]);
        this.f24425c = eVar;
        p136q.I i3 = p136q.Q.f26352a;
        this.f24426d = new p136q.I();
        this.f24427e = eVar;
        this.f24428f = new p038e0.e(new java.lang.Object[16]);
        this.g = new p038e0.e(new kotlin.jvm.functions.Function0[16]);
    }

    public static final boolean f(p020c0.D0 d4, p038e0.e eVar) {
        java.lang.Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        for (int i9 = 0; i9 < i3; i9++) {
            p020c0.C0 c9 = ((p020c0.D0) objArr[i9]).f18104a;
            if (c9 instanceof p089k0.h) {
                p038e0.e eVar2 = ((p089k0.h) c9).f24416i;
                if (eVar2.l(d4) || f(d4, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f24423a = null;
        this.f24424b = null;
        p038e0.e eVar = this.f24425c;
        eVar.i();
        this.f24426d.b();
        this.f24427e = eVar;
        this.f24428f.i();
        this.g.i();
        this.f24429h = null;
        this.f24430i = null;
        this.j = null;
    }

    public final void b() {
        java.util.Set set = this.f24423a;
        if (set == null || set.isEmpty()) {
            return;
        }
        android.os.Trace.beginSection("Compose:abandons");
        try {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                p020c0.C0 c9 = (p020c0.C0) it.next();
                it.remove();
                c9.a();
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        java.util.Set set = this.f24423a;
        if (set == null) {
            return;
        }
        this.f24431k = null;
        p038e0.e eVar = this.f24428f;
        if (eVar.j != 0) {
            android.os.Trace.beginSection("Compose:onForgotten");
            try {
                p136q.I i3 = this.f24429h;
                int i9 = eVar.j;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    java.lang.Object obj = eVar.f21324h[i9];
                    try {
                        if (obj instanceof p020c0.D0) {
                            p020c0.C0 c9 = ((p020c0.D0) obj).f18104a;
                            set.remove(c9);
                            c9.c();
                        }
                        if (obj instanceof p020c0.InterfaceC1682h) {
                            if (i3 == null || !i3.c(obj)) {
                                ((p020c0.InterfaceC1682h) obj).d();
                            } else {
                                ((p020c0.InterfaceC1682h) obj).b();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        p129p0.d dVar = this.f24424b;
                        if (dVar != null) {
                            com.google.common.util.concurrent.AbstractC1903s.M(th, new io.ktor.http.d(dVar, obj, 6));
                        }
                        throw th;
                    }
                }
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                android.os.Trace.endSection();
                throw th2;
            }
        }
        p038e0.e eVar2 = this.f24425c;
        if (eVar2.j != 0) {
            android.os.Trace.beginSection("Compose:onRemembered");
            java.util.Set set2 = this.f24423a;
            if (set2 != null) {
                java.lang.Object[] objArr = eVar2.f21324h;
                int i10 = eVar2.j;
                for (int i11 = 0; i11 < i10; i11++) {
                    p020c0.D0 d4 = (p020c0.D0) objArr[i11];
                    p020c0.C0 c10 = d4.f18104a;
                    set2.remove(c10);
                    try {
                        c10.d();
                    } catch (java.lang.Throwable th3) {
                        p129p0.d dVar2 = this.f24424b;
                        if (dVar2 != null) {
                            com.google.common.util.concurrent.AbstractC1903s.M(th3, new io.ktor.http.d(dVar2, d4, 6));
                        }
                        throw th3;
                    }
                }
            }
            android.os.Trace.endSection();
        }
    }

    public final void d() {
        p038e0.e eVar = this.g;
        if (eVar.j != 0) {
            android.os.Trace.beginSection("Compose:sideeffects");
            try {
                java.lang.Object[] objArr = eVar.f21324h;
                int i3 = eVar.j;
                for (int i9 = 0; i9 < i3; i9++) {
                    ((kotlin.jvm.functions.Function0) objArr[i9]).invoke();
                }
                eVar.i();
            } finally {
                android.os.Trace.endSection();
            }
        }
    }

    public final void e(p020c0.D0 d4) {
        if (!this.f24426d.c(d4)) {
            p136q.I i3 = this.f24431k;
            if (i3 == null || !i3.c(d4)) {
                this.f24428f.c(d4);
                return;
            }
            return;
        }
        this.f24426d.l(d4);
        if (!this.f24427e.l(d4)) {
            p038e0.e eVar = this.f24425c;
            if (!eVar.l(d4)) {
                f(d4, eVar);
            }
        }
        java.util.Set set = this.f24423a;
        if (set == null) {
            return;
        }
        set.add(d4.f18104a);
    }

    public final void g(java.util.Set set, p129p0.d dVar) {
        a();
        this.f24423a = set;
        this.f24424b = dVar;
    }
}
