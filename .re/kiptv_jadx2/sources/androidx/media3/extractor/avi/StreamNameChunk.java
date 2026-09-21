package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;

final class StreamNameChunk implements AviChunk {
    public final String name;

    private StreamNameChunk(String str) {
        this.name = str;
    }

    public static StreamNameChunk parseFrom(ParsableByteArray parsableByteArray) {
        return new StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    @Override
    public int getType() {
        return AviExtractor.FOURCC_strn;
    }
}
