package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends I7.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I7.m f5573d = new I7.m("must be a member function", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I7.m f5574e = new I7.m("must be a member or an extension function", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(java.lang.String str, int i3) {
        super(str, 0);
        this.f5575c = i3;
    }

    @Override // I7.e
    public final boolean a(Y6.g gVar) {
        switch (this.f5575c) {
            case 0:
                return gVar.f8689q != null;
            default:
                return (gVar.f8689q == null && gVar.f8688p == null) ? false : true;
        }
    }
}
