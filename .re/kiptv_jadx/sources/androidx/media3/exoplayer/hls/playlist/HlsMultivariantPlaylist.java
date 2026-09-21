package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMultivariantPlaylist extends androidx.media3.exoplayer.hls.playlist.HlsPlaylist {
    public static final androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist EMPTY;
    public static final int GROUP_INDEX_AUDIO = 1;
    public static final int GROUP_INDEX_SUBTITLE = 2;
    public static final int GROUP_INDEX_VARIANT = 0;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> audios;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> closedCaptions;
    public final java.util.List<android.net.Uri> mediaPlaylistUrls;
    public final androidx.media3.common.Format muxedAudioFormat;
    public final java.util.List<androidx.media3.common.Format> muxedCaptionFormats;
    public final java.util.List<androidx.media3.common.DrmInitData> sessionKeyDrmInitData;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> subtitles;
    public final java.util.Map<java.lang.String, java.lang.String> variableDefinitions;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> variants;
    public final java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> videos;

    public static final class Rendition {
        public final androidx.media3.common.Format format;
        public final java.lang.String groupId;
        public final java.lang.String name;
        public final java.lang.String stableRenditionId;
        public final android.net.Uri url;

        public Rendition(android.net.Uri uri, androidx.media3.common.Format format, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.url = uri;
            this.format = format;
            this.groupId = str;
            this.name = str2;
            this.stableRenditionId = str3;
        }
    }

    public static final class Variant {
        public final java.lang.String audioGroupId;
        public final java.lang.String captionGroupId;
        public final androidx.media3.common.Format format;
        public final java.lang.String pathwayId;
        public final java.lang.String stableVariantId;
        public final java.lang.String subtitleGroupId;
        public final android.net.Uri url;
        public final java.lang.String videoGroupId;

        public Variant(android.net.Uri uri, androidx.media3.common.Format format, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            this.url = uri;
            this.format = format;
            this.videoGroupId = str;
            this.audioGroupId = str2;
            this.subtitleGroupId = str3;
            this.captionGroupId = str4;
            this.pathwayId = str5;
            this.stableVariantId = str6;
        }

        public static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant createMediaPlaylistVariantUrl(android.net.Uri uri) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant(uri, new androidx.media3.common.Format.Builder().setId("0").setContainerMimeType(androidx.media3.common.MimeTypes.APPLICATION_M3U8).build(), null, null, null, null, null, null);
        }

        public androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant copyWithFormat(androidx.media3.common.Format format) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant(this.url, format, this.videoGroupId, this.audioGroupId, this.subtitleGroupId, this.captionGroupId, this.pathwayId, this.stableVariantId);
        }
    }

    static {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        EMPTY = new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist("", list, list, list, list, list, list, null, list, false, java.util.Collections.EMPTY_MAP, list);
    }

    public HlsMultivariantPlaylist(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list2, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list3, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list4, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list5, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list6, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list7, boolean z6, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<androidx.media3.common.DrmInitData> list8) {
        super(str, list, z6);
        this.mediaPlaylistUrls = java.util.Collections.unmodifiableList(getMediaPlaylistUrls(list2, list3, list4, list5, list6));
        this.variants = java.util.Collections.unmodifiableList(list2);
        this.videos = java.util.Collections.unmodifiableList(list3);
        this.audios = java.util.Collections.unmodifiableList(list4);
        this.subtitles = java.util.Collections.unmodifiableList(list5);
        this.closedCaptions = java.util.Collections.unmodifiableList(list6);
        this.muxedAudioFormat = format;
        this.muxedCaptionFormats = list7 != null ? java.util.Collections.unmodifiableList(list7) : null;
        this.variableDefinitions = java.util.Collections.unmodifiableMap(map);
        this.sessionKeyDrmInitData = java.util.Collections.unmodifiableList(list8);
    }

    private static void addMediaPlaylistUrls(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list, java.util.List<android.net.Uri> list2) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            android.net.Uri uri = list.get(i3).url;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> java.util.List<T> copyStreams(java.util.List<T> list, int i3, java.util.List<androidx.media3.common.StreamKey> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        for (int i9 = 0; i9 < list.size(); i9++) {
            T t9 = list.get(i9);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                androidx.media3.common.StreamKey streamKey = list2.get(i10);
                if (streamKey.groupIndex == i3 && streamKey.streamIndex == i9) {
                    arrayList.add(t9);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist createSingleVariantMultivariantPlaylist(java.lang.String str) {
        java.util.List listSingletonList = java.util.Collections.singletonList(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant.createMediaPlaylistVariantUrl(android.net.Uri.parse(str)));
        java.util.List list = java.util.Collections.EMPTY_LIST;
        return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist("", list, listSingletonList, list, list, list, list, null, null, false, java.util.Collections.EMPTY_MAP, list);
    }

    private static java.util.List<android.net.Uri> getMediaPlaylistUrls(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list2, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list3, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list4, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> list5) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            android.net.Uri uri = list.get(i3).url;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        addMediaPlaylistUrls(list2, arrayList);
        addMediaPlaylistUrls(list3, arrayList);
        addMediaPlaylistUrls(list4, arrayList);
        addMediaPlaylistUrls(list5, arrayList);
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy2(java.util.List list) {
        return copy((java.util.List<androidx.media3.common.StreamKey>) list);
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public androidx.media3.exoplayer.hls.playlist.HlsPlaylist copy(java.util.List<androidx.media3.common.StreamKey> list) {
        java.lang.String str = this.baseUri;
        java.util.List<java.lang.String> list2 = this.tags;
        java.util.List listCopyStreams = copyStreams(this.variants, 0, list);
        java.util.List list3 = java.util.Collections.EMPTY_LIST;
        return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist(str, list2, listCopyStreams, list3, copyStreams(this.audios, 1, list), copyStreams(this.subtitles, 2, list), list3, this.muxedAudioFormat, this.muxedCaptionFormats, this.hasIndependentSegments, this.variableDefinitions, this.sessionKeyDrmInitData);
    }
}
