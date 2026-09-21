package com.google.android.gms.internal.cast;

import android.os.Bundle;
import androidx.media3.common.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class H {

    public static final D3.d[] f18775i = {new D3.d("usage_and_diagnostics_listener", 1), new D3.d("usage_and_diagnostics_consents", 1), new D3.d("usage_and_diagnostics_check_consents", 1), new D3.d("usage_and_diagnostics_settings_access", 1), new D3.d("el_capitan", 1)};
    public static final S.p j = new S.p("UsageReporting.API", new B3.v(6), new B3.o(10));

    public final int f18776h;

    public H(int i3) {
        this.f18776h = i3;
    }

    public static int b(int i3) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    public static int c(int i3, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i9 <= i3) {
            return i3;
        }
        int i10 = i3 + (i3 >> 1) + 1;
        if (i10 < i9) {
            int iHighestOneBit = Integer.highestOneBit(i9 - 1);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        return i10 < 0 ? Log.LOG_LEVEL_OFF : i10;
    }

    public static String e(C1821z2 c1821z2) {
        StringBuilder sb = new StringBuilder(c1821z2.f());
        for (int i3 = 0; i3 < c1821z2.f(); i3++) {
            byte bD = c1821z2.d(i3);
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

    public static String f(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c9 = charArray[i3];
                    if (c9 >= 'a' && c9 <= 'z') {
                        charArray[i3] = (char) (c9 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    public static String g(String str, Object... objArr) {
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
                    String strP = p121o0.p.p(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strP), (Throwable) e6);
                    strI = Y6.f.i("<", strP, " threw ", e6.getClass().getName(), ">");
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

    public static Map h(String str, Bundle bundle) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return C1756j0.f18931n;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                map2.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(map2);
    }

    public static void i(int i3, int i9) {
        String strG;
        if (i3 < 0 || i3 >= i9) {
            if (i3 < 0) {
                strG = g("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i9 < 0) {
                    throw new IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "negative size: "));
                }
                strG = g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i9));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static boolean j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC1750h2 abstractC1750h2, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1750h2, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC1750h2) != obj && atomicReferenceFieldUpdater.get(abstractC1750h2) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void l(int i3, int i9) {
        if (i3 < 0 || i3 > i9) {
            throw new IndexOutOfBoundsException(p(i3, i9, "index"));
        }
    }

    public static void n(int i3, int i9, int i10) {
        String strP;
        if (i3 < 0 || i9 < i3 || i9 > i10) {
            if (i3 < 0 || i3 > i10) {
                strP = p(i3, i10, "start index");
            } else {
                strP = (i9 < 0 || i9 > i10) ? p(i9, i10, "end index") : g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    public static String p(int i3, int i9, String str) {
        if (i3 < 0) {
            return g("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i9 >= 0) {
            return g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "negative size: "));
    }

    public abstract C1726b2 d(AbstractC1750h2 abstractC1750h2);

    public abstract C1746g2 k(AbstractC1750h2 abstractC1750h2);

    public abstract void m(C1746g2 c1746g2, C1746g2 c1746g3);

    public abstract void o(C1746g2 c1746g2, Thread thread);

    public abstract boolean q(AbstractC1750h2 abstractC1750h2, C1726b2 c1726b2, C1726b2 c1726b3);

    public abstract boolean r(AbstractC1750h2 abstractC1750h2, Object obj, Object obj2);

    public abstract boolean s(AbstractC1750h2 abstractC1750h2, C1746g2 c1746g2, C1746g2 c1746g3);

    public String toString() {
        switch (this.f18776h) {
            case 6:
                return ((ScheduledFutureC1782p2) this).f19020k.toString();
            default:
                return super.toString();
        }
    }
}
