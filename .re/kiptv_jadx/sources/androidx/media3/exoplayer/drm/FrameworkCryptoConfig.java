package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkCryptoConfig implements androidx.media3.decoder.CryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;

    @java.lang.Deprecated
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final java.util.UUID uuid;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z6;
        if ("Amazon".equals(android.os.Build.MANUFACTURER)) {
            java.lang.String str = android.os.Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z6;
    }

    public FrameworkCryptoConfig(java.util.UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @java.lang.Deprecated
    public FrameworkCryptoConfig(java.util.UUID uuid, byte[] bArr, boolean z6) {
        this.uuid = uuid;
        this.sessionId = bArr;
        this.forceAllowInsecureDecoderComponents = z6;
    }
}
