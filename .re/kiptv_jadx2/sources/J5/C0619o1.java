package J5;

public final class C0619o1 {

    public final boolean f6523a;

    public final String f6524b;

    public final String f6525c;

    public final Integer f6526d;

    public final boolean f6527e;

    public final String f6528f;
    public final String g;

    public C0619o1(boolean z6, String str, String str2, Integer num, boolean z9, String str3, String str4) {
        this.f6523a = z6;
        this.f6524b = str;
        this.f6525c = str2;
        this.f6526d = num;
        this.f6527e = z9;
        this.f6528f = str3;
        this.g = str4;
    }

    public static C0619o1 a(C0619o1 c0619o1, boolean z6, String str, String str2, Integer num, boolean z9, String str3, String str4, int i3) {
        if ((i3 & 1) != 0) {
            z6 = c0619o1.f6523a;
        }
        boolean z10 = z6;
        if ((i3 & 2) != 0) {
            str = c0619o1.f6524b;
        }
        String username = str;
        if ((i3 & 4) != 0) {
            str2 = c0619o1.f6525c;
        }
        String password = str2;
        if ((i3 & 8) != 0) {
            num = c0619o1.f6526d;
        }
        Integer num2 = num;
        if ((i3 & 16) != 0) {
            z9 = c0619o1.f6527e;
        }
        boolean z11 = z9;
        if ((i3 & 32) != 0) {
            str3 = c0619o1.f6528f;
        }
        String str5 = str3;
        if ((i3 & 64) != 0) {
            str4 = c0619o1.g;
        }
        c0619o1.getClass();
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        return new C0619o1(z10, username, password, num2, z11, str5, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0619o1)) {
            return false;
        }
        C0619o1 c0619o1 = (C0619o1) obj;
        return this.f6523a == c0619o1.f6523a && kotlin.jvm.internal.m.a(this.f6524b, c0619o1.f6524b) && kotlin.jvm.internal.m.a(this.f6525c, c0619o1.f6525c) && kotlin.jvm.internal.m.a(this.f6526d, c0619o1.f6526d) && this.f6527e == c0619o1.f6527e && kotlin.jvm.internal.m.a(this.f6528f, c0619o1.f6528f) && kotlin.jvm.internal.m.a(this.g, c0619o1.g);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(Boolean.hashCode(this.f6523a) * 31, 31, this.f6524b), 31, this.f6525c);
        Integer num = this.f6526d;
        int iF = p121o0.p.f((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.f6527e);
        String str = this.f6528f;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvOpenSubtitlesUiState(isLoggedIn=");
        sb.append(this.f6523a);
        sb.append(", username=");
        sb.append(this.f6524b);
        sb.append(", password=");
        sb.append(this.f6525c);
        sb.append(", remainingDownloads=");
        sb.append(this.f6526d);
        sb.append(", isWorking=");
        sb.append(this.f6527e);
        sb.append(", errorKey=");
        sb.append(this.f6528f);
        sb.append(", infoMessage=");
        return Y6.f.m(sb, this.g, ")");
    }
}
