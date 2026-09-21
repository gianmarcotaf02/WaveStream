package S;

import B.K;
import C5.C0132n0;
import D1.C0;
import J.M;
import J.X;
import J.y0;
import O0.InterfaceC0732v;
import R0.V0;
import U.i0;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.google.common.util.concurrent.AbstractC1903s;
import g1.C2148a;
import g1.C2152e;
import g1.C2153f;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.videolan.libvlc.MediaPlayer;
import p011b1.C1650g;
import p011b1.C1658o;
import p011b1.D;
import p011b1.H;
import p011b1.I;
import p011b1.J;
import p011b1.L;
import p188x0.z;

public final class y implements InputConnection {

    public final p166t3.i f9190a;

    public final boolean f9191b;

    public final X f9192c;

    public final i0 f9193d;

    public final V0 f9194e;

    public int f9195f;
    public g1.x g;

    public int f9196h;

    public boolean f9197i;
    public final ArrayList j = new ArrayList();

    public boolean f9198k = true;

    public y(g1.x xVar, p166t3.i iVar, boolean z6, X x9, i0 i0Var, V0 v6) {
        this.f9190a = iVar;
        this.f9191b = z6;
        this.f9192c = x9;
        this.f9193d = i0Var;
        this.f9194e = v6;
        this.g = xVar;
    }

    public final void a(g1.g gVar) {
        this.f9195f++;
        try {
            this.j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i3 = this.f9195f - 1;
        this.f9195f = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((x) this.f9190a.f27782i).f9181c.invoke(p078i6.o.O1(arrayList));
                arrayList.clear();
            }
        }
        return this.f9195f > 0;
    }

    @Override
    public final boolean beginBatchEdit() {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        this.f9195f++;
        return true;
    }

    public final void c(int i3) {
        sendKeyEvent(new KeyEvent(0, i3));
        sendKeyEvent(new KeyEvent(1, i3));
    }

    @Override
    public final boolean clearMetaKeyStates(int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override
    public final void closeConnection() {
        this.j.clear();
        this.f9195f = 0;
        this.f9198k = false;
        x xVar = (x) this.f9190a.f27782i;
        int size = xVar.j.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = xVar.j;
            if (kotlin.jvm.internal.m.a(((WeakReference) arrayList.get(i3)).get(), this)) {
                arrayList.remove(i3);
                return;
            }
        }
    }

    @Override
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z6 = this.f9198k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        boolean z6 = this.f9198k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z6 = this.f9198k;
        return z6 ? this.f9191b : z6;
    }

    @Override
    public final boolean commitText(CharSequence charSequence, int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            a(new C2148a(String.valueOf(charSequence), i3));
        }
        return z6;
    }

    @Override
    public final boolean deleteSurroundingText(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new C2152e(i3, i9));
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new C2153f(i3, i9));
        return true;
    }

    @Override
    public final boolean endBatchEdit() {
        return b();
    }

    @Override
    public final boolean finishComposingText() {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new g1.i());
        return true;
    }

    @Override
    public final int getCursorCapsMode(int i3) {
        g1.x xVar = this.g;
        return TextUtils.getCapsMode(xVar.f21847a.f17809i, L.f(xVar.f21848b), i3);
    }

    @Override
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        boolean z6 = (i3 & 1) != 0;
        this.f9197i = z6;
        if (z6) {
            this.f9196h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return t.d(this.g);
    }

    @Override
    public final Handler getHandler() {
        return null;
    }

    @Override
    public final CharSequence getSelectedText(int i3) {
        if (L.c(this.g.f21848b)) {
            return null;
        }
        return AbstractC1903s.A(this.g).f17809i;
    }

    @Override
    public final CharSequence getTextAfterCursor(int i3, int i9) {
        return AbstractC1903s.B(this.g, i3).f17809i;
    }

    @Override
    public final CharSequence getTextBeforeCursor(int i3, int i9) {
        return AbstractC1903s.C(this.g, i3).f17809i;
    }

    @Override
    public final boolean performContextMenuAction(int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            z6 = false;
            switch (i3) {
                case R.id.selectAll:
                    a(new g1.w(0, this.g.f21847a.f17809i.length()));
                    break;
                case R.id.cut:
                    c(MediaPlayer.Event.ESDeleted);
                    return false;
                case R.id.copy:
                    c(MediaPlayer.Event.ESSelected);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z6;
    }

    @Override
    public final boolean performEditorAction(int i3) {
        int i9;
        boolean z6 = this.f9198k;
        if (z6) {
            z6 = true;
            if (i3 != 0) {
                switch (i3) {
                    case 2:
                        i9 = 2;
                        break;
                    case 3:
                        i9 = 3;
                        break;
                    case 4:
                        i9 = 4;
                        break;
                    case 5:
                        i9 = 6;
                        break;
                    case 6:
                        i9 = 7;
                        break;
                    case 7:
                        i9 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i3);
                        i9 = 1;
                        break;
                }
            } else {
                i9 = 1;
            }
            ((x) this.f9190a.f27782i).f9182d.invoke(new g1.j(i9));
        }
        return z6;
    }

    @Override
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        long jH;
        int i3;
        int iA;
        y0 y0VarD;
        int iA2;
        y0 y0VarD2;
        I i9;
        int i10 = 21;
        int iG = 2;
        if (Build.VERSION.SDK_INT >= 34) {
            C0132n0 c0132n0 = new C0132n0(i10, this);
            X x9 = this.f9192c;
            int i11 = 3;
            if (x9 != null) {
                C1650g c1650g = x9.j;
                if (c1650g == null) {
                    iG = 3;
                } else {
                    y0 y0VarD3 = x9.d();
                    if (c1650g.equals((y0VarD3 == null || (i9 = y0VarD3.f5963a.f17772a) == null) ? null : i9.f17764a)) {
                        boolean zS = C0.s(handwritingGesture);
                        i0 i0Var = this.f9193d;
                        if (zS) {
                            SelectGesture selectGestureM = C0.m(handwritingGesture);
                            long jI = t.i(x9, z.K(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                            if (L.c(jI)) {
                                iG = t.g(m.l(selectGestureM), c0132n0);
                            } else {
                                c0132n0.invoke(new g1.w((int) (jI >> 32), (int) (jI & 4294967295L)));
                                if (i0Var != null) {
                                    i0Var.h(true);
                                }
                                iG = 1;
                            }
                        } else if (m.w(handwritingGesture)) {
                            DeleteGesture deleteGestureJ = m.j(handwritingGesture);
                            int i12 = deleteGestureJ.getGranularity() != 1 ? 0 : 1;
                            long jI2 = t.i(x9, z.K(deleteGestureJ.getDeletionArea()), i12);
                            if (L.c(jI2)) {
                                iG = t.g(m.l(deleteGestureJ), c0132n0);
                            } else {
                                t.n(jI2, c1650g, i12 == 1, c0132n0);
                                iG = 1;
                            }
                        } else if (m.C(handwritingGesture)) {
                            SelectRangeGesture selectRangeGestureN = m.n(handwritingGesture);
                            long jB = t.b(x9, z.K(selectRangeGestureN.getSelectionStartArea()), z.K(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() != 1 ? 0 : 1);
                            if (L.c(jB)) {
                                iG = t.g(m.l(selectRangeGestureN), c0132n0);
                            } else {
                                c0132n0.invoke(new g1.w((int) (jB >> 32), (int) (jB & 4294967295L)));
                                if (i0Var != null) {
                                    i0Var.h(true);
                                }
                                iG = 1;
                            }
                        } else if (m.D(handwritingGesture)) {
                            DeleteRangeGesture deleteRangeGestureK = m.k(handwritingGesture);
                            int i13 = deleteRangeGestureK.getGranularity() != 1 ? 0 : 1;
                            long jB2 = t.b(x9, z.K(deleteRangeGestureK.getDeletionStartArea()), z.K(deleteRangeGestureK.getDeletionEndArea()), i13);
                            if (L.c(jB2)) {
                                iG = t.g(m.l(deleteRangeGestureK), c0132n0);
                            } else {
                                t.n(jB2, c1650g, i13 == 1, c0132n0);
                                iG = 1;
                            }
                        } else {
                            boolean zA = C0.A(handwritingGesture);
                            V0 v6 = this.f9194e;
                            if (zA) {
                                JoinOrSplitGesture joinOrSplitGestureM = m.m(handwritingGesture);
                                if (v6 == null || (iA2 = t.a(x9, t.e(joinOrSplitGestureM.getJoinOrSplitPoint()), v6)) == -1 || ((y0VarD2 = x9.d()) != null && t.c(y0VarD2.f5963a, iA2))) {
                                    iG = t.g(m.l(joinOrSplitGestureM), c0132n0);
                                } else {
                                    int iCharCount = iA2;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(c1650g, iCharCount);
                                        if (!t.k(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iA2 < c1650g.f17809i.length()) {
                                        int iCodePointAt = Character.codePointAt(c1650g, iA2);
                                        if (!t.k(iCodePointAt)) {
                                            break;
                                        } else {
                                            iA2 += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jB3 = D.b(iCharCount, iA2);
                                    if (L.c(jB3)) {
                                        int i14 = (int) (jB3 >> 32);
                                        c0132n0.invoke(new o(new g1.g[]{new g1.w(i14, i14), new C2148a(ServerSentEventKt.SPACE, 1)}));
                                    } else {
                                        t.n(jB3, c1650g, false, c0132n0);
                                    }
                                    iG = 1;
                                }
                            } else if (C0.w(handwritingGesture)) {
                                InsertGesture insertGestureK = C0.k(handwritingGesture);
                                if (v6 == null || (iA = t.a(x9, t.e(insertGestureK.getInsertionPoint()), v6)) == -1 || ((y0VarD = x9.d()) != null && t.c(y0VarD.f5963a, iA))) {
                                    iG = t.g(m.l(insertGestureK), c0132n0);
                                } else {
                                    c0132n0.invoke(new o(new g1.g[]{new g1.w(iA, iA), new C2148a(insertGestureK.getTextToInsert(), 1)}));
                                    iG = 1;
                                }
                            } else if (C0.y(handwritingGesture)) {
                                RemoveSpaceGesture removeSpaceGestureL = C0.l(handwritingGesture);
                                y0 y0VarD4 = x9.d();
                                J j = y0VarD4 != null ? y0VarD4.f5963a : null;
                                long jE = t.e(removeSpaceGestureL.getStartPoint());
                                long jE2 = t.e(removeSpaceGestureL.getEndPoint());
                                InterfaceC0732v interfaceC0732vC = x9.c();
                                if (j == null || interfaceC0732vC == null) {
                                    jH = L.f17782b;
                                } else {
                                    long jM = interfaceC0732vC.M(jE);
                                    long jM2 = interfaceC0732vC.M(jE2);
                                    C1658o c1658o = j.f17773b;
                                    int iH = t.h(c1658o, jM, v6);
                                    int iH2 = t.h(c1658o, jM2, v6);
                                    if (iH != -1) {
                                        if (iH2 != -1) {
                                            iH = Math.min(iH, iH2);
                                        }
                                        iH2 = iH;
                                    } else if (iH2 == -1) {
                                        jH = L.f17782b;
                                    }
                                    float fB = (c1658o.b(iH2) + c1658o.f(iH2)) / 2;
                                    int i15 = (int) (jM >> 32);
                                    int i16 = (int) (jM2 >> 32);
                                    jH = c1658o.h(new p181w0.b(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fB - 0.1f, Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fB + 0.1f), 0, H.f17762a);
                                }
                                if (L.c(jH)) {
                                    iG = t.g(m.l(removeSpaceGestureL), c0132n0);
                                } else {
                                    kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                    yVar.f24555h = -1;
                                    kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                                    yVar2.f24555h = -1;
                                    String strF = new O7.o("\\s+").f(c1650g.subSequence(L.f(jH), L.e(jH)).f17809i, new K(yVar, yVar2, 21));
                                    int i17 = yVar.f24555h;
                                    if (i17 == -1 || (i3 = yVar2.f24555h) == -1) {
                                        iG = t.g(m.l(removeSpaceGestureL), c0132n0);
                                    } else {
                                        int i18 = (int) (jH >> 32);
                                        String strSubstring = strF.substring(i17, strF.length() - (L.d(jH) - yVar2.f24555h));
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        c0132n0.invoke(new o(new g1.g[]{new g1.w(i18 + i17, i18 + i3), new C2148a(strSubstring, 1)}));
                                        iG = 1;
                                    }
                                }
                            }
                        }
                    } else {
                        iG = 3;
                    }
                }
                i11 = iG;
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new e(intConsumer, i11, 0));
            } else {
                intConsumer.accept(i11);
            }
        }
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z6 = this.f9198k;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        X x9;
        C1650g c1650g;
        I i3;
        if (Build.VERSION.SDK_INT >= 34 && (x9 = this.f9192c) != null && (c1650g = x9.j) != null) {
            y0 y0VarD = x9.d();
            if (c1650g.equals((y0VarD == null || (i3 = y0VarD.f5963a.f17772a) == null) ? null : i3.f17764a)) {
                boolean zS = C0.s(previewableHandwritingGesture);
                i0 i0Var = this.f9193d;
                if (zS) {
                    SelectGesture selectGestureM = C0.m(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jI = t.i(x9, z.K(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                        X x10 = i0Var.f10012d;
                        if (x10 != null) {
                            x10.f(jI);
                        }
                        X x11 = i0Var.f10012d;
                        if (x11 != null) {
                            x11.e(L.f17782b);
                        }
                        if (!L.c(jI)) {
                            i0Var.t(false);
                            i0Var.q(M.f5654h);
                        }
                    }
                } else if (m.w(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureJ = m.j(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jI2 = t.i(x9, z.K(deleteGestureJ.getDeletionArea()), deleteGestureJ.getGranularity() != 1 ? 0 : 1);
                        X x12 = i0Var.f10012d;
                        if (x12 != null) {
                            x12.e(jI2);
                        }
                        X x13 = i0Var.f10012d;
                        if (x13 != null) {
                            x13.f(L.f17782b);
                        }
                        if (!L.c(jI2)) {
                            i0Var.t(false);
                            i0Var.q(M.f5654h);
                        }
                    }
                } else if (m.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureN = m.n(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jB = t.b(x9, z.K(selectRangeGestureN.getSelectionStartArea()), z.K(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() != 1 ? 0 : 1);
                        X x14 = i0Var.f10012d;
                        if (x14 != null) {
                            x14.f(jB);
                        }
                        X x15 = i0Var.f10012d;
                        if (x15 != null) {
                            x15.e(L.f17782b);
                        }
                        if (!L.c(jB)) {
                            i0Var.t(false);
                            i0Var.q(M.f5654h);
                        }
                    }
                } else if (m.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureK = m.k(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jB2 = t.b(x9, z.K(deleteRangeGestureK.getDeletionStartArea()), z.K(deleteRangeGestureK.getDeletionEndArea()), deleteRangeGestureK.getGranularity() != 1 ? 0 : 1);
                        X x16 = i0Var.f10012d;
                        if (x16 != null) {
                            x16.e(jB2);
                        }
                        X x17 = i0Var.f10012d;
                        if (x17 != null) {
                            x17.f(L.f17782b);
                        }
                        if (!L.c(jB2)) {
                            i0Var.t(false);
                            i0Var.q(M.f5654h);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new n(0, i0Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override
    public final boolean requestCursorUpdates(int i3) {
        boolean z6;
        boolean z9;
        boolean z10;
        boolean z11 = this.f9198k;
        if (!z11) {
            return z11;
        }
        boolean z12 = false;
        boolean z13 = (i3 & 1) != 0;
        boolean z14 = (i3 & 2) != 0;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            z6 = (i3 & 16) != 0;
            z9 = (i3 & 8) != 0;
            boolean z15 = (i3 & 4) != 0;
            if (i9 >= 34 && (i3 & 32) != 0) {
                z12 = true;
            }
            if (z6 || z9 || z15 || z12) {
                z10 = z12;
                z12 = z15;
            } else if (i9 >= 34) {
                z10 = true;
                z12 = true;
                z6 = true;
                z9 = true;
            } else {
                z6 = true;
                z9 = true;
                z10 = z12;
                z12 = true;
            }
        } else {
            z6 = true;
            z9 = true;
            z10 = false;
        }
        u uVar = ((x) this.f9190a.f27782i).f9189m;
        synchronized (uVar.f9164c) {
            try {
                uVar.f9167f = z6;
                uVar.g = z9;
                uVar.f9168h = z12;
                uVar.f9169i = z10;
                if (z13) {
                    uVar.f9166e = true;
                    if (uVar.j != null) {
                        uVar.a();
                    }
                }
                uVar.f9165d = z14;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        ((BaseInputConnection) ((x) this.f9190a.f27782i).f9187k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override
    public final boolean setComposingRegion(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (z6) {
            a(new g1.u(i3, i9));
        }
        return z6;
    }

    @Override
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            a(new g1.v(String.valueOf(charSequence), i3));
        }
        return z6;
    }

    @Override
    public final boolean setSelection(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new g1.w(i3, i9));
        return true;
    }
}
