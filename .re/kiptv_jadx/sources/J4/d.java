package J4;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f6023c = new java.util.ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.nio.charset.CharsetEncoder[] f6024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6025b;

    static {
        java.lang.String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i3 = 0; i3 < 20; i3++) {
            java.lang.String str = strArr[i3];
            if (((J4.c) J4.c.f6019k.get(str)) != null) {
                try {
                    f6023c.add(java.nio.charset.Charset.forName(str).newEncoder());
                } catch (java.nio.charset.UnsupportedCharsetException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(java.lang.String str, java.nio.charset.Charset charset) {
        int i3;
        boolean z6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.nio.charset.StandardCharsets.ISO_8859_1.newEncoder());
        int i9 = 0;
        boolean z9 = charset != null && charset.name().startsWith("UTF");
        int i10 = 0;
        while (true) {
            i3 = -1;
            if (i10 >= str.length()) {
                break;
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                java.nio.charset.CharsetEncoder charsetEncoder = (java.nio.charset.CharsetEncoder) it.next();
                char cCharAt = str.charAt(i10);
                if (cCharAt == -1 || charsetEncoder.canEncode(cCharAt)) {
                    z6 = true;
                    break;
                }
            }
            if (!z6) {
                for (java.nio.charset.CharsetEncoder charsetEncoder2 : f6023c) {
                    if (charsetEncoder2.canEncode(str.charAt(i10))) {
                        arrayList.add(charsetEncoder2);
                        z6 = true;
                        break;
                    }
                }
            }
            if (!z6) {
                z9 = true;
            }
            i10++;
        }
        if (arrayList.size() != 1 || z9) {
            this.f6024a = new java.nio.charset.CharsetEncoder[arrayList.size() + 2];
            java.util.Iterator it2 = arrayList.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                this.f6024a[i11] = (java.nio.charset.CharsetEncoder) it2.next();
                i11++;
            }
            this.f6024a[i11] = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
            this.f6024a[i11 + 1] = java.nio.charset.StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f6024a = new java.nio.charset.CharsetEncoder[]{(java.nio.charset.CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                java.nio.charset.CharsetEncoder[] charsetEncoderArr = this.f6024a;
                if (i9 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i9] != null && charset.name().equals(this.f6024a[i9].charset().name())) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
        }
        this.f6025b = i3;
    }
}
