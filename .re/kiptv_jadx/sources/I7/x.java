package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends I7.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5607c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5608d;

    /* JADX WARN: Illegal instructions before constructor call */
    public x(int i3) {
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "must have at least ", " value parameter");
        sbT.append(i3 > 1 ? androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS : "");
        super(sbT.toString(), 1);
        this.f5608d = i3;
    }

    @Override // I7.e
    public final boolean a(Y6.g gVar) {
        switch (this.f5607c) {
            case 0:
                return gVar.O().size() >= this.f5608d;
            default:
                return gVar.O().size() == this.f5608d;
        }
    }

    public x() {
        super("must have exactly 2 value parameters", 1);
        this.f5608d = 2;
    }
}
