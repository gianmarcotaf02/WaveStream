package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingExtractor implements androidx.media3.extractor.Extractor {
    private final androidx.media3.extractor.Extractor delegate;

    public ForwardingExtractor(androidx.media3.extractor.Extractor extractor) {
        this.delegate = extractor;
    }

    @Override // androidx.media3.extractor.Extractor
    public java.util.List<androidx.media3.extractor.SniffFailure> getSniffFailureDetails() {
        return this.delegate.getSniffFailureDetails();
    }

    @Override // androidx.media3.extractor.Extractor
    public androidx.media3.extractor.Extractor getUnderlyingImplementation() {
        return this.delegate.getUnderlyingImplementation();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.delegate.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        return this.delegate.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.delegate.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        this.delegate.seek(j, j9);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        return this.delegate.sniff(extractorInput);
    }
}
