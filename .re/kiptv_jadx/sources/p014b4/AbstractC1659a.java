package p014b4;

/* JADX INFO: renamed from: b4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1659a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile F6.a f17878i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f17877h = new java.lang.Object();
    public static final p014b4.z j = new p014b4.z("id");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p014b4.z f17879k = new p014b4.z("type");

    public static java.lang.String a(p014b4.x xVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(xVar.n());
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

    public static java.lang.String b(java.lang.String str, java.lang.Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        java.lang.String strI;
        int i3 = 0;
        int i9 = 0;
        while (true) {
            length = objArr.length;
            if (i9 >= length) {
                break;
            }
            java.lang.Object obj = objArr[i9];
            if (obj == null) {
                strI = "null";
            } else {
                try {
                    strI = obj.toString();
                } catch (java.lang.Exception e6) {
                    java.lang.String strP = p121o0.p.p(obj.getClass().getName(), "@", java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strP), (java.lang.Throwable) e6);
                    strI = Y6.f.i("<", strP, " threw ", e6.getClass().getName(), ">");
                }
            }
            objArr[i9] = strI;
            i9++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + (length * 16));
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb.append((java.lang.CharSequence) str, i10, iIndexOf);
            sb.append(objArr[i3]);
            i3++;
            i10 = iIndexOf + 2;
        }
        sb.append((java.lang.CharSequence) str, i10, str.length());
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
        java.lang.String strB;
        if (i3 < 0 || i3 >= i9) {
            if (i3 < 0) {
                strB = b("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i3));
            } else {
                if (i9 < 0) {
                    throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "negative size: "));
                }
                strB = b("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9));
            }
            throw new java.lang.IndexOutOfBoundsException(strB);
        }
    }

    public static boolean d(java.lang.Object obj, java.lang.Object obj2) {
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
            java.lang.System.arraycopy(bArr3, 0, bArr2, i9, length2);
            i9 += length2;
        }
        return bArr2;
    }

    public static void f(int i3, int i9, int i10) {
        java.lang.String strG;
        if (i3 < 0 || i9 < i3 || i9 > i10) {
            if (i3 < 0 || i3 > i10) {
                strG = g(i3, i10, "start index");
            } else {
                strG = (i9 < 0 || i9 > i10) ? g(i9, i10, "end index") : b("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i3));
            }
            throw new java.lang.IndexOutOfBoundsException(strG);
        }
    }

    public static java.lang.String g(int i3, int i9, java.lang.String str) {
        if (i3 < 0) {
            return b("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i3));
        }
        if (i9 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9));
        }
        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "negative size: "));
    }
}
