package J4;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public abstract class e {

    public static final Charset f6026a = Charset.defaultCharset();

    public static final Charset f6027b;

    static {
        Charset charsetForName;
        Charset charsetForName2 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f6027b = charsetForName;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charsetForName2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset = f6027b;
        if ((charset == null || !charset.equals(f6026a)) && charsetForName2 != null) {
            charsetForName2.equals(f6026a);
        }
    }
}
