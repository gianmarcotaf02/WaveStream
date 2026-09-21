package K4;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final K4.a g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f6840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K4.b f6841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6844f;

    static {
        new K4.a(4201, 4096, 1);
        new K4.a(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_RENDERER_READY_CHANGED, 1024, 1);
        new K4.a(67, 64, 1);
        new K4.a(19, 16, 1);
        g = new K4.a(285, 256, 0);
        new K4.a(301, 256, 1);
    }

    public a(int i3, int i9, int i10) {
        this.f6843e = i3;
        this.f6842d = i9;
        this.f6844f = i10;
        this.f6839a = new int[i9];
        this.f6840b = new int[i9];
        int i11 = 1;
        for (int i12 = 0; i12 < i9; i12++) {
            this.f6839a[i12] = i11;
            i11 *= 2;
            if (i11 >= i9) {
                i11 = (i11 ^ i3) & (i9 - 1);
            }
        }
        for (int i13 = 0; i13 < i9 - 1; i13++) {
            this.f6840b[this.f6839a[i13]] = i13;
        }
        this.f6841c = new K4.b(this, new int[]{0});
    }

    public final int a(int i3, int i9) {
        if (i3 == 0 || i9 == 0) {
            return 0;
        }
        int[] iArr = this.f6840b;
        return this.f6839a[(iArr[i3] + iArr[i9]) % (this.f6842d - 1)];
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GF(0x");
        sb.append(java.lang.Integer.toHexString(this.f6843e));
        sb.append(',');
        return Y6.f.j(sb, this.f6842d, ')');
    }
}
