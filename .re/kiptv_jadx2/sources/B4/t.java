package B4;

import Y2.O;
import Y2.S;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.WindowOnFrameMetricsAvailableListenerC1485e;
import androidx.media3.extractor.ts.PsExtractor;
import com.google.android.gms.internal.cast.C1784q0;
import com.google.android.gms.internal.cast.C1791s0;
import com.google.android.gms.internal.cast.C1794t;
import com.google.android.gms.internal.cast.C1817y2;
import com.google.android.gms.internal.cast.N2;
import com.google.android.gms.internal.cast.W;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.M0;
import com.google.android.gms.internal.play_billing.V0;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.BufferedOutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p114n2.C2650i;
import t8.C2857g;
import t8.C2859i;
import t8.M;

public final class t implements p207z4.a, p059g4.c, t8.q {

    public static HandlerThread f728l;

    public static Handler f729m;

    public int f730h;

    public final Object f731i;
    public Object j;

    public Object f732k;

    public t(int i3, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f730h = i3;
        this.f731i = str;
        this.j = arrayList;
        this.f732k = arrayList2;
    }

    public static void a(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i3 = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i3, sparseIntArray.get(i3) + 1);
            }
        }
    }

    @Override
    public void D(String text) {
        byte b9;
        kotlin.jvm.internal.m.e(text, "text");
        b(0, text.length() + 2);
        char[] cArr = (char[]) this.f732k;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i3 = length + 1;
        int length2 = 1;
        while (length2 < i3) {
            char c9 = cArr[length2];
            byte[] bArr = M.f28595b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length3 = text.length();
                for (int i9 = length2 - 1; i9 < length3; i9++) {
                    b(length2, 2);
                    char cCharAt = text.charAt(i9);
                    byte[] bArr2 = M.f28595b;
                    if (cCharAt >= bArr2.length || (b9 = bArr2[cCharAt]) == 0) {
                        int i10 = length2 + 1;
                        ((char[]) this.f732k)[length2] = cCharAt;
                        length2 = i10;
                    } else if (b9 == 1) {
                        String str = M.f28594a[cCharAt];
                        kotlin.jvm.internal.m.b(str);
                        b(length2, str.length());
                        str.getChars(0, str.length(), (char[]) this.f732k, length2);
                        length2 = str.length() + length2;
                    } else {
                        char[] cArr2 = (char[]) this.f732k;
                        cArr2[length2] = '\\';
                        cArr2[length2 + 1] = (char) b9;
                        length2 += 2;
                    }
                }
                b(length2, 1);
                char[] cArr3 = (char[]) this.f732k;
                cArr3[length2] = '\"';
                e(cArr3, length2 + 1);
                c();
                return;
            }
            length2++;
        }
        cArr[i3] = '\"';
        e(cArr, length + 2);
        c();
    }

    @Override
    public void I(String text) {
        kotlin.jvm.internal.m.e(text, "text");
        int length = text.length();
        b(0, length);
        text.getChars(0, length, (char[]) this.f732k, 0);
        e((char[]) this.f732k, length);
    }

    public void b(int i3, int i9) {
        int i10 = i9 + i3;
        char[] cArr = (char[]) this.f732k;
        if (cArr.length <= i10) {
            int i11 = i3 * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
            this.f732k = cArrCopyOf;
        }
    }

    public void c() {
        ((BufferedOutputStream) this.j).write((byte[]) this.f731i, 0, this.f730h);
        this.f730h = 0;
    }

    @Override
    public byte[] d(byte[] bArr, int i3) throws InvalidAlgorithmParameterException {
        if (i3 > this.f730h) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        s sVar = (s) this.j;
        ((Mac) sVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) sVar.get()).doFinal(), i3);
    }

    public void e(char[] cArr, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i3 > cArr.length) {
            StringBuilder sbT = p121o0.p.t(i3, "count > string.length: ", " > ");
            sbT.append(cArr.length);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i9 = 0;
        while (i9 < i3) {
            char c9 = cArr[i9];
            byte[] bArr = (byte[]) this.f731i;
            if (c9 < 128) {
                if (bArr.length - this.f730h < 1) {
                    c();
                }
                int i10 = this.f730h;
                int i11 = i10 + 1;
                this.f730h = i11;
                bArr[i10] = (byte) c9;
                i9++;
                int iMin = Math.min(i3, (bArr.length - i11) + i9);
                while (i9 < iMin) {
                    char c10 = cArr[i9];
                    if (c10 >= 128) {
                        break;
                    }
                    int i12 = this.f730h;
                    this.f730h = i12 + 1;
                    bArr[i12] = (byte) c10;
                    i9++;
                }
            } else {
                if (c9 < 2048) {
                    if (bArr.length - this.f730h < 2) {
                        c();
                    }
                    int i13 = (c9 >> 6) | PsExtractor.AUDIO_STREAM;
                    int i14 = this.f730h;
                    int i15 = i14 + 1;
                    this.f730h = i15;
                    bArr[i14] = (byte) i13;
                    this.f730h = i14 + 2;
                    bArr[i15] = (byte) ((c9 & '?') | 128);
                } else if (c9 < 55296 || c9 > 57343) {
                    if (bArr.length - this.f730h < 3) {
                        c();
                    }
                    int i16 = this.f730h;
                    int i17 = i16 + 1;
                    this.f730h = i17;
                    bArr[i16] = (byte) ((c9 >> '\f') | 224);
                    int i18 = i16 + 2;
                    this.f730h = i18;
                    bArr[i17] = (byte) (((c9 >> 6) & 63) | 128);
                    this.f730h = i16 + 3;
                    bArr[i18] = (byte) ((c9 & '?') | 128);
                } else {
                    int i19 = i9 + 1;
                    char c11 = i19 < i3 ? cArr[i19] : (char) 0;
                    if (c9 > 56319 || 56320 > c11 || c11 >= 57344) {
                        if (bArr.length - this.f730h < 1) {
                            c();
                        }
                        int i20 = this.f730h;
                        this.f730h = i20 + 1;
                        bArr[i20] = (byte) 63;
                        i9 = i19;
                    } else {
                        int i21 = (((c9 & 1023) << 10) | (c11 & 1023)) + 65536;
                        if (bArr.length - this.f730h < 4) {
                            c();
                        }
                        int i22 = (i21 >> 18) | PsExtractor.VIDEO_STREAM_MASK;
                        int i23 = this.f730h;
                        int i24 = i23 + 1;
                        this.f730h = i24;
                        bArr[i23] = (byte) i22;
                        int i25 = i23 + 2;
                        this.f730h = i25;
                        bArr[i24] = (byte) (((i21 >> 12) & 63) | 128);
                        int i26 = i23 + 3;
                        this.f730h = i26;
                        bArr[i25] = (byte) (((i21 >> 6) & 63) | 128);
                        this.f730h = i23 + 4;
                        bArr[i26] = (byte) ((i21 & 63) | 128);
                        i9 += 2;
                    }
                }
                i9++;
            }
        }
    }

    @Override
    public void f(long j) {
        I(String.valueOf(j));
    }

    public void g(Throwable th) {
        boolean z6 = th instanceof TimeoutException;
        O o8 = (O) this.f732k;
        if (z6) {
            o8.R(102, 28, S.f11402E);
            AbstractC1872t.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            o8.R(95, 28, S.f11402E);
            AbstractC1872t.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f731i).run();
    }

    @Override
    public void onSuccess(Object obj) {
        E2.d dVar;
        Bundle bundle = (Bundle) obj;
        W w6 = (W) this.j;
        p191x3.g gVar = w6.f18832a;
        H3.q.g(gVar);
        String str = (String) this.f731i;
        int i3 = this.f730h;
        C1794t c1794t = w6.f18833b;
        if (i3 == 3) {
            dVar = new E2.d(w6, w6.f18834c, str);
            gVar.a(new C1817y2(dVar));
            if (c1794t != null) {
                C1784q0 c1784q0 = new C1784q0(1, dVar);
                C1794t.f19071i.b("register callback = %s", c1784q0);
                H3.q.d();
                c1794t.f19073b.add(c1784q0);
            }
        } else if (i3 == 2) {
            i3 = 2;
            dVar = new E2.d(w6, w6.f18834c, str);
            gVar.a(new C1817y2(dVar));
            if (c1794t != null) {
                C1784q0 c1784q1 = new C1784q0(1, dVar);
                C1794t.f19071i.b("register callback = %s", c1784q1);
                H3.q.d();
                c1794t.f19073b.add(c1784q1);
            }
        }
        if (i3 == 1 || i3 == 2) {
            C1791s0 c1791s0 = new C1791s0((SharedPreferences) this.f732k, w6, w6.f18834c, bundle, str);
            gVar.a(new N2(c1791s0));
            if (c1794t != null) {
                C1784q0 c1784q2 = new C1784q0(0, c1791s0);
                C1794t.f19071i.b("register callback = %s", c1784q2);
                H3.q.d();
                c1794t.f19073b.add(c1784q2);
            }
        }
    }

    @Override
    public void s(char c9) {
        byte[] bArr = (byte[]) this.f731i;
        if (c9 < 128) {
            if (bArr.length - this.f730h < 1) {
                c();
            }
            int i3 = this.f730h;
            this.f730h = i3 + 1;
            bArr[i3] = (byte) c9;
            return;
        }
        if (c9 < 2048) {
            if (bArr.length - this.f730h < 2) {
                c();
            }
            int i9 = (c9 >> 6) | PsExtractor.AUDIO_STREAM;
            int i10 = this.f730h;
            int i11 = i10 + 1;
            this.f730h = i11;
            bArr[i10] = (byte) i9;
            this.f730h = i10 + 2;
            bArr[i11] = (byte) ((c9 & '?') | 128);
            return;
        }
        if (55296 <= c9 && c9 < 57344) {
            if (bArr.length - this.f730h < 1) {
                c();
            }
            int i12 = this.f730h;
            this.f730h = i12 + 1;
            bArr[i12] = (byte) 63;
            return;
        }
        if (c9 < 0) {
            if (bArr.length - this.f730h < 3) {
                c();
            }
            int i13 = this.f730h;
            int i14 = i13 + 1;
            this.f730h = i14;
            bArr[i13] = (byte) 224;
            int i15 = i13 + 2;
            this.f730h = i15;
            bArr[i14] = (byte) (((c9 >> 6) & 63) | 128);
            this.f730h = i13 + 3;
            bArr[i15] = (byte) ((c9 & '?') | 128);
            return;
        }
        if (c9 > 65535) {
            throw new t8.u(M0.l(c9, "Unexpected code point: "));
        }
        if (bArr.length - this.f730h < 4) {
            c();
        }
        int i16 = this.f730h;
        int i17 = i16 + 1;
        this.f730h = i17;
        bArr[i16] = (byte) PsExtractor.VIDEO_STREAM_MASK;
        int i18 = i16 + 2;
        this.f730h = i18;
        bArr[i17] = (byte) 128;
        int i19 = i16 + 3;
        this.f730h = i19;
        bArr[i18] = (byte) (((c9 >> 6) & 63) | 128);
        this.f730h = i16 + 4;
        bArr[i19] = (byte) ((c9 & '?') | 128);
    }

    public t(W w6, String str, int i3, SharedPreferences sharedPreferences) {
        this.j = w6;
        this.f731i = str;
        this.f730h = i3;
        this.f732k = sharedPreferences;
    }

    public t(O o8, int i3, C1.a aVar, Runnable runnable) {
        this.f730h = i3;
        this.j = aVar;
        this.f731i = runnable;
        Objects.requireNonNull(o8);
        this.f732k = o8;
    }

    public t(BufferedOutputStream bufferedOutputStream) {
        this.j = bufferedOutputStream;
        this.f731i = C2857g.f28620c.c(512);
        this.f732k = C2859i.f28623c.d(128);
    }

    public t(C2650i c2650i, int i3) {
        this.f731i = c2650i.f25628m;
        this.f730h = i3;
        q2.c cVar = c2650i.f25630o;
        this.j = cVar.a();
        Bundle bundleI = V0.i((p070h6.k[]) Arrays.copyOf(new p070h6.k[0], 0));
        this.f732k = bundleI;
        cVar.f26586h.Q0(bundleI);
    }

    public t(Bundle state) {
        kotlin.jvm.internal.m.e(state, "state");
        String string = state.getString("nav-entry-state:id");
        if (string != null) {
            this.f731i = string;
            this.f730h = q0.v("nav-entry-state:destination-id", state);
            this.j = q0.y("nav-entry-state:args", state);
            this.f732k = q0.y("nav-entry-state:saved-state", state);
            return;
        }
        V0.w("nav-entry-state:id");
        throw null;
    }

    public t(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        s sVar = new s(this);
        this.j = sVar;
        if (p121o0.p.b(2)) {
            this.f731i = str;
            this.f732k = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str) {
                    case "HMACSHA1":
                        this.f730h = 20;
                        break;
                    case "HMACSHA224":
                        this.f730h = 28;
                        break;
                    case "HMACSHA256":
                        this.f730h = 32;
                        break;
                    case "HMACSHA384":
                        this.f730h = 48;
                        break;
                    case "HMACSHA512":
                        this.f730h = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                sVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public t(int i3) {
        this.j = new SparseIntArray[9];
        this.f731i = new ArrayList();
        this.f732k = new WindowOnFrameMetricsAvailableListenerC1485e(this);
        this.f730h = i3;
    }
}
