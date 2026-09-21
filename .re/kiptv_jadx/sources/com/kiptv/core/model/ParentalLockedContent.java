package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/ParentalLockedContent;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class ParentalLockedContent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.ParentalLockedContent.Companion INSTANCE = new com.kiptv.core.model.ParentalLockedContent.Companion();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.kiptv.core.model.ParentalLockedContent f20029e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List f20030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.List f20031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.List f20032c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/ParentalLockedContent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/ParentalLockedContent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.ParentalLockedContent$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f20028d = new kotlinx.serialization.KSerializer[]{new p153r8.C2691d(p0Var, 0), new p153r8.C2691d(p0Var, 0), new p153r8.C2691d(p0Var, 0)};
        p078i6.w wVar = p078i6.w.f23205h;
        f20029e = new com.kiptv.core.model.ParentalLockedContent(wVar, wVar, wVar);
    }

    public ParentalLockedContent(java.util.List movies, java.util.List series, java.util.List live) {
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        kotlin.jvm.internal.m.e(live, "live");
        this.f20030a = movies;
        this.f20031b = series;
        this.f20032c = live;
    }

    public static com.kiptv.core.model.ParentalLockedContent a(com.kiptv.core.model.ParentalLockedContent parentalLockedContent, java.util.List movies, java.util.List series, java.util.List live, int i3) {
        if ((i3 & 1) != 0) {
            movies = parentalLockedContent.f20030a;
        }
        if ((i3 & 2) != 0) {
            series = parentalLockedContent.f20031b;
        }
        if ((i3 & 4) != 0) {
            live = parentalLockedContent.f20032c;
        }
        parentalLockedContent.getClass();
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        kotlin.jvm.internal.m.e(live, "live");
        return new com.kiptv.core.model.ParentalLockedContent(movies, series, live);
    }

    public final boolean b(java.lang.String id, com.kiptv.core.model.EnumC1937d enumC1937d) {
        kotlin.jvm.internal.m.e(id, "id");
        int iOrdinal = enumC1937d.ordinal();
        if (iOrdinal == 0) {
            return this.f20030a.contains(id);
        }
        if (iOrdinal == 1) {
            return this.f20031b.contains(id);
        }
        if (iOrdinal == 2) {
            return this.f20032c.contains(id);
        }
        throw new I3.b();
    }

    public final com.kiptv.core.model.ParentalLockedContent c(java.util.List list, com.kiptv.core.model.EnumC1937d type) {
        kotlin.jvm.internal.m.e(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return a(this, p078i6.o.c1(p078i6.o.A1(this.f20030a, list)), null, null, 6);
        }
        if (iOrdinal == 1) {
            return a(this, null, p078i6.o.c1(p078i6.o.A1(this.f20031b, list)), null, 5);
        }
        if (iOrdinal == 2) {
            return a(this, null, null, p078i6.o.c1(p078i6.o.A1(this.f20032c, list)), 3);
        }
        throw new I3.b();
    }

    public final com.kiptv.core.model.ParentalLockedContent d(java.lang.String id, com.kiptv.core.model.EnumC1937d type) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            java.util.List list = this.f20030a;
            return a(this, list.contains(id) ? p078i6.o.w1(list, id) : p078i6.o.z1(id, list), null, null, 6);
        }
        if (iOrdinal == 1) {
            java.util.List list2 = this.f20031b;
            return a(this, null, list2.contains(id) ? p078i6.o.w1(list2, id) : p078i6.o.z1(id, list2), null, 5);
        }
        if (iOrdinal != 2) {
            throw new I3.b();
        }
        java.util.List list3 = this.f20032c;
        return a(this, null, null, list3.contains(id) ? p078i6.o.w1(list3, id) : p078i6.o.z1(id, list3), 3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.ParentalLockedContent)) {
            return false;
        }
        com.kiptv.core.model.ParentalLockedContent parentalLockedContent = (com.kiptv.core.model.ParentalLockedContent) obj;
        return kotlin.jvm.internal.m.a(this.f20030a, parentalLockedContent.f20030a) && kotlin.jvm.internal.m.a(this.f20031b, parentalLockedContent.f20031b) && kotlin.jvm.internal.m.a(this.f20032c, parentalLockedContent.f20032c);
    }

    public final int hashCode() {
        return this.f20032c.hashCode() + B2.a.b(this.f20030a.hashCode() * 31, 31, this.f20031b);
    }

    public final java.lang.String toString() {
        return "ParentalLockedContent(movies=" + this.f20030a + ", series=" + this.f20031b + ", live=" + this.f20032c + ")";
    }
}
