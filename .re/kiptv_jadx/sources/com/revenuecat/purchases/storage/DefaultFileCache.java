package com.revenuecat.purchases.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010,R\u0018\u0010.\u001a\u00020\u0015*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileCache;", "Lcom/revenuecat/purchases/storage/LocalFileCache;", "Landroid/content/Context;", "context", "", "subDir", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "bytes", "md5Hex", "([B)Ljava/lang/String;", "Ljava/io/InputStream;", "inputStream", "Ljava/io/File;", "file", "Lh6/A;", "streamToFile", "(Ljava/io/InputStream;Ljava/io/File;)V", "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "", "streamToFileAndCompareChecksum", "(Ljava/io/InputStream;Ljava/io/File;Lcom/revenuecat/purchases/models/Checksum;)Z", "Ljava/net/URL;", "remoteURL", "Ljava/net/URI;", "generateLocalFilesystemURI", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;", "uri", "cachedContentExists", "(Ljava/net/URI;)Z", "saveData", "(Ljava/io/InputStream;Ljava/net/URI;Lcom/revenuecat/purchases/models/Checksum;)V", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/security/MessageDigest;", "md$delegate", "Lh6/h;", "getMd", "()Ljava/security/MessageDigest;", "md", "cacheDir$delegate", "getCacheDir", "()Ljava/io/File;", "cacheDir", "isFalse", "(Z)Z", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultFileCache implements com.revenuecat.purchases.storage.LocalFileCache {
    private static final int BUFFER_SIZE = 262144;
    public static final java.lang.String DEFAULT_SUBDIR = "rc_files";

    /* JADX INFO: renamed from: cacheDir$delegate, reason: from kotlin metadata */
    private final p070h6.h cacheDir;
    private final android.content.Context context;

    /* JADX INFO: renamed from: md$delegate, reason: from kotlin metadata */
    private final p070h6.h md;
    private final java.lang.String subDir;

    /* JADX INFO: renamed from: com.revenuecat.purchases.storage.DefaultFileCache$md5Hex$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.storage.DefaultFileCache.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.storage.DefaultFileCache.AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final java.lang.CharSequence invoke(byte b9) {
            return java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b9)}, 1));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Number) obj).byteValue());
        }
    }

    public DefaultFileCache(android.content.Context context, java.lang.String subDir) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(subDir, "subDir");
        this.context = context;
        this.subDir = subDir;
        this.md = com.google.common.util.concurrent.D.B(com.revenuecat.purchases.storage.DefaultFileCache$md$2.INSTANCE);
        this.cacheDir = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.storage.DefaultFileCache$cacheDir$2(this));
    }

    private final java.io.File getCacheDir() {
        return (java.io.File) this.cacheDir.getValue();
    }

    private final java.security.MessageDigest getMd() {
        java.lang.Object value = this.md.getValue();
        kotlin.jvm.internal.m.d(value, "<get-md>(...)");
        return (java.security.MessageDigest) value;
    }

    private final boolean isFalse(boolean z6) {
        return !z6;
    }

    private final java.lang.String md5Hex(byte[] bytes) {
        byte[] bArrDigest = getMd().digest(bytes);
        kotlin.jvm.internal.m.d(bArrDigest, "md.digest(bytes)");
        return p078i6.m.u0(bArrDigest, "", com.revenuecat.purchases.storage.DefaultFileCache.AnonymousClass1.INSTANCE, 30);
    }

    private final void streamToFile(java.io.InputStream inputStream, java.io.File file) throws java.io.IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            com.google.android.gms.internal.play_billing.V0.p(inputStream, fileOutputStream, 262144);
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

    private final boolean streamToFileAndCompareChecksum(java.io.InputStream inputStream, java.io.File file, com.revenuecat.purchases.models.Checksum checksum) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(checksum.getAlgorithm().getAlgorithmName());
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            byte[] bArr = new byte[262144];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    byte[] hash = messageDigest.digest();
                    com.revenuecat.purchases.models.Checksum.Algorithm algorithm = checksum.getAlgorithm();
                    kotlin.jvm.internal.m.d(hash, "hash");
                    return checksum.equals(new com.revenuecat.purchases.models.Checksum(algorithm, com.revenuecat.purchases.models.ChecksumKt.toHexString(hash)));
                }
                messageDigest.update(bArr, 0, i3);
                fileOutputStream.write(bArr, 0, i3);
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public boolean cachedContentExists(java.net.URI uri) {
        kotlin.jvm.internal.m.e(uri, "uri");
        return new java.io.File(uri).exists();
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public java.net.URI generateLocalFilesystemURI(java.net.URL remoteURL, com.revenuecat.purchases.models.Checksum checksum) {
        java.lang.String value;
        kotlin.jvm.internal.m.e(remoteURL, "remoteURL");
        java.lang.String string = remoteURL.toString();
        kotlin.jvm.internal.m.d(string, "remoteURL.toString()");
        byte[] bytes = string.getBytes(O7.a.f8024b);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        java.lang.String strMd5Hex = md5Hex(bytes);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(new java.io.File(strMd5Hex).getName());
        if (checksum == null || (value = checksum.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        java.lang.String string2 = sb.toString();
        if (string2.length() == 0) {
            return null;
        }
        java.lang.String path = remoteURL.getPath();
        kotlin.jvm.internal.m.d(path, "remoteURL.path");
        return new java.io.File(getCacheDir(), string2 + '.' + O7.q.k1('.', path, "")).toURI();
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public void saveData(java.io.InputStream inputStream, java.net.URI uri, com.revenuecat.purchases.models.Checksum checksum) throws java.io.IOException {
        kotlin.jvm.internal.m.e(inputStream, "inputStream");
        kotlin.jvm.internal.m.e(uri, "uri");
        java.io.File file = new java.io.File(uri);
        java.io.File tempFile = java.io.File.createTempFile("rc_download_", com.revenuecat.purchases.common.networking.ETagPayloadStore.TEMP_SUFFIX, file.getParentFile());
        try {
            if (checksum != null) {
                kotlin.jvm.internal.m.d(tempFile, "tempFile");
                if (isFalse(streamToFileAndCompareChecksum(inputStream, tempFile, checksum))) {
                    tempFile.delete();
                    return;
                }
            } else {
                kotlin.jvm.internal.m.d(tempFile, "tempFile");
                streamToFile(inputStream, tempFile);
            }
            if (!tempFile.renameTo(file)) {
                p160s6.k.O(tempFile, file);
            }
        } catch (java.lang.Exception e6) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to copy temp file to final file: " + e6.getMessage());
            }
            file.delete();
        } finally {
            tempFile.delete();
        }
    }

    public /* synthetic */ DefaultFileCache(android.content.Context context, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(context, (i3 & 2) != 0 ? DEFAULT_SUBDIR : str);
    }
}
