package p082j2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends android.media.VolumeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T1.q f23905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T1.q qVar, int i3, int i9, int i10, java.lang.String str) {
        super(i3, i9, i10, str);
        this.f23905a = qVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i3) {
        T1.q qVar = this.f23905a;
        p105m2.C2608f c2608f = (p105m2.C2608f) ((j1.l) qVar.f9705f).f23900k;
        c2608f.f25298m.post(new p105m2.RunnableC2606d(qVar, i3, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i3) {
        T1.q qVar = this.f23905a;
        p105m2.C2608f c2608f = (p105m2.C2608f) ((j1.l) qVar.f9705f).f23900k;
        c2608f.f25298m.post(new p105m2.RunnableC2606d(qVar, i3, 0));
    }
}
