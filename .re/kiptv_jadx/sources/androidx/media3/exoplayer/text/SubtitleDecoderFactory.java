package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
public interface SubtitleDecoderFactory {
    public static final androidx.media3.exoplayer.text.SubtitleDecoderFactory DEFAULT = new androidx.media3.exoplayer.text.SubtitleDecoderFactory() { // from class: androidx.media3.exoplayer.text.SubtitleDecoderFactory.1
        private final androidx.media3.extractor.text.DefaultSubtitleParserFactory delegate = new androidx.media3.extractor.text.DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public androidx.media3.extractor.text.SubtitleDecoder createDecoder(androidx.media3.common.Format format) {
            java.lang.String str = format.sampleMimeType;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new androidx.media3.extractor.text.cea.Cea608Decoder(str, format.accessibilityChannel, androidx.media3.extractor.text.cea.Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
                    case "application/cea-708":
                        return new androidx.media3.extractor.text.cea.Cea708Decoder(format.accessibilityChannel, format.initializationData);
                }
            }
            if (!this.delegate.supportsFormat(format)) {
                throw new java.lang.IllegalArgumentException(p121o0.p.C("Attempted to create decoder for unsupported MIME type: ", str));
            }
            androidx.media3.extractor.text.SubtitleParser subtitleParserCreate = this.delegate.create(format);
            return new androidx.media3.exoplayer.text.DelegatingSubtitleDecoder(subtitleParserCreate.getClass().getSimpleName().concat("Decoder"), subtitleParserCreate);
        }

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public boolean supportsFormat(androidx.media3.common.Format format) {
            java.lang.String str = format.sampleMimeType;
            return this.delegate.supportsFormat(format) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_CEA608) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_CEA708);
        }
    };

    androidx.media3.extractor.text.SubtitleDecoder createDecoder(androidx.media3.common.Format format);

    boolean supportsFormat(androidx.media3.common.Format format);
}
