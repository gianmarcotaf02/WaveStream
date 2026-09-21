package C5;

public final class Z {

    public final int f1184a;

    public final String f1185b;

    public final String f1186c;

    public final String f1187d;

    public final boolean f1188e;

    public final Integer f1189f;
    public final String g;

    public final String f1190h;

    public final String f1191i;
    public final Integer j;

    public final String f1192k;

    public Z(int i3, String name, String str, String str2, boolean z6, Integer num, String str3, String str4, String str5, Integer num2, String str6) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f1184a = i3;
        this.f1185b = name;
        this.f1186c = str;
        this.f1187d = str2;
        this.f1188e = z6;
        this.f1189f = num;
        this.g = str3;
        this.f1190h = str4;
        this.f1191i = str5;
        this.j = num2;
        this.f1192k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return this.f1184a == z6.f1184a && kotlin.jvm.internal.m.a(this.f1185b, z6.f1185b) && kotlin.jvm.internal.m.a(this.f1186c, z6.f1186c) && kotlin.jvm.internal.m.a(this.f1187d, z6.f1187d) && this.f1188e == z6.f1188e && kotlin.jvm.internal.m.a(this.f1189f, z6.f1189f) && kotlin.jvm.internal.m.a(this.g, z6.g) && kotlin.jvm.internal.m.a(this.f1190h, z6.f1190h) && kotlin.jvm.internal.m.a(this.f1191i, z6.f1191i) && kotlin.jvm.internal.m.a(this.j, z6.j) && kotlin.jvm.internal.m.a(this.f1192k, z6.f1192k);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f1184a) * 31, 31, this.f1185b);
        String str = this.f1186c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1187d;
        int iF = p121o0.p.f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f1188e);
        Integer num = this.f1189f;
        int iHashCode2 = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1190h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1191i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f1192k;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPersonInfoUi(personId=");
        sb.append(this.f1184a);
        sb.append(", name=");
        sb.append(this.f1185b);
        sb.append(", character=");
        sb.append(this.f1186c);
        sb.append(", imageUrl=");
        sb.append(this.f1187d);
        sb.append(", isLoading=");
        sb.append(this.f1188e);
        sb.append(", gender=");
        sb.append(this.f1189f);
        sb.append(", birthday=");
        sb.append(this.g);
        sb.append(", birthplace=");
        sb.append(this.f1190h);
        sb.append(", biography=");
        sb.append(this.f1191i);
        sb.append(", episodeCount=");
        sb.append(this.j);
        sb.append(", seriesTitle=");
        return Y6.f.m(sb, this.f1192k, ")");
    }
}
