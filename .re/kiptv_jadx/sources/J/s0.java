package J;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements p020c0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f5909b;

    public /* synthetic */ s0(int i3, p020c0.X x9) {
        this.f5908a = i3;
        this.f5909b = x9;
    }

    @Override // p020c0.H
    public final void dispose() {
        switch (this.f5908a) {
            case 0:
                p020c0.X x9 = this.f5909b;
                if (((p202z.m) x9.getValue()) != null) {
                    x9.setValue(null);
                }
                break;
            default:
                t5.O1.e(this.f5909b);
                break;
        }
    }
}
