package E5;

import java.util.List;
import p005a5.E1;

public final class C0296j0 {

    public final String f3069a;

    public final String f3070b;

    public final E1 f3071c;

    public final boolean f3072d;

    public final float f3073e;

    public final List f3074f;
    public final boolean g;

    public C0296j0(String str, String str2, E1 e6, boolean z6, float f9, List triviaPills, boolean z9) {
        kotlin.jvm.internal.m.e(triviaPills, "triviaPills");
        this.f3069a = str;
        this.f3070b = str2;
        this.f3071c = e6;
        this.f3072d = z6;
        this.f3073e = f9;
        this.f3074f = triviaPills;
        this.g = z9;
    }

    public static C0296j0 a(C0296j0 c0296j0, String str, String str2, E1 e6, float f9, List list, int i3) {
        if ((i3 & 1) != 0) {
            str = c0296j0.f3069a;
        }
        String playlistName = str;
        if ((i3 & 2) != 0) {
            str2 = c0296j0.f3070b;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            e6 = c0296j0.f3071c;
        }
        E1 e9 = e6;
        boolean z6 = (i3 & 8) != 0 ? c0296j0.f3072d : true;
        if ((i3 & 16) != 0) {
            f9 = c0296j0.f3073e;
        }
        float f10 = f9;
        if ((i3 & 32) != 0) {
            list = c0296j0.f3074f;
        }
        List triviaPills = list;
        boolean z9 = (i3 & 64) != 0 ? c0296j0.g : true;
        c0296j0.getClass();
        kotlin.jvm.internal.m.e(playlistName, "playlistName");
        kotlin.jvm.internal.m.e(triviaPills, "triviaPills");
        return new C0296j0(playlistName, str3, e9, z6, f10, triviaPills, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0296j0)) {
            return false;
        }
        C0296j0 c0296j0 = (C0296j0) obj;
        return kotlin.jvm.internal.m.a(this.f3069a, c0296j0.f3069a) && kotlin.jvm.internal.m.a(this.f3070b, c0296j0.f3070b) && this.f3071c == c0296j0.f3071c && this.f3072d == c0296j0.f3072d && Float.compare(this.f3073e, c0296j0.f3073e) == 0 && kotlin.jvm.internal.m.a(this.f3074f, c0296j0.f3074f) && this.g == c0296j0.g;
    }

    public final int hashCode() {
        int iHashCode = this.f3069a.hashCode() * 31;
        String str = this.f3070b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        E1 e6 = this.f3071c;
        return Boolean.hashCode(this.g) + B2.a.b(p121o0.p.c(this.f3073e, p121o0.p.f((iHashCode2 + (e6 != null ? e6.hashCode() : 0)) * 31, 31, this.f3072d), 31), 31, this.f3074f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPlaylistLoadingState(playlistName=");
        sb.append(this.f3069a);
        sb.append(", playlistAvatar=");
        sb.append(this.f3070b);
        sb.append(", error=");
        sb.append(this.f3071c);
        sb.append(", done=");
        sb.append(this.f3072d);
        sb.append(", progress=");
        sb.append(this.f3073e);
        sb.append(", triviaPills=");
        sb.append(this.f3074f);
        sb.append(", showTrivia=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.g, ")");
    }
}
