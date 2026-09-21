package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/HomeSectionConfig;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class HomeSectionConfig {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19792e;

    public final String f19793a;

    public final A f19794b;

    public final boolean f19795c;

    public final Map f19796d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/HomeSectionConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/HomeSectionConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public static HomeSectionConfig a(Companion companion, A kind) {
            companion.getClass();
            kotlin.jvm.internal.m.e(kind, "kind");
            return new HomeSectionConfig(kind.f19668h, kind, (Map) null, 8);
        }

        public static String b(F f9, String str) {
            int iOrdinal = f9.ordinal();
            if (iOrdinal == 0) {
                return "traktList:recommendations";
            }
            if (iOrdinal == 1) {
                return "traktList:watchlist";
            }
            if (iOrdinal != 2) {
                throw new I3.b();
            }
            if (str == null) {
                str = "";
            }
            return "traktList:".concat(str);
        }

        public final KSerializer serializer() {
            return HomeSectionConfig$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f19792e = new KSerializer[]{null, null, null, new p153r8.F(p0Var, p0Var, 1)};
    }

    public HomeSectionConfig(int i3, String str, A a2, boolean z6, Map map) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, HomeSectionConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19793a = str;
        this.f19794b = a2;
        if ((i3 & 4) == 0) {
            this.f19795c = true;
        } else {
            this.f19795c = z6;
        }
        if ((i3 & 8) == 0) {
            this.f19796d = p078i6.x.f23206h;
        } else {
            this.f19796d = map;
        }
    }

    public static HomeSectionConfig a(HomeSectionConfig homeSectionConfig, String id, boolean z6, LinkedHashMap linkedHashMap, int i3) {
        if ((i3 & 1) != 0) {
            id = homeSectionConfig.f19793a;
        }
        A kind = homeSectionConfig.f19794b;
        if ((i3 & 4) != 0) {
            z6 = homeSectionConfig.f19795c;
        }
        Map params = linkedHashMap;
        if ((i3 & 8) != 0) {
            params = homeSectionConfig.f19796d;
        }
        homeSectionConfig.getClass();
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(params, "params");
        return new HomeSectionConfig(id, kind, z6, params);
    }

    public final CustomFeedDefinition b() {
        Object objT;
        CustomFeedDefinition.Companion companion = CustomFeedDefinition.INSTANCE;
        String strH = h("feedDefinition");
        companion.getClass();
        if (strH == null || strH.length() == 0) {
            return null;
        }
        try {
            objT = (CustomFeedDefinition) CustomFeedDefinition.f19702m.b(strH, companion.serializer());
        } catch (Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        return (CustomFeedDefinition) (objT instanceof p070h6.m ? null : objT);
    }

    public final EnumC1963x c() {
        Object next;
        C1962w c1962w = EnumC1963x.Companion;
        String strH = h("mediaScope");
        c1962w.getClass();
        Iterator it = EnumC1963x.f20860l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EnumC1963x) next).f20861h.equals(strH));
        EnumC1963x enumC1963x = (EnumC1963x) next;
        return enumC1963x == null ? EnumC1963x.j : enumC1963x;
    }

    public final EnumC1965z d() {
        Object next;
        C1964y c1964y = EnumC1965z.Companion;
        String strH = h("nowSource");
        c1964y.getClass();
        Iterator it = EnumC1965z.f20881n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EnumC1965z) next).f20882h.equals(strH));
        EnumC1965z enumC1965z = (EnumC1965z) next;
        return enumC1965z == null ? EnumC1965z.j : enumC1965z;
    }

    public final int e() {
        Integer numZ0;
        String strH = h("recentDays");
        if (strH == null || (numZ0 = O7.x.z0(strH)) == null) {
            return 30;
        }
        return numZ0.intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeSectionConfig)) {
            return false;
        }
        HomeSectionConfig homeSectionConfig = (HomeSectionConfig) obj;
        return kotlin.jvm.internal.m.a(this.f19793a, homeSectionConfig.f19793a) && this.f19794b == homeSectionConfig.f19794b && this.f19795c == homeSectionConfig.f19795c && kotlin.jvm.internal.m.a(this.f19796d, homeSectionConfig.f19796d);
    }

    public final D f() {
        Object next;
        C c9 = D.Companion;
        String strH = h("sortBy");
        F fG = g();
        c9.getClass();
        Iterator it = D.f19719q.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((D) next).f19720h.equals(strH));
        D d4 = (D) next;
        if (d4 == null) {
            return D.f19713k;
        }
        return C.a(fG).contains(d4) ? d4 : D.f19713k;
    }

    public final F g() {
        Object next;
        E e6 = F.Companion;
        String strH = h("traktSource");
        e6.getClass();
        Iterator it = F.f19765m.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((F) next).f19766h.equals(strH));
        F f9 = (F) next;
        return f9 == null ? F.LIST : f9;
    }

    public final String h(String str) {
        String str2 = (String) this.f19796d.get(str);
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        return str2;
    }

    public final int hashCode() {
        return this.f19796d.hashCode() + p121o0.p.f((this.f19794b.hashCode() + (this.f19793a.hashCode() * 31)) * 31, 31, this.f19795c);
    }

    public final HomeSectionConfig i(String str, String str2) {
        LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(this.f19796d);
        if (str2 == null || str2.length() == 0) {
            linkedHashMapZ0.remove(str);
        } else {
            linkedHashMapZ0.put(str, str2);
        }
        return a(this, null, false, linkedHashMapZ0, 7);
    }

    public final String toString() {
        return "HomeSectionConfig(id=" + this.f19793a + ", kind=" + this.f19794b + ", enabled=" + this.f19795c + ", params=" + this.f19796d + ")";
    }

    public HomeSectionConfig(String id, A kind, boolean z6, Map params) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(params, "params");
        this.f19793a = id;
        this.f19794b = kind;
        this.f19795c = z6;
        this.f19796d = params;
    }

    public HomeSectionConfig(String str, A a2, Map map, int i3) {
        this(str, a2, true, (i3 & 8) != 0 ? p078i6.x.f23206h : map);
    }
}
