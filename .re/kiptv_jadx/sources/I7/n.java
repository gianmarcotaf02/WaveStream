package I7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements I7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f5577b;

    public /* synthetic */ n(java.lang.String str, int i3) {
        this.f5576a = i3;
        this.f5577b = str;
    }

    @Override // I7.e
    public final java.lang.String b(Y6.g gVar) {
        switch (this.f5576a) {
            case 0:
                break;
        }
        return E8.d.S(this, gVar);
    }

    @Override // I7.e
    public final java.lang.String getDescription() {
        switch (this.f5576a) {
            case 0:
                break;
        }
        return this.f5577b;
    }
}
