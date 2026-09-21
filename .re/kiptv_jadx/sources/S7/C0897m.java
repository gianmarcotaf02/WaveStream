package S7;

/* JADX INFO: renamed from: S7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0897m extends S7.k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S7.C0895k f9597m;

    public /* synthetic */ C0897m(S7.C0895k c0895k, int i3) {
        this.f9596l = i3;
        this.f9597m = c0895k;
    }

    @Override // S7.k0
    public final boolean i() {
        switch (this.f9596l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // S7.k0
    public final void j(java.lang.Throwable th) {
        switch (this.f9596l) {
            case 0:
                S7.p0 p0VarH = h();
                S7.C0895k c0895k = this.f9597m;
                java.lang.Throwable thP = c0895k.p(p0VarH);
                if (c0895k.v()) {
                    X7.f fVar = (X7.f) c0895k.f9591k;
                    while (true) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.f.f10909o;
                        java.lang.Object obj = atomicReferenceFieldUpdater.get(fVar);
                        N6.A a2 = X7.a.f10900c;
                        if (kotlin.jvm.internal.m.a(obj, a2)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, a2, thP)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != a2) {
                                }
                            }
                            break;
                        } else if (obj instanceof java.lang.Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0895k.cancel(thP);
                if (!c0895k.v()) {
                    c0895k.l();
                }
                break;
            default:
                this.f9597m.resumeWith(p070h6.A.f22523a);
                break;
        }
    }
}
