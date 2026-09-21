package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2214p0;

public final class HlsRedundantGroup {
    public static final int AUDIO_RENDITION = 2;
    public static final int SUBTITLE_RENDITION = 3;
    public static final int VARIANT = 0;
    public static final int VIDEO_RENDITION = 1;
    private String currentPathwayId;
    public final GroupKey groupKey;
    private final List<Integer> indicesInMultivariantPlaylist;
    private final HashMap<String, Uri> pathwayIdToPlaylistUrl;

    public static class GroupKey {
        public final Format format;
        public final String name;
        public final String stableId;

        public GroupKey(Format format, String str) {
            this(format, str, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupKey)) {
                return false;
            }
            GroupKey groupKey = (GroupKey) obj;
            return Objects.equals(this.format, groupKey.format) && Objects.equals(this.stableId, groupKey.stableId) && Objects.equals(this.name, groupKey.name);
        }

        public int hashCode() {
            return Objects.hash(this.format, this.stableId, this.name);
        }

        public GroupKey(Format format, String str, String str2) {
            this.format = format.buildUpon().setId((String) null).setMetadata(null).build();
            this.stableId = str;
            this.name = str2;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public HlsRedundantGroup(GroupKey groupKey, String str, Uri uri) {
        this(groupKey, str, uri, -1);
    }

    public static AbstractC2186b0 createRenditionRedundantGroupList(List<HlsMultivariantPlaylist.Rendition> list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            HlsMultivariantPlaylist.Rendition rendition = list.get(i3);
            if (rendition.url != null) {
                try {
                    propagateRedundantGroupList(rendition.url, null, i3, arrayList, new GroupKey(rendition.format, rendition.stableRenditionId, rendition.name), map, map2);
                } catch (ParserException unused) {
                }
            }
        }
        return AbstractC2186b0.u(arrayList);
    }

    public static AbstractC2186b0 createVariantRedundantGroupList(List<HlsMultivariantPlaylist.Variant> list) throws ParserException {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            HlsMultivariantPlaylist.Variant variant = list.get(i3);
            propagateRedundantGroupList(variant.url, variant.pathwayId, i3, arrayList, new GroupKey(variant.format, variant.stableVariantId), map, map2);
        }
        return AbstractC2186b0.u(arrayList);
    }

    private static void propagateRedundantGroupList(Uri uri, String str, int i3, List<HlsRedundantGroup> list, GroupKey groupKey, Map<GroupKey, Integer> map, Map<GroupKey, Integer> map2) throws ParserException {
        int i9;
        String str2;
        Integer num = map.get(groupKey);
        int i10 = 1;
        if (num == null) {
            map2.put(groupKey, 0);
            if (str == null) {
                map2.put(groupKey, 1);
                str = ".";
            }
            HlsRedundantGroup hlsRedundantGroup = new HlsRedundantGroup(groupKey, str, uri, i3);
            map.put(groupKey, Integer.valueOf(list.size()));
            list.add(hlsRedundantGroup);
            return;
        }
        if (str == null) {
            Integer num2 = map2.get(groupKey);
            num2.getClass();
            int iIntValue = num2.intValue() + 1;
            if (iIntValue <= 1) {
                AbstractC1864o0.J(iIntValue, "invalid count: %s", iIntValue >= 0);
                str2 = iIntValue == 0 ? "" : ".";
            } else {
                long j = ((long) 1) * ((long) iIntValue);
                int i11 = (int) j;
                if (i11 != j) {
                    throw new ArrayIndexOutOfBoundsException(B2.a.j(j, "Required array size too large: "));
                }
                char[] cArr = new char[i11];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i9 = i11 - i10;
                    if (i10 >= i9) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i10, i10);
                    i10 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i10, i9);
                str2 = new String(cArr);
            }
            map2.put(groupKey, Integer.valueOf(iIntValue));
            str = str2;
        }
        HlsRedundantGroup hlsRedundantGroup2 = list.get(num.intValue());
        Uri playlistUrl = hlsRedundantGroup2.getPlaylistUrl(str);
        if (playlistUrl == null || uri.equals(playlistUrl)) {
            hlsRedundantGroup2.put(str, uri, i3);
            return;
        }
        throw ParserException.createForMalformedManifest("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
    }

    public AbstractC2214p0 getAllPathwayIds() {
        return AbstractC2214p0.t(this.pathwayIdToPlaylistUrl.keySet());
    }

    public AbstractC2214p0 getAllPlaylistUrls() {
        return AbstractC2214p0.t(this.pathwayIdToPlaylistUrl.values());
    }

    public String getCurrentPathwayId() {
        return this.currentPathwayId;
    }

    public Uri getCurrentPlaylistUrl() {
        Uri uri = this.pathwayIdToPlaylistUrl.get(this.currentPathwayId);
        uri.getClass();
        return uri;
    }

    public AbstractC2186b0 getIndicesInMultivariantPlaylist() {
        return AbstractC2186b0.u(this.indicesInMultivariantPlaylist);
    }

    public Uri getPlaylistUrl(String str) {
        return this.pathwayIdToPlaylistUrl.get(str);
    }

    public void put(String str, Uri uri) {
        put(str, uri, -1);
    }

    public void setCurrentPathwayId(String str) {
        AbstractC1864o0.Y(this.pathwayIdToPlaylistUrl.containsKey(str));
        this.currentPathwayId = str;
    }

    public int size() {
        return this.pathwayIdToPlaylistUrl.size();
    }

    public HlsRedundantGroup(GroupKey groupKey, String str, Uri uri, int i3) {
        this.groupKey = groupKey;
        HashMap<String, Uri> map = new HashMap<>();
        this.pathwayIdToPlaylistUrl = map;
        map.put(str, uri);
        this.currentPathwayId = str;
        ArrayList arrayList = new ArrayList();
        this.indicesInMultivariantPlaylist = arrayList;
        if (i3 != -1) {
            arrayList.add(Integer.valueOf(i3));
        }
    }

    public void put(String str, Uri uri, int i3) {
        this.pathwayIdToPlaylistUrl.put(str, uri);
        if (i3 != -1) {
            this.indicesInMultivariantPlaylist.add(Integer.valueOf(i3));
        }
    }
}
