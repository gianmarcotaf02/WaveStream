package androidx.compose.ui.semantics;

import R0.L;
import Y0.w;
import Y0.x;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p070h6.e;
import p121o0.p;
import p136q.C2664h;
import p136q.C2675t;
import p136q.H;
import p136q.P;
import p201y6.a;

public final class SemanticsConfiguration implements x, Iterable, a {

    public final H f15960h;

    public C2675t f15961i;
    public boolean j;

    public boolean f15962k;

    public SemanticsConfiguration() {
        long[] jArr = P.f26351a;
        this.f15960h = new H();
    }

    @Override
    public final void d(w wVar, Object obj) {
        boolean z6 = obj instanceof Y0.a;
        H h9 = this.f15960h;
        if (z6 && h9.c(wVar)) {
            Object objG = h9.g(wVar);
            m.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            Y0.a aVar = (Y0.a) objG;
            Y0.a aVar2 = (Y0.a) obj;
            String str = aVar2.f11024a;
            if (str == null) {
                str = aVar.f11024a;
            }
            e eVar = aVar2.f11025b;
            if (eVar == null) {
                eVar = aVar.f11025b;
            }
            h9.m(wVar, new Y0.a(str, eVar));
        } else {
            h9.m(wVar, obj);
        }
        wVar.getClass();
    }

    public final SemanticsConfiguration e() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.j = this.j;
        semanticsConfiguration.f15962k = this.f15962k;
        H h9 = semanticsConfiguration.f15960h;
        h9.getClass();
        H from = this.f15960h;
        m.e(from, "from");
        Object[] objArr = from.f26323b;
        Object[] objArr2 = from.f26324c;
        long[] jArr = from.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            int i11 = (i3 << 3) + i10;
                            h9.m(objArr[i11], objArr2[i11]);
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return semanticsConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return m.a(this.f15960h, semanticsConfiguration.f15960h) && this.j == semanticsConfiguration.j && this.f15962k == semanticsConfiguration.f15962k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15962k) + p.f(this.f15960h.hashCode() * 31, 31, this.j);
    }

    @Override
    public final Iterator iterator() {
        C2675t c2675t = this.f15961i;
        if (c2675t == null) {
            H h9 = this.f15960h;
            h9.getClass();
            C2675t c2675t2 = new C2675t(h9);
            this.f15961i = c2675t2;
            c2675t = c2675t2;
        }
        return ((C2664h) c2675t.entrySet()).iterator();
    }

    public final Object n(w wVar) {
        Object objG = this.f15960h.g(wVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final void o(SemanticsConfiguration semanticsConfiguration) {
        H h9 = semanticsConfiguration.f15960h;
        Object[] objArr = h9.f26323b;
        Object[] objArr2 = h9.f26324c;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        Object obj = objArr[i11];
                        Object obj2 = objArr2[i11];
                        w wVar = (w) obj;
                        H h10 = this.f15960h;
                        Object objG = h10.g(wVar);
                        m.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = wVar.f11146b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            h10.m(wVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.j) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f15962k) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        H h9 = this.f15960h;
        Object[] objArr = h9.f26323b;
        Object[] objArr2 = h9.f26324c;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            int i11 = (i3 << 3) + i10;
                            Object obj = objArr[i11];
                            Object obj2 = objArr2[i11];
                            sb.append(str);
                            sb.append(((w) obj).f11145a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return L.r(this) + "{ " + ((Object) sb) + " }";
    }
}
