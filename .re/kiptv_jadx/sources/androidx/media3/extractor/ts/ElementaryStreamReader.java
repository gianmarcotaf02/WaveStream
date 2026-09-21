package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public interface ElementaryStreamReader {
    void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray);

    void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void packetFinished(boolean z6);

    void packetStarted(long j, int i3);

    void seek();
}
