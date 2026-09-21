package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class BundledExtractorsAdapter implements androidx.media3.exoplayer.source.ProgressiveMediaExtractor {
    private androidx.media3.extractor.Extractor extractor;
    private androidx.media3.extractor.ExtractorInput extractorInput;
    private final androidx.media3.extractor.ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String lambda$init$0(androidx.media3.extractor.Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        androidx.media3.extractor.Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        androidx.media3.extractor.Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof androidx.media3.extractor.mp3.Mp3Extractor) {
            ((androidx.media3.extractor.mp3.Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        androidx.media3.extractor.ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public java.lang.String getUnderlyingImplementationName() {
        androidx.media3.extractor.Extractor extractor = this.extractor;
        if (extractor != null) {
            return extractor.getUnderlyingImplementation().getClass().getSimpleName();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(androidx.media3.common.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j9, androidx.media3.extractor.ExtractorOutput extractorOutput) throws androidx.media3.exoplayer.source.UnrecognizedInputFormatException {
        androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(dataReader, j, j9);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        androidx.media3.extractor.Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors(uri, map);
        p076i4.Y yT = p076i4.AbstractC2186b0.t(extractorArrCreateExtractors.length);
        boolean z6 = true;
        if (extractorArrCreateExtractors.length == 1) {
            this.extractor = extractorArrCreateExtractors[0];
        } else {
            for (androidx.media3.extractor.Extractor extractor : extractorArrCreateExtractors) {
                try {
                    if (extractor.sniff(defaultExtractorInput)) {
                        this.extractor = extractor;
                        defaultExtractorInput.resetPeekPosition();
                        break;
                    }
                    yT.d(extractor.getSniffFailureDetails());
                    boolean z9 = this.extractor != null || defaultExtractorInput.getPosition() == j;
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z9);
                    defaultExtractorInput.resetPeekPosition();
                } catch (java.io.EOFException unused) {
                    if (this.extractor != null || defaultExtractorInput.getPosition() == j) {
                    }
                } catch (java.lang.Throwable th) {
                    if (this.extractor == null && defaultExtractorInput.getPosition() != j) {
                        z6 = false;
                    }
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z6);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z9);
                defaultExtractorInput.resetPeekPosition();
            }
            if (this.extractor == null) {
                java.lang.String str = "None of the available extractors (" + new p068h4.k(", ").b(p076i4.AbstractC2230y.A(p076i4.AbstractC2186b0.v(extractorArrCreateExtractors), new androidx.media3.exoplayer.source.i(1))) + ") could read the stream.";
                uri.getClass();
                throw new androidx.media3.exoplayer.source.UnrecognizedInputFormatException(str, uri, yT.f());
            }
        }
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(androidx.media3.extractor.PositionHolder positionHolder) {
        androidx.media3.extractor.Extractor extractor = this.extractor;
        extractor.getClass();
        androidx.media3.extractor.ExtractorInput extractorInput = this.extractorInput;
        extractorInput.getClass();
        return extractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        androidx.media3.extractor.Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j9) {
        androidx.media3.extractor.Extractor extractor = this.extractor;
        extractor.getClass();
        extractor.seek(j, j9);
    }
}
