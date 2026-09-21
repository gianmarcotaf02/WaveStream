package C5;

import java.util.List;

public final class Y {

    public final int f1173a;

    public final String f1174b;

    public final String f1175c;

    public final String f1176d;

    public final Float f1177e;

    public final String f1178f;
    public final boolean g;

    public final List f1179h;

    public Y(int i3, String title, String str, String str2, Float f9, String str3, boolean z6, List list) {
        kotlin.jvm.internal.m.e(title, "title");
        this.f1173a = i3;
        this.f1174b = title;
        this.f1175c = str;
        this.f1176d = str2;
        this.f1177e = f9;
        this.f1178f = str3;
        this.g = z6;
        this.f1179h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return this.f1173a == y.f1173a && kotlin.jvm.internal.m.a(this.f1174b, y.f1174b) && kotlin.jvm.internal.m.a(this.f1175c, y.f1175c) && kotlin.jvm.internal.m.a(this.f1176d, y.f1176d) && kotlin.jvm.internal.m.a(this.f1177e, y.f1177e) && kotlin.jvm.internal.m.a(this.f1178f, y.f1178f) && this.g == y.g && kotlin.jvm.internal.m.a(this.f1179h, y.f1179h);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f1173a) * 31, 31, this.f1174b);
        String str = this.f1175c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1176d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f9 = this.f1177e;
        int iHashCode3 = (iHashCode2 + (f9 == null ? 0 : f9.hashCode())) * 31;
        String str3 = this.f1178f;
        return this.f1179h.hashCode() + p121o0.p.f((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        return "TvPanelChannelUi(streamId=" + this.f1173a + ", title=" + this.f1174b + ", logoUrl=" + this.f1175c + ", nowTitle=" + this.f1176d + ", nowProgress=" + this.f1177e + ", nextTitle=" + this.f1178f + ", hasCatchup=" + this.g + ", qualityLabels=" + this.f1179h + ")";
    }
}
