package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@p119n8.i(with = com.kiptv.core.model.J0.class)
public final class I0 {
    public static final com.kiptv.core.model.XtreamSeriesInfo$Companion Companion = new com.kiptv.core.model.XtreamSeriesInfo$Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f19801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamSeriesDetail f19802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f19803c;

    public I0(java.util.List list, com.kiptv.core.model.XtreamSeriesDetail xtreamSeriesDetail, java.util.Map map) {
        this.f19801a = list;
        this.f19802b = xtreamSeriesDetail;
        this.f19803c = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.I0)) {
            return false;
        }
        com.kiptv.core.model.I0 i3 = (com.kiptv.core.model.I0) obj;
        return kotlin.jvm.internal.m.a(this.f19801a, i3.f19801a) && kotlin.jvm.internal.m.a(this.f19802b, i3.f19802b) && kotlin.jvm.internal.m.a(this.f19803c, i3.f19803c);
    }

    public final int hashCode() {
        java.util.List list = this.f19801a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        com.kiptv.core.model.XtreamSeriesDetail xtreamSeriesDetail = this.f19802b;
        int iHashCode2 = (iHashCode + (xtreamSeriesDetail == null ? 0 : xtreamSeriesDetail.hashCode())) * 31;
        java.util.Map map = this.f19803c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "XtreamSeriesInfo(seasons=" + this.f19801a + ", info=" + this.f19802b + ", episodes=" + this.f19803c + ")";
    }
}
