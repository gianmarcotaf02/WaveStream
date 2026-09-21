package V1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p013b3.d, p100l6.g, p048f1.x, p095l.w, J0.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10233h;

    public /* synthetic */ b(int i3) {
        this.f10233h = i3;
    }

    public static final float a(float f9, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float fAbs = java.lang.Math.abs(f9);
        float fSignum = java.lang.Math.signum(f9);
        int iBinarySearch = java.util.Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i3 = -(iBinarySearch + 1);
        int i9 = i3 - 1;
        if (i9 >= fArr.length - 1) {
            float f14 = fArr[fArr.length - 1];
            float f15 = fArr2[fArr.length - 1];
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return (f15 / f14) * f9;
        }
        if (i9 == -1) {
            float f16 = fArr[0];
            f12 = fArr2[0];
            f13 = f16;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f17 = fArr[i9];
            float f18 = fArr[i3];
            f10 = fArr2[i9];
            f11 = f17;
            f12 = fArr2[i3];
            f13 = f18;
        }
        return (((f12 - f10) * java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f11 == f13 ? 0.0f : (fAbs - f11) / (f13 - f11)))) + f10) * fSignum;
    }

    public static androidx.lifecycle.i0 b(androidx.lifecycle.k0 owner, androidx.lifecycle.g0 factory, int i3) {
        if ((i3 & 2) != 0) {
            kotlin.jvm.internal.m.e(owner, "owner");
            factory = owner instanceof androidx.lifecycle.InterfaceC1528j ? ((androidx.lifecycle.InterfaceC1528j) owner).c() : p057g2.b.f21857a;
        }
        kotlin.jvm.internal.m.e(owner, "owner");
        p040e2.b extras = owner instanceof androidx.lifecycle.InterfaceC1528j ? ((androidx.lifecycle.InterfaceC1528j) owner).d() : p040e2.a.f21364b;
        kotlin.jvm.internal.m.e(owner, "owner");
        kotlin.jvm.internal.m.e(factory, "factory");
        kotlin.jvm.internal.m.e(extras, "extras");
        return new androidx.lifecycle.i0(owner.e(), factory, extras);
    }

    public static p114n2.C2650i d(D3.j jVar, p114n2.t destination, android.os.Bundle bundle, androidx.lifecycle.EnumC1533o hostLifecycleState, p114n2.C2654m c2654m) {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        kotlin.jvm.internal.m.e(destination, "destination");
        kotlin.jvm.internal.m.e(hostLifecycleState, "hostLifecycleState");
        return new p114n2.C2650i(jVar, destination, bundle, hostLifecycleState, c2654m, string, null);
    }

    public static android.graphics.Typeface e(java.lang.String str, p048f1.s sVar, int i3) {
        if (i3 == 0 && kotlin.jvm.internal.m.a(sVar, p048f1.s.f21668l) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        return android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), sVar.f21672h, i3 == 1);
    }

    public static android.graphics.Typeface f(java.lang.String str, p048f1.s sVar, int i3) {
        if (i3 == 0 && kotlin.jvm.internal.m.a(sVar, p048f1.s.f21668l) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int iT = com.google.android.gms.internal.play_billing.AbstractC1853k0.t(i3, sVar);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(iT) : android.graphics.Typeface.create(str, iT);
    }

    public static boolean h(V1.c cVar, android.text.Editable editable, int i3, int i9, boolean z6) {
        int iMin;
        if (editable != null && i3 >= 0 && i9 >= 0) {
            int selectionStart = android.text.Selection.getSelectionStart(editable);
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z6) {
                    int iMax = java.lang.Math.max(i3, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z9 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z9) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z9) {
                                    if (java.lang.Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!java.lang.Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!java.lang.Character.isHighSurrogate(cCharAt)) {
                                    z9 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = java.lang.Math.max(i9, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z10) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z10) {
                                        if (java.lang.Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!java.lang.Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!java.lang.Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z10 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = java.lang.Math.max(selectionStart - i3, 0);
                    iMin = java.lang.Math.min(selectionEnd + i9, editable.length());
                }
                T1.x[] xVarArr = (T1.x[]) editable.getSpans(selectionStart, iMin, T1.x.class);
                if (xVarArr != null && xVarArr.length > 0) {
                    for (T1.x xVar : xVarArr) {
                        int spanStart = editable.getSpanStart(xVar);
                        int spanEnd = editable.getSpanEnd(xVar);
                        selectionStart = java.lang.Math.min(spanStart, selectionStart);
                        iMin = java.lang.Math.max(spanEnd, iMin);
                    }
                    int iMax3 = java.lang.Math.max(selectionStart, 0);
                    int iMin2 = java.lang.Math.min(iMin, editable.length());
                    cVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    cVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p013b3.d
    public java.lang.Object apply(java.lang.Object obj) {
        return ((com.google.android.gms.internal.play_billing.z1) obj).b();
    }

    public long g() {
        switch (this.f10233h) {
            case 23:
                return android.os.SystemClock.elapsedRealtime();
            default:
                return java.lang.System.currentTimeMillis();
        }
    }

    @Override // p095l.w
    public boolean j(p095l.l lVar) {
        return false;
    }

    public java.lang.String toString() {
        switch (this.f10233h) {
            case 28:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // p095l.w
    public void c(p095l.l lVar, boolean z6) {
    }
}
