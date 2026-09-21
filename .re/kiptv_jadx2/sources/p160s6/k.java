package p160s6;

import N7.l;
import O7.a;
import O7.q;
import androidx.datastore.preferences.protobuf.C1504k;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.jvm.internal.m;

public abstract class k extends AbstractC1903s {
    public static void O(File file, File file2) throws IOException {
        if (!file.exists()) {
            throw new b(file, null, "The source file doesn't exist.");
        }
        if (file2.exists() && !file2.delete()) {
            throw new b(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C1504k(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                V0.p(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1833d1.l(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC1833d1.l(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static void P(File file) {
        m.e(file, "<this>");
        j jVar = j.f27373h;
        h hVar = new h(new l(file));
        while (true) {
            boolean z6 = true;
            while (hVar.hasNext()) {
                File file2 = (File) hVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z6) {
                    }
                }
                z6 = false;
            }
            return;
        }
    }

    public static byte[] Q(File file) throws IOException {
        m.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
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
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i10);
                m.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i12 = fileInputStream.read();
                if (i12 != -1) {
                    a aVar = new a(8193);
                    aVar.write(i12);
                    V0.p(fileInputStream, aVar, 8192);
                    int size = aVar.size() + i3;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = aVar.b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    m.d(bArrCopyOf, "copyOf(...)");
                    p078i6.m.a0(bArrB, i3, 0, bArrCopyOf, aVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1833d1.l(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String R(File file) throws IOException {
        Charset charset = a.f8024b;
        m.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strG = D.G(inputStreamReader);
            inputStreamReader.close();
            return strG;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1833d1.l(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static File S(File file, String relative) {
        m.e(relative, "relative");
        File file2 = new File(relative);
        String path = file2.getPath();
        m.d(path, "getPath(...)");
        if (AbstractC1903s.z(path) > 0) {
            return file2;
        }
        String string = file.toString();
        m.d(string, "toString(...)");
        if (string.length() != 0) {
            char c9 = File.separatorChar;
            if (!q.F0(string, c9)) {
                return new File(string + c9 + file2);
            }
        }
        return new File(string + file2);
    }

    public static void T(File file, String text) throws IOException {
        Charset charset = a.f8024b;
        m.e(text, "text");
        m.e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            U(fileOutputStream, text, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void U(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        m.e(text, "text");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            m.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        m.b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        m.d(byteBufferAllocate, "allocate(...)");
        int i3 = 0;
        int i9 = 0;
        while (i3 < text.length()) {
            int iMin = Math.min(8192 - i9, text.length() - i3);
            int i10 = i3 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            m.d(cArrArray, "array(...)");
            text.getChars(i3, i10, cArrArray, i9);
            charBufferAllocate.limit(iMin + i9);
            i9 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i10 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
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
