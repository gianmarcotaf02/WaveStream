package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamCategory;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamCategory {

    public static final Companion INSTANCE = new Companion();

    public final String f20649a;

    public final String f20650b;

    public final Integer f20651c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamCategory$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamCategory$$serializer.INSTANCE;
        }
    }

    public XtreamCategory(int i3, Integer num, String str, String str2) {
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

    public static XtreamCategory a(XtreamCategory xtreamCategory, String str) {
        String categoryId = xtreamCategory.f20649a;
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        return new XtreamCategory(categoryId, str, xtreamCategory.f20651c);
    }

    public final String getF20649a() {
        return this.f20649a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamCategory)) {
            return false;
        }
        XtreamCategory xtreamCategory = (XtreamCategory) obj;
        return kotlin.jvm.internal.m.a(this.f20649a, xtreamCategory.f20649a) && kotlin.jvm.internal.m.a(this.f20650b, xtreamCategory.f20650b) && kotlin.jvm.internal.m.a(this.f20651c, xtreamCategory.f20651c);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20649a.hashCode() * 31, 31, this.f20650b);
        Integer num = this.f20651c;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "XtreamCategory(categoryId=" + this.f20649a + ", categoryName=" + this.f20650b + ", parentId=" + this.f20651c + ")";
    }

    public XtreamCategory(String categoryId, String categoryName, Integer num) {
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        kotlin.jvm.internal.m.e(categoryName, "categoryName");
        this.f20649a = categoryId;
        this.f20650b = categoryName;
        this.f20651c = num;
    }
}
