package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Descriptor;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p068h4.v;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;
import p076i4.S0;
import p076i4.Y;
import p076i4.Z;
import p121o0.p;

final class DashMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.ReleaseCallback<DashChunkSource> {
    private static final Pattern CEA608_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern CEA708_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final Allocator allocator;
    private final BaseUrlExclusionList baseUrlExclusionList;
    private MediaPeriod.Callback callback;
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final v downloadExecutorSupplier;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final long elapsedRealtimeOffsetMs;
    private long endPositionUs;
    private List<EventStream> eventStreams;
    final int id;
    private long initialStartTimeUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private int periodIndex;
    private final PlayerEmsgHandler playerEmsgHandler;
    private final PlayerId playerId;
    private boolean readingSuppressedWaitingForInitialDiscontinuity;
    private final TrackGroupInfo[] trackGroupInfos;
    private final TrackGroupArray trackGroups;
    private final TransferListener transferListener;
    private boolean canReportInitialDiscontinuity = true;
    private ChunkSampleStream<DashChunkSource>[] sampleStreams = newSampleStreamArray(0);
    private EventSampleStream[] eventSampleStreams = new EventSampleStream[0];
    private final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream = new IdentityHashMap<>();

    public static final class TrackGroupInfo {
        private static final int CATEGORY_EMBEDDED = 1;
        private static final int CATEGORY_MANIFEST_EVENTS = 2;
        private static final int CATEGORY_PRIMARY = 0;
        public final int[] adaptationSetIndices;
        public final int embeddedClosedCaptionTrackGroupIndex;
        public final AbstractC2186b0 embeddedClosedCaptionTrackOriginalFormats;
        public final int embeddedEventMessageTrackGroupIndex;
        public final int eventStreamGroupIndex;
        public final int primaryTrackGroupIndex;
        public final int trackGroupCategory;
        public final int trackType;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        private TrackGroupInfo(int i3, int i9, int[] iArr, int i10, int i11, int i12, int i13, AbstractC2186b0 abstractC2186b0) {
            this.trackType = i3;
            this.adaptationSetIndices = iArr;
            this.trackGroupCategory = i9;
            this.primaryTrackGroupIndex = i10;
            this.embeddedEventMessageTrackGroupIndex = i11;
            this.embeddedClosedCaptionTrackGroupIndex = i12;
            this.eventStreamGroupIndex = i13;
            this.embeddedClosedCaptionTrackOriginalFormats = abstractC2186b0;
        }

        public static TrackGroupInfo embeddedClosedCaptionTrack(int[] iArr, int i3, AbstractC2186b0 abstractC2186b0) {
            return new TrackGroupInfo(3, 1, iArr, i3, -1, -1, -1, abstractC2186b0);
        }

        public static TrackGroupInfo embeddedEmsgTrack(int[] iArr, int i3) {
            Z z6 = AbstractC2186b0.f22868i;
            return new TrackGroupInfo(5, 1, iArr, i3, -1, -1, -1, S0.f22832l);
        }

        public static TrackGroupInfo mpdEventTrack(int i3) {
            Z z6 = AbstractC2186b0.f22868i;
            return new TrackGroupInfo(5, 2, new int[0], -1, -1, -1, i3, S0.f22832l);
        }

        public static TrackGroupInfo primaryTrack(int i3, int[] iArr, int i9, int i10, int i11) {
            Z z6 = AbstractC2186b0.f22868i;
            return new TrackGroupInfo(i3, 0, iArr, i9, i10, i11, -1, S0.f22832l);
        }
    }

    public DashMediaPeriod(int i3, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i9, DashChunkSource.Factory factory, TransferListener transferListener, CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, long j, LoaderErrorThrower loaderErrorThrower, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback, PlayerId playerId, v vVar) {
        this.id = i3;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.periodIndex = i9;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.elapsedRealtimeOffsetMs = j;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.playerId = playerId;
        this.downloadExecutorSupplier = vVar;
        this.playerEmsgHandler = new PlayerEmsgHandler(dashManifest, playerEmsgCallback, allocator);
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        Period period = dashManifest.getPeriod(i9);
        List<EventStream> list = period.eventStreams;
        this.eventStreams = list;
        Pair<TrackGroupArray, TrackGroupInfo[]> pairBuildTrackGroups = buildTrackGroups(drmSessionManager, factory, period.adaptationSets, list);
        this.trackGroups = (TrackGroupArray) pairBuildTrackGroups.first;
        this.trackGroupInfos = (TrackGroupInfo[]) pairBuildTrackGroups.second;
        this.endPositionUs = Long.MIN_VALUE;
    }

    private static boolean areAllSamplesSyncSamples(DashManifest dashManifest, int i3, int[] iArr, TrackSelection trackSelection) {
        List<AdaptationSet> list = dashManifest.getPeriod(i3).adaptationSets;
        Y yS = AbstractC2186b0.s();
        for (int i9 : iArr) {
            yS.d(list.get(i9).representations);
        }
        S0 s0F = yS.f();
        for (int i10 = 0; i10 < trackSelection.length(); i10++) {
            Format format = ((Representation) s0F.get(trackSelection.getIndexInTrackGroup(i10))).format;
            if (!MimeTypes.allSamplesAreSyncSamples(format.sampleMimeType, format.codecs)) {
                return false;
            }
        }
        return true;
    }

    private static void buildManifestEventTrackGroupInfos(List<EventStream> list, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr, int i3) {
        int i9 = 0;
        while (i9 < list.size()) {
            EventStream eventStream = list.get(i9);
            trackGroupArr[i3] = new TrackGroup(eventStream.id() + ":" + i9, new Format.Builder().setId(eventStream.id()).setSampleMimeType(MimeTypes.APPLICATION_EMSG).build());
            trackGroupInfoArr[i3] = TrackGroupInfo.mpdEventTrack(i9);
            i9++;
            i3++;
        }
    }

    private static int buildPrimaryAndEmbeddedTrackGroupInfos(DrmSessionManager drmSessionManager, DashChunkSource.Factory factory, List<AdaptationSet> list, int[][] iArr, int i3, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr) {
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i3) {
            int[] iArr2 = iArr[i11];
            ArrayList arrayList = new ArrayList();
            for (int i13 : iArr2) {
                arrayList.addAll(list.get(i13).representations);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            for (int i14 = 0; i14 < size; i14++) {
                Format format = ((Representation) arrayList.get(i14)).format;
                formatArr2[i14] = format.buildUpon().setCryptoType(drmSessionManager.getCryptoType(format)).build();
            }
            AdaptationSet adaptationSet = list.get(iArr2[0]);
            long j = adaptationSet.id;
            String string = j != -1 ? Long.toString(j) : M0.l(i11, "unset:");
            int i15 = i12 + 1;
            if (zArr[i11]) {
                i9 = i12 + 2;
            } else {
                i9 = i15;
                i15 = -1;
            }
            if (formatArr[i11].length != 0) {
                i10 = i9 + 1;
            } else {
                i10 = i9;
                i9 = -1;
            }
            maybeUpdateFormatsForParsedText(factory, formatArr2);
            trackGroupArr[i12] = new TrackGroup(string, formatArr2);
            trackGroupInfoArr[i12] = TrackGroupInfo.primaryTrack(adaptationSet.type, iArr2, i12, i15, i9);
            if (i15 != -1) {
                String strO = p.o(string, ":emsg");
                trackGroupArr[i15] = new TrackGroup(strO, new Format.Builder().setId(strO).setSampleMimeType(MimeTypes.APPLICATION_EMSG).setPrimaryTrackGroupId(string).build());
                trackGroupInfoArr[i15] = TrackGroupInfo.embeddedEmsgTrack(iArr2, i12);
            }
            if (i9 != -1) {
                String strO2 = p.o(string, ":cc");
                trackGroupInfoArr[i9] = TrackGroupInfo.embeddedClosedCaptionTrack(iArr2, i12, AbstractC2186b0.v(formatArr[i11]));
                maybeUpdateFormatsForParsedText(factory, formatArr[i11]);
                int i16 = 0;
                while (true) {
                    Format[] formatArr3 = formatArr[i11];
                    if (i16 >= formatArr3.length) {
                        break;
                    }
                    formatArr3[i16] = formatArr3[i16].buildUpon().setPrimaryTrackGroupId(string).build();
                    i16++;
                }
                trackGroupArr[i9] = new TrackGroup(strO2, formatArr[i11]);
            }
            i11++;
            i12 = i10;
        }
        return i12;
    }

    private ChunkSampleStream<DashChunkSource> buildSampleStream(TrackGroupInfo trackGroupInfo, ExoTrackSelection exoTrackSelection, long j) {
        int i3;
        TrackGroup trackGroup;
        AbstractC2186b0 abstractC2186b0;
        int i9;
        ExoTrackSelection exoTrackSelection2;
        ChunkSampleStream<DashChunkSource> chunkSampleStream;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
        int i10 = trackGroupInfo.embeddedEventMessageTrackGroupIndex;
        boolean z6 = true;
        boolean z9 = i10 != -1;
        if (z9) {
            trackGroup = this.trackGroups.get(i10);
            i3 = 1;
        } else {
            i3 = 0;
            trackGroup = null;
        }
        int i11 = trackGroupInfo.embeddedClosedCaptionTrackGroupIndex;
        if (i11 != -1) {
            abstractC2186b0 = this.trackGroupInfos[i11].embeddedClosedCaptionTrackOriginalFormats;
        } else {
            Z z10 = AbstractC2186b0.f22868i;
            abstractC2186b0 = S0.f22832l;
        }
        int size = abstractC2186b0.size() + i3;
        Format[] formatArr = new Format[size];
        int[] iArr = new int[size];
        if (z9) {
            formatArr[0] = trackGroup.getFormat(0);
            iArr[0] = 5;
            i9 = 1;
        } else {
            i9 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < abstractC2186b0.size(); i12++) {
            Format format = (Format) abstractC2186b0.get(i12);
            formatArr[i9] = format;
            iArr[i9] = 3;
            arrayList.add(format);
            i9++;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = (this.manifest.dynamic && z9) ? this.playerEmsgHandler.newPlayerTrackEmsgHandler() : null;
        long firstChunkStartTimeUs = getFirstChunkStartTimeUs(j, this.manifest, this.periodIndex, trackGroupInfo.adaptationSetIndices);
        if (this.canReportInitialDiscontinuity) {
            exoTrackSelection2 = exoTrackSelection;
            if (areAllSamplesSyncSamples(this.manifest, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection2)) {
            }
            DashChunkSource dashChunkSourceCreateDashChunkSource = this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection2, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z9, arrayList, playerTrackEmsgHandlerNewPlayerTrackEmsgHandler, this.transferListener, this.playerId, this.cmcdConfiguration);
            int i13 = trackGroupInfo.trackType;
            Allocator allocator = this.allocator;
            DrmSessionManager drmSessionManager = this.drmSessionManager;
            DrmSessionEventListener.EventDispatcher eventDispatcher = this.drmEventDispatcher;
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.mediaSourceEventDispatcher;
            v vVar = this.downloadExecutorSupplier;
            playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
            chunkSampleStream = new ChunkSampleStream<>(i13, iArr, formatArr, dashChunkSourceCreateDashChunkSource, this, allocator, j, drmSessionManager, eventDispatcher, loadErrorHandlingPolicy, eventDispatcher2, z6, firstChunkStartTimeUs, vVar != null ? (ReleasableExecutor) vVar.get() : null);
            chunkSampleStream.setEndPositionUs(this.endPositionUs);
            synchronized (this) {
                this.trackEmsgHandlerBySampleStream.put(chunkSampleStream, playerTrackEmsgHandler);
            }
            return chunkSampleStream;
        }
        exoTrackSelection2 = exoTrackSelection;
        z6 = false;
        DashChunkSource dashChunkSourceCreateDashChunkSource2 = this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection2, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z9, arrayList, playerTrackEmsgHandlerNewPlayerTrackEmsgHandler, this.transferListener, this.playerId, this.cmcdConfiguration);
        int i14 = trackGroupInfo.trackType;
        Allocator allocator2 = this.allocator;
        DrmSessionManager drmSessionManager2 = this.drmSessionManager;
        DrmSessionEventListener.EventDispatcher eventDispatcher3 = this.drmEventDispatcher;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher eventDispatcher4 = this.mediaSourceEventDispatcher;
        v vVar2 = this.downloadExecutorSupplier;
        playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
        chunkSampleStream = new ChunkSampleStream<>(i14, iArr, formatArr, dashChunkSourceCreateDashChunkSource2, this, allocator2, j, drmSessionManager2, eventDispatcher3, loadErrorHandlingPolicy2, eventDispatcher4, z6, firstChunkStartTimeUs, vVar2 != null ? (ReleasableExecutor) vVar2.get() : null);
        chunkSampleStream.setEndPositionUs(this.endPositionUs);
        synchronized (this) {
            this.trackEmsgHandlerBySampleStream.put(chunkSampleStream, playerTrackEmsgHandler);
            return chunkSampleStream;
        }
    }

    private static Pair<TrackGroupArray, TrackGroupInfo[]> buildTrackGroups(DrmSessionManager drmSessionManager, DashChunkSource.Factory factory, List<AdaptationSet> list, List<EventStream> list2) {
        int[][] groupedAdaptationSetIndices = getGroupedAdaptationSetIndices(list);
        int length = groupedAdaptationSetIndices.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int size = list2.size() + identifyEmbeddedTracks(length, list, groupedAdaptationSetIndices, zArr, formatArr) + length;
        TrackGroup[] trackGroupArr = new TrackGroup[size];
        TrackGroupInfo[] trackGroupInfoArr = new TrackGroupInfo[size];
        buildManifestEventTrackGroupInfos(list2, trackGroupArr, trackGroupInfoArr, buildPrimaryAndEmbeddedTrackGroupInfos(drmSessionManager, factory, list, groupedAdaptationSetIndices, length, zArr, formatArr, trackGroupArr, trackGroupInfoArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), trackGroupInfoArr);
    }

    private static boolean canMergeAdaptationSets(AdaptationSet adaptationSet, AdaptationSet adaptationSet2) {
        if (adaptationSet.type != adaptationSet2.type) {
            return false;
        }
        if (adaptationSet.representations.isEmpty() || adaptationSet2.representations.isEmpty()) {
            return true;
        }
        Format format = adaptationSet.representations.get(0).format;
        Format format2 = adaptationSet2.representations.get(0).format;
        return Objects.equals(format.language, format2.language) && (format.roleFlags & (-16385)) == (format2.roleFlags & (-16385));
    }

    private static Descriptor findAdaptationSetSwitchingProperty(List<Descriptor> list) {
        return findDescriptor(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static Descriptor findDescriptor(List<Descriptor> list, String str) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            Descriptor descriptor = list.get(i3);
            if (str.equals(descriptor.schemeIdUri)) {
                return descriptor;
            }
        }
        return null;
    }

    private static Descriptor findTrickPlayProperty(List<Descriptor> list) {
        return findDescriptor(list, "http://dashif.org/guidelines/trickmode");
    }

    private static Format[] getClosedCaptionTrackFormats(List<AdaptationSet> list, int[] iArr) {
        for (int i3 : iArr) {
            AdaptationSet adaptationSet = list.get(i3);
            List<Descriptor> list2 = list.get(i3).accessibilityDescriptors;
            for (int i9 = 0; i9 < list2.size(); i9++) {
                Descriptor descriptor = list2.get(i9);
                if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA608_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).setId(adaptationSet.id + ":cea608").build());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA708_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA708).setId(adaptationSet.id + ":cea708").build());
                }
            }
        }
        return new Format[0];
    }

    private static long getFirstChunkStartTimeUs(long j, DashManifest dashManifest, int i3, int[] iArr) {
        DashSegmentIndex index = dashManifest.getPeriod(i3).adaptationSets.get(iArr[0]).representations.get(0).getIndex();
        return index == null ? C.TIME_UNSET : index.getTimeUs(index.getSegmentNum(j, dashManifest.getPeriodDurationUs(i3)));
    }

    private static int[][] getGroupedAdaptationSetIndices(List<AdaptationSet> list) {
        Descriptor descriptorFindAdaptationSetSwitchingProperty;
        Integer num;
        int size = list.size();
        HashMap map = new HashMap(AbstractC2230y.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i3 = 0; i3 < size; i3++) {
            map.put(Long.valueOf(list.get(i3).id), Integer.valueOf(i3));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i3));
            arrayList.add(arrayList2);
            sparseArray.put(i3, arrayList2);
        }
        for (int i9 = 0; i9 < size; i9++) {
            AdaptationSet adaptationSet = list.get(i9);
            Descriptor descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.essentialProperties);
            if (descriptorFindTrickPlayProperty == null) {
                descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.supplementalProperties);
            }
            int iIntValue = (descriptorFindTrickPlayProperty == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(descriptorFindTrickPlayProperty.value)))) == null || !canMergeAdaptationSets(adaptationSet, list.get(num.intValue()))) ? i9 : num.intValue();
            if (iIntValue == i9 && (descriptorFindAdaptationSetSwitchingProperty = findAdaptationSetSwitchingProperty(adaptationSet.supplementalProperties)) != null) {
                for (String str : Util.split(descriptorFindAdaptationSetSwitchingProperty.value, ",")) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && canMergeAdaptationSets(adaptationSet, list.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i9) {
                List list2 = (List) sparseArray.get(i9);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i9, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] iArrH = q0.H((Collection) arrayList.get(i10));
            iArr[i10] = iArrH;
            Arrays.sort(iArrH);
        }
        return iArr;
    }

    private int getPrimaryStreamIndex(int i3, int[] iArr) {
        int i9 = iArr[i3];
        if (i9 == -1) {
            return -1;
        }
        int i10 = this.trackGroupInfos[i9].primaryTrackGroupIndex;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 == i10 && this.trackGroupInfos[i12].trackGroupCategory == 0) {
                return i11;
            }
        }
        return -1;
    }

    private int[] getStreamIndexToTrackGroupIndex(ExoTrackSelection[] exoTrackSelectionArr) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                iArr[i3] = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            } else {
                iArr[i3] = -1;
            }
        }
        return iArr;
    }

    private static boolean hasEventMessageTrack(List<AdaptationSet> list, int[] iArr) {
        for (int i3 : iArr) {
            List<Representation> list2 = list.get(i3).representations;
            for (int i9 = 0; i9 < list2.size(); i9++) {
                if (!list2.get(i9).inbandEventStreams.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int identifyEmbeddedTracks(int i3, List<AdaptationSet> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            if (hasEventMessageTrack(list, iArr[i10])) {
                zArr[i10] = true;
                i9++;
            }
            Format[] closedCaptionTrackFormats = getClosedCaptionTrackFormats(list, iArr[i10]);
            formatArr[i10] = closedCaptionTrackFormats;
            if (closedCaptionTrackFormats.length != 0) {
                i9++;
            }
        }
        return i9;
    }

    public static List lambda$selectTracks$0(ChunkSampleStream chunkSampleStream) {
        return AbstractC2186b0.y(Integer.valueOf(chunkSampleStream.primaryTrackType));
    }

    private boolean mayHaveAnyStreamWithPendingInitialDiscontinuity() {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.mayHaveInitialDiscontinuity()) {
                return true;
            }
        }
        return false;
    }

    private static void maybeUpdateFormatsForParsedText(DashChunkSource.Factory factory, Format[] formatArr) {
        for (int i3 = 0; i3 < formatArr.length; i3++) {
            formatArr[i3] = factory.getOutputTextFormat(formatArr[i3]);
        }
    }

    private static ChunkSampleStream<DashChunkSource>[] newSampleStreamArray(int i3) {
        return new ChunkSampleStream[i3];
    }

    private static Format[] parseClosedCaptionDescriptor(Descriptor descriptor, Pattern pattern, Format format) {
        String str = descriptor.value;
        if (str == null) {
            return new Format[]{format};
        }
        String[] strArrSplit = Util.split(str, ";");
        Format[] formatArr = new Format[strArrSplit.length];
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            Matcher matcher = pattern.matcher(strArrSplit[i3]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int i9 = Integer.parseInt(matcher.group(1));
            formatArr[i3] = format.buildUpon().setId(format.id + ":" + i9).setAccessibilityChannel(i9).setLanguage(matcher.group(2)).build();
        }
        return formatArr;
    }

    private void releaseDisabledStreams(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr) {
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            if (exoTrackSelectionArr[i3] == null || !zArr[i3]) {
                SampleStream sampleStream = sampleStreamArr[i3];
                if (sampleStream instanceof ChunkSampleStream) {
                    ((ChunkSampleStream) sampleStream).release(this);
                } else if (sampleStream instanceof ChunkSampleStream.EmbeddedSampleStream) {
                    ((ChunkSampleStream.EmbeddedSampleStream) sampleStream).release();
                }
                sampleStreamArr[i3] = null;
            }
        }
    }

    private void releaseOrphanEmbeddedStreams(ExoTrackSelection[] exoTrackSelectionArr, SampleStream[] sampleStreamArr, int[] iArr) {
        boolean z6;
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            SampleStream sampleStream = sampleStreamArr[i3];
            if ((sampleStream instanceof EmptySampleStream) || (sampleStream instanceof ChunkSampleStream.EmbeddedSampleStream)) {
                int primaryStreamIndex = getPrimaryStreamIndex(i3, iArr);
                if (primaryStreamIndex == -1) {
                    z6 = sampleStreamArr[i3] instanceof EmptySampleStream;
                } else {
                    SampleStream sampleStream2 = sampleStreamArr[i3];
                    z6 = (sampleStream2 instanceof ChunkSampleStream.EmbeddedSampleStream) && ((ChunkSampleStream.EmbeddedSampleStream) sampleStream2).parent == sampleStreamArr[primaryStreamIndex];
                }
                if (!z6) {
                    SampleStream sampleStream3 = sampleStreamArr[i3];
                    if (sampleStream3 instanceof ChunkSampleStream.EmbeddedSampleStream) {
                        ((ChunkSampleStream.EmbeddedSampleStream) sampleStream3).release();
                    }
                    sampleStreamArr[i3] = null;
                }
            }
        }
    }

    private void selectNewStreams(ExoTrackSelection[] exoTrackSelectionArr, SampleStream[] sampleStreamArr, boolean[] zArr, long j, int[] iArr) {
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                SampleStream sampleStream = sampleStreamArr[i3];
                if (sampleStream == null) {
                    zArr[i3] = true;
                    TrackGroupInfo trackGroupInfo = this.trackGroupInfos[iArr[i3]];
                    int i9 = trackGroupInfo.trackGroupCategory;
                    if (i9 == 0) {
                        sampleStreamArr[i3] = buildSampleStream(trackGroupInfo, exoTrackSelection, j);
                    } else if (i9 == 2) {
                        sampleStreamArr[i3] = new EventSampleStream(this.eventStreams.get(trackGroupInfo.eventStreamGroupIndex), exoTrackSelection.getTrackGroup().getFormat(0), this.manifest.dynamic);
                    }
                } else if (sampleStream instanceof ChunkSampleStream) {
                    ((DashChunkSource) ((ChunkSampleStream) sampleStream).getChunkSource()).updateTrackSelection(exoTrackSelection);
                }
            }
        }
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            if (sampleStreamArr[i10] == null && exoTrackSelectionArr[i10] != null) {
                TrackGroupInfo trackGroupInfo2 = this.trackGroupInfos[iArr[i10]];
                if (trackGroupInfo2.trackGroupCategory == 1) {
                    int primaryStreamIndex = getPrimaryStreamIndex(i10, iArr);
                    if (primaryStreamIndex == -1) {
                        sampleStreamArr[i10] = new EmptySampleStream();
                    } else {
                        sampleStreamArr[i10] = ((ChunkSampleStream) sampleStreamArr[primaryStreamIndex]).selectEmbeddedTrack(j, trackGroupInfo2.trackType);
                    }
                }
            }
        }
    }

    private void setSuppressReadOnAllStreams(boolean z6) {
        this.readingSuppressedWaitingForInitialDiscontinuity = z6;
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.setSuppressRead(z6);
        }
    }

    private boolean tryConsumeInitialDiscontinuityFromStreams() {
        boolean zConsumeInitialDiscontinuity = false;
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            zConsumeInitialDiscontinuity |= chunkSampleStream.consumeInitialDiscontinuity();
        }
        return zConsumeInitialDiscontinuity;
    }

    @Override
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override
    public void discardBuffer(long j, boolean z6) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j, z6);
        }
    }

    @Override
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        List<AdaptationSet> list2 = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroupInfo trackGroupInfo = this.trackGroupInfos[this.trackGroups.indexOf(exoTrackSelection.getTrackGroup())];
            if (trackGroupInfo.trackGroupCategory == 0) {
                int[] iArr = trackGroupInfo.adaptationSetIndices;
                int length = exoTrackSelection.length();
                int[] iArr2 = new int[length];
                for (int i3 = 0; i3 < exoTrackSelection.length(); i3++) {
                    iArr2[i3] = exoTrackSelection.getIndexInTrackGroup(i3);
                }
                Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).representations.size();
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = iArr2[i11];
                    while (true) {
                        int i13 = i10 + size;
                        if (i12 >= i13) {
                            i9++;
                            size = list2.get(iArr[i9]).representations.size();
                            i10 = i13;
                        }
                    }
                    arrayList.add(new StreamKey(this.periodIndex, iArr[i9], i12 - i10));
                }
            }
        }
        return arrayList;
    }

    @Override
    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override
    public void maybeThrowPrepareError() {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override
    public synchronized void onSampleStreamReleased(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerRemove = this.trackEmsgHandlerBySampleStream.remove(chunkSampleStream);
        if (playerTrackEmsgHandlerRemove != null) {
            playerTrackEmsgHandlerRemove.release();
        }
    }

    @Override
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override
    public long readDiscontinuity() {
        if (!this.readingSuppressedWaitingForInitialDiscontinuity) {
            return C.TIME_UNSET;
        }
        boolean zTryConsumeInitialDiscontinuityFromStreams = tryConsumeInitialDiscontinuityFromStreams();
        if (!mayHaveAnyStreamWithPendingInitialDiscontinuity()) {
            setSuppressReadOnAllStreams(false);
        }
        return zTryConsumeInitialDiscontinuityFromStreams ? this.initialStartTimeUs : C.TIME_UNSET;
    }

    @Override
    public void reevaluateBuffer(long j) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (!chunkSampleStream.isLoading()) {
                chunkSampleStream.discardUpstreamSamplesForClippedDuration(this.manifest.getPeriodDurationUs(this.periodIndex));
            }
        }
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    public void release() {
        this.playerEmsgHandler.release();
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release(this);
        }
        this.callback = null;
    }

    @Override
    public long seekToUs(long j) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j);
        }
        for (EventSampleStream eventSampleStream : this.eventSampleStreams) {
            eventSampleStream.seekToUs(j);
        }
        return j;
    }

    @Override
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] streamIndexToTrackGroupIndex = getStreamIndexToTrackGroupIndex(exoTrackSelectionArr);
        releaseDisabledStreams(exoTrackSelectionArr, zArr, sampleStreamArr);
        releaseOrphanEmbeddedStreams(exoTrackSelectionArr, sampleStreamArr, streamIndexToTrackGroupIndex);
        selectNewStreams(exoTrackSelectionArr, sampleStreamArr, zArr2, j, streamIndexToTrackGroupIndex);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream instanceof ChunkSampleStream) {
                arrayList.add((ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof EventSampleStream) {
                arrayList2.add((EventSampleStream) sampleStream);
            }
        }
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        arrayList.toArray(chunkSampleStreamArrNewSampleStreamArray);
        EventSampleStream[] eventSampleStreamArr = new EventSampleStream[arrayList2.size()];
        this.eventSampleStreams = eventSampleStreamArr;
        arrayList2.toArray(eventSampleStreamArr);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList, AbstractC2230y.A(arrayList, new b()));
        if (this.canReportInitialDiscontinuity) {
            this.canReportInitialDiscontinuity = false;
            this.initialStartTimeUs = j;
            if (mayHaveAnyStreamWithPendingInitialDiscontinuity()) {
                setSuppressReadOnAllStreams(true);
            }
        }
        return j;
    }

    @Override
    public long setEndPositionUs(long j) {
        this.endPositionUs = j;
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.setEndPositionUs(j);
        }
        return j;
    }

    public void updateManifest(DashManifest dashManifest, int i3) {
        this.manifest = dashManifest;
        this.periodIndex = i3;
        this.playerEmsgHandler.updateManifest(dashManifest);
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = this.sampleStreams;
        if (chunkSampleStreamArr != null) {
            for (ChunkSampleStream<DashChunkSource> chunkSampleStream : chunkSampleStreamArr) {
                ((DashChunkSource) chunkSampleStream.getChunkSource()).updateManifest(dashManifest, i3);
            }
            this.callback.onContinueLoadingRequested(this);
        }
        this.eventStreams = dashManifest.getPeriod(i3).eventStreams;
        for (EventSampleStream eventSampleStream : this.eventSampleStreams) {
            for (EventStream eventStream : this.eventStreams) {
                if (eventStream.id().equals(eventSampleStream.eventStreamId())) {
                    eventSampleStream.updateEventStream(eventStream, dashManifest.dynamic && i3 == dashManifest.getPeriodCount() - 1);
                    break;
                }
            }
        }
    }

    @Override
    public void onContinueLoadingRequested(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }
}
