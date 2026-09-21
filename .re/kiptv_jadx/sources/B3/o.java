package B3;

/* JADX INFO: loaded from: classes.dex */
public class o implements D1.InterfaceC0237w, S8.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static B3.o f639i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f640h;

    public /* synthetic */ o(int i3) {
        this.f640h = i3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    public static final java.lang.String c(byte[] bArr, byte[][] bArr2, int i3) {
        int i9;
        boolean z6;
        int i10;
        int i11;
        int i12 = -1;
        byte[] bArr3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f26160e;
        int length = bArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > i12 && bArr[i14] != 10) {
                i14 += i12;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i9 = i15 + i16;
                if (bArr[i9] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i9 - i15;
            int i18 = i3;
            boolean z9 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z9) {
                    i10 = 46;
                    z6 = false;
                } else {
                    byte b9 = bArr2[i18][i19];
                    byte[] bArr4 = x8.b.f31716a;
                    int i21 = b9 & 255;
                    z6 = z9;
                    i10 = i21;
                }
                byte b10 = bArr[i15 + i20];
                byte[] bArr5 = x8.b.f31716a;
                i11 = i10 - (b10 & 255);
                if (i11 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                }
                if (bArr2[i18].length != i19) {
                    z9 = z6;
                } else {
                    if (i18 == bArr2.length - 1) {
                        break;
                    }
                    i18++;
                    z9 = true;
                    i19 = -1;
                }
            }
            if (i11 >= 0) {
                if (i11 <= 0) {
                    int i22 = i17 - i20;
                    int length2 = bArr2[i18].length - i19;
                    int length3 = bArr2.length;
                    for (int i23 = i18 + 1; i23 < length3; i23++) {
                        length2 += bArr2[i23].length;
                    }
                    if (length2 < i22) {
                        length = i14;
                    } else if (length2 <= i22) {
                        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                        kotlin.jvm.internal.m.d(UTF_8, "UTF_8");
                        return new java.lang.String(bArr, i15, i17, UTF_8);
                    }
                }
                i13 = i9 + 1;
            } else {
                length = i14;
            }
            i12 = -1;
        }
        return null;
    }

    public static final void d(M8.C0678f c0678f, long j, boolean z6) {
        M8.C0678f c0678f2;
        java.util.concurrent.locks.ReentrantLock reentrantLock = M8.C0678f.f7245h;
        if (M8.C0678f.f7248l == null) {
            M8.C0678f.f7248l = new M8.C0678f();
            M8.C0675c c0675c = new M8.C0675c("Okio Watchdog");
            c0675c.setDaemon(true);
            c0675c.start();
        }
        long jNanoTime = java.lang.System.nanoTime();
        if (j != 0 && z6) {
            c0678f.g = java.lang.Math.min(j, c0678f.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c0678f.g = j + jNanoTime;
        } else {
            if (!z6) {
                throw new java.lang.AssertionError();
            }
            c0678f.g = c0678f.c();
        }
        long j9 = c0678f.g - jNanoTime;
        M8.C0678f c0678f3 = M8.C0678f.f7248l;
        kotlin.jvm.internal.m.b(c0678f3);
        while (true) {
            c0678f2 = c0678f3.f7250f;
            if (c0678f2 == null || j9 < c0678f2.g - jNanoTime) {
                break;
            }
            kotlin.jvm.internal.m.b(c0678f2);
            c0678f3 = c0678f2;
        }
        c0678f.f7250f = c0678f2;
        c0678f3.f7250f = c0678f;
        if (c0678f3 == M8.C0678f.f7248l) {
            M8.C0678f.f7246i.signal();
        }
    }

    public static final boolean e(M8.A a2) {
        M8.A a9 = N8.f.f7484m;
        return !O7.x.q0(a2.b(), ".class", true);
    }

    public static java.util.ArrayList f(java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : protocols) {
            if (((w8.t) obj) != w8.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w8.t) it.next()).f30653h);
        }
        return arrayList2;
    }

    public static M8.C0678f g() throws java.lang.InterruptedException {
        M8.C0678f c0678f = M8.C0678f.f7248l;
        kotlin.jvm.internal.m.b(c0678f);
        M8.C0678f c0678f2 = c0678f.f7250f;
        if (c0678f2 == null) {
            long jNanoTime = java.lang.System.nanoTime();
            M8.C0678f.f7246i.await(M8.C0678f.j, java.util.concurrent.TimeUnit.MILLISECONDS);
            M8.C0678f c0678f3 = M8.C0678f.f7248l;
            kotlin.jvm.internal.m.b(c0678f3);
            if (c0678f3.f7250f != null || java.lang.System.nanoTime() - jNanoTime < M8.C0678f.f7247k) {
                return null;
            }
            return M8.C0678f.f7248l;
        }
        long jNanoTime2 = c0678f2.g - java.lang.System.nanoTime();
        if (jNanoTime2 > 0) {
            M8.C0678f.f7246i.await(jNanoTime2, java.util.concurrent.TimeUnit.NANOSECONDS);
            return null;
        }
        M8.C0678f c0678f4 = M8.C0678f.f7248l;
        kotlin.jvm.internal.m.b(c0678f4);
        c0678f4.f7250f = c0678f2.f7250f;
        c0678f2.f7250f = null;
        c0678f2.f7249e = 2;
        return c0678f2;
    }

    public static byte[] h(java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        M8.C0682j c0682j = new M8.C0682j();
        for (java.lang.String str : f(protocols)) {
            c0682j.Z(str.length());
            c0682j.d0(str);
        }
        return c0682j.v(c0682j.f7260i);
    }

    public static M8.C0685m i(java.lang.String str) {
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i9 = i3 * 2;
            bArr[i3] = (byte) (N8.b.a(str.charAt(i9 + 1)) + (N8.b.a(str.charAt(i9)) << 4));
        }
        return new M8.C0685m(bArr);
    }

    public static M8.C0685m j(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        byte[] bytes = str.getBytes(O7.a.f8024b);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        M8.C0685m c0685m = new M8.C0685m(bytes);
        c0685m.j = str;
        return c0685m;
    }

    public static M8.A k(java.lang.String str, boolean z6) {
        kotlin.jvm.internal.m.e(str, "<this>");
        M8.C0685m c0685m = N8.c.f7475a;
        M8.C0682j c0682j = new M8.C0682j();
        c0682j.d0(str);
        return N8.c.d(c0682j, z6);
    }

    public static M8.A l(java.io.File file) {
        java.lang.String str = M8.A.f7207i;
        java.lang.String string = file.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return k(string, false);
    }

    public static boolean o() {
        return "Dalvik".equals(java.lang.System.getProperty("java.vm.name"));
    }

    public static M8.C0685m q(byte[] bArr, int i3) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        if (i3 == -1234567890) {
            i3 = bArr.length;
        }
        M8.AbstractC0674b.e(bArr.length, 0, i3);
        return new M8.C0685m(p078i6.m.f0(bArr, 0, i3));
    }

    public java.lang.Object m(java.lang.String str, java.security.Provider provider) {
        switch (this.f640h) {
            case 1:
                return provider == null ? javax.crypto.Cipher.getInstance(str) : javax.crypto.Cipher.getInstance(str, provider);
            case 2:
                return provider == null ? javax.crypto.KeyAgreement.getInstance(str) : javax.crypto.KeyAgreement.getInstance(str, provider);
            case 3:
                return provider == null ? java.security.KeyFactory.getInstance(str) : java.security.KeyFactory.getInstance(str, provider);
            case 4:
                return provider == null ? java.security.KeyPairGenerator.getInstance(str) : java.security.KeyPairGenerator.getInstance(str, provider);
            case 5:
                return provider == null ? javax.crypto.Mac.getInstance(str) : javax.crypto.Mac.getInstance(str, provider);
            case 6:
                return provider == null ? java.security.MessageDigest.getInstance(str) : java.security.MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? java.security.Signature.getInstance(str) : java.security.Signature.getInstance(str, provider);
        }
    }

    public android.content.pm.Signature[] n(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean p(java.lang.CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a0 A[Catch: all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0104, blocks: (B:4:0x0013, B:64:0x00f8, B:66:0x00fe, B:72:0x012d, B:100:0x01a0, B:108:0x01b3, B:134:0x024f, B:135:0x0252, B:124:0x0235, B:71:0x0109, B:137:0x0254, B:5:0x0014, B:8:0x001b, B:9:0x0037, B:62:0x00f5, B:22:0x005b, B:45:0x00b2, B:48:0x00b7, B:55:0x00cf, B:63:0x00f7, B:61:0x00d5), top: B:147:0x0013, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01aa A[Catch: all -> 0x01a6, RemoteException -> 0x01a8, TRY_ENTER, TRY_LEAVE, TryCatch #14 {RemoteException -> 0x01a8, all -> 0x01a6, blocks: (B:84:0x017c, B:87:0x0183, B:89:0x0189, B:91:0x0191, B:93:0x0195, B:106:0x01aa), top: B:157:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b3 A[Catch: all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0104, blocks: (B:4:0x0013, B:64:0x00f8, B:66:0x00fe, B:72:0x012d, B:100:0x01a0, B:108:0x01b3, B:134:0x024f, B:135:0x0252, B:124:0x0235, B:71:0x0109, B:137:0x0254, B:5:0x0014, B:8:0x001b, B:9:0x0037, B:62:0x00f5, B:22:0x005b, B:45:0x00b2, B:48:0x00b7, B:55:0x00cf, B:63:0x00f7, B:61:0x00d5), top: B:147:0x0013, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c5 A[Catch: all -> 0x01bd, RemoteException -> 0x01c0, TRY_ENTER, TryCatch #0 {RemoteException -> 0x01c0, blocks: (B:75:0x0137, B:77:0x014a, B:79:0x0154, B:81:0x0158, B:82:0x015e, B:118:0x01c5, B:120:0x01ec), top: B:144:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01ec A[Catch: all -> 0x01bd, RemoteException -> 0x01c0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x01c0, blocks: (B:75:0x0137, B:77:0x014a, B:79:0x0154, B:81:0x0158, B:82:0x015e, B:118:0x01c5, B:120:0x01ec), top: B:144:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3 A[Catch: all -> 0x0048, TryCatch #4 {all -> 0x0048, blocks: (B:10:0x0038, B:12:0x0044, B:52:0x00cc, B:17:0x004d, B:19:0x0054, B:21:0x005a, B:26:0x0061, B:28:0x0065, B:31:0x006e, B:33:0x0076, B:36:0x007d, B:43:0x00a9, B:44:0x00b1, B:39:0x0084, B:41:0x008a, B:42:0x009b, B:47:0x00b6, B:50:0x00b9, B:51:0x00c3, B:18:0x0050), top: B:148:0x0038, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012d A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #2 {all -> 0x0104, blocks: (B:4:0x0013, B:64:0x00f8, B:66:0x00fe, B:72:0x012d, B:100:0x01a0, B:108:0x01b3, B:134:0x024f, B:135:0x0252, B:124:0x0235, B:71:0x0109, B:137:0x0254, B:5:0x0014, B:8:0x001b, B:9:0x0037, B:62:0x00f5, B:22:0x005b, B:45:0x00b2, B:48:0x00b7, B:55:0x00cf, B:63:0x00f7, B:61:0x00d5), top: B:147:0x0013, inners: #6, #13 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x014a A[Catch: all -> 0x01bd, RemoteException -> 0x01c0, TryCatch #0 {RemoteException -> 0x01c0, blocks: (B:75:0x0137, B:77:0x014a, B:79:0x0154, B:81:0x0158, B:82:0x015e, B:118:0x01c5, B:120:0x01ec), top: B:144:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0154 A[Catch: all -> 0x01bd, RemoteException -> 0x01c0, TryCatch #0 {RemoteException -> 0x01c0, blocks: (B:75:0x0137, B:77:0x014a, B:79:0x0154, B:81:0x0158, B:82:0x015e, B:118:0x01c5, B:120:0x01ec), top: B:144:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x015e A[Catch: all -> 0x01bd, RemoteException -> 0x01c0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x01c0, blocks: (B:75:0x0137, B:77:0x014a, B:79:0x0154, B:81:0x0158, B:82:0x015e, B:118:0x01c5, B:120:0x01ec), top: B:144:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0182  */
    /* JADX WARN: Code duplicated, block: B:87:0x0183 A[Catch: all -> 0x01a6, RemoteException -> 0x01a8, TryCatch #14 {RemoteException -> 0x01a8, all -> 0x01a6, blocks: (B:84:0x017c, B:87:0x0183, B:89:0x0189, B:91:0x0191, B:93:0x0195, B:106:0x01aa), top: B:157:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0189 A[Catch: all -> 0x01a6, RemoteException -> 0x01a8, TryCatch #14 {RemoteException -> 0x01a8, all -> 0x01a6, blocks: (B:84:0x017c, B:87:0x0183, B:89:0x0189, B:91:0x0191, B:93:0x0195, B:106:0x01aa), top: B:157:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0191 A[Catch: all -> 0x01a6, RemoteException -> 0x01a8, TryCatch #14 {RemoteException -> 0x01a8, all -> 0x01a6, blocks: (B:84:0x017c, B:87:0x0183, B:89:0x0189, B:91:0x0191, B:93:0x0195, B:106:0x01aa), top: B:157:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0199  */
    /* JADX WARN: Code duplicated, block: B:98:0x019d  */
    public P3.c s(android.content.Context context, B3.o oVar) {
        int iD;
        P3.h hVarF;
        int i3;
        int i9;
        java.lang.ThreadLocal threadLocal;
        P3.g gVar;
        android.database.Cursor cursor;
        int i10;
        P3.g gVar2;
        boolean z6;
        android.database.Cursor cursor2;
        P3.c cVar = new P3.c();
        oVar.getClass();
        try {
            synchronized (P3.d.class) {
                java.lang.Boolean bool = P3.d.f8109c;
                iD = 0;
                android.database.Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        java.lang.reflect.Field declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                                if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                                    bool = java.lang.Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        P3.d.e(classLoader);
                                    } catch (P3.b unused) {
                                    }
                                    bool = java.lang.Boolean.TRUE;
                                } else if (P3.d.c(context)) {
                                    if (P3.d.f8111e) {
                                        declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                        bool = java.lang.Boolean.FALSE;
                                    } else {
                                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                            bool = java.lang.Boolean.FALSE;
                                        } else {
                                            try {
                                                int iD2 = P3.d.d(context, true, true);
                                                java.lang.String str = P3.d.f8110d;
                                                if (str != null && !str.isEmpty()) {
                                                    java.lang.ClassLoader classLoaderO0 = P3.e.o0();
                                                    if (classLoaderO0 == null) {
                                                        if (android.os.Build.VERSION.SDK_INT >= 29) {
                                                            P3.a.f();
                                                            java.lang.String str2 = P3.d.f8110d;
                                                            H3.q.g(str2);
                                                            classLoaderO0 = P3.a.d(java.lang.ClassLoader.getSystemClassLoader(), str2);
                                                        } else {
                                                            java.lang.String str3 = P3.d.f8110d;
                                                            H3.q.g(str3);
                                                            classLoaderO0 = new P3.f(str3, java.lang.ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    P3.d.e(classLoaderO0);
                                                    declaredField.set(null, classLoaderO0);
                                                    P3.d.f8109c = bool2;
                                                }
                                                iD = iD2;
                                            } catch (P3.b unused2) {
                                                declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                                bool = java.lang.Boolean.FALSE;
                                                P3.d.f8109c = bool;
                                                if (bool.booleanValue()) {
                                                    try {
                                                        iD = P3.d.d(context, true, false);
                                                    } catch (P3.b e6) {
                                                        java.lang.String message = e6.getMessage();
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 42);
                                                        sb.append("Failed to retrieve remote module version: ");
                                                        sb.append(message);
                                                        android.util.Log.w("DynamiteModule", sb.toString());
                                                    }
                                                } else {
                                                    hVarF = P3.d.f(context);
                                                    try {
                                                        if (hVarF != null) {
                                                            try {
                                                                android.os.Parcel parcelX = hVarF.X(hVarF.Y(), 6);
                                                                i3 = parcelX.readInt();
                                                                parcelX.recycle();
                                                                if (i3 >= 3) {
                                                                    threadLocal = P3.d.f8113h;
                                                                    gVar = (P3.g) threadLocal.get();
                                                                    if (gVar != null) {
                                                                        cursor = (android.database.Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((java.lang.Long) P3.d.f8114i.get()).longValue()));
                                                                        if (cursor != null) {
                                                                            try {
                                                                                if (cursor.moveToFirst()) {
                                                                                    i10 = cursor.getInt(0);
                                                                                    if (i10 > 0) {
                                                                                        gVar2 = (P3.g) threadLocal.get();
                                                                                        if (gVar2 == null) {
                                                                                            z6 = false;
                                                                                        } else {
                                                                                            z6 = false;
                                                                                        }
                                                                                        cursor3 = z6 ? null : cursor;
                                                                                    }
                                                                                    if (cursor3 != null) {
                                                                                        cursor3.close();
                                                                                    }
                                                                                    iD = i10;
                                                                                } else {
                                                                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                                    if (cursor != null) {
                                                                                        cursor.close();
                                                                                    }
                                                                                }
                                                                            } catch (android.os.RemoteException e9) {
                                                                                e = e9;
                                                                                cursor3 = cursor;
                                                                                java.lang.String message2 = e.getMessage();
                                                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(message2).length() + 42);
                                                                                sb2.append("Failed to retrieve remote module version: ");
                                                                                sb2.append(message2);
                                                                                android.util.Log.w("DynamiteModule", sb2.toString());
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                            } catch (java.lang.Throwable th) {
                                                                                th = th;
                                                                                cursor3 = cursor;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cursor = (android.database.Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((java.lang.Long) P3.d.f8114i.get()).longValue()));
                                                                        if (cursor != null) {
                                                                            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        } else if (cursor.moveToFirst()) {
                                                                            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        } else {
                                                                            i10 = cursor.getInt(0);
                                                                            if (i10 > 0) {
                                                                                gVar2 = (P3.g) threadLocal.get();
                                                                                if (gVar2 == null) {
                                                                                    z6 = false;
                                                                                } else {
                                                                                    z6 = false;
                                                                                }
                                                                                if (z6) {
                                                                                }
                                                                            }
                                                                            if (cursor3 != null) {
                                                                                cursor3.close();
                                                                            }
                                                                            iD = i10;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (i3 == 2) {
                                                                        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                                                        O3.b bVar = new O3.b(context);
                                                                        android.os.Parcel parcelY = hVarF.Y();
                                                                        p004a4.h.b(parcelY, bVar);
                                                                        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
                                                                        parcelY.writeInt(1);
                                                                        android.os.Parcel parcelX2 = hVarF.X(parcelY, 5);
                                                                        i9 = parcelX2.readInt();
                                                                        parcelX2.recycle();
                                                                    } else {
                                                                        android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                                                        O3.b bVar2 = new O3.b(context);
                                                                        android.os.Parcel parcelY2 = hVarF.Y();
                                                                        p004a4.h.b(parcelY2, bVar2);
                                                                        parcelY2.writeString("com.google.android.gms.cast.framework.dynamite");
                                                                        parcelY2.writeInt(1);
                                                                        android.os.Parcel parcelX3 = hVarF.X(parcelY2, 3);
                                                                        i9 = parcelX3.readInt();
                                                                        parcelX3.recycle();
                                                                    }
                                                                    iD = i9;
                                                                }
                                                            } catch (android.os.RemoteException e10) {
                                                                e = e10;
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                P3.d.f8109c = bool;
                                if (bool.booleanValue()) {
                                    iD = P3.d.d(context, true, false);
                                } else {
                                    hVarF = P3.d.f(context);
                                    if (hVarF != null) {
                                        android.os.Parcel parcelX4 = hVarF.X(hVarF.Y(), 6);
                                        i3 = parcelX4.readInt();
                                        parcelX4.recycle();
                                        if (i3 >= 3) {
                                            threadLocal = P3.d.f8113h;
                                            gVar = (P3.g) threadLocal.get();
                                            if (gVar != null || (cursor2 = gVar.f8129a) == null) {
                                                cursor = (android.database.Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((java.lang.Long) P3.d.f8114i.get()).longValue()));
                                                if (cursor != null) {
                                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                } else if (cursor.moveToFirst()) {
                                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                } else {
                                                    i10 = cursor.getInt(0);
                                                    if (i10 > 0) {
                                                        gVar2 = (P3.g) threadLocal.get();
                                                        if (gVar2 == null && gVar2.f8129a == null) {
                                                            gVar2.f8129a = cursor;
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (z6) {
                                                        }
                                                    }
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    iD = i10;
                                                }
                                            } else {
                                                iD = cursor2.getInt(0);
                                            }
                                        } else {
                                            if (i3 == 2) {
                                                android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                                O3.b bVar3 = new O3.b(context);
                                                android.os.Parcel parcelY3 = hVarF.Y();
                                                p004a4.h.b(parcelY3, bVar3);
                                                parcelY3.writeString("com.google.android.gms.cast.framework.dynamite");
                                                parcelY3.writeInt(1);
                                                android.os.Parcel parcelX5 = hVarF.X(parcelY3, 5);
                                                i9 = parcelX5.readInt();
                                                parcelX5.recycle();
                                            } else {
                                                android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                                O3.b bVar4 = new O3.b(context);
                                                android.os.Parcel parcelY4 = hVarF.Y();
                                                p004a4.h.b(parcelY4, bVar4);
                                                parcelY4.writeString("com.google.android.gms.cast.framework.dynamite");
                                                parcelY4.writeInt(1);
                                                android.os.Parcel parcelX6 = hVarF.X(parcelY4, 3);
                                                i9 = parcelX6.readInt();
                                                parcelX6.recycle();
                                            }
                                            iD = i9;
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e11) {
                        java.lang.String string = e11.toString();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(string.length() + 30);
                        sb3.append("Failed to load module via V2: ");
                        sb3.append(string);
                        android.util.Log.w("DynamiteModule", sb3.toString());
                        bool = java.lang.Boolean.FALSE;
                    }
                } else if (bool.booleanValue()) {
                    iD = P3.d.d(context, true, false);
                } else {
                    hVarF = P3.d.f(context);
                    if (hVarF != null) {
                        android.os.Parcel parcelX7 = hVarF.X(hVarF.Y(), 6);
                        i3 = parcelX7.readInt();
                        parcelX7.recycle();
                        if (i3 >= 3) {
                            threadLocal = P3.d.f8113h;
                            gVar = (P3.g) threadLocal.get();
                            if (gVar != null) {
                                cursor = (android.database.Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((java.lang.Long) P3.d.f8114i.get()).longValue()));
                                if (cursor != null) {
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else if (cursor.moveToFirst()) {
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                    if (i10 > 0) {
                                        gVar2 = (P3.g) threadLocal.get();
                                        if (gVar2 == null) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    iD = i10;
                                }
                            } else {
                                cursor = (android.database.Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((java.lang.Long) P3.d.f8114i.get()).longValue()));
                                if (cursor != null) {
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else if (cursor.moveToFirst()) {
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                    if (i10 > 0) {
                                        gVar2 = (P3.g) threadLocal.get();
                                        if (gVar2 == null) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    iD = i10;
                                }
                            }
                        } else {
                            if (i3 == 2) {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                O3.b bVar5 = new O3.b(context);
                                android.os.Parcel parcelY5 = hVarF.Y();
                                p004a4.h.b(parcelY5, bVar5);
                                parcelY5.writeString("com.google.android.gms.cast.framework.dynamite");
                                parcelY5.writeInt(1);
                                android.os.Parcel parcelX8 = hVarF.X(parcelY5, 5);
                                i9 = parcelX8.readInt();
                                parcelX8.recycle();
                            } else {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                O3.b bVar6 = new O3.b(context);
                                android.os.Parcel parcelY6 = hVarF.Y();
                                p004a4.h.b(parcelY6, bVar6);
                                parcelY6.writeString("com.google.android.gms.cast.framework.dynamite");
                                parcelY6.writeInt(1);
                                android.os.Parcel parcelX9 = hVarF.X(parcelY6, 3);
                                i9 = parcelX9.readInt();
                                parcelX9.recycle();
                            }
                            iD = i9;
                        }
                    }
                }
            }
            cVar.f8106b = iD;
            if (iD != 0) {
                cVar.f8107c = 1;
                return cVar;
            }
            int iA = P3.d.a(context, "com.google.android.gms.cast.framework.dynamite");
            cVar.f8105a = iA;
            if (iA != 0) {
                cVar.f8107c = -1;
            }
            return cVar;
        } catch (java.lang.Throwable th4) {
            try {
                H3.q.g(context);
                throw th4;
            } catch (java.lang.Exception e12) {
                android.util.Log.e("CrashUtils", "Error adding exception to DropBox!", e12);
                throw th4;
            }
        }
    }

    @Override // S8.a
    public java.util.Map w() {
        return null;
    }

    public o(A8.m mVar) {
        this.f640h = 24;
    }

    @Override // S8.a
    public void clear() {
    }

    @Override // S8.a
    public void r(java.util.Map map) {
    }

    @Override // D1.InterfaceC0237w
    public void a(boolean z6, int i3, int i9, int i10) {
    }

    @Override // D1.InterfaceC0237w
    public void b(int i3, int i9, int i10, int i11) {
    }
}
