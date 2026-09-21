package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.logging.Logger f2603m = java.util.logging.Logger.getLogger(D8.f.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.D f2604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M8.C0682j f2605i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D8.d f2607l;

    public w(M8.D sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f2604h = sink;
        M8.C0682j c0682j = new M8.C0682j();
        this.f2605i = c0682j;
        this.j = 16384;
        this.f2607l = new D8.d(c0682j);
    }

    public final synchronized void b(D8.A peerSettings) {
        try {
            kotlin.jvm.internal.m.e(peerSettings, "peerSettings");
            if (this.f2606k) {
                throw new java.io.IOException("closed");
            }
            int i3 = this.j;
            int i9 = peerSettings.f2500a;
            if ((i9 & 32) != 0) {
                i3 = peerSettings.f2501b[5];
            }
            this.j = i3;
            if (((i9 & 2) != 0 ? peerSettings.f2501b[1] : -1) != -1) {
                D8.d dVar = this.f2607l;
                int i10 = (i9 & 2) != 0 ? peerSettings.f2501b[1] : -1;
                dVar.getClass();
                int iMin = java.lang.Math.min(i10, 16384);
                int i11 = dVar.f2520d;
                if (i11 != iMin) {
                    if (iMin < i11) {
                        dVar.f2518b = java.lang.Math.min(dVar.f2518b, iMin);
                    }
                    dVar.f2519c = true;
                    dVar.f2520d = iMin;
                    int i12 = dVar.f2523h;
                    if (iMin < i12) {
                        if (iMin == 0) {
                            D8.C0273b[] c0273bArr = dVar.f2521e;
                            p078i6.m.h0(c0273bArr, null, 0, c0273bArr.length);
                            dVar.f2522f = dVar.f2521e.length - 1;
                            dVar.g = 0;
                            dVar.f2523h = 0;
                        } else {
                            dVar.a(i12 - iMin);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f2604h.flush();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f2606k = true;
        this.f2604h.close();
    }

    public final synchronized void e(boolean z6, int i3, M8.C0682j c0682j, int i9) {
        if (this.f2606k) {
            throw new java.io.IOException("closed");
        }
        i(i3, i9, 0, z6 ? 1 : 0);
        if (i9 > 0) {
            kotlin.jvm.internal.m.b(c0682j);
            this.f2604h.J(i9, c0682j);
        }
    }

    public final synchronized void flush() {
        if (this.f2606k) {
            throw new java.io.IOException("closed");
        }
        this.f2604h.flush();
    }

    public final void i(int i3, int i9, int i10, int i11) {
        java.util.logging.Level level = java.util.logging.Level.FINE;
        java.util.logging.Logger logger = f2603m;
        if (logger.isLoggable(level)) {
            logger.fine(D8.f.a(i3, i9, false, i10, i11));
        }
        if (i9 > this.j) {
            throw new java.lang.IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.j + ": " + i9).toString());
        }
        if ((Integer.MIN_VALUE & i3) != 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "reserved bit set: ").toString());
        }
        byte[] bArr = x8.b.f31716a;
        M8.D d4 = this.f2604h;
        kotlin.jvm.internal.m.e(d4, "<this>");
        d4.p((i9 >>> 16) & 255);
        d4.p((i9 >>> 8) & 255);
        d4.p(i9 & 255);
        d4.p(i10 & 255);
        d4.p(i11 & 255);
        d4.j(i3 & androidx.media3.common.util.Log.LOG_LEVEL_OFF);
    }

    public final synchronized void j(byte[] bArr, int i3, int i9) {
        com.google.android.gms.internal.play_billing.M0.s(i9, "errorCode");
        if (this.f2606k) {
            throw new java.io.IOException("closed");
        }
        if (Z.AbstractC1149h0.c(i9) == -1) {
            throw new java.lang.IllegalArgumentException("errorCode.httpCode == -1");
        }
        i(0, bArr.length + 8, 7, 0);
        this.f2604h.j(i3);
        this.f2604h.j(Z.AbstractC1149h0.c(i9));
        if (bArr.length != 0) {
            M8.D d4 = this.f2604h;
            if (d4.j) {
                throw new java.lang.IllegalStateException("closed");
            }
            d4.f7216i.Y(bArr);
            d4.b();
        }
        this.f2604h.flush();
    }

    public final synchronized void t(boolean z6, int i3, java.util.ArrayList arrayList) {
        if (this.f2606k) {
            throw new java.io.IOException("closed");
        }
        this.f2607l.d(arrayList);
        long j = this.f2605i.f7260i;
        long jMin = java.lang.Math.min(this.j, j);
        int i9 = j == jMin ? 4 : 0;
        if (z6) {
            i9 |= 1;
        }
        i(i3, (int) jMin, 1, i9);
        this.f2604h.J(jMin, this.f2605i);
        if (j > jMin) {
            long j9 = j - jMin;
            while (j9 > 0) {
                long jMin2 = java.lang.Math.min(this.j, j9);
                j9 -= jMin2;
                i(i3, (int) jMin2, 9, j9 == 0 ? 4 : 0);
                this.f2604h.J(jMin2, this.f2605i);
            }
        }
    }

    public final synchronized void u(int i3, int i9, boolean z6) {
        if (this.f2606k) {
            throw new java.io.IOException("closed");
        }
        i(0, 8, 6, z6 ? 1 : 0);
        this.f2604h.j(i3);
        this.f2604h.j(i9);
        this.f2604h.flush();
    }

    public final synchronized void v(int i3, int i9) {
        com.google.android.gms.internal.play_billing.M0.s(i9, "errorCode");
        if (this.f2606k) {
            throw new java.io.IOException("closed");
        }
        if (Z.AbstractC1149h0.c(i9) == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        i(i3, 4, 3, 0);
        this.f2604h.j(Z.AbstractC1149h0.c(i9));
        this.f2604h.flush();
    }

    public final synchronized void z(int i3, long j) {
        if (this.f2606k) {
            throw new java.io.IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        i(i3, 4, 8, 0);
        this.f2604h.j((int) j);
        this.f2604h.flush();
    }
}
