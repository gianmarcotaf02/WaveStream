package p020c0;

import I3.b;
import Q0.D0;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import p089k0.f;
import p089k0.k;
import p136q.I;
import p136q.K;
import p136q.Q;
import p194x6.m;

public final class C1685i0 {

    public final C1715y f18257a;

    public final AbstractC1709v f18258b;

    public final C1700q f18259c;

    public final m f18260d;

    public final boolean f18261e;

    public final D0 f18262f;
    public final Object g;

    public final AtomicReference f18263h = new AtomicReference(EnumC1687j0.j);

    public long f18264i = f.c();
    public I j;

    public final k f18265k;

    public final A0 f18266l;

    public C1685i0(C1715y c1715y, AbstractC1709v abstractC1709v, C1700q c1700q, K k9, m mVar, boolean z6, D0 d4, Object obj) {
        this.f18257a = c1715y;
        this.f18258b = abstractC1709v;
        this.f18259c = c1700q;
        this.f18260d = mVar;
        this.f18261e = z6;
        this.f18262f = d4;
        this.g = obj;
        I i3 = Q.f26352a;
        kotlin.jvm.internal.m.c(i3, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.j = i3;
        k kVar = new k();
        kVar.g(k9, c1700q.D());
        this.f18265k = kVar;
        this.f18266l = new A0(d4.j);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.f18263h;
        try {
            switch (((EnumC1687j0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    EnumC1687j0 enumC1687j0 = EnumC1687j0.f18274m;
                    EnumC1687j0 enumC1687j1 = EnumC1687j0.f18275n;
                    while (!atomicReference.compareAndSet(enumC1687j0, enumC1687j1)) {
                        if (atomicReference.get() != enumC1687j0) {
                            AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new b();
            }
        } catch (Exception e6) {
            atomicReference.set(EnumC1687j0.f18270h);
            throw e6;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.f18266l.a(this.f18262f, this.f18265k);
                    this.f18265k.c();
                    this.f18265k.d();
                    this.f18265k.b();
                    this.f18257a.f18413x = null;
                } catch (Throwable th) {
                    this.f18265k.b();
                    this.f18257a.f18413x = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((EnumC1687j0) this.f18263h.get()).compareTo(EnumC1687j0.f18274m) >= 0;
    }

    public final void d() {
        boolean z6;
        EnumC1687j0 enumC1687j0 = EnumC1687j0.f18272k;
        EnumC1687j0 enumC1687j1 = EnumC1687j0.f18274m;
        AtomicReference atomicReference = this.f18263h;
        while (true) {
            if (atomicReference.compareAndSet(enumC1687j0, enumC1687j1)) {
                z6 = true;
                break;
            } else if (atomicReference.get() != enumC1687j0) {
                z6 = false;
                break;
            }
        }
        if (z6) {
            return;
        }
        AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
    }

    public final boolean e(H0 h9) throws Exception {
        long j;
        EnumC1687j0 enumC1687j0;
        EnumC1687j0 enumC1687j1;
        AtomicReference atomicReference = this.f18263h;
        try {
            int iOrdinal = ((EnumC1687j0) atomicReference.get()).ordinal();
            C1715y c1715y = this.f18257a;
            AbstractC1709v abstractC1709v = this.f18258b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C1700q c1700q = this.f18259c;
                    boolean z6 = this.f18261e;
                    if (z6) {
                        c1700q.f18347z = 100;
                        c1700q.y = true;
                    }
                    try {
                        this.j = abstractC1709v.b(c1715y, h9, this.f18260d);
                        if (z6) {
                            c1700q.v();
                        }
                        EnumC1687j0 enumC1687j2 = EnumC1687j0.j;
                        EnumC1687j0 enumC1687j3 = EnumC1687j0.f18272k;
                        while (!atomicReference.compareAndSet(enumC1687j2, enumC1687j3)) {
                            if (atomicReference.get() != enumC1687j2) {
                                AbstractC1693m0.b("Unexpected state change from: " + enumC1687j2 + " to: " + enumC1687j3 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z6) {
                            c1700q.v();
                        }
                        throw th;
                    }
                case 3:
                    EnumC1687j0 enumC1687j4 = EnumC1687j0.f18272k;
                    EnumC1687j0 enumC1687j5 = EnumC1687j0.f18273l;
                    try {
                        while (!atomicReference.compareAndSet(enumC1687j4, enumC1687j5)) {
                            if (atomicReference.get() != enumC1687j4) {
                                AbstractC1693m0.b("Unexpected state change from: " + enumC1687j4 + " to: " + enumC1687j5 + '.');
                                j = this.f18264i;
                                this.f18264i = f.c();
                                this.j = abstractC1709v.n(c1715y, h9, this.j);
                                this.f18264i = j;
                                enumC1687j0 = EnumC1687j0.f18273l;
                                enumC1687j1 = EnumC1687j0.f18272k;
                                while (!atomicReference.compareAndSet(enumC1687j0, enumC1687j1)) {
                                    if (atomicReference.get() != enumC1687j0) {
                                        AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.f18264i = f.c();
                        this.j = abstractC1709v.n(c1715y, h9, this.j);
                        this.f18264i = j;
                        enumC1687j0 = EnumC1687j0.f18273l;
                        enumC1687j1 = EnumC1687j0.f18272k;
                        while (!atomicReference.compareAndSet(enumC1687j0, enumC1687j1)) {
                            if (atomicReference.get() != enumC1687j0) {
                                AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.f18264i = j;
                        EnumC1687j0 enumC1687j6 = EnumC1687j0.f18273l;
                        EnumC1687j0 enumC1687j7 = EnumC1687j0.f18272k;
                        while (!atomicReference.compareAndSet(enumC1687j6, enumC1687j7)) {
                            if (atomicReference.get() != enumC1687j6) {
                                AbstractC1693m0.b("Unexpected state change from: " + enumC1687j6 + " to: " + enumC1687j7 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.f18264i;
                case 4:
                    AbstractC1705t.b("Recursive call to resume()");
                    throw new b();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new b();
            }
        } catch (Exception e6) {
            atomicReference.set(EnumC1687j0.f18270h);
            throw e6;
        }
    }
}
