package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;

interface EbmlReader {
    void init(EbmlProcessor ebmlProcessor);

    boolean read(ExtractorInput extractorInput);

    void reset();
}
