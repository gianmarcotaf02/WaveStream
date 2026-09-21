package H0;

import K0.w;
import v5.L;

public final class b {

    public final long f3833a;

    public final long f3834b;

    public final long f3835c;

    public final boolean f3836d;

    public final float f3837e;

    public final long f3838f;
    public final long g;

    public final boolean f3839h;

    public boolean f3840i;

    public b(long j, long j9, long j10, boolean z6, float f9, long j11, long j12, boolean z9) {
        this.f3833a = j;
        this.f3834b = j9;
        this.f3835c = j10;
        this.f3836d = z6;
        this.f3837e = f9;
        this.f3838f = j11;
        this.g = j12;
        this.f3839h = z9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) w.i(this.f3833a));
        sb.append(", uptimeMillis=");
        sb.append(this.f3834b);
        sb.append(", position=");
        sb.append((Object) p181w0.a.i(this.f3835c));
        sb.append(", pressed=");
        sb.append(this.f3836d);
        sb.append(", pressure=");
        sb.append(this.f3837e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f3838f);
        sb.append(", previousPosition=");
        sb.append((Object) p181w0.a.i(this.g));
        sb.append(", previousPressed=");
        sb.append(this.f3839h);
        sb.append(", isConsumed=");
        return L.a(sb, this.f3840i, ')');
    }
}
