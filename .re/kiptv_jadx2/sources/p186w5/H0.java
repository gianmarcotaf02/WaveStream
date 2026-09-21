package p186w5;

import B2.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import p121o0.p;
import t5.C2819m0;

public final class H0 {

    public final boolean f30077a;

    public final List f30078b;

    public final boolean f30079c;

    public final boolean f30080d;

    public final Map f30081e;

    public final Map f30082f;
    public final C2819m0 g;

    public final String f30083h;

    public final boolean f30084i;
    public final Map j;

    public final Map f30085k;

    public final Map f30086l;

    public H0(boolean z6, List rows, boolean z9, boolean z10, Map cwProgress, Map cwItems, C2819m0 c2819m0, String str, boolean z11, Map nowProgramByStream, Map artworkUrlByStream, Map programArtworkById) {
        m.e(rows, "rows");
        m.e(cwProgress, "cwProgress");
        m.e(cwItems, "cwItems");
        m.e(nowProgramByStream, "nowProgramByStream");
        m.e(artworkUrlByStream, "artworkUrlByStream");
        m.e(programArtworkById, "programArtworkById");
        this.f30077a = z6;
        this.f30078b = rows;
        this.f30079c = z9;
        this.f30080d = z10;
        this.f30081e = cwProgress;
        this.f30082f = cwItems;
        this.g = c2819m0;
        this.f30083h = str;
        this.f30084i = z11;
        this.j = nowProgramByStream;
        this.f30085k = artworkUrlByStream;
        this.f30086l = programArtworkById;
    }

    public static H0 a(H0 h9, boolean z6, ArrayList arrayList, boolean z9, boolean z10, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, C2819m0 c2819m0, String str, boolean z11, Map map, Map map2, Map map3, int i3) {
        if ((i3 & 1) != 0) {
            z6 = h9.f30077a;
        }
        boolean z12 = z6;
        List list = arrayList;
        if ((i3 & 2) != 0) {
            list = h9.f30078b;
        }
        List rows = list;
        boolean z13 = (i3 & 4) != 0 ? h9.f30079c : z9;
        boolean z14 = (i3 & 8) != 0 ? h9.f30080d : z10;
        Map cwProgress = (i3 & 16) != 0 ? h9.f30081e : linkedHashMap;
        Map cwItems = (i3 & 32) != 0 ? h9.f30082f : linkedHashMap2;
        C2819m0 c2819m1 = (i3 & 64) != 0 ? h9.g : c2819m0;
        String str2 = (i3 & 128) != 0 ? h9.f30083h : str;
        boolean z15 = (i3 & 256) != 0 ? h9.f30084i : z11;
        Map nowProgramByStream = (i3 & 512) != 0 ? h9.j : map;
        Map artworkUrlByStream = (i3 & 1024) != 0 ? h9.f30085k : map2;
        Map programArtworkById = (i3 & 2048) != 0 ? h9.f30086l : map3;
        h9.getClass();
        m.e(rows, "rows");
        m.e(cwProgress, "cwProgress");
        m.e(cwItems, "cwItems");
        m.e(nowProgramByStream, "nowProgramByStream");
        m.e(artworkUrlByStream, "artworkUrlByStream");
        m.e(programArtworkById, "programArtworkById");
        return new H0(z12, rows, z13, z14, cwProgress, cwItems, c2819m1, str2, z15, nowProgramByStream, artworkUrlByStream, programArtworkById);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h9 = (H0) obj;
        return this.f30077a == h9.f30077a && m.a(this.f30078b, h9.f30078b) && this.f30079c == h9.f30079c && this.f30080d == h9.f30080d && m.a(this.f30081e, h9.f30081e) && m.a(this.f30082f, h9.f30082f) && m.a(this.g, h9.g) && m.a(this.f30083h, h9.f30083h) && this.f30084i == h9.f30084i && m.a(this.j, h9.j) && m.a(this.f30085k, h9.f30085k) && m.a(this.f30086l, h9.f30086l);
    }

    public final int hashCode() {
        int iC = a.c(a.c(p.f(p.f(a.b(Boolean.hashCode(this.f30077a) * 31, 31, this.f30078b), 31, this.f30079c), 31, this.f30080d), 31, this.f30081e), 31, this.f30082f);
        C2819m0 c2819m0 = this.g;
        int iHashCode = (iC + (c2819m0 == null ? 0 : c2819m0.hashCode())) * 31;
        String str = this.f30083h;
        return this.f30086l.hashCode() + a.c(a.c(p.f((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f30084i), 31, this.j), 31, this.f30085k);
    }

    public final String toString() {
        return "TvHomeUiState(isReady=" + this.f30077a + ", rows=" + this.f30078b + ", heroEnabled=" + this.f30079c + ", isEmptyLayout=" + this.f30080d + ", cwProgress=" + this.f30081e + ", cwItems=" + this.f30082f + ", heroMeta=" + this.g + ", heroBackdropUrl=" + this.f30083h + ", heroBackdropIsLogo=" + this.f30084i + ", nowProgramByStream=" + this.j + ", artworkUrlByStream=" + this.f30085k + ", programArtworkById=" + this.f30086l + ")";
    }
}
