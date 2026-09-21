package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p076i4.AbstractC2230y;

public final class BaseUrlExclusionList {
    private final Map<Integer, Long> excludedPriorities;
    private final Map<String, Long> excludedServiceLocations;
    private final Random random;
    private final Map<List<Pair<String, Integer>>, BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
        this(new Random());
    }

    private static <T> void addExclusion(T t9, long j, Map<T, Long> map) {
        if (map.containsKey(t9)) {
            j = Math.max(j, ((Long) Util.castNonNull(map.get(t9))).longValue());
        }
        map.put(t9, Long.valueOf(j));
    }

    private List<BaseUrl> applyExclusions(List<BaseUrl> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        removeExpiredExclusions(jElapsedRealtime, this.excludedServiceLocations);
        removeExpiredExclusions(jElapsedRealtime, this.excludedPriorities);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            BaseUrl baseUrl = list.get(i3);
            if (!this.excludedServiceLocations.containsKey(baseUrl.serviceLocation) && !this.excludedPriorities.containsKey(Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    public static int compareBaseUrl(BaseUrl baseUrl, BaseUrl baseUrl2) {
        int iCompare = Integer.compare(baseUrl.priority, baseUrl2.priority);
        return iCompare != 0 ? iCompare : baseUrl.serviceLocation.compareTo(baseUrl2.serviceLocation);
    }

    public static int getPriorityCount(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < list.size(); i3++) {
            hashSet.add(Integer.valueOf(list.get(i3).priority));
        }
        return hashSet.size();
    }

    private static <T> void removeExpiredExclusions(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            map.remove(arrayList.get(i3));
        }
    }

    private BaseUrl selectWeighted(List<BaseUrl> list) {
        int i3 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i3 += list.get(i9).weight;
        }
        int iNextInt = this.random.nextInt(i3);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            BaseUrl baseUrl = list.get(i11);
            i10 += baseUrl.weight;
            if (iNextInt < i10) {
                return baseUrl;
            }
        }
        return (BaseUrl) AbstractC2230y.l(list);
    }

    public void exclude(BaseUrl baseUrl, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        addExclusion(baseUrl.serviceLocation, jElapsedRealtime, this.excludedServiceLocations);
        int i3 = baseUrl.priority;
        if (i3 != Integer.MIN_VALUE) {
            addExclusion(Integer.valueOf(i3), jElapsedRealtime, this.excludedPriorities);
        }
    }

    public int getPriorityCountAfterExclusion(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        List<BaseUrl> listApplyExclusions = applyExclusions(list);
        for (int i3 = 0; i3 < listApplyExclusions.size(); i3++) {
            hashSet.add(Integer.valueOf(listApplyExclusions.get(i3).priority));
        }
        return hashSet.size();
    }

    public void reset() {
        this.excludedServiceLocations.clear();
        this.excludedPriorities.clear();
        this.selectionsTaken.clear();
    }

    public BaseUrl selectBaseUrl(List<BaseUrl> list) {
        List<BaseUrl> listApplyExclusions = applyExclusions(list);
        if (listApplyExclusions.size() < 2) {
            return (BaseUrl) AbstractC2230y.k(null, listApplyExclusions);
        }
        Collections.sort(listApplyExclusions, new a());
        ArrayList arrayList = new ArrayList();
        int i3 = listApplyExclusions.get(0).priority;
        for (int i9 = 0; i9 < listApplyExclusions.size(); i9++) {
            BaseUrl baseUrl = listApplyExclusions.get(i9);
            if (i3 != baseUrl.priority) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listApplyExclusions.get(0);
            }
            arrayList.add(new Pair(baseUrl.serviceLocation, Integer.valueOf(baseUrl.weight)));
        }
        BaseUrl baseUrl2 = this.selectionsTaken.get(arrayList);
        if (baseUrl2 != null) {
            return baseUrl2;
        }
        BaseUrl baseUrlSelectWeighted = selectWeighted(listApplyExclusions.subList(0, arrayList.size()));
        this.selectionsTaken.put(arrayList, baseUrlSelectWeighted);
        return baseUrlSelectWeighted;
    }

    public BaseUrlExclusionList(Random random) {
        this.selectionsTaken = new HashMap();
        this.random = random;
        this.excludedServiceLocations = new HashMap();
        this.excludedPriorities = new HashMap();
    }
}
