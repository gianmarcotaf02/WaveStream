package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import java.io.EOFException;

public final class Id3Peeker {
    private final ParsableByteArray scratch = new ParsableByteArray(10);

    private boolean peekId3HeaderIntoScratch(ExtractorInput extractorInput, int i3) {
        int i9 = 0;
        do {
            int i10 = i9 % 10;
            int i11 = i10 + 10;
            if (i10 == 0 && i9 != 0) {
                System.arraycopy(this.scratch.getData(), 10, this.scratch.getData(), 0, 9);
            }
            int i12 = i9 != 0 ? 1 : 10;
            try {
                extractorInput.peekFully(this.scratch.getData(), i11 - i12, i12);
                this.scratch.setPosition(i10);
                this.scratch.setLimit(i11);
                if (this.scratch.peekUnsignedInt24() == 4801587) {
                    return true;
                }
                if (MpegAudioUtil.getFrameSize(this.scratch.peekInt()) != -1) {
                    return false;
                }
                if (i9 == 0) {
                    this.scratch.ensureCapacity(20);
                }
                i9++;
            } catch (EOFException unused) {
            }
        } while (i9 <= i3);
        return false;
    }

    @Deprecated
    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate) {
        return peekId3Data(extractorInput, framePredicate, 0);
    }

    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate, int i3) {
        Metadata metadataDecode = null;
        int i9 = 0;
        while (peekId3HeaderIntoScratch(extractorInput, i3)) {
            int position = this.scratch.getPosition();
            this.scratch.skipBytes(6);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            int i10 = synchSafeInt + 10;
            if (metadataDecode == null) {
                byte[] bArr = new byte[i10];
                System.arraycopy(this.scratch.getData(), position, bArr, 0, 10);
                extractorInput.peekFully(bArr, 10, synchSafeInt);
                metadataDecode = new Id3Decoder(framePredicate).decode(bArr, i10);
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
