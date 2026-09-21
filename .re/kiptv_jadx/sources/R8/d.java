package R8;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P8.a f9082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S8.a f9083c;

    public d(int i3) {
        this.f9081a = i3;
        switch (i3) {
            case 1:
                this.f9082b = new R8.g();
                new java.util.concurrent.ConcurrentHashMap();
                this.f9083c = new A.a(18);
                break;
            default:
                this.f9082b = new R8.c();
                new java.util.concurrent.ConcurrentHashMap();
                this.f9083c = new B3.o(23);
                break;
        }
    }

    public final P8.a a() {
        switch (this.f9081a) {
            case 0:
                return (R8.c) this.f9082b;
            default:
                return (R8.g) this.f9082b;
        }
    }
}
