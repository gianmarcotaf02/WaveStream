package B4;

/* JADX INFO: loaded from: classes.dex */
public final class t implements p207z4.a, p059g4.c, t8.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static android.os.HandlerThread f728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static android.os.Handler f729m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f731i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f732k;

    public t(int i3, java.lang.String str, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f730h = i3;
        this.f731i = str;
        this.j = arrayList;
        this.f732k = arrayList2;
    }

    public static void a(android.util.SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i3 = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i3, sparseIntArray.get(i3) + 1);
            }
        }
    }

    @Override // t8.q
    public void D(java.lang.String text) {
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
            byte[] bArr = t8.M.f28595b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length3 = text.length();
                for (int i9 = length2 - 1; i9 < length3; i9++) {
                    b(length2, 2);
                    char cCharAt = text.charAt(i9);
                    byte[] bArr2 = t8.M.f28595b;
                    if (cCharAt >= bArr2.length || (b9 = bArr2[cCharAt]) == 0) {
                        int i10 = length2 + 1;
                        ((char[]) this.f732k)[length2] = cCharAt;
                        length2 = i10;
                    } else if (b9 == 1) {
                        java.lang.String str = t8.M.f28594a[cCharAt];
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

    @Override // t8.q
    public void I(java.lang.String text) {
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
            char[] cArrCopyOf = java.util.Arrays.copyOf(cArr, i10);
            kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
            this.f732k = cArrCopyOf;
        }
    }

    public void c() {
        ((java.io.BufferedOutputStream) this.j).write((byte[]) this.f731i, 0, this.f730h);
        this.f730h = 0;
    }

    @Override // p207z4.a
    public byte[] d(byte[] bArr, int i3) throws java.security.InvalidAlgorithmParameterException {
        if (i3 > this.f730h) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        }
        B4.s sVar = (B4.s) this.j;
        ((javax.crypto.Mac) sVar.get()).update(bArr);
        return java.util.Arrays.copyOf(((javax.crypto.Mac) sVar.get()).doFinal(), i3);
    }

    public void e(char[] cArr, int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("count < 0");
        }
        if (i3 > cArr.length) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "count > string.length: ", " > ");
            sbT.append(cArr.length);
            throw new java.lang.IllegalArgumentException(sbT.toString().toString());
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
                int iMin = java.lang.Math.min(i3, (bArr.length - i11) + i9);
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
                    int i13 = (c9 >> 6) | androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM;
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
                        int i22 = (i21 >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK;
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

    @Override // t8.q
    public void f(long j) {
        I(java.lang.String.valueOf(j));
    }

    public void g(java.lang.Throwable th) {
        boolean z6 = th instanceof java.util.concurrent.TimeoutException;
        Y2.O o8 = (Y2.O) this.f732k;
        if (z6) {
            o8.R(102, 28, Y2.S.f11402E);
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            o8.R(95, 28, Y2.S.f11402E);
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((java.lang.Runnable) this.f731i).run();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    @Override // p059g4.c
    public void onSuccess(java.lang.Object obj) {
        E2.d dVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.google.android.gms.internal.cast.W w6 = (com.google.android.gms.internal.cast.W) this.j;
        p191x3.g gVar = w6.f18832a;
        H3.q.g(gVar);
        java.lang.String str = (java.lang.String) this.f731i;
        int i3 = this.f730h;
        com.google.android.gms.internal.cast.C1794t c1794t = w6.f18833b;
        if (i3 == 3) {
            dVar = new E2.d(w6, w6.f18834c, str);
            gVar.a(new com.google.android.gms.internal.cast.C1817y2(dVar));
            if (c1794t != null) {
                com.google.android.gms.internal.cast.C1784q0 c1784q0 = new com.google.android.gms.internal.cast.C1784q0(1, dVar);
                com.google.android.gms.internal.cast.C1794t.f19071i.b("register callback = %s", c1784q0);
                H3.q.d();
                c1794t.f19073b.add(c1784q0);
            }
        } else if (i3 == 2) {
            i3 = 2;
            dVar = new E2.d(w6, w6.f18834c, str);
            gVar.a(new com.google.android.gms.internal.cast.C1817y2(dVar));
            if (c1794t != null) {
                com.google.android.gms.internal.cast.C1784q0 c1784q1 = new com.google.android.gms.internal.cast.C1784q0(1, dVar);
                com.google.android.gms.internal.cast.C1794t.f19071i.b("register callback = %s", c1784q1);
                H3.q.d();
                c1794t.f19073b.add(c1784q1);
            }
        }
        if (i3 == 1 || i3 == 2) {
            com.google.android.gms.internal.cast.C1791s0 c1791s0 = new com.google.android.gms.internal.cast.C1791s0((android.content.SharedPreferences) this.f732k, w6, w6.f18834c, bundle, str);
            gVar.a(new com.google.android.gms.internal.cast.N2(c1791s0));
            if (c1794t != null) {
                com.google.android.gms.internal.cast.C1784q0 c1784q2 = new com.google.android.gms.internal.cast.C1784q0(0, c1791s0);
                com.google.android.gms.internal.cast.C1794t.f19071i.b("register callback = %s", c1784q2);
                H3.q.d();
                c1794t.f19073b.add(c1784q2);
            }
        }
    }

    @Override // t8.q
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
            int i9 = (c9 >> 6) | androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM;
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
            throw new t8.u(com.google.android.gms.internal.play_billing.M0.l(c9, "Unexpected code point: "));
        }
        if (bArr.length - this.f730h < 4) {
            c();
        }
        int i16 = this.f730h;
        int i17 = i16 + 1;
        this.f730h = i17;
        bArr[i16] = (byte) androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK;
        int i18 = i16 + 2;
        this.f730h = i18;
        bArr[i17] = (byte) 128;
        int i19 = i16 + 3;
        this.f730h = i19;
        bArr[i18] = (byte) (((c9 >> 6) & 63) | 128);
        this.f730h = i16 + 4;
        bArr[i19] = (byte) ((c9 & '?') | 128);
    }

    public /* synthetic */ t(com.google.android.gms.internal.cast.W w6, java.lang.String str, int i3, android.content.SharedPreferences sharedPreferences) {
        this.j = w6;
        this.f731i = str;
        this.f730h = i3;
        this.f732k = sharedPreferences;
    }

    public t(Y2.O o8, int i3, C1.a aVar, java.lang.Runnable runnable) {
        this.f730h = i3;
        this.j = aVar;
        this.f731i = runnable;
        java.util.Objects.requireNonNull(o8);
        this.f732k = o8;
    }

    public t(java.io.BufferedOutputStream bufferedOutputStream) {
        this.j = bufferedOutputStream;
        this.f731i = t8.C2857g.f28620c.c(512);
        this.f732k = t8.C2859i.f28623c.d(128);
    }

    public t(p114n2.C2650i c2650i, int i3) {
        this.f731i = c2650i.f25628m;
        this.f730h = i3;
        q2.c cVar = c2650i.f25630o;
        this.j = cVar.a();
        android.os.Bundle bundleI = com.google.android.gms.internal.play_billing.V0.i((p070h6.k[]) java.util.Arrays.copyOf(new p070h6.k[0], 0));
        this.f732k = bundleI;
        cVar.f26586h.Q0(bundleI);
    }

    public t(android.os.Bundle state) {
        kotlin.jvm.internal.m.e(state, "state");
        java.lang.String string = state.getString("nav-entry-state:id");
        if (string != null) {
            this.f731i = string;
            this.f730h = com.google.crypto.tink.shaded.protobuf.q0.v("nav-entry-state:destination-id", state);
            this.j = com.google.crypto.tink.shaded.protobuf.q0.y("nav-entry-state:args", state);
            this.f732k = com.google.crypto.tink.shaded.protobuf.q0.y("nav-entry-state:saved-state", state);
            return;
        }
        com.google.android.gms.internal.play_billing.V0.w("nav-entry-state:id");
        throw null;
    }

    public t(java.lang.String str, javax.crypto.spec.SecretKeySpec secretKeySpec) throws java.security.GeneralSecurityException {
        B4.s sVar = new B4.s(this);
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
                        throw new java.security.NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                sVar.get();
                return;
            }
            throw new java.security.InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public t(int i3) {
        this.j = new android.util.SparseIntArray[9];
        this.f731i = new java.util.ArrayList();
        this.f732k = new androidx.core.app.WindowOnFrameMetricsAvailableListenerC1485e(this);
        this.f730h = i3;
    }
}
