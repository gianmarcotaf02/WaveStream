package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamCategory;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamCategory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamCategory.Companion INSTANCE = new com.kiptv.core.model.XtreamCategory.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f20651c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamCategory$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamCategory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamCategory(int i3, java.lang.Integer num, java.lang.String str, java.lang.String str2) {
        if ((i3 & 1) == 0) {
            this.f20649a = "";
        } else {
            this.f20649a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20650b = "";
        } else {
            this.f20650b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20651c = null;
        } else {
            this.f20651c = num;
        }
    }

    public static com.kiptv.core.model.XtreamCategory a(com.kiptv.core.model.XtreamCategory xtreamCategory, java.lang.String str) {
        java.lang.String categoryId = xtreamCategory.f20649a;
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        return new com.kiptv.core.model.XtreamCategory(categoryId, str, xtreamCategory.f20651c);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getF20649a() {
        return this.f20649a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamCategory)) {
            return false;
        }
        com.kiptv.core.model.XtreamCategory xtreamCategory = (com.kiptv.core.model.XtreamCategory) obj;
        return kotlin.jvm.internal.m.a(this.f20649a, xtreamCategory.f20649a) && kotlin.jvm.internal.m.a(this.f20650b, xtreamCategory.f20650b) && kotlin.jvm.internal.m.a(this.f20651c, xtreamCategory.f20651c);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20649a.hashCode() * 31, 31, this.f20650b);
        java.lang.Integer num = this.f20651c;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "XtreamCategory(categoryId=" + this.f20649a + ", categoryName=" + this.f20650b + ", parentId=" + this.f20651c + ")";
    }

    public XtreamCategory(java.lang.String categoryId, java.lang.String categoryName, java.lang.Integer num) {
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        kotlin.jvm.internal.m.e(categoryName, "categoryName");
        this.f20649a = categoryId;
        this.f20650b = categoryName;
        this.f20651c = num;
    }
}
