package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D3.d[] f18775i = {new D3.d("usage_and_diagnostics_listener", 1), new D3.d("usage_and_diagnostics_consents", 1), new D3.d("usage_and_diagnostics_check_consents", 1), new D3.d("usage_and_diagnostics_settings_access", 1), new D3.d("el_capitan", 1)};
    public static final S.p j = new S.p("UsageReporting.API", new B3.v(6), new B3.o(10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18776h;

    public /* synthetic */ H(int i3) {
        this.f18776h = i3;
    }

    public static int b(int i3) {
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    public static int c(int i3, int i9) {
        if (i9 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i9 <= i3) {
            return i3;
        }
        int i10 = i3 + (i3 >> 1) + 1;
        if (i10 < i9) {
            int iHighestOneBit = java.lang.Integer.highestOneBit(i9 - 1);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        return i10 < 0 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : i10;
    }

    public static java.lang.String e(com.google.android.gms.internal.cast.C1821z2 c1821z2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(c1821z2.f());
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

    public static java.lang.String f(java.lang.String str) {
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
                return java.lang.String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    public static java.lang.String g(java.lang.String str, java.lang.Object... objArr) {
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

    public static java.util.Map h(java.lang.String str, android.os.Bundle bundle) {
        java.util.Map map = (java.util.Map) bundle.getSerializable(str);
        if (map == null) {
            return com.google.android.gms.internal.cast.C1756j0.f18931n;
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                map2.put((java.lang.Integer) entry.getKey(), (java.lang.Integer) entry.getValue());
            }
        }
        return java.util.Collections.unmodifiableMap(map2);
    }

    public static void i(int i3, int i9) {
        java.lang.String strG;
        if (i3 < 0 || i3 >= i9) {
            if (i3 < 0) {
                strG = g("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i3));
            } else {
                if (i9 < 0) {
                    throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "negative size: "));
                }
                strG = g("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9));
            }
            throw new java.lang.IndexOutOfBoundsException(strG);
        }
    }

    public static /* synthetic */ boolean j(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1750h2, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC1750h2) != obj && atomicReferenceFieldUpdater.get(abstractC1750h2) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void l(int i3, int i9) {
        if (i3 < 0 || i3 > i9) {
            throw new java.lang.IndexOutOfBoundsException(p(i3, i9, "index"));
        }
    }

    public static void n(int i3, int i9, int i10) {
        java.lang.String strP;
        if (i3 < 0 || i9 < i3 || i9 > i10) {
            if (i3 < 0 || i3 > i10) {
                strP = p(i3, i10, "start index");
            } else {
                strP = (i9 < 0 || i9 > i10) ? p(i9, i10, "end index") : g("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i3));
            }
            throw new java.lang.IndexOutOfBoundsException(strP);
        }
    }

    public static java.lang.String p(int i3, int i9, java.lang.String str) {
        if (i3 < 0) {
            return g("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i3));
        }
        if (i9 >= 0) {
            return g("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9));
        }
        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "negative size: "));
    }

    public abstract com.google.android.gms.internal.cast.C1726b2 d(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2);

    public abstract com.google.android.gms.internal.cast.C1746g2 k(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2);

    public abstract void m(com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3);

    public abstract void o(com.google.android.gms.internal.cast.C1746g2 c1746g2, java.lang.Thread thread);

    public abstract boolean q(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1726b2 c1726b2, com.google.android.gms.internal.cast.C1726b2 c1726b3);

    public abstract boolean r(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, java.lang.Object obj, java.lang.Object obj2);

    public abstract boolean s(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3);

    public java.lang.String toString() {
        switch (this.f18776h) {
            case 6:
                return ((com.google.android.gms.internal.cast.ScheduledFutureC1782p2) this).f19020k.toString();
            default:
                return super.toString();
        }
    }
}
