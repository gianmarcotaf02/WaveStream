package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingExtractorInput implements androidx.media3.extractor.ExtractorInput {
    private final androidx.media3.extractor.ExtractorInput input;

    public ForwardingExtractorInput(androidx.media3.extractor.ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean advancePeekPosition(int i3, boolean z6) {
        return this.input.advancePeekPosition(i3, z6);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.input.getLength();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.input.getPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int peek(byte[] bArr, int i3, int i9) {
        return this.input.peek(bArr, i3, i9);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i3, int i9, boolean z6) {
        return this.input.peekFully(bArr, i3, i9, z6);
    }

    @Override // androidx.media3.extractor.ExtractorInput, androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) {
        return this.input.read(bArr, i3, i9);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i3, int i9, boolean z6) {
        return this.input.readFully(bArr, i3, i9, z6);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public <E extends java.lang.Throwable> void setRetryPosition(long j, E e6) {
        this.input.setRetryPosition(j, e6);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int skip(int i3) {
        return this.input.skip(i3);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean skipFully(int i3, boolean z6) {
        return this.input.skipFully(i3, z6);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i3) {
        this.input.advancePeekPosition(i3);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i3, int i9) {
        this.input.peekFully(bArr, i3, i9);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i3, int i9) {
        this.input.readFully(bArr, i3, i9);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void skipFully(int i3) {
        this.input.skipFully(i3);
    }
}
