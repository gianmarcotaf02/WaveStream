package androidx.media3.extractor.heif;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class HeifExtractor implements Extractor {
    public static final int FLAG_READ_IMAGE = 1;
    private final boolean extractImage;
    private final Extractor extractor;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public HeifExtractor() {
        this(0);
    }

    @Override
    public void init(ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.extractor.read(extractorInput, positionHolder);
    }

    @Override
    public void release() {
        this.extractor.release();
    }

    @Override
    public void seek(long j, long j9) {
        this.extractor.seek(j, j9);
    }

    @Override
    public boolean sniff(ExtractorInput extractorInput) {
        return this.extractImage ? HeifSniffer.sniff(extractorInput, false) : this.extractor.sniff(extractorInput);
    }

    public HeifExtractor(int i3) {
        boolean z6 = (i3 & 1) != 0;
        this.extractImage = z6;
        if (z6) {
            this.extractor = new SingleSampleExtractor(-1, -1, MimeTypes.IMAGE_HEIF);
        } else {
            this.extractor = new HeicMotionPhotoExtractor();
        }
    }
}
