package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsRedundantGroup {
    public static final int AUDIO_RENDITION = 2;
    public static final int SUBTITLE_RENDITION = 3;
    public static final int VARIANT = 0;
    public static final int VIDEO_RENDITION = 1;
    private java.lang.String currentPathwayId;
    public final androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey groupKey;
    private final java.util.List<java.lang.Integer> indicesInMultivariantPlaylist;
    private final java.util.HashMap<java.lang.String, android.net.Uri> pathwayIdToPlaylistUrl;

    public static class GroupKey {
        public final androidx.media3.common.Format format;
        public final java.lang.String name;
        public final java.lang.String stableId;

        public GroupKey(androidx.media3.common.Format format, java.lang.String str) {
            this(format, str, null);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey)) {
                return false;
            }
            androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey groupKey = (androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey) obj;
            return java.util.Objects.equals(this.format, groupKey.format) && java.util.Objects.equals(this.stableId, groupKey.stableId) && java.util.Objects.equals(this.name, groupKey.name);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.format, this.stableId, this.name);
        }

        public GroupKey(androidx.media3.common.Format format, java.lang.String str, java.lang.String str2) {
            this.format = format.buildUpon().setId((java.lang.String) null).setMetadata(null).build();
            this.stableId = str;
            this.name = str2;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public HlsRedundantGroup(androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey groupKey, java.lang.String str, android.net.Uri uri) {
        this(groupKey, str, uri, -1);
    }

    public static p076i4.AbstractC2186b0 createRenditionRedundantGroupList(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition rendition = list.get(i3);
            if (rendition.url != null) {
                try {
                    propagateRedundantGroupList(rendition.url, null, i3, arrayList, new androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey(rendition.format, rendition.stableRenditionId, rendition.name), map, map2);
                } catch (androidx.media3.common.ParserException unused) {
                }
            }
        }
        return p076i4.AbstractC2186b0.u(arrayList);
    }

    public static p076i4.AbstractC2186b0 createVariantRedundantGroupList(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list) throws androidx.media3.common.ParserException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = list.get(i3);
            propagateRedundantGroupList(variant.url, variant.pathwayId, i3, arrayList, new androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey(variant.format, variant.stableVariantId), map, map2);
        }
        return p076i4.AbstractC2186b0.u(arrayList);
    }

    private static void propagateRedundantGroupList(android.net.Uri uri, java.lang.String str, int i3, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list, androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey groupKey, java.util.Map<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey, java.lang.Integer> map, java.util.Map<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey, java.lang.Integer> map2) throws androidx.media3.common.ParserException {
        int i9;
        java.lang.String str2;
        java.lang.Integer num = map.get(groupKey);
        int i10 = 1;
        if (num == null) {
            map2.put(groupKey, 0);
            if (str == null) {
                map2.put(groupKey, 1);
                str = ".";
            }
            androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup hlsRedundantGroup = new androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup(groupKey, str, uri, i3);
            map.put(groupKey, java.lang.Integer.valueOf(list.size()));
            list.add(hlsRedundantGroup);
            return;
        }
        if (str == null) {
            java.lang.Integer num2 = map2.get(groupKey);
            num2.getClass();
            int iIntValue = num2.intValue() + 1;
            if (iIntValue <= 1) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.J(iIntValue, "invalid count: %s", iIntValue >= 0);
                str2 = iIntValue == 0 ? "" : ".";
            } else {
                long j = ((long) 1) * ((long) iIntValue);
                int i11 = (int) j;
                if (i11 != j) {
                    throw new java.lang.ArrayIndexOutOfBoundsException(B2.a.j(j, "Required array size too large: "));
                }
                char[] cArr = new char[i11];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i9 = i11 - i10;
                    if (i10 >= i9) {
                        break;
                    }
                    java.lang.System.arraycopy(cArr, 0, cArr, i10, i10);
                    i10 <<= 1;
                }
                java.lang.System.arraycopy(cArr, 0, cArr, i10, i9);
                str2 = new java.lang.String(cArr);
            }
            map2.put(groupKey, java.lang.Integer.valueOf(iIntValue));
            str = str2;
        }
        androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup hlsRedundantGroup2 = list.get(num.intValue());
        android.net.Uri playlistUrl = hlsRedundantGroup2.getPlaylistUrl(str);
        if (playlistUrl == null || uri.equals(playlistUrl)) {
            hlsRedundantGroup2.put(str, uri, i3);
            return;
        }
        throw androidx.media3.common.ParserException.createForMalformedManifest("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
    }

    public p076i4.AbstractC2214p0 getAllPathwayIds() {
        return p076i4.AbstractC2214p0.t(this.pathwayIdToPlaylistUrl.keySet());
    }

    public p076i4.AbstractC2214p0 getAllPlaylistUrls() {
        return p076i4.AbstractC2214p0.t(this.pathwayIdToPlaylistUrl.values());
    }

    public java.lang.String getCurrentPathwayId() {
        return this.currentPathwayId;
    }

    public android.net.Uri getCurrentPlaylistUrl() {
        android.net.Uri uri = this.pathwayIdToPlaylistUrl.get(this.currentPathwayId);
        uri.getClass();
        return uri;
    }

    public p076i4.AbstractC2186b0 getIndicesInMultivariantPlaylist() {
        return p076i4.AbstractC2186b0.u(this.indicesInMultivariantPlaylist);
    }

    public android.net.Uri getPlaylistUrl(java.lang.String str) {
        return this.pathwayIdToPlaylistUrl.get(str);
    }

    public void put(java.lang.String str, android.net.Uri uri) {
        put(str, uri, -1);
    }

    public void setCurrentPathwayId(java.lang.String str) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.pathwayIdToPlaylistUrl.containsKey(str));
        this.currentPathwayId = str;
    }

    public int size() {
        return this.pathwayIdToPlaylistUrl.size();
    }

    public HlsRedundantGroup(androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.GroupKey groupKey, java.lang.String str, android.net.Uri uri, int i3) {
        this.groupKey = groupKey;
        java.util.HashMap<java.lang.String, android.net.Uri> map = new java.util.HashMap<>();
        this.pathwayIdToPlaylistUrl = map;
        map.put(str, uri);
        this.currentPathwayId = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.indicesInMultivariantPlaylist = arrayList;
        if (i3 != -1) {
            arrayList.add(java.lang.Integer.valueOf(i3));
        }
    }

    public void put(java.lang.String str, android.net.Uri uri, int i3) {
        this.pathwayIdToPlaylistUrl.put(str, uri);
        if (i3 != -1) {
            this.indicesInMultivariantPlaylist.add(java.lang.Integer.valueOf(i3));
        }
    }
}
