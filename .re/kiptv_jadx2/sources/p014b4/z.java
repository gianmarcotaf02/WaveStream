package p014b4;

import Y6.f;
import java.util.Arrays;

public final class z implements Comparable {

    public final String f17917h;

    public z(String str) {
        this.f17917h = str;
    }

    public static int b(byte b9) {
        return (b9 >> 5) & 7;
    }

    public final int a() {
        return b((byte) 96);
    }

    @Override
    public final int compareTo(Object obj) {
        z zVar = (z) obj;
        int iA = zVar.a();
        int iB = b((byte) 96);
        if (iB != iA) {
            return iB - zVar.a();
        }
        String str = zVar.f17917h;
        int length = str.length();
        String str2 = this.f17917h;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            return this.f17917h.equals(((z) obj).f17917h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b((byte) 96)), this.f17917h});
    }

    public final String toString() {
        return f.m(new StringBuilder("\""), this.f17917h, "\"");
    }
}
