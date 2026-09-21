package C5;

import java.util.ArrayList;
import java.util.List;

public final class S {

    public final EnumC0107f f1115a;

    public final List f1116b;

    public final String f1117c;

    public final String f1118d;

    public final W f1119e;

    public final boolean f1120f;
    public final int g;

    public final int f1121h;

    public final int f1122i;

    public S(EnumC0107f enumC0107f, List list, String activeTileId, String str, W layout, boolean z6, int i3, int i9, int i10) {
        kotlin.jvm.internal.m.e(activeTileId, "activeTileId");
        kotlin.jvm.internal.m.e(layout, "layout");
        this.f1115a = enumC0107f;
        this.f1116b = list;
        this.f1117c = activeTileId;
        this.f1118d = str;
        this.f1119e = layout;
        this.f1120f = z6;
        this.g = i3;
        this.f1121h = i9;
        this.f1122i = i10;
    }

    public static S a(S s9, EnumC0107f enumC0107f, ArrayList arrayList, String str, String str2, W w6, boolean z6, int i3, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            enumC0107f = s9.f1115a;
        }
        EnumC0107f enumC0107f2 = enumC0107f;
        List list = arrayList;
        if ((i11 & 2) != 0) {
            list = s9.f1116b;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            str = s9.f1117c;
        }
        String activeTileId = str;
        if ((i11 & 8) != 0) {
            str2 = s9.f1118d;
        }
        String str3 = str2;
        if ((i11 & 16) != 0) {
            w6 = s9.f1119e;
        }
        W layout = w6;
        boolean z9 = (i11 & 32) != 0 ? s9.f1120f : z6;
        int i12 = (i11 & 64) != 0 ? s9.g : i3;
        int i13 = (i11 & 128) != 0 ? s9.f1121h : i9;
        int i14 = (i11 & 256) != 0 ? s9.f1122i : i10;
        kotlin.jvm.internal.m.e(activeTileId, "activeTileId");
        kotlin.jvm.internal.m.e(layout, "layout");
        return new S(enumC0107f2, list2, activeTileId, str3, layout, z9, i12, i13, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s9 = (S) obj;
        return this.f1115a == s9.f1115a && kotlin.jvm.internal.m.a(this.f1116b, s9.f1116b) && kotlin.jvm.internal.m.a(this.f1117c, s9.f1117c) && kotlin.jvm.internal.m.a(this.f1118d, s9.f1118d) && this.f1119e == s9.f1119e && this.f1120f == s9.f1120f && this.g == s9.g && this.f1121h == s9.f1121h && this.f1122i == s9.f1122i;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.b(this.f1115a.hashCode() * 31, 31, this.f1116b), 31, this.f1117c);
        String str = this.f1118d;
        return Integer.hashCode(this.f1122i) + p121o0.p.d(this.f1121h, p121o0.p.d(this.g, p121o0.p.f((this.f1119e.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f1120f), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvFloatingPlaybackState(mode=");
        sb.append(this.f1115a);
        sb.append(", tiles=");
        sb.append(this.f1116b);
        sb.append(", activeTileId=");
        sb.append(this.f1117c);
        sb.append(", primaryTileId=");
        sb.append(this.f1118d);
        sb.append(", layout=");
        sb.append(this.f1119e);
        sb.append(", surfacesReady=");
        sb.append(this.f1120f);
        sb.append(", surfaceGeneration=");
        sb.append(this.g);
        sb.append(", maxReachedTick=");
        sb.append(this.f1121h);
        sb.append(", vodBlockedTick=");
        return Y6.f.k(sb, this.f1122i, ")");
    }
}
