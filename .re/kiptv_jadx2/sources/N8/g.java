package N8;

import M8.A;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

public final class g {

    public final A f7487a;

    public final boolean f7488b;

    public final String f7489c;

    public final long f7490d;

    public final long f7491e;

    public final long f7492f;
    public final int g;

    public final long f7493h;

    public final int f7494i;
    public final int j;

    public final Long f7495k;

    public final Long f7496l;

    public final Long f7497m;

    public final Integer f7498n;

    public final Integer f7499o;

    public final Integer f7500p;

    public final ArrayList f7501q;

    public g(A canonicalPath, boolean z6, String comment, long j, long j9, long j10, int i3, long j11, int i9, int i10, Long l2, Long l9, Long l10, Integer num, Integer num2, Integer num3) {
        m.e(canonicalPath, "canonicalPath");
        m.e(comment, "comment");
        this.f7487a = canonicalPath;
        this.f7488b = z6;
        this.f7489c = comment;
        this.f7490d = j;
        this.f7491e = j9;
        this.f7492f = j10;
        this.g = i3;
        this.f7493h = j11;
        this.f7494i = i9;
        this.j = i10;
        this.f7495k = l2;
        this.f7496l = l9;
        this.f7497m = l10;
        this.f7498n = num;
        this.f7499o = num2;
        this.f7500p = num3;
        this.f7501q = new ArrayList();
    }

    public g(A a2, boolean z6, String str, long j, long j9, long j10, int i3, long j11, int i9, int i10, Long l2, Long l9, Long l10, int i11) {
        this(a2, z6, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j, (i11 & 16) != 0 ? -1L : j9, (i11 & 32) != 0 ? -1L : j10, (i11 & 64) != 0 ? -1 : i3, (i11 & 128) != 0 ? -1L : j11, (i11 & 256) != 0 ? -1 : i9, (i11 & 512) != 0 ? -1 : i10, (i11 & 1024) != 0 ? null : l2, (i11 & 2048) != 0 ? null : l9, (i11 & 4096) != 0 ? null : l10, null, null, null);
    }
}
