package com.kiptv.core.model;

@p119n8.i(with = G0.class)
public final class F0 {
    public static final XtreamEpisodeInfo$Companion Companion = new XtreamEpisodeInfo$Companion();

    public final String f19767a;

    public final String f19768b;

    public final String f19769c;

    public F0(String str, String str2, String str3) {
        this.f19767a = str;
        this.f19768b = str2;
        this.f19769c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f9 = (F0) obj;
        return kotlin.jvm.internal.m.a(this.f19767a, f9.f19767a) && kotlin.jvm.internal.m.a(this.f19768b, f9.f19768b) && kotlin.jvm.internal.m.a(this.f19769c, f9.f19769c);
    }

    public final int hashCode() {
        String str = this.f19767a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19768b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19769c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XtreamEpisodeInfo(duration=");
        sb.append(this.f19767a);
        sb.append(", plot=");
        sb.append(this.f19768b);
        sb.append(", movieImage=");
        return Y6.f.m(sb, this.f19769c, ")");
    }
}
