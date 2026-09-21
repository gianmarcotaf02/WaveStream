package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class Track {
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final long durationUs;
    public final long[] editListDurations;
    public final long[] editListMediaTimes;
    public final Format format;
    public final int id;
    public final long mediaDurationUs;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;
    private final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final long timescale;
    public final int type;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i3, int i9, long j, long j9, long j10, long j11, Format format, int i10, TrackEncryptionBox[] trackEncryptionBoxArr, int i11, long[] jArr, long[] jArr2) {
        this.id = i3;
        this.type = i9;
        this.timescale = j;
        this.movieTimescale = j9;
        this.durationUs = j10;
        this.mediaDurationUs = j11;
        this.format = format;
        this.sampleTransformation = i10;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr;
        this.nalUnitLengthFieldLength = i11;
        this.editListDurations = jArr;
        this.editListMediaTimes = jArr2;
    }

    public Track copyWithFormat(Format format) {
        return new Track(this.id, this.type, this.timescale, this.movieTimescale, this.durationUs, this.mediaDurationUs, format, this.sampleTransformation, this.sampleDescriptionEncryptionBoxes, this.nalUnitLengthFieldLength, this.editListDurations, this.editListMediaTimes);
    }

    public Track copyWithoutEditLists() {
        return new Track(this.id, this.type, this.timescale, this.movieTimescale, this.durationUs, this.mediaDurationUs, this.format, this.sampleTransformation, this.sampleDescriptionEncryptionBoxes, this.nalUnitLengthFieldLength, null, null);
    }

    public TrackEncryptionBox getSampleDescriptionEncryptionBox(int i3) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.sampleDescriptionEncryptionBoxes;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i3];
    }
}
