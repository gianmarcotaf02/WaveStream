package K0;

import java.util.ArrayList;

public final class x {

    public final long f6738a;

    public final long f6739b;

    public final long f6740c;

    public final boolean f6741d;

    public final float f6742e;

    public final long f6743f;
    public final long g;

    public final boolean f6744h;

    public final int f6745i;
    public final long j;

    public final ArrayList f6746k;

    public final long f6747l;

    public boolean f6748m;

    public boolean f6749n;

    public x f6750o;

    public x(long j, long j9, long j10, boolean z6, float f9, long j11, long j12, boolean z9, boolean z10, int i3, long j13) {
        this.f6738a = j;
        this.f6739b = j9;
        this.f6740c = j10;
        this.f6741d = z6;
        this.f6742e = f9;
        this.f6743f = j11;
        this.g = j12;
        this.f6744h = z9;
        this.f6745i = i3;
        this.j = j13;
        this.f6747l = 0L;
        this.f6748m = z10;
        this.f6749n = z10;
    }

    public final void a() {
        x xVar = this.f6750o;
        if (xVar == null) {
            this.f6748m = true;
            this.f6749n = true;
        } else if (xVar != null) {
            xVar.a();
        }
    }

    public final boolean b() {
        x xVar = this.f6750o;
        if (xVar != null) {
            return xVar.b();
        }
        return this.f6748m || this.f6749n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) w.i(this.f6738a));
        sb.append(", uptimeMillis=");
        sb.append(this.f6739b);
        sb.append(", position=");
        sb.append((Object) p181w0.a.i(this.f6740c));
        sb.append(", pressed=");
        sb.append(this.f6741d);
        sb.append(", pressure=");
        sb.append(this.f6742e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f6743f);
        sb.append(", previousPosition=");
        sb.append((Object) p181w0.a.i(this.g));
        sb.append(", previousPressed=");
        sb.append(this.f6744h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) I.a(this.f6745i));
        sb.append(", historical=");
        Object obj = this.f6746k;
        if (obj == null) {
            obj = p078i6.w.f23205h;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) p181w0.a.i(this.j));
        sb.append(')');
        return sb.toString();
    }

    public x(long j, long j9, long j10, boolean z6, float f9, long j11, long j12, boolean z9, int i3, ArrayList arrayList, long j13, long j14) {
        this(j, j9, j10, z6, f9, j11, j12, z9, false, i3, j13);
        this.f6746k = arrayList;
        this.f6747l = j14;
    }
}
