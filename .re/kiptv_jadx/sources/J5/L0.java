package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class L0 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J5.O0 f6178i;

    public /* synthetic */ L0(J5.O0 o8, int i3) {
        this.f6177h = i3;
        this.f6178i = o8;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        switch (this.f6177h) {
            case 0:
                V7.n0 n0Var = this.f6178i.f6206d;
                n0Var.i(null, J5.K0.a((J5.K0) n0Var.getValue(), (com.kiptv.core.model.l0) obj, null, null, 125));
                break;
            default:
                com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) obj;
                V7.n0 n0Var2 = this.f6178i.f6206d;
                n0Var2.i(null, J5.K0.a((J5.K0) n0Var2.getValue(), null, playlist != null ? playlist.f20033a : null, playlist != null ? playlist.f20035c : null, 79));
                break;
        }
        return p070h6.A.f22523a;
    }
}
