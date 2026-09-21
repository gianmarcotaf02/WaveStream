package p147r2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2.i f26806a = new q2.i(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f26807b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f26808c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f26809d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f26810e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f26811f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f26812h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f26813i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (java.lang.Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(p147r2.a[] aVarArr, byte[] bArr) throws java.io.IOException {
        int i3 = 0;
        int length = 0;
        for (p147r2.a aVar : aVarArr) {
            length += ((((aVar.g * 2) + 7) & (-8)) / 8) + (aVar.f26802e * 2) + d(bArr, aVar.f26798a, aVar.f26799b).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16 + aVar.f26803f;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(length);
        if (java.util.Arrays.equals(bArr, f26811f)) {
            int length2 = aVarArr.length;
            while (i3 < length2) {
                p147r2.a aVar2 = aVarArr[i3];
                q(byteArrayOutputStream, aVar2, d(bArr, aVar2.f26798a, aVar2.f26799b));
                p(byteArrayOutputStream, aVar2);
                i3++;
            }
        } else {
            for (p147r2.a aVar3 : aVarArr) {
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
        throw new java.lang.IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(java.io.File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (java.io.File file2 : fileArrListFiles) {
            z6 = c(file2) && z6;
        }
        return z6;
    }

    public static java.lang.String d(byte[] bArr, java.lang.String str, java.lang.String str2) {
        byte[] bArr2 = f26812h;
        boolean zEquals = java.util.Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        java.lang.Object obj = (zEquals || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!";
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
                return Y6.f.m(p121o0.p.v(str), (java.util.Arrays.equals(bArr, bArr2) || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(android.content.pm.PackageInfo packageInfo, java.io.File file) {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
        }
    }

    public static byte[] f(java.io.InputStream inputStream, int i3) throws java.io.IOException {
        byte[] bArr = new byte[i3];
        int i9 = 0;
        while (i9 < i3) {
            int i10 = inputStream.read(bArr, i9, i3 - i9);
            if (i10 < 0) {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(i3, "Not enough bytes to read: "));
            }
            i9 += i10;
        }
        return bArr;
    }

    public static int[] g(java.io.ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int iM = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i9] = iM;
        }
        return iArr;
    }

    public static byte[] h(java.io.FileInputStream fileInputStream, int i3, int i9) {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i3) {
                int i11 = fileInputStream.read(bArr2);
                if (i11 < 0) {
                    throw new java.lang.IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, i11);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i9 - iInflate);
                    i10 += i11;
                } catch (java.util.zip.DataFormatException e6) {
                    throw new java.lang.IllegalStateException(e6.getMessage());
                }
            }
            if (i10 == i3) {
                if (!inflater.finished()) {
                    throw new java.lang.IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new java.lang.IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i10);
        } catch (java.lang.Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static p147r2.a[] i(java.io.FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, p147r2.a[] aVarArr) throws java.io.IOException {
        byte[] bArr3 = f26813i;
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            if (!java.util.Arrays.equals(bArr, j)) {
                throw new java.lang.IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new java.lang.IllegalStateException("Content found after the end of file");
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArrH);
            try {
                p147r2.a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (java.util.Arrays.equals(f26809d, bArr2)) {
            throw new java.lang.IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            throw new java.lang.IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(bArrH2);
        try {
            p147r2.a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static p147r2.a[] j(java.io.ByteArrayInputStream byteArrayInputStream, int i3, p147r2.a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new p147r2.a[0];
        }
        if (i3 != aVarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        java.lang.String[] strArr = new java.lang.String[i3];
        int[] iArr = new int[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i9] = (int) m(byteArrayInputStream, 2);
            strArr[i9] = new java.lang.String(f(byteArrayInputStream, iM), java.nio.charset.StandardCharsets.UTF_8);
        }
        for (int i10 = 0; i10 < i3; i10++) {
            p147r2.a aVar = aVarArr[i10];
            if (!aVar.f26799b.equals(strArr[i10])) {
                throw new java.lang.IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            aVar.f26802e = i11;
            aVar.f26804h = g(byteArrayInputStream, i11);
        }
        return aVarArr;
    }

    public static p147r2.a[] k(java.io.ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, p147r2.a[] aVarArr) throws java.io.IOException {
        if (byteArrayInputStream.available() == 0) {
            return new p147r2.a[0];
        }
        if (i3 != aVarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i3; i9++) {
            m(byteArrayInputStream, 2);
            java.lang.String str = new java.lang.String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), java.nio.charset.StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            p147r2.a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                java.lang.String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    if (aVarArr[i10].f26799b.equals(strSubstring)) {
                        aVar = aVarArr[i10];
                        break;
                    }
                }
            }
            if (aVar == null) {
                throw new java.lang.IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f26801d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (java.util.Arrays.equals(bArr, f26812h)) {
                aVar.f26802e = iM;
                aVar.f26804h = iArrG;
            }
        }
        return aVarArr;
    }

    public static p147r2.a[] l(java.io.FileInputStream fileInputStream, byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (!java.util.Arrays.equals(bArr, f26810e)) {
            throw new java.lang.IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArrH);
        try {
            p147r2.a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(java.io.InputStream inputStream, int i3) throws java.io.IOException {
        byte[] bArrF = f(inputStream, i3);
        long j9 = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            j9 += ((long) (bArrF[i9] & 255)) << (i9 * 8);
        }
        return j9;
    }

    public static p147r2.a[] n(java.io.ByteArrayInputStream byteArrayInputStream, java.lang.String str, int i3) throws java.io.IOException {
        java.util.TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new p147r2.a[0];
        }
        p147r2.a[] aVarArr = new p147r2.a[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i9] = new p147r2.a(str, new java.lang.String(f(byteArrayInputStream, iM), java.nio.charset.StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new java.util.TreeMap());
        }
        for (int i10 = 0; i10 < i3; i10++) {
            p147r2.a aVar = aVarArr[i10];
            int iAvailable = byteArrayInputStream.available() - aVar.f26803f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = aVar.f26805i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(java.lang.Integer.valueOf(iM3), 1);
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
                throw new java.lang.IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f26804h = g(byteArrayInputStream, aVar.f26802e);
            int i11 = aVar.g;
            java.util.BitSet bitSetValueOf = java.util.BitSet.valueOf(f(byteArrayInputStream, (((i11 * 2) + 7) & (-8)) / 8));
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : 0;
                if (bitSetValueOf.get(i12 + i11)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    java.lang.Integer num = (java.lang.Integer) treeMap.get(java.lang.Integer.valueOf(i12));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(i13 | num.intValue()));
                }
            }
        }
        return aVarArr;
    }

    public static boolean o(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, p147r2.a[] aVarArr) throws java.io.IOException {
        long j9;
        java.util.ArrayList arrayList;
        int length;
        byte[] bArr2 = f26809d;
        int i3 = 0;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f26810e;
            if (java.util.Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = g;
            if (java.util.Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (p147r2.a aVar : aVarArr) {
                    int size = aVar.f26805i.size() * 4;
                    java.lang.String strD = d(bArr4, aVar.f26798a, aVar.f26799b);
                    java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f26804h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f26800c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    java.util.Iterator it = aVar.f26805i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((java.lang.Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i9 : aVar.f26804h) {
                        v(byteArrayOutputStream, i9);
                    }
                }
                return true;
            }
            byte[] bArr5 = f26811f;
            if (java.util.Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f26812h;
            if (!java.util.Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (p147r2.a aVar2 : aVarArr) {
                java.lang.String strD2 = d(bArr6, aVar2.f26798a, aVar2.f26799b);
                java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                java.util.TreeMap treeMap = aVar2.f26805i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f26804h.length);
                u(byteArrayOutputStream, aVar2.f26800c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                java.util.Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((java.lang.Integer) it2.next()).intValue());
                }
                for (int i10 : aVar2.f26804h) {
                    v(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(3);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i11 = 2;
            int i12 = 2;
            for (p147r2.a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f26800c, 4);
                u(byteArrayOutputStream2, aVar3.f26801d, 4);
                u(byteArrayOutputStream2, aVar3.g, 4);
                java.lang.String strD3 = d(bArr2, aVar3.f26798a, aVar3.f26799b);
                java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i12 = i12 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i12 != byteArray.length) {
                throw new java.lang.IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            }
            p147r2.i iVar = new p147r2.i(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < aVarArr.length) {
                try {
                    p147r2.a aVar4 = aVarArr[i13];
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
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray2.length) {
                throw new java.lang.IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
            }
            p147r2.i iVar2 = new p147r2.i(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
            int i19 = 0;
            int i20 = 0;
            while (i19 < aVarArr.length) {
                try {
                    p147r2.a aVar5 = aVarArr[i19];
                    java.util.Iterator it3 = aVar5.f26805i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((java.lang.Integer) ((java.util.Map.Entry) it3.next()).getValue()).intValue();
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream5 = new java.io.ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        java.io.ByteArrayOutputStream byteArrayOutputStream6 = new java.io.ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i19);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i21 = i20 + 6;
                            java.util.ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i20 = i21 + length4;
                            i19++;
                            arrayList3 = arrayList4;
                        } catch (java.lang.Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            java.util.ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i20 != byteArray5.length) {
                throw new java.lang.IllegalStateException("Expected size " + i20 + ", does not match actual size " + byteArray5.length);
            }
            p147r2.i iVar3 = new p147r2.i(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(iVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                p147r2.i iVar4 = (p147r2.i) arrayList2.get(i22);
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
            java.util.ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
            }
            return true;
        } catch (java.lang.Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(java.io.ByteArrayOutputStream byteArrayOutputStream, p147r2.a aVar) throws java.io.IOException {
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
        for (java.util.Map.Entry entry : aVar.f26805i.entrySet()) {
            int iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
            int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
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

    public static void q(java.io.ByteArrayOutputStream byteArrayOutputStream, p147r2.a aVar, java.lang.String str) throws java.io.IOException {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f26802e);
        u(byteArrayOutputStream, aVar.f26803f, 4);
        u(byteArrayOutputStream, aVar.f26800c, 4);
        u(byteArrayOutputStream, aVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(java.io.ByteArrayOutputStream byteArrayOutputStream, int i3, p147r2.a aVar) throws java.io.IOException {
        int iBitCount = java.lang.Integer.bitCount(i3 & (-2));
        int i9 = aVar.g;
        byte[] bArr = new byte[(((iBitCount * i9) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : aVar.f26805i.entrySet()) {
            int iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
            int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
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

    public static void s(java.io.ByteArrayOutputStream byteArrayOutputStream, p147r2.a aVar) throws java.io.IOException {
        int i3 = 0;
        for (java.util.Map.Entry entry : aVar.f26805i.entrySet()) {
            int iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i3);
                v(byteArrayOutputStream, 0);
                i3 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0194 A[Catch: all -> 0x0191, TRY_ENTER, TryCatch #32 {all -> 0x0191, blocks: (B:94:0x0170, B:96:0x017c, B:107:0x0194, B:108:0x0199), top: B:282:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a5 A[Catch: IllegalStateException -> 0x018b, IOException -> 0x018d, FileNotFoundException -> 0x018f, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x018f, IOException -> 0x018d, IllegalStateException -> 0x018b, blocks: (B:92:0x0168, B:97:0x0186, B:115:0x01a5, B:113:0x01a2, B:112:0x019f), top: B:298:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e5 A[Catch: all -> 0x01f3, TRY_LEAVE, TryCatch #14 {all -> 0x01f3, blocks: (B:131:0x01d9, B:133:0x01e5, B:142:0x01f6), top: B:269:0x01d9, outer: #39 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x01f6 A[Catch: all -> 0x01f3, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x01f3, blocks: (B:131:0x01d9, B:133:0x01e5, B:142:0x01f6), top: B:269:0x01d9, outer: #39 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0213  */
    /* JADX WARN: Code duplicated, block: B:157:0x021f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0223  */
    /* JADX WARN: Code duplicated, block: B:167:0x0245 A[Catch: all -> 0x0283, TryCatch #24 {all -> 0x0283, blocks: (B:165:0x023f, B:167:0x0245, B:168:0x0249, B:170:0x024f), top: B:274:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:170:0x024f A[Catch: all -> 0x0283, TRY_LEAVE, TryCatch #24 {all -> 0x0283, blocks: (B:165:0x023f, B:167:0x0245, B:168:0x0249, B:170:0x024f), top: B:274:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:236:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:240:0x02de  */
    /* JADX WARN: Code duplicated, block: B:247:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:266:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0254 A[EDGE_INSN: B:299:0x0254->B:172:0x0254 BREAK  A[LOOP:0: B:168:0x0249->B:300:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #12 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:266:0x0107, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #12 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:266:0x0107, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017c A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #32 {all -> 0x0191, blocks: (B:94:0x0170, B:96:0x017c, B:107:0x0194, B:108:0x0199), top: B:282:0x0170 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void t(android.content.Context context, java.util.concurrent.Executor executor, p147r2.b bVar, boolean z6) {
        char c9;
        byte[] bArr;
        java.io.FileInputStream fileInputStreamE;
        p147r2.a[] aVarArrL;
        p147r2.a[] aVarArr;
        p147r2.b bVar2;
        p147r2.a[] aVarArr2;
        byte[] bArr2;
        boolean z9;
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.lang.Throwable th;
        java.io.FileOutputStream fileOutputStream;
        java.lang.Throwable th2;
        java.nio.channels.FileChannel channel;
        java.nio.channels.FileLock fileLockTryLock;
        byte[] bArr3;
        int i3;
        boolean z10;
        byte[] bArr4;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        int i9;
        p105m2.a0 a0Var;
        java.io.FileInputStream fileInputStreamE2;
        boolean z11;
        boolean z12;
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.String packageName = applicationContext.getPackageName();
        android.content.pm.ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        android.content.res.AssetManager assets = applicationContext.getAssets();
        java.lang.String name = new java.io.File(applicationInfo.sourceDir).getName();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            java.io.File filesDir = context.getFilesDir();
            if (!z6) {
                java.io.File file = new java.io.File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
                        try {
                            long j9 = dataInputStream.readLong();
                            dataInputStream.close();
                            z12 = j9 == packageInfo.lastUpdateTime;
                            if (z12) {
                                bVar.d(2, null);
                            }
                        } catch (java.lang.Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (java.io.IOException unused) {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                if (z12) {
                    android.util.Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    p147r2.h.c(context, false);
                    return;
                }
            }
            android.util.Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            java.io.File file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            p105m2.a0 a0Var2 = new p105m2.a0(assets, executor, bVar, name, file2);
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
                                if (java.util.Arrays.equals(bArr, f(fileInputStreamE, 4))) {
                                    throw new java.lang.IllegalStateException("Invalid magic");
                                }
                                aVarArrL = l(fileInputStreamE, f(fileInputStreamE, 4), (java.lang.String) a0Var2.f25269f);
                                fileInputStreamE.close();
                                a0Var2.g = aVarArrL;
                            }
                            aVarArr = (p147r2.a[]) a0Var2.g;
                            if (aVarArr != null) {
                                fileInputStreamE2 = a0Var2.e(assets, "dexopt/baseline.profm");
                                if (fileInputStreamE2 == null) {
                                    if (fileInputStreamE2 != null) {
                                        fileInputStreamE2.close();
                                    }
                                    a0Var = null;
                                } else {
                                    if (java.util.Arrays.equals(f26808c, f(fileInputStreamE2, 4))) {
                                        throw new java.lang.IllegalStateException("Invalid magic");
                                    }
                                    a0Var2.g = i(fileInputStreamE2, f(fileInputStreamE2, 4), bArr5, aVarArr);
                                    fileInputStreamE2.close();
                                    a0Var = a0Var2;
                                }
                                if (a0Var != null) {
                                    a0Var2 = a0Var;
                                }
                            }
                            bVar2 = (p147r2.b) a0Var2.f25266c;
                            aVarArr2 = (p147r2.a[]) a0Var2.g;
                            if (aVarArr2 != null) {
                                if (a0Var2.f25264a) {
                                    throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
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
                                    throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2);
                                fileOutputStream = new java.io.FileOutputStream((java.io.File) a0Var2.f25268e);
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
                                throw new java.io.IOException("Unable to acquire a lock on the underlying file channel.");
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
                    } catch (java.io.IOException unused2) {
                        c9 = 1;
                        a0Var2.f(4, null);
                    }
                } else if (file2.canWrite()) {
                    a0Var2.f25264a = true;
                    bArr = f26807b;
                    try {
                        fileInputStreamE = a0Var2.e(assets, "dexopt/baseline.prof");
                    } catch (java.io.FileNotFoundException e6) {
                        bVar.d(6, e6);
                        fileInputStreamE = null;
                    } catch (java.io.IOException e9) {
                        bVar.d(7, e9);
                        fileInputStreamE = null;
                    }
                    c9 = '\b';
                    try {
                        try {
                            if (fileInputStreamE != null) {
                                try {
                                    try {
                                        if (java.util.Arrays.equals(bArr, f(fileInputStreamE, 4))) {
                                            throw new java.lang.IllegalStateException("Invalid magic");
                                        }
                                        aVarArrL = l(fileInputStreamE, f(fileInputStreamE, 4), (java.lang.String) a0Var2.f25269f);
                                        try {
                                            fileInputStreamE.close();
                                        } catch (java.io.IOException e10) {
                                            bVar.d(7, e10);
                                        }
                                        a0Var2.g = aVarArrL;
                                    } catch (java.io.IOException e11) {
                                        bVar.d(7, e11);
                                        fileInputStreamE.close();
                                        aVarArrL = null;
                                    }
                                } catch (java.lang.IllegalStateException e12) {
                                    bVar.d(8, e12);
                                    fileInputStreamE.close();
                                    aVarArrL = null;
                                }
                            }
                        } catch (java.io.IOException e13) {
                            bVar.d(7, e13);
                        }
                        aVarArr = (p147r2.a[]) a0Var2.g;
                        if (aVarArr != null && ((i9 = android.os.Build.VERSION.SDK_INT) >= 31 || i9 == 24 || i9 == 25)) {
                            try {
                                fileInputStreamE2 = a0Var2.e(assets, "dexopt/baseline.profm");
                                if (fileInputStreamE2 == null) {
                                    try {
                                        if (java.util.Arrays.equals(f26808c, f(fileInputStreamE2, 4))) {
                                            throw new java.lang.IllegalStateException("Invalid magic");
                                        }
                                        a0Var2.g = i(fileInputStreamE2, f(fileInputStreamE2, 4), bArr5, aVarArr);
                                        fileInputStreamE2.close();
                                        a0Var = a0Var2;
                                    } catch (java.lang.Throwable th5) {
                                        try {
                                            fileInputStreamE2.close();
                                            throw th5;
                                        } catch (java.lang.Throwable th6) {
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
                            } catch (java.io.FileNotFoundException e14) {
                                bVar.d(9, e14);
                            } catch (java.io.IOException e15) {
                                bVar.d(7, e15);
                            } catch (java.lang.IllegalStateException e16) {
                                a0Var2.g = null;
                                bVar.d(8, e16);
                            }
                            if (a0Var != null) {
                                a0Var2 = a0Var;
                            }
                        }
                        bVar2 = (p147r2.b) a0Var2.f25266c;
                        aVarArr2 = (p147r2.a[]) a0Var2.g;
                        if (aVarArr2 != null && (bArr4 = (byte[]) a0Var2.f25267d) != null) {
                            if (a0Var2.f25264a) {
                                throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
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
                                } catch (java.lang.Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (java.lang.Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (java.io.IOException e17) {
                                bVar2.d(7, e17);
                            } catch (java.lang.IllegalStateException e18) {
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
                                    throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new java.io.FileOutputStream((java.io.File) a0Var2.f25268e);
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
                                                                        } catch (java.lang.Throwable th9) {
                                                                            th = th9;
                                                                            java.lang.Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (java.lang.Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new java.io.IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (java.lang.Throwable th12) {
                                                                    th = th12;
                                                                    java.lang.Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (java.lang.Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (java.lang.Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (java.lang.Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (java.lang.Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (java.lang.Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (java.lang.Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (java.lang.Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (java.io.FileNotFoundException e19) {
                                        e = e19;
                                        a0Var2.f(6, e);
                                        a0Var2.f25270h = null;
                                        a0Var2.g = null;
                                        z9 = false;
                                    } catch (java.io.IOException e20) {
                                        e = e20;
                                        a0Var2.f(7, e);
                                        a0Var2.f25270h = null;
                                        a0Var2.g = null;
                                        z9 = false;
                                    }
                                } catch (java.io.FileNotFoundException e21) {
                                    e = e21;
                                    c9 = 1;
                                    a0Var2.f(6, e);
                                    a0Var2.f25270h = null;
                                    a0Var2.g = null;
                                    z9 = false;
                                } catch (java.io.IOException e22) {
                                    e = e22;
                                    c9 = 1;
                                    a0Var2.f(7, e);
                                    a0Var2.f25270h = null;
                                    a0Var2.g = null;
                                    z9 = false;
                                }
                            } catch (java.lang.Throwable th23) {
                                a0Var2.f25270h = null;
                                a0Var2.g = null;
                                throw th23;
                            }
                        }
                        if (z9) {
                            e(packageInfo, filesDir);
                        }
                        z10 = z9;
                    } catch (java.lang.Throwable th24) {
                        try {
                            fileInputStreamE.close();
                            throw th24;
                        } catch (java.io.IOException e23) {
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
                p147r2.h.c(context, z11);
            }
            a0Var2.f(3, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            c9 = 1;
            z10 = false;
            if (z10) {
                z11 = 0;
            } else {
                z11 = 0;
            }
            p147r2.h.c(context, z11);
        } catch (android.content.pm.PackageManager.NameNotFoundException e24) {
            bVar.d(7, e24);
            p147r2.h.c(context, false);
        }
    }

    public static void u(java.io.ByteArrayOutputStream byteArrayOutputStream, long j9, int i3) throws java.io.IOException {
        byte[] bArr = new byte[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            bArr[i9] = (byte) ((j9 >> (i9 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(java.io.ByteArrayOutputStream byteArrayOutputStream, int i3) throws java.io.IOException {
        u(byteArrayOutputStream, i3, 2);
    }
}
