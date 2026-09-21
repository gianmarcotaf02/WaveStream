package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface RendererCapabilities {
    public static final int ADAPTIVE_NOT_SEAMLESS = 8;
    public static final int ADAPTIVE_NOT_SUPPORTED = 0;
    public static final int ADAPTIVE_SEAMLESS = 16;
    public static final int ADAPTIVE_SUPPORT_MASK = 24;
    public static final int AUDIO_OFFLOAD_GAPLESS_SUPPORTED = 1024;
    public static final int AUDIO_OFFLOAD_NOT_SUPPORTED = 0;
    public static final int AUDIO_OFFLOAD_SPEED_CHANGE_SUPPORTED = 2048;
    public static final int AUDIO_OFFLOAD_SUPPORTED = 512;
    public static final int AUDIO_OFFLOAD_SUPPORT_MASK = 3584;
    public static final int DECODER_SUPPORT_FALLBACK = 0;
    public static final int DECODER_SUPPORT_FALLBACK_MIMETYPE = 256;
    public static final int DECODER_SUPPORT_MASK = 384;
    public static final int DECODER_SUPPORT_PRIMARY = 128;
    public static final int FORMAT_SUPPORT_MASK = 7;
    public static final int HARDWARE_ACCELERATION_NOT_SUPPORTED = 0;
    public static final int HARDWARE_ACCELERATION_SUPPORTED = 64;
    public static final int HARDWARE_ACCELERATION_SUPPORT_MASK = 64;
    public static final int TUNNELING_NOT_SUPPORTED = 0;
    public static final int TUNNELING_SUPPORTED = 32;
    public static final int TUNNELING_SUPPORT_MASK = 32;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdaptiveSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioOffloadSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Capabilities {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HardwareAccelerationSupport {
    }

    public interface Listener {
        void onRendererCapabilitiesChanged(Renderer renderer);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TunnelingSupport {
    }

    static int create(int i3, int i9, int i10, int i11, int i12, int i13) {
        return i3 | i9 | i10 | i11 | i12 | i13;
    }

    static int getAdaptiveSupport(int i3) {
        return i3 & 24;
    }

    static int getAudioOffloadSupport(int i3) {
        return i3 & AUDIO_OFFLOAD_SUPPORT_MASK;
    }

    static int getDecoderSupport(int i3) {
        return i3 & DECODER_SUPPORT_MASK;
    }

    static int getFormatSupport(int i3) {
        return i3 & 7;
    }

    static int getHardwareAccelerationSupport(int i3) {
        return i3 & 64;
    }

    static int getTunnelingSupport(int i3) {
        return i3 & 32;
    }

    static boolean isFormatSupported(int i3, boolean z6) {
        int formatSupport = getFormatSupport(i3);
        if (formatSupport != 4) {
            return z6 && formatSupport == 3;
        }
        return true;
    }

    default void clearListener() {
    }

    String getName();

    int getTrackType();

    default void setListener(Listener listener) {
    }

    int supportsFormat(Format format);

    int supportsMixedMimeTypeAdaptation();

    static int create(int i3) {
        return create(i3, 0, 0, 0);
    }

    static int create(int i3, int i9, int i10) {
        return create(i3, i9, i10, 0, 128, 0);
    }

    static int create(int i3, int i9, int i10, int i11) {
        return create(i3, i9, i10, 0, 128, i11);
    }

    static int create(int i3, int i9, int i10, int i11, int i12) {
        return create(i3, i9, i10, i11, i12, 0);
    }
}
