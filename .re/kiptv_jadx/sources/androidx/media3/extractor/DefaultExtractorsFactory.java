package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorsFactory implements androidx.media3.extractor.ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader FLAC_EXTENSION_LOADER = new androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader(new D1.C0223h(16));
    private static final androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader MIDI_EXTENSION_LOADER = new androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader(new D1.C0223h(17));
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int heifFlags;
    private int jpegFlags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private p076i4.AbstractC2186b0 tsSubtitleFormats;
    private int tsMode = 1;
    private int tsTimestampSearchBytes = androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;
    private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory = new androidx.media3.extractor.text.DefaultSubtitleParserFactory();
    private boolean textTrackTranscodingEnabled = true;
    private int codecsToParseWithinGopSampleDependencies = 3;

    public static final class ExtensionLoader {
        private final androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier constructorSupplier;
        private final java.util.concurrent.atomic.AtomicBoolean extensionLoaded = new java.util.concurrent.atomic.AtomicBoolean(false);
        private java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> extractorConstructor;

        public interface ConstructorSupplier {
            java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> getConstructor();
        }

        public ExtensionLoader(androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier constructorSupplier) {
            this.constructorSupplier = constructorSupplier;
        }

        private java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> maybeLoadExtractorConstructor() {
            synchronized (this.extensionLoaded) {
                if (this.extensionLoaded.get()) {
                    return this.extractorConstructor;
                }
                try {
                    return this.constructorSupplier.getConstructor();
                } catch (java.lang.ClassNotFoundException unused) {
                    this.extensionLoaded.set(true);
                    return this.extractorConstructor;
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Error instantiating extension", e6);
                }
            }
        }

        public androidx.media3.extractor.Extractor getExtractor(java.lang.Object... objArr) {
            java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> constructorMaybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (constructorMaybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return constructorMaybeLoadExtractorConstructor.newInstance(objArr);
            } catch (java.lang.Exception e6) {
                throw new java.lang.IllegalStateException("Unexpected error creating extractor", e6);
            }
        }
    }

    private void addExtractorsForFileType(int i3, java.util.List<androidx.media3.extractor.Extractor> list) {
        switch (i3) {
            case 0:
                list.add(new androidx.media3.extractor.ts.Ac3Extractor());
                break;
            case 1:
                list.add(new androidx.media3.extractor.ts.Ac4Extractor());
                break;
            case 2:
                list.add(new androidx.media3.extractor.ts.AdtsExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | ((this.adtsFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new androidx.media3.extractor.amr.AmrExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.amrFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 4:
                androidx.media3.extractor.Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(java.lang.Integer.valueOf(this.flacFlags));
                if (extractor == null) {
                    list.add(new androidx.media3.extractor.flac.FlacExtractor(this.flacFlags));
                } else {
                    list.add(extractor);
                }
                break;
            case 5:
                list.add(new androidx.media3.extractor.flv.FlvExtractor());
                break;
            case 6:
                list.add(new androidx.media3.extractor.mkv.MatroskaExtractor(this.subtitleParserFactory, (this.textTrackTranscodingEnabled ? 0 : 2) | this.matroskaFlags));
                break;
            case 7:
                list.add(new androidx.media3.extractor.mp3.Mp3Extractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.mp3Flags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 8:
                list.add(new androidx.media3.extractor.mp4.FragmentedMp4Extractor(this.subtitleParserFactory, this.fragmentedMp4Flags | androidx.media3.extractor.mp4.FragmentedMp4Extractor.codecsToParseWithinGopSampleDependenciesAsFlags(this.codecsToParseWithinGopSampleDependencies) | (this.textTrackTranscodingEnabled ? 0 : 32)));
                list.add(new androidx.media3.extractor.mp4.Mp4Extractor(this.subtitleParserFactory, (this.textTrackTranscodingEnabled ? 0 : 16) | this.mp4Flags | androidx.media3.extractor.mp4.Mp4Extractor.codecsToParseWithinGopSampleDependenciesAsFlags(this.codecsToParseWithinGopSampleDependencies)));
                break;
            case 9:
                list.add(new androidx.media3.extractor.ogg.OggExtractor());
                break;
            case 10:
                list.add(new androidx.media3.extractor.ts.PsExtractor());
                break;
            case 11:
                if (this.tsSubtitleFormats == null) {
                    p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                    this.tsSubtitleFormats = p076i4.S0.f22832l;
                }
                list.add(new androidx.media3.extractor.ts.TsExtractor(this.tsMode, !this.textTrackTranscodingEnabled ? 1 : 0, this.subtitleParserFactory, new androidx.media3.common.util.TimestampAdjuster(0L), new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(this.tsFlags, this.tsSubtitleFormats), this.tsTimestampSearchBytes));
                break;
            case 12:
                list.add(new androidx.media3.extractor.wav.WavExtractor());
                break;
            case 14:
                list.add(new androidx.media3.extractor.jpeg.JpegExtractor(this.jpegFlags));
                break;
            case 15:
                androidx.media3.extractor.Extractor extractor2 = MIDI_EXTENSION_LOADER.getExtractor(new java.lang.Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                }
                break;
            case 16:
                list.add(new androidx.media3.extractor.avi.AviExtractor(!this.textTrackTranscodingEnabled ? 1 : 0, this.subtitleParserFactory));
                break;
            case 17:
                list.add(new androidx.media3.extractor.png.PngExtractor());
                break;
            case 18:
                list.add(new androidx.media3.extractor.webp.WebpExtractor());
                break;
            case 19:
                list.add(new androidx.media3.extractor.bmp.BmpExtractor());
                break;
            case 20:
                list.add(new androidx.media3.extractor.heif.HeifExtractor(this.heifFlags));
                break;
            case 21:
                list.add(new androidx.media3.extractor.avif.AvifExtractor());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> getFlacExtractorConstructor() {
        if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(androidx.media3.extractor.Extractor.class).getConstructor(java.lang.Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> getMidiExtractorConstructor() {
        return java.lang.Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(androidx.media3.extractor.Extractor.class).getConstructor(null);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public synchronized androidx.media3.extractor.Extractor[] createExtractors() {
        return createExtractors(android.net.Uri.EMPTY, new java.util.HashMap());
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setAdtsExtractorFlags(int i3) {
        this.adtsFlags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setAmrExtractorFlags(int i3) {
        this.amrFlags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setConstantBitrateSeekingAlwaysEnabled(boolean z6) {
        this.constantBitrateSeekingAlwaysEnabled = z6;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean z6) {
        this.constantBitrateSeekingEnabled = z6;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setFlacExtractorFlags(int i3) {
        this.flacFlags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i3) {
        this.fragmentedMp4Flags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setHeifExtractorFlags(int i3) {
        this.heifFlags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setJpegExtractorFlags(int i3) {
        this.jpegFlags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setMatroskaExtractorFlags(int i3) {
        this.matroskaFlags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setMp3ExtractorFlags(int i3) {
        this.mp3Flags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setMp4ExtractorFlags(int i3) {
        this.mp4Flags = i3;
        return this;
    }

    @java.lang.Deprecated
    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTextTrackTranscodingEnabled(boolean z6) {
        return experimentalSetTextTrackTranscodingEnabled(z6);
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsExtractorFlags(int i3) {
        this.tsFlags = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsExtractorMode(int i3) {
        this.tsMode = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int i3) {
        this.tsTimestampSearchBytes = i3;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsSubtitleFormats(java.util.List<androidx.media3.common.Format> list) {
        this.tsSubtitleFormats = p076i4.AbstractC2186b0.u(list);
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public synchronized androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.ArrayList arrayList;
        try {
            int[] iArr = DEFAULT_EXTRACTOR_ORDER;
            arrayList = new java.util.ArrayList(iArr.length);
            int iInferFileTypeFromResponseHeaders = androidx.media3.common.FileTypes.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                addExtractorsForFileType(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = androidx.media3.common.FileTypes.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                addExtractorsForFileType(iInferFileTypeFromUri, arrayList);
            }
            for (int i3 : iArr) {
                if (i3 != iInferFileTypeFromResponseHeaders && i3 != iInferFileTypeFromUri) {
                    addExtractorsForFileType(i3, arrayList);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (androidx.media3.extractor.Extractor[]) arrayList.toArray(new androidx.media3.extractor.Extractor[0]);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public synchronized androidx.media3.extractor.DefaultExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        this.codecsToParseWithinGopSampleDependencies = i3;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    @java.lang.Deprecated
    public synchronized androidx.media3.extractor.DefaultExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z6) {
        this.textTrackTranscodingEnabled = z6;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.subtitleParserFactory = factory;
        return this;
    }
}
