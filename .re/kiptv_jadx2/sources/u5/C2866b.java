package u5;

import com.google.android.gms.internal.play_billing.M0;

public final class C2866b {

    public final String f28706a;

    public final String f28707b;

    public final String f28708c;

    public final boolean f28709d;

    public final boolean f28710e;

    public C2866b(String id, String providerName, String displayName, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(providerName, "providerName");
        kotlin.jvm.internal.m.e(displayName, "displayName");
        this.f28706a = id;
        this.f28707b = providerName;
        this.f28708c = displayName;
        this.f28709d = z6;
        this.f28710e = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2866b)) {
            return false;
        }
        C2866b c2866b = (C2866b) obj;
        return kotlin.jvm.internal.m.a(this.f28706a, c2866b.f28706a) && kotlin.jvm.internal.m.a(this.f28707b, c2866b.f28707b) && kotlin.jvm.internal.m.a(this.f28708c, c2866b.f28708c) && this.f28709d == c2866b.f28709d && this.f28710e == c2866b.f28710e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28710e) + p121o0.p.f(B2.a.a(B2.a.a(this.f28706a.hashCode() * 31, 31, this.f28707b), 31, this.f28708c), 31, this.f28709d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvCmCategoryUi(id=");
        sb.append(this.f28706a);
        sb.append(", providerName=");
        sb.append(this.f28707b);
        sb.append(", displayName=");
        sb.append(this.f28708c);
        sb.append(", isHidden=");
        sb.append(this.f28709d);
        sb.append(", isLocked=");
        return M0.o(sb, this.f28710e, ")");
    }
}
