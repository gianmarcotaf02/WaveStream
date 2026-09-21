package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodHolder {
    private static final java.lang.String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public androidx.media3.exoplayer.MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
    private final androidx.media3.exoplayer.MediaSourceList mediaSourceList;
    private androidx.media3.exoplayer.MediaPeriodHolder next;
    public boolean prepareCalled;
    public boolean prepared;
    private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final androidx.media3.exoplayer.source.SampleStream[] sampleStreams;
    public final long targetPreloadBufferDurationUs;
    private androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;
    private androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult;
    public final java.lang.Object uid;

    public interface Factory {
        androidx.media3.exoplayer.MediaPeriodHolder create(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, long j);
    }

    public MediaPeriodHolder(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, long j, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.MediaSourceList mediaSourceList, androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, long j9) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j;
        this.trackSelector = trackSelector;
        this.mediaSourceList = mediaSourceList;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        this.uid = mediaPeriodId.periodUid;
        this.info = mediaPeriodInfo;
        this.targetPreloadBufferDurationUs = j9;
        this.trackGroups = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
        this.trackSelectorResult = trackSelectorResult;
        this.sampleStreams = new androidx.media3.exoplayer.source.SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        this.mediaPeriod = createMediaPeriod(mediaPeriodId, mediaSourceList, allocator, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.endPositionUs, mediaPeriodInfo.isPrecededByTransitionFromSameStream);
    }

    private void associateNoSampleRenderersWithEmptySampleStream(androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i3 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i3].getTrackType() == -2 && this.trackSelectorResult.isRendererEnabled(i3)) {
                sampleStreamArr[i3] = new androidx.media3.exoplayer.source.EmptySampleStream();
            }
            i3++;
        }
    }

    private static androidx.media3.exoplayer.source.MediaPeriod createMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.MediaSourceList mediaSourceList, androidx.media3.exoplayer.upstream.Allocator allocator, long j, long j9, boolean z6) {
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriodCreatePeriod = mediaSourceList.createPeriod(mediaPeriodId, allocator, j);
        return j9 != androidx.media3.common.C.TIME_UNSET ? new androidx.media3.exoplayer.source.ClippingMediaPeriod(mediaPeriodCreatePeriod, !z6, 0L, j9) : mediaPeriodCreatePeriod;
    }

    private void disableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i3 >= trackSelectorResult.length) {
                return;
            }
            boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i3);
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i3];
            if (zIsRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i3++;
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i3 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i3].getTrackType() == -2) {
                sampleStreamArr[i3] = null;
            }
            i3++;
        }
    }

    private void enableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i3 >= trackSelectorResult.length) {
                return;
            }
            boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i3);
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i3];
            if (zIsRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i3++;
        }
    }

    private boolean isLoadingMediaPeriod() {
        return this.next == null;
    }

    private static void releaseMediaPeriod(androidx.media3.exoplayer.MediaSourceList mediaSourceList, androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod) {
                mediaSourceList.releasePeriod(((androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.releasePeriod(mediaPeriod);
            }
        } catch (java.lang.RuntimeException e6) {
            androidx.media3.common.util.Log.e(TAG, "Period release failed.", e6);
        }
    }

    public long applyTrackSelection(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, long j, boolean z6) {
        return applyTrackSelection(trackSelectorResult, j, z6, new boolean[this.rendererCapabilities.length]);
    }

    public boolean canBeUsedForMediaPeriodInfo(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        if (!androidx.media3.exoplayer.MediaPeriodQueue.areDurationsCompatible(this.info.durationUs, mediaPeriodInfo.durationUs)) {
            return false;
        }
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo2 = this.info;
        return mediaPeriodInfo2.startPositionUs == mediaPeriodInfo.startPositionUs && mediaPeriodInfo2.id.equals(mediaPeriodInfo.id);
    }

    public void continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isLoadingMediaPeriod());
        this.mediaPeriod.continueLoading(loadingInfo);
    }

    public long getBufferedPositionUs() {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.hasEnabledTracks ? this.mediaPeriod.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.info.durationUs : bufferedPositionUs;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getNext() {
        return this.next;
    }

    public long getNextLoadPositionUs() {
        if (this.prepared) {
            return this.mediaPeriod.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public long getStartPositionRendererTime() {
        return this.info.startPositionUs + this.rendererPositionOffsetUs;
    }

    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public androidx.media3.exoplayer.trackselection.TrackSelectorResult getTrackSelectorResult() {
        return this.trackSelectorResult;
    }

    public void handlePrepared(float f9, androidx.media3.common.Timeline timeline, boolean z6) {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResultSelectTracks = selectTracks(f9, timeline, z6);
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = this.info;
        long jMax = mediaPeriodInfo.startPositionUs;
        long j = mediaPeriodInfo.durationUs;
        if (j != androidx.media3.common.C.TIME_UNSET && jMax >= j) {
            jMax = java.lang.Math.max(0L, j - 1);
        }
        long jApplyTrackSelection = applyTrackSelection(trackSelectorResultSelectTracks, jMax, false);
        long j9 = this.rendererPositionOffsetUs;
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo2 = this.info;
        this.rendererPositionOffsetUs = (mediaPeriodInfo2.startPositionUs - jApplyTrackSelection) + j9;
        this.info = mediaPeriodInfo2.copyWithStartPositionUs(jApplyTrackSelection, mediaPeriodInfo2.liveStreamStartPositionProjectionUs);
    }

    public boolean hasLoadingError() {
        try {
            if (this.prepared) {
                for (androidx.media3.exoplayer.source.SampleStream sampleStream : this.sampleStreams) {
                    if (sampleStream != null) {
                        sampleStream.maybeThrowError();
                    }
                }
            } else {
                this.mediaPeriod.maybeThrowPrepareError();
            }
            return false;
        } catch (java.io.IOException unused) {
            return true;
        }
    }

    public boolean isFullyBuffered() {
        if (this.prepared) {
            return !this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean isFullyPreloaded() {
        if (this.prepared) {
            return isFullyBuffered() || getBufferedPositionUs() - this.info.startPositionUs >= this.targetPreloadBufferDurationUs;
        }
        return false;
    }

    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.prepareCalled = true;
        this.mediaPeriod.prepare(callback, j);
    }

    public void reevaluateBuffer(long j) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isLoadingMediaPeriod());
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j));
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.mediaSourceList, this.mediaPeriod);
    }

    public androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks(float f9, androidx.media3.common.Timeline timeline, boolean z6) {
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, getTrackGroups(), this.info.id, timeline);
        for (int i3 = 0; i3 < trackSelectorResultSelectTracks.length; i3++) {
            boolean z9 = true;
            if (trackSelectorResultSelectTracks.isRendererEnabled(i3)) {
                if (trackSelectorResultSelectTracks.selections[i3] == null && this.rendererCapabilities[i3].getTrackType() != -2) {
                    z9 = false;
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z9);
            } else {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(trackSelectorResultSelectTracks.selections[i3] == null);
            }
        }
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : trackSelectorResultSelectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f9);
                exoTrackSelection.onPlayWhenReadyChanged(z6);
            }
        }
        return trackSelectorResultSelectTracks;
    }

    public void setNext(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == this.next) {
            return;
        }
        disableTrackSelectionsInResult();
        this.next = mediaPeriodHolder;
        enableTrackSelectionsInResult();
    }

    public void setRendererOffset(long j) {
        this.rendererPositionOffsetUs = j;
    }

    public long toPeriodTime(long j) {
        return j - getRendererOffset();
    }

    public long toRendererTime(long j) {
        return j + getRendererOffset();
    }

    public void updateClipping() {
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod) {
            long j = this.info.endPositionUs;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod).updateClipping(0L, j);
        }
    }

    public long applyTrackSelection(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, long j, boolean z6, boolean[] zArr) {
        int i3 = 0;
        while (true) {
            boolean z9 = true;
            if (i3 >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z6 || !trackSelectorResult.isEquivalent(this.trackSelectorResult, i3)) {
                z9 = false;
            }
            zArr2[i3] = z9;
            i3++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        disableTrackSelectionsInResult();
        this.trackSelectorResult = trackSelectorResult;
        enableTrackSelectionsInResult();
        long jSelectTracks = this.mediaPeriod.selectTracks(trackSelectorResult.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i9 = 0;
        while (true) {
            androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i9 >= sampleStreamArr.length) {
                return jSelectTracks;
            }
            if (sampleStreamArr[i9] != null) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(trackSelectorResult.isRendererEnabled(i9));
                if (this.rendererCapabilities[i9].getTrackType() != -2) {
                    this.hasEnabledTracks = true;
                }
            } else {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(trackSelectorResult.selections[i9] == null);
            }
            i9++;
        }
    }
}
