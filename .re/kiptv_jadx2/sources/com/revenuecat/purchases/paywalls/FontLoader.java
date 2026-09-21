package com.revenuecat.purchases.paywalls;

import I3.b;
import O7.q;
import O7.x;
import S7.A;
import S7.C;
import S7.M;
import S7.y0;
import Z7.d;
import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.Result;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import com.revenuecat.purchases.utils.UrlConnectionFactoryKt;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryStackFrame;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.o;
import p070h6.h;
import p070h6.n;
import p078i6.D;
import p078i6.u;
import p078i6.y;
import p100l6.c;
import p109m6.a;
import p117n6.e;
import p117n6.i;
import p160s6.k;
import p194x6.j;
import p194x6.m;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00104\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020&0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/paywalls/FontLoader;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "providedCacheDir", "LS7/A;", "ioScope", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "urlConnectionFactory", "<init>", "(Landroid/content/Context;Ljava/io/File;LS7/A;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "fontInfo", "Lh6/A;", "startFontDownload", "(Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;)V", "", "urlHash", "file", "addFileToCache", "(Ljava/lang/String;Ljava/io/File;)V", "cacheDir", "", "ensureFoldersExist", "(Ljava/io/File;)Z", Request.JsonKeys.URL, "expectedMd5", "extension", "Lh6/n;", "performDownloadAndCache-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/lang/Object;", "performDownloadAndCache", "", "bytes", "md5Hex", "([B)Ljava/lang/String;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "Landroid/content/Context;", "Ljava/io/File;", "LS7/A;", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCheckedFoldersExist", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cacheDirectory$delegate", "Lh6/h;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "Ljava/security/MessageDigest;", "md$delegate", "getMd", "()Ljava/security/MessageDigest;", "md", "", "", "fontInfosForHash", "Ljava/util/Map;", SentryStackFrame.JsonKeys.LOCK, "Ljava/lang/Object;", "cachedFontFamilyByFontInfo", "cachedFontFamilyByFamilyName", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontLoader {

    private final h cacheDirectory;
    private final Map<String, DownloadedFontFamily> cachedFontFamilyByFamilyName;
    private final Map<DownloadableFontInfo, String> cachedFontFamilyByFontInfo;
    private final Context context;
    private final Map<String, Set<DownloadableFontInfo>> fontInfosForHash;
    private AtomicBoolean hasCheckedFoldersExist;
    private final A ioScope;
    private final Object lock;

    private final h md;
    private final File providedCacheDir;
    private final UrlConnectionFactory urlConnectionFactory;

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1", f = "FontLoader.kt", l = {}, m = "invokeSuspend")
    public static final class C20961 extends i implements m {
        final String $expectedMd5;
        final DownloadableFontInfo $fontInfo;
        final String $url;
        int label;

        public C20961(String str, String str2, DownloadableFontInfo downloadableFontInfo, c cVar) {
            super(2, cVar);
            this.$url = str;
            this.$expectedMd5 = str2;
            this.$fontInfo = downloadableFontInfo;
        }

        @Override
        public final c create(Object obj, c cVar) {
            return FontLoader.this.new C20961(this.$url, this.$expectedMd5, this.$fontInfo, cVar);
        }

        @Override
        public final Object invoke(A a2, c cVar) {
            return ((C20961) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            a aVar = a.f25430h;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            File cacheDirectory = FontLoader.this.getCacheDirectory();
            if (cacheDirectory == null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot download font: cache directory is not available", null);
                return p070h6.A.f22523a;
            }
            if (!FontLoader.this.ensureFoldersExist(cacheDirectory)) {
                return p070h6.A.f22523a;
            }
            FontLoader fontLoader = FontLoader.this;
            byte[] bytes = this.$url.getBytes(O7.a.f8024b);
            kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
            String strMd5Hex = fontLoader.md5Hex(bytes);
            String strK1 = q.k1('.', this.$url, "");
            File file = new File(cacheDirectory, strMd5Hex + '.' + strK1);
            Object obj3 = FontLoader.this.lock;
            FontLoader fontLoader2 = FontLoader.this;
            DownloadableFontInfo downloadableFontInfo = this.$fontInfo;
            String str = this.$url;
            synchronized (obj3) {
                Set set = (Set) fontLoader2.fontInfosForHash.get(strMd5Hex);
                if (set != null) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font download already in progress for " + str);
                    }
                    set.add(downloadableFontInfo);
                    return p070h6.A.f22523a;
                }
                Map map = fontLoader2.fontInfosForHash;
                LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(1));
                p078i6.m.D0(new DownloadableFontInfo[]{downloadableFontInfo}, linkedHashSet);
                map.put(strMd5Hex, linkedHashSet);
                if (file.exists()) {
                    FontLoader.this.addFileToCache(strMd5Hex, file);
                    return p070h6.A.f22523a;
                }
                try {
                    Object objM182performDownloadAndCacheyxL6bBk = FontLoader.this.m182performDownloadAndCacheyxL6bBk(this.$url, this.$expectedMd5, strMd5Hex, strK1, cacheDirectory);
                    FontLoader fontLoader3 = FontLoader.this;
                    if (!(objM182performDownloadAndCacheyxL6bBk instanceof p070h6.m)) {
                        fontLoader3.addFileToCache(strMd5Hex, (File) objM182performDownloadAndCacheyxL6bBk);
                    }
                    DownloadableFontInfo downloadableFontInfo2 = this.$fontInfo;
                    if (n.a(objM182performDownloadAndCacheyxL6bBk) != null) {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to download font for " + downloadableFontInfo2.getFamily(), null);
                    }
                    obj2 = FontLoader.this.lock;
                    FontLoader fontLoader4 = FontLoader.this;
                    synchronized (obj2) {
                        return p070h6.A.f22523a;
                    }
                } catch (Throwable th) {
                    try {
                        String str2 = this.$url;
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading remote font from " + str2, th);
                        obj2 = FontLoader.this.lock;
                        FontLoader fontLoader5 = FontLoader.this;
                        synchronized (obj2) {
                        }
                    } catch (Throwable th2) {
                        Object obj4 = FontLoader.this.lock;
                        FontLoader fontLoader6 = FontLoader.this;
                        synchronized (obj4) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public FontLoader(Context context, File file, A ioScope, UrlConnectionFactory urlConnectionFactory) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(ioScope, "ioScope");
        kotlin.jvm.internal.m.e(urlConnectionFactory, "urlConnectionFactory");
        this.context = context;
        this.providedCacheDir = file;
        this.ioScope = ioScope;
        this.urlConnectionFactory = urlConnectionFactory;
        this.hasCheckedFoldersExist = new AtomicBoolean(false);
        this.cacheDirectory = com.google.common.util.concurrent.D.A(p070h6.i.f22536h, new FontLoader$cacheDirectory$2(this));
        this.md = com.google.common.util.concurrent.D.B(FontLoader$md$2.INSTANCE);
        this.fontInfosForHash = new LinkedHashMap();
        this.lock = new Object();
        this.cachedFontFamilyByFontInfo = new LinkedHashMap();
        this.cachedFontFamilyByFamilyName = new LinkedHashMap();
    }

    public final void addFileToCache(String urlHash, File file) {
        synchronized (this.lock) {
            try {
                Set<DownloadableFontInfo> set = this.fontInfosForHash.get(urlHash);
                if (set == null) {
                    set = y.f23207h;
                }
                for (DownloadableFontInfo downloadableFontInfo : set) {
                    String family = downloadableFontInfo.getFamily();
                    if (this.cachedFontFamilyByFontInfo.get(downloadableFontInfo) != null) {
                        LogLevel logLevel = LogLevel.VERBOSE;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font already cached for " + family + ". Skipping download.");
                        }
                    } else {
                        DownloadedFontFamily downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(family);
                        if (downloadedFontFamily != null) {
                            this.cachedFontFamilyByFamilyName.put(family, new DownloadedFontFamily(downloadedFontFamily.getFamily(), p078i6.o.z1(new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file), downloadedFontFamily.getFonts())));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                        } else {
                            DownloadedFontFamily downloadedFontFamily2 = new DownloadedFontFamily(family, P.i0(new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file)));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                            this.cachedFontFamilyByFamilyName.put(family, downloadedFontFamily2);
                        }
                    }
                }
                this.fontInfosForHash.remove(urlHash);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean ensureFoldersExist(File cacheDir) {
        boolean z6 = true;
        if (this.hasCheckedFoldersExist.get()) {
            return true;
        }
        if (cacheDir.exists() || cacheDir.mkdirs()) {
            if (!cacheDir.isDirectory()) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Remote fonts cache path exists but is not a directory: " + cacheDir.getAbsolutePath(), null);
            }
            this.hasCheckedFoldersExist.set(z6);
            return z6;
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unable to create cache directory for remote fonts: " + cacheDir.getAbsolutePath(), null);
        z6 = false;
        this.hasCheckedFoldersExist.set(z6);
        return z6;
    }

    public final File getCacheDirectory() {
        return (File) this.cacheDirectory.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md.getValue();
        kotlin.jvm.internal.m.d(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    public final String md5Hex(byte[] bytes) {
        byte[] digest = getMd().digest(bytes);
        kotlin.jvm.internal.m.d(digest, "digest");
        return p078i6.m.u0(digest, "", AnonymousClass1.INSTANCE, 30);
    }

    public final Object m182performDownloadAndCacheyxL6bBk(String url, String expectedMd5, String urlHash, String extension, File cacheDir) throws IOException {
        File file = new File(cacheDir, urlHash + '.' + extension);
        StringBuilder sb = new StringBuilder(".");
        sb.append(extension);
        File tempFile = File.createTempFile("rc_paywall_font_download_", sb.toString(), cacheDir);
        try {
            UrlConnectionFactory urlConnectionFactory = this.urlConnectionFactory;
            kotlin.jvm.internal.m.d(tempFile, "tempFile");
            UrlConnectionFactoryKt.downloadToFile(urlConnectionFactory, url, tempFile, "paywall font");
            String strMd5Hex = md5Hex(k.Q(tempFile));
            if (!x.r0(strMd5Hex, expectedMd5, true)) {
                tempFile.delete();
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Downloaded font file is corrupt for " + url + ". expected=" + expectedMd5 + ", actual=" + strMd5Hex, null);
                return P.T(new IOException("Downloaded font file is corrupt for " + url));
            }
            if (!tempFile.renameTo(file)) {
                k.O(tempFile, file);
                tempFile.delete();
            }
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Font downloaded successfully from " + url);
            }
            return file;
        } catch (IOException e6) {
            if (tempFile.exists()) {
                tempFile.delete();
            }
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            StringBuilder sbQ = M0.q("Error downloading font from ", url, ": ");
            sbQ.append(e6.getMessage());
            currentLogHandler2.e("[Purchases] - ERROR", sbQ.toString(), null);
            return P.T(e6);
        }
    }

    private final void startFontDownload(DownloadableFontInfo fontInfo) {
        C.A(this.ioScope, null, new C20961(fontInfo.getUrl(), fontInfo.getExpectedMd5(), fontInfo, null), 3);
    }

    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        DownloadedFontFamily downloadedFontFamily;
        kotlin.jvm.internal.m.e(fontInfo, "fontInfo");
        Result downloadableFontInfo = DownloadableFontInfoKt.toDownloadableFontInfo(fontInfo);
        if (!(downloadableFontInfo instanceof Result.Success)) {
            if (!(downloadableFontInfo instanceof Result.Error)) {
                throw new b();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) ((Result.Error) downloadableFontInfo).getValue(), null);
            return null;
        }
        DownloadableFontInfo downloadableFontInfo2 = (DownloadableFontInfo) ((Result.Success) downloadableFontInfo).getValue();
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        synchronized (this.lock) {
            downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(this.cachedFontFamilyByFontInfo.get(downloadableFontInfo2));
            a2.f24539h = downloadedFontFamily;
        }
        if (downloadedFontFamily != null) {
            List fonts = downloadedFontFamily.getFonts();
            if (fonts == null || !fonts.isEmpty()) {
                Iterator it = fonts.iterator();
                while (it.hasNext()) {
                    if (!((DownloadedFont) it.next()).getFile().exists()) {
                        LogLevel logLevel = LogLevel.WARN;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.w(M0.m(logLevel, new StringBuilder("[Purchases] - ")), "Cached font files missing for " + ((DownloadedFontFamily) a2.f24539h).getFamily() + ", re-downloading");
                        }
                        synchronized (this.lock) {
                            DownloadedFontFamily downloadedFontFamily2 = this.cachedFontFamilyByFamilyName.get(((DownloadedFontFamily) a2.f24539h).getFamily());
                            Object obj = a2.f24539h;
                            if (downloadedFontFamily2 == obj) {
                                this.cachedFontFamilyByFamilyName.remove(((DownloadedFontFamily) obj).getFamily());
                                Set<Map.Entry<DownloadableFontInfo, String>> setEntrySet = this.cachedFontFamilyByFontInfo.entrySet();
                                FontLoader$getCachedFontFamilyOrStartDownload$4$1 fontLoader$getCachedFontFamilyOrStartDownload$4$1 = new FontLoader$getCachedFontFamilyOrStartDownload$4$1(a2);
                                kotlin.jvm.internal.m.e(setEntrySet, "<this>");
                                u.P0(setEntrySet, fontLoader$getCachedFontFamilyOrStartDownload$4$1);
                            }
                        }
                    }
                }
            }
            return (DownloadedFontFamily) a2.f24539h;
        }
        startFontDownload(downloadableFontInfo2);
        return null;
    }

    public FontLoader(Context context, File file, A a2, UrlConnectionFactory urlConnectionFactory, int i3, AbstractC2541f abstractC2541f) {
        file = (i3 & 2) != 0 ? null : file;
        if ((i3 & 4) != 0) {
            y0 y0VarE = C.e();
            Z7.e eVar = M.f9549a;
            a2 = C.c(AbstractC1833d1.H(y0VarE, d.f13044i));
        }
        this(context, file, a2, (i3 & 8) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory);
    }
}
