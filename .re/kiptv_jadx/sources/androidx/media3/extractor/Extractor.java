package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface Extractor {
    public static final int RESULT_CONTINUE = 0;
    public static final int RESULT_END_OF_INPUT = -1;
    public static final int RESULT_SEEK = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    default java.util.List<androidx.media3.extractor.SniffFailure> getSniffFailureDetails() {
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    default androidx.media3.extractor.Extractor getUnderlyingImplementation() {
        return this;
    }

    void init(androidx.media3.extractor.ExtractorOutput extractorOutput);

    int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder);

    void release();

    void seek(long j, long j9);

    boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput);
}
