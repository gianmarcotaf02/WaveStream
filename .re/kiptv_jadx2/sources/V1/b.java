package V1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import androidx.lifecycle.EnumC1533o;
import androidx.lifecycle.InterfaceC1528j;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.z1;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.m;
import p048f1.s;
import p048f1.x;
import p095l.l;
import p095l.w;
import p114n2.C2650i;
import p114n2.C2654m;
import p114n2.t;

public final class b implements p013b3.d, p100l6.g, x, w, J0.a {

    public final int f10233h;

    public b(int i3) {
        this.f10233h = i3;
    }

    public static final float a(float f9, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float fAbs = Math.abs(f9);
        float fSignum = Math.signum(f9);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
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
        return (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f11 == f13 ? 0.0f : (fAbs - f11) / (f13 - f11)))) + f10) * fSignum;
    }

    public static i0 b(k0 owner, g0 factory, int i3) {
        if ((i3 & 2) != 0) {
            m.e(owner, "owner");
            factory = owner instanceof InterfaceC1528j ? ((InterfaceC1528j) owner).c() : p057g2.b.f21857a;
        }
        m.e(owner, "owner");
        p040e2.b extras = owner instanceof InterfaceC1528j ? ((InterfaceC1528j) owner).d() : p040e2.a.f21364b;
        m.e(owner, "owner");
        m.e(factory, "factory");
        m.e(extras, "extras");
        return new i0(owner.e(), factory, extras);
    }

    public static C2650i d(D3.j jVar, t destination, Bundle bundle, EnumC1533o hostLifecycleState, C2654m c2654m) {
        String string = UUID.randomUUID().toString();
        m.d(string, "toString(...)");
        m.e(destination, "destination");
        m.e(hostLifecycleState, "hostLifecycleState");
        return new C2650i(jVar, destination, bundle, hostLifecycleState, c2654m, string, null);
    }

    public static Typeface e(String str, s sVar, int i3) {
        if (i3 == 0 && m.a(sVar, s.f21668l) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), sVar.f21672h, i3 == 1);
    }

    public static Typeface f(String str, s sVar, int i3) {
        if (i3 == 0 && m.a(sVar, s.f21668l) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iT = AbstractC1853k0.t(i3, sVar);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iT) : Typeface.create(str, iT);
    }

    public static boolean h(c cVar, Editable editable, int i3, int i9, boolean z6) {
        int iMin;
        if (editable != null && i3 >= 0 && i9 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z6) {
                    int iMax = Math.max(i3, 0);
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
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z9 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i9, 0);
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
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
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
                    selectionStart = Math.max(selectionStart - i3, 0);
                    iMin = Math.min(selectionEnd + i9, editable.length());
                }
                T1.x[] xVarArr = (T1.x[]) editable.getSpans(selectionStart, iMin, T1.x.class);
                if (xVarArr != null && xVarArr.length > 0) {
                    for (T1.x xVar : xVarArr) {
                        int spanStart = editable.getSpanStart(xVar);
                        int spanEnd = editable.getSpanEnd(xVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    cVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    cVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object apply(Object obj) {
        return ((z1) obj).b();
    }

    public long g() {
        switch (this.f10233h) {
            case 23:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    @Override
    public boolean j(l lVar) {
        return false;
    }

    public String toString() {
        switch (this.f10233h) {
            case 28:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override
    public void c(l lVar, boolean z6) {
    }
}
