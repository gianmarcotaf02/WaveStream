package p014b4;

import F6.a;
import Y6.f;
import com.google.android.gms.internal.play_billing.M0;
import java.util.logging.Level;
import java.util.logging.Logger;
import p121o0.p;

public abstract class AbstractC1659a {

    public static volatile a f17878i;

    public static final Object f17877h = new Object();
    public static final z j = new z("id");

    public static final z f17879k = new z("type");

    public static String a(x xVar) {
        StringBuilder sb = new StringBuilder(xVar.n());
        for (int i3 = 0; i3 < xVar.n(); i3++) {
            byte bD = xVar.d(i3);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                        } else {
                            sb.append((char) bD);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strI;
        int i3 = 0;
        int i9 = 0;
        while (true) {
            length = objArr.length;
            if (i9 >= length) {
                break;
            }
            Object obj = objArr[i9];
            if (obj == null) {
                strI = "null";
            } else {
                try {
                    strI = obj.toString();
                } catch (Exception e6) {
                    String strP = p.p(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strP), (Throwable) e6);
                    strI = f.i("<", strP, " threw ", e6.getClass().getName(), ">");
                }
            }
            objArr[i9] = strI;
            i9++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i10, iIndexOf);
            sb.append(objArr[i3]);
            i3++;
            i10 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i10, str.length());
        if (i3 < length2) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i11 = i3 + 1; i11 < objArr.length; i11++) {
                sb.append(", ");
                sb.append(objArr[i11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void c(int i3, int i9) {
        String strB;
        if (i3 < 0 || i3 >= i9) {
            if (i3 < 0) {
                strB = b("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i9 < 0) {
                    throw new IllegalArgumentException(M0.l(i9, "negative size: "));
                }
                strB = b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i9));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static byte[] e(byte[]... bArr) {
        int i3 = 0;
        int length = 0;
        while (true) {
            if (i3 >= bArr.length) {
                break;
            }
            length += bArr[i3].length;
            i3++;
        }
        byte[] bArr2 = new byte[length];
        int i9 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i9, length2);
            i9 += length2;
        }
        return bArr2;
    }

    public static void f(int i3, int i9, int i10) {
        String strG;
        if (i3 < 0 || i9 < i3 || i9 > i10) {
            if (i3 < 0 || i3 > i10) {
                strG = g(i3, i10, "start index");
            } else {
                strG = (i9 < 0 || i9 > i10) ? g(i9, i10, "end index") : b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static String g(int i3, int i9, String str) {
        if (i3 < 0) {
            return b("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i9 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException(M0.l(i9, "negative size: "));
    }
}
