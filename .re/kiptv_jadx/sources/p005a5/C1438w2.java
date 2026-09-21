package p005a5;

/* JADX INFO: renamed from: a5.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1438w2 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p070h6.k f15233i;

    public /* synthetic */ C1438w2(p070h6.k kVar, int i3) {
        this.f15232h = i3;
        this.f15233i = kVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f15232h) {
            case 0:
                java.lang.String filter = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(filter, "filter");
                boolean z6 = false;
                if (O7.x.x0(filter, "(", false) && O7.x.q0(filter, ")", false)) {
                    z6 = true;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.String) this.f15233i.f22539h);
                return Y6.f.m(sb, z6 ? "" : ".", filter);
            case 1:
                java.lang.String filter2 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(filter2, "filter");
                boolean z9 = false;
                if (O7.x.x0(filter2, "(", false) && O7.x.q0(filter2, ")", false)) {
                    z9 = true;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append((java.lang.String) this.f15233i.f22539h);
                return Y6.f.m(sb2, z9 ? "" : ".", filter2);
            default:
                java.lang.String filter3 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(filter3, "filter");
                boolean z10 = false;
                if (O7.x.x0(filter3, "(", false) && O7.x.q0(filter3, ")", false)) {
                    z10 = true;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append((java.lang.String) this.f15233i.f22539h);
                return Y6.f.m(sb3, z10 ? "" : ".", filter3);
        }
    }
}
