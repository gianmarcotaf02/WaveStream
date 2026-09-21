package S4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9303i;

    public /* synthetic */ B(int i3, java.lang.Object obj) {
        this.f9302h = i3;
        this.f9303i = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f9302h) {
            case 0:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 1:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 2:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 3:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 4:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 5:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 6:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 7:
                return ((java.lang.Number) ((S4.A) this.f9303i).invoke(obj, obj2)).intValue();
            case 8:
                return ((java.lang.Number) ((Y0.k) this.f9303i).invoke(obj, obj2)).intValue();
            case 9:
                return ((java.lang.Number) ((p011b1.y) this.f9303i).invoke(obj, obj2)).intValue();
            default:
                for (p194x6.j jVar : (p194x6.j[]) this.f9303i) {
                    int iO = com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Comparable) jVar.invoke(obj), (java.lang.Comparable) jVar.invoke(obj2));
                    if (iO != 0) {
                        return iO;
                    }
                }
                return 0;
        }
    }
}
