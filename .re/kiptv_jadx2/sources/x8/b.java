package x8;

import D1.X;
import D8.C0273b;
import M8.AbstractC0674b;
import M8.C0682j;
import M8.C0685m;
import M8.E;
import M8.InterfaceC0684l;
import M8.K;
import M8.z;
import O7.o;
import O7.q;
import androidx.media3.common.util.Log;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.common.util.concurrent.U;
import io.sentry.ProfilingTraceData;
import io.sentry.util.HttpUtils;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p078i6.p;
import w8.B;
import w8.C;
import w8.m;
import w8.s;
import w8.y;

public abstract class b {

    public static final byte[] f31716a;

    public static final m f31717b = U.x0(new String[0]);

    public static final C f31718c;

    public static final z f31719d;

    public static final TimeZone f31720e;

    public static final o f31721f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        f31716a = bArr;
        C0682j c0682j = new C0682j();
        c0682j.Y(bArr);
        f31718c = new C(0, c0682j);
        y.c(w8.z.Companion, bArr, null, 0, 7);
        C0685m c0685m = C0685m.f7261k;
        f31719d = AbstractC0674b.g(B3.o.i("efbbbf"), B3.o.i("feff"), B3.o.i("fffe"), B3.o.i("0000ffff"), B3.o.i("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.m.b(timeZone);
        f31720e = timeZone;
        f31721f = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = q.W0(q.V0(s.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(w8.o oVar, w8.o other) {
        kotlin.jvm.internal.m.e(oVar, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return kotlin.jvm.internal.m.a(oVar.f30586d, other.f30586d) && oVar.f30587e == other.f30587e && kotlin.jvm.internal.m.a(oVar.f30583a, other.f30583a);
    }

    public static final int b(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalStateException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT.concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT.concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        kotlin.jvm.internal.m.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        kotlin.jvm.internal.m.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e9) {
            if (!kotlin.jvm.internal.m.a(e9.getMessage(), "bio == null")) {
                throw e9;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i3, int i9, String str, String str2) {
        while (i3 < i9) {
            if (q.C0(str2, str.charAt(i3))) {
                return i3;
            }
            i3++;
        }
        return i9;
    }

    public static final int f(String str, int i3, int i9, char c9) {
        while (i3 < i9) {
            if (str.charAt(i3) == c9) {
                return i3;
            }
            i3++;
        }
        return i9;
    }

    public static int g(String str, char c9, int i3, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = str.length();
        }
        return f(str, i3, i9, c9);
    }

    public static final boolean h(K k9) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        try {
            return u(k9, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... objArr) {
        kotlin.jvm.internal.m.e(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        kotlin.jvm.internal.m.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                X xH = kotlin.jvm.internal.m.h(strArr2);
                while (xH.hasNext()) {
                    if (comparator.compare(str, (String) xH.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(B b9) {
        String strD = b9.f30490m.d("Content-Length");
        if (strD == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strD);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(p.B0(Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.m.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (kotlin.jvm.internal.m.f(cCharAt, 31) <= 0 || kotlin.jvm.internal.m.f(cCharAt, 127) >= 0) {
                return i3;
            }
        }
        return -1;
    }

    public static final int n(int i3, int i9, String str) {
        while (i3 < i9) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3;
            }
            i3++;
        }
        return i9;
    }

    public static final int o(int i3, int i9, String str) {
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

    public static final String[] p(String[] strArr, String[] other, Comparator comparator) {
        kotlin.jvm.internal.m.e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase(HttpUtils.COOKIE_HEADER_NAME) || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
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

    public static final Charset s(InterfaceC0684l interfaceC0684l, Charset charset) {
        kotlin.jvm.internal.m.e(interfaceC0684l, "<this>");
        kotlin.jvm.internal.m.e(charset, "default");
        int iG = interfaceC0684l.g(f31719d);
        if (iG == -1) {
            return charset;
        }
        if (iG == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.m.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iG == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            kotlin.jvm.internal.m.d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iG == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            kotlin.jvm.internal.m.d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iG == 3) {
            O7.a aVar = O7.a.f8023a;
            Charset charset2 = O7.a.f8027e;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
            O7.a.f8027e = charsetForName;
            return charsetForName;
        }
        if (iG != 4) {
            throw new AssertionError();
        }
        O7.a aVar2 = O7.a.f8023a;
        Charset charset3 = O7.a.f8026d;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.m.d(charsetForName2, "forName(...)");
        O7.a.f8026d = charsetForName2;
        return charsetForName2;
    }

    public static final int t(E e6) {
        kotlin.jvm.internal.m.e(e6, "<this>");
        return (e6.readByte() & 255) | ((e6.readByte() & 255) << 16) | ((e6.readByte() & 255) << 8);
    }

    public static final boolean u(K k9, int i3) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = k9.c().e() ? k9.c().c() - jNanoTime : Long.MAX_VALUE;
        k9.c().d(Math.min(jC, timeUnit.toNanos(i3)) + jNanoTime);
        try {
            C0682j c0682j = new C0682j();
            while (k9.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) != -1) {
                c0682j.C(c0682j.f7260i);
            }
            if (jC == Long.MAX_VALUE) {
                k9.c().a();
                return true;
            }
            k9.c().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                k9.c().a();
                return false;
            }
            k9.c().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                k9.c().a();
            } else {
                k9.c().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final m v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0273b c0273b = (C0273b) it.next();
            String strR = c0273b.f2508a.r();
            String strR2 = c0273b.f2509b.r();
            arrayList.add(strR);
            arrayList.add(q.r1(strR2).toString());
        }
        return new m((String[]) arrayList.toArray(new String[0]));
    }

    public static final String w(w8.o oVar, boolean z6) {
        int i3;
        kotlin.jvm.internal.m.e(oVar, "<this>");
        String strI = oVar.f30586d;
        if (q.B0(strI, ":", false)) {
            strI = B2.a.i(']', "[", strI);
        }
        int i9 = oVar.f30587e;
        if (!z6) {
            String scheme = oVar.f30583a;
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

    public static final List x(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(p078i6.o.O1(list));
        kotlin.jvm.internal.m.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int y(int i3, String str) {
        if (str == null) {
            return i3;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Log.LOG_LEVEL_OFF;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i3;
        }
    }

    public static final String z(int i3, int i9, String str) {
        int iN = n(i3, i9, str);
        String strSubstring = str.substring(iN, o(iN, i9, str));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
