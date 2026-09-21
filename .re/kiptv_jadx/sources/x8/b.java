package x8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f31716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w8.m f31717b = com.google.common.util.concurrent.U.x0(new java.lang.String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w8.C f31718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M8.z f31719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.TimeZone f31720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O7.o f31721f;
    public static final java.lang.String g;

    static {
        byte[] bArr = new byte[0];
        f31716a = bArr;
        M8.C0682j c0682j = new M8.C0682j();
        c0682j.Y(bArr);
        f31718c = new w8.C(0, c0682j);
        w8.y.c(w8.z.Companion, bArr, null, 0, 7);
        M8.C0685m c0685m = M8.C0685m.f7261k;
        f31719d = M8.AbstractC0674b.g(B3.o.i("efbbbf"), B3.o.i("feff"), B3.o.i("fffe"), B3.o.i("0000ffff"), B3.o.i("ffff0000"));
        java.util.TimeZone timeZone = j$.util.DesugarTimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.m.b(timeZone);
        f31720e = timeZone;
        f31721f = new O7.o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = O7.q.W0(O7.q.V0(w8.s.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(w8.o oVar, w8.o other) {
        kotlin.jvm.internal.m.e(oVar, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return kotlin.jvm.internal.m.a(oVar.f30586d, other.f30586d) && oVar.f30587e == other.f30587e && kotlin.jvm.internal.m.a(oVar.f30583a, other.f30583a);
    }

    public static final int b(long j) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new java.lang.IllegalStateException(io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new java.lang.IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new java.lang.IllegalArgumentException(io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT.concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new java.lang.IllegalArgumentException(io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT.concat(" too small.").toString());
    }

    public static final void c(java.io.Closeable closeable) {
        kotlin.jvm.internal.m.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e6) {
            throw e6;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void d(java.net.Socket socket) {
        kotlin.jvm.internal.m.e(socket, "<this>");
        try {
            socket.close();
        } catch (java.lang.AssertionError e6) {
            throw e6;
        } catch (java.lang.RuntimeException e9) {
            if (!kotlin.jvm.internal.m.a(e9.getMessage(), "bio == null")) {
                throw e9;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final int e(int i3, int i9, java.lang.String str, java.lang.String str2) {
        while (i3 < i9) {
            if (O7.q.C0(str2, str.charAt(i3))) {
                return i3;
            }
            i3++;
        }
        return i9;
    }

    public static final int f(java.lang.String str, int i3, int i9, char c9) {
        while (i3 < i9) {
            if (str.charAt(i3) == c9) {
                return i3;
            }
            i3++;
        }
        return i9;
    }

    public static /* synthetic */ int g(java.lang.String str, char c9, int i3, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = str.length();
        }
        return f(str, i3, i9, c9);
    }

    public static final boolean h(M8.K k9) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        try {
            return u(k9, 100);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static final java.lang.String i(java.lang.String format, java.lang.Object... objArr) {
        kotlin.jvm.internal.m.e(format, "format");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        return java.lang.String.format(locale, format, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator comparator) {
        kotlin.jvm.internal.m.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (java.lang.String str : strArr) {
                D1.X xH = kotlin.jvm.internal.m.h(strArr2);
                while (xH.hasNext()) {
                    if (comparator.compare(str, (java.lang.String) xH.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(w8.B b9) {
        java.lang.String strD = b9.f30490m.d("Content-Length");
        if (strD == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(strD);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public static final java.util.List l(java.lang.Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.lang.Object[] objArr = (java.lang.Object[]) elements.clone();
        java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(p078i6.p.B0(java.util.Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.m.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int m(java.lang.String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (kotlin.jvm.internal.m.f(cCharAt, 31) <= 0 || kotlin.jvm.internal.m.f(cCharAt, 127) >= 0) {
                return i3;
            }
        }
        return -1;
    }

    public static final int n(int i3, int i9, java.lang.String str) {
        while (i3 < i9) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3;
            }
            i3++;
        }
        return i9;
    }

    public static final int o(int i3, int i9, java.lang.String str) {
        int i10 = i9 - 1;
        if (i3 <= i10) {
            while (true) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i10 + 1;
                }
                if (i10 != i3) {
                    i10--;
                }
            }
        }
        return i3;
    }

    public static final java.lang.String[] p(java.lang.String[] strArr, java.lang.String[] other, java.util.Comparator comparator) {
        kotlin.jvm.internal.m.e(other, "other");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            for (java.lang.String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static final boolean q(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase(io.sentry.util.HttpUtils.COOKIE_HEADER_NAME) || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int r(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' > c9 || c9 >= 'G') {
            return -1;
        }
        return c9 - '7';
    }

    public static final java.nio.charset.Charset s(M8.InterfaceC0684l interfaceC0684l, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(interfaceC0684l, "<this>");
        kotlin.jvm.internal.m.e(charset, "default");
        int iG = interfaceC0684l.g(f31719d);
        if (iG == -1) {
            return charset;
        }
        if (iG == 0) {
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.m.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iG == 1) {
            java.nio.charset.Charset UTF_16BE = java.nio.charset.StandardCharsets.UTF_16BE;
            kotlin.jvm.internal.m.d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iG == 2) {
            java.nio.charset.Charset UTF_16LE = java.nio.charset.StandardCharsets.UTF_16LE;
            kotlin.jvm.internal.m.d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iG == 3) {
            O7.a aVar = O7.a.f8023a;
            java.nio.charset.Charset charset2 = O7.a.f8027e;
            if (charset2 != null) {
                return charset2;
            }
            java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName("UTF-32BE");
            kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
            O7.a.f8027e = charsetForName;
            return charsetForName;
        }
        if (iG != 4) {
            throw new java.lang.AssertionError();
        }
        O7.a aVar2 = O7.a.f8023a;
        java.nio.charset.Charset charset3 = O7.a.f8026d;
        if (charset3 != null) {
            return charset3;
        }
        java.nio.charset.Charset charsetForName2 = java.nio.charset.Charset.forName("UTF-32LE");
        kotlin.jvm.internal.m.d(charsetForName2, "forName(...)");
        O7.a.f8026d = charsetForName2;
        return charsetForName2;
    }

    public static final int t(M8.E e6) {
        kotlin.jvm.internal.m.e(e6, "<this>");
        return (e6.readByte() & 255) | ((e6.readByte() & 255) << 16) | ((e6.readByte() & 255) << 8);
    }

    public static final boolean u(M8.K k9, int i3) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        long jNanoTime = java.lang.System.nanoTime();
        long jC = k9.c().e() ? k9.c().c() - jNanoTime : Long.MAX_VALUE;
        k9.c().d(java.lang.Math.min(jC, timeUnit.toNanos(i3)) + jNanoTime);
        try {
            M8.C0682j c0682j = new M8.C0682j();
            while (k9.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) != -1) {
                c0682j.C(c0682j.f7260i);
            }
            if (jC == Long.MAX_VALUE) {
                k9.c().a();
                return true;
            }
            k9.c().d(jNanoTime + jC);
            return true;
        } catch (java.io.InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                k9.c().a();
                return false;
            }
            k9.c().d(jNanoTime + jC);
            return false;
        } catch (java.lang.Throwable th) {
            if (jC == Long.MAX_VALUE) {
                k9.c().a();
            } else {
                k9.c().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final w8.m v(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            D8.C0273b c0273b = (D8.C0273b) it.next();
            java.lang.String strR = c0273b.f2508a.r();
            java.lang.String strR2 = c0273b.f2509b.r();
            arrayList.add(strR);
            arrayList.add(O7.q.r1(strR2).toString());
        }
        return new w8.m((java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
    }

    public static final java.lang.String w(w8.o oVar, boolean z6) {
        int i3;
        kotlin.jvm.internal.m.e(oVar, "<this>");
        java.lang.String strI = oVar.f30586d;
        if (O7.q.B0(strI, ":", false)) {
            strI = B2.a.i(']', "[", strI);
        }
        int i9 = oVar.f30587e;
        if (!z6) {
            java.lang.String scheme = oVar.f30583a;
            kotlin.jvm.internal.m.e(scheme, "scheme");
            if (scheme.equals("http")) {
                i3 = 80;
            } else {
                i3 = scheme.equals("https") ? 443 : -1;
            }
            if (i9 == i3) {
                return strI;
            }
        }
        return strI + ':' + i9;
    }

    public static final java.util.List x(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(p078i6.o.O1(list));
        kotlin.jvm.internal.m.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int y(int i3, java.lang.String str) {
        if (str == null) {
            return i3;
        }
        try {
            long j = java.lang.Long.parseLong(str);
            if (j > 2147483647L) {
                return androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (java.lang.NumberFormatException unused) {
            return i3;
        }
    }

    public static final java.lang.String z(int i3, int i9, java.lang.String str) {
        int iN = n(i3, i9, str);
        java.lang.String strSubstring = str.substring(iN, o(iN, i9, str));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
