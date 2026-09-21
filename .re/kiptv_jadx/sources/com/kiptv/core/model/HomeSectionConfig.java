package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/HomeSectionConfig;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class HomeSectionConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.HomeSectionConfig.Companion INSTANCE = new com.kiptv.core.model.HomeSectionConfig.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19792e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.A f19794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f19796d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/HomeSectionConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/HomeSectionConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public static com.kiptv.core.model.HomeSectionConfig a(com.kiptv.core.model.HomeSectionConfig.Companion companion, com.kiptv.core.model.A kind) {
            companion.getClass();
            kotlin.jvm.internal.m.e(kind, "kind");
            return new com.kiptv.core.model.HomeSectionConfig(kind.f19668h, kind, (java.util.Map) null, 8);
        }

        public static java.lang.String b(com.kiptv.core.model.F f9, java.lang.String str) {
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

        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.HomeSectionConfig$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f19792e = new kotlinx.serialization.KSerializer[]{null, null, null, new p153r8.F(p0Var, p0Var, 1)};
    }

    public /* synthetic */ HomeSectionConfig(int i3, java.lang.String str, com.kiptv.core.model.A a2, boolean z6, java.util.Map map) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.HomeSectionConfig$$serializer.INSTANCE.getDescriptor());
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

    public static com.kiptv.core.model.HomeSectionConfig a(com.kiptv.core.model.HomeSectionConfig homeSectionConfig, java.lang.String id, boolean z6, java.util.LinkedHashMap linkedHashMap, int i3) {
        if ((i3 & 1) != 0) {
            id = homeSectionConfig.f19793a;
        }
        com.kiptv.core.model.A kind = homeSectionConfig.f19794b;
        if ((i3 & 4) != 0) {
            z6 = homeSectionConfig.f19795c;
        }
        java.util.Map params = linkedHashMap;
        if ((i3 & 8) != 0) {
            params = homeSectionConfig.f19796d;
        }
        homeSectionConfig.getClass();
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(params, "params");
        return new com.kiptv.core.model.HomeSectionConfig(id, kind, z6, params);
    }

    public final com.kiptv.core.model.CustomFeedDefinition b() {
        java.lang.Object objT;
        com.kiptv.core.model.CustomFeedDefinition.Companion companion = com.kiptv.core.model.CustomFeedDefinition.INSTANCE;
        java.lang.String strH = h("feedDefinition");
        companion.getClass();
        if (strH == null || strH.length() == 0) {
            return null;
        }
        try {
            objT = (com.kiptv.core.model.CustomFeedDefinition) com.kiptv.core.model.CustomFeedDefinition.f19702m.b(strH, companion.serializer());
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        return (com.kiptv.core.model.CustomFeedDefinition) (objT instanceof p070h6.m ? null : objT);
    }

    public final com.kiptv.core.model.EnumC1963x c() {
        java.lang.Object next;
        com.kiptv.core.model.C1962w c1962w = com.kiptv.core.model.EnumC1963x.Companion;
        java.lang.String strH = h("mediaScope");
        c1962w.getClass();
        java.util.Iterator it = com.kiptv.core.model.EnumC1963x.f20860l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.kiptv.core.model.EnumC1963x) next).f20861h.equals(strH));
        com.kiptv.core.model.EnumC1963x enumC1963x = (com.kiptv.core.model.EnumC1963x) next;
        return enumC1963x == null ? com.kiptv.core.model.EnumC1963x.j : enumC1963x;
    }

    public final com.kiptv.core.model.EnumC1965z d() {
        java.lang.Object next;
        com.kiptv.core.model.C1964y c1964y = com.kiptv.core.model.EnumC1965z.Companion;
        java.lang.String strH = h("nowSource");
        c1964y.getClass();
        java.util.Iterator it = com.kiptv.core.model.EnumC1965z.f20881n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.kiptv.core.model.EnumC1965z) next).f20882h.equals(strH));
        com.kiptv.core.model.EnumC1965z enumC1965z = (com.kiptv.core.model.EnumC1965z) next;
        return enumC1965z == null ? com.kiptv.core.model.EnumC1965z.j : enumC1965z;
    }

    public final int e() {
        java.lang.Integer numZ0;
        java.lang.String strH = h("recentDays");
        if (strH == null || (numZ0 = O7.x.z0(strH)) == null) {
            return 30;
        }
        return numZ0.intValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.HomeSectionConfig)) {
            return false;
        }
        com.kiptv.core.model.HomeSectionConfig homeSectionConfig = (com.kiptv.core.model.HomeSectionConfig) obj;
        return kotlin.jvm.internal.m.a(this.f19793a, homeSectionConfig.f19793a) && this.f19794b == homeSectionConfig.f19794b && this.f19795c == homeSectionConfig.f19795c && kotlin.jvm.internal.m.a(this.f19796d, homeSectionConfig.f19796d);
    }

    public final com.kiptv.core.model.D f() {
        java.lang.Object next;
        com.kiptv.core.model.C c9 = com.kiptv.core.model.D.Companion;
        java.lang.String strH = h("sortBy");
        com.kiptv.core.model.F fG = g();
        c9.getClass();
        java.util.Iterator it = com.kiptv.core.model.D.f19719q.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.kiptv.core.model.D) next).f19720h.equals(strH));
        com.kiptv.core.model.D d4 = (com.kiptv.core.model.D) next;
        if (d4 == null) {
            return com.kiptv.core.model.D.f19713k;
        }
        return com.kiptv.core.model.C.a(fG).contains(d4) ? d4 : com.kiptv.core.model.D.f19713k;
    }

    public final com.kiptv.core.model.F g() {
        java.lang.Object next;
        com.kiptv.core.model.E e6 = com.kiptv.core.model.F.Companion;
        java.lang.String strH = h("traktSource");
        e6.getClass();
        java.util.Iterator it = com.kiptv.core.model.F.f19765m.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.kiptv.core.model.F) next).f19766h.equals(strH));
        com.kiptv.core.model.F f9 = (com.kiptv.core.model.F) next;
        return f9 == null ? com.kiptv.core.model.F.LIST : f9;
    }

    public final java.lang.String h(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.f19796d.get(str);
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        return str2;
    }

    public final int hashCode() {
        return this.f19796d.hashCode() + p121o0.p.f((this.f19794b.hashCode() + (this.f19793a.hashCode() * 31)) * 31, 31, this.f19795c);
    }

    public final com.kiptv.core.model.HomeSectionConfig i(java.lang.String str, java.lang.String str2) {
        java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(this.f19796d);
        if (str2 == null || str2.length() == 0) {
            linkedHashMapZ0.remove(str);
        } else {
            linkedHashMapZ0.put(str, str2);
        }
        return a(this, null, false, linkedHashMapZ0, 7);
    }

    public final java.lang.String toString() {
        return "HomeSectionConfig(id=" + this.f19793a + ", kind=" + this.f19794b + ", enabled=" + this.f19795c + ", params=" + this.f19796d + ")";
    }

    public HomeSectionConfig(java.lang.String id, com.kiptv.core.model.A kind, boolean z6, java.util.Map params) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(params, "params");
        this.f19793a = id;
        this.f19794b = kind;
        this.f19795c = z6;
        this.f19796d = params;
    }

    public /* synthetic */ HomeSectionConfig(java.lang.String str, com.kiptv.core.model.A a2, java.util.Map map, int i3) {
        this(str, a2, true, (i3 & 8) != 0 ? p078i6.x.f23206h : map);
    }
}
