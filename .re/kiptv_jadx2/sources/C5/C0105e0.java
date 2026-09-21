package C5;

public final class C0105e0 extends AbstractC0108f0 {

    public final int f1306a;

    public final int f1307b;

    public final int f1308c;

    public final boolean f1309d;

    public C0105e0(boolean z6, int i3, int i9, int i10) {
        this.f1306a = i3;
        this.f1307b = i9;
        this.f1308c = i10;
        this.f1309d = z6;
    }

    @Override
    public final boolean a() {
        return this.f1309d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0105e0)) {
            return false;
        }
        C0105e0 c0105e0 = (C0105e0) obj;
        return this.f1306a == c0105e0.f1306a && this.f1307b == c0105e0.f1307b && this.f1308c == c0105e0.f1308c && this.f1309d == c0105e0.f1309d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1309d) + p121o0.p.d(this.f1308c, p121o0.p.d(this.f1307b, Integer.hashCode(this.f1306a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Series(seriesId=");
        sb.append(this.f1306a);
        sb.append(", season=");
        sb.append(this.f1307b);
        sb.append(", episode=");
        sb.append(this.f1308c);
        sb.append(", forceRestart=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f1309d, ")");
    }
}
