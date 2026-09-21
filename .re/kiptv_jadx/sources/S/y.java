package S;

/* JADX INFO: loaded from: classes.dex */
public final class y implements android.view.inputmethod.InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p166t3.i f9190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J.X f9192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U.i0 f9193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R0.V0 f9194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9195f;
    public g1.x g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9197i;
    public final java.util.ArrayList j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9198k = true;

    public y(g1.x xVar, p166t3.i iVar, boolean z6, J.X x9, U.i0 i0Var, R0.V0 v6) {
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
            java.util.ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((S.x) this.f9190a.f27782i).f9181c.invoke(p078i6.o.O1(arrayList));
                arrayList.clear();
            }
        }
        return this.f9195f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        this.f9195f++;
        return true;
    }

    public final void c(int i3) {
        sendKeyEvent(new android.view.KeyEvent(0, i3));
        sendKeyEvent(new android.view.KeyEvent(1, i3));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f9195f = 0;
        this.f9198k = false;
        S.x xVar = (S.x) this.f9190a.f27782i;
        int size = xVar.j.size();
        for (int i3 = 0; i3 < size; i3++) {
            java.util.ArrayList arrayList = xVar.j;
            if (kotlin.jvm.internal.m.a(((java.lang.ref.WeakReference) arrayList.get(i3)).get(), this)) {
                arrayList.remove(i3);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        boolean z6 = this.f9198k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i3, android.os.Bundle bundle) {
        boolean z6 = this.f9198k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z6 = this.f9198k;
        return z6 ? this.f9191b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            a(new g1.C2148a(java.lang.String.valueOf(charSequence), i3));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new g1.C2152e(i3, i9));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new g1.C2153f(i3, i9));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new g1.i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i3) {
        g1.x xVar = this.g;
        return android.text.TextUtils.getCapsMode(xVar.f21847a.f17809i, p011b1.L.f(xVar.f21848b), i3);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i3) {
        boolean z6 = (i3 & 1) != 0;
        this.f9197i = z6;
        if (z6) {
            this.f9196h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return S.t.d(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i3) {
        if (p011b1.L.c(this.g.f21848b)) {
            return null;
        }
        return com.google.common.util.concurrent.AbstractC1903s.A(this.g).f17809i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i3, int i9) {
        return com.google.common.util.concurrent.AbstractC1903s.B(this.g, i3).f17809i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i3, int i9) {
        return com.google.common.util.concurrent.AbstractC1903s.C(this.g, i3).f17809i;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            z6 = false;
            switch (i3) {
                case android.R.id.selectAll:
                    a(new g1.w(0, this.g.f21847a.f17809i.length()));
                    break;
                case android.R.id.cut:
                    c(org.videolan.libvlc.MediaPlayer.Event.ESDeleted);
                    return false;
                case android.R.id.copy:
                    c(org.videolan.libvlc.MediaPlayer.Event.ESSelected);
                    return false;
                case android.R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
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
                        android.util.Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i3);
                        i9 = 1;
                        break;
                }
            } else {
                i9 = 1;
            }
            ((S.x) this.f9190a.f27782i).f9182d.invoke(new g1.j(i9));
        }
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        long jH;
        int i3;
        int iA;
        J.y0 y0VarD;
        int iA2;
        J.y0 y0VarD2;
        p011b1.I i9;
        int i10 = 21;
        int iG = 2;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            C5.C0132n0 c0132n0 = new C5.C0132n0(i10, this);
            J.X x9 = this.f9192c;
            int i11 = 3;
            if (x9 != null) {
                p011b1.C1650g c1650g = x9.j;
                if (c1650g == null) {
                    iG = 3;
                } else {
                    J.y0 y0VarD3 = x9.d();
                    if (c1650g.equals((y0VarD3 == null || (i9 = y0VarD3.f5963a.f17772a) == null) ? null : i9.f17764a)) {
                        boolean zS = D1.C0.s(handwritingGesture);
                        U.i0 i0Var = this.f9193d;
                        if (zS) {
                            android.view.inputmethod.SelectGesture selectGestureM = D1.C0.m(handwritingGesture);
                            long jI = S.t.i(x9, p188x0.z.K(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                            if (p011b1.L.c(jI)) {
                                iG = S.t.g(S.m.l(selectGestureM), c0132n0);
                            } else {
                                c0132n0.invoke(new g1.w((int) (jI >> 32), (int) (jI & 4294967295L)));
                                if (i0Var != null) {
                                    i0Var.h(true);
                                }
                                iG = 1;
                            }
                        } else if (S.m.w(handwritingGesture)) {
                            android.view.inputmethod.DeleteGesture deleteGestureJ = S.m.j(handwritingGesture);
                            int i12 = deleteGestureJ.getGranularity() != 1 ? 0 : 1;
                            long jI2 = S.t.i(x9, p188x0.z.K(deleteGestureJ.getDeletionArea()), i12);
                            if (p011b1.L.c(jI2)) {
                                iG = S.t.g(S.m.l(deleteGestureJ), c0132n0);
                            } else {
                                S.t.n(jI2, c1650g, i12 == 1, c0132n0);
                                iG = 1;
                            }
                        } else if (S.m.C(handwritingGesture)) {
                            android.view.inputmethod.SelectRangeGesture selectRangeGestureN = S.m.n(handwritingGesture);
                            long jB = S.t.b(x9, p188x0.z.K(selectRangeGestureN.getSelectionStartArea()), p188x0.z.K(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() != 1 ? 0 : 1);
                            if (p011b1.L.c(jB)) {
                                iG = S.t.g(S.m.l(selectRangeGestureN), c0132n0);
                            } else {
                                c0132n0.invoke(new g1.w((int) (jB >> 32), (int) (jB & 4294967295L)));
                                if (i0Var != null) {
                                    i0Var.h(true);
                                }
                                iG = 1;
                            }
                        } else if (S.m.D(handwritingGesture)) {
                            android.view.inputmethod.DeleteRangeGesture deleteRangeGestureK = S.m.k(handwritingGesture);
                            int i13 = deleteRangeGestureK.getGranularity() != 1 ? 0 : 1;
                            long jB2 = S.t.b(x9, p188x0.z.K(deleteRangeGestureK.getDeletionStartArea()), p188x0.z.K(deleteRangeGestureK.getDeletionEndArea()), i13);
                            if (p011b1.L.c(jB2)) {
                                iG = S.t.g(S.m.l(deleteRangeGestureK), c0132n0);
                            } else {
                                S.t.n(jB2, c1650g, i13 == 1, c0132n0);
                                iG = 1;
                            }
                        } else {
                            boolean zA = D1.C0.A(handwritingGesture);
                            R0.V0 v6 = this.f9194e;
                            if (zA) {
                                android.view.inputmethod.JoinOrSplitGesture joinOrSplitGestureM = S.m.m(handwritingGesture);
                                if (v6 == null || (iA2 = S.t.a(x9, S.t.e(joinOrSplitGestureM.getJoinOrSplitPoint()), v6)) == -1 || ((y0VarD2 = x9.d()) != null && S.t.c(y0VarD2.f5963a, iA2))) {
                                    iG = S.t.g(S.m.l(joinOrSplitGestureM), c0132n0);
                                } else {
                                    int iCharCount = iA2;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = java.lang.Character.codePointBefore(c1650g, iCharCount);
                                        if (!S.t.k(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= java.lang.Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iA2 < c1650g.f17809i.length()) {
                                        int iCodePointAt = java.lang.Character.codePointAt(c1650g, iA2);
                                        if (!S.t.k(iCodePointAt)) {
                                            break;
                                        } else {
                                            iA2 += java.lang.Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jB3 = p011b1.D.b(iCharCount, iA2);
                                    if (p011b1.L.c(jB3)) {
                                        int i14 = (int) (jB3 >> 32);
                                        c0132n0.invoke(new S.o(new g1.g[]{new g1.w(i14, i14), new g1.C2148a(io.ktor.sse.ServerSentEventKt.SPACE, 1)}));
                                    } else {
                                        S.t.n(jB3, c1650g, false, c0132n0);
                                    }
                                    iG = 1;
                                }
                            } else if (D1.C0.w(handwritingGesture)) {
                                android.view.inputmethod.InsertGesture insertGestureK = D1.C0.k(handwritingGesture);
                                if (v6 == null || (iA = S.t.a(x9, S.t.e(insertGestureK.getInsertionPoint()), v6)) == -1 || ((y0VarD = x9.d()) != null && S.t.c(y0VarD.f5963a, iA))) {
                                    iG = S.t.g(S.m.l(insertGestureK), c0132n0);
                                } else {
                                    c0132n0.invoke(new S.o(new g1.g[]{new g1.w(iA, iA), new g1.C2148a(insertGestureK.getTextToInsert(), 1)}));
                                    iG = 1;
                                }
                            } else if (D1.C0.y(handwritingGesture)) {
                                android.view.inputmethod.RemoveSpaceGesture removeSpaceGestureL = D1.C0.l(handwritingGesture);
                                J.y0 y0VarD4 = x9.d();
                                p011b1.J j = y0VarD4 != null ? y0VarD4.f5963a : null;
                                long jE = S.t.e(removeSpaceGestureL.getStartPoint());
                                long jE2 = S.t.e(removeSpaceGestureL.getEndPoint());
                                O0.InterfaceC0732v interfaceC0732vC = x9.c();
                                if (j == null || interfaceC0732vC == null) {
                                    jH = p011b1.L.f17782b;
                                } else {
                                    long jM = interfaceC0732vC.M(jE);
                                    long jM2 = interfaceC0732vC.M(jE2);
                                    p011b1.C1658o c1658o = j.f17773b;
                                    int iH = S.t.h(c1658o, jM, v6);
                                    int iH2 = S.t.h(c1658o, jM2, v6);
                                    if (iH != -1) {
                                        if (iH2 != -1) {
                                            iH = java.lang.Math.min(iH, iH2);
                                        }
                                        iH2 = iH;
                                    } else if (iH2 == -1) {
                                        jH = p011b1.L.f17782b;
                                    }
                                    float fB = (c1658o.b(iH2) + c1658o.f(iH2)) / 2;
                                    int i15 = (int) (jM >> 32);
                                    int i16 = (int) (jM2 >> 32);
                                    jH = c1658o.h(new p181w0.b(java.lang.Math.min(java.lang.Float.intBitsToFloat(i15), java.lang.Float.intBitsToFloat(i16)), fB - 0.1f, java.lang.Math.max(java.lang.Float.intBitsToFloat(i15), java.lang.Float.intBitsToFloat(i16)), fB + 0.1f), 0, p011b1.H.f17762a);
                                }
                                if (p011b1.L.c(jH)) {
                                    iG = S.t.g(S.m.l(removeSpaceGestureL), c0132n0);
                                } else {
                                    kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                    yVar.f24555h = -1;
                                    kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                                    yVar2.f24555h = -1;
                                    java.lang.String strF = new O7.o("\\s+").f(c1650g.subSequence(p011b1.L.f(jH), p011b1.L.e(jH)).f17809i, new B.K(yVar, yVar2, 21));
                                    int i17 = yVar.f24555h;
                                    if (i17 == -1 || (i3 = yVar2.f24555h) == -1) {
                                        iG = S.t.g(S.m.l(removeSpaceGestureL), c0132n0);
                                    } else {
                                        int i18 = (int) (jH >> 32);
                                        java.lang.String strSubstring = strF.substring(i17, strF.length() - (p011b1.L.d(jH) - yVar2.f24555h));
                                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                        c0132n0.invoke(new S.o(new g1.g[]{new g1.w(i18 + i17, i18 + i3), new g1.C2148a(strSubstring, 1)}));
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
                executor.execute(new S.e(intConsumer, i11, 0));
            } else {
                intConsumer.accept(i11);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z6 = this.f9198k;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        J.X x9;
        p011b1.C1650g c1650g;
        p011b1.I i3;
        if (android.os.Build.VERSION.SDK_INT >= 34 && (x9 = this.f9192c) != null && (c1650g = x9.j) != null) {
            J.y0 y0VarD = x9.d();
            if (c1650g.equals((y0VarD == null || (i3 = y0VarD.f5963a.f17772a) == null) ? null : i3.f17764a)) {
                boolean zS = D1.C0.s(previewableHandwritingGesture);
                U.i0 i0Var = this.f9193d;
                if (zS) {
                    android.view.inputmethod.SelectGesture selectGestureM = D1.C0.m(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jI = S.t.i(x9, p188x0.z.K(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                        J.X x10 = i0Var.f10012d;
                        if (x10 != null) {
                            x10.f(jI);
                        }
                        J.X x11 = i0Var.f10012d;
                        if (x11 != null) {
                            x11.e(p011b1.L.f17782b);
                        }
                        if (!p011b1.L.c(jI)) {
                            i0Var.t(false);
                            i0Var.q(J.M.f5654h);
                        }
                    }
                } else if (S.m.w(previewableHandwritingGesture)) {
                    android.view.inputmethod.DeleteGesture deleteGestureJ = S.m.j(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jI2 = S.t.i(x9, p188x0.z.K(deleteGestureJ.getDeletionArea()), deleteGestureJ.getGranularity() != 1 ? 0 : 1);
                        J.X x12 = i0Var.f10012d;
                        if (x12 != null) {
                            x12.e(jI2);
                        }
                        J.X x13 = i0Var.f10012d;
                        if (x13 != null) {
                            x13.f(p011b1.L.f17782b);
                        }
                        if (!p011b1.L.c(jI2)) {
                            i0Var.t(false);
                            i0Var.q(J.M.f5654h);
                        }
                    }
                } else if (S.m.C(previewableHandwritingGesture)) {
                    android.view.inputmethod.SelectRangeGesture selectRangeGestureN = S.m.n(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jB = S.t.b(x9, p188x0.z.K(selectRangeGestureN.getSelectionStartArea()), p188x0.z.K(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() != 1 ? 0 : 1);
                        J.X x14 = i0Var.f10012d;
                        if (x14 != null) {
                            x14.f(jB);
                        }
                        J.X x15 = i0Var.f10012d;
                        if (x15 != null) {
                            x15.e(p011b1.L.f17782b);
                        }
                        if (!p011b1.L.c(jB)) {
                            i0Var.t(false);
                            i0Var.q(J.M.f5654h);
                        }
                    }
                } else if (S.m.D(previewableHandwritingGesture)) {
                    android.view.inputmethod.DeleteRangeGesture deleteRangeGestureK = S.m.k(previewableHandwritingGesture);
                    if (i0Var != null) {
                        long jB2 = S.t.b(x9, p188x0.z.K(deleteRangeGestureK.getDeletionStartArea()), p188x0.z.K(deleteRangeGestureK.getDeletionEndArea()), deleteRangeGestureK.getGranularity() != 1 ? 0 : 1);
                        J.X x16 = i0Var.f10012d;
                        if (x16 != null) {
                            x16.e(jB2);
                        }
                        J.X x17 = i0Var.f10012d;
                        if (x17 != null) {
                            x17.f(p011b1.L.f17782b);
                        }
                        if (!p011b1.L.c(jB2)) {
                            i0Var.t(false);
                            i0Var.q(J.M.f5654h);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new S.n(0, i0Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
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
        int i9 = android.os.Build.VERSION.SDK_INT;
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
        S.u uVar = ((S.x) this.f9190a.f27782i).f9189m;
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
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h6.h, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        ((android.view.inputmethod.BaseInputConnection) ((S.x) this.f9190a.f27782i).f9187k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (z6) {
            a(new g1.u(i3, i9));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i3) {
        boolean z6 = this.f9198k;
        if (z6) {
            a(new g1.v(java.lang.String.valueOf(charSequence), i3));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i9) {
        boolean z6 = this.f9198k;
        if (!z6) {
            return z6;
        }
        a(new g1.w(i3, i9));
        return true;
    }
}
