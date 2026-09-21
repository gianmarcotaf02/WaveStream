package t8;

public abstract class M {

    public static final String[] f28594a;

    public static final byte[] f28595b;

    static {
        String[] strArr = new String[93];
        for (int i3 = 0; i3 < 32; i3++) {
            strArr[i3] = "\\u" + b(i3 >> 12) + b(i3 >> 8) + b(i3 >> 4) + b(i3);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f28594a = strArr;
        byte[] bArr = new byte[93];
        for (int i9 = 0; i9 < 32; i9++) {
            bArr[i9] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f28595b = bArr;
    }

    public static final void a(String value, StringBuilder sb) {
        kotlin.jvm.internal.m.e(value, "value");
        sb.append('\"');
        int length = value.length();
        int i3 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = value.charAt(i9);
            String[] strArr = f28594a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i3, i9);
                sb.append(strArr[cCharAt]);
                i3 = i9 + 1;
            }
        }
        if (i3 != 0) {
            sb.append((CharSequence) value, i3, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char b(int i3) {
        int i9 = i3 & 15;
        return (char) (i9 < 10 ? i9 + 48 : i9 + 87);
    }
}
