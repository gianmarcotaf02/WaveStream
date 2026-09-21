package p044e7;

import androidx.media3.exoplayer.analytics.AnalyticsListener;

public final class q {

    public static final q f21471k = new q(false, false, false, false, false, new q(false, false, false, false, false, null, false, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED), false, null, null, 988);

    public final boolean f21472a;

    public final boolean f21473b;

    public final boolean f21474c;

    public final boolean f21475d;

    public final boolean f21476e;

    public final q f21477f;
    public final boolean g;

    public final q f21478h;

    public final q f21479i;
    public final boolean j;

    public q(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, q qVar, boolean z13, q qVar2, q qVar3, int i3) {
        z6 = (i3 & 1) != 0 ? true : z6;
        z9 = (i3 & 2) != 0 ? true : z9;
        z10 = (i3 & 4) != 0 ? false : z10;
        z11 = (i3 & 8) != 0 ? false : z11;
        z12 = (i3 & 16) != 0 ? false : z12;
        qVar = (i3 & 32) != 0 ? null : qVar;
        z13 = (i3 & 64) != 0 ? true : z13;
        qVar2 = (i3 & 128) != 0 ? qVar : qVar2;
        qVar3 = (i3 & 256) != 0 ? qVar : qVar3;
        boolean z14 = (i3 & 512) == 0;
        this.f21472a = z6;
        this.f21473b = z9;
        this.f21474c = z10;
        this.f21475d = z11;
        this.f21476e = z12;
        this.f21477f = qVar;
        this.g = z13;
        this.f21478h = qVar2;
        this.f21479i = qVar3;
        this.j = z14;
    }
}
