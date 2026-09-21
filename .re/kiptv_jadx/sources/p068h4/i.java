package p068h4;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements p068h4.l {
    public static java.lang.String a(char c9) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(c9 & 15);
            c9 = (char) (c9 >> 4);
        }
        return java.lang.String.copyValueOf(cArr);
    }

    public static p068h4.i b(java.lang.String str) {
        int length = str.length();
        if (length == 0) {
            return p068h4.b.f22488m;
        }
        if (length != 1) {
            return length != 2 ? new p068h4.c(str) : new p068h4.f(str.charAt(0), str.charAt(1));
        }
        return new p068h4.e(str.charAt(0), 0);
    }

    public abstract boolean c(char c9);

    public p068h4.i d() {
        return new p068h4.c(this);
    }
}
