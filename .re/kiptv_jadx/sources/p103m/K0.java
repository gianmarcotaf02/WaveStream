package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24935f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24936h;

    public final void a(int i3, int i9) {
        this.f24932c = i3;
        this.f24933d = i9;
        this.f24936h = true;
        if (this.g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f24930a = i9;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f24931b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f24930a = i3;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f24931b = i9;
        }
    }
}
