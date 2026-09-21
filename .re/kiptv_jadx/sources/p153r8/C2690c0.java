package p153r8;

/* JADX INFO: renamed from: r8.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2690c0 implements kotlinx.serialization.descriptors.SerialDescriptor, p153r8.InterfaceC2701l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f26945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p153r8.D f26946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26948d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f26949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List[] f26950f;
    public final boolean[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f26951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f26952i;
    public final java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f26953k;

    public C2690c0(java.lang.String str, p153r8.D d4, int i3) {
        this.f26945a = str;
        this.f26946b = d4;
        this.f26947c = i3;
        java.lang.String[] strArr = new java.lang.String[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f26949e = strArr;
        int i10 = this.f26947c;
        this.f26950f = new java.util.List[i10];
        this.g = new boolean[i10];
        this.f26951h = p078i6.x.f23206h;
        p070h6.i iVar = p070h6.i.f22537i;
        final int i11 = 0;
        this.f26952i = com.google.common.util.concurrent.D.A(iVar, new kotlin.jvm.functions.Function0(this) { // from class: r8.b0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p153r8.C2690c0 f26943i;

            {
                this.f26943i = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [h6.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer[] kSerializerArrChildSerializers;
                java.util.ArrayList arrayList;
                kotlinx.serialization.KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i11) {
                    case 0:
                        p153r8.D d6 = this.f26943i.f26946b;
                        return (d6 == null || (kSerializerArrChildSerializers = d6.childSerializers()) == null) ? p153r8.AbstractC2686a0.f26940b : kSerializerArrChildSerializers;
                    case 1:
                        p153r8.D d9 = this.f26943i.f26946b;
                        if (d9 == null || (kSerializerArrTypeParametersSerializers = d9.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new java.util.ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (kotlinx.serialization.KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return p153r8.AbstractC2686a0.c(arrayList);
                    default:
                        p153r8.C2690c0 c2690c0 = this.f26943i;
                        return java.lang.Integer.valueOf(p153r8.AbstractC2686a0.g(c2690c0, (kotlinx.serialization.descriptors.SerialDescriptor[]) c2690c0.j.getValue()));
                }
            }
        });
        final int i12 = 1;
        this.j = com.google.common.util.concurrent.D.A(iVar, new kotlin.jvm.functions.Function0(this) { // from class: r8.b0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p153r8.C2690c0 f26943i;

            {
                this.f26943i = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [h6.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer[] kSerializerArrChildSerializers;
                java.util.ArrayList arrayList;
                kotlinx.serialization.KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        p153r8.D d6 = this.f26943i.f26946b;
                        return (d6 == null || (kSerializerArrChildSerializers = d6.childSerializers()) == null) ? p153r8.AbstractC2686a0.f26940b : kSerializerArrChildSerializers;
                    case 1:
                        p153r8.D d9 = this.f26943i.f26946b;
                        if (d9 == null || (kSerializerArrTypeParametersSerializers = d9.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new java.util.ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (kotlinx.serialization.KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return p153r8.AbstractC2686a0.c(arrayList);
                    default:
                        p153r8.C2690c0 c2690c0 = this.f26943i;
                        return java.lang.Integer.valueOf(p153r8.AbstractC2686a0.g(c2690c0, (kotlinx.serialization.descriptors.SerialDescriptor[]) c2690c0.j.getValue()));
                }
            }
        });
        final int i13 = 2;
        this.f26953k = com.google.common.util.concurrent.D.A(iVar, new kotlin.jvm.functions.Function0(this) { // from class: r8.b0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p153r8.C2690c0 f26943i;

            {
                this.f26943i = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [h6.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer[] kSerializerArrChildSerializers;
                java.util.ArrayList arrayList;
                kotlinx.serialization.KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        p153r8.D d6 = this.f26943i.f26946b;
                        return (d6 == null || (kSerializerArrChildSerializers = d6.childSerializers()) == null) ? p153r8.AbstractC2686a0.f26940b : kSerializerArrChildSerializers;
                    case 1:
                        p153r8.D d9 = this.f26943i.f26946b;
                        if (d9 == null || (kSerializerArrTypeParametersSerializers = d9.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new java.util.ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (kotlinx.serialization.KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return p153r8.AbstractC2686a0.c(arrayList);
                    default:
                        p153r8.C2690c0 c2690c0 = this.f26943i;
                        return java.lang.Integer.valueOf(p153r8.AbstractC2686a0.g(c2690c0, (kotlinx.serialization.descriptors.SerialDescriptor[]) c2690c0.j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        return this.f26945a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p153r8.InterfaceC2701l
    public final java.util.Set b() {
        return this.f26951h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public com.google.android.gms.internal.play_billing.V0 c() {
        return p135p8.j.f26283f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        java.lang.Integer num = (java.lang.Integer) this.f26951h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [h6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [h6.h, java.lang.Object] */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p153r8.C2690c0) {
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
            if (this.f26945a.equals(serialDescriptor.a()) && java.util.Arrays.equals((kotlinx.serialization.descriptors.SerialDescriptor[]) this.j.getValue(), (kotlinx.serialization.descriptors.SerialDescriptor[]) ((p153r8.C2690c0) obj).j.getValue())) {
                int iF = serialDescriptor.f();
                int i3 = this.f26947c;
                if (i3 == iF) {
                    for (int i9 = 0; i9 < i3; i9++) {
                        if (kotlin.jvm.internal.m.a(i(i9).a(), serialDescriptor.i(i9).a()) && kotlin.jvm.internal.m.a(i(i9).c(), serialDescriptor.i(i9).c())) {
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
        return this.f26947c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String g(int i3) {
        return this.f26949e[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List getAnnotations() {
        return p078i6.w.f23205h;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List h(int i3) {
        java.util.List list = this.f26950f[i3];
        return list == null ? p078i6.w.f23205h : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    public int hashCode() {
        return ((java.lang.Number) this.f26953k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialDescriptor i(int i3) {
        return ((kotlinx.serialization.KSerializer[]) this.f26952i.getValue())[i3].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.g[i3];
    }

    public final void k(java.lang.String name, boolean z6) {
        kotlin.jvm.internal.m.e(name, "name");
        int i3 = this.f26948d + 1;
        this.f26948d = i3;
        java.lang.String[] strArr = this.f26949e;
        strArr[i3] = name;
        this.g[i3] = z6;
        this.f26950f[i3] = null;
        if (i3 == this.f26947c - 1) {
            java.util.HashMap map = new java.util.HashMap();
            int length = strArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                map.put(strArr[i9], java.lang.Integer.valueOf(i9));
            }
            this.f26951h = map;
        }
    }

    public java.lang.String toString() {
        return p078i6.o.o1(O7.r.W(0, this.f26947c), ", ", this.f26945a.concat("("), ")", new p078i6.C2255f(21, this), 24);
    }
}
