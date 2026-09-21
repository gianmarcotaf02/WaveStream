package R0;

/* JADX INFO: loaded from: classes.dex */
public final class H implements android.view.translation.ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R0.H f8787a = new R0.H();

    public final boolean onClearTranslation(android.view.View view) {
        kotlin.jvm.functions.Function0 function0;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        s0.f contentCaptureManager = ((androidx.compose.ui.platform.AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f27208m = s0.a.f27196h;
        p136q.AbstractC2668l abstractC2668lE = contentCaptureManager.e();
        java.lang.Object[] objArr = abstractC2668lE.f26399c;
        long[] jArr = abstractC2668lE.f26397a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = ((Y0.q) objArr[(i3 << 3) + i10]).f11097a.f11094d;
                        Y0.w wVar = Y0.t.f11107D;
                        p136q.H h9 = semanticsConfiguration.f15960h;
                        java.lang.Object objG = h9.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            java.lang.Object objG2 = h9.g(Y0.l.f11075n);
                            Y0.a aVar = (Y0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (function0 = (kotlin.jvm.functions.Function0) aVar.f11025b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }

    public final boolean onHideTranslation(android.view.View view) {
        p194x6.j jVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        s0.f contentCaptureManager = ((androidx.compose.ui.platform.AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f27208m = s0.a.f27196h;
        p136q.AbstractC2668l abstractC2668lE = contentCaptureManager.e();
        java.lang.Object[] objArr = abstractC2668lE.f26399c;
        long[] jArr = abstractC2668lE.f26397a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = ((Y0.q) objArr[(i3 << 3) + i10]).f11097a.f11094d;
                        Y0.w wVar = Y0.t.f11107D;
                        p136q.H h9 = semanticsConfiguration.f15960h;
                        java.lang.Object objG = h9.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, java.lang.Boolean.TRUE)) {
                            java.lang.Object objG2 = h9.g(Y0.l.f11074m);
                            Y0.a aVar = (Y0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (jVar = (p194x6.j) aVar.f11025b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }

    public final boolean onShowTranslation(android.view.View view) {
        p194x6.j jVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        s0.f contentCaptureManager = ((androidx.compose.ui.platform.AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f27208m = s0.a.f27197i;
        p136q.AbstractC2668l abstractC2668lE = contentCaptureManager.e();
        java.lang.Object[] objArr = abstractC2668lE.f26399c;
        long[] jArr = abstractC2668lE.f26397a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = ((Y0.q) objArr[(i3 << 3) + i10]).f11097a.f11094d;
                        Y0.w wVar = Y0.t.f11107D;
                        p136q.H h9 = semanticsConfiguration.f15960h;
                        java.lang.Object objG = h9.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, java.lang.Boolean.FALSE)) {
                            java.lang.Object objG2 = h9.g(Y0.l.f11074m);
                            Y0.a aVar = (Y0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (jVar = (p194x6.j) aVar.f11025b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }
}
