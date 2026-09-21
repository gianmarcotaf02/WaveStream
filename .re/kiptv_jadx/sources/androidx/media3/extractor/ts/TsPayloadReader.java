package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public interface TsPayloadReader {
    public static final int FLAG_DATA_ALIGNMENT_INDICATOR = 4;
    public static final int FLAG_PAYLOAD_UNIT_START_INDICATOR = 1;
    public static final int FLAG_RANDOM_ACCESS_INDICATOR = 2;

    public static final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final java.lang.String language;
        public final int type;

        public DvbSubtitleInfo(java.lang.String str, int i3, byte[] bArr) {
            this.language = str;
            this.type = i3;
            this.initializationData = bArr;
        }
    }

    public static final class EsInfo {
        public static final int AUDIO_TYPE_CLEAN_EFFECTS = 1;
        public static final int AUDIO_TYPE_HEARING_IMPAIRED = 2;
        public static final int AUDIO_TYPE_UNDEFINED = 0;
        public static final int AUDIO_TYPE_VISUAL_IMPAIRED_COMMENTARY = 3;
        public final int audioType;
        public final byte[] descriptorBytes;
        public final java.util.List<androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos;
        public final java.lang.String language;
        public final int streamType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AudioType {
        }

        public EsInfo(int i3, java.lang.String str, int i9, java.util.List<androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo> list, byte[] bArr) {
            this.streamType = i3;
            this.language = str;
            this.audioType = i9;
            this.dvbSubtitleInfos = list == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.unmodifiableList(list);
            this.descriptorBytes = bArr;
        }

        public int getRoleFlags() {
            int i3 = this.audioType;
            if (i3 != 2) {
                return i3 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface Factory {
        android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> createInitialPayloadReaders();

        androidx.media3.extractor.ts.TsPayloadReader createPayloadReader(int i3, androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class TrackIdGenerator {
        private static final int ID_UNSET = Integer.MIN_VALUE;
        private final int firstTrackId;
        private java.lang.String formatId;
        private final java.lang.String formatIdPrefix;
        private int trackId;
        private final int trackIdIncrement;

        public TrackIdGenerator(int i3, int i9) {
            this(Integer.MIN_VALUE, i3, i9);
        }

        private void maybeThrowUninitializedError() {
            if (this.trackId == Integer.MIN_VALUE) {
                throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void generateNewId() {
            int i3 = this.trackId;
            this.trackId = i3 == Integer.MIN_VALUE ? this.firstTrackId : i3 + this.trackIdIncrement;
            this.formatId = this.formatIdPrefix + this.trackId;
        }

        public java.lang.String getFormatId() {
            maybeThrowUninitializedError();
            return this.formatId;
        }

        public int getTrackId() {
            maybeThrowUninitializedError();
            return this.trackId;
        }

        public TrackIdGenerator(int i3, int i9, int i10) {
            this.formatIdPrefix = i3 != Integer.MIN_VALUE ? Y6.f.e(i3, "/") : "";
            this.firstTrackId = i9;
            this.trackIdIncrement = i10;
            this.trackId = Integer.MIN_VALUE;
            this.formatId = "";
        }
    }

    void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3);

    void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void seek();
}
