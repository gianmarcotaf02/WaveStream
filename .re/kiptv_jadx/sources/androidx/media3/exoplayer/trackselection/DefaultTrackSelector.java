package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackSelector extends androidx.media3.exoplayer.trackselection.MappingTrackSelector implements androidx.media3.exoplayer.RendererCapabilities.Listener {
    private static final java.lang.String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final p076i4.O0 FORMAT_VALUE_ORDERING = new p076i4.G(new androidx.media3.exoplayer.trackselection.a(7));
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final java.lang.String TAG = "DefaultTrackSelector";
    private androidx.media3.common.AudioAttributes audioAttributes;
    public final android.content.Context context;
    private java.lang.Boolean deviceIsTV;
    private final java.lang.Object lock;
    private androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
    private java.lang.Thread playbackThread;
    private androidx.media3.exoplayer.util.SpatializerWrapper spatializer;
    private final androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory trackSelectionFactory;

    public static final class AudioTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isObjectBasedAudio;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final java.lang.String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int preferredLabelMatchIndex;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public AudioTrackInfo(int i3, androidx.media3.common.TrackGroup trackGroup, int i9, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i10, boolean z6, p068h4.l lVar, int i11) {
            int i12;
            int formatLanguageScore;
            int formatLanguageScore2;
            super(i3, trackGroup, i9);
            this.parameters = parameters;
            int i13 = parameters.allowAudioNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowAudioMixedMimeTypeAdaptiveness && (i11 & i13) != 0;
            this.language = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i10, false);
            int i14 = 0;
            while (true) {
                int size = parameters.preferredAudioLanguages.size();
                i12 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                if (i14 >= size) {
                    formatLanguageScore = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, (java.lang.String) parameters.preferredAudioLanguages.get(i14), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.preferredLanguageIndex = i14;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            this.preferredLabelMatchIndex = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getBestLabelMatchIndex(this.format, parameters.preferredAudioLabels);
            androidx.media3.common.Format format = this.format;
            int i15 = format.roleFlags;
            this.hasMainOrNoRoleFlag = i15 == 0 || (i15 & 1) != 0;
            this.isDefaultSelectionFlag = (format.selectionFlags & 1) != 0;
            this.isObjectBasedAudio = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.isObjectBasedAudio(format);
            androidx.media3.common.Format format2 = this.format;
            int i16 = format2.channelCount;
            this.channelCount = i16;
            this.sampleRate = format2.sampleRate;
            int i17 = format2.bitrate;
            this.bitrate = i17;
            this.isWithinConstraints = (i17 == -1 || i17 <= parameters.maxAudioBitrate) && (i16 == -1 || i16 <= parameters.maxAudioChannelCount) && lVar.apply(format2);
            java.lang.String[] systemLanguageCodes = androidx.media3.common.util.Util.getSystemLanguageCodes();
            int i18 = 0;
            while (true) {
                if (i18 >= systemLanguageCodes.length) {
                    formatLanguageScore2 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore2 = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i18], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i18;
            this.localeLanguageScore = formatLanguageScore2;
            for (int i19 = 0; i19 < parameters.preferredAudioMimeTypes.size(); i19++) {
                java.lang.String str = this.format.sampleMimeType;
                if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i19))) {
                    i12 = i19;
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i12;
            this.usesPrimaryDecoder = androidx.media3.exoplayer.RendererCapabilities.getDecoderSupport(i10) == 128;
            this.usesHardwareAcceleration = androidx.media3.exoplayer.RendererCapabilities.getHardwareAccelerationSupport(i10) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i10, z6, i13);
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo> list2) {
            return ((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo) java.util.Collections.max(list)).compareTo((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo) java.util.Collections.max(list2));
        }

        public static p076i4.AbstractC2186b0 createForTrackGroup(int i3, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, boolean z6, p068h4.l lVar, int i9) {
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            for (int i10 = 0; i10 < trackGroup.length; i10++) {
                yS.c(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo(i3, trackGroup, i10, parameters, iArr[i10], z6, lVar, i9));
            }
            return yS.f();
        }

        private int evaluateSelectionEligibility(int i3, boolean z6, int i9) {
            if (!androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters = this.parameters;
            if (parameters.audioOffloadPreferences.audioOffloadMode == 2 && !androidx.media3.exoplayer.trackselection.DefaultTrackSelector.rendererSupportsOffload(parameters, i3, this.format)) {
                return 0;
            }
            if (!androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, false) || !this.isWithinConstraints || this.format.bitrate == -1) {
                return 1;
            }
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters2 = this.parameters;
            if (parameters2.forceHighestSupportedBitrate || parameters2.forceLowestBitrate) {
                return 1;
            }
            return ((!parameters2.allowMultipleAdaptiveSelections && z6) || parameters2.audioOffloadPreferences.audioOffloadMode == 2 || (i3 & i9) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo audioTrackInfo) {
            p076i4.O0 o0A = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING : androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.a();
            p076i4.J jD = p076i4.J.f22802a.d(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.preferredLanguageIndex);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(audioTrackInfo.preferredLanguageIndex);
            p076i4.L0 l2 = p076i4.L0.j;
            p076i4.J jC = jD.c(numValueOf, numValueOf2, l2).a(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).a(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).c(java.lang.Integer.valueOf(this.preferredLabelMatchIndex), java.lang.Integer.valueOf(audioTrackInfo.preferredLabelMatchIndex), l2).d(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).d(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).c(java.lang.Integer.valueOf(this.localeLanguageMatchIndex), java.lang.Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), l2).a(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).d(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).c(java.lang.Integer.valueOf(this.preferredMimeTypeMatchIndex), java.lang.Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), l2);
            if (this.parameters.forceLowestBitrate) {
                jC = jC.c(java.lang.Integer.valueOf(this.bitrate), java.lang.Integer.valueOf(audioTrackInfo.bitrate), androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.a());
            }
            p076i4.J jC2 = jC.d(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).d(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).d(this.isObjectBasedAudio, audioTrackInfo.isObjectBasedAudio).c(java.lang.Integer.valueOf(this.channelCount), java.lang.Integer.valueOf(audioTrackInfo.channelCount), o0A).c(java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(audioTrackInfo.sampleRate), o0A);
            if (java.util.Objects.equals(this.language, audioTrackInfo.language)) {
                jC2 = jC2.c(java.lang.Integer.valueOf(this.bitrate), java.lang.Integer.valueOf(audioTrackInfo.bitrate), o0A);
            }
            return jC2.f();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo audioTrackInfo) {
            int i3;
            java.lang.String str;
            int i9;
            if (!this.parameters.allowAudioMixedChannelCountAdaptiveness && ((i9 = this.format.channelCount) == -1 || i9 != audioTrackInfo.format.channelCount)) {
                return false;
            }
            if (!this.allowMixedMimeTypes && ((str = this.format.sampleMimeType) == null || !android.text.TextUtils.equals(str, audioTrackInfo.format.sampleMimeType))) {
                return false;
            }
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters = this.parameters;
            if (!parameters.allowAudioMixedSampleRateAdaptiveness && ((i3 = this.format.sampleRate) == -1 || i3 != audioTrackInfo.format.sampleRate)) {
                return false;
            }
            if (parameters.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }
    }

    public static final class ImageTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> {
        private final int pixelCount;
        private final int selectionEligibility;

        public ImageTrackInfo(int i3, androidx.media3.common.TrackGroup trackGroup, int i9, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i10) {
            super(i3, trackGroup, i9);
            this.selectionEligibility = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i10, parameters.exceedRendererCapabilitiesIfNecessary) ? 1 : 0;
            this.pixelCount = this.format.getPixelCount();
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static p076i4.AbstractC2186b0 createForTrackGroup(int i3, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr) {
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            int i9 = 0;
            while (i9 < trackGroup.length) {
                int i10 = i3;
                androidx.media3.common.TrackGroup trackGroup2 = trackGroup;
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters2 = parameters;
                yS.c(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo(i10, trackGroup2, i9, parameters2, iArr[i9]));
                i9++;
                i3 = i10;
                trackGroup = trackGroup2;
                parameters = parameters2;
            }
            return yS.f();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo imageTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo imageTrackInfo) {
            return java.lang.Integer.compare(this.pixelCount, imageTrackInfo.pixelCount);
        }
    }

    public static final class OtherTrackScore implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(androidx.media3.common.Format format, int i3) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore) {
            return p076i4.J.f22802a.d(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).d(this.isDefault, otherTrackScore.isDefault).f();
        }
    }

    public static final class Parameters extends androidx.media3.common.TrackSelectionParameters {
        public static final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters DEFAULT;

        @java.lang.Deprecated
        public static final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE;
        private static final java.lang.String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS;
        private static final java.lang.String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final java.lang.String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS;
        private static final java.lang.String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES;
        private static final java.lang.String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY;
        private static final java.lang.String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY;
        private static final java.lang.String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY;
        private static final java.lang.String FIELD_RENDERER_DISABLED_INDICES;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
        private static final java.lang.String FIELD_TUNNELING_ENABLED;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowAudioNonSeamlessAdaptiveness;
        public final boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final android.util.SparseBooleanArray rendererDisabledFlags;
        private final android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends androidx.media3.common.TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowAudioNonSeamlessAdaptiveness;
            private boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final android.util.SparseBooleanArray rendererDisabledFlags;
            private final android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            private static android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> cloneSelectionOverrides(android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray) {
                android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray2 = new android.util.SparseArray<>();
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    sparseArray2.put(sparseArray.keyAt(i3), new java.util.HashMap(sparseArray.valueAt(i3)));
                }
                return sparseArray2;
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.allowAudioNonSeamlessAdaptiveness = true;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = false;
            }

            private android.util.SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
                if (iArr == null) {
                    return new android.util.SparseBooleanArray();
                }
                android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray(iArr.length);
                for (int i3 : iArr) {
                    sparseBooleanArray.append(i3, true);
                }
                return sparseBooleanArray;
            }

            private void setSelectionOverridesFromBundle(android.os.Bundle bundle) {
                java.util.List listFromBundleList;
                int[] intArray = bundle.getIntArray(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES);
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS);
                if (parcelableArrayList == null) {
                    p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                    listFromBundleList = p076i4.S0.f22832l;
                } else {
                    listFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.exoplayer.trackselection.e(2), parcelableArrayList);
                }
                android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES);
                android.util.SparseArray sparseArray = sparseParcelableArray == null ? new android.util.SparseArray() : androidx.media3.common.util.BundleCollectionUtil.fromBundleSparseArray(new androidx.media3.exoplayer.trackselection.e(3), sparseParcelableArray);
                if (intArray == null || intArray.length != listFromBundleList.size()) {
                    return;
                }
                for (int i3 = 0; i3 < intArray.length; i3++) {
                    setSelectionOverride(intArray[i3], (androidx.media3.exoplayer.source.TrackGroupArray) listFromBundleList.get(i3), (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride) sparseArray.get(i3));
                }
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverride(int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
                java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i3);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i3);
                    }
                }
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides(int i3) {
                java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i3);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i3);
                }
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z6) {
                this.allowAudioMixedChannelCountAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z6) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z6) {
                this.allowAudioMixedMimeTypeAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z6) {
                this.allowAudioMixedSampleRateAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioNonSeamlessAdaptiveness(boolean z6) {
                this.allowAudioNonSeamlessAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z6) {
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowMultipleAdaptiveSelections(boolean z6) {
                this.allowMultipleAdaptiveSelections = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z6) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z6) {
                this.allowVideoMixedMimeTypeAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoNonSeamlessAdaptiveness(boolean z6) {
                this.allowVideoNonSeamlessAdaptiveness = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z6) {
                this.constrainAudioChannelCountToDeviceCapabilities = z6;
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTextTrackSelectionFlags(int i3) {
                return setIgnoredTextSelectionFlags(i3);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public /* bridge */ /* synthetic */ androidx.media3.common.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set set) {
                return setDisabledTrackTypes((java.util.Set<java.lang.Integer>) set);
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setExceedAudioConstraintsIfNecessary(boolean z6) {
                this.exceedAudioConstraintsIfNecessary = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setExceedRendererCapabilitiesIfNecessary(boolean z6) {
                this.exceedRendererCapabilitiesIfNecessary = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setExceedVideoConstraintsIfNecessary(boolean z6) {
                this.exceedVideoConstraintsIfNecessary = z6;
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setRendererDisabled(int i3, boolean z6) {
                if (this.rendererDisabledFlags.get(i3) == z6) {
                    return this;
                }
                if (z6) {
                    this.rendererDisabledFlags.put(i3, true);
                    return this;
                }
                this.rendererDisabledFlags.delete(i3);
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setSelectionOverride(int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
                java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i3);
                if (map == null) {
                    map = new java.util.HashMap<>();
                    this.selectionOverrides.put(i3, map);
                }
                if (map.containsKey(trackGroupArray) && java.util.Objects.equals(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setTunnelingEnabled(boolean z6) {
                this.tunnelingEnabled = z6;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder addOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters build() {
                return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters(this);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearOverride(androidx.media3.common.TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearOverridesOfType(int i3) {
                super.clearOverridesOfType(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder set(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setAudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
                super.setAudioOffloadPreferences(audioOffloadPreferences);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setForceHighestSupportedBitrate(boolean z6) {
                super.setForceHighestSupportedBitrate(z6);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setForceLowestBitrate(boolean z6) {
                super.setForceLowestBitrate(z6);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setIgnoredTextSelectionFlags(int i3) {
                super.setIgnoredTextSelectionFlags(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioBitrate(int i3) {
                super.setMaxAudioBitrate(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioChannelCount(int i3) {
                super.setMaxAudioChannelCount(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoBitrate(int i3) {
                super.setMaxVideoBitrate(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoFrameRate(int i3) {
                super.setMaxVideoFrameRate(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSize(int i3, int i9) {
                super.setMaxVideoSize(i3, i9);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoBitrate(int i3) {
                super.setMinVideoBitrate(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoFrameRate(int i3) {
                super.setMinVideoFrameRate(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoSize(int i3, int i9) {
                super.setMinVideoSize(i3, i9);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setOverrideForType(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLabels(java.lang.String... strArr) {
                super.setPreferredAudioLabels(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguage(java.lang.String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguages(java.lang.String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeType(java.lang.String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeTypes(java.lang.String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioRoleFlags(int i3) {
                super.setPreferredAudioRoleFlags(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLabels(java.lang.String... strArr) {
                super.setPreferredTextLabels(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguage(java.lang.String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguages(java.lang.String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextRoleFlags(int i3) {
                super.setPreferredTextRoleFlags(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoLabels(java.lang.String... strArr) {
                super.setPreferredVideoLabels(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoLanguage(java.lang.String str) {
                super.setPreferredVideoLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoLanguages(java.lang.String... strArr) {
                super.setPreferredVideoLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeType(java.lang.String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeTypes(java.lang.String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoRoleFlags(int i3) {
                super.setPreferredVideoRoleFlags(i3);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPrioritizeImageOverVideoEnabled(boolean z6) {
                super.setPrioritizeImageOverVideoEnabled(z6);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setSelectTextByDefault(boolean z6) {
                super.setSelectTextByDefault(z6);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setSelectUndeterminedTextLanguage(boolean z6) {
                super.setSelectUndeterminedTextLanguage(z6);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setTrackTypeDisabled(int i3, boolean z6) {
                super.setTrackTypeDisabled(i3, z6);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSize(int i3, int i9, boolean z6) {
                super.setViewportSize(i3, i9, z6);
                return this;
            }

            public Builder() {
                this.selectionOverrides = new android.util.SparseArray<>();
                this.rendererDisabledFlags = new android.util.SparseBooleanArray();
                init();
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSizeToPhysicalDisplaySize(boolean z6) {
                super.setViewportSizeToPhysicalDisplaySize(z6);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z6) {
                super.setViewportSizeToPhysicalDisplaySize(context, z6);
                return this;
            }

            @java.lang.Deprecated
            public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            @java.lang.Deprecated
            public Builder(android.content.Context context) {
                this();
            }

            private Builder(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.allowAudioNonSeamlessAdaptiveness = parameters.allowAudioNonSeamlessAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(android.os.Bundle bundle) {
                super(bundle);
                init();
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.DEFAULT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowAudioNonSeamlessAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_TUNNELING_ENABLED, parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, parameters.allowMultipleAdaptiveSelections));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange));
                this.selectionOverrides = new android.util.SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.FIELD_RENDERER_DISABLED_INDICES));
            }
        }

        static {
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parametersBuild = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder().build();
            DEFAULT = parametersBuild;
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = androidx.media3.common.util.Util.intToStringMaxRadix(1000);
            FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1001);
            FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1002);
            FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = androidx.media3.common.util.Util.intToStringMaxRadix(1003);
            FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(1004);
            FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_UPSTREAM_DISCARDED);
            FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
            FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_ENABLED);
            FIELD_TUNNELING_ENABLED = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
            FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED);
            FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING);
            FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_UNDERRUN);
            FIELD_SELECTION_OVERRIDES = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED);
            FIELD_RENDERER_DISABLED_INDICES = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DISABLED);
            FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_SINK_ERROR);
            FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_ENABLED);
            FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED);
            FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
            FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS = androidx.media3.common.util.Util.intToStringMaxRadix(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES);
        }

        private static boolean areRendererDisabledFlagsEqual(android.util.SparseBooleanArray sparseBooleanArray, android.util.SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i3 = 0; i3 < size; i3++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i3)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray, android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i3 = 0; i3 < size; i3++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i3));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i3), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder(bundle).build();
        }

        @java.lang.Deprecated
        public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters getDefaults(android.content.Context context) {
            return DEFAULT;
        }

        private static int[] getKeysFromSparseBooleanArray(android.util.SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
                iArr[i3] = sparseBooleanArray.keyAt(i3);
            }
            return iArr;
        }

        private static void putSelectionOverridesToBundle(android.os.Bundle bundle, android.util.SparseArray<java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                int iKeyAt = sparseArray.keyAt(i3);
                for (java.util.Map.Entry<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> entry : sparseArray.valueAt(i3).entrySet()) {
                    androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(java.lang.Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(FIELD_SELECTION_OVERRIDES_RENDERER_INDICES, com.google.crypto.tink.shaded.protobuf.q0.H(arrayList));
                bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(arrayList2, new androidx.media3.exoplayer.trackselection.e(0)));
                bundle.putSparseParcelableArray(FIELD_SELECTION_OVERRIDES, androidx.media3.common.util.BundleCollectionUtil.toBundleSparseArray(sparseArray2, new androidx.media3.exoplayer.trackselection.e(1)));
            }
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.class == obj.getClass()) {
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.allowAudioNonSeamlessAdaptiveness == parameters.allowAudioNonSeamlessAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && this.allowInvalidateSelectionsOnRendererCapabilitiesChange == parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        public boolean getRendererDisabled(int i3) {
            return this.rendererDisabledFlags.get(i3);
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride getSelectionOverride(int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
            java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i3);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @java.lang.Deprecated
        public boolean hasSelectionOverride(int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
            java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i3);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31) + (this.allowInvalidateSelectionsOnRendererCapabilitiesChange ? 1 : 0);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putBoolean(FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, this.allowAudioNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(FIELD_TUNNELING_ENABLED, this.tunnelingEnabled);
            bundle.putBoolean(FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, this.allowMultipleAdaptiveSelections);
            bundle.putBoolean(FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, this.allowInvalidateSelectionsOnRendererCapabilitiesChange);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(FIELD_RENDERER_DISABLED_INDICES, getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private Parameters(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.allowAudioNonSeamlessAdaptiveness = builder.allowAudioNonSeamlessAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.allowInvalidateSelectionsOnRendererCapabilitiesChange = builder.allowInvalidateSelectionsOnRendererCapabilitiesChange;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder buildUpon() {
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder();
        }

        private static boolean areSelectionOverridesEqual(java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map, java.util.Map<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (java.util.Map.Entry<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> entry : map.entrySet()) {
                androidx.media3.exoplayer.source.TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !java.util.Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    @java.lang.Deprecated
    public static final class ParametersBuilder extends androidx.media3.common.TrackSelectionParameters.Builder {
        private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder delegate = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder();

        public ParametersBuilder() {
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverride(int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i3, trackGroupArray);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides(int i3) {
            this.delegate.clearSelectionOverrides(i3);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z6) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z6) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z6) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z6) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z6) {
            this.delegate.setAllowMultipleAdaptiveSelections(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z6) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z6) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z6) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTextTrackSelectionFlags(int i3) {
            this.delegate.setDisabledTextTrackSelectionFlags(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ androidx.media3.common.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set set) {
            return setDisabledTrackTypes((java.util.Set<java.lang.Integer>) set);
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z6) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z6) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z6) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z6);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setRendererDisabled(int i3, boolean z6) {
            this.delegate.setRendererDisabled(i3, z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setSelectionOverride(int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i3, trackGroupArray, selectionOverride);
            return this;
        }

        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setTunnelingEnabled(boolean z6) {
            this.delegate.setTunnelingEnabled(z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder addOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters build() {
            return this.delegate.build();
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearOverride(androidx.media3.common.TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearOverridesOfType(int i3) {
            this.delegate.clearOverridesOfType(i3);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder set(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setAudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.delegate.setAudioOffloadPreferences(audioOffloadPreferences);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setForceHighestSupportedBitrate(boolean z6) {
            this.delegate.setForceHighestSupportedBitrate(z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setForceLowestBitrate(boolean z6) {
            this.delegate.setForceLowestBitrate(z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setIgnoredTextSelectionFlags(int i3) {
            this.delegate.setIgnoredTextSelectionFlags(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioBitrate(int i3) {
            this.delegate.setMaxAudioBitrate(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioChannelCount(int i3) {
            this.delegate.setMaxAudioChannelCount(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoBitrate(int i3) {
            this.delegate.setMaxVideoBitrate(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoFrameRate(int i3) {
            this.delegate.setMaxVideoFrameRate(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSize(int i3, int i9) {
            this.delegate.setMaxVideoSize(i3, i9);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoBitrate(int i3) {
            this.delegate.setMinVideoBitrate(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoFrameRate(int i3) {
            this.delegate.setMinVideoFrameRate(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoSize(int i3, int i9) {
            this.delegate.setMinVideoSize(i3, i9);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setOverrideForType(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLabels(java.lang.String... strArr) {
            this.delegate.setPreferredAudioLabels(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguage(java.lang.String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguages(java.lang.String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeType(java.lang.String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeTypes(java.lang.String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioRoleFlags(int i3) {
            this.delegate.setPreferredAudioRoleFlags(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLabels(java.lang.String... strArr) {
            this.delegate.setPreferredTextLabels(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguage(java.lang.String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguages(java.lang.String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextRoleFlags(int i3) {
            this.delegate.setPreferredTextRoleFlags(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoLabels(java.lang.String... strArr) {
            this.delegate.setPreferredVideoLabels(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoLanguage(java.lang.String str) {
            this.delegate.setPreferredVideoLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoLanguages(java.lang.String... strArr) {
            this.delegate.setPreferredVideoLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeType(java.lang.String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeTypes(java.lang.String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoRoleFlags(int i3) {
            this.delegate.setPreferredVideoRoleFlags(i3);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPrioritizeImageOverVideoEnabled(boolean z6) {
            this.delegate.setPrioritizeImageOverVideoEnabled(z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setSelectTextByDefault(boolean z6) {
            this.delegate.setSelectTextByDefault(z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setSelectUndeterminedTextLanguage(boolean z6) {
            this.delegate.setSelectUndeterminedTextLanguage(z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setTrackTypeDisabled(int i3, boolean z6) {
            this.delegate.setTrackTypeDisabled(i3, z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSize(int i3, int i9, boolean z6) {
            this.delegate.setViewportSize(i3, i9, z6);
            return this;
        }

        public ParametersBuilder(android.content.Context context) {
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSizeToPhysicalDisplaySize(boolean z6) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(z6);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z6) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z6);
            return this;
        }
    }

    public static final class SelectionOverride {
        private static final java.lang.String FIELD_GROUP_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_TRACKS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_TRACK_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i3, int... iArr) {
            this(i3, iArr, 0);
        }

        public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride fromBundle(android.os.Bundle bundle) {
            int i3 = bundle.getInt(FIELD_GROUP_INDEX, -1);
            int[] intArray = bundle.getIntArray(FIELD_TRACKS);
            int i9 = bundle.getInt(FIELD_TRACK_TYPE, -1);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i9 >= 0);
            intArray.getClass();
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride(i3, intArray, i9);
        }

        public boolean containsTrack(int i3) {
            for (int i9 : this.tracks) {
                if (i9 == i3) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride.class == obj.getClass()) {
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && java.util.Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((java.util.Arrays.hashCode(this.tracks) + (this.groupIndex * 31)) * 31) + this.type;
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(FIELD_GROUP_INDEX, this.groupIndex);
            bundle.putIntArray(FIELD_TRACKS, this.tracks);
            bundle.putInt(FIELD_TRACK_TYPE, this.type);
            return bundle;
        }

        public SelectionOverride(int i3, int[] iArr, int i9) {
            this.groupIndex = i3;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i9;
            java.util.Arrays.sort(iArrCopyOf);
        }
    }

    public static final class TextTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> implements java.lang.Comparable<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLabelMatchIndex;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public TextTrackInfo(int i3, androidx.media3.common.TrackGroup trackGroup, int i9, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i10, java.lang.String str, java.lang.String str2) {
            int formatLanguageScore;
            super(i3, trackGroup, i9);
            int i11 = 0;
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i10, false);
            int i12 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i12 & 1) != 0;
            this.isForced = (i12 & 2) != 0;
            p076i4.AbstractC2186b0 abstractC2186b0Y = str2 != null ? p076i4.AbstractC2186b0.y(str2) : parameters.preferredTextLanguages.isEmpty() ? p076i4.AbstractC2186b0.y("") : parameters.preferredTextLanguages;
            int i13 = 0;
            while (true) {
                if (i13 >= abstractC2186b0Y.size()) {
                    formatLanguageScore = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, (java.lang.String) abstractC2186b0Y.get(i13), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.preferredLanguageIndex = i13;
            this.preferredLanguageScore = formatLanguageScore;
            int roleFlagMatchScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, str2 != null ? 1088 : parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            androidx.media3.common.Format format = this.format;
            this.hasCaptionRoleFlags = (1088 & format.roleFlags) != 0;
            int bestLabelMatchIndex = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getBestLabelMatchIndex(format, parameters.preferredTextLabels);
            this.preferredLabelMatchIndex = bestLabelMatchIndex;
            int formatLanguageScore2 = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, str, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore2;
            boolean z6 = formatLanguageScore > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || ((parameters.preferredTextLanguages.isEmpty() && bestLabelMatchIndex != Integer.MAX_VALUE) || this.isDefault || ((this.isForced && formatLanguageScore2 > 0) || parameters.selectTextByDefault));
            if (androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i10, parameters.exceedRendererCapabilitiesIfNecessary) && z6) {
                i11 = 1;
            }
            this.selectionEligibility = i11;
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static p076i4.AbstractC2186b0 createForTrackGroup(int i3, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, java.lang.String str, java.lang.String str2) {
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            int i9 = 0;
            while (i9 < trackGroup.length) {
                int i10 = i3;
                androidx.media3.common.TrackGroup trackGroup2 = trackGroup;
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters2 = parameters;
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                yS.c(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo(i10, trackGroup2, i9, parameters2, iArr[i9], str3, str4));
                i9++;
                i3 = i10;
                trackGroup = trackGroup2;
                parameters = parameters2;
                str = str3;
                str2 = str4;
            }
            return yS.f();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo textTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo textTrackInfo) {
            p076i4.J jD = p076i4.J.f22802a.d(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.preferredLanguageIndex);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(textTrackInfo.preferredLanguageIndex);
            p076i4.L0 l2 = p076i4.L0.j;
            p076i4.J jD2 = jD.c(numValueOf, numValueOf2, l2).a(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).a(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).c(java.lang.Integer.valueOf(this.preferredLabelMatchIndex), java.lang.Integer.valueOf(textTrackInfo.preferredLabelMatchIndex), l2).d(this.isDefault, textTrackInfo.isDefault);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(this.isForced);
            java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(textTrackInfo.isForced);
            if (this.preferredLanguageScore == 0) {
                l2 = p076i4.L0.f22810i;
            }
            p076i4.J jA = jD2.c(boolValueOf, boolValueOf2, l2).a(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                jA = jA.e(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return jA.f();
        }
    }

    public static abstract class TrackInfo<T extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<T>> {
        public final androidx.media3.common.Format format;
        public final int rendererIndex;
        public final androidx.media3.common.TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<T>> {
            java.util.List<T> create(int i3, androidx.media3.common.TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i3, androidx.media3.common.TrackGroup trackGroup, int i9) {
            this.rendererIndex = i3;
            this.trackGroup = trackGroup;
            this.trackIndex = i9;
            this.format = trackGroup.getFormat(i9);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t9);
    }

    public static final class VideoTrackInfo extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo> {
        private static final float MIN_REASONABLE_FRAME_RATE = 10.0f;
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean hasReasonableFrameRate;
        private final boolean isHdr;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int pixelCount;
        private final int preferredLabelMatchIndex;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final java.lang.String resolvedMimeType;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;
        private final boolean usesPrimaryOrFallbackDecoder;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public VideoTrackInfo(int i3, androidx.media3.common.TrackGroup trackGroup, int i9, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i10, java.lang.String str, int i11, boolean z6) {
            boolean z9;
            boolean z10;
            int i12;
            int formatLanguageScore;
            java.lang.String alternativeCodecMimeType;
            androidx.media3.common.Format format;
            int i13;
            int i14;
            int i15;
            androidx.media3.common.Format format2;
            int i16;
            int i17;
            int i18;
            super(i3, trackGroup, i9);
            this.parameters = parameters;
            int i19 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowVideoMixedMimeTypeAdaptiveness && (i11 & i19) != 0;
            if (!z6 || (((i16 = (format2 = this.format).width) != -1 && i16 > parameters.maxVideoWidth) || ((i17 = format2.height) != -1 && i17 > parameters.maxVideoHeight))) {
                z9 = false;
            } else {
                float f9 = format2.frameRate;
                if ((f9 == -1.0f || f9 <= parameters.maxVideoFrameRate) && ((i18 = format2.bitrate) == -1 || i18 <= parameters.maxVideoBitrate)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            this.isWithinMaxConstraints = z9;
            if (!z6 || (((i13 = (format = this.format).width) != -1 && i13 < parameters.minVideoWidth) || ((i14 = format.height) != -1 && i14 < parameters.minVideoHeight))) {
                z10 = false;
            } else {
                float f10 = format.frameRate;
                if ((f10 == -1.0f || f10 >= parameters.minVideoFrameRate) && ((i15 = format.bitrate) == -1 || i15 >= parameters.minVideoBitrate)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            this.isWithinMinConstraints = z10;
            this.isWithinRendererCapabilities = androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i10, false);
            androidx.media3.common.Format format3 = this.format;
            float f11 = format3.frameRate;
            this.hasReasonableFrameRate = f11 != -1.0f && f11 >= MIN_REASONABLE_FRAME_RATE;
            this.bitrate = format3.bitrate;
            this.pixelCount = format3.getPixelCount();
            int i20 = 0;
            while (true) {
                int size = parameters.preferredVideoLanguages.size();
                i12 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                if (i20 >= size) {
                    i20 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                } else {
                    formatLanguageScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, (java.lang.String) parameters.preferredVideoLanguages.get(i20), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.preferredLanguageIndex = i20;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredVideoRoleFlags);
            int i21 = this.format.roleFlags;
            this.hasMainOrNoRoleFlag = i21 == 0 || (i21 & 1) != 0;
            this.selectedAudioLanguageScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, str, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            java.lang.String str2 = this.format.sampleMimeType;
            int decoderSupport = androidx.media3.exoplayer.RendererCapabilities.getDecoderSupport(i10);
            if (decoderSupport == 256 && (alternativeCodecMimeType = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(this.format)) != null) {
                str2 = alternativeCodecMimeType;
            }
            for (int i22 = 0; i22 < parameters.preferredVideoMimeTypes.size(); i22++) {
                if (str2 != null && str2.equals(parameters.preferredVideoMimeTypes.get(i22))) {
                    i12 = i22;
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i12;
            this.preferredLabelMatchIndex = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getBestLabelMatchIndex(this.format, parameters.preferredVideoLabels);
            this.usesPrimaryOrFallbackDecoder = decoderSupport == 128 || decoderSupport == 256;
            boolean z11 = decoderSupport == 128;
            this.usesPrimaryDecoder = z11;
            this.usesHardwareAcceleration = androidx.media3.exoplayer.RendererCapabilities.getHardwareAccelerationSupport(i10) == 64;
            this.resolvedMimeType = str2;
            this.codecPreferenceScore = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getVideoCodecPreferenceScore(str2);
            this.isHdr = z11 && androidx.media3.common.ColorInfo.isTransferHdr(this.format.colorInfo);
            this.selectionEligibility = evaluateSelectionEligibility(i10, i19);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo2) {
            p076i4.J jD = p076i4.J.f22802a.d(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(videoTrackInfo.preferredLanguageIndex);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(videoTrackInfo2.preferredLanguageIndex);
            p076i4.L0 l2 = p076i4.L0.j;
            return jD.c(numValueOf, numValueOf2, l2).a(videoTrackInfo.preferredLanguageScore, videoTrackInfo2.preferredLanguageScore).a(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).c(java.lang.Integer.valueOf(videoTrackInfo.preferredLabelMatchIndex), java.lang.Integer.valueOf(videoTrackInfo2.preferredLabelMatchIndex), l2).d(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).a(videoTrackInfo.selectedAudioLanguageScore, videoTrackInfo2.selectedAudioLanguageScore).d(videoTrackInfo.hasReasonableFrameRate, videoTrackInfo2.hasReasonableFrameRate).d(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).d(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).c(java.lang.Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), java.lang.Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), l2).d(videoTrackInfo.usesPrimaryOrFallbackDecoder, videoTrackInfo2.usesPrimaryOrFallbackDecoder).d(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration).f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo2) {
            p076i4.O0 o0A = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING : androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.a();
            p076i4.J jC = p076i4.J.f22802a;
            if (videoTrackInfo.parameters.forceLowestBitrate) {
                jC = jC.c(java.lang.Integer.valueOf(videoTrackInfo.bitrate), java.lang.Integer.valueOf(videoTrackInfo2.bitrate), androidx.media3.exoplayer.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.a());
            }
            p076i4.J jC2 = jC.d(videoTrackInfo.isHdr, videoTrackInfo2.isHdr).c(java.lang.Integer.valueOf(videoTrackInfo.pixelCount), java.lang.Integer.valueOf(videoTrackInfo2.pixelCount), o0A);
            if (videoTrackInfo.usesPrimaryOrFallbackDecoder && videoTrackInfo.usesHardwareAcceleration) {
                jC2 = jC2.a(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return jC2.d(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).c(java.lang.Integer.valueOf(videoTrackInfo.bitrate), java.lang.Integer.valueOf(videoTrackInfo2.bitrate), o0A).f();
        }

        public static int compareSelections(java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo> list, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo> list2) {
            return p076i4.H.g(compareNonQualityPreferences((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list, new androidx.media3.exoplayer.trackselection.a(4)), (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list2, new androidx.media3.exoplayer.trackselection.a(4)))).a(list.size(), list2.size()).c((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list, new androidx.media3.exoplayer.trackselection.a(5)), (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list2, new androidx.media3.exoplayer.trackselection.a(5)), new androidx.media3.exoplayer.trackselection.a(5)).f();
        }

        public static p076i4.AbstractC2186b0 createForTrackGroup(int i3, androidx.media3.common.TrackGroup trackGroup, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, java.lang.String str, int i9, android.graphics.Point point) {
            int maxVideoPixelsToRetainForViewport = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, point != null ? point.x : parameters.viewportWidth, point != null ? point.y : parameters.viewportHeight, parameters.viewportOrientationMayChange);
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            for (int i10 = 0; i10 < trackGroup.length; i10++) {
                int pixelCount = trackGroup.getFormat(i10).getPixelCount();
                yS.c(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo(i3, trackGroup, i10, parameters, iArr[i10], str, i9, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return yS.f();
        }

        private int evaluateSelectionEligibility(int i3, int i9) {
            if ((this.format.roleFlags & 16384) != 0 || !androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinMaxConstraints && !this.parameters.exceedVideoConstraintsIfNecessary) {
                return 0;
            }
            if (!androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1) {
                return 1;
            }
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters = this.parameters;
            return (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || (i3 & i9) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo) {
            if (!this.allowMixedMimeTypes && !java.util.Objects.equals(this.resolvedMimeType, videoTrackInfo.resolvedMimeType)) {
                return false;
            }
            if (this.parameters.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryOrFallbackDecoder == videoTrackInfo.usesPrimaryOrFallbackDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }
    }

    public DefaultTrackSelector(android.content.Context context) {
        this(context, new androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.Factory());
    }

    private static void applyLegacyRendererOverrides(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i3 = 0; i3 < rendererCount; i3++) {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i3);
            if (parameters.hasSelectionOverride(i3, trackGroups)) {
                androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride = parameters.getSelectionOverride(i3, trackGroups);
                definitionArr[i3] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void applyRendererDisableOverrides(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            int rendererType = mappedTrackInfo.getRendererType(i3);
            if (parameters.getRendererDisabled(i3) || parameters.disabledTrackTypes.contains(java.lang.Integer.valueOf(rendererType))) {
                definitionArr[i3] = null;
            }
        }
    }

    private static void applyTrackSelectionOverrides(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        java.util.HashMap map = new java.util.HashMap();
        for (int i3 = 0; i3 < rendererCount; i3++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i3), trackSelectionParameters, map);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, map);
        for (int i9 = 0; i9 < rendererCount; i9++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride = (androidx.media3.common.TrackSelectionOverride) map.get(java.lang.Integer.valueOf(mappedTrackInfo.getRendererType(i9)));
            if (trackSelectionOverride != null) {
                definitionArr[i9] = (trackSelectionOverride.trackIndices.isEmpty() || mappedTrackInfo.getTrackGroups(i9).indexOf(trackSelectionOverride.mediaTrackGroup) == -1) ? null : new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, com.google.crypto.tink.shaded.protobuf.q0.H(trackSelectionOverride.trackIndices));
            }
        }
    }

    private static void collectTrackSelectionOverrides(androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, java.util.Map<java.lang.Integer, androidx.media3.common.TrackSelectionOverride> map) {
        androidx.media3.common.TrackSelectionOverride trackSelectionOverride;
        for (int i3 = 0; i3 < trackGroupArray.length; i3++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride2 = (androidx.media3.common.TrackSelectionOverride) trackSelectionParameters.overrides.get(trackGroupArray.get(i3));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(java.lang.Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(java.lang.Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    private static android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> findDefinitionForType(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, int i3) {
        for (int i9 = 0; i9 < definitionArr.length; i9++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition = definitionArr[i9];
            if (definition != null && definition.group.type == i3) {
                return android.util.Pair.create(definition, java.lang.Integer.valueOf(i9));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getBestLabelMatchIndex(androidx.media3.common.Format format, p076i4.AbstractC2186b0 abstractC2186b0) {
        for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
            for (int i9 = 0; i9 < format.labels.size(); i9++) {
                if (format.labels.get(i9).value.equals(abstractC2186b0.get(i3))) {
                    return i3;
                }
            }
        }
        return androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    public static int getFormatLanguageScore(androidx.media3.common.Format format, java.lang.String str, boolean z6) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        java.lang.String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        java.lang.String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z6 && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return androidx.media3.common.util.Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, "-")[0].equals(androidx.media3.common.util.Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(androidx.media3.common.TrackGroup trackGroup, int i3, int i9, boolean z6) {
        int i10;
        int i11 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE && i9 != Integer.MAX_VALUE) {
            for (int i12 = 0; i12 < trackGroup.length; i12++) {
                androidx.media3.common.Format format = trackGroup.getFormat(i12);
                int i13 = format.width;
                if (i13 > 0 && (i10 = format.height) > 0) {
                    android.graphics.Point maxVideoSizeInViewport = androidx.media3.exoplayer.trackselection.TrackSelectionUtil.getMaxVideoSizeInViewport(z6, i3, i9, i13, i10);
                    int i14 = format.width;
                    int i15 = format.height;
                    int i16 = i14 * i15;
                    if (i14 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i15 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i16 < i11) {
                        i11 = i16;
                    }
                }
            }
        }
        return i11;
    }

    private static java.lang.String getPreferredLanguageFromCaptioningManager(android.content.Context context) {
        android.view.accessibility.CaptioningManager captioningManager;
        java.util.Locale locale;
        if (context == null || (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return androidx.media3.common.util.Util.getLocaleLanguageTag(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i3, int i9) {
        return (i3 == 0 || i3 != i9) ? java.lang.Integer.bitCount(i3 & i9) : androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    private static p076i4.AbstractC2214p0 getSelectedPrimaryTrackGroupIds(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        int i3 = p076i4.AbstractC2214p0.j;
        p076i4.C2212o0 c2212o0 = new p076i4.C2212o0(4);
        for (int i9 = 0; i9 < definitionArr.length; i9++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition = definitionArr[i9];
            if (definition != null && !parameters.getRendererDisabled(i9) && !parameters.disabledTrackTypes.contains(java.lang.Integer.valueOf(definition.group.type))) {
                c2212o0.f(definition.group.id);
                int i10 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i10 < iArr.length) {
                        java.lang.String str = definition.group.getFormat(iArr[i10]).primaryTrackGroupId;
                        if (str != null) {
                            c2212o0.c(str);
                        }
                        i10++;
                    }
                }
            }
        }
        return c2212o0.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isAudioFormatWithinAudioChannelCountConstraints, reason: merged with bridge method [inline-methods] */
    public boolean lambda$selectAudioTrack$2(androidx.media3.common.Format format, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        int i3;
        androidx.media3.exoplayer.util.SpatializerWrapper spatializerWrapper;
        androidx.media3.exoplayer.util.SpatializerWrapper spatializerWrapper2;
        if (!parameters.constrainAudioChannelCountToDeviceCapabilities) {
            return true;
        }
        java.lang.Boolean bool = this.deviceIsTV;
        if ((bool != null && bool.booleanValue()) || (i3 = format.channelCount) == -1 || i3 <= 2) {
            return true;
        }
        if (!isDolbyAudio(format) || (android.os.Build.VERSION.SDK_INT >= 32 && (spatializerWrapper2 = this.spatializer) != null && spatializerWrapper2.isSpatializationSupported())) {
            return android.os.Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null && spatializerWrapper.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, format);
        }
        return true;
    }

    private static boolean isDolbyAudio(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isObjectBasedAudio(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    @java.lang.Deprecated
    public static boolean isSupported(int i3, boolean z6) {
        return androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(i3, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List lambda$selectAudioTrack$3(final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, boolean z6, int[] iArr, int i3, androidx.media3.common.TrackGroup trackGroup, int[] iArr2) {
        return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo.createForTrackGroup(i3, trackGroup, parameters, iArr2, z6, new p068h4.l() { // from class: androidx.media3.exoplayer.trackselection.b
            @Override // p068h4.l
            public final boolean apply(java.lang.Object obj) {
                return this.f16795h.lambda$selectAudioTrack$2(parameters, (androidx.media3.common.Format) obj);
            }
        }, iArr[i3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$selectImageTrack$5(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i3, androidx.media3.common.TrackGroup trackGroup, int[] iArr) {
        return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ImageTrackInfo.createForTrackGroup(i3, trackGroup, parameters, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$selectTextTrack$4(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, java.lang.String str, java.lang.String str2, int i3, androidx.media3.common.TrackGroup trackGroup, int[] iArr) {
        return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TextTrackInfo.createForTrackGroup(i3, trackGroup, parameters, iArr, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$selectVideoTrack$1(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, java.lang.String str, int[] iArr, android.graphics.Point point, int i3, androidx.media3.common.TrackGroup trackGroup, int[] iArr2) {
        return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(i3, trackGroup, parameters, iArr2, str, iArr[i3], point);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(java.lang.Integer num, java.lang.Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void maybeConfigureRendererForOffload(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        int i3 = -1;
        boolean z6 = false;
        int i9 = 0;
        for (int i10 = 0; i10 < mappedTrackInfo.getRendererCount(); i10++) {
            int rendererType = mappedTrackInfo.getRendererType(i10);
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i10];
            if (rendererType != 1 && exoTrackSelection != null) {
                return;
            }
            if (rendererType == 1 && exoTrackSelection != null && exoTrackSelection.length() == 1) {
                if (rendererSupportsOffload(parameters, iArr[i10][mappedTrackInfo.getTrackGroups(i10).indexOf(exoTrackSelection.getTrackGroup())][exoTrackSelection.getIndexInTrackGroup(0)], exoTrackSelection.getSelectedFormat())) {
                    i9++;
                    i3 = i10;
                }
            }
        }
        if (i9 == 1) {
            int i11 = parameters.audioOffloadPreferences.isGaplessSupportRequired ? 1 : 2;
            androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = rendererConfigurationArr[i3];
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                z6 = true;
            }
            rendererConfigurationArr[i3] = new androidx.media3.exoplayer.RendererConfiguration(i11, z6);
        }
    }

    private static void maybeConfigureRenderersForTunneling(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z6;
        int i3 = -1;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= mappedTrackInfo.getRendererCount()) {
                z6 = true;
                break;
            }
            int rendererType = mappedTrackInfo.getRendererType(i10);
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i10];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i10], mappedTrackInfo.getTrackGroups(i10), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i9 != -1) {
                        z6 = false;
                        break;
                    }
                    i9 = i10;
                } else {
                    if (i3 != -1) {
                        z6 = false;
                        break;
                    }
                    i3 = i10;
                }
            }
            i10++;
        }
        if (z6 && ((i9 == -1 || i3 == -1) ? false : true)) {
            androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = new androidx.media3.exoplayer.RendererConfiguration(0, true);
            rendererConfigurationArr[i9] = rendererConfiguration;
            rendererConfigurationArr[i3] = rendererConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z6;
        androidx.media3.exoplayer.util.SpatializerWrapper spatializerWrapper;
        synchronized (this.lock) {
            try {
                z6 = this.parameters.constrainAudioChannelCountToDeviceCapabilities && android.os.Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null && spatializerWrapper.isSpatializationSupported();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z6) {
            invalidate();
        }
    }

    private void maybeInvalidateForRendererCapabilitiesChange(androidx.media3.exoplayer.Renderer renderer) {
        boolean z6;
        synchronized (this.lock) {
            z6 = this.parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
        }
        if (z6) {
            invalidateForRendererCapabilitiesChange(renderer);
        }
    }

    public static java.lang.String normalizeUndeterminedLanguageToNull(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rendererSupportsOffload(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i3, androidx.media3.common.Format format) {
        if (androidx.media3.exoplayer.RendererCapabilities.getAudioOffloadSupport(i3) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isSpeedChangeSupportRequired && (androidx.media3.exoplayer.RendererCapabilities.getAudioOffloadSupport(i3) & 2048) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isGaplessSupportRequired) {
            boolean z6 = (format.encoderDelay == 0 && format.encoderPadding == 0) ? false : true;
            boolean z9 = (androidx.media3.exoplayer.RendererCapabilities.getAudioOffloadSupport(i3) & 1024) != 0;
            if (z6 && !z9) {
                return false;
            }
        }
        return true;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i3 = 0; i3 < exoTrackSelection.length(); i3++) {
            if (androidx.media3.exoplayer.RendererCapabilities.getTunnelingSupport(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i3)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo<T>> android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTracksForType(int i3, androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory<T> factory, java.util.Comparator<java.util.List<T>> comparator) {
        int i9;
        java.util.RandomAccess randomAccessY;
        androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int rendererCount = mappedTrackInfo2.getRendererCount();
        int i10 = 0;
        while (i10 < rendererCount) {
            if (i3 == mappedTrackInfo2.getRendererType(i10)) {
                androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i10);
                for (int i11 = 0; i11 < trackGroups.length; i11++) {
                    androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i11);
                    java.util.List<T> listCreate = factory.create(i10, trackGroup, iArr[i10][i11]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i12 = 0;
                    while (i12 < trackGroup.length) {
                        T t9 = listCreate.get(i12);
                        int selectionEligibility = t9.getSelectionEligibility();
                        if (zArr[i12] || selectionEligibility == 0) {
                            i9 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessY = p076i4.AbstractC2186b0.y(t9);
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(t9);
                                int i13 = i12 + 1;
                                while (i13 < trackGroup.length) {
                                    T t10 = listCreate.get(i13);
                                    int i14 = rendererCount;
                                    if (t10.getSelectionEligibility() == 2 && t9.isCompatibleForAdaptationWith(t10)) {
                                        arrayList2.add(t10);
                                        zArr[i13] = true;
                                    }
                                    i13++;
                                    rendererCount = i14;
                                }
                                randomAccessY = arrayList2;
                            }
                            i9 = rendererCount;
                            arrayList.add(randomAccessY);
                        }
                        i12++;
                        rendererCount = i9;
                    }
                }
            }
            i10++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo) list.get(i15)).trackIndex;
        }
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo trackInfo = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo) list.get(0);
        return android.util.Pair.create(new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), java.lang.Integer.valueOf(trackInfo.rendererIndex));
    }

    private void setParametersInternal(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        boolean zEquals;
        parameters.getClass();
        synchronized (this.lock) {
            zEquals = this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (zEquals) {
            return;
        }
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
            androidx.media3.common.util.Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
        invalidate();
    }

    public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public androidx.media3.exoplayer.RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return this;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public void onRendererCapabilitiesChanged(androidx.media3.exoplayer.Renderer renderer) {
        maybeInvalidateForRendererCapabilitiesChange(renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void release() {
        androidx.media3.exoplayer.util.SpatializerWrapper spatializerWrapper;
        synchronized (this.lock) {
            try {
                java.lang.Thread thread = this.playbackThread;
                if (thread != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(thread == java.lang.Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
            spatializerWrapper.release();
            this.spatializer = null;
        }
        super.release();
    }

    public void selectAllTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        java.lang.String str;
        java.lang.String str2;
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairSelectTextTrack;
        int rendererCount = mappedTrackInfo.getRendererCount();
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairFindDefinitionForType = findDefinitionForType(definitionArr, 1);
        if (pairFindDefinitionForType == null && (pairFindDefinitionForType = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters)) != null) {
            definitionArr[((java.lang.Integer) pairFindDefinitionForType.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairFindDefinitionForType.first;
        }
        if (pairFindDefinitionForType == null) {
            str = null;
        } else {
            java.lang.Object obj = pairFindDefinitionForType.first;
            str = ((androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) obj).group.getFormat(((androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) obj).tracks[0]).language;
        }
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairFindDefinitionForType2 = findDefinitionForType(definitionArr, 2);
        android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairFindDefinitionForType3 = findDefinitionForType(definitionArr, 4);
        if (pairFindDefinitionForType2 == null && pairFindDefinitionForType3 == null) {
            str2 = str;
            android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters, str2);
            android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> pairSelectImageTrack = (parameters.isPrioritizeImageOverVideoEnabled || pairSelectVideoTrack == null) ? selectImageTrack(mappedTrackInfo, iArr, parameters) : null;
            if (pairSelectImageTrack != null) {
                definitionArr[((java.lang.Integer) pairSelectImageTrack.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectImageTrack.first;
            } else if (pairSelectVideoTrack != null) {
                definitionArr[((java.lang.Integer) pairSelectVideoTrack.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectVideoTrack.first;
            }
        } else {
            str2 = str;
        }
        if (findDefinitionForType(definitionArr, 3) == null && (pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, str2)) != null) {
            definitionArr[((java.lang.Integer) pairSelectTextTrack.second).intValue()] = (androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        selectMetadataTracks(definitionArr, mappedTrackInfo, iArr, parameters);
        for (int i3 = 0; i3 < rendererCount; i3++) {
            int rendererType = mappedTrackInfo.getRendererType(i3);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3 && rendererType != 4 && rendererType != 5 && definitionArr[i3] == null) {
                definitionArr[i3] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i3), iArr[i3], parameters);
            }
        }
    }

    public android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectAudioTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        boolean z6 = false;
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            if (2 == mappedTrackInfo.getRendererType(i3) && mappedTrackInfo.getTrackGroups(i3).length > 0) {
                z6 = true;
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new androidx.media3.exoplayer.trackselection.d(this, parameters, z6, iArr2), new androidx.media3.exoplayer.trackselection.a(3));
    }

    public android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectImageTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(4, mappedTrackInfo, iArr, new F1.e(8, parameters), new androidx.media3.exoplayer.trackselection.a(1));
    }

    public void selectMetadataTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return;
        }
        p076i4.AbstractC2214p0 selectedPrimaryTrackGroupIds = getSelectedPrimaryTrackGroupIds(definitionArr, parameters);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            if (mappedTrackInfo.getRendererType(i3) == 5) {
                androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i3);
                for (int i9 = 0; i9 < trackGroups.length; i9++) {
                    androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i9);
                    arrayList.add(trackGroup);
                    int[] iArr2 = (int[]) iArr[i3][i9].clone();
                    for (int i10 = 0; i10 < iArr2.length; i10++) {
                        java.lang.String str = trackGroup.getFormat(i10).primaryTrackGroupId;
                        if (str != null && !selectedPrimaryTrackGroupIds.contains(str)) {
                            iArr2[i10] = androidx.media3.exoplayer.RendererCapabilities.create(0);
                        }
                    }
                    arrayList2.add(iArr2);
                }
            }
        }
        androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[arrayList.size()];
        androidx.media3.common.util.Util.nullSafeListToArray(arrayList, trackGroupArr);
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr);
        int[][] iArr3 = new int[arrayList2.size()][];
        androidx.media3.common.util.Util.nullSafeListToArray(arrayList2, iArr3);
        for (int i11 = 0; i11 < mappedTrackInfo.getRendererCount(); i11++) {
            if (mappedTrackInfo.getRendererType(i11) == 5) {
                androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definitionSelectOtherTrack = selectOtherTrack(5, trackGroupArray, iArr3, parameters);
                definitionArr[i11] = definitionSelectOtherTrack;
                if (definitionSelectOtherTrack == null) {
                    return;
                } else {
                    java.util.Arrays.fill(iArr3[trackGroupArray.indexOf(definitionSelectOtherTrack.group)], androidx.media3.exoplayer.RendererCapabilities.create(0));
                }
            }
        }
    }

    public androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition selectOtherTrack(int i3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, int[][] iArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        int i9 = 0;
        androidx.media3.common.TrackGroup trackGroup = null;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore = null;
        for (int i10 = 0; i10 < trackGroupArray.length; i10++) {
            androidx.media3.common.TrackGroup trackGroup2 = trackGroupArray.get(i10);
            int[] iArr2 = iArr[i10];
            for (int i11 = 0; i11 < trackGroup2.length; i11++) {
                if (androidx.media3.exoplayer.RendererCapabilities.isFormatSupported(iArr2[i11], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore2 = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.OtherTrackScore(trackGroup2.getFormat(i11), iArr2[i11]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i9 = i11;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition(trackGroup, i9);
    }

    public android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTextTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, java.lang.String str) {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(3, mappedTrackInfo, iArr, new androidx.media3.exoplayer.source.h(parameters, str, parameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager ? getPreferredLanguageFromCaptioningManager(this.context) : null, 1), new androidx.media3.exoplayer.trackselection.a(0));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b1 */
    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.util.Pair<androidx.media3.exoplayer.RendererConfiguration[], androidx.media3.exoplayer.trackselection.ExoTrackSelection[]> selectTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) throws java.lang.Throwable {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        android.content.Context context;
        synchronized (this.lock) {
            try {
                this.playbackThread = java.lang.Thread.currentThread();
                parameters = this.parameters;
            } catch (java.lang.Throwable th) {
                th = th;
                while (true) {
                    throw th;
                }
            }
        }
        if (this.deviceIsTV == null && (context = this.context) != null) {
            this.deviceIsTV = java.lang.Boolean.valueOf(androidx.media3.common.util.Util.isTv(context));
        }
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && android.os.Build.VERSION.SDK_INT >= 32 && this.spatializer == null) {
            this.spatializer = new androidx.media3.exoplayer.util.SpatializerWrapper(this.context, new D1.RunnableC0239y(11, this), this.deviceIsTV);
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr = new androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[rendererCount];
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArr);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArr);
        applyRendererDisableOverrides(mappedTrackInfo, parameters, definitionArr);
        selectAllTracks(definitionArr, mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArr);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArr);
        applyRendererDisableOverrides(mappedTrackInfo, parameters, definitionArr);
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArr, getBandwidthMeter(), mediaPeriodId, timeline);
        androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr = new androidx.media3.exoplayer.RendererConfiguration[rendererCount];
        for (int i3 = 0; i3 < rendererCount; i3++) {
            rendererConfigurationArr[i3] = (parameters.getRendererDisabled(i3) || parameters.disabledTrackTypes.contains(java.lang.Integer.valueOf(mappedTrackInfo.getRendererType(i3))) || (mappedTrackInfo.getRendererType(i3) != -2 && exoTrackSelectionArrCreateTrackSelections[i3] == null)) ? null : androidx.media3.exoplayer.RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        if (parameters.audioOffloadPreferences.audioOffloadMode != 0) {
            maybeConfigureRendererForOffload(parameters, mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return android.util.Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    public android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectVideoTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, final java.lang.String str) {
        android.content.Context context;
        final android.graphics.Point currentDisplayModeSize = null;
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        if (parameters.isViewportSizeLimitedByPhysicalDisplaySize && (context = this.context) != null) {
            currentDisplayModeSize = androidx.media3.common.util.Util.getCurrentDisplayModeSize(context);
        }
        return selectTracksForType(2, mappedTrackInfo, iArr, new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.c
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i3, androidx.media3.common.TrackGroup trackGroup, int[] iArr3) {
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.lambda$selectVideoTrack$1(parameters, str, iArr2, currentDisplayModeSize, i3, trackGroup, iArr3);
            }
        }, new androidx.media3.exoplayer.trackselection.a(2));
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) {
            setParametersInternal((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) trackSelectionParameters);
        }
        setParametersInternal(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder().set(trackSelectionParameters).build());
    }

    public DefaultTrackSelector(android.content.Context context, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory) {
        this(context, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.DEFAULT, factory);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters getParameters() {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    public DefaultTrackSelector(android.content.Context context, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.Factory());
    }

    @java.lang.Deprecated
    public DefaultTrackSelector(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (android.content.Context) null);
    }

    public DefaultTrackSelector(android.content.Context context, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    @java.lang.Deprecated
    public void setParameters(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    private DefaultTrackSelector(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory factory, android.content.Context context) {
        this.lock = new java.lang.Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) {
            this.parameters = (androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters) trackSelectionParameters;
        } else {
            this.parameters = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.DEFAULT.buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            androidx.media3.common.util.Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    public void setParameters(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }
}
