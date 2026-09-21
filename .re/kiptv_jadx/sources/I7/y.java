package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends I7.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I7.y f5609d = new I7.y("must have no value parameters", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I7.y f5610e = new I7.y("must have a single value parameter", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(java.lang.String str, int i3) {
        super(str, 1);
        this.f5611c = i3;
    }

    @Override // I7.e
    public final boolean a(Y6.g gVar) {
        switch (this.f5611c) {
            case 0:
                return gVar.O().isEmpty();
            default:
                return gVar.O().size() == 1;
        }
    }
}
