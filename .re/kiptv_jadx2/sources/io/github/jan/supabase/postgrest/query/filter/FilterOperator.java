package io.github.jan.supabase.postgrest.query.filter;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import com.google.crypto.tink.shaded.protobuf.q0;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.Metadata;
import p126o6.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "EQ", "NEQ", "GT", "GTE", "LT", "LTE", "LIKE", "MATCH", "ILIKE", "IMATCH", "IS", HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, "CS", "CD", "SL", "SR", "NXL", "NXR", "ADJ", "OV", "FTS", "PLFTS", "PHFTS", "WFTS", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum FilterOperator {
    EQ("eq"),
    NEQ("neq"),
    GT("gt"),
    GTE("gte"),
    LT("lt"),
    LTE("lte"),
    LIKE("like"),
    MATCH("match"),
    ILIKE("ilike"),
    IMATCH("imatch"),
    IS("is"),
    IN("in"),
    CS("cs"),
    CD("cd"),
    SL("sl"),
    SR("sr"),
    NXL("nxl"),
    NXR("nxr"),
    ADJ("adj"),
    OV("ov"),
    FTS("fts"),
    PLFTS("plfts"),
    PHFTS("phfts"),
    WFTS("wfts");

    private static final a $ENTRIES = q0.t(values());
    private final String identifier;

    FilterOperator(String str) {
        this.identifier = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
