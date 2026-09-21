package androidx.media3.extractor;

import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import p068h4.l;

public final class b implements l {

    public final int f16851h;

    public b(int i3) {
        this.f16851h = i3;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f16851h) {
            case 0:
                return GaplessInfoHolder.lambda$setFromMetadata$0((CommentFrame) obj);
            case 1:
                return GaplessInfoHolder.lambda$setFromMetadata$1((InternalFrame) obj);
            case 2:
                return Mp3Extractor.lambda$getId3TlenUs$2((TextInformationFrame) obj);
            case 3:
                return Mp4Extractor.lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4((MdtaMetadataEntry) obj);
            case 4:
                return Mp4Extractor.lambda$shouldSeekToAxteAtom$3((MdtaMetadataEntry) obj);
            default:
                return Mp4Extractor.lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5((MdtaMetadataEntry) obj);
        }
    }
}
