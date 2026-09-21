package p020c0;

/* JADX INFO: renamed from: c0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1685i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p020c0.C1715y f18257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020c0.AbstractC1709v f18258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.C1700q f18259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p194x6.m f18260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q0.D0 f18262f;
    public final java.lang.Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f18263h = new java.util.concurrent.atomic.AtomicReference(p020c0.EnumC1687j0.j);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18264i = p089k0.f.c();
    public p136q.I j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p089k0.k f18265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p020c0.A0 f18266l;

    public C1685i0(p020c0.C1715y c1715y, p020c0.AbstractC1709v abstractC1709v, p020c0.C1700q c1700q, p136q.K k9, p194x6.m mVar, boolean z6, Q0.D0 d4, java.lang.Object obj) {
        this.f18257a = c1715y;
        this.f18258b = abstractC1709v;
        this.f18259c = c1700q;
        this.f18260d = mVar;
        this.f18261e = z6;
        this.f18262f = d4;
        this.g = obj;
        p136q.I i3 = p136q.Q.f26352a;
        kotlin.jvm.internal.m.c(i3, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.j = i3;
        p089k0.k kVar = new p089k0.k();
        kVar.g(k9, c1700q.D());
        this.f18265k = kVar;
        this.f18266l = new p020c0.A0(d4.j);
    }

    public final void a() throws java.lang.Exception {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f18263h;
        try {
            switch (((p020c0.EnumC1687j0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new java.lang.IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    p020c0.EnumC1687j0 enumC1687j0 = p020c0.EnumC1687j0.f18274m;
                    p020c0.EnumC1687j0 enumC1687j1 = p020c0.EnumC1687j0.f18275n;
                    while (!atomicReference.compareAndSet(enumC1687j0, enumC1687j1)) {
                        if (atomicReference.get() != enumC1687j0) {
                            p020c0.AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new java.lang.IllegalStateException("The paused composition has already been applied");
                default:
                    throw new I3.b();
            }
        } catch (java.lang.Exception e6) {
            atomicReference.set(p020c0.EnumC1687j0.f18270h);
            throw e6;
        }
    }

    public final void b() {
        android.os.Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.f18266l.a(this.f18262f, this.f18265k);
                    this.f18265k.c();
                    this.f18265k.d();
                    this.f18265k.b();
                    this.f18257a.f18413x = null;
                } catch (java.lang.Throwable th) {
                    this.f18265k.b();
                    this.f18257a.f18413x = null;
                    throw th;
                }
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th2) {
            android.os.Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((p020c0.EnumC1687j0) this.f18263h.get()).compareTo(p020c0.EnumC1687j0.f18274m) >= 0;
    }

    public final void d() {
        boolean z6;
        p020c0.EnumC1687j0 enumC1687j0 = p020c0.EnumC1687j0.f18272k;
        p020c0.EnumC1687j0 enumC1687j1 = p020c0.EnumC1687j0.f18274m;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f18263h;
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
        p020c0.AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:47:0x00ec, B:50:0x00fb, B:51:0x00fe, B:52:0x0102, B:58:0x012a, B:60:0x0132, B:55:0x0109, B:57:0x010f, B:65:0x013d, B:66:0x0140, B:67:0x0141, B:68:0x0148, B:69:0x0149, B:70:0x0150, B:24:0x006b, B:48:0x00f1), top: B:73:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:47:0x00ec, B:50:0x00fb, B:51:0x00fe, B:52:0x0102, B:58:0x012a, B:60:0x0132, B:55:0x0109, B:57:0x010f, B:65:0x013d, B:66:0x0140, B:67:0x0141, B:68:0x0148, B:69:0x0149, B:70:0x0150, B:24:0x006b, B:48:0x00f1), top: B:73:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0132 A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:23:0x0069, B:25:0x0079, B:26:0x007f, B:32:0x00a7, B:34:0x00af, B:29:0x0086, B:31:0x008c, B:36:0x00b5, B:37:0x00bb, B:39:0x00c1, B:42:0x00c8, B:43:0x00e3, B:20:0x0048, B:22:0x004e, B:47:0x00ec, B:50:0x00fb, B:51:0x00fe, B:52:0x0102, B:58:0x012a, B:60:0x0132, B:55:0x0109, B:57:0x010f, B:65:0x013d, B:66:0x0140, B:67:0x0141, B:68:0x0148, B:69:0x0149, B:70:0x0150, B:24:0x006b, B:48:0x00f1), top: B:73:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:1: B:26:0x007f->B:83:?, LOOP_END, SYNTHETIC] */
    public final boolean e(p020c0.H0 h9) throws java.lang.Exception {
        long j;
        p020c0.EnumC1687j0 enumC1687j0;
        p020c0.EnumC1687j0 enumC1687j1;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f18263h;
        try {
            int iOrdinal = ((p020c0.EnumC1687j0) atomicReference.get()).ordinal();
            p020c0.C1715y c1715y = this.f18257a;
            p020c0.AbstractC1709v abstractC1709v = this.f18258b;
            switch (iOrdinal) {
                case 0:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                case 2:
                    p020c0.C1700q c1700q = this.f18259c;
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
                        p020c0.EnumC1687j0 enumC1687j2 = p020c0.EnumC1687j0.j;
                        p020c0.EnumC1687j0 enumC1687j3 = p020c0.EnumC1687j0.f18272k;
                        while (!atomicReference.compareAndSet(enumC1687j2, enumC1687j3)) {
                            if (atomicReference.get() != enumC1687j2) {
                                p020c0.AbstractC1693m0.b("Unexpected state change from: " + enumC1687j2 + " to: " + enumC1687j3 + '.');
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
                    } catch (java.lang.Throwable th) {
                        if (z6) {
                            c1700q.v();
                        }
                        throw th;
                    }
                case 3:
                    p020c0.EnumC1687j0 enumC1687j4 = p020c0.EnumC1687j0.f18272k;
                    p020c0.EnumC1687j0 enumC1687j5 = p020c0.EnumC1687j0.f18273l;
                    try {
                        while (!atomicReference.compareAndSet(enumC1687j4, enumC1687j5)) {
                            if (atomicReference.get() != enumC1687j4) {
                                p020c0.AbstractC1693m0.b("Unexpected state change from: " + enumC1687j4 + " to: " + enumC1687j5 + '.');
                                j = this.f18264i;
                                this.f18264i = p089k0.f.c();
                                this.j = abstractC1709v.n(c1715y, h9, this.j);
                                this.f18264i = j;
                                enumC1687j0 = p020c0.EnumC1687j0.f18273l;
                                enumC1687j1 = p020c0.EnumC1687j0.f18272k;
                                while (!atomicReference.compareAndSet(enumC1687j0, enumC1687j1)) {
                                    if (atomicReference.get() != enumC1687j0) {
                                        p020c0.AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
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
                        this.f18264i = p089k0.f.c();
                        this.j = abstractC1709v.n(c1715y, h9, this.j);
                        this.f18264i = j;
                        enumC1687j0 = p020c0.EnumC1687j0.f18273l;
                        enumC1687j1 = p020c0.EnumC1687j0.f18272k;
                        while (!atomicReference.compareAndSet(enumC1687j0, enumC1687j1)) {
                            if (atomicReference.get() != enumC1687j0) {
                                p020c0.AbstractC1693m0.b("Unexpected state change from: " + enumC1687j0 + " to: " + enumC1687j1 + '.');
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
                    } catch (java.lang.Throwable th2) {
                        this.f18264i = j;
                        p020c0.EnumC1687j0 enumC1687j6 = p020c0.EnumC1687j0.f18273l;
                        p020c0.EnumC1687j0 enumC1687j7 = p020c0.EnumC1687j0.f18272k;
                        while (!atomicReference.compareAndSet(enumC1687j6, enumC1687j7)) {
                            if (atomicReference.get() != enumC1687j6) {
                                p020c0.AbstractC1693m0.b("Unexpected state change from: " + enumC1687j6 + " to: " + enumC1687j7 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.f18264i;
                case 4:
                    p020c0.AbstractC1705t.b("Recursive call to resume()");
                    throw new I3.b();
                case 5:
                    throw new java.lang.IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new java.lang.IllegalStateException("The paused composition has been applied");
                default:
                    throw new I3.b();
            }
        } catch (java.lang.Exception e6) {
            atomicReference.set(p020c0.EnumC1687j0.f18270h);
            throw e6;
        }
    }
}
