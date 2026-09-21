package p033d3;

import Y6.f;

public final class h extends a {

    public final Integer f21195a;

    public final String f21196b;

    public final String f21197c;

    public final String f21198d;

    public final String f21199e;

    public final String f21200f;
    public final String g;

    public final String f21201h;

    public final String f21202i;
    public final String j;

    public final String f21203k;

    public final String f21204l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f21195a = num;
        this.f21196b = str;
        this.f21197c = str2;
        this.f21198d = str3;
        this.f21199e = str4;
        this.f21200f = str5;
        this.g = str6;
        this.f21201h = str7;
        this.f21202i = str8;
        this.j = str9;
        this.f21203k = str10;
        this.f21204l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f21195a;
            if (num != null ? num.equals(((h) aVar).f21195a) : ((h) aVar).f21195a == null) {
                String str = this.f21196b;
                if (str != null ? str.equals(((h) aVar).f21196b) : ((h) aVar).f21196b == null) {
                    String str2 = this.f21197c;
                    if (str2 != null ? str2.equals(((h) aVar).f21197c) : ((h) aVar).f21197c == null) {
                        String str3 = this.f21198d;
                        if (str3 != null ? str3.equals(((h) aVar).f21198d) : ((h) aVar).f21198d == null) {
                            String str4 = this.f21199e;
                            if (str4 != null ? str4.equals(((h) aVar).f21199e) : ((h) aVar).f21199e == null) {
                                String str5 = this.f21200f;
                                if (str5 != null ? str5.equals(((h) aVar).f21200f) : ((h) aVar).f21200f == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(((h) aVar).g) : ((h) aVar).g == null) {
                                        String str7 = this.f21201h;
                                        if (str7 != null ? str7.equals(((h) aVar).f21201h) : ((h) aVar).f21201h == null) {
                                            String str8 = this.f21202i;
                                            if (str8 != null ? str8.equals(((h) aVar).f21202i) : ((h) aVar).f21202i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((h) aVar).j) : ((h) aVar).j == null) {
                                                    String str10 = this.f21203k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f21203k) : ((h) aVar).f21203k == null) {
                                                        String str11 = this.f21204l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f21204l) : ((h) aVar).f21204l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f21195a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f21196b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f21197c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f21198d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f21199e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f21200f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f21201h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f21202i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f21203k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f21204l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f21195a);
        sb.append(", model=");
        sb.append(this.f21196b);
        sb.append(", hardware=");
        sb.append(this.f21197c);
        sb.append(", device=");
        sb.append(this.f21198d);
        sb.append(", product=");
        sb.append(this.f21199e);
        sb.append(", osBuild=");
        sb.append(this.f21200f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.f21201h);
        sb.append(", locale=");
        sb.append(this.f21202i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.f21203k);
        sb.append(", applicationBuild=");
        return f.m(sb, this.f21204l, "}");
    }
}
