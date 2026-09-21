package p160s6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends com.google.common.util.concurrent.AbstractC1903s {
    public static void O(java.io.File file, java.io.File file2) throws java.io.IOException {
        if (!file.exists()) {
            throw new p160s6.b(file, null, "The source file doesn't exist.");
        }
        if (file2.exists() && !file2.delete()) {
            throw new p160s6.b(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new androidx.datastore.preferences.protobuf.C1504k(file, file2, "Failed to create target directory.");
            }
            return;
        }
        java.io.File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
            try {
                com.google.android.gms.internal.play_billing.V0.p(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static void P(java.io.File file) {
        kotlin.jvm.internal.m.e(file, "<this>");
        p160s6.j jVar = p160s6.j.f27373h;
        p160s6.h hVar = new p160s6.h(new N7.l(file));
        while (true) {
            boolean z6 = true;
            while (hVar.hasNext()) {
                java.io.File file2 = (java.io.File) hVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z6) {
                    }
                }
                z6 = false;
            }
            return;
        }
    }

    public static byte[] Q(java.io.File file) throws java.io.IOException {
        kotlin.jvm.internal.m.e(file, "<this>");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new java.lang.OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i3 = (int) length;
            byte[] bArrCopyOf = new byte[i3];
            int i9 = i3;
            int i10 = 0;
            while (i9 > 0) {
                int i11 = fileInputStream.read(bArrCopyOf, i10, i9);
                if (i11 < 0) {
                    break;
                }
                i9 -= i11;
                i10 += i11;
            }
            if (i9 > 0) {
                bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, i10);
                kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i12 = fileInputStream.read();
                if (i12 != -1) {
                    p160s6.a aVar = new p160s6.a(8193);
                    aVar.write(i12);
                    com.google.android.gms.internal.play_billing.V0.p(fileInputStream, aVar, 8192);
                    int size = aVar.size() + i3;
                    if (size < 0) {
                        throw new java.lang.OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = aVar.b();
                    bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, size);
                    kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
                    p078i6.m.a0(bArrB, i3, 0, bArrCopyOf, aVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static java.lang.String R(java.io.File file) throws java.io.IOException {
        java.nio.charset.Charset charset = O7.a.f8024b;
        kotlin.jvm.internal.m.e(charset, "charset");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        try {
            java.lang.String strG = com.google.common.util.concurrent.D.G(inputStreamReader);
            inputStreamReader.close();
            return strG;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static java.io.File S(java.io.File file, java.lang.String relative) {
        kotlin.jvm.internal.m.e(relative, "relative");
        java.io.File file2 = new java.io.File(relative);
        java.lang.String path = file2.getPath();
        kotlin.jvm.internal.m.d(path, "getPath(...)");
        if (com.google.common.util.concurrent.AbstractC1903s.z(path) > 0) {
            return file2;
        }
        java.lang.String string = file.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        if (string.length() != 0) {
            char c9 = java.io.File.separatorChar;
            if (!O7.q.F0(string, c9)) {
                return new java.io.File(string + c9 + file2);
            }
        }
        return new java.io.File(string + file2);
    }

    public static void T(java.io.File file, java.lang.String text) throws java.io.IOException {
        java.nio.charset.Charset charset = O7.a.f8024b;
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(charset, "charset");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            U(fileOutputStream, text, charset);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void U(java.io.FileOutputStream fileOutputStream, java.lang.String text, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.m.e(text, "text");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPLACE;
        java.nio.charset.CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        java.nio.CharBuffer charBufferAllocate = java.nio.CharBuffer.allocate(8192);
        kotlin.jvm.internal.m.b(charsetEncoderOnUnmappableCharacter);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8192 * ((int) java.lang.Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        kotlin.jvm.internal.m.d(byteBufferAllocate, "allocate(...)");
        int i3 = 0;
        int i9 = 0;
        while (i3 < text.length()) {
            int iMin = java.lang.Math.min(8192 - i9, text.length() - i3);
            int i10 = i3 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            kotlin.jvm.internal.m.d(cArrArray, "array(...)");
            text.getChars(i3, i10, cArrArray, i9);
            charBufferAllocate.limit(iMin + i9);
            i9 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i10 == text.length()).isUnderflow()) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i9 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i3 = i10;
        }
    }
}
