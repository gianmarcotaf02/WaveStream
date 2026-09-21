package J5;

import com.kiptv.core.model.SubscriptionStatus;
import java.util.List;

public final class A {

    public final String f6028a;

    public final String f6029b;

    public final List f6030c;

    public final com.kiptv.core.model.l0 f6031d;

    public final boolean f6032e;

    public final SubscriptionStatus f6033f;
    public final int g;

    public final int f6034h;

    public final double f6035i;
    public final boolean j;

    public final boolean f6036k;

    public final String f6037l;

    public final boolean f6038m;

    public final List f6039n;

    public final boolean f6040o;

    public final String f6041p;

    public A(String str, String str2, List providers, com.kiptv.core.model.l0 tier, boolean z6, SubscriptionStatus subscriptionStatus, int i3, int i9, double d4, boolean z9, boolean z10, String str3, boolean z11, List devices, boolean z12, String str4) {
        kotlin.jvm.internal.m.e(providers, "providers");
        kotlin.jvm.internal.m.e(tier, "tier");
        kotlin.jvm.internal.m.e(subscriptionStatus, "subscriptionStatus");
        kotlin.jvm.internal.m.e(devices, "devices");
        this.f6028a = str;
        this.f6029b = str2;
        this.f6030c = providers;
        this.f6031d = tier;
        this.f6032e = z6;
        this.f6033f = subscriptionStatus;
        this.g = i3;
        this.f6034h = i9;
        this.f6035i = d4;
        this.j = z9;
        this.f6036k = z10;
        this.f6037l = str3;
        this.f6038m = z11;
        this.f6039n = devices;
        this.f6040o = z12;
        this.f6041p = str4;
    }

    public static A a(A a2, com.kiptv.core.model.l0 l0Var, boolean z6, SubscriptionStatus subscriptionStatus, int i3, int i9, double d4, boolean z9, boolean z10, String str, boolean z11, List list, boolean z12, int i10) {
        String str2 = a2.f6028a;
        String str3 = a2.f6029b;
        List providers = a2.f6030c;
        com.kiptv.core.model.l0 tier = (i10 & 8) != 0 ? a2.f6031d : l0Var;
        boolean z13 = (i10 & 16) != 0 ? a2.f6032e : z6;
        SubscriptionStatus subscriptionStatus2 = (i10 & 32) != 0 ? a2.f6033f : subscriptionStatus;
        int i11 = (i10 & 64) != 0 ? a2.g : i3;
        int i12 = (i10 & 128) != 0 ? a2.f6034h : i9;
        double d6 = (i10 & 256) != 0 ? a2.f6035i : d4;
        boolean z14 = (i10 & 512) != 0 ? a2.j : z9;
        boolean z15 = (i10 & 1024) != 0 ? a2.f6036k : z10;
        String str4 = (i10 & 2048) != 0 ? a2.f6037l : str;
        boolean z16 = (i10 & 4096) != 0 ? a2.f6038m : z11;
        List devices = (i10 & 8192) != 0 ? a2.f6039n : list;
        boolean z17 = (i10 & 16384) != 0 ? a2.f6040o : z12;
        String str5 = a2.f6041p;
        a2.getClass();
        kotlin.jvm.internal.m.e(providers, "providers");
        kotlin.jvm.internal.m.e(tier, "tier");
        kotlin.jvm.internal.m.e(subscriptionStatus2, "subscriptionStatus");
        kotlin.jvm.internal.m.e(devices, "devices");
        return new A(str2, str3, providers, tier, z13, subscriptionStatus2, i11, i12, d6, z14, z15, str4, z16, devices, z17, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a2 = (A) obj;
        return kotlin.jvm.internal.m.a(this.f6028a, a2.f6028a) && kotlin.jvm.internal.m.a(this.f6029b, a2.f6029b) && kotlin.jvm.internal.m.a(this.f6030c, a2.f6030c) && this.f6031d == a2.f6031d && this.f6032e == a2.f6032e && kotlin.jvm.internal.m.a(this.f6033f, a2.f6033f) && this.g == a2.g && this.f6034h == a2.f6034h && Double.compare(this.f6035i, a2.f6035i) == 0 && this.j == a2.j && this.f6036k == a2.f6036k && kotlin.jvm.internal.m.a(this.f6037l, a2.f6037l) && this.f6038m == a2.f6038m && kotlin.jvm.internal.m.a(this.f6039n, a2.f6039n) && this.f6040o == a2.f6040o && kotlin.jvm.internal.m.a(this.f6041p, a2.f6041p);
    }

    public final int hashCode() {
        String str = this.f6028a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6029b;
        int iF = p121o0.p.f(p121o0.p.f((Double.hashCode(this.f6035i) + p121o0.p.d(this.f6034h, p121o0.p.d(this.g, (this.f6033f.hashCode() + p121o0.p.f((this.f6031d.hashCode() + B2.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f6030c)) * 31, 31, this.f6032e)) * 31, 31), 31)) * 31, 31, this.j), 31, this.f6036k);
        String str3 = this.f6037l;
        return this.f6041p.hashCode() + p121o0.p.f(B2.a.b(p121o0.p.f((iF + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f6038m), 31, this.f6039n), 31, this.f6040o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvAccountDetailUiState(email=");
        sb.append(this.f6028a);
        sb.append(", photoUrl=");
        sb.append(this.f6029b);
        sb.append(", providers=");
        sb.append(this.f6030c);
        sb.append(", tier=");
        sb.append(this.f6031d);
        sb.append(", hasUnlimitedPlaylists=");
        sb.append(this.f6032e);
        sb.append(", subscriptionStatus=");
        sb.append(this.f6033f);
        sb.append(", usedMinutes=");
        sb.append(this.g);
        sb.append(", limitMinutes=");
        sb.append(this.f6034h);
        sb.append(", usagePercentage=");
        sb.append(this.f6035i);
        sb.append(", isNearLimit=");
        sb.append(this.j);
        sb.append(", isDeleting=");
        sb.append(this.f6036k);
        sb.append(", deleteError=");
        sb.append(this.f6037l);
        sb.append(", confirmDelete=");
        sb.append(this.f6038m);
        sb.append(", devices=");
        sb.append(this.f6039n);
        sb.append(", devicesLoading=");
        sb.append(this.f6040o);
        sb.append(", currentDeviceId=");
        return Y6.f.m(sb, this.f6041p, ")");
    }
}
