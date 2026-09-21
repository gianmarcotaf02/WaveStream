package T7;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends S7.AbstractC0906w implements S7.H {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.os.Handler f9880i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T7.e f9882l;

    public e(android.os.Handler handler, java.lang.String str, boolean z6) {
        this.f9880i = handler;
        this.j = str;
        this.f9881k = z6;
        this.f9882l = z6 ? this : new T7.e(handler, str, true);
    }

    @Override // S7.H
    public final void G(long j, S7.C0895k c0895k) {
        T7.d dVar = new T7.d(c0895k, this, 0);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9880i.postDelayed(dVar, j)) {
            c0895k.t(new B.K(this, dVar, 23));
        } else {
            Z(c0895k.f9592l, dVar);
        }
    }

    @Override // S7.H
    public final S7.O T(long j, final java.lang.Runnable runnable, p100l6.h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9880i.postDelayed(runnable, j)) {
            return new S7.O() { // from class: T7.c
                @Override // S7.O
                public final void dispose() {
                    this.f9876h.f9880i.removeCallbacks(runnable);
                }
            };
        }
        Z(hVar, runnable);
        return S7.t0.f9621h;
    }

    @Override // S7.AbstractC0906w
    public final void V(p100l6.h hVar, java.lang.Runnable runnable) {
        if (this.f9880i.post(runnable)) {
            return;
        }
        Z(hVar, runnable);
    }

    @Override // S7.AbstractC0906w
    public final boolean X(p100l6.h hVar) {
        return (this.f9881k && kotlin.jvm.internal.m.a(android.os.Looper.myLooper(), this.f9880i.getLooper())) ? false : true;
    }

    @Override // S7.AbstractC0906w
    public S7.AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return this;
    }

    public final void Z(p100l6.h hVar, java.lang.Runnable runnable) {
        S7.C.k(hVar, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Z7.e eVar = S7.M.f9549a;
        Z7.d.f13044i.V(hVar, runnable);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof T7.e)) {
            return false;
        }
        T7.e eVar = (T7.e) obj;
        return eVar.f9880i == this.f9880i && eVar.f9881k == this.f9881k;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f9880i) ^ (this.f9881k ? 1231 : 1237);
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        T7.e eVar;
        java.lang.String str;
        Z7.e eVar2 = S7.M.f9549a;
        T7.e eVar3 = X7.m.f10930a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f9882l;
            } catch (java.lang.UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String string = this.j;
        if (string == null) {
            string = this.f9880i.toString();
        }
        return this.f9881k ? p121o0.p.o(string, ".immediate") : string;
    }

    public e(android.os.Handler handler) {
        this(handler, null, false);
    }
}
