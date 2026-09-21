package com.revenuecat.purchases.storage;

import O7.a;
import O7.q;
import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.ChecksumKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.h;
import p160s6.k;
import p194x6.j;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010,R\u0018\u0010.\u001a\u00020\u0015*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileCache;", "Lcom/revenuecat/purchases/storage/LocalFileCache;", "Landroid/content/Context;", "context", "", "subDir", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "bytes", "md5Hex", "([B)Ljava/lang/String;", "Ljava/io/InputStream;", "inputStream", "Ljava/io/File;", "file", "Lh6/A;", "streamToFile", "(Ljava/io/InputStream;Ljava/io/File;)V", "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "", "streamToFileAndCompareChecksum", "(Ljava/io/InputStream;Ljava/io/File;Lcom/revenuecat/purchases/models/Checksum;)Z", "Ljava/net/URL;", "remoteURL", "Ljava/net/URI;", "generateLocalFilesystemURI", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;", "uri", "cachedContentExists", "(Ljava/net/URI;)Z", "saveData", "(Ljava/io/InputStream;Ljava/net/URI;Lcom/revenuecat/purchases/models/Checksum;)V", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/security/MessageDigest;", "md$delegate", "Lh6/h;", "getMd", "()Ljava/security/MessageDigest;", "md", "cacheDir$delegate", "getCacheDir", "()Ljava/io/File;", "cacheDir", "isFalse", "(Z)Z", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultFileCache implements LocalFileCache {
    private static final int BUFFER_SIZE = 262144;
    public static final String DEFAULT_SUBDIR = "rc_files";

    private final h cacheDir;
    private final Context context;

    private final h md;
    private final String subDir;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends o implements j {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b9) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b9)}, 1));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    public DefaultFileCache(Context context, String subDir) {
        m.e(context, "context");
        m.e(subDir, "subDir");
        this.context = context;
        this.subDir = subDir;
        this.md = D.B(DefaultFileCache$md$2.INSTANCE);
        this.cacheDir = D.B(new DefaultFileCache$cacheDir$2(this));
    }

    private final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md.getValue();
        m.d(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    private final boolean isFalse(boolean z6) {
        return !z6;
    }

    private final String md5Hex(byte[] bytes) {
        byte[] bArrDigest = getMd().digest(bytes);
        m.d(bArrDigest, "md.digest(bytes)");
        return p078i6.m.u0(bArrDigest, "", AnonymousClass1.INSTANCE, 30);
    }

    private final void streamToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            V0.p(inputStream, fileOutputStream, 262144);
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

    private final boolean streamToFileAndCompareChecksum(InputStream inputStream, File file, Checksum checksum) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(checksum.getAlgorithm().getAlgorithmName());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[262144];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    byte[] hash = messageDigest.digest();
                    Checksum.Algorithm algorithm = checksum.getAlgorithm();
                    m.d(hash, "hash");
                    return checksum.equals(new Checksum(algorithm, ChecksumKt.toHexString(hash)));
                }
                messageDigest.update(bArr, 0, i3);
                fileOutputStream.write(bArr, 0, i3);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override
    public boolean cachedContentExists(URI uri) {
        m.e(uri, "uri");
        return new File(uri).exists();
    }

    @Override
    public URI generateLocalFilesystemURI(URL remoteURL, Checksum checksum) {
        String value;
        m.e(remoteURL, "remoteURL");
        String string = remoteURL.toString();
        m.d(string, "remoteURL.toString()");
        byte[] bytes = string.getBytes(a.f8024b);
        m.d(bytes, "getBytes(...)");
        String strMd5Hex = md5Hex(bytes);
        StringBuilder sb = new StringBuilder();
        sb.append(new File(strMd5Hex).getName());
        if (checksum == null || (value = checksum.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        String string2 = sb.toString();
        if (string2.length() == 0) {
            return null;
        }
        String path = remoteURL.getPath();
        m.d(path, "remoteURL.path");
        return new File(getCacheDir(), string2 + '.' + q.k1('.', path, "")).toURI();
    }

    @Override
    public void saveData(InputStream inputStream, URI uri, Checksum checksum) throws IOException {
        m.e(inputStream, "inputStream");
        m.e(uri, "uri");
        File file = new File(uri);
        File tempFile = File.createTempFile("rc_download_", ETagPayloadStore.TEMP_SUFFIX, file.getParentFile());
        try {
            if (checksum != null) {
                m.d(tempFile, "tempFile");
                if (isFalse(streamToFileAndCompareChecksum(inputStream, tempFile, checksum))) {
                    tempFile.delete();
                    return;
                }
            } else {
                m.d(tempFile, "tempFile");
                streamToFile(inputStream, tempFile);
            }
            if (!tempFile.renameTo(file)) {
                k.O(tempFile, file);
            }
        } catch (Exception e6) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to copy temp file to final file: " + e6.getMessage());
            }
            file.delete();
        } finally {
            tempFile.delete();
        }
    }

    public DefaultFileCache(Context context, String str, int i3, AbstractC2541f abstractC2541f) {
        this(context, (i3 & 2) != 0 ? DEFAULT_SUBDIR : str);
    }
}
