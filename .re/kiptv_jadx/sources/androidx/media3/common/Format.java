package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class Format {
    public static final int CUE_REPLACEMENT_BEHAVIOR_MERGE = 1;
    public static final int CUE_REPLACEMENT_BEHAVIOR_REPLACE = 2;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int auxiliaryTrackType;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final java.lang.String codecs;
    public final androidx.media3.common.ColorInfo colorInfo;
    public final java.lang.String containerMimeType;
    public final int cryptoType;
    public final int cueReplacementBehavior;
    public final java.lang.Object customData;
    public final int decodedHeight;
    public final int decodedWidth;
    public final androidx.media3.common.DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    public final boolean hasPrerollSamples;
    private int hashCode;
    public final int height;
    public final java.lang.String id;
    public final java.util.List<byte[]> initializationData;
    public final java.lang.String label;
    public final java.util.List<androidx.media3.common.Label> labels;
    public final java.lang.String language;
    public final int maxInputSize;
    public final int maxNumReorderSamples;
    public final int maxSubLayers;
    public final androidx.media3.common.Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final java.lang.String primaryTrackGroupId;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final java.lang.String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int tileCountHorizontal;
    public final int tileCountVertical;
    public final int width;
    private static final androidx.media3.common.Format DEFAULT = new androidx.media3.common.Format.Builder().build();
    private static final java.lang.String FIELD_ID = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_LABEL = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_LANGUAGE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_SELECTION_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_AVERAGE_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_PEAK_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_CODECS = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String UNUSED_FIELD_METADATA = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String FIELD_CONTAINER_MIME_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String FIELD_SAMPLE_MIME_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(10);
    private static final java.lang.String FIELD_MAX_INPUT_SIZE = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String FIELD_INITIALIZATION_DATA = androidx.media3.common.util.Util.intToStringMaxRadix(12);
    private static final java.lang.String FIELD_DRM_INIT_DATA = androidx.media3.common.util.Util.intToStringMaxRadix(13);
    private static final java.lang.String FIELD_SUBSAMPLE_OFFSET_US = androidx.media3.common.util.Util.intToStringMaxRadix(14);
    private static final java.lang.String FIELD_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(15);
    private static final java.lang.String FIELD_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(16);
    private static final java.lang.String FIELD_FRAME_RATE = androidx.media3.common.util.Util.intToStringMaxRadix(17);
    private static final java.lang.String FIELD_ROTATION_DEGREES = androidx.media3.common.util.Util.intToStringMaxRadix(18);
    private static final java.lang.String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = androidx.media3.common.util.Util.intToStringMaxRadix(19);
    private static final java.lang.String FIELD_PROJECTION_DATA = androidx.media3.common.util.Util.intToStringMaxRadix(20);
    private static final java.lang.String FIELD_STEREO_MODE = androidx.media3.common.util.Util.intToStringMaxRadix(21);
    private static final java.lang.String FIELD_COLOR_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(22);
    private static final java.lang.String FIELD_CHANNEL_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(23);
    private static final java.lang.String FIELD_SAMPLE_RATE = androidx.media3.common.util.Util.intToStringMaxRadix(24);
    private static final java.lang.String FIELD_PCM_ENCODING = androidx.media3.common.util.Util.intToStringMaxRadix(25);
    private static final java.lang.String FIELD_ENCODER_DELAY = androidx.media3.common.util.Util.intToStringMaxRadix(26);
    private static final java.lang.String FIELD_ENCODER_PADDING = androidx.media3.common.util.Util.intToStringMaxRadix(27);
    private static final java.lang.String FIELD_ACCESSIBILITY_CHANNEL = androidx.media3.common.util.Util.intToStringMaxRadix(28);
    private static final java.lang.String FIELD_CRYPTO_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(29);
    private static final java.lang.String FIELD_TILE_COUNT_HORIZONTAL = androidx.media3.common.util.Util.intToStringMaxRadix(30);
    private static final java.lang.String FIELD_TILE_COUNT_VERTICAL = androidx.media3.common.util.Util.intToStringMaxRadix(31);
    private static final java.lang.String FIELD_LABELS = androidx.media3.common.util.Util.intToStringMaxRadix(32);
    private static final java.lang.String FIELD_AUXILIARY_TRACK_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(33);
    private static final java.lang.String FIELD_MAX_SUB_LAYERS = androidx.media3.common.util.Util.intToStringMaxRadix(34);
    private static final java.lang.String FIELD_DECODED_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(35);
    private static final java.lang.String FIELD_DECODED_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(36);
    private static final java.lang.String FIELD_PRIMARY_TRACK_GROUP_ID = androidx.media3.common.util.Util.intToStringMaxRadix(37);

    public static final class Builder {
        private int accessibilityChannel;
        private int auxiliaryTrackType;
        private int averageBitrate;
        private int channelCount;
        private java.lang.String codecs;
        private androidx.media3.common.ColorInfo colorInfo;
        private java.lang.String containerMimeType;
        private int cryptoType;
        private int cueReplacementBehavior;
        private java.lang.Object customData;
        private int decodedHeight;
        private int decodedWidth;
        private androidx.media3.common.DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private float frameRate;
        private boolean hasPrerollSamples;
        private int height;
        private java.lang.String id;
        private java.util.List<byte[]> initializationData;
        private java.lang.String label;
        private java.util.List<androidx.media3.common.Label> labels;
        private java.lang.String language;
        private int maxInputSize;
        private int maxNumReorderSamples;
        private int maxSubLayers;
        private androidx.media3.common.Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;
        private java.lang.String primaryTrackGroupId;
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;
        private java.lang.String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int tileCountHorizontal;
        private int tileCountVertical;
        private int width;

        public androidx.media3.common.Format build() {
            return new androidx.media3.common.Format(this);
        }

        public androidx.media3.common.Format.Builder setAccessibilityChannel(int i3) {
            this.accessibilityChannel = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setAuxiliaryTrackType(int i3) {
            this.auxiliaryTrackType = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setAverageBitrate(int i3) {
            this.averageBitrate = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setChannelCount(int i3) {
            this.channelCount = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setCodecs(java.lang.String str) {
            this.codecs = str;
            return this;
        }

        public androidx.media3.common.Format.Builder setColorInfo(androidx.media3.common.ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public androidx.media3.common.Format.Builder setContainerMimeType(java.lang.String str) {
            this.containerMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            return this;
        }

        public androidx.media3.common.Format.Builder setCryptoType(int i3) {
            this.cryptoType = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setCueReplacementBehavior(int i3) {
            this.cueReplacementBehavior = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setCustomData(java.lang.Object obj) {
            this.customData = obj;
            return this;
        }

        public androidx.media3.common.Format.Builder setDecodedHeight(int i3) {
            this.decodedHeight = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setDecodedWidth(int i3) {
            this.decodedWidth = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setDrmInitData(androidx.media3.common.DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            return this;
        }

        public androidx.media3.common.Format.Builder setEncoderDelay(int i3) {
            this.encoderDelay = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setEncoderPadding(int i3) {
            this.encoderPadding = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setFrameRate(float f9) {
            this.frameRate = f9;
            return this;
        }

        public androidx.media3.common.Format.Builder setHasPrerollSamples(boolean z6) {
            this.hasPrerollSamples = z6;
            return this;
        }

        public androidx.media3.common.Format.Builder setHeight(int i3) {
            this.height = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setId(java.lang.String str) {
            this.id = str;
            return this;
        }

        public androidx.media3.common.Format.Builder setInitializationData(java.util.List<byte[]> list) {
            this.initializationData = list;
            return this;
        }

        public androidx.media3.common.Format.Builder setLabel(java.lang.String str) {
            this.label = str;
            return this;
        }

        public androidx.media3.common.Format.Builder setLabels(java.util.List<androidx.media3.common.Label> list) {
            this.labels = p076i4.AbstractC2186b0.u(list);
            return this;
        }

        public androidx.media3.common.Format.Builder setLanguage(java.lang.String str) {
            this.language = str;
            return this;
        }

        public androidx.media3.common.Format.Builder setMaxInputSize(int i3) {
            this.maxInputSize = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setMaxNumReorderSamples(int i3) {
            this.maxNumReorderSamples = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setMaxSubLayers(int i3) {
            this.maxSubLayers = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setMetadata(androidx.media3.common.Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public androidx.media3.common.Format.Builder setPcmEncoding(int i3) {
            this.pcmEncoding = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setPeakBitrate(int i3) {
            this.peakBitrate = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setPixelWidthHeightRatio(float f9) {
            this.pixelWidthHeightRatio = f9;
            return this;
        }

        public androidx.media3.common.Format.Builder setPrimaryTrackGroupId(java.lang.String str) {
            this.primaryTrackGroupId = str;
            return this;
        }

        public androidx.media3.common.Format.Builder setProjectionData(byte[] bArr) {
            this.projectionData = bArr;
            return this;
        }

        public androidx.media3.common.Format.Builder setRoleFlags(int i3) {
            this.roleFlags = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setRotationDegrees(int i3) {
            this.rotationDegrees = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setSampleMimeType(java.lang.String str) {
            this.sampleMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            return this;
        }

        public androidx.media3.common.Format.Builder setSampleRate(int i3) {
            this.sampleRate = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setSelectionFlags(int i3) {
            this.selectionFlags = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setStereoMode(int i3) {
            this.stereoMode = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setSubsampleOffsetUs(long j) {
            this.subsampleOffsetUs = j;
            return this;
        }

        public androidx.media3.common.Format.Builder setTileCountHorizontal(int i3) {
            this.tileCountHorizontal = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setTileCountVertical(int i3) {
            this.tileCountVertical = i3;
            return this;
        }

        public androidx.media3.common.Format.Builder setWidth(int i3) {
            this.width = i3;
            return this;
        }

        public Builder() {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            this.labels = p076i4.S0.f22832l;
            this.averageBitrate = -1;
            this.peakBitrate = -1;
            this.maxInputSize = -1;
            this.maxNumReorderSamples = -1;
            this.subsampleOffsetUs = Long.MAX_VALUE;
            this.width = -1;
            this.height = -1;
            this.decodedWidth = -1;
            this.decodedHeight = -1;
            this.frameRate = -1.0f;
            this.pixelWidthHeightRatio = 1.0f;
            this.stereoMode = -1;
            this.maxSubLayers = -1;
            this.channelCount = -1;
            this.sampleRate = -1;
            this.pcmEncoding = -1;
            this.accessibilityChannel = -1;
            this.cueReplacementBehavior = 1;
            this.tileCountHorizontal = -1;
            this.tileCountVertical = -1;
            this.cryptoType = 0;
            this.auxiliaryTrackType = 0;
        }

        public androidx.media3.common.Format.Builder setId(int i3) {
            this.id = java.lang.Integer.toString(i3);
            return this;
        }

        private Builder(androidx.media3.common.Format format) {
            this.id = format.id;
            this.label = format.label;
            this.labels = format.labels;
            this.language = format.language;
            this.selectionFlags = format.selectionFlags;
            this.roleFlags = format.roleFlags;
            this.averageBitrate = format.averageBitrate;
            this.peakBitrate = format.peakBitrate;
            this.codecs = format.codecs;
            this.metadata = format.metadata;
            this.customData = format.customData;
            this.primaryTrackGroupId = format.primaryTrackGroupId;
            this.containerMimeType = format.containerMimeType;
            this.sampleMimeType = format.sampleMimeType;
            this.maxInputSize = format.maxInputSize;
            this.maxNumReorderSamples = format.maxNumReorderSamples;
            this.initializationData = format.initializationData;
            this.drmInitData = format.drmInitData;
            this.subsampleOffsetUs = format.subsampleOffsetUs;
            this.hasPrerollSamples = format.hasPrerollSamples;
            this.width = format.width;
            this.height = format.height;
            this.decodedWidth = format.decodedWidth;
            this.decodedHeight = format.decodedHeight;
            this.frameRate = format.frameRate;
            this.rotationDegrees = format.rotationDegrees;
            this.pixelWidthHeightRatio = format.pixelWidthHeightRatio;
            this.projectionData = format.projectionData;
            this.stereoMode = format.stereoMode;
            this.colorInfo = format.colorInfo;
            this.maxSubLayers = format.maxSubLayers;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.pcmEncoding = format.pcmEncoding;
            this.encoderDelay = format.encoderDelay;
            this.encoderPadding = format.encoderPadding;
            this.accessibilityChannel = format.accessibilityChannel;
            this.cueReplacementBehavior = format.cueReplacementBehavior;
            this.tileCountHorizontal = format.tileCountHorizontal;
            this.tileCountVertical = format.tileCountVertical;
            this.cryptoType = format.cryptoType;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CueReplacementBehavior {
    }

    private static <T> T defaultIfNull(T t9, T t10) {
        return t9 != null ? t9 : t10;
    }

    public static androidx.media3.common.Format fromBundle(android.os.Bundle bundle) {
        java.util.List<androidx.media3.common.Label> listFromBundleList;
        int i3 = 1;
        androidx.media3.common.Format.Builder builder = new androidx.media3.common.Format.Builder();
        androidx.media3.common.util.BundleCollectionUtil.ensureClassLoader(bundle);
        java.lang.String string = bundle.getString(FIELD_ID);
        androidx.media3.common.Format format = DEFAULT;
        builder.setId((java.lang.String) defaultIfNull(string, format.id)).setLabel((java.lang.String) defaultIfNull(bundle.getString(FIELD_LABEL), format.label));
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_LABELS);
        if (parcelableArrayList == null) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            listFromBundleList = p076i4.S0.f22832l;
        } else {
            listFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(i3), parcelableArrayList);
        }
        builder.setLabels(listFromBundleList).setLanguage((java.lang.String) defaultIfNull(bundle.getString(FIELD_LANGUAGE), format.language)).setSelectionFlags(bundle.getInt(FIELD_SELECTION_FLAGS, format.selectionFlags)).setRoleFlags(bundle.getInt(FIELD_ROLE_FLAGS, format.roleFlags)).setAuxiliaryTrackType(bundle.getInt(FIELD_AUXILIARY_TRACK_TYPE, format.auxiliaryTrackType)).setAverageBitrate(bundle.getInt(FIELD_AVERAGE_BITRATE, format.averageBitrate)).setPeakBitrate(bundle.getInt(FIELD_PEAK_BITRATE, format.peakBitrate)).setCodecs((java.lang.String) defaultIfNull(bundle.getString(FIELD_CODECS), format.codecs)).setPrimaryTrackGroupId((java.lang.String) defaultIfNull(bundle.getString(FIELD_PRIMARY_TRACK_GROUP_ID), format.primaryTrackGroupId)).setContainerMimeType((java.lang.String) defaultIfNull(bundle.getString(FIELD_CONTAINER_MIME_TYPE), format.containerMimeType)).setSampleMimeType((java.lang.String) defaultIfNull(bundle.getString(FIELD_SAMPLE_MIME_TYPE), format.sampleMimeType)).setMaxInputSize(bundle.getInt(FIELD_MAX_INPUT_SIZE, format.maxInputSize));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i9 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(keyForInitializationData(i9));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i9++;
        }
        androidx.media3.common.Format.Builder drmInitData = builder.setInitializationData(arrayList).setDrmInitData((androidx.media3.common.DrmInitData) bundle.getParcelable(FIELD_DRM_INIT_DATA));
        java.lang.String str = FIELD_SUBSAMPLE_OFFSET_US;
        androidx.media3.common.Format format2 = DEFAULT;
        drmInitData.setSubsampleOffsetUs(bundle.getLong(str, format2.subsampleOffsetUs)).setWidth(bundle.getInt(FIELD_WIDTH, format2.width)).setHeight(bundle.getInt(FIELD_HEIGHT, format2.height)).setDecodedWidth(bundle.getInt(FIELD_DECODED_WIDTH, format2.decodedWidth)).setDecodedHeight(bundle.getInt(FIELD_DECODED_HEIGHT, format2.decodedHeight)).setFrameRate(bundle.getFloat(FIELD_FRAME_RATE, format2.frameRate)).setRotationDegrees(bundle.getInt(FIELD_ROTATION_DEGREES, format2.rotationDegrees)).setPixelWidthHeightRatio(bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, format2.pixelWidthHeightRatio)).setProjectionData(bundle.getByteArray(FIELD_PROJECTION_DATA)).setStereoMode(bundle.getInt(FIELD_STEREO_MODE, format2.stereoMode)).setMaxSubLayers(bundle.getInt(FIELD_MAX_SUB_LAYERS, format2.maxSubLayers));
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_COLOR_INFO);
        if (bundle2 != null) {
            builder.setColorInfo(androidx.media3.common.ColorInfo.fromBundle(bundle2));
        }
        builder.setChannelCount(bundle.getInt(FIELD_CHANNEL_COUNT, format2.channelCount)).setSampleRate(bundle.getInt(FIELD_SAMPLE_RATE, format2.sampleRate)).setPcmEncoding(bundle.getInt(FIELD_PCM_ENCODING, format2.pcmEncoding)).setEncoderDelay(bundle.getInt(FIELD_ENCODER_DELAY, format2.encoderDelay)).setEncoderPadding(bundle.getInt(FIELD_ENCODER_PADDING, format2.encoderPadding)).setAccessibilityChannel(bundle.getInt(FIELD_ACCESSIBILITY_CHANNEL, format2.accessibilityChannel)).setTileCountHorizontal(bundle.getInt(FIELD_TILE_COUNT_HORIZONTAL, format2.tileCountHorizontal)).setTileCountVertical(bundle.getInt(FIELD_TILE_COUNT_VERTICAL, format2.tileCountVertical)).setCryptoType(bundle.getInt(FIELD_CRYPTO_TYPE, format2.cryptoType));
        return builder.build();
    }

    private static java.lang.String getDefaultLabel(java.util.List<androidx.media3.common.Label> list, java.lang.String str) {
        for (androidx.media3.common.Label label : list) {
            if (android.text.TextUtils.equals(label.language, str)) {
                return label.value;
            }
        }
        return list.get(0).value;
    }

    private static boolean isLabelPartOfLabels(androidx.media3.common.Format.Builder builder) {
        if (builder.labels.isEmpty() && builder.label == null) {
            return true;
        }
        for (int i3 = 0; i3 < builder.labels.size(); i3++) {
            if (((androidx.media3.common.Label) builder.labels.get(i3)).value.equals(builder.label)) {
                return true;
            }
        }
        return false;
    }

    private static java.lang.String keyForInitializationData(int i3) {
        return FIELD_INITIALIZATION_DATA + "_" + java.lang.Integer.toString(i3, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String lambda$toLogString$0(androidx.media3.common.Label label) {
        return label.language + ": " + label.value;
    }

    public static java.lang.String toLogString(androidx.media3.common.Format format) {
        if (format == null) {
            return "null";
        }
        p068h4.k kVar = new p068h4.k(java.lang.String.valueOf(','));
        java.lang.StringBuilder sbV = p121o0.p.v("id=");
        sbV.append(format.id);
        sbV.append(", mimeType=");
        sbV.append(format.sampleMimeType);
        if (format.containerMimeType != null) {
            sbV.append(", container=");
            sbV.append(format.containerMimeType);
        }
        if (format.primaryTrackGroupId != null) {
            sbV.append(", primaryGroupId=");
            sbV.append(format.primaryTrackGroupId);
        }
        if (format.bitrate != -1) {
            sbV.append(", bitrate=");
            sbV.append(format.bitrate);
        }
        if (format.codecs != null) {
            sbV.append(", codecs=");
            sbV.append(format.codecs);
        }
        if (format.drmInitData != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int i3 = 0;
            while (true) {
                androidx.media3.common.DrmInitData drmInitData = format.drmInitData;
                if (i3 >= drmInitData.schemeDataCount) {
                    break;
                }
                java.util.UUID uuid = drmInitData.get(i3).uuid;
                if (uuid.equals(androidx.media3.common.C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add(androidx.media3.common.C.CENC_TYPE_cenc);
                } else if (uuid.equals(androidx.media3.common.C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(androidx.media3.common.C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(androidx.media3.common.C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(androidx.media3.common.C.UUID_NIL)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i3++;
            }
            sbV.append(", drm=[");
            kVar.a(sbV, linkedHashSet.iterator());
            sbV.append(']');
        }
        if (format.width != -1 && format.height != -1) {
            sbV.append(", res=");
            sbV.append(format.width);
            sbV.append("x");
            sbV.append(format.height);
        }
        if (format.decodedWidth != -1 && format.decodedHeight != -1) {
            sbV.append(", decRes=");
            sbV.append(format.decodedWidth);
            sbV.append("x");
            sbV.append(format.decodedHeight);
        }
        double d4 = format.pixelWidthHeightRatio;
        int i9 = p091k4.c.f24483a;
        if (java.lang.Math.copySign(d4 - 1.0d, 1.0d) > 0.001d && d4 != 1.0d && (!java.lang.Double.isNaN(d4) || !java.lang.Double.isNaN(1.0d))) {
            sbV.append(", par=");
            sbV.append(androidx.media3.common.util.Util.formatInvariant("%.3f", java.lang.Float.valueOf(format.pixelWidthHeightRatio)));
        }
        androidx.media3.common.ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null && colorInfo.isValid()) {
            sbV.append(", color=");
            sbV.append(format.colorInfo.toLogString());
        }
        if (format.frameRate != -1.0f) {
            sbV.append(", fps=");
            sbV.append(format.frameRate);
        }
        if (format.maxSubLayers != -1) {
            sbV.append(", maxSubLayers=");
            sbV.append(format.maxSubLayers);
        }
        if (format.channelCount != -1) {
            sbV.append(", channels=");
            sbV.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sbV.append(", sample_rate=");
            sbV.append(format.sampleRate);
        }
        if (format.language != null) {
            sbV.append(", language=");
            sbV.append(format.language);
        }
        if (!format.labels.isEmpty()) {
            sbV.append(", labels=[");
            kVar.a(sbV, p076i4.AbstractC2230y.A(format.labels, new androidx.media3.common.b(2)).iterator());
            sbV.append("]");
        }
        if (format.selectionFlags != 0) {
            sbV.append(", selectionFlags=[");
            kVar.a(sbV, androidx.media3.common.util.Util.getSelectionFlagStrings(format.selectionFlags).iterator());
            sbV.append("]");
        }
        if (format.roleFlags != 0) {
            sbV.append(", roleFlags=[");
            kVar.a(sbV, androidx.media3.common.util.Util.getRoleFlagStrings(format.roleFlags).iterator());
            sbV.append("]");
        }
        if (format.customData != null) {
            sbV.append(", customData=");
            sbV.append(format.customData);
        }
        if ((format.roleFlags & 32768) != 0) {
            sbV.append(", auxiliaryTrackType=");
            sbV.append(androidx.media3.common.util.Util.getAuxiliaryTrackTypeString(format.auxiliaryTrackType));
        }
        return sbV.toString();
    }

    public androidx.media3.common.Format.Builder buildUpon() {
        return new androidx.media3.common.Format.Builder();
    }

    public androidx.media3.common.Format copyWithCryptoType(int i3) {
        return buildUpon().setCryptoType(i3).build();
    }

    public boolean equals(java.lang.Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.Format.class == obj.getClass()) {
            androidx.media3.common.Format format = (androidx.media3.common.Format) obj;
            int i9 = this.hashCode;
            if ((i9 == 0 || (i3 = format.hashCode) == 0 || i9 == i3) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.auxiliaryTrackType == format.auxiliaryTrackType && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.decodedWidth == format.decodedWidth && this.decodedHeight == format.decodedHeight && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.maxSubLayers == format.maxSubLayers && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.tileCountHorizontal == format.tileCountHorizontal && this.tileCountVertical == format.tileCountVertical && this.cryptoType == format.cryptoType && java.lang.Float.compare(this.frameRate, format.frameRate) == 0 && java.lang.Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && java.util.Objects.equals(this.id, format.id) && java.util.Objects.equals(this.label, format.label) && this.labels.equals(format.labels) && java.util.Objects.equals(this.codecs, format.codecs) && java.util.Objects.equals(this.primaryTrackGroupId, format.primaryTrackGroupId) && java.util.Objects.equals(this.containerMimeType, format.containerMimeType) && java.util.Objects.equals(this.sampleMimeType, format.sampleMimeType) && java.util.Objects.equals(this.language, format.language) && java.util.Arrays.equals(this.projectionData, format.projectionData) && java.util.Objects.equals(this.metadata, format.metadata) && java.util.Objects.equals(this.colorInfo, format.colorInfo) && java.util.Objects.equals(this.drmInitData, format.drmInitData) && initializationDataEquals(format) && java.util.Objects.equals(this.customData, format.customData)) {
                return true;
            }
        }
        return false;
    }

    public int getPixelCount() {
        int i3;
        int i9 = this.width;
        if (i9 == -1 || (i3 = this.height) == -1) {
            return -1;
        }
        return i9 * i3;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            java.lang.String str = this.id;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.label;
            int iHashCode2 = (this.labels.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            java.lang.String str3 = this.language;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.auxiliaryTrackType) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            java.lang.String str4 = this.codecs;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            androidx.media3.common.Metadata metadata = this.metadata;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            java.lang.Object obj = this.customData;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            java.lang.String str5 = this.primaryTrackGroupId;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.containerMimeType;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            java.lang.String str7 = this.sampleMimeType;
            this.hashCode = ((((((((((((((((((((((java.lang.Float.floatToIntBits(this.pixelWidthHeightRatio) + ((((java.lang.Float.floatToIntBits(this.frameRate) + ((((((((((((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + this.decodedWidth) * 31) + this.decodedHeight) * 31)) * 31) + this.rotationDegrees) * 31)) * 31) + this.stereoMode) * 31) + this.maxSubLayers) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.tileCountHorizontal) * 31) + this.tileCountVertical) * 31) + this.cryptoType;
        }
        return this.hashCode;
    }

    public boolean initializationDataEquals(androidx.media3.common.Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i3 = 0; i3 < this.initializationData.size(); i3++) {
            if (!java.util.Arrays.equals(this.initializationData.get(i3), format.initializationData.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(FIELD_ID, this.id);
        bundle.putString(FIELD_LABEL, this.label);
        bundle.putParcelableArrayList(FIELD_LABELS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.labels, new androidx.media3.common.b(0)));
        bundle.putString(FIELD_LANGUAGE, this.language);
        bundle.putInt(FIELD_SELECTION_FLAGS, this.selectionFlags);
        bundle.putInt(FIELD_ROLE_FLAGS, this.roleFlags);
        int i3 = this.auxiliaryTrackType;
        if (i3 != DEFAULT.auxiliaryTrackType) {
            bundle.putInt(FIELD_AUXILIARY_TRACK_TYPE, i3);
        }
        bundle.putInt(FIELD_AVERAGE_BITRATE, this.averageBitrate);
        bundle.putInt(FIELD_PEAK_BITRATE, this.peakBitrate);
        bundle.putString(FIELD_CODECS, this.codecs);
        java.lang.String str = this.primaryTrackGroupId;
        if (str != null) {
            bundle.putString(FIELD_PRIMARY_TRACK_GROUP_ID, str);
        }
        bundle.putString(FIELD_CONTAINER_MIME_TYPE, this.containerMimeType);
        bundle.putString(FIELD_SAMPLE_MIME_TYPE, this.sampleMimeType);
        bundle.putInt(FIELD_MAX_INPUT_SIZE, this.maxInputSize);
        for (int i9 = 0; i9 < this.initializationData.size(); i9++) {
            bundle.putByteArray(keyForInitializationData(i9), this.initializationData.get(i9));
        }
        bundle.putParcelable(FIELD_DRM_INIT_DATA, this.drmInitData);
        bundle.putLong(FIELD_SUBSAMPLE_OFFSET_US, this.subsampleOffsetUs);
        bundle.putInt(FIELD_WIDTH, this.width);
        bundle.putInt(FIELD_HEIGHT, this.height);
        bundle.putInt(FIELD_DECODED_WIDTH, this.decodedWidth);
        bundle.putInt(FIELD_DECODED_HEIGHT, this.decodedHeight);
        bundle.putFloat(FIELD_FRAME_RATE, this.frameRate);
        bundle.putInt(FIELD_ROTATION_DEGREES, this.rotationDegrees);
        bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, this.pixelWidthHeightRatio);
        bundle.putByteArray(FIELD_PROJECTION_DATA, this.projectionData);
        bundle.putInt(FIELD_STEREO_MODE, this.stereoMode);
        androidx.media3.common.ColorInfo colorInfo = this.colorInfo;
        if (colorInfo != null) {
            bundle.putBundle(FIELD_COLOR_INFO, colorInfo.toBundle());
        }
        bundle.putInt(FIELD_MAX_SUB_LAYERS, this.maxSubLayers);
        bundle.putInt(FIELD_CHANNEL_COUNT, this.channelCount);
        bundle.putInt(FIELD_SAMPLE_RATE, this.sampleRate);
        bundle.putInt(FIELD_PCM_ENCODING, this.pcmEncoding);
        bundle.putInt(FIELD_ENCODER_DELAY, this.encoderDelay);
        bundle.putInt(FIELD_ENCODER_PADDING, this.encoderPadding);
        bundle.putInt(FIELD_ACCESSIBILITY_CHANNEL, this.accessibilityChannel);
        bundle.putInt(FIELD_TILE_COUNT_HORIZONTAL, this.tileCountHorizontal);
        bundle.putInt(FIELD_TILE_COUNT_VERTICAL, this.tileCountVertical);
        bundle.putInt(FIELD_CRYPTO_TYPE, this.cryptoType);
        return bundle;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Format(");
        sb.append(this.id);
        sb.append(", ");
        sb.append(this.label);
        sb.append(", ");
        sb.append(this.containerMimeType);
        sb.append(", ");
        sb.append(this.sampleMimeType);
        sb.append(", ");
        sb.append(this.codecs);
        sb.append(", ");
        sb.append(this.bitrate);
        sb.append(", ");
        sb.append(this.language);
        sb.append(", [");
        sb.append(this.width);
        sb.append(", ");
        sb.append(this.height);
        sb.append(", ");
        sb.append(this.frameRate);
        sb.append(", ");
        sb.append(this.colorInfo);
        sb.append("], [");
        sb.append(this.channelCount);
        sb.append(", ");
        return Y6.f.k(sb, this.sampleRate, "])");
    }

    public androidx.media3.common.Format withManifestFormatInfo(androidx.media3.common.Format format) {
        java.lang.String str;
        if (this == format) {
            return this;
        }
        int trackType = androidx.media3.common.MimeTypes.getTrackType(this.sampleMimeType);
        java.lang.String str2 = format.id;
        int i3 = format.tileCountHorizontal;
        int i9 = format.tileCountVertical;
        java.lang.String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        java.util.List<androidx.media3.common.Label> list = !format.labels.isEmpty() ? format.labels : this.labels;
        java.lang.String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i10 = this.averageBitrate;
        if (i10 == -1) {
            i10 = format.averageBitrate;
        }
        int i11 = this.peakBitrate;
        if (i11 == -1) {
            i11 = format.peakBitrate;
        }
        java.lang.String str5 = this.codecs;
        if (str5 == null) {
            java.lang.String codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, trackType);
            if (androidx.media3.common.util.Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        java.lang.String str6 = this.primaryTrackGroupId;
        if (str6 == null) {
            str6 = format.primaryTrackGroupId;
        }
        androidx.media3.common.Metadata metadata = this.metadata;
        androidx.media3.common.Metadata metadataCopyWithAppendedEntriesFrom = metadata == null ? format.metadata : metadata.copyWithAppendedEntriesFrom(format.metadata);
        float f9 = this.frameRate;
        if (f9 == -1.0f && trackType == 2) {
            f9 = format.frameRate;
        }
        return buildUpon().setId(str2).setLabel(str3).setLabels(list).setLanguage(str4).setSelectionFlags(this.selectionFlags | format.selectionFlags).setRoleFlags(this.roleFlags | format.roleFlags).setAverageBitrate(i10).setPeakBitrate(i11).setCodecs(str5).setMetadata(metadataCopyWithAppendedEntriesFrom).setPrimaryTrackGroupId(str6).setDrmInitData(androidx.media3.common.DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData)).setFrameRate(f9).setTileCountHorizontal(i3).setTileCountVertical(i9).build();
    }

    private Format(androidx.media3.common.Format.Builder builder) {
        this.id = builder.id;
        java.lang.String strNormalizeLanguageCode = androidx.media3.common.util.Util.normalizeLanguageCode(builder.language);
        this.language = strNormalizeLanguageCode;
        if (builder.labels.isEmpty() && builder.label != null) {
            this.labels = p076i4.AbstractC2186b0.y(new androidx.media3.common.Label(strNormalizeLanguageCode, builder.label));
            this.label = builder.label;
        } else if (builder.labels.isEmpty() || builder.label != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isLabelPartOfLabels(builder));
            this.labels = builder.labels;
            this.label = builder.label;
        } else {
            this.labels = builder.labels;
            this.label = getDefaultLabel(builder.labels, strNormalizeLanguageCode);
        }
        this.selectionFlags = builder.selectionFlags;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(builder.auxiliaryTrackType == 0 || (builder.roleFlags & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.roleFlags = builder.roleFlags;
        this.auxiliaryTrackType = builder.auxiliaryTrackType;
        int i3 = builder.averageBitrate;
        this.averageBitrate = i3;
        int i9 = builder.peakBitrate;
        this.peakBitrate = i9;
        this.bitrate = i9 != -1 ? i9 : i3;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.customData = builder.customData;
        this.primaryTrackGroupId = builder.primaryTrackGroupId;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.maxNumReorderSamples = builder.maxNumReorderSamples;
        this.initializationData = builder.initializationData == null ? java.util.Collections.EMPTY_LIST : builder.initializationData;
        androidx.media3.common.DrmInitData drmInitData = builder.drmInitData;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.hasPrerollSamples = builder.hasPrerollSamples;
        this.width = builder.width;
        this.height = builder.height;
        this.decodedWidth = builder.decodedWidth;
        this.decodedHeight = builder.decodedHeight;
        this.frameRate = builder.frameRate;
        this.rotationDegrees = builder.rotationDegrees == -1 ? 0 : builder.rotationDegrees;
        this.pixelWidthHeightRatio = builder.pixelWidthHeightRatio == -1.0f ? 1.0f : builder.pixelWidthHeightRatio;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.maxSubLayers = builder.maxSubLayers;
        this.channelCount = builder.channelCount;
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        this.encoderDelay = builder.encoderDelay == -1 ? 0 : builder.encoderDelay;
        this.encoderPadding = builder.encoderPadding != -1 ? builder.encoderPadding : 0;
        this.accessibilityChannel = builder.accessibilityChannel;
        this.cueReplacementBehavior = builder.cueReplacementBehavior;
        this.tileCountHorizontal = builder.tileCountHorizontal;
        this.tileCountVertical = builder.tileCountVertical;
        if (builder.cryptoType != 0 || drmInitData == null) {
            this.cryptoType = builder.cryptoType;
        } else {
            this.cryptoType = 1;
        }
    }
}
