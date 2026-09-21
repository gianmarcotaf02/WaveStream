package p180v7;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p180v7.m f29662c = new p180v7.m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29665f;
    public static final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f29666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f29667i;
    public static final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f29668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f29669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p180v7.f f29670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p180v7.f f29671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p180v7.f f29672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p180v7.f f29673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p180v7.f f29674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final java.util.ArrayList f29675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final java.util.ArrayList f29676s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f29677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29678b;

    static {
        p180v7.e eVar;
        int i3 = f29663d;
        int i9 = i3 << 1;
        f29664e = i3;
        int i10 = i3 << 2;
        f29665f = i9;
        int i11 = i3 << 3;
        g = i10;
        int i12 = i3 << 4;
        f29666h = i11;
        int i13 = i3 << 5;
        f29667i = i12;
        j = i13;
        f29663d = i3 << 7;
        int i14 = (i3 << 6) - 1;
        f29668k = i14;
        int i15 = i3 | i9 | i10;
        f29669l = i15;
        f29670m = new p180v7.f(i14);
        f29671n = new p180v7.f(i12 | i13);
        new p180v7.f(i3);
        new p180v7.f(i9);
        new p180v7.f(i10);
        f29672o = new p180v7.f(i15);
        new p180v7.f(i11);
        f29673p = new p180v7.f(i12);
        f29674q = new p180v7.f(i13);
        new p180v7.f(i9 | i12 | i13);
        java.lang.reflect.Field[] fields = p180v7.f.class.getFields();
        kotlin.jvm.internal.m.d(fields, "getFields(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            p180v7.e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) it.next();
            java.lang.Object obj = field2.get(null);
            p180v7.f fVar = obj instanceof p180v7.f ? (p180v7.f) obj : null;
            if (fVar != null) {
                java.lang.String name = field2.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                eVar2 = new p180v7.e(fVar.f29678b, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f29675r = arrayList2;
        java.lang.reflect.Field[] fields2 = p180v7.f.class.getFields();
        kotlin.jvm.internal.m.d(fields2, "getFields(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Field field3 : fields2) {
            if (java.lang.reflect.Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        java.util.ArrayList<java.lang.reflect.Field> arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            if (kotlin.jvm.internal.m.a(((java.lang.reflect.Field) obj2).getType(), java.lang.Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.reflect.Field field4 : arrayList4) {
            java.lang.Object obj3 = field4.get(null);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                java.lang.String name2 = field4.getName();
                kotlin.jvm.internal.m.d(name2, "getName(...)");
                eVar = new p180v7.e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f29676s = arrayList5;
    }

    public f(int i3, java.util.List excludes) {
        kotlin.jvm.internal.m.e(excludes, "excludes");
        this.f29677a = excludes;
        java.util.Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i3 &= ~((p180v7.d) it.next()).a();
        }
        this.f29678b = i3;
    }

    public final boolean a(int i3) {
        return (i3 & this.f29678b) != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p180v7.f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        p180v7.f fVar = (p180v7.f) obj;
        return kotlin.jvm.internal.m.a(this.f29677a, fVar.f29677a) && this.f29678b == fVar.f29678b;
    }

    public final int hashCode() {
        return (this.f29677a.hashCode() * 31) + this.f29678b;
    }

    public final java.lang.String toString() {
        java.lang.Object next;
        java.util.Iterator it = f29675r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((p180v7.e) next).f29660a != this.f29678b);
        p180v7.e eVar = (p180v7.e) next;
        java.lang.String strO1 = eVar != null ? eVar.f29661b : null;
        if (strO1 == null) {
            java.util.ArrayList<p180v7.e> arrayList = f29676s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (p180v7.e eVar2 : arrayList) {
                java.lang.String str = a(eVar2.f29660a) ? eVar2.f29661b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strO1 = p078i6.o.o1(arrayList2, " | ", null, null, null, 62);
        }
        return com.google.android.gms.internal.play_billing.M0.n(com.google.android.gms.internal.play_billing.M0.q("DescriptorKindFilter(", strO1, ", "), this.f29677a, ')');
    }

    public /* synthetic */ f(int i3) {
        this(i3, p078i6.w.f23205h);
    }
}
