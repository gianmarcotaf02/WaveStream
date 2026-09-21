package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends p078i6.AbstractC2251b {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p078i6.H f23180l;

    public G(p078i6.H h9) {
        this.f23180l = h9;
        this.j = h9.f23183k;
        this.f23179k = h9.j;
    }

    @Override // p078i6.AbstractC2251b
    public final void a() {
        int i3 = this.j;
        if (i3 == 0) {
            this.f23191h = 2;
            return;
        }
        p078i6.H h9 = this.f23180l;
        java.lang.Object[] objArr = h9.f23181h;
        int i9 = this.f23179k;
        this.f23192i = objArr[i9];
        this.f23191h = 1;
        this.f23179k = (i9 + 1) % h9.f23182i;
        this.j = i3 - 1;
    }
}
