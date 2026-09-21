package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements java.util.Comparator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Y0.g f11032i = new Y0.g(0);
    public static final Y0.g j = new Y0.g(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Y0.g f11033k = new Y0.g(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11034h;

    public /* synthetic */ g(int i3) {
        this.f11034h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f11034h) {
            case 0:
                p181w0.b bVarH = ((Y0.p) obj).h();
                p181w0.b bVarH2 = ((Y0.p) obj2).h();
                int iCompare = java.lang.Float.compare(bVarH.f29746a, bVarH2.f29746a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = java.lang.Float.compare(bVarH.f29747b, bVarH2.f29747b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = java.lang.Float.compare(bVarH.f29749d, bVarH2.f29749d);
                return iCompare3 != 0 ? iCompare3 : java.lang.Float.compare(bVarH.f29748c, bVarH2.f29748c);
            case 1:
                p181w0.b bVarH3 = ((Y0.p) obj).h();
                p181w0.b bVarH4 = ((Y0.p) obj2).h();
                int iCompare4 = java.lang.Float.compare(bVarH4.f29748c, bVarH3.f29748c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = java.lang.Float.compare(bVarH3.f29747b, bVarH4.f29747b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = java.lang.Float.compare(bVarH3.f29749d, bVarH4.f29749d);
                return iCompare6 != 0 ? iCompare6 : java.lang.Float.compare(bVarH4.f29746a, bVarH3.f29746a);
            default:
                p070h6.k kVar = (p070h6.k) obj;
                p070h6.k kVar2 = (p070h6.k) obj2;
                int iCompare7 = java.lang.Float.compare(((p181w0.b) kVar.f22539h).f29747b, ((p181w0.b) kVar2.f22539h).f29747b);
                return iCompare7 != 0 ? iCompare7 : java.lang.Float.compare(((p181w0.b) kVar.f22539h).f29749d, ((p181w0.b) kVar2.f22539h).f29749d);
        }
    }
}
