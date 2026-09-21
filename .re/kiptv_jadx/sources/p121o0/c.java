package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p121o0.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p121o0.b f25970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25971p;

    public c(long j, p121o0.j jVar, p194x6.j jVar2, p194x6.j jVar3, p121o0.b bVar) {
        super(j, jVar, jVar2, jVar3);
        this.f25970o = bVar;
        bVar.k();
    }

    @Override // p121o0.b, p121o0.f
    public final void c() {
        if (this.f25978c) {
            return;
        }
        super.c();
        if (this.f25971p) {
            return;
        }
        this.f25971p = true;
        this.f25970o.l();
    }

    @Override // p121o0.b
    public final p121o0.o w() throws java.lang.Throwable {
        p121o0.c cVar;
        p121o0.b bVar = this.f25970o;
        if (bVar.f25969m || bVar.f25978c) {
            return new p121o0.g(this);
        }
        p136q.I i3 = this.f25965h;
        long j = this.f25977b;
        java.util.HashMap mapB = i3 != null ? p121o0.k.b(bVar.g(), this, this.f25970o.d()) : null;
        java.lang.Object obj = p121o0.k.f25993c;
        synchronized (obj) {
            try {
                p121o0.k.c(this);
                try {
                    if (i3 == null || i3.f26331d == 0) {
                        cVar = this;
                        a();
                    } else {
                        cVar = this;
                        p121o0.o oVarZ = cVar.z(this.f25970o.g(), i3, mapB, this.f25970o.d());
                        if (!oVarZ.equals(p121o0.h.f25981b)) {
                            return oVarZ;
                        }
                        p136q.I iX = cVar.f25970o.x();
                        if (iX != null) {
                            iX.k(i3);
                        } else {
                            cVar.f25970o.B(i3);
                            cVar.f25965h = null;
                        }
                    }
                    if (kotlin.jvm.internal.m.g(cVar.f25970o.g(), j) < 0) {
                        cVar.f25970o.v();
                    }
                    p121o0.b bVar2 = cVar.f25970o;
                    bVar2.r(bVar2.d().e(j).d(cVar.j));
                    cVar.f25970o.A(j);
                    p121o0.b bVar3 = cVar.f25970o;
                    int i9 = cVar.f25979d;
                    cVar.f25979d = -1;
                    if (i9 >= 0) {
                        int[] iArr = bVar3.f25967k;
                        kotlin.jvm.internal.m.e(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i9;
                        bVar3.f25967k = iArrCopyOf;
                    } else {
                        bVar3.getClass();
                    }
                    p121o0.b bVar4 = cVar.f25970o;
                    p121o0.j jVar = cVar.j;
                    bVar4.getClass();
                    synchronized (obj) {
                        bVar4.j = bVar4.j.o(jVar);
                        p121o0.b bVar5 = cVar.f25970o;
                        int[] iArr2 = cVar.f25967k;
                        bVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = bVar5.f25967k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr3, length2 + length3);
                                java.lang.System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                                kotlin.jvm.internal.m.b(iArrCopyOf2);
                                iArr2 = iArrCopyOf2;
                            }
                            bVar5.f25967k = iArr2;
                        }
                    }
                    cVar.f25969m = true;
                    if (!cVar.f25971p) {
                        cVar.f25971p = true;
                        cVar.f25970o.l();
                    }
                    return p121o0.h.f25981b;
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }
}
