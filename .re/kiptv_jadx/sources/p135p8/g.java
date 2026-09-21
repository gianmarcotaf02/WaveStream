package p135p8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements kotlinx.serialization.descriptors.SerialDescriptor, p153r8.InterfaceC2701l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f26271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.V0 f26272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f26274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f26275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f26276f;
    public final kotlinx.serialization.descriptors.SerialDescriptor[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List[] f26277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f26278i;
    public final java.util.Map j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.SerialDescriptor[] f26279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p070h6.p f26280l;

    public g(java.lang.String serialName, com.google.android.gms.internal.play_billing.V0 v6, int i3, java.util.List list, p135p8.a aVar) {
        kotlin.jvm.internal.m.e(serialName, "serialName");
        this.f26271a = serialName;
        this.f26272b = v6;
        this.f26273c = i3;
        this.f26274d = aVar.f26255b;
        java.util.ArrayList arrayList = aVar.f26256c;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        java.util.HashSet hashSet = new java.util.HashSet(p078i6.D.I0(p078i6.q.I0(arrayList, 12)));
        p078i6.o.L1(arrayList, hashSet);
        this.f26275e = hashSet;
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        this.f26276f = strArr;
        this.g = p153r8.AbstractC2686a0.c(aVar.f26258e);
        this.f26277h = (java.util.List[]) aVar.f26259f.toArray(new java.util.List[0]);
        java.util.ArrayList arrayList2 = aVar.g;
        kotlin.jvm.internal.m.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        java.util.Iterator it = arrayList2.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            zArr[i9] = ((java.lang.Boolean) it.next()).booleanValue();
            i9++;
        }
        this.f26278i = zArr;
        kotlin.jvm.internal.m.e(strArr, "<this>");
        N7.r rVar = new N7.r(2, new p077i5.C2237d(1, strArr));
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(rVar, 10));
        java.util.Iterator it2 = rVar.iterator();
        while (true) {
            N7.d dVar = (N7.d) it2;
            if (!dVar.j.hasNext()) {
                this.j = p078i6.C.X0(arrayList3);
                this.f26279k = p153r8.AbstractC2686a0.c(list);
                this.f26280l = com.google.common.util.concurrent.D.B(new p077i5.C2237d(18, this));
                return;
            }
            p078i6.z zVar = (p078i6.z) dVar.next();
            arrayList3.add(new p070h6.k(zVar.f23209b, java.lang.Integer.valueOf(zVar.f23208a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        return this.f26271a;
    }

    @Override // p153r8.InterfaceC2701l
    public final java.util.Set b() {
        return this.f26275e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.google.android.gms.internal.play_billing.V0 c() {
        return this.f26272b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        java.lang.Integer num = (java.lang.Integer) this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p135p8.g) {
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
            if (kotlin.jvm.internal.m.a(this.f26271a, serialDescriptor.a()) && java.util.Arrays.equals(this.f26279k, ((p135p8.g) obj).f26279k)) {
                int iF = serialDescriptor.f();
                int i3 = this.f26273c;
                if (i3 == iF) {
                    for (int i9 = 0; i9 < i3; i9++) {
                        kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr = this.g;
                        if (kotlin.jvm.internal.m.a(serialDescriptorArr[i9].a(), serialDescriptor.i(i9).a()) && kotlin.jvm.internal.m.a(serialDescriptorArr[i9].c(), serialDescriptor.i(i9).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f26273c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String g(int i3) {
        return this.f26276f[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List getAnnotations() {
        return this.f26274d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List h(int i3) {
        return this.f26277h[i3];
    }

    public final int hashCode() {
        return ((java.lang.Number) this.f26280l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor i(int i3) {
        return this.g[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f26278i[i3];
    }

    public final java.lang.String toString() {
        return p078i6.o.o1(O7.r.W(0, this.f26273c), ", ", Y6.f.l(new java.lang.StringBuilder(), this.f26271a, '('), ")", new p078i6.C2255f(19, this), 24);
    }
}
