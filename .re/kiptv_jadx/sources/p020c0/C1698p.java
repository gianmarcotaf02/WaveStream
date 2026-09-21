package p020c0;

/* JADX INFO: renamed from: c0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1698p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18298b;

    public /* synthetic */ C1698p(int i3, java.lang.Object obj) {
        this.f18297a = i3;
        this.f18298b = obj;
    }

    public final void a() {
        switch (this.f18297a) {
            case 0:
                ((p020c0.C1700q) this.f18298b).f18305A--;
                break;
            default:
                ((p121o0.q) this.f18298b).f26011k--;
                break;
        }
    }

    public final void b() {
        switch (this.f18297a) {
            case 0:
                ((p020c0.C1700q) this.f18298b).f18305A++;
                break;
            default:
                ((p121o0.q) this.f18298b).f26011k++;
                break;
        }
    }
}
