package p068h4;

public abstract class i implements l {
    public static String a(char c9) {
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
        return String.copyValueOf(cArr);
    }

    public static i b(String str) {
        int length = str.length();
        if (length == 0) {
            return b.f22488m;
        }
        if (length != 1) {
            return length != 2 ? new c(str) : new f(str.charAt(0), str.charAt(1));
        }
        return new e(str.charAt(0), 0);
    }

    public abstract boolean c(char c9);

    public i d() {
        return new c(this);
    }
}
