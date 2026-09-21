package B3;

import D1.InterfaceC0237w;
import M8.AbstractC0674b;
import M8.C0675c;
import M8.C0678f;
import M8.C0682j;
import M8.C0685m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class o implements InterfaceC0237w, S8.a {

    public static o f639i;

    public final int f640h;

    public o(int i3) {
        this.f640h = i3;
    }

    public static final String c(byte[] bArr, byte[][] bArr2, int i3) {
        int i9;
        boolean z6;
        int i10;
        int i11;
        int i12 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f26160e;
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
                        Charset UTF_8 = StandardCharsets.UTF_8;
                        kotlin.jvm.internal.m.d(UTF_8, "UTF_8");
                        return new String(bArr, i15, i17, UTF_8);
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

    public static final void d(C0678f c0678f, long j, boolean z6) {
        C0678f c0678f2;
        ReentrantLock reentrantLock = C0678f.f7245h;
        if (C0678f.f7248l == null) {
            C0678f.f7248l = new C0678f();
            C0675c c0675c = new C0675c("Okio Watchdog");
            c0675c.setDaemon(true);
            c0675c.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z6) {
            c0678f.g = Math.min(j, c0678f.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c0678f.g = j + jNanoTime;
        } else {
            if (!z6) {
                throw new AssertionError();
            }
            c0678f.g = c0678f.c();
        }
        long j9 = c0678f.g - jNanoTime;
        C0678f c0678f3 = C0678f.f7248l;
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
        if (c0678f3 == C0678f.f7248l) {
            C0678f.f7246i.signal();
        }
    }

    public static final boolean e(M8.A a2) {
        M8.A a9 = N8.f.f7484m;
        return !O7.x.q0(a2.b(), ".class", true);
    }

    public static ArrayList f(List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((w8.t) obj) != w8.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p078i6.q.I0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w8.t) it.next()).f30653h);
        }
        return arrayList2;
    }

    public static C0678f g() throws InterruptedException {
        C0678f c0678f = C0678f.f7248l;
        kotlin.jvm.internal.m.b(c0678f);
        C0678f c0678f2 = c0678f.f7250f;
        if (c0678f2 == null) {
            long jNanoTime = System.nanoTime();
            C0678f.f7246i.await(C0678f.j, TimeUnit.MILLISECONDS);
            C0678f c0678f3 = C0678f.f7248l;
            kotlin.jvm.internal.m.b(c0678f3);
            if (c0678f3.f7250f != null || System.nanoTime() - jNanoTime < C0678f.f7247k) {
                return null;
            }
            return C0678f.f7248l;
        }
        long jNanoTime2 = c0678f2.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0678f.f7246i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0678f c0678f4 = C0678f.f7248l;
        kotlin.jvm.internal.m.b(c0678f4);
        c0678f4.f7250f = c0678f2.f7250f;
        c0678f2.f7250f = null;
        c0678f2.f7249e = 2;
        return c0678f2;
    }

    public static byte[] h(List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        C0682j c0682j = new C0682j();
        for (String str : f(protocols)) {
            c0682j.Z(str.length());
            c0682j.d0(str);
        }
        return c0682j.v(c0682j.f7260i);
    }

    public static C0685m i(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i9 = i3 * 2;
            bArr[i3] = (byte) (N8.b.a(str.charAt(i9 + 1)) + (N8.b.a(str.charAt(i9)) << 4));
        }
        return new C0685m(bArr);
    }

    public static C0685m j(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        byte[] bytes = str.getBytes(O7.a.f8024b);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        C0685m c0685m = new C0685m(bytes);
        c0685m.j = str;
        return c0685m;
    }

    public static M8.A k(String str, boolean z6) {
        kotlin.jvm.internal.m.e(str, "<this>");
        C0685m c0685m = N8.c.f7475a;
        C0682j c0682j = new C0682j();
        c0682j.d0(str);
        return N8.c.d(c0682j, z6);
    }

    public static M8.A l(File file) {
        String str = M8.A.f7207i;
        String string = file.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return k(string, false);
    }

    public static boolean o() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static C0685m q(byte[] bArr, int i3) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        if (i3 == -1234567890) {
            i3 = bArr.length;
        }
        AbstractC0674b.e(bArr.length, 0, i3);
        return new C0685m(p078i6.m.f0(bArr, 0, i3));
    }

    public Object m(String str, Provider provider) {
        switch (this.f640h) {
            case 1:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 2:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 3:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 4:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 5:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 6:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public android.content.pm.Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean p(CharSequence charSequence) {
        return false;
    }

    public P3.c s(Context context, o oVar) {
        int iD;
        P3.h hVarF;
        int i3;
        int i9;
        ThreadLocal threadLocal;
        P3.g gVar;
        Cursor cursor;
        int i10;
        P3.g gVar2;
        boolean z6;
        Cursor cursor2;
        P3.c cVar = new P3.c();
        oVar.getClass();
        try {
            synchronized (P3.d.class) {
                Boolean bool = P3.d.f8109c;
                iD = 0;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        P3.d.e(classLoader);
                                    } catch (P3.b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else if (P3.d.c(context)) {
                                    if (P3.d.f8111e) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iD2 = P3.d.d(context, true, true);
                                                String str = P3.d.f8110d;
                                                if (str != null && !str.isEmpty()) {
                                                    ClassLoader classLoaderO0 = P3.e.o0();
                                                    if (classLoaderO0 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            P3.a.f();
                                                            String str2 = P3.d.f8110d;
                                                            H3.q.g(str2);
                                                            classLoaderO0 = P3.a.d(ClassLoader.getSystemClassLoader(), str2);
                                                        } else {
                                                            String str3 = P3.d.f8110d;
                                                            H3.q.g(str3);
                                                            classLoaderO0 = new P3.f(str3, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    P3.d.e(classLoaderO0);
                                                    declaredField.set(null, classLoaderO0);
                                                    P3.d.f8109c = bool2;
                                                }
                                                iD = iD2;
                                            } catch (P3.b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                                P3.d.f8109c = bool;
                                                if (bool.booleanValue()) {
                                                    try {
                                                        iD = P3.d.d(context, true, false);
                                                    } catch (P3.b e6) {
                                                        String message = e6.getMessage();
                                                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 42);
                                                        sb.append("Failed to retrieve remote module version: ");
                                                        sb.append(message);
                                                        Log.w("DynamiteModule", sb.toString());
                                                    }
                                                } else {
                                                    hVarF = P3.d.f(context);
                                                    try {
                                                        if (hVarF != null) {
                                                            try {
                                                                Parcel parcelX = hVarF.X(hVarF.Y(), 6);
                                                                i3 = parcelX.readInt();
                                                                parcelX.recycle();
                                                                if (i3 >= 3) {
                                                                    threadLocal = P3.d.f8113h;
                                                                    gVar = (P3.g) threadLocal.get();
                                                                    if (gVar != null) {
                                                                        cursor = (Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((Long) P3.d.f8114i.get()).longValue()));
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
                                                                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                                    if (cursor != null) {
                                                                                        cursor.close();
                                                                                    }
                                                                                }
                                                                            } catch (RemoteException e9) {
                                                                                e = e9;
                                                                                cursor3 = cursor;
                                                                                String message2 = e.getMessage();
                                                                                StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 42);
                                                                                sb2.append("Failed to retrieve remote module version: ");
                                                                                sb2.append(message2);
                                                                                Log.w("DynamiteModule", sb2.toString());
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                cursor3 = cursor;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cursor = (Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((Long) P3.d.f8114i.get()).longValue()));
                                                                        if (cursor != null) {
                                                                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        } else if (cursor.moveToFirst()) {
                                                                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
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
                                                                        Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                                                        O3.b bVar = new O3.b(context);
                                                                        Parcel parcelY = hVarF.Y();
                                                                        p004a4.h.b(parcelY, bVar);
                                                                        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
                                                                        parcelY.writeInt(1);
                                                                        Parcel parcelX2 = hVarF.X(parcelY, 5);
                                                                        i9 = parcelX2.readInt();
                                                                        parcelX2.recycle();
                                                                    } else {
                                                                        Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                                                        O3.b bVar2 = new O3.b(context);
                                                                        Parcel parcelY2 = hVarF.Y();
                                                                        p004a4.h.b(parcelY2, bVar2);
                                                                        parcelY2.writeString("com.google.android.gms.cast.framework.dynamite");
                                                                        parcelY2.writeInt(1);
                                                                        Parcel parcelX3 = hVarF.X(parcelY2, 3);
                                                                        i9 = parcelX3.readInt();
                                                                        parcelX3.recycle();
                                                                    }
                                                                    iD = i9;
                                                                }
                                                            } catch (RemoteException e10) {
                                                                e = e10;
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
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
                                        Parcel parcelX4 = hVarF.X(hVarF.Y(), 6);
                                        i3 = parcelX4.readInt();
                                        parcelX4.recycle();
                                        if (i3 >= 3) {
                                            threadLocal = P3.d.f8113h;
                                            gVar = (P3.g) threadLocal.get();
                                            if (gVar != null || (cursor2 = gVar.f8129a) == null) {
                                                cursor = (Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((Long) P3.d.f8114i.get()).longValue()));
                                                if (cursor != null) {
                                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                } else if (cursor.moveToFirst()) {
                                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
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
                                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                                O3.b bVar3 = new O3.b(context);
                                                Parcel parcelY3 = hVarF.Y();
                                                p004a4.h.b(parcelY3, bVar3);
                                                parcelY3.writeString("com.google.android.gms.cast.framework.dynamite");
                                                parcelY3.writeInt(1);
                                                Parcel parcelX5 = hVarF.X(parcelY3, 5);
                                                i9 = parcelX5.readInt();
                                                parcelX5.recycle();
                                            } else {
                                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                                O3.b bVar4 = new O3.b(context);
                                                Parcel parcelY4 = hVarF.Y();
                                                p004a4.h.b(parcelY4, bVar4);
                                                parcelY4.writeString("com.google.android.gms.cast.framework.dynamite");
                                                parcelY4.writeInt(1);
                                                Parcel parcelX6 = hVarF.X(parcelY4, 3);
                                                i9 = parcelX6.readInt();
                                                parcelX6.recycle();
                                            }
                                            iD = i9;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String string = e11.toString();
                        StringBuilder sb3 = new StringBuilder(string.length() + 30);
                        sb3.append("Failed to load module via V2: ");
                        sb3.append(string);
                        Log.w("DynamiteModule", sb3.toString());
                        bool = Boolean.FALSE;
                    }
                } else if (bool.booleanValue()) {
                    iD = P3.d.d(context, true, false);
                } else {
                    hVarF = P3.d.f(context);
                    if (hVarF != null) {
                        Parcel parcelX7 = hVarF.X(hVarF.Y(), 6);
                        i3 = parcelX7.readInt();
                        parcelX7.recycle();
                        if (i3 >= 3) {
                            threadLocal = P3.d.f8113h;
                            gVar = (P3.g) threadLocal.get();
                            if (gVar != null) {
                                cursor = (Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((Long) P3.d.f8114i.get()).longValue()));
                                if (cursor != null) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else if (cursor.moveToFirst()) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
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
                                cursor = (Cursor) O3.b.e0(hVarF.h0(new O3.b(context), true, ((Long) P3.d.f8114i.get()).longValue()));
                                if (cursor != null) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else if (cursor.moveToFirst()) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
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
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                O3.b bVar5 = new O3.b(context);
                                Parcel parcelY5 = hVarF.Y();
                                p004a4.h.b(parcelY5, bVar5);
                                parcelY5.writeString("com.google.android.gms.cast.framework.dynamite");
                                parcelY5.writeInt(1);
                                Parcel parcelX8 = hVarF.X(parcelY5, 5);
                                i9 = parcelX8.readInt();
                                parcelX8.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                O3.b bVar6 = new O3.b(context);
                                Parcel parcelY6 = hVarF.Y();
                                p004a4.h.b(parcelY6, bVar6);
                                parcelY6.writeString("com.google.android.gms.cast.framework.dynamite");
                                parcelY6.writeInt(1);
                                Parcel parcelX9 = hVarF.X(parcelY6, 3);
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
        } catch (Throwable th4) {
            try {
                H3.q.g(context);
                throw th4;
            } catch (Exception e12) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e12);
                throw th4;
            }
        }
    }

    @Override
    public Map w() {
        return null;
    }

    public o(A8.m mVar) {
        this.f640h = 24;
    }

    @Override
    public void clear() {
    }

    @Override
    public void r(Map map) {
    }

    @Override
    public void a(boolean z6, int i3, int i9, int i10) {
    }

    @Override
    public void b(int i3, int i9, int i10, int i11) {
    }
}
