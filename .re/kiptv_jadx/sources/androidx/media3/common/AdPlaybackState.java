package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    private final androidx.media3.common.AdPlaybackState.AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final java.lang.Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final androidx.media3.common.AdPlaybackState NONE = new androidx.media3.common.AdPlaybackState(null, new androidx.media3.common.AdPlaybackState.AdGroup[0], 0, androidx.media3.common.C.TIME_UNSET, 0);
    private static final androidx.media3.common.AdPlaybackState.AdGroup REMOVED_AD_GROUP = new androidx.media3.common.AdPlaybackState.AdGroup(0).withAdCount(0);
    private static final java.lang.String FIELD_AD_GROUPS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_AD_RESUME_POSITION_US = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_CONTENT_DURATION_US = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_REMOVED_AD_GROUP_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    public static final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final java.lang.String[] ids;
        public final boolean isPlaceholder;
        public final boolean isServerSideInserted;
        public final androidx.media3.common.MediaItem[] mediaItems;
        public final int originalCount;
        public final androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfos;
        public final int[] states;
        public final long timeUs;

        @java.lang.Deprecated
        public final android.net.Uri[] uris;
        private static final java.lang.String FIELD_TIME_US = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_URIS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_STATES = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_DURATIONS_US = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_CONTENT_RESUME_OFFSET_US = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_IS_SERVER_SIDE_INSERTED = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String FIELD_ORIGINAL_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        static final java.lang.String FIELD_MEDIA_ITEMS = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        static final java.lang.String FIELD_IDS = androidx.media3.common.util.Util.intToStringMaxRadix(9);
        static final java.lang.String FIELD_IS_PLACEHOLDER = androidx.media3.common.util.Util.intToStringMaxRadix(10);
        private static final java.lang.String FIELD_SKIP_INFOS = androidx.media3.common.util.Util.intToStringMaxRadix(11);

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i3) {
            int length = jArr.length;
            int iMax = java.lang.Math.max(i3, length);
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax);
            java.util.Arrays.fill(jArrCopyOf, length, iMax, androidx.media3.common.C.TIME_UNSET);
            return jArrCopyOf;
        }

        private static androidx.media3.common.AdPlaybackState.SkipInfo[] copySkipInfosWithSpaceForAdCount(androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr, int i3) {
            return (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(skipInfoArr, java.lang.Math.max(i3, skipInfoArr.length));
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i3) {
            int length = iArr.length;
            int iMax = java.lang.Math.max(i3, length);
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iMax);
            java.util.Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        @java.lang.Deprecated
        public static androidx.media3.common.AdPlaybackState.AdGroup fromBundle(android.os.Bundle bundle) {
            return fromBundle(bundle, 9);
        }

        private java.util.ArrayList<android.os.Bundle> getMediaItemsArrayBundles(int i3) {
            java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            int length = mediaItemArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                androidx.media3.common.MediaItem mediaItem = mediaItemArr[i9];
                arrayList.add(mediaItem == null ? null : mediaItem.toBundleIncludeLocalConfiguration(i3));
            }
            return arrayList;
        }

        private static androidx.media3.common.MediaItem[] getMediaItemsFromBundleArrays(java.util.ArrayList<android.os.Bundle> arrayList, java.util.ArrayList<android.net.Uri> arrayList2, int i3) {
            int i9 = 0;
            if (arrayList != null) {
                androidx.media3.common.MediaItem[] mediaItemArr = new androidx.media3.common.MediaItem[arrayList.size()];
                while (i9 < arrayList.size()) {
                    android.os.Bundle bundle = arrayList.get(i9);
                    mediaItemArr[i9] = bundle == null ? null : androidx.media3.common.MediaItem.fromBundle(bundle, i3);
                    i9++;
                }
                return mediaItemArr;
            }
            if (arrayList2 == null) {
                return new androidx.media3.common.MediaItem[0];
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = new androidx.media3.common.MediaItem[arrayList2.size()];
            while (i9 < arrayList2.size()) {
                android.net.Uri uri = arrayList2.get(i9);
                mediaItemArr2[i9] = uri == null ? null : androidx.media3.common.MediaItem.fromUri(uri);
                i9++;
            }
            return mediaItemArr2;
        }

        private java.util.ArrayList<android.os.Bundle> getSkipInfoArrayBundles() {
            java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            int length = skipInfoArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                androidx.media3.common.AdPlaybackState.SkipInfo skipInfo = skipInfoArr[i3];
                arrayList.add(skipInfo == null ? null : skipInfo.toBundle());
            }
            return arrayList;
        }

        private static androidx.media3.common.AdPlaybackState.SkipInfo[] getSkipInfosFromBundleArrays(java.util.List<android.os.Bundle> list) {
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = new androidx.media3.common.AdPlaybackState.SkipInfo[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                android.os.Bundle bundle = list.get(i3);
                skipInfoArr[i3] = bundle == null ? null : androidx.media3.common.AdPlaybackState.SkipInfo.fromBundle(bundle);
            }
            return skipInfoArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.common.AdPlaybackState.AdGroup withIsPlaceholder(boolean z6, boolean z9) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z9, this.ids, this.skipInfos, z6);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup copy() {
            long j = this.timeUs;
            int i3 = this.count;
            int i9 = this.originalCount;
            int[] iArr = this.states;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            androidx.media3.common.MediaItem[] mediaItemArr2 = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = this.durationsUs;
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, jArr.length);
            long j9 = this.contentResumeOffsetUs;
            boolean z6 = this.isServerSideInserted;
            java.lang.String[] strArr = this.ids;
            java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, i3, i9, iArrCopyOf, mediaItemArr2, jArrCopyOf, j9, z6, strArr2, (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(skipInfoArr, skipInfoArr.length), this.isPlaceholder);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.common.AdPlaybackState.AdGroup.class == obj.getClass()) {
                androidx.media3.common.AdPlaybackState.AdGroup adGroup = (androidx.media3.common.AdPlaybackState.AdGroup) obj;
                if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && java.util.Arrays.equals(this.mediaItems, adGroup.mediaItems) && java.util.Arrays.equals(this.states, adGroup.states) && java.util.Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted && java.util.Arrays.equals(this.ids, adGroup.ids) && java.util.Arrays.equals(this.skipInfos, adGroup.skipInfos) && this.isPlaceholder == adGroup.isPlaceholder) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getIndexOfAdId(java.lang.String str) {
            int i3 = 0;
            while (true) {
                java.lang.String[] strArr = this.ids;
                if (i3 >= strArr.length) {
                    return -1;
                }
                if (java.util.Objects.equals(strArr[i3], str)) {
                    return i3;
                }
                i3++;
            }
        }

        public int getNextAdIndexToPlay(int i3) {
            int i9;
            int i10 = i3 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i10 >= iArr.length || this.isServerSideInserted || (i9 = iArr[i10]) == 0 || i9 == 1) {
                    break;
                }
                i10++;
            }
            return i10;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i3 = 0; i3 < this.count; i3++) {
                int i9 = this.states[i3];
                if (i9 == 0 || i9 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i3 = ((this.count * 31) + this.originalCount) * 31;
            long j = this.timeUs;
            int iHashCode = (java.util.Arrays.hashCode(this.durationsUs) + ((java.util.Arrays.hashCode(this.states) + ((java.util.Arrays.hashCode(this.mediaItems) + ((i3 + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
            long j9 = this.contentResumeOffsetUs;
            return ((java.util.Arrays.hashCode(this.skipInfos) + ((((((iHashCode + ((int) ((j9 >>> 32) ^ j9))) * 31) + (this.isServerSideInserted ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.ids)) * 31)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder(boolean z6) {
            return this.isServerSideInserted == z6 && isLivePostrollPlaceholder();
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        @java.lang.Deprecated
        public android.os.Bundle toBundle() {
            return toBundle(9);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdCount(int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i3);
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, i3, this.originalCount, iArrCopyStatesWithSpaceForAdCount, (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, i3), jArrCopyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted, (java.lang.String[]) java.util.Arrays.copyOf(this.ids, i3), copySkipInfosWithSpaceForAdCount(this.skipInfos, i3), this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (length < mediaItemArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, mediaItemArr.length);
            } else if (this.count != -1 && jArr.length > mediaItemArr.length) {
                jArr = java.util.Arrays.copyOf(jArr, mediaItemArr.length);
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdId(java.lang.String str, int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = mediaItemArr;
            java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(this.ids, iArrCopyStatesWithSpaceForAdCount.length);
            strArr[i3] = str;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr, this.skipInfos, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdMediaItem(androidx.media3.common.MediaItem mediaItem, int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            androidx.media3.common.MediaItem[] mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, iArrCopyStatesWithSpaceForAdCount.length);
            mediaItemArr[i3] = mediaItem;
            iArrCopyStatesWithSpaceForAdCount[i3] = 1;
            java.lang.String[] strArr = this.ids;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (java.lang.String[]) java.util.Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            java.lang.String[] strArr2 = strArr;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = this.skipInfos;
            if (skipInfoArrCopySkipInfosWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(skipInfoArrCopySkipInfosWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdSkipInfo(androidx.media3.common.AdPlaybackState.SkipInfo skipInfo, int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = mediaItemArr;
            java.lang.String[] strArr = this.ids;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (java.lang.String[]) java.util.Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            java.lang.String[] strArr2 = strArr;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(this.skipInfos, iArrCopyStatesWithSpaceForAdCount.length);
            skipInfoArrCopySkipInfosWithSpaceForAdCount[i3] = skipInfo;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAdState(int i3, int i9) {
            int i10 = this.count;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i10 == -1 || i9 < i10);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i9 + 1);
            int i11 = iArrCopyStatesWithSpaceForAdCount[i9];
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i11 == 0 || i11 == 1 || i11 == i3);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = mediaItemArr;
            java.lang.String[] strArr = this.ids;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (java.lang.String[]) java.util.Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            java.lang.String[] strArr2 = strArr;
            iArrCopyStatesWithSpaceForAdCount[i9] = i3;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = this.skipInfos;
            if (skipInfoArrCopySkipInfosWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(skipInfoArrCopySkipInfosWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        @java.lang.Deprecated
        public androidx.media3.common.AdPlaybackState.AdGroup withAdUri(android.net.Uri uri, int i3) {
            return withAdMediaItem(androidx.media3.common.MediaItem.fromUri(uri), i3);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
            for (int i3 = 0; i3 < length; i3++) {
                int i9 = iArrCopyOf[i3];
                if (i9 == 3 || i9 == 2 || i9 == 4) {
                    iArrCopyOf[i3] = this.mediaItems[i3] == null ? 0 : 1;
                }
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, 0, this.originalCount, new int[0], new androidx.media3.common.MediaItem[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
            for (int i3 = 0; i3 < length; i3++) {
                int i9 = iArrCopyOf[i3];
                if (i9 == 1 || i9 == 0) {
                    iArrCopyOf[i3] = 2;
                }
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withContentResumeOffsetUs(long j) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, j, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withIsServerSideInserted(boolean z6) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z6, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length);
            androidx.media3.common.MediaItem[] mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, length);
            long[] jArrCopyOf = this.durationsUs;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, mediaItemArr, jArr, androidx.media3.common.util.Util.sum(jArr), this.isServerSideInserted, (java.lang.String[]) java.util.Arrays.copyOf(this.ids, length), (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(this.skipInfos, length), this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withOriginalAdCount(int i3) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, i3, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public androidx.media3.common.AdPlaybackState.AdGroup withTimeUs(long j) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup(long j) {
            this(j, -1, -1, new int[0], new androidx.media3.common.MediaItem[0], new long[0], 0L, false, new java.lang.String[0], new androidx.media3.common.AdPlaybackState.SkipInfo[0], false);
        }

        public static androidx.media3.common.AdPlaybackState.AdGroup fromBundle(android.os.Bundle bundle, int i3) {
            long j = bundle.getLong(FIELD_TIME_US);
            int i9 = bundle.getInt(FIELD_COUNT);
            int i10 = bundle.getInt(FIELD_ORIGINAL_COUNT);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_URIS);
            java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_MEDIA_ITEMS);
            int[] intArray = bundle.getIntArray(FIELD_STATES);
            long[] longArray = bundle.getLongArray(FIELD_DURATIONS_US);
            long j9 = bundle.getLong(FIELD_CONTENT_RESUME_OFFSET_US);
            boolean z6 = bundle.getBoolean(FIELD_IS_SERVER_SIDE_INSERTED);
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(FIELD_IDS);
            java.util.ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(FIELD_SKIP_INFOS);
            boolean z9 = bundle.getBoolean(FIELD_IS_PLACEHOLDER);
            if (intArray == null) {
                intArray = new int[0];
            }
            androidx.media3.common.MediaItem[] mediaItemsFromBundleArrays = getMediaItemsFromBundleArrays(parcelableArrayList2, parcelableArrayList, i3);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, i9, i10, intArray, mediaItemsFromBundleArrays, longArray, j9, z6, stringArrayList == null ? new java.lang.String[0] : (java.lang.String[]) stringArrayList.toArray(new java.lang.String[0]), parcelableArrayList3 == null ? new androidx.media3.common.AdPlaybackState.SkipInfo[0] : getSkipInfosFromBundleArrays(parcelableArrayList3), z9);
        }

        public boolean isLivePostrollPlaceholder() {
            return this.isPlaceholder && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public android.os.Bundle toBundle(int i3) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(FIELD_TIME_US, this.timeUs);
            bundle.putInt(FIELD_COUNT, this.count);
            bundle.putInt(FIELD_ORIGINAL_COUNT, this.originalCount);
            bundle.putParcelableArrayList(FIELD_URIS, new java.util.ArrayList<>(java.util.Arrays.asList(this.uris)));
            bundle.putParcelableArrayList(FIELD_MEDIA_ITEMS, getMediaItemsArrayBundles(i3));
            bundle.putIntArray(FIELD_STATES, this.states);
            bundle.putLongArray(FIELD_DURATIONS_US, this.durationsUs);
            bundle.putLong(FIELD_CONTENT_RESUME_OFFSET_US, this.contentResumeOffsetUs);
            bundle.putBoolean(FIELD_IS_SERVER_SIDE_INSERTED, this.isServerSideInserted);
            bundle.putStringArrayList(FIELD_IDS, new java.util.ArrayList<>(java.util.Arrays.asList(this.ids)));
            bundle.putParcelableArrayList(FIELD_SKIP_INFOS, getSkipInfoArrayBundles());
            bundle.putBoolean(FIELD_IS_PLACEHOLDER, this.isPlaceholder);
            return bundle;
        }

        private AdGroup(long j, int i3, int i9, int[] iArr, androidx.media3.common.MediaItem[] mediaItemArr, long[] jArr, long j9, boolean z6, java.lang.String[] strArr, androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr, boolean z9) {
            android.net.Uri uri;
            int i10 = 0;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(iArr.length == mediaItemArr.length);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(iArr.length == skipInfoArr.length);
            this.timeUs = j;
            this.count = i3;
            this.originalCount = i9;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j9;
            this.isServerSideInserted = z6;
            this.uris = new android.net.Uri[mediaItemArr.length];
            while (true) {
                android.net.Uri[] uriArr = this.uris;
                if (i10 < uriArr.length) {
                    androidx.media3.common.MediaItem mediaItem = mediaItemArr[i10];
                    if (mediaItem == null) {
                        uri = null;
                    } else {
                        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
                        localConfiguration.getClass();
                        uri = localConfiguration.uri;
                    }
                    uriArr[i10] = uri;
                    i10++;
                } else {
                    this.ids = strArr;
                    this.skipInfos = skipInfoArr;
                    this.isPlaceholder = z9;
                    return;
                }
            }
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class SkipInfo {
        public final java.lang.String labelId;
        public final long skipDurationUs;
        public final long skipOffsetUs;
        private static final java.lang.String FIELD_SKIP_OFFSET_US = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_SKIP_DURATION_US = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_LABEL_ID = androidx.media3.common.util.Util.intToStringMaxRadix(2);

        public SkipInfo(long j, long j9, java.lang.String str) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L((j == androidx.media3.common.C.TIME_UNSET && j9 == androidx.media3.common.C.TIME_UNSET && str == null) ? false : true);
            this.skipOffsetUs = j == androidx.media3.common.C.TIME_UNSET ? 0L : j;
            this.skipDurationUs = j9;
            this.labelId = str;
        }

        public static androidx.media3.common.AdPlaybackState.SkipInfo fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.common.AdPlaybackState.SkipInfo(bundle.getLong(FIELD_SKIP_OFFSET_US), bundle.getLong(FIELD_SKIP_DURATION_US), bundle.getString(FIELD_LABEL_ID));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.common.AdPlaybackState.SkipInfo.class == obj.getClass()) {
                androidx.media3.common.AdPlaybackState.SkipInfo skipInfo = (androidx.media3.common.AdPlaybackState.SkipInfo) obj;
                if (this.skipOffsetUs == skipInfo.skipOffsetUs && this.skipDurationUs == skipInfo.skipDurationUs && java.util.Objects.equals(this.labelId, skipInfo.labelId)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return java.util.Objects.hash(java.lang.Long.valueOf(this.skipOffsetUs), java.lang.Long.valueOf(this.skipDurationUs), this.labelId);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(FIELD_SKIP_OFFSET_US, this.skipOffsetUs);
            bundle.putLong(FIELD_SKIP_DURATION_US, this.skipDurationUs);
            bundle.putString(FIELD_LABEL_ID, this.labelId);
            return bundle;
        }
    }

    public AdPlaybackState(java.lang.Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, androidx.media3.common.C.TIME_UNSET, 0);
    }

    private static androidx.media3.common.AdPlaybackState.AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[length];
        for (int i3 = 0; i3 < length; i3++) {
            adGroupArr[i3] = new androidx.media3.common.AdPlaybackState.AdGroup(jArr[i3]);
        }
        return adGroupArr;
    }

    public static androidx.media3.common.AdPlaybackState fromAdPlaybackState(java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
        int i3 = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[i3];
        int i9 = 0;
        while (i9 < i3) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.adGroups[i9];
            long j = adGroup.timeUs;
            int i10 = adGroup.count;
            int i11 = adGroup.originalCount;
            int[] iArr = adGroup.states;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            androidx.media3.common.MediaItem[] mediaItemArr = adGroup.mediaItems;
            androidx.media3.common.MediaItem[] mediaItemArr2 = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = adGroup.durationsUs;
            adGroupArr[i9] = new androidx.media3.common.AdPlaybackState.AdGroup(j, i10, i11, iArrCopyOf, mediaItemArr2, java.util.Arrays.copyOf(jArr, jArr.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted, adGroup.ids, adGroup.skipInfos, adGroup.isPlaceholder);
            i9++;
            i3 = i3;
        }
        return new androidx.media3.common.AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    @java.lang.Deprecated
    public static androidx.media3.common.AdPlaybackState fromBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    private boolean isPositionBeforeAdGroup(long j, long j9, int i3) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = getAdGroup(i3);
        long j10 = adGroup.timeUs;
        if (j10 == Long.MIN_VALUE) {
            return j9 == androidx.media3.common.C.TIME_UNSET || adGroup.isLivePostrollPlaceholder() || j < j9;
        }
        return j < j10;
    }

    public androidx.media3.common.AdPlaybackState copy() {
        int length = this.adGroups.length;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[length];
        for (int i3 = 0; i3 < length; i3++) {
            adGroupArr[i3] = this.adGroups[i3].copy();
        }
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i3 = this.adGroupCount - 1;
        return i3 >= 0 && isLivePostrollPlaceholder(i3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.AdPlaybackState.class == obj.getClass()) {
            androidx.media3.common.AdPlaybackState adPlaybackState = (androidx.media3.common.AdPlaybackState) obj;
            if (java.util.Objects.equals(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && java.util.Arrays.equals(this.adGroups, adPlaybackState.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.common.AdPlaybackState.AdGroup getAdGroup(int i3) {
        int i9 = this.removedAdGroupCount;
        return i3 < i9 ? REMOVED_AD_GROUP : this.adGroups[i3 - i9];
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j9) {
        if (j != Long.MIN_VALUE && (j9 == androidx.media3.common.C.TIME_UNSET || j < j9)) {
            int i3 = this.removedAdGroupCount;
            while (i3 < this.adGroupCount && ((getAdGroup(i3).timeUs != Long.MIN_VALUE && getAdGroup(i3).timeUs <= j) || !getAdGroup(i3).shouldPlayAdGroup())) {
                i3++;
            }
            if (i3 < this.adGroupCount && (j9 == androidx.media3.common.C.TIME_UNSET || getAdGroup(i3).timeUs <= j9)) {
                return i3;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j, long j9) {
        int i3 = this.adGroupCount - 1;
        int i9 = i3 - (isLivePostrollPlaceholder(i3) ? 1 : 0);
        while (i9 >= 0) {
            long j10 = j;
            long j11 = j9;
            if (!isPositionBeforeAdGroup(j10, j11, i9)) {
                break;
            }
            i9--;
            j = j10;
            j9 = j11;
        }
        if (i9 < 0 || !getAdGroup(i9).hasUnplayedAds()) {
            return -1;
        }
        return i9;
    }

    public int getAdIndexOfAdId(int i3, java.lang.String str) {
        return getAdGroup(i3).getIndexOfAdId(str);
    }

    public int hashCode() {
        int i3 = this.adGroupCount * 31;
        java.lang.Object obj = this.adsId;
        return java.util.Arrays.hashCode(this.adGroups) + ((((((((i3 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31);
    }

    public boolean isAdInErrorState(int i3, int i9) {
        androidx.media3.common.AdPlaybackState.AdGroup adGroup;
        int i10;
        return i3 < this.adGroupCount && (i10 = (adGroup = getAdGroup(i3)).count) != -1 && i9 < i10 && adGroup.states[i9] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i3) {
        return i3 == this.adGroupCount - 1 && getAdGroup(i3).isLivePostrollPlaceholder();
    }

    @java.lang.Deprecated
    public android.os.Bundle toBundle() {
        return toBundle(9);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.adsId);
        sb.append(", adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i3 = 0; i3 < this.adGroups.length; i3++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.adGroups[i3].timeUs);
            sb.append(", ads=[");
            for (int i9 = 0; i9 < this.adGroups[i3].states.length; i9++) {
                sb.append("ad(state=");
                int i10 = this.adGroups[i3].states[i9];
                if (i10 == 0) {
                    sb.append('_');
                } else if (i10 == 1) {
                    sb.append('R');
                } else if (i10 == 2) {
                    sb.append('S');
                } else if (i10 == 3) {
                    sb.append('P');
                } else if (i10 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.adGroups[i3].durationsUs[i9]);
                sb.append(')');
                if (i9 < this.adGroups[i3].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i3 < this.adGroups.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public androidx.media3.common.AdPlaybackState withAdCount(int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i9 > 0);
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i10].count == i9) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = this.adGroups[i10].withAdCount(i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdDurationsUs(long[][] jArr) {
        int i3 = 0;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(jArr.length == this.adGroupCount);
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        while (true) {
            int i9 = this.adGroupCount;
            int i10 = this.removedAdGroupCount;
            if (i3 >= i9 - i10) {
                return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, i10);
            }
            adGroupArr2[i3] = adGroupArr2[i3].withAdDurationsUs(jArr[i10 + i3]);
            i3++;
        }
    }

    public androidx.media3.common.AdPlaybackState withAdGroupTimeUs(int i3, long j) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = this.adGroups[i9].withTimeUs(j);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdId(int i3, int i9, java.lang.String str) {
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdId(str, i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdLoadError(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(4, i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdResumePositionUs(long j) {
        return this.adResumePositionUs == j ? this : new androidx.media3.common.AdPlaybackState(this.adsId, this.adGroups, j, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdSkipInfo(int i3, int i9, androidx.media3.common.AdPlaybackState.SkipInfo skipInfo) {
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdSkipInfo(skipInfo, i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAdsId(java.lang.Object obj) {
        return new androidx.media3.common.AdPlaybackState(obj, this.adGroups, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withAvailableAd(int i3, int i9) {
        return withAvailableAdMediaItem(i3, i9, androidx.media3.common.MediaItem.fromUri(android.net.Uri.EMPTY));
    }

    public androidx.media3.common.AdPlaybackState withAvailableAdMediaItem(int i3, int i9, androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(adGroupArr2[i10].isServerSideInserted || !((localConfiguration = mediaItem.localConfiguration) == null || localConfiguration.uri.equals(android.net.Uri.EMPTY)));
        adGroupArr2[i10] = adGroupArr2[i10].withAdMediaItem(mediaItem, i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @java.lang.Deprecated
    public androidx.media3.common.AdPlaybackState withAvailableAdUri(int i3, int i9, android.net.Uri uri) {
        return withAvailableAdMediaItem(i3, i9, androidx.media3.common.MediaItem.fromUri(uri));
    }

    public androidx.media3.common.AdPlaybackState withContentDurationUs(long j) {
        return this.contentDurationUs == j ? this : new androidx.media3.common.AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withContentResumeOffsetUs(int i3, long j) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i9].contentResumeOffsetUs == j) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withContentResumeOffsetUs(j);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withIsPlaceholder(int i3, boolean z6, boolean z9) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = adGroupArr[i9];
        if (adGroup.isPlaceholder == z6 && adGroup.isServerSideInserted == z9) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withIsPlaceholder(z6, z9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withIsServerSideInserted(int i3, boolean z6) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i9].isServerSideInserted == z6) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withIsServerSideInserted(z6);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withLastAdRemoved(int i3) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withLastAdRemoved();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @java.lang.Deprecated
    public androidx.media3.common.AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    public androidx.media3.common.AdPlaybackState withNewAdGroup(int i3, long j) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = new androidx.media3.common.AdPlaybackState.AdGroup(j);
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayAppend(this.adGroups, adGroup);
        java.lang.System.arraycopy(adGroupArr, i9, adGroupArr, i9 + 1, this.adGroups.length - i9);
        adGroupArr[i9] = adGroup;
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withOriginalAdCount(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i10].originalCount == i9) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withOriginalAdCount(i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withPlayedAd(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(3, i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withRemovedAdGroupCount(int i3) {
        int i9 = this.removedAdGroupCount;
        if (i9 == i3) {
            return this;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 > i9);
        int i10 = this.adGroupCount - i3;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[i10];
        java.lang.System.arraycopy(this.adGroups, i3 - this.removedAdGroupCount, adGroupArr, 0, i10);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i3);
    }

    public androidx.media3.common.AdPlaybackState withRemovedAdGroupCountBefore(long j) {
        int i3 = this.removedAdGroupCount;
        while (i3 < this.adGroupCount) {
            long j9 = getAdGroup(i3).timeUs;
            if (j <= j9 || j9 == Long.MIN_VALUE) {
                break;
            }
            i3++;
        }
        return withRemovedAdGroupCount(i3);
    }

    public androidx.media3.common.AdPlaybackState withResetAdGroup(int i3) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAllAdsReset();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withSkippedAd(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(2, i9);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public androidx.media3.common.AdPlaybackState withSkippedAdGroup(int i3) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAllAdsSkipped();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public static androidx.media3.common.AdPlaybackState fromBundle(android.os.Bundle bundle, int i3) {
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_AD_GROUPS);
        if (parcelableArrayList == null) {
            adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[0];
        } else {
            androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = new androidx.media3.common.AdPlaybackState.AdGroup[parcelableArrayList.size()];
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                adGroupArr2[i9] = androidx.media3.common.AdPlaybackState.AdGroup.fromBundle((android.os.Bundle) parcelableArrayList.get(i9), i3);
            }
            adGroupArr = adGroupArr2;
        }
        java.lang.String str = FIELD_AD_RESUME_POSITION_US;
        androidx.media3.common.AdPlaybackState adPlaybackState = NONE;
        return new androidx.media3.common.AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(FIELD_CONTENT_DURATION_US, adPlaybackState.contentDurationUs), bundle.getInt(FIELD_REMOVED_AD_GROUP_COUNT, adPlaybackState.removedAdGroupCount));
    }

    public boolean isLivePostrollPlaceholder(int i3, boolean z6) {
        return i3 == this.adGroupCount - 1 && getAdGroup(i3).isLivePostrollPlaceholder(z6);
    }

    public android.os.Bundle toBundle(int i3) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        for (androidx.media3.common.AdPlaybackState.AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle(i3));
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_AD_GROUPS, arrayList);
        }
        long j = this.adResumePositionUs;
        androidx.media3.common.AdPlaybackState adPlaybackState = NONE;
        if (j != adPlaybackState.adResumePositionUs) {
            bundle.putLong(FIELD_AD_RESUME_POSITION_US, j);
        }
        long j9 = this.contentDurationUs;
        if (j9 != adPlaybackState.contentDurationUs) {
            bundle.putLong(FIELD_CONTENT_DURATION_US, j9);
        }
        int i9 = this.removedAdGroupCount;
        if (i9 != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(FIELD_REMOVED_AD_GROUP_COUNT, i9);
        }
        return bundle;
    }

    public androidx.media3.common.AdPlaybackState withLivePostrollPlaceholderAppended(boolean z6) {
        return withNewAdGroup(this.adGroupCount, Long.MIN_VALUE).withIsPlaceholder(this.adGroupCount, true, z6);
    }

    private AdPlaybackState(java.lang.Object obj, androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr, long j, long j9, int i3) {
        this.adsId = obj;
        this.adResumePositionUs = j;
        this.contentDurationUs = j9;
        this.adGroupCount = adGroupArr.length + i3;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i3;
    }

    public boolean endsWithLivePostrollPlaceHolder(boolean z6) {
        int i3 = this.adGroupCount - 1;
        return i3 >= 0 && isLivePostrollPlaceholder(i3, z6);
    }

    public androidx.media3.common.AdPlaybackState withAdDurationsUs(int i3, long... jArr) {
        int i9 = i3 - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAdDurationsUs(jArr);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }
}
