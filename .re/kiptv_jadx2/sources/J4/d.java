package J4;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;

public final class d {

    public static final ArrayList f6023c = new ArrayList();

    public final CharsetEncoder[] f6024a;

    public final int f6025b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i3 = 0; i3 < 20; i3++) {
            String str = strArr[i3];
            if (((c) c.f6019k.get(str)) != null) {
                try {
                    f6023c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public d(String str, Charset charset) {
        int i3;
        boolean z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i9 = 0;
        boolean z9 = charset != null && charset.name().startsWith("UTF");
        int i10 = 0;
        while (true) {
            i3 = -1;
            if (i10 >= str.length()) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char cCharAt = str.charAt(i10);
                if (cCharAt == -1 || charsetEncoder.canEncode(cCharAt)) {
                    z6 = true;
                    break;
                }
            }
            if (!z6) {
                for (CharsetEncoder charsetEncoder2 : f6023c) {
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
            this.f6024a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                this.f6024a[i11] = (CharsetEncoder) it2.next();
                i11++;
            }
            this.f6024a[i11] = StandardCharsets.UTF_8.newEncoder();
            this.f6024a[i11 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f6024a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f6024a;
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
