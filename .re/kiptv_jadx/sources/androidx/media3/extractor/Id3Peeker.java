package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Peeker {
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(10);

    private boolean peekId3HeaderIntoScratch(androidx.media3.extractor.ExtractorInput extractorInput, int i3) {
        int i9 = 0;
        do {
            int i10 = i9 % 10;
            int i11 = i10 + 10;
            if (i10 == 0 && i9 != 0) {
                java.lang.System.arraycopy(this.scratch.getData(), 10, this.scratch.getData(), 0, 9);
            }
            int i12 = i9 != 0 ? 1 : 10;
            try {
                extractorInput.peekFully(this.scratch.getData(), i11 - i12, i12);
                this.scratch.setPosition(i10);
                this.scratch.setLimit(i11);
                if (this.scratch.peekUnsignedInt24() == 4801587) {
                    return true;
                }
                if (androidx.media3.extractor.MpegAudioUtil.getFrameSize(this.scratch.peekInt()) != -1) {
                    return false;
                }
                if (i9 == 0) {
                    this.scratch.ensureCapacity(20);
                }
                i9++;
            } catch (java.io.EOFException unused) {
            }
        } while (i9 <= i3);
        return false;
    }

    @java.lang.Deprecated
    public androidx.media3.common.Metadata peekId3Data(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        return peekId3Data(extractorInput, framePredicate, 0);
    }

    public androidx.media3.common.Metadata peekId3Data(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate, int i3) {
        androidx.media3.common.Metadata metadataDecode = null;
        int i9 = 0;
        while (peekId3HeaderIntoScratch(extractorInput, i3)) {
            int position = this.scratch.getPosition();
            this.scratch.skipBytes(6);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            int i10 = synchSafeInt + 10;
            if (metadataDecode == null) {
                byte[] bArr = new byte[i10];
                java.lang.System.arraycopy(this.scratch.getData(), position, bArr, 0, 10);
                extractorInput.peekFully(bArr, 10, synchSafeInt);
                metadataDecode = new androidx.media3.extractor.metadata.id3.Id3Decoder(framePredicate).decode(bArr, i10);
            } else {
                extractorInput.advancePeekPosition(synchSafeInt);
            }
            i9 += i10;
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i9);
        return metadataDecode;
    }
}
