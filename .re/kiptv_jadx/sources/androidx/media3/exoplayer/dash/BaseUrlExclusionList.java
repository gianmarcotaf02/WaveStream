package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public final class BaseUrlExclusionList {
    private final java.util.Map<java.lang.Integer, java.lang.Long> excludedPriorities;
    private final java.util.Map<java.lang.String, java.lang.Long> excludedServiceLocations;
    private final java.util.Random random;
    private final java.util.Map<java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>>, androidx.media3.exoplayer.dash.manifest.BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
        this(new java.util.Random());
    }

    private static <T> void addExclusion(T t9, long j, java.util.Map<T, java.lang.Long> map) {
        if (map.containsKey(t9)) {
            j = java.lang.Math.max(j, ((java.lang.Long) androidx.media3.common.util.Util.castNonNull(map.get(t9))).longValue());
        }
        map.put(t9, java.lang.Long.valueOf(j));
    }

    private java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> applyExclusions(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        removeExpiredExclusions(jElapsedRealtime, this.excludedServiceLocations);
        removeExpiredExclusions(jElapsedRealtime, this.excludedPriorities);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = list.get(i3);
            if (!this.excludedServiceLocations.containsKey(baseUrl.serviceLocation) && !this.excludedPriorities.containsKey(java.lang.Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareBaseUrl(androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl, androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl2) {
        int iCompare = java.lang.Integer.compare(baseUrl.priority, baseUrl2.priority);
        return iCompare != 0 ? iCompare : baseUrl.serviceLocation.compareTo(baseUrl2.serviceLocation);
    }

    public static int getPriorityCount(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i3 = 0; i3 < list.size(); i3++) {
            hashSet.add(java.lang.Integer.valueOf(list.get(i3).priority));
        }
        return hashSet.size();
    }

    private static <T> void removeExpiredExclusions(long j, java.util.Map<T, java.lang.Long> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<T, java.lang.Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            map.remove(arrayList.get(i3));
        }
    }

    private androidx.media3.exoplayer.dash.manifest.BaseUrl selectWeighted(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        int i3 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i3 += list.get(i9).weight;
        }
        int iNextInt = this.random.nextInt(i3);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = list.get(i11);
            i10 += baseUrl.weight;
            if (iNextInt < i10) {
                return baseUrl;
            }
        }
        return (androidx.media3.exoplayer.dash.manifest.BaseUrl) p076i4.AbstractC2230y.l(list);
    }

    public void exclude(androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl, long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + j;
        addExclusion(baseUrl.serviceLocation, jElapsedRealtime, this.excludedServiceLocations);
        int i3 = baseUrl.priority;
        if (i3 != Integer.MIN_VALUE) {
            addExclusion(java.lang.Integer.valueOf(i3), jElapsedRealtime, this.excludedPriorities);
        }
    }

    public int getPriorityCountAfterExclusion(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> listApplyExclusions = applyExclusions(list);
        for (int i3 = 0; i3 < listApplyExclusions.size(); i3++) {
            hashSet.add(java.lang.Integer.valueOf(listApplyExclusions.get(i3).priority));
        }
        return hashSet.size();
    }

    public void reset() {
        this.excludedServiceLocations.clear();
        this.excludedPriorities.clear();
        this.selectionsTaken.clear();
    }

    public androidx.media3.exoplayer.dash.manifest.BaseUrl selectBaseUrl(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> listApplyExclusions = applyExclusions(list);
        if (listApplyExclusions.size() < 2) {
            return (androidx.media3.exoplayer.dash.manifest.BaseUrl) p076i4.AbstractC2230y.k(null, listApplyExclusions);
        }
        java.util.Collections.sort(listApplyExclusions, new androidx.media3.exoplayer.dash.a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = listApplyExclusions.get(0).priority;
        for (int i9 = 0; i9 < listApplyExclusions.size(); i9++) {
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = listApplyExclusions.get(i9);
            if (i3 != baseUrl.priority) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listApplyExclusions.get(0);
            }
            arrayList.add(new android.util.Pair(baseUrl.serviceLocation, java.lang.Integer.valueOf(baseUrl.weight)));
        }
        androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl2 = this.selectionsTaken.get(arrayList);
        if (baseUrl2 != null) {
            return baseUrl2;
        }
        androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrlSelectWeighted = selectWeighted(listApplyExclusions.subList(0, arrayList.size()));
        this.selectionsTaken.put(arrayList, baseUrlSelectWeighted);
        return baseUrlSelectWeighted;
    }

    public BaseUrlExclusionList(java.util.Random random) {
        this.selectionsTaken = new java.util.HashMap();
        this.random = random;
        this.excludedServiceLocations = new java.util.HashMap();
        this.excludedPriorities = new java.util.HashMap();
    }
}
