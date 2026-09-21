package R0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.jvm.functions.Function0;
import p136q.AbstractC2668l;

public final class H implements ViewTranslationCallback {

    public static final H f8787a = new H();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        s0.f contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f27208m = s0.a.f27196h;
        AbstractC2668l abstractC2668lE = contentCaptureManager.e();
        Object[] objArr = abstractC2668lE.f26399c;
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
                        SemanticsConfiguration semanticsConfiguration = ((Y0.q) objArr[(i3 << 3) + i10]).f11097a.f11094d;
                        Y0.w wVar = Y0.t.f11107D;
                        p136q.H h9 = semanticsConfiguration.f15960h;
                        Object objG = h9.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = h9.g(Y0.l.f11075n);
                            Y0.a aVar = (Y0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (function0 = (Function0) aVar.f11025b) != null) {
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

    public final boolean onHideTranslation(View view) {
        p194x6.j jVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        s0.f contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f27208m = s0.a.f27196h;
        AbstractC2668l abstractC2668lE = contentCaptureManager.e();
        Object[] objArr = abstractC2668lE.f26399c;
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
                        SemanticsConfiguration semanticsConfiguration = ((Y0.q) objArr[(i3 << 3) + i10]).f11097a.f11094d;
                        Y0.w wVar = Y0.t.f11107D;
                        p136q.H h9 = semanticsConfiguration.f15960h;
                        Object objG = h9.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.TRUE)) {
                            Object objG2 = h9.g(Y0.l.f11074m);
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

    public final boolean onShowTranslation(View view) {
        p194x6.j jVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        s0.f contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f27208m = s0.a.f27197i;
        AbstractC2668l abstractC2668lE = contentCaptureManager.e();
        Object[] objArr = abstractC2668lE.f26399c;
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
                        SemanticsConfiguration semanticsConfiguration = ((Y0.q) objArr[(i3 << 3) + i10]).f11097a.f11094d;
                        Y0.w wVar = Y0.t.f11107D;
                        p136q.H h9 = semanticsConfiguration.f15960h;
                        Object objG = h9.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.FALSE)) {
                            Object objG2 = h9.g(Y0.l.f11074m);
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
