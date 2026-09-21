package U;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p020c0.AbstractC1703s;
import p020c0.C1681g0;
import p020c0.f1;

public final class C0945s {

    public final p100l6.h f10072a;

    public final Context f10073b;

    public final EnumC0949w f10074c;

    public final p074i1.b f10075d;

    public TextClassifier f10077f;

    public final p028c8.d f10076e = new p028c8.d();
    public final C1681g0 g = AbstractC1703s.y(null);

    public final Object f10078h = new Object();

    public C0945s(p100l6.h hVar, Context context, EnumC0949w enumC0949w, p074i1.b bVar) {
        this.f10072a = hVar;
        this.f10073b = context;
        this.f10074c = enumC0949w;
        this.f10075d = bVar;
    }

    public static final Object a(C0945s c0945s, CharSequence charSequence, long j, TextClassifier textClassifier, p117n6.c cVar) {
        C0939l c0939l;
        long j9;
        CharSequence charSequence2;
        TextClassifier textClassifierN;
        p028c8.d dVar;
        TextClassification textClassificationClassifyText;
        long j10;
        CharSequence charSequence3;
        c0945s.getClass();
        if (cVar instanceof C0939l) {
            c0939l = (C0939l) cVar;
            int i3 = c0939l.f10042n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0939l.f10042n = i3 - Integer.MIN_VALUE;
            } else {
                c0939l = new C0939l(c0945s, cVar);
            }
        } else {
            c0939l = new C0939l(c0945s, cVar);
        }
        Object obj = c0939l.f10040l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0939l.f10042n;
        p070h6.A a2 = p070h6.A.f22523a;
        C1681g0 c1681g0 = c0945s.g;
        p028c8.d dVar2 = c0945s.f10076e;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                c0939l.f10037h = charSequence;
                c0939l.f10038i = textClassifier;
                c0939l.j = dVar2;
                j9 = j;
                c0939l.f10039k = j9;
                c0939l.f10042n = 1;
                if (dVar2.e(c0939l) != aVar) {
                    charSequence2 = charSequence;
                    textClassifierN = textClassifier;
                    dVar = dVar2;
                }
                return aVar;
            }
            if (i9 == 1) {
                j9 = c0939l.f10039k;
                dVar = c0939l.j;
                textClassifierN = B1.a.n(c0939l.f10038i);
                charSequence2 = c0939l.f10037h;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = c0939l.f10039k;
                dVar2 = c0939l.j;
                textClassificationClassifyText = B1.a.m(c0939l.f10038i);
                charSequence3 = c0939l.f10037h;
                com.google.common.util.concurrent.P.u0(obj);
            }
            try {
                c1681g0.setValue(new V(charSequence3, j10, textClassificationClassifyText));
                return a2;
            } finally {
                dVar2.g(null);
            }
            V v6 = (V) c1681g0.getValue();
            if (v6 != null) {
                f1 f1Var = AbstractC0947u.f10083a;
                if (p011b1.L.b(j9, v6.f9942b) && kotlin.jvm.internal.m.a(charSequence2, v6.f9941a)) {
                    dVar.g(null);
                    return a2;
                }
            }
            dVar.g(null);
            H2.w.v();
            textClassificationClassifyText = textClassifierN.classifyText(H2.w.k(charSequence2, p011b1.L.f(j9), p011b1.L.e(j9)).setDefaultLocales(c0945s.b()).build());
            c0939l.f10037h = charSequence2;
            c0939l.f10038i = textClassificationClassifyText;
            c0939l.j = dVar2;
            c0939l.f10039k = j9;
            c0939l.f10042n = 2;
            if (dVar2.e(c0939l) != aVar) {
                j10 = j9;
                charSequence3 = charSequence2;
                c1681g0.setValue(new V(charSequence3, j10, textClassificationClassifyText));
                return a2;
            }
            return aVar;
        } catch (Throwable th) {
            dVar.g(null);
            throw th;
        }
    }

    public final LocaleList b() {
        p074i1.b bVar = this.f10075d;
        if (bVar == null) {
            return new LocaleList(((p074i1.a) p074i1.c.f22749a.u().f22747h.get(0)).f22746a);
        }
        ArrayList arrayList = new ArrayList(p078i6.q.I0(bVar, 10));
        Iterator it = bVar.f22747h.iterator();
        while (it.hasNext()) {
            arrayList.add(((p074i1.a) it.next()).f22746a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
