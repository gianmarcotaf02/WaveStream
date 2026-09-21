package C5;

public final class C0092a {

    public final String f1198a;

    public final int f1199b;

    public final boolean f1200c;

    public final String f1201d;

    public final String f1202e;

    public final boolean f1203f;

    public C0092a(String str, int i3, boolean z6, String channelName, String str2, boolean z9) {
        kotlin.jvm.internal.m.e(channelName, "channelName");
        this.f1198a = str;
        this.f1199b = i3;
        this.f1200c = z6;
        this.f1201d = channelName;
        this.f1202e = str2;
        this.f1203f = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0092a)) {
            return false;
        }
        C0092a c0092a = (C0092a) obj;
        return kotlin.jvm.internal.m.a(this.f1198a, c0092a.f1198a) && this.f1199b == c0092a.f1199b && this.f1200c == c0092a.f1200c && kotlin.jvm.internal.m.a(this.f1201d, c0092a.f1201d) && kotlin.jvm.internal.m.a(this.f1202e, c0092a.f1202e) && this.f1203f == c0092a.f1203f;
    }

    public final int hashCode() {
        int iA = B2.a.a(p121o0.p.f(p121o0.p.d(this.f1199b, this.f1198a.hashCode() * 31, 31), 31, this.f1200c), 31, this.f1201d);
        String str = this.f1202e;
        return Boolean.hashCode(this.f1203f) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityVariantUi(label=");
        sb.append(this.f1198a);
        sb.append(", streamId=");
        sb.append(this.f1199b);
        sb.append(", isCurrent=");
        sb.append(this.f1200c);
        sb.append(", channelName=");
        sb.append(this.f1201d);
        sb.append(", categoryName=");
        sb.append(this.f1202e);
        sb.append(", hasCatchup=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f1203f, ")");
    }
}
