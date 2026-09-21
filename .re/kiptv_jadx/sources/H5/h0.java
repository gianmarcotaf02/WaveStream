package H5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H5.E0 f4215i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f4216k;

    public /* synthetic */ h0(H5.E0 e6, int i3, p194x6.j jVar, int i9) {
        this.f4214h = i9;
        this.f4215i = e6;
        this.j = i3;
        this.f4216k = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i3 = this.f4214h;
        java.lang.Integer num = (java.lang.Integer) obj;
        num.getClass();
        switch (i3) {
            case 0:
                this.f4215i.f4068h = androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST + this.j;
                this.f4216k.invoke(num);
                break;
            default:
                this.f4215i.f4068h = androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS + this.j;
                this.f4216k.invoke(num);
                break;
        }
        return p070h6.A.f22523a;
    }
}
