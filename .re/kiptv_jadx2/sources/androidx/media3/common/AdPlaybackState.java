package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, C.TIME_UNSET, 0);
    private static final AdGroup REMOVED_AD_GROUP = new AdGroup(0).withAdCount(0);
    private static final String FIELD_AD_GROUPS = Util.intToStringMaxRadix(1);
    private static final String FIELD_AD_RESUME_POSITION_US = Util.intToStringMaxRadix(2);
    private static final String FIELD_CONTENT_DURATION_US = Util.intToStringMaxRadix(3);
    private static final String FIELD_REMOVED_AD_GROUP_COUNT = Util.intToStringMaxRadix(4);

    public static final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final String[] ids;
        public final boolean isPlaceholder;
        public final boolean isServerSideInserted;
        public final MediaItem[] mediaItems;
        public final int originalCount;
        public final SkipInfo[] skipInfos;
        public final int[] states;
        public final long timeUs;

        @Deprecated
        public final Uri[] uris;
        private static final String FIELD_TIME_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_COUNT = Util.intToStringMaxRadix(1);
        private static final String FIELD_URIS = Util.intToStringMaxRadix(2);
        private static final String FIELD_STATES = Util.intToStringMaxRadix(3);
        private static final String FIELD_DURATIONS_US = Util.intToStringMaxRadix(4);
        private static final String FIELD_CONTENT_RESUME_OFFSET_US = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_SERVER_SIDE_INSERTED = Util.intToStringMaxRadix(6);
        private static final String FIELD_ORIGINAL_COUNT = Util.intToStringMaxRadix(7);
        static final String FIELD_MEDIA_ITEMS = Util.intToStringMaxRadix(8);
        static final String FIELD_IDS = Util.intToStringMaxRadix(9);
        static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(10);
        private static final String FIELD_SKIP_INFOS = Util.intToStringMaxRadix(11);

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i3) {
            int length = jArr.length;
            int iMax = Math.max(i3, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        private static SkipInfo[] copySkipInfosWithSpaceForAdCount(SkipInfo[] skipInfoArr, int i3) {
            return (SkipInfo[]) Arrays.copyOf(skipInfoArr, Math.max(i3, skipInfoArr.length));
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i3) {
            int length = iArr.length;
            int iMax = Math.max(i3, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        @Deprecated
        public static AdGroup fromBundle(Bundle bundle) {
            return fromBundle(bundle, 9);
        }

        private ArrayList<Bundle> getMediaItemsArrayBundles(int i3) {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            MediaItem[] mediaItemArr = this.mediaItems;
            int length = mediaItemArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                MediaItem mediaItem = mediaItemArr[i9];
                arrayList.add(mediaItem == null ? null : mediaItem.toBundleIncludeLocalConfiguration(i3));
            }
            return arrayList;
        }

        private static MediaItem[] getMediaItemsFromBundleArrays(ArrayList<Bundle> arrayList, ArrayList<Uri> arrayList2, int i3) {
            int i9 = 0;
            if (arrayList != null) {
                MediaItem[] mediaItemArr = new MediaItem[arrayList.size()];
                while (i9 < arrayList.size()) {
                    Bundle bundle = arrayList.get(i9);
                    mediaItemArr[i9] = bundle == null ? null : MediaItem.fromBundle(bundle, i3);
                    i9++;
                }
                return mediaItemArr;
            }
            if (arrayList2 == null) {
                return new MediaItem[0];
            }
            MediaItem[] mediaItemArr2 = new MediaItem[arrayList2.size()];
            while (i9 < arrayList2.size()) {
                Uri uri = arrayList2.get(i9);
                mediaItemArr2[i9] = uri == null ? null : MediaItem.fromUri(uri);
                i9++;
            }
            return mediaItemArr2;
        }

        private ArrayList<Bundle> getSkipInfoArrayBundles() {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            SkipInfo[] skipInfoArr = this.skipInfos;
            int length = skipInfoArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                SkipInfo skipInfo = skipInfoArr[i3];
                arrayList.add(skipInfo == null ? null : skipInfo.toBundle());
            }
            return arrayList;
        }

        private static SkipInfo[] getSkipInfosFromBundleArrays(List<Bundle> list) {
            SkipInfo[] skipInfoArr = new SkipInfo[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                Bundle bundle = list.get(i3);
                skipInfoArr[i3] = bundle == null ? null : SkipInfo.fromBundle(bundle);
            }
            return skipInfoArr;
        }

        public AdGroup withIsPlaceholder(boolean z6, boolean z9) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z9, this.ids, this.skipInfos, z6);
        }

        public AdGroup copy() {
            long j = this.timeUs;
            int i3 = this.count;
            int i9 = this.originalCount;
            int[] iArr = this.states;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            MediaItem[] mediaItemArr = this.mediaItems;
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = this.durationsUs;
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            long j9 = this.contentResumeOffsetUs;
            boolean z6 = this.isServerSideInserted;
            String[] strArr = this.ids;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            SkipInfo[] skipInfoArr = this.skipInfos;
            return new AdGroup(j, i3, i9, iArrCopyOf, mediaItemArr2, jArrCopyOf, j9, z6, strArr2, (SkipInfo[]) Arrays.copyOf(skipInfoArr, skipInfoArr.length), this.isPlaceholder);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AdGroup.class == obj.getClass()) {
                AdGroup adGroup = (AdGroup) obj;
                if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.mediaItems, adGroup.mediaItems) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted && Arrays.equals(this.ids, adGroup.ids) && Arrays.equals(this.skipInfos, adGroup.skipInfos) && this.isPlaceholder == adGroup.isPlaceholder) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getIndexOfAdId(String str) {
            int i3 = 0;
            while (true) {
                String[] strArr = this.ids;
                if (i3 >= strArr.length) {
                    return -1;
                }
                if (Objects.equals(strArr[i3], str)) {
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
            int iHashCode = (Arrays.hashCode(this.durationsUs) + ((Arrays.hashCode(this.states) + ((Arrays.hashCode(this.mediaItems) + ((i3 + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
            long j9 = this.contentResumeOffsetUs;
            return ((Arrays.hashCode(this.skipInfos) + ((((((iHashCode + ((int) ((j9 >>> 32) ^ j9))) * 31) + (this.isServerSideInserted ? 1 : 0)) * 31) + Arrays.hashCode(this.ids)) * 31)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder(boolean z6) {
            return this.isServerSideInserted == z6 && isLivePostrollPlaceholder();
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        @Deprecated
        public Bundle toBundle() {
            return toBundle(9);
        }

        public AdGroup withAdCount(int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i3);
            return new AdGroup(this.timeUs, i3, this.originalCount, iArrCopyStatesWithSpaceForAdCount, (MediaItem[]) Arrays.copyOf(this.mediaItems, i3), jArrCopyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, i3), copySkipInfosWithSpaceForAdCount(this.skipInfos, i3), this.isPlaceholder);
        }

        public AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (length < mediaItemArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, mediaItemArr.length);
            } else if (this.count != -1 && jArr.length > mediaItemArr.length) {
                jArr = Arrays.copyOf(jArr, mediaItemArr.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAdId(String str, int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = (String[]) Arrays.copyOf(this.ids, iArrCopyStatesWithSpaceForAdCount.length);
            strArr[i3] = str;
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAdMediaItem(MediaItem mediaItem, int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(this.mediaItems, iArrCopyStatesWithSpaceForAdCount.length);
            mediaItemArr[i3] = mediaItem;
            iArrCopyStatesWithSpaceForAdCount[i3] = 1;
            String[] strArr = this.ids;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = this.skipInfos;
            if (skipInfoArrCopySkipInfosWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(skipInfoArrCopySkipInfosWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        public AdGroup withAdSkipInfo(SkipInfo skipInfo, int i3) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(this.skipInfos, iArrCopyStatesWithSpaceForAdCount.length);
            skipInfoArrCopySkipInfosWithSpaceForAdCount[i3] = skipInfo;
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        public AdGroup withAdState(int i3, int i9) {
            int i10 = this.count;
            AbstractC1864o0.L(i10 == -1 || i9 < i10);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i9 + 1);
            int i11 = iArrCopyStatesWithSpaceForAdCount[i9];
            AbstractC1864o0.L(i11 == 0 || i11 == 1 || i11 == i3);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            iArrCopyStatesWithSpaceForAdCount[i9] = i3;
            SkipInfo[] skipInfoArrCopySkipInfosWithSpaceForAdCount = this.skipInfos;
            if (skipInfoArrCopySkipInfosWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                skipInfoArrCopySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(skipInfoArrCopySkipInfosWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, iArrCopyStatesWithSpaceForAdCount, mediaItemArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArrCopySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        @Deprecated
        public AdGroup withAdUri(Uri uri, int i3) {
            return withAdMediaItem(MediaItem.fromUri(uri), i3);
        }

        public AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i3 = 0; i3 < length; i3++) {
                int i9 = iArrCopyOf[i3];
                if (i9 == 3 || i9 == 2 || i9 == 4) {
                    iArrCopyOf[i3] = this.mediaItems[i3] == null ? 0 : 1;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(this.timeUs, 0, this.originalCount, new int[0], new MediaItem[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i3 = 0; i3 < length; i3++) {
                int i9 = iArrCopyOf[i3];
                if (i9 == 1 || i9 == 0) {
                    iArrCopyOf[i3] = 2;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withContentResumeOffsetUs(long j) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, j, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withIsServerSideInserted(boolean z6) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z6, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(this.mediaItems, length);
            long[] jArrCopyOf = this.durationsUs;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new AdGroup(this.timeUs, length, this.originalCount, iArrCopyOf, mediaItemArr, jArr, Util.sum(jArr), this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, length), (SkipInfo[]) Arrays.copyOf(this.skipInfos, length), this.isPlaceholder);
        }

        public AdGroup withOriginalAdCount(int i3) {
            return new AdGroup(this.timeUs, this.count, i3, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withTimeUs(long j) {
            return new AdGroup(j, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup(long j) {
            this(j, -1, -1, new int[0], new MediaItem[0], new long[0], 0L, false, new String[0], new SkipInfo[0], false);
        }

        public static AdGroup fromBundle(Bundle bundle, int i3) {
            long j = bundle.getLong(FIELD_TIME_US);
            int i9 = bundle.getInt(FIELD_COUNT);
            int i10 = bundle.getInt(FIELD_ORIGINAL_COUNT);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_URIS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_MEDIA_ITEMS);
            int[] intArray = bundle.getIntArray(FIELD_STATES);
            long[] longArray = bundle.getLongArray(FIELD_DURATIONS_US);
            long j9 = bundle.getLong(FIELD_CONTENT_RESUME_OFFSET_US);
            boolean z6 = bundle.getBoolean(FIELD_IS_SERVER_SIDE_INSERTED);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(FIELD_IDS);
            ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(FIELD_SKIP_INFOS);
            boolean z9 = bundle.getBoolean(FIELD_IS_PLACEHOLDER);
            if (intArray == null) {
                intArray = new int[0];
            }
            MediaItem[] mediaItemsFromBundleArrays = getMediaItemsFromBundleArrays(parcelableArrayList2, parcelableArrayList, i3);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new AdGroup(j, i9, i10, intArray, mediaItemsFromBundleArrays, longArray, j9, z6, stringArrayList == null ? new String[0] : (String[]) stringArrayList.toArray(new String[0]), parcelableArrayList3 == null ? new SkipInfo[0] : getSkipInfosFromBundleArrays(parcelableArrayList3), z9);
        }

        public boolean isLivePostrollPlaceholder() {
            return this.isPlaceholder && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public Bundle toBundle(int i3) {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_TIME_US, this.timeUs);
            bundle.putInt(FIELD_COUNT, this.count);
            bundle.putInt(FIELD_ORIGINAL_COUNT, this.originalCount);
            bundle.putParcelableArrayList(FIELD_URIS, new ArrayList<>(Arrays.asList(this.uris)));
            bundle.putParcelableArrayList(FIELD_MEDIA_ITEMS, getMediaItemsArrayBundles(i3));
            bundle.putIntArray(FIELD_STATES, this.states);
            bundle.putLongArray(FIELD_DURATIONS_US, this.durationsUs);
            bundle.putLong(FIELD_CONTENT_RESUME_OFFSET_US, this.contentResumeOffsetUs);
            bundle.putBoolean(FIELD_IS_SERVER_SIDE_INSERTED, this.isServerSideInserted);
            bundle.putStringArrayList(FIELD_IDS, new ArrayList<>(Arrays.asList(this.ids)));
            bundle.putParcelableArrayList(FIELD_SKIP_INFOS, getSkipInfoArrayBundles());
            bundle.putBoolean(FIELD_IS_PLACEHOLDER, this.isPlaceholder);
            return bundle;
        }

        private AdGroup(long j, int i3, int i9, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, long j9, boolean z6, String[] strArr, SkipInfo[] skipInfoArr, boolean z9) {
            Uri uri;
            int i10 = 0;
            AbstractC1864o0.L(iArr.length == mediaItemArr.length);
            AbstractC1864o0.L(iArr.length == skipInfoArr.length);
            this.timeUs = j;
            this.count = i3;
            this.originalCount = i9;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j9;
            this.isServerSideInserted = z6;
            this.uris = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.uris;
                if (i10 < uriArr.length) {
                    MediaItem mediaItem = mediaItemArr[i10];
                    if (mediaItem == null) {
                        uri = null;
                    } else {
                        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
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

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class SkipInfo {
        public final String labelId;
        public final long skipDurationUs;
        public final long skipOffsetUs;
        private static final String FIELD_SKIP_OFFSET_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_SKIP_DURATION_US = Util.intToStringMaxRadix(1);
        private static final String FIELD_LABEL_ID = Util.intToStringMaxRadix(2);

        public SkipInfo(long j, long j9, String str) {
            AbstractC1864o0.L((j == C.TIME_UNSET && j9 == C.TIME_UNSET && str == null) ? false : true);
            this.skipOffsetUs = j == C.TIME_UNSET ? 0L : j;
            this.skipDurationUs = j9;
            this.labelId = str;
        }

        public static SkipInfo fromBundle(Bundle bundle) {
            return new SkipInfo(bundle.getLong(FIELD_SKIP_OFFSET_US), bundle.getLong(FIELD_SKIP_DURATION_US), bundle.getString(FIELD_LABEL_ID));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SkipInfo.class == obj.getClass()) {
                SkipInfo skipInfo = (SkipInfo) obj;
                if (this.skipOffsetUs == skipInfo.skipOffsetUs && this.skipDurationUs == skipInfo.skipDurationUs && Objects.equals(this.labelId, skipInfo.labelId)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.skipOffsetUs), Long.valueOf(this.skipDurationUs), this.labelId);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_SKIP_OFFSET_US, this.skipOffsetUs);
            bundle.putLong(FIELD_SKIP_DURATION_US, this.skipDurationUs);
            bundle.putString(FIELD_LABEL_ID, this.labelId);
            return bundle;
        }
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, C.TIME_UNSET, 0);
    }

    private static AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i3 = 0; i3 < length; i3++) {
            adGroupArr[i3] = new AdGroup(jArr[i3]);
        }
        return adGroupArr;
    }

    public static AdPlaybackState fromAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
        int i3 = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        AdGroup[] adGroupArr = new AdGroup[i3];
        int i9 = 0;
        while (i9 < i3) {
            AdGroup adGroup = adPlaybackState.adGroups[i9];
            long j = adGroup.timeUs;
            int i10 = adGroup.count;
            int i11 = adGroup.originalCount;
            int[] iArr = adGroup.states;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            MediaItem[] mediaItemArr = adGroup.mediaItems;
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = adGroup.durationsUs;
            adGroupArr[i9] = new AdGroup(j, i10, i11, iArrCopyOf, mediaItemArr2, Arrays.copyOf(jArr, jArr.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted, adGroup.ids, adGroup.skipInfos, adGroup.isPlaceholder);
            i9++;
            i3 = i3;
        }
        return new AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    @Deprecated
    public static AdPlaybackState fromBundle(Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    private boolean isPositionBeforeAdGroup(long j, long j9, int i3) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        AdGroup adGroup = getAdGroup(i3);
        long j10 = adGroup.timeUs;
        if (j10 == Long.MIN_VALUE) {
            return j9 == C.TIME_UNSET || adGroup.isLivePostrollPlaceholder() || j < j9;
        }
        return j < j10;
    }

    public AdPlaybackState copy() {
        int length = this.adGroups.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i3 = 0; i3 < length; i3++) {
            adGroupArr[i3] = this.adGroups[i3].copy();
        }
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i3 = this.adGroupCount - 1;
        return i3 >= 0 && isLivePostrollPlaceholder(i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdPlaybackState.class == obj.getClass()) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
            if (Objects.equals(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public AdGroup getAdGroup(int i3) {
        int i9 = this.removedAdGroupCount;
        return i3 < i9 ? REMOVED_AD_GROUP : this.adGroups[i3 - i9];
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j9) {
        if (j != Long.MIN_VALUE && (j9 == C.TIME_UNSET || j < j9)) {
            int i3 = this.removedAdGroupCount;
            while (i3 < this.adGroupCount && ((getAdGroup(i3).timeUs != Long.MIN_VALUE && getAdGroup(i3).timeUs <= j) || !getAdGroup(i3).shouldPlayAdGroup())) {
                i3++;
            }
            if (i3 < this.adGroupCount && (j9 == C.TIME_UNSET || getAdGroup(i3).timeUs <= j9)) {
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

    public int getAdIndexOfAdId(int i3, String str) {
        return getAdGroup(i3).getIndexOfAdId(str);
    }

    public int hashCode() {
        int i3 = this.adGroupCount * 31;
        Object obj = this.adsId;
        return Arrays.hashCode(this.adGroups) + ((((((((i3 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31);
    }

    public boolean isAdInErrorState(int i3, int i9) {
        AdGroup adGroup;
        int i10;
        return i3 < this.adGroupCount && (i10 = (adGroup = getAdGroup(i3)).count) != -1 && i9 < i10 && adGroup.states[i9] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i3) {
        return i3 == this.adGroupCount - 1 && getAdGroup(i3).isLivePostrollPlaceholder();
    }

    @Deprecated
    public Bundle toBundle() {
        return toBundle(9);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
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

    public AdPlaybackState withAdCount(int i3, int i9) {
        AbstractC1864o0.L(i9 > 0);
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i10].count == i9) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = this.adGroups[i10].withAdCount(i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        int i3 = 0;
        AbstractC1864o0.L(jArr.length == this.adGroupCount);
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        while (true) {
            int i9 = this.adGroupCount;
            int i10 = this.removedAdGroupCount;
            if (i3 >= i9 - i10) {
                return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, i10);
            }
            adGroupArr2[i3] = adGroupArr2[i3].withAdDurationsUs(jArr[i10 + i3]);
            i3++;
        }
    }

    public AdPlaybackState withAdGroupTimeUs(int i3, long j) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = this.adGroups[i9].withTimeUs(j);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdId(int i3, int i9, String str) {
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdId(str, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdLoadError(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(4, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdResumePositionUs(long j) {
        return this.adResumePositionUs == j ? this : new AdPlaybackState(this.adsId, this.adGroups, j, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdSkipInfo(int i3, int i9, SkipInfo skipInfo) {
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdSkipInfo(skipInfo, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdsId(Object obj) {
        return new AdPlaybackState(obj, this.adGroups, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAvailableAd(int i3, int i9) {
        return withAvailableAdMediaItem(i3, i9, MediaItem.fromUri(Uri.EMPTY));
    }

    public AdPlaybackState withAvailableAdMediaItem(int i3, int i9, MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration;
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        AbstractC1864o0.Y(adGroupArr2[i10].isServerSideInserted || !((localConfiguration = mediaItem.localConfiguration) == null || localConfiguration.uri.equals(Uri.EMPTY)));
        adGroupArr2[i10] = adGroupArr2[i10].withAdMediaItem(mediaItem, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public AdPlaybackState withAvailableAdUri(int i3, int i9, Uri uri) {
        return withAvailableAdMediaItem(i3, i9, MediaItem.fromUri(uri));
    }

    public AdPlaybackState withContentDurationUs(long j) {
        return this.contentDurationUs == j ? this : new AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j, this.removedAdGroupCount);
    }

    public AdPlaybackState withContentResumeOffsetUs(int i3, long j) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i9].contentResumeOffsetUs == j) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withContentResumeOffsetUs(j);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withIsPlaceholder(int i3, boolean z6, boolean z9) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup adGroup = adGroupArr[i9];
        if (adGroup.isPlaceholder == z6 && adGroup.isServerSideInserted == z9) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withIsPlaceholder(z6, z9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withIsServerSideInserted(int i3, boolean z6) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i9].isServerSideInserted == z6) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withIsServerSideInserted(z6);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withLastAdRemoved(int i3) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withLastAdRemoved();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    public AdPlaybackState withNewAdGroup(int i3, long j) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup adGroup = new AdGroup(j);
        AdGroup[] adGroupArr = (AdGroup[]) Util.nullSafeArrayAppend(this.adGroups, adGroup);
        System.arraycopy(adGroupArr, i9, adGroupArr, i9 + 1, this.adGroups.length - i9);
        adGroupArr[i9] = adGroup;
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withOriginalAdCount(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i10].originalCount == i9) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withOriginalAdCount(i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withPlayedAd(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(3, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withRemovedAdGroupCount(int i3) {
        int i9 = this.removedAdGroupCount;
        if (i9 == i3) {
            return this;
        }
        AbstractC1864o0.L(i3 > i9);
        int i10 = this.adGroupCount - i3;
        AdGroup[] adGroupArr = new AdGroup[i10];
        System.arraycopy(this.adGroups, i3 - this.removedAdGroupCount, adGroupArr, 0, i10);
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i3);
    }

    public AdPlaybackState withRemovedAdGroupCountBefore(long j) {
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

    public AdPlaybackState withResetAdGroup(int i3) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAllAdsReset();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAd(int i3, int i9) {
        int i10 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(2, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAdGroup(int i3) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public static AdPlaybackState fromBundle(Bundle bundle, int i3) {
        AdGroup[] adGroupArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_AD_GROUPS);
        if (parcelableArrayList == null) {
            adGroupArr = new AdGroup[0];
        } else {
            AdGroup[] adGroupArr2 = new AdGroup[parcelableArrayList.size()];
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                adGroupArr2[i9] = AdGroup.fromBundle((Bundle) parcelableArrayList.get(i9), i3);
            }
            adGroupArr = adGroupArr2;
        }
        String str = FIELD_AD_RESUME_POSITION_US;
        AdPlaybackState adPlaybackState = NONE;
        return new AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(FIELD_CONTENT_DURATION_US, adPlaybackState.contentDurationUs), bundle.getInt(FIELD_REMOVED_AD_GROUP_COUNT, adPlaybackState.removedAdGroupCount));
    }

    public boolean isLivePostrollPlaceholder(int i3, boolean z6) {
        return i3 == this.adGroupCount - 1 && getAdGroup(i3).isLivePostrollPlaceholder(z6);
    }

    public Bundle toBundle(int i3) {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle(i3));
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_AD_GROUPS, arrayList);
        }
        long j = this.adResumePositionUs;
        AdPlaybackState adPlaybackState = NONE;
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

    public AdPlaybackState withLivePostrollPlaceholderAppended(boolean z6) {
        return withNewAdGroup(this.adGroupCount, Long.MIN_VALUE).withIsPlaceholder(this.adGroupCount, true, z6);
    }

    private AdPlaybackState(Object obj, AdGroup[] adGroupArr, long j, long j9, int i3) {
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

    public AdPlaybackState withAdDurationsUs(int i3, long... jArr) {
        int i9 = i3 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAdDurationsUs(jArr);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }
}
