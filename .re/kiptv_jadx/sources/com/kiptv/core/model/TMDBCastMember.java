package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBCastMember;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBCastMember {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBCastMember.Companion INSTANCE = new com.kiptv.core.model.TMDBCastMember.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f20126e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBCastMember$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBCastMember;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBCastMember$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBCastMember(int i3, int i9, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBCastMember$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20122a = i9;
        this.f20123b = str;
        if ((i3 & 4) == 0) {
            this.f20124c = null;
        } else {
            this.f20124c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20125d = null;
        } else {
            this.f20125d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20126e = null;
        } else {
            this.f20126e = num;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBCastMember)) {
            return false;
        }
        com.kiptv.core.model.TMDBCastMember tMDBCastMember = (com.kiptv.core.model.TMDBCastMember) obj;
        return this.f20122a == tMDBCastMember.f20122a && kotlin.jvm.internal.m.a(this.f20123b, tMDBCastMember.f20123b) && kotlin.jvm.internal.m.a(this.f20124c, tMDBCastMember.f20124c) && kotlin.jvm.internal.m.a(this.f20125d, tMDBCastMember.f20125d) && kotlin.jvm.internal.m.a(this.f20126e, tMDBCastMember.f20126e);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20122a) * 31, 31, this.f20123b);
        java.lang.String str = this.f20124c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20125d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f20126e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBCastMember(id=" + this.f20122a + ", name=" + this.f20123b + ", character=" + this.f20124c + ", profilePath=" + this.f20125d + ", order=" + this.f20126e + ")";
    }

    public TMDBCastMember(int i3, java.lang.String name, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f20122a = i3;
        this.f20123b = name;
        this.f20124c = str;
        this.f20125d = str2;
        this.f20126e = num;
    }
}
