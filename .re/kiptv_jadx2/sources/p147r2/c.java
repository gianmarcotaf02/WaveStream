package p147r2;

import Y6.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p105m2.a0;
import p121o0.p;
import q2.i;

public abstract class c {

    public static final i f26806a = new i(2);

    public static final byte[] f26807b = {112, 114, 111, 0};

    public static final byte[] f26808c = {112, 114, 109, 0};

    public static final byte[] f26809d = {48, 49, 53, 0};

    public static final byte[] f26810e = {48, 49, 48, 0};

    public static final byte[] f26811f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};

    public static final byte[] f26812h = {48, 48, 49, 0};

    public static final byte[] f26813i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int i3 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.g * 2) + 7) & (-8)) / 8) + (aVar.f26802e * 2) + d(bArr, aVar.f26798a, aVar.f26799b).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f26803f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f26811f)) {
            int length2 = aVarArr.length;
            while (i3 < length2) {
                a aVar2 = aVarArr[i3];
                q(byteArrayOutputStream, aVar2, d(bArr, aVar2.f26798a, aVar2.f26799b));
                p(byteArrayOutputStream, aVar2);
                i3++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(bArr, aVar3.f26798a, aVar3.f26799b));
            }
            int length3 = aVarArr.length;
            while (i3 < length3) {
                p(byteArrayOutputStream, aVarArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : fileArrListFiles) {
            z6 = c(file2) && z6;
        }
        return z6;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f26812h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return f.m(p.v(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        int i9 = 0;
        while (i9 < i3) {
            int i10 = inputStream.read(bArr, i9, i3 - i9);
            if (i10 < 0) {
                throw new IllegalStateException(M0.l(i3, "Not enough bytes to read: "));
            }
            i9 += i10;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int iM = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i9] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i3, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i3) {
                int i11 = fileInputStream.read(bArr2);
                if (i11 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, i11);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i9 - iInflate);
                    i10 += i11;
                } catch (DataFormatException e6) {
                    throw new IllegalStateException(e6.getMessage());
                }
            }
            if (i10 == i3) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i10);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = f26813i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f26809d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i3, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i3 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i9] = (int) m(byteArrayInputStream, 2);
            strArr[i9] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i10 = 0; i10 < i3; i10++) {
            a aVar = aVarArr[i10];
            if (!aVar.f26799b.equals(strArr[i10])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            aVar.f26802e = i11;
            aVar.f26804h = g(byteArrayInputStream, i11);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i3 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i3; i9++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    if (aVarArr[i10].f26799b.equals(strSubstring)) {
                        aVar = aVarArr[i10];
                        break;
                    }
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f26801d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f26812h)) {
                aVar.f26802e = iM;
                aVar.f26804h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f26810e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i3) throws IOException {
        byte[] bArrF = f(inputStream, i3);
        long j9 = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            j9 += ((long) (bArrF[i9] & 255)) << (i9 * 8);
        }
        return j9;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i9] = new a(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i10 = 0; i10 < i3; i10++) {
            a aVar = aVarArr[i10];
            int iAvailable = byteArrayInputStream.available() - aVar.f26803f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = aVar.f26805i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f26804h = g(byteArrayInputStream, aVar.f26802e);
            int i11 = aVar.g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i11 * 2) + 7) & (-8)) / 8));
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : 0;
                if (bitSetValueOf.get(i12 + i11)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | num.intValue()));
                }
            }
        }
        return aVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        long j9;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f26809d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f26810e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f26805i.size() * 4;
                    String strD = d(bArr4, aVar.f26798a, aVar.f26799b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f26804h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f26800c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.f26805i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i9 : aVar.f26804h) {
                        v(byteArrayOutputStream, i9);
                    }
                }
                return true;
            }
            byte[] bArr5 = f26811f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f26812h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String strD2 = d(bArr6, aVar2.f26798a, aVar2.f26799b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = aVar2.f26805i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f26804h.length);
                u(byteArrayOutputStream, aVar2.f26800c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i10 : aVar2.f26804h) {
                    v(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i11 = 2;
            int i12 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f26800c, 4);
                u(byteArrayOutputStream2, aVar3.f26801d, 4);
                u(byteArrayOutputStream2, aVar3.g, 4);
                String strD3 = d(bArr2, aVar3.f26798a, aVar3.f26799b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i12 = i12 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i12 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i13];
                    v(byteArrayOutputStream3, i13);
                    v(byteArrayOutputStream3, aVar4.f26802e);
                    i14 = i14 + 4 + (aVar4.f26802e * i11);
                    int[] iArr = aVar4.f26804h;
                    int length3 = iArr.length;
                    int i15 = i3;
                    int i16 = i11;
                    int i17 = i15;
                    while (i17 < length3) {
                        int i18 = iArr[i17];
                        v(byteArrayOutputStream3, i18 - i15);
                        i17++;
                        i15 = i18;
                    }
                    i13++;
                    i11 = i16;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i19 = 0;
            int i20 = 0;
            while (i19 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i19];
                    Iterator it3 = aVar5.f26805i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i19);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i21 = i20 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i20 = i21 + length4;
                            i19++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i20 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i20 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(iVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i22);
                int i23 = iVar4.f26825a;
                if (i23 == 1) {
                    j9 = 0;
                } else if (i23 == 2) {
                    j9 = 1;
                } else if (i23 == 3) {
                    j9 = 2;
                } else if (i23 == 4) {
                    j9 = 3;
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    j9 = 4;
                }
                u(byteArrayOutputStream, j9, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = iVar4.f26826b;
                if (iVar4.f26827c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        s(byteArrayOutputStream, aVar);
        int[] iArr = aVar.f26804h;
        int length = iArr.length;
        int i3 = 0;
        int i9 = 0;
        while (i3 < length) {
            int i10 = iArr[i3];
            v(byteArrayOutputStream, i10 - i9);
            i3++;
            i9 = i10;
        }
        int i11 = aVar.g;
        byte[] bArr = new byte[(((i11 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f26805i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i12 = iIntValue / 8;
                bArr[i12] = (byte) (bArr[i12] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i13 = iIntValue + i11;
                int i14 = i13 / 8;
                bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f26802e);
        u(byteArrayOutputStream, aVar.f26803f, 4);
        u(byteArrayOutputStream, aVar.f26800c, 4);
        u(byteArrayOutputStream, aVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i3, a aVar) throws IOException {
        int iBitCount = Integer.bitCount(i3 & (-2));
        int i9 = aVar.g;
        byte[] bArr = new byte[(((iBitCount * i9) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f26805i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = 0;
            for (int i11 = 1; i11 <= 4; i11 <<= 1) {
                if (i11 != 1 && (i11 & i3) != 0) {
                    if ((i11 & iIntValue2) == i11) {
                        int i12 = (i10 * i9) + iIntValue;
                        int i13 = i12 / 8;
                        bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
                    }
                    i10++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i3 = 0;
        for (Map.Entry entry : aVar.f26805i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i3);
                v(byteArrayOutputStream, 0);
                i3 = iIntValue;
            }
        }
    }

    public static void t(Context context, Executor executor, b bVar, boolean z6) {
        char c9;
        byte[] bArr;
        FileInputStream fileInputStreamE;
        a[] aVarArrL;
        a[] aVarArr;
        b bVar2;
        a[] aVarArr2;
        byte[] bArr2;
        boolean z9;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i3;
        boolean z10;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i9;
        a0 a0Var;
        FileInputStream fileInputStreamE2;
        boolean z11;
        boolean z12;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z6) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j9 = dataInputStream.readLong();
                            dataInputStream.close();
                            z12 = j9 == packageInfo.lastUpdateTime;
                            if (z12) {
                                bVar.d(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                if (z12) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    h.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            a0 a0Var2 = new a0(assets, executor, bVar, name, file2);
            byte[] bArr5 = (byte[]) a0Var2.f25267d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            a0Var2.f25264a = true;
                            bArr = f26807b;
                            fileInputStreamE = a0Var2.e(assets, "dexopt/baseline.prof");
                            c9 = '\b';
                            if (fileInputStreamE != null) {
                                if (Arrays.equals(bArr, f(fileInputStreamE, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                aVarArrL = l(fileInputStreamE, f(fileInputStreamE, 4), (String) a0Var2.f25269f);
                                fileInputStreamE.close();
                                a0Var2.g = aVarArrL;
                            }
                            aVarArr = (a[]) a0Var2.g;
                            if (aVarArr != null) {
                                fileInputStreamE2 = a0Var2.e(assets, "dexopt/baseline.profm");
                                if (fileInputStreamE2 == null) {
                                    if (fileInputStreamE2 != null) {
                                        fileInputStreamE2.close();
                                    }
                                    a0Var = null;
                                } else {
                                    if (Arrays.equals(f26808c, f(fileInputStreamE2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    a0Var2.g = i(fileInputStreamE2, f(fileInputStreamE2, 4), bArr5, aVarArr);
                                    fileInputStreamE2.close();
                                    a0Var = a0Var2;
                                }
                                if (a0Var != null) {
                                    a0Var2 = a0Var;
                                }
                            }
                            bVar2 = (b) a0Var2.f25266c;
                            aVarArr2 = (a[]) a0Var2.g;
                            if (aVarArr2 != null) {
                                if (a0Var2.f25264a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (o(byteArrayOutputStream, bArr4, aVarArr2)) {
                                    a0Var2.f25270h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    a0Var2.g = null;
                                } else {
                                    bVar2.d(5, null);
                                    a0Var2.g = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr2 = (byte[]) a0Var2.f25270h;
                            if (bArr2 != null) {
                                if (a0Var2.f25264a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream((File) a0Var2.f25268e);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i3 = byteArrayInputStream.read(bArr3);
                                            if (i3 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i3);
                                        }
                                        c9 = 1;
                                        a0Var2.f(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        a0Var2.f25270h = null;
                                        a0Var2.g = null;
                                        z9 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z9 = false;
                            c9 = 1;
                            if (z9) {
                                e(packageInfo, filesDir);
                            }
                            z10 = z9;
                        } else {
                            a0Var2.f(4, null);
                        }
                    } catch (IOException unused2) {
                        c9 = 1;
                        a0Var2.f(4, null);
                    }
                } else if (file2.canWrite()) {
                    a0Var2.f25264a = true;
                    bArr = f26807b;
                    try {
                        fileInputStreamE = a0Var2.e(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e6) {
                        bVar.d(6, e6);
                        fileInputStreamE = null;
                    } catch (IOException e9) {
                        bVar.d(7, e9);
                        fileInputStreamE = null;
                    }
                    c9 = '\b';
                    try {
                        try {
                            if (fileInputStreamE != null) {
                                try {
                                    try {
                                        if (Arrays.equals(bArr, f(fileInputStreamE, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        aVarArrL = l(fileInputStreamE, f(fileInputStreamE, 4), (String) a0Var2.f25269f);
                                        try {
                                            fileInputStreamE.close();
                                        } catch (IOException e10) {
                                            bVar.d(7, e10);
                                        }
                                        a0Var2.g = aVarArrL;
                                    } catch (IOException e11) {
                                        bVar.d(7, e11);
                                        fileInputStreamE.close();
                                        aVarArrL = null;
                                    }
                                } catch (IllegalStateException e12) {
                                    bVar.d(8, e12);
                                    fileInputStreamE.close();
                                    aVarArrL = null;
                                }
                            }
                        } catch (IOException e13) {
                            bVar.d(7, e13);
                        }
                        aVarArr = (a[]) a0Var2.g;
                        if (aVarArr != null && ((i9 = Build.VERSION.SDK_INT) >= 31 || i9 == 24 || i9 == 25)) {
                            try {
                                fileInputStreamE2 = a0Var2.e(assets, "dexopt/baseline.profm");
                                if (fileInputStreamE2 == null) {
                                    try {
                                        if (Arrays.equals(f26808c, f(fileInputStreamE2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        a0Var2.g = i(fileInputStreamE2, f(fileInputStreamE2, 4), bArr5, aVarArr);
                                        fileInputStreamE2.close();
                                        a0Var = a0Var2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamE2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamE2 != null) {
                                        fileInputStreamE2.close();
                                    }
                                    a0Var = null;
                                }
                            } catch (FileNotFoundException e14) {
                                bVar.d(9, e14);
                            } catch (IOException e15) {
                                bVar.d(7, e15);
                            } catch (IllegalStateException e16) {
                                a0Var2.g = null;
                                bVar.d(8, e16);
                            }
                            if (a0Var != null) {
                                a0Var2 = a0Var;
                            }
                        }
                        bVar2 = (b) a0Var2.f25266c;
                        aVarArr2 = (a[]) a0Var2.g;
                        if (aVarArr2 != null && (bArr4 = (byte[]) a0Var2.f25267d) != null) {
                            if (a0Var2.f25264a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr4);
                                    if (o(byteArrayOutputStream, bArr4, aVarArr2)) {
                                        bVar2.d(5, null);
                                        a0Var2.g = null;
                                        byteArrayOutputStream.close();
                                    } else {
                                        a0Var2.f25270h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        a0Var2.g = null;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e17) {
                                bVar2.d(7, e17);
                            } catch (IllegalStateException e18) {
                                bVar2.d(8, e18);
                            }
                        }
                        bArr2 = (byte[]) a0Var2.f25270h;
                        if (bArr2 != null) {
                            z9 = false;
                            c9 = 1;
                        } else {
                            try {
                                if (a0Var2.f25264a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) a0Var2.f25268e);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i3 = byteArrayInputStream.read(bArr3);
                                                                                    if (i3 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i3);
                                                                                    }
                                                                                }
                                                                                c9 = 1;
                                                                                a0Var2.f(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                a0Var2.f25270h = null;
                                                                                a0Var2.g = null;
                                                                                z9 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e19) {
                                        e = e19;
                                        a0Var2.f(6, e);
                                        a0Var2.f25270h = null;
                                        a0Var2.g = null;
                                        z9 = false;
                                    } catch (IOException e20) {
                                        e = e20;
                                        a0Var2.f(7, e);
                                        a0Var2.f25270h = null;
                                        a0Var2.g = null;
                                        z9 = false;
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    c9 = 1;
                                    a0Var2.f(6, e);
                                    a0Var2.f25270h = null;
                                    a0Var2.g = null;
                                    z9 = false;
                                } catch (IOException e22) {
                                    e = e22;
                                    c9 = 1;
                                    a0Var2.f(7, e);
                                    a0Var2.f25270h = null;
                                    a0Var2.g = null;
                                    z9 = false;
                                }
                            } catch (Throwable th23) {
                                a0Var2.f25270h = null;
                                a0Var2.g = null;
                                throw th23;
                            }
                        }
                        if (z9) {
                            e(packageInfo, filesDir);
                        }
                        z10 = z9;
                    } catch (Throwable th24) {
                        try {
                            fileInputStreamE.close();
                            throw th24;
                        } catch (IOException e23) {
                            bVar.d(7, e23);
                            throw th24;
                        }
                    }
                } else {
                    a0Var2.f(4, null);
                }
                if (z10 || !z6) {
                    z11 = 0;
                } else {
                    z11 = c9;
                }
                h.c(context, z11);
            }
            a0Var2.f(3, Integer.valueOf(Build.VERSION.SDK_INT));
            c9 = 1;
            z10 = false;
            if (z10) {
                z11 = 0;
            } else {
                z11 = 0;
            }
            h.c(context, z11);
        } catch (PackageManager.NameNotFoundException e24) {
            bVar.d(7, e24);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j9, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            bArr[i9] = (byte) ((j9 >> (i9 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i3) throws IOException {
        u(byteArrayOutputStream, i3, 2);
    }
}
