package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements p080i8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p020c0.C1704s0 f23287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f23288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p080i8.u f23289c;

    public v(java.util.Collection collection, p020c0.C1704s0 c1704s0, java.lang.String whatThisExpects) {
        int i3;
        kotlin.jvm.internal.m.e(whatThisExpects, "whatThisExpects");
        this.f23287a = c1704s0;
        this.f23288b = whatThisExpects;
        this.f23289c = new p080i8.u();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str.length() <= 0) {
                throw new java.lang.IllegalArgumentException(("Found an empty string in " + this.f23288b).toString());
            }
            p080i8.u uVar = this.f23289c;
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                java.util.List list = uVar.f23285a;
                java.lang.String strValueOf = java.lang.String.valueOf(cCharAt);
                int size = list.size();
                Y0.n nVar = new Y0.n(strValueOf, 3);
                kotlin.jvm.internal.m.e(list, "<this>");
                p078i6.p.F0(list.size(), size);
                int i10 = size - 1;
                int i11 = 0;
                while (true) {
                    if (i11 > i10) {
                        i3 = -(i11 + 1);
                        break;
                    }
                    i3 = (i11 + i10) >>> 1;
                    int iIntValue = ((java.lang.Number) nVar.invoke(list.get(i3))).intValue();
                    if (iIntValue < 0) {
                        i11 = i3 + 1;
                    } else if (iIntValue <= 0) {
                        break;
                    } else {
                        i10 = i3 - 1;
                    }
                }
                java.util.List list2 = uVar.f23285a;
                if (i3 < 0) {
                    p080i8.u uVar2 = new p080i8.u();
                    list2.add((-i3) - 1, new p070h6.k(java.lang.String.valueOf(cCharAt), uVar2));
                    uVar = uVar2;
                } else {
                    uVar = (p080i8.u) ((p070h6.k) list2.get(i3)).f22540i;
                }
            }
            if (uVar.f23286b) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("The string '", str, "' was passed several times").toString());
            }
            uVar.f23286b = true;
        }
        b(this.f23289c);
    }

    public static final void b(p080i8.u uVar) {
        java.util.Iterator it = uVar.f23285a.iterator();
        while (it.hasNext()) {
            b((p080i8.u) ((p070h6.k) it.next()).f22540i);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<p070h6.k> list = uVar.f23285a;
        for (p070h6.k kVar : list) {
            java.lang.String str = (java.lang.String) kVar.f22539h;
            p080i8.u uVar2 = (p080i8.u) kVar.f22540i;
            if (!uVar2.f23286b) {
                java.util.List list2 = uVar2.f23285a;
                if (list2.size() == 1) {
                    p070h6.k kVar2 = (p070h6.k) p078i6.o.D1(list2);
                    java.lang.String str2 = (java.lang.String) kVar2.f22539h;
                    arrayList.add(new p070h6.k(p121o0.p.o(str, str2), (p080i8.u) kVar2.f22540i));
                }
            }
            arrayList.add(new p070h6.k(str, uVar2));
        }
        list.clear();
        list.addAll(p078i6.o.I1(arrayList, new p080i8.l(1)));
    }

    @Override // p080i8.o
    public final java.lang.Object a(p080i8.c cVar, java.lang.String str, int i3) {
        java.lang.String str2;
        p080i8.u uVar;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f24555h = i3;
        p080i8.u uVar2 = this.f23289c;
        java.lang.Integer numValueOf = null;
        loop0: while (yVar.f24555h <= str.length()) {
            if (uVar2.f23286b) {
                numValueOf = java.lang.Integer.valueOf(yVar.f24555h);
            }
            java.util.Iterator it = uVar2.f23285a.iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                p070h6.k kVar = (p070h6.k) it.next();
                str2 = (java.lang.String) kVar.f22539h;
                uVar = (p080i8.u) kVar.f22540i;
            } while (!O7.q.d1(str, str2, yVar.f24555h, false));
            yVar.f24555h = str2.length() + yVar.f24555h;
            uVar2 = uVar;
        }
        if (numValueOf == null) {
            return new p080i8.i(i3, new p080i8.g(this, str, i3, yVar));
        }
        java.lang.String string = str.subSequence(i3, numValueOf.intValue()).toString();
        p020c0.C1704s0 c1704s0 = this.f23287a;
        java.lang.Object objR = c1704s0.r(cVar, string);
        return objR == null ? numValueOf : new p080i8.i(i3, new A8.l(objR, string, c1704s0, 2));
    }
}
