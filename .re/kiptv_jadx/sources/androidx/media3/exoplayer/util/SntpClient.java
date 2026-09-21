package androidx.media3.exoplayer.util;

/* JADX INFO: loaded from: classes.dex */
public final class SntpClient {
    public static final java.lang.String DEFAULT_NTP_HOST = "time.android.com";
    public static final int DEFAULT_TIMEOUT_MS = 1000;
    private static final int MAX_RETRY_COUNT = 10;
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private static long elapsedRealtimeOffsetMs = 0;
    private static boolean isInitialized = false;
    private static long lastUpdateElapsedRealtime = -9223372036854775807L;
    private static long maxElapsedTimeUntilUpdateMs = -9223372036854775807L;
    private static java.lang.String ntpHost = "time.android.com";
    private static int timeoutMs = 1000;
    private static final java.lang.Object loaderLock = new java.lang.Object();
    private static final java.lang.Object valueLock = new java.lang.Object();

    public interface InitializationCallback {
        void onInitializationFailed(java.io.IOException iOException);

        void onInitialized();
    }

    public static final class NtpTimeCallback implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.Loader.Loadable> {
        private final androidx.media3.exoplayer.util.SntpClient.InitializationCallback callback;

        public NtpTimeCallback(androidx.media3.exoplayer.util.SntpClient.InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(androidx.media3.exoplayer.upstream.Loader.Loadable loadable, long j, long j9, boolean z6) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(androidx.media3.exoplayer.upstream.Loader.Loadable loadable, long j, long j9) {
            if (this.callback != null) {
                if (androidx.media3.exoplayer.util.SntpClient.isInitialized()) {
                    this.callback.onInitialized();
                } else {
                    this.callback.onInitializationFailed(new java.io.IOException(new java.util.ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.upstream.Loader.Loadable loadable, long j, long j9, java.io.IOException iOException, int i3) {
            androidx.media3.exoplayer.util.SntpClient.InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
        }
    }

    public static final class NtpTimeLoadable implements androidx.media3.exoplayer.upstream.Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() {
            synchronized (androidx.media3.exoplayer.util.SntpClient.loaderLock) {
                synchronized (androidx.media3.exoplayer.util.SntpClient.valueLock) {
                    if (androidx.media3.exoplayer.util.SntpClient.isInitialized) {
                        return;
                    }
                    long jLoadNtpTimeOffsetMs = androidx.media3.exoplayer.util.SntpClient.loadNtpTimeOffsetMs();
                    synchronized (androidx.media3.exoplayer.util.SntpClient.valueLock) {
                        long unused = androidx.media3.exoplayer.util.SntpClient.lastUpdateElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        long unused2 = androidx.media3.exoplayer.util.SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                        boolean unused3 = androidx.media3.exoplayer.util.SntpClient.isInitialized = true;
                    }
                }
            }
        }
    }

    private SntpClient() {
    }

    private static void checkValidServerReply(byte b9, byte b10, int i3, long j) throws java.io.IOException {
        if (b9 == 3) {
            throw new java.io.IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new java.io.IOException(com.google.android.gms.internal.play_billing.M0.l(b10, "SNTP: Untrusted mode: "));
        }
        if (i3 == 0 || i3 > 15) {
            throw new java.io.IOException(com.google.android.gms.internal.play_billing.M0.l(i3, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new java.io.IOException("SNTP: Zero transmitTime");
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j;
        synchronized (valueLock) {
            try {
                j = isInitialized ? elapsedRealtimeOffsetMs : androidx.media3.common.C.TIME_UNSET;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public static long getMaxElapsedTimeUntilUpdateMs() {
        long j;
        synchronized (valueLock) {
            j = maxElapsedTimeUntilUpdateMs;
        }
        return j;
    }

    public static java.lang.String getNtpHost() {
        java.lang.String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i3;
        synchronized (valueLock) {
            i3 = timeoutMs;
        }
        return i3;
    }

    public static void initialize(androidx.media3.exoplayer.upstream.Loader loader, androidx.media3.exoplayer.util.SntpClient.InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new androidx.media3.exoplayer.upstream.Loader("SntpClient");
            }
            loader.startLoading(new androidx.media3.exoplayer.util.SntpClient.NtpTimeLoadable(), new androidx.media3.exoplayer.util.SntpClient.NtpTimeCallback(initializationCallback), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z6;
        synchronized (valueLock) {
            try {
                if (lastUpdateElapsedRealtime != androidx.media3.common.C.TIME_UNSET && maxElapsedTimeUntilUpdateMs != androidx.media3.common.C.TIME_UNSET) {
                    isInitialized = isInitialized && android.os.SystemClock.elapsedRealtime() - lastUpdateElapsedRealtime < maxElapsedTimeUntilUpdateMs;
                }
                z6 = isInitialized;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() {
        java.net.DatagramSocket datagramSocket = new java.net.DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            java.net.SocketTimeoutException socketTimeoutException = null;
            int i3 = 0;
            int i9 = 0;
            while (i3 < length) {
                byte[] bArr = new byte[48];
                java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(bArr, 48, allByName[i3], NTP_PORT);
                bArr[0] = 27;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                writeTimestamp(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new java.net.DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    long j = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b9 = bArr[0];
                    int i10 = bArr[1] & 255;
                    long timestamp = readTimestamp(bArr, 24);
                    long timestamp2 = readTimestamp(bArr, 32);
                    long timestamp3 = readTimestamp(bArr, 40);
                    checkValidServerReply((byte) ((b9 >> 6) & 3), (byte) (b9 & 7), i10, timestamp3);
                    long j9 = (j + (((timestamp3 - j) + (timestamp2 - timestamp)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j9;
                } catch (java.net.SocketTimeoutException e6) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e6;
                    } else {
                        socketTimeoutException.addSuppressed(e6);
                    }
                    int i11 = i9 + 1;
                    if (i9 >= 10) {
                        socketTimeoutException.getClass();
                        throw socketTimeoutException;
                    }
                    i3++;
                    i9 = i11;
                }
            }
            socketTimeoutException.getClass();
            throw socketTimeoutException;
        } catch (java.lang.Throwable th) {
            try {
                datagramSocket.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long read32(byte[] bArr, int i3) {
        int i9 = bArr[i3];
        int i10 = bArr[i3 + 1];
        int i11 = bArr[i3 + 2];
        int i12 = bArr[i3 + 3];
        if ((i9 & 128) == 128) {
            i9 = (i9 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        return (((long) i9) << 24) + (((long) i10) << 16) + (((long) i11) << 8) + ((long) i12);
    }

    private static long readTimestamp(byte[] bArr, int i3) {
        long j = read32(bArr, i3);
        long j9 = read32(bArr, i3 + 4);
        if (j == 0 && j9 == 0) {
            return 0L;
        }
        return ((j9 * 1000) / 4294967296L) + ((j - OFFSET_1900_TO_1970) * 1000);
    }

    public static void setMaxElapsedTimeUntilUpdateMs(long j) {
        synchronized (valueLock) {
            maxElapsedTimeUntilUpdateMs = j;
        }
    }

    public static void setNtpHost(java.lang.String str) {
        synchronized (valueLock) {
            try {
                if (!ntpHost.equals(str)) {
                    ntpHost = str;
                    isInitialized = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void setTimeoutMs(int i3) {
        synchronized (valueLock) {
            try {
                if (timeoutMs != i3) {
                    timeoutMs = i3;
                    isInitialized = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static void writeTimestamp(byte[] bArr, int i3, long j) {
        if (j == 0) {
            java.util.Arrays.fill(bArr, i3, i3 + 8, (byte) 0);
            return;
        }
        long j9 = j / 1000;
        long j10 = j - (j9 * 1000);
        long j11 = j9 + OFFSET_1900_TO_1970;
        bArr[i3] = (byte) (j11 >> 24);
        bArr[i3 + 1] = (byte) (j11 >> 16);
        bArr[i3 + 2] = (byte) (j11 >> 8);
        bArr[i3 + 3] = (byte) j11;
        long j12 = (j10 * 4294967296L) / 1000;
        bArr[i3 + 4] = (byte) (j12 >> 24);
        bArr[i3 + 5] = (byte) (j12 >> 16);
        bArr[i3 + 6] = (byte) (j12 >> 8);
        bArr[i3 + 7] = (byte) (java.lang.Math.random() * 255.0d);
    }
}
