package E2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f2775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f2776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f2777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.List f2778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.List f2779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p070h6.p f2780f;
    public final p070h6.p g;

    public e(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
        this.f2775a = list;
        this.f2776b = list2;
        this.f2777c = list3;
        this.f2778d = list4;
        this.f2779e = list5;
        final int i3 = 0;
        this.f2780f = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0(this) { // from class: E2.b

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ E2.e f2768i;

            {
                this.f2768i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        E2.e eVar = this.f2768i;
                        java.util.List list6 = eVar.f2778d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int size = list6.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            p078i6.u.M0(arrayList, (java.util.List) ((kotlin.jvm.functions.Function0) list6.get(i9)).invoke());
                        }
                        eVar.f2778d = p078i6.w.f23205h;
                        return arrayList;
                    default:
                        E2.e eVar2 = this.f2768i;
                        java.util.List list7 = eVar2.f2779e;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int size2 = list7.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            p078i6.u.M0(arrayList2, (java.util.List) ((kotlin.jvm.functions.Function0) list7.get(i10)).invoke());
                        }
                        eVar2.f2779e = p078i6.w.f23205h;
                        return arrayList2;
                }
            }
        });
        final int i9 = 1;
        this.g = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0(this) { // from class: E2.b

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ E2.e f2768i;

            {
                this.f2768i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i9) {
                    case 0:
                        E2.e eVar = this.f2768i;
                        java.util.List list6 = eVar.f2778d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int size = list6.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            p078i6.u.M0(arrayList, (java.util.List) ((kotlin.jvm.functions.Function0) list6.get(i10)).invoke());
                        }
                        eVar.f2778d = p078i6.w.f23205h;
                        return arrayList;
                    default:
                        E2.e eVar2 = this.f2768i;
                        java.util.List list7 = eVar2.f2779e;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int size2 = list7.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            p078i6.u.M0(arrayList2, (java.util.List) ((kotlin.jvm.functions.Function0) list7.get(i11)).invoke());
                        }
                        eVar2.f2779e = p078i6.w.f23205h;
                        return arrayList2;
                }
            }
        });
    }
}
