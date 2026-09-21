package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements java.util.Comparator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.l0 f8450i = new Q0.l0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8451h;

    public /* synthetic */ l0(int i3) {
        this.f8451h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f8451h) {
            case 0:
                Q0.F f9 = (Q0.F) obj;
                Q0.F f10 = (Q0.F) obj2;
                int iF = kotlin.jvm.internal.m.f(f10.f8256x, f9.f8256x);
                return iF != 0 ? iF : kotlin.jvm.internal.m.f(f9.hashCode(), f10.hashCode());
            default:
                Q0.F f11 = (Q0.F) obj;
                Q0.F f12 = (Q0.F) obj2;
                int iF2 = kotlin.jvm.internal.m.f(f11.f8256x, f12.f8256x);
                return iF2 != 0 ? iF2 : kotlin.jvm.internal.m.f(f11.hashCode(), f12.hashCode());
        }
    }
}
