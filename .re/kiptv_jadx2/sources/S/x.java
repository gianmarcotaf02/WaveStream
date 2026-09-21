package S;

import D1.C0;
import D5.C0261o;
import J.X;
import J5.C1;
import J5.t2;
import R0.V0;
import U.i0;
import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.D;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p011b1.L;

public final class x {

    public final View f9179a;

    public final p f9180b;

    public X f9183e;

    public i0 f9184f;
    public V0 g;

    public Rect f9188l;

    public final u f9189m;

    public p194x6.j f9181c = new t2(9);

    public p194x6.j f9182d = new t2(10);

    public g1.x f9185h = new g1.x("", L.f17782b, 4);

    public g1.k f9186i = g1.k.g;
    public final ArrayList j = new ArrayList();

    public final Object f9187k = D.A(p070h6.i.j, new C0261o(21, this));

    public x(View view, C1 c9, p pVar) {
        this.f9179a = view;
        this.f9180b = pVar;
        this.f9189m = new u(c9, pVar);
    }

    public final y a(EditorInfo editorInfo) {
        int i3;
        int i9;
        g1.x xVar = this.f9185h;
        String str = xVar.f21847a.f17809i;
        g1.k kVar = this.f9186i;
        int i10 = kVar.f21828e;
        boolean z6 = kVar.f21824a;
        if (i10 == 1) {
            i3 = z6 ? 6 : 0;
        } else if (i10 == 0) {
            i3 = 1;
        } else if (i10 == 2) {
            i3 = 2;
        } else if (i10 == 6) {
            i3 = 5;
        } else if (i10 == 5) {
            i3 = 7;
        } else if (i10 == 3) {
            i3 = 3;
        } else if (i10 == 4) {
            i3 = 4;
        } else {
            if (i10 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i3;
        p074i1.b bVar = p074i1.b.j;
        p074i1.b bVar2 = kVar.f21829f;
        if (kotlin.jvm.internal.m.a(bVar2, bVar)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(p078i6.q.I0(bVar2, 10));
            Iterator it = bVar2.f22747h.iterator();
            while (it.hasNext()) {
                arrayList.add(((p074i1.a) it.next()).f22746a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        int i11 = kVar.f21827d;
        if (i11 == 1) {
            i9 = 1;
        } else if (i11 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i9 = 1;
        } else if (i11 == 3) {
            i9 = 2;
        } else if (i11 == 4) {
            i9 = 3;
        } else if (i11 == 5) {
            i9 = 17;
        } else if (i11 == 6) {
            i9 = 33;
        } else if (i11 == 7) {
            i9 = TsExtractor.TS_STREAM_TYPE_AC3;
        } else if (i11 == 8) {
            i9 = 18;
        } else {
            if (i11 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i9 = 8194;
        }
        editorInfo.inputType = i9;
        if (!z6 && (i9 & 1) == 1) {
            editorInfo.inputType = i9 | 131072;
            if (kVar.f21828e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i12 = editorInfo.inputType;
        if ((i12 & 1) == 1) {
            int i13 = kVar.f21825b;
            if (i13 == 1) {
                editorInfo.inputType = i12 | 4096;
            } else if (i13 == 2) {
                editorInfo.inputType = i12 | 8192;
            } else if (i13 == 3) {
                editorInfo.inputType = i12 | 16384;
            }
            if (kVar.f21826c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i14 = L.f17783c;
        long j = xVar.f21848b;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        F1.d.a(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!R.e.f8727a || i11 == 7 || i11 == 8) {
            F1.d.b(editorInfo, false);
        } else {
            F1.d.b(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(p078i6.p.B0(C0.n(), C0.z(), C0.v(), C0.x(), C0.B(), C0.C(), C0.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(p078i6.m.F0(new Class[]{C0.n(), C0.z(), C0.v(), C0.x()}));
        }
        v vVar = w.f9178a;
        if (T1.j.d()) {
            T1.j.a().i(editorInfo);
        }
        y yVar = new y(this.f9185h, new p166t3.i(19, this), this.f9186i.f21826c, this.f9183e, this.f9184f, this.g);
        this.j.add(new WeakReference(yVar));
        return yVar;
    }
}
