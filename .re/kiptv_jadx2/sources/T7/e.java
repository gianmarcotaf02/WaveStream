package T7;

import B.K;
import S7.AbstractC0906w;
import S7.C;
import S7.C0895k;
import S7.H;
import S7.M;
import S7.O;
import S7.t0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import p100l6.h;
import p121o0.p;

public final class e extends AbstractC0906w implements H {

    public final Handler f9880i;
    public final String j;

    public final boolean f9881k;

    public final e f9882l;

    public e(Handler handler, String str, boolean z6) {
        this.f9880i = handler;
        this.j = str;
        this.f9881k = z6;
        this.f9882l = z6 ? this : new e(handler, str, true);
    }

    @Override
    public final void G(long j, C0895k c0895k) {
        d dVar = new d(c0895k, this, 0);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9880i.postDelayed(dVar, j)) {
            c0895k.t(new K(this, dVar, 23));
        } else {
            Z(c0895k.f9592l, dVar);
        }
    }

    @Override
    public final O T(long j, final Runnable runnable, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9880i.postDelayed(runnable, j)) {
            return new O() {
                @Override
                public final void dispose() {
                    this.f9876h.f9880i.removeCallbacks(runnable);
                }
            };
        }
        Z(hVar, runnable);
        return t0.f9621h;
    }

    @Override
    public final void V(h hVar, Runnable runnable) {
        if (this.f9880i.post(runnable)) {
            return;
        }
        Z(hVar, runnable);
    }

    @Override
    public final boolean X(h hVar) {
        return (this.f9881k && m.a(Looper.myLooper(), this.f9880i.getLooper())) ? false : true;
    }

    @Override
    public AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return this;
    }

    public final void Z(h hVar, Runnable runnable) {
        C.k(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Z7.e eVar = M.f9549a;
        Z7.d.f13044i.V(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f9880i == this.f9880i && eVar.f9881k == this.f9881k;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9880i) ^ (this.f9881k ? 1231 : 1237);
    }

    @Override
    public final String toString() {
        e eVar;
        String str;
        Z7.e eVar2 = M.f9549a;
        e eVar3 = X7.m.f10930a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f9882l;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.j;
        if (string == null) {
            string = this.f9880i.toString();
        }
        return this.f9881k ? p.o(string, ".immediate") : string;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
