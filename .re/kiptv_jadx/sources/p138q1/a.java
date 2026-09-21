package p138q1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f26497i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f26496h = i3;
        this.f26497i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        switch (this.f26496h) {
            case 0:
                ((p138q1.i) this.f26497i).invoke();
                return;
            case 1:
                ((p138q1.i) this.f26497i).invoke();
                return;
            default:
                s0.f fVar = (s0.f) this.f26497i;
                boolean zF = fVar.f();
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = fVar.f27204h;
                if (zF) {
                    android.os.Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView.t(true);
                        p136q.w wVar = fVar.f27214s;
                        int[] iArr = wVar.f26398b;
                        long[] jArr = wVar.f26397a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            while (true) {
                                long j = jArr[i9];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        if ((255 & j) < 128) {
                                            int i12 = iArr[(i9 << 3) + i11];
                                            if (!fVar.e().a(i12)) {
                                                fVar.f27206k.add(new s0.g(i12, fVar.f27213r, s0.h.f27223i, null));
                                                fVar.f27210o.mo3trySendJP2dKIU(p070h6.A.f22523a);
                                            }
                                        }
                                        j >>= 8;
                                        i11++;
                                        i9 = i9;
                                    }
                                    int i13 = i9;
                                    if (i10 == 8) {
                                        i3 = i13;
                                    }
                                } else {
                                    i3 = i9;
                                }
                                if (i3 != length) {
                                    i9 = i3 + 1;
                                }
                            }
                        }
                        android.os.Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            fVar.h(androidComposeView.getSemanticsOwner().a(), fVar.f27215t);
                            android.os.Trace.endSection();
                            fVar.c(fVar.e());
                            fVar.l();
                            fVar.f27216u = false;
                            return;
                        } finally {
                            android.os.Trace.endSection();
                        }
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                }
                return;
        }
    }
}
