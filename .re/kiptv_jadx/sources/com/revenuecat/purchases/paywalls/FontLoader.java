package com.revenuecat.purchases.paywalls;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00104\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020&0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/paywalls/FontLoader;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "providedCacheDir", "LS7/A;", "ioScope", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "urlConnectionFactory", "<init>", "(Landroid/content/Context;Ljava/io/File;LS7/A;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "fontInfo", "Lh6/A;", "startFontDownload", "(Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;)V", "", "urlHash", "file", "addFileToCache", "(Ljava/lang/String;Ljava/io/File;)V", "cacheDir", "", "ensureFoldersExist", "(Ljava/io/File;)Z", io.sentry.protocol.Request.JsonKeys.URL, "expectedMd5", "extension", "Lh6/n;", "performDownloadAndCache-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/lang/Object;", "performDownloadAndCache", "", "bytes", "md5Hex", "([B)Ljava/lang/String;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "Landroid/content/Context;", "Ljava/io/File;", "LS7/A;", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCheckedFoldersExist", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cacheDirectory$delegate", "Lh6/h;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "Ljava/security/MessageDigest;", "md$delegate", "getMd", "()Ljava/security/MessageDigest;", "md", "", "", "fontInfosForHash", "Ljava/util/Map;", io.sentry.protocol.SentryStackFrame.JsonKeys.LOCK, "Ljava/lang/Object;", "cachedFontFamilyByFontInfo", "cachedFontFamilyByFamilyName", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontLoader {

    /* JADX INFO: renamed from: cacheDirectory$delegate, reason: from kotlin metadata */
    private final p070h6.h cacheDirectory;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.DownloadedFontFamily> cachedFontFamilyByFamilyName;
    private final java.util.Map<com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo, java.lang.String> cachedFontFamilyByFontInfo;
    private final android.content.Context context;
    private final java.util.Map<java.lang.String, java.util.Set<com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo>> fontInfosForHash;
    private java.util.concurrent.atomic.AtomicBoolean hasCheckedFoldersExist;
    private final S7.A ioScope;
    private final java.lang.Object lock;

    /* JADX INFO: renamed from: md$delegate, reason: from kotlin metadata */
    private final p070h6.h md;
    private final java.io.File providedCacheDir;
    private final com.revenuecat.purchases.utils.UrlConnectionFactory urlConnectionFactory;

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.FontLoader$md5Hex$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.FontLoader.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.FontLoader.AnonymousClass1();

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

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1", f = "FontLoader.kt", l = {}, m = "invokeSuspend")
    public static final class C20961 extends p117n6.i implements p194x6.m {
        final /* synthetic */ java.lang.String $expectedMd5;
        final /* synthetic */ com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo $fontInfo;
        final /* synthetic */ java.lang.String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20961(java.lang.String str, java.lang.String str2, com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo downloadableFontInfo, p100l6.c cVar) {
            super(2, cVar);
            this.$url = str;
            this.$expectedMd5 = str2;
            this.$fontInfo = downloadableFontInfo;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.paywalls.FontLoader.this.new C20961(this.$url, this.$expectedMd5, this.$fontInfo, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.paywalls.FontLoader.C20961) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object obj2;
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            java.io.File cacheDirectory = com.revenuecat.purchases.paywalls.FontLoader.this.getCacheDirectory();
            if (cacheDirectory == null) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot download font: cache directory is not available", null);
                return p070h6.A.f22523a;
            }
            if (!com.revenuecat.purchases.paywalls.FontLoader.this.ensureFoldersExist(cacheDirectory)) {
                return p070h6.A.f22523a;
            }
            com.revenuecat.purchases.paywalls.FontLoader fontLoader = com.revenuecat.purchases.paywalls.FontLoader.this;
            byte[] bytes = this.$url.getBytes(O7.a.f8024b);
            kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
            java.lang.String strMd5Hex = fontLoader.md5Hex(bytes);
            java.lang.String strK1 = O7.q.k1('.', this.$url, "");
            java.io.File file = new java.io.File(cacheDirectory, strMd5Hex + '.' + strK1);
            java.lang.Object obj3 = com.revenuecat.purchases.paywalls.FontLoader.this.lock;
            com.revenuecat.purchases.paywalls.FontLoader fontLoader2 = com.revenuecat.purchases.paywalls.FontLoader.this;
            com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo downloadableFontInfo = this.$fontInfo;
            java.lang.String str = this.$url;
            synchronized (obj3) {
                java.util.Set set = (java.util.Set) fontLoader2.fontInfosForHash.get(strMd5Hex);
                if (set != null) {
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                    com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font download already in progress for " + str);
                    }
                    set.add(downloadableFontInfo);
                    return p070h6.A.f22523a;
                }
                java.util.Map map = fontLoader2.fontInfosForHash;
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(1));
                p078i6.m.D0(new com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo[]{downloadableFontInfo}, linkedHashSet);
                map.put(strMd5Hex, linkedHashSet);
                if (file.exists()) {
                    com.revenuecat.purchases.paywalls.FontLoader.this.addFileToCache(strMd5Hex, file);
                    return p070h6.A.f22523a;
                }
                try {
                    java.lang.Object objM182performDownloadAndCacheyxL6bBk = com.revenuecat.purchases.paywalls.FontLoader.this.m182performDownloadAndCacheyxL6bBk(this.$url, this.$expectedMd5, strMd5Hex, strK1, cacheDirectory);
                    com.revenuecat.purchases.paywalls.FontLoader fontLoader3 = com.revenuecat.purchases.paywalls.FontLoader.this;
                    if (!(objM182performDownloadAndCacheyxL6bBk instanceof p070h6.m)) {
                        fontLoader3.addFileToCache(strMd5Hex, (java.io.File) objM182performDownloadAndCacheyxL6bBk);
                    }
                    com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo downloadableFontInfo2 = this.$fontInfo;
                    if (p070h6.n.a(objM182performDownloadAndCacheyxL6bBk) != null) {
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to download font for " + downloadableFontInfo2.getFamily(), null);
                    }
                    obj2 = com.revenuecat.purchases.paywalls.FontLoader.this.lock;
                    com.revenuecat.purchases.paywalls.FontLoader fontLoader4 = com.revenuecat.purchases.paywalls.FontLoader.this;
                    synchronized (obj2) {
                        return p070h6.A.f22523a;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        java.lang.String str2 = this.$url;
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading remote font from " + str2, th);
                        obj2 = com.revenuecat.purchases.paywalls.FontLoader.this.lock;
                        com.revenuecat.purchases.paywalls.FontLoader fontLoader5 = com.revenuecat.purchases.paywalls.FontLoader.this;
                        synchronized (obj2) {
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Object obj4 = com.revenuecat.purchases.paywalls.FontLoader.this.lock;
                        com.revenuecat.purchases.paywalls.FontLoader fontLoader6 = com.revenuecat.purchases.paywalls.FontLoader.this;
                        synchronized (obj4) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public FontLoader(android.content.Context context, java.io.File file, S7.A ioScope, com.revenuecat.purchases.utils.UrlConnectionFactory urlConnectionFactory) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(ioScope, "ioScope");
        kotlin.jvm.internal.m.e(urlConnectionFactory, "urlConnectionFactory");
        this.context = context;
        this.providedCacheDir = file;
        this.ioScope = ioScope;
        this.urlConnectionFactory = urlConnectionFactory;
        this.hasCheckedFoldersExist = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.cacheDirectory = com.google.common.util.concurrent.D.A(p070h6.i.f22536h, new com.revenuecat.purchases.paywalls.FontLoader$cacheDirectory$2(this));
        this.md = com.google.common.util.concurrent.D.B(com.revenuecat.purchases.paywalls.FontLoader$md$2.INSTANCE);
        this.fontInfosForHash = new java.util.LinkedHashMap();
        this.lock = new java.lang.Object();
        this.cachedFontFamilyByFontInfo = new java.util.LinkedHashMap();
        this.cachedFontFamilyByFamilyName = new java.util.LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFileToCache(java.lang.String urlHash, java.io.File file) {
        synchronized (this.lock) {
            try {
                java.util.Set<com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo> set = this.fontInfosForHash.get(urlHash);
                if (set == null) {
                    set = p078i6.y.f23207h;
                }
                for (com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo downloadableFontInfo : set) {
                    java.lang.String family = downloadableFontInfo.getFamily();
                    if (this.cachedFontFamilyByFontInfo.get(downloadableFontInfo) != null) {
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font already cached for " + family + ". Skipping download.");
                        }
                    } else {
                        com.revenuecat.purchases.paywalls.DownloadedFontFamily downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(family);
                        if (downloadedFontFamily != null) {
                            this.cachedFontFamilyByFamilyName.put(family, new com.revenuecat.purchases.paywalls.DownloadedFontFamily(downloadedFontFamily.getFamily(), p078i6.o.z1(new com.revenuecat.purchases.paywalls.DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file), downloadedFontFamily.getFonts())));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                        } else {
                            com.revenuecat.purchases.paywalls.DownloadedFontFamily downloadedFontFamily2 = new com.revenuecat.purchases.paywalls.DownloadedFontFamily(family, com.google.common.util.concurrent.P.i0(new com.revenuecat.purchases.paywalls.DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file)));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                            this.cachedFontFamilyByFamilyName.put(family, downloadedFontFamily2);
                        }
                    }
                }
                this.fontInfosForHash.remove(urlHash);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ensureFoldersExist(java.io.File cacheDir) {
        boolean z6 = true;
        if (this.hasCheckedFoldersExist.get()) {
            return true;
        }
        if (cacheDir.exists() || cacheDir.mkdirs()) {
            if (!cacheDir.isDirectory()) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Remote fonts cache path exists but is not a directory: " + cacheDir.getAbsolutePath(), null);
            }
            this.hasCheckedFoldersExist.set(z6);
            return z6;
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unable to create cache directory for remote fonts: " + cacheDir.getAbsolutePath(), null);
        z6 = false;
        this.hasCheckedFoldersExist.set(z6);
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.io.File getCacheDirectory() {
        return (java.io.File) this.cacheDirectory.getValue();
    }

    private final java.security.MessageDigest getMd() {
        java.lang.Object value = this.md.getValue();
        kotlin.jvm.internal.m.d(value, "<get-md>(...)");
        return (java.security.MessageDigest) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String md5Hex(byte[] bytes) {
        byte[] digest = getMd().digest(bytes);
        kotlin.jvm.internal.m.d(digest, "digest");
        return p078i6.m.u0(digest, "", com.revenuecat.purchases.paywalls.FontLoader.AnonymousClass1.INSTANCE, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performDownloadAndCache-yxL6bBk, reason: not valid java name */
    public final java.lang.Object m182performDownloadAndCacheyxL6bBk(java.lang.String url, java.lang.String expectedMd5, java.lang.String urlHash, java.lang.String extension, java.io.File cacheDir) throws java.io.IOException {
        java.io.File file = new java.io.File(cacheDir, urlHash + '.' + extension);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".");
        sb.append(extension);
        java.io.File tempFile = java.io.File.createTempFile("rc_paywall_font_download_", sb.toString(), cacheDir);
        try {
            com.revenuecat.purchases.utils.UrlConnectionFactory urlConnectionFactory = this.urlConnectionFactory;
            kotlin.jvm.internal.m.d(tempFile, "tempFile");
            com.revenuecat.purchases.utils.UrlConnectionFactoryKt.downloadToFile(urlConnectionFactory, url, tempFile, "paywall font");
            java.lang.String strMd5Hex = md5Hex(p160s6.k.Q(tempFile));
            if (!O7.x.r0(strMd5Hex, expectedMd5, true)) {
                tempFile.delete();
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Downloaded font file is corrupt for " + url + ". expected=" + expectedMd5 + ", actual=" + strMd5Hex, null);
                return com.google.common.util.concurrent.P.T(new java.io.IOException("Downloaded font file is corrupt for " + url));
            }
            if (!tempFile.renameTo(file)) {
                p160s6.k.O(tempFile, file);
                tempFile.delete();
            }
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Font downloaded successfully from " + url);
            }
            return file;
        } catch (java.io.IOException e6) {
            if (tempFile.exists()) {
                tempFile.delete();
            }
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Error downloading font from ", url, ": ");
            sbQ.append(e6.getMessage());
            currentLogHandler2.e("[Purchases] - ERROR", sbQ.toString(), null);
            return com.google.common.util.concurrent.P.T(e6);
        }
    }

    private final void startFontDownload(com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo fontInfo) {
        S7.C.A(this.ioScope, null, new com.revenuecat.purchases.paywalls.FontLoader.C20961(fontInfo.getUrl(), fontInfo.getExpectedMd5(), fontInfo, null), 3);
    }

    public final com.revenuecat.purchases.paywalls.DownloadedFontFamily getCachedFontFamilyOrStartDownload(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        com.revenuecat.purchases.paywalls.DownloadedFontFamily downloadedFontFamily;
        kotlin.jvm.internal.m.e(fontInfo, "fontInfo");
        com.revenuecat.purchases.utils.Result downloadableFontInfo = com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt.toDownloadableFontInfo(fontInfo);
        if (!(downloadableFontInfo instanceof com.revenuecat.purchases.utils.Result.Success)) {
            if (!(downloadableFontInfo instanceof com.revenuecat.purchases.utils.Result.Error)) {
                throw new I3.b();
            }
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) ((com.revenuecat.purchases.utils.Result.Error) downloadableFontInfo).getValue(), null);
            return null;
        }
        com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo downloadableFontInfo2 = (com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo) ((com.revenuecat.purchases.utils.Result.Success) downloadableFontInfo).getValue();
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        synchronized (this.lock) {
            downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(this.cachedFontFamilyByFontInfo.get(downloadableFontInfo2));
            a2.f24539h = downloadedFontFamily;
        }
        if (downloadedFontFamily != null) {
            java.util.List fonts = downloadedFontFamily.getFonts();
            if (fonts == null || !fonts.isEmpty()) {
                java.util.Iterator it = fonts.iterator();
                while (it.hasNext()) {
                    if (!((com.revenuecat.purchases.paywalls.DownloadedFont) it.next()).getFile().exists()) {
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Cached font files missing for " + ((com.revenuecat.purchases.paywalls.DownloadedFontFamily) a2.f24539h).getFamily() + ", re-downloading");
                        }
                        synchronized (this.lock) {
                            com.revenuecat.purchases.paywalls.DownloadedFontFamily downloadedFontFamily2 = this.cachedFontFamilyByFamilyName.get(((com.revenuecat.purchases.paywalls.DownloadedFontFamily) a2.f24539h).getFamily());
                            java.lang.Object obj = a2.f24539h;
                            if (downloadedFontFamily2 == obj) {
                                this.cachedFontFamilyByFamilyName.remove(((com.revenuecat.purchases.paywalls.DownloadedFontFamily) obj).getFamily());
                                java.util.Set<java.util.Map.Entry<com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo, java.lang.String>> setEntrySet = this.cachedFontFamilyByFontInfo.entrySet();
                                com.revenuecat.purchases.paywalls.FontLoader$getCachedFontFamilyOrStartDownload$4$1 fontLoader$getCachedFontFamilyOrStartDownload$4$1 = new com.revenuecat.purchases.paywalls.FontLoader$getCachedFontFamilyOrStartDownload$4$1(a2);
                                kotlin.jvm.internal.m.e(setEntrySet, "<this>");
                                p078i6.u.P0(setEntrySet, fontLoader$getCachedFontFamilyOrStartDownload$4$1);
                            }
                        }
                    }
                }
            }
            return (com.revenuecat.purchases.paywalls.DownloadedFontFamily) a2.f24539h;
        }
        startFontDownload(downloadableFontInfo2);
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FontLoader(android.content.Context context, java.io.File file, S7.A a2, com.revenuecat.purchases.utils.UrlConnectionFactory urlConnectionFactory, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        file = (i3 & 2) != 0 ? null : file;
        if ((i3 & 4) != 0) {
            S7.y0 y0VarE = S7.C.e();
            Z7.e eVar = S7.M.f9549a;
            a2 = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        }
        this(context, file, a2, (i3 & 8) != 0 ? new com.revenuecat.purchases.utils.DefaultUrlConnectionFactory() : urlConnectionFactory);
    }
}
