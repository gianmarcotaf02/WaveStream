package p104m1;

public final class e {

    public static final int f25161b = 66305;

    public final int f25162a;

    public static String a(int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i9 = i3 & 255;
        String str3 = "Invalid";
        if (i9 == 1) {
            str = "Strategy.Simple";
        } else if (i9 == 2) {
            str = "Strategy.HighQuality";
        } else if (i9 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i9 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", strictness=");
        int i10 = (i3 >> 8) & 255;
        if (i10 == 1) {
            str2 = "Strictness.None";
        } else if (i10 == 2) {
            str2 = "Strictness.Loose";
        } else if (i10 == 3) {
            str2 = "Strictness.Normal";
        } else if (i10 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i10 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(", wordBreak=");
        int i11 = (i3 >> 16) & 255;
        if (i11 == 1) {
            str3 = "WordBreak.None";
        } else if (i11 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i11 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb.append((Object) str3);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f25162a == ((e) obj).f25162a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25162a);
    }

    public final String toString() {
        return a(this.f25162a);
    }
}
