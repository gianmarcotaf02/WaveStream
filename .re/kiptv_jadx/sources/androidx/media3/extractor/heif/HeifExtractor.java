package androidx.media3.extractor.heif;

/* JADX INFO: loaded from: classes.dex */
public final class HeifExtractor implements androidx.media3.extractor.Extractor {
    public static final int FLAG_READ_IMAGE = 1;
    private final boolean extractImage;
    private final androidx.media3.extractor.Extractor extractor;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public HeifExtractor() {
        this(0);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        return this.extractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.extractor.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        this.extractor.seek(j, j9);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        return this.extractImage ? androidx.media3.extractor.heif.HeifSniffer.sniff(extractorInput, false) : this.extractor.sniff(extractorInput);
    }

    public HeifExtractor(int i3) {
        boolean z6 = (i3 & 1) != 0;
        this.extractImage = z6;
        if (z6) {
            this.extractor = new androidx.media3.extractor.SingleSampleExtractor(-1, -1, androidx.media3.common.MimeTypes.IMAGE_HEIF);
        } else {
            this.extractor = new androidx.media3.extractor.heif.HeicMotionPhotoExtractor();
        }
    }
}
