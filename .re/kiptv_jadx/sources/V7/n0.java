package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends W7.AbstractC1008b implements V7.U, V7.InterfaceC0981g, W7.v {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10493m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(V7.n0.class, java.lang.Object.class, "_state$volatile");
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10494l;

    public n0(java.lang.Object obj) {
        this._state$volatile = obj;
    }

    @Override // W7.v
    public final V7.InterfaceC0981g a(p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0955c != U7.EnumC0955c.f10176i) ? V7.r.r(this, hVar, i3, enumC0955c) : this;
    }

    @Override // W7.AbstractC1008b
    public final W7.AbstractC1010d c() {
        return new V7.o0();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00de, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00de->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h r17, p100l6.c r18) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V7.n0.collect(V7.h, l6.c):java.lang.Object");
    }

    @Override // W7.AbstractC1008b
    public final W7.AbstractC1010d[] d() {
        return new V7.o0[2];
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        h(obj);
        return p070h6.A.f22523a;
    }

    public final boolean g(java.lang.Object obj, java.lang.Object obj2) {
        N6.A a2 = W7.AbstractC1009c.f10731b;
        if (obj == null) {
            obj = a2;
        }
        if (obj2 == null) {
            obj2 = a2;
        }
        return i(obj, obj2);
    }

    @Override // V7.l0
    public final java.lang.Object getValue() {
        N6.A a2 = W7.AbstractC1009c.f10731b;
        java.lang.Object obj = f10493m.get(this);
        if (obj == a2) {
            return null;
        }
        return obj;
    }

    public final void h(java.lang.Object obj) {
        if (obj == null) {
            obj = W7.AbstractC1009c.f10731b;
        }
        i(null, obj);
    }

    public final boolean i(java.lang.Object obj, java.lang.Object obj2) {
        int i3;
        W7.AbstractC1010d[] abstractC1010dArr;
        N6.A a2;
        synchronized (this) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10493m;
            java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.m.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.m.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f10494l;
            if ((i9 & 1) != 0) {
                this.f10494l = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.f10494l = i10;
            W7.AbstractC1010d[] abstractC1010dArr2 = this.f10727h;
            while (true) {
                V7.o0[] o0VarArr = (V7.o0[]) abstractC1010dArr2;
                if (o0VarArr != null) {
                    for (V7.o0 o0Var : o0VarArr) {
                        if (o0Var != null) {
                            java.util.concurrent.atomic.AtomicReference atomicReference = o0Var.f10497a;
                            while (true) {
                                java.lang.Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (a2 = V7.r.f10510d)) {
                                    break;
                                }
                                N6.A a9 = V7.r.f10509c;
                                if (obj4 != a9) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a9)) {
                                            ((S7.C0895k) obj4).resumeWith(p070h6.A.f22523a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a2)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f10494l;
                    if (i3 == i10) {
                        this.f10494l = i10 + 1;
                        return true;
                    }
                    abstractC1010dArr = this.f10727h;
                }
                abstractC1010dArr2 = abstractC1010dArr;
                i10 = i3;
            }
        }
    }
}
