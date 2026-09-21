package U;

/* JADX INFO: renamed from: U.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0945s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p100l6.h f10072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f10073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U.EnumC0949w f10074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p074i1.b f10075d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.view.textclassifier.TextClassifier f10077f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p028c8.d f10076e = new p028c8.d();
    public final p020c0.C1681g0 g = p020c0.AbstractC1703s.y(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f10078h = new java.lang.Object();

    public C0945s(p100l6.h hVar, android.content.Context context, U.EnumC0949w enumC0949w, p074i1.b bVar) {
        this.f10072a = hVar;
        this.f10073b = context;
        this.f10074c = enumC0949w;
        this.f10075d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final java.lang.Object a(U.C0945s c0945s, java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassifier textClassifier, p117n6.c cVar) {
        U.C0939l c0939l;
        long j9;
        java.lang.CharSequence charSequence2;
        android.view.textclassifier.TextClassifier textClassifierN;
        p028c8.d dVar;
        android.view.textclassifier.TextClassification textClassificationClassifyText;
        long j10;
        java.lang.CharSequence charSequence3;
        c0945s.getClass();
        if (cVar instanceof U.C0939l) {
            c0939l = (U.C0939l) cVar;
            int i3 = c0939l.f10042n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0939l.f10042n = i3 - Integer.MIN_VALUE;
            } else {
                c0939l = new U.C0939l(c0945s, cVar);
            }
        } else {
            c0939l = new U.C0939l(c0945s, cVar);
        }
        java.lang.Object obj = c0939l.f10040l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0939l.f10042n;
        p070h6.A a2 = p070h6.A.f22523a;
        p020c0.C1681g0 c1681g0 = c0945s.g;
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
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = c0939l.f10039k;
                dVar2 = c0939l.j;
                textClassificationClassifyText = B1.a.m(c0939l.f10038i);
                charSequence3 = c0939l.f10037h;
                com.google.common.util.concurrent.P.u0(obj);
            }
            try {
                c1681g0.setValue(new U.V(charSequence3, j10, textClassificationClassifyText));
                return a2;
            } finally {
                dVar2.g(null);
            }
            U.V v6 = (U.V) c1681g0.getValue();
            if (v6 != null) {
                p020c0.f1 f1Var = U.AbstractC0947u.f10083a;
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
                c1681g0.setValue(new U.V(charSequence3, j10, textClassificationClassifyText));
                return a2;
            }
            return aVar;
        } catch (java.lang.Throwable th) {
            dVar.g(null);
            throw th;
        }
    }

    public final android.os.LocaleList b() {
        p074i1.b bVar = this.f10075d;
        if (bVar == null) {
            return new android.os.LocaleList(((p074i1.a) p074i1.c.f22749a.u().f22747h.get(0)).f22746a);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(bVar, 10));
        java.util.Iterator it = bVar.f22747h.iterator();
        while (it.hasNext()) {
            arrayList.add(((p074i1.a) it.next()).f22746a);
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
    }
}
