package K4;

import Y6.f;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

public final class a {
    public static final a g;

    public final int[] f6839a;

    public final int[] f6840b;

    public final b f6841c;

    public final int f6842d;

    public final int f6843e;

    public final int f6844f;

    static {
        new a(4201, 4096, 1);
        new a(AnalyticsListener.EVENT_RENDERER_READY_CHANGED, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        g = new a(285, 256, 0);
        new a(301, 256, 1);
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
        this.f6841c = new b(this, new int[]{0});
    }

    public final int a(int i3, int i9) {
        if (i3 == 0 || i9 == 0) {
            return 0;
        }
        int[] iArr = this.f6840b;
        return this.f6839a[(iArr[i3] + iArr[i9]) % (this.f6842d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f6843e));
        sb.append(',');
        return f.j(sb, this.f6842d, ')');
    }
}
