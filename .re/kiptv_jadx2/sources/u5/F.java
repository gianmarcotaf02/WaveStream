package u5;

import com.google.android.gms.internal.play_billing.M0;
import com.kiptv.core.model.EnumC1937d;
import java.util.List;

public final class F {

    public final EnumC1937d f28695a;

    public final List f28696b;

    public final List f28697c;

    public final String f28698d;

    public final boolean f28699e;

    public final List f28700f;
    public final int g;

    public final List f28701h;

    public final List f28702i;
    public final List j;

    public final boolean f28703k;

    public F(EnumC1937d type, List categories, List autoHiddenCategories, String sortOrder, boolean z6, List autoHideKeywords, int i3, List hiddenItems, List lockedCategories, List lockedItems, boolean z9) {
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(autoHiddenCategories, "autoHiddenCategories");
        kotlin.jvm.internal.m.e(sortOrder, "sortOrder");
        kotlin.jvm.internal.m.e(autoHideKeywords, "autoHideKeywords");
        kotlin.jvm.internal.m.e(hiddenItems, "hiddenItems");
        kotlin.jvm.internal.m.e(lockedCategories, "lockedCategories");
        kotlin.jvm.internal.m.e(lockedItems, "lockedItems");
        this.f28695a = type;
        this.f28696b = categories;
        this.f28697c = autoHiddenCategories;
        this.f28698d = sortOrder;
        this.f28699e = z6;
        this.f28700f = autoHideKeywords;
        this.g = i3;
        this.f28701h = hiddenItems;
        this.f28702i = lockedCategories;
        this.j = lockedItems;
        this.f28703k = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f9 = (F) obj;
        return this.f28695a == f9.f28695a && kotlin.jvm.internal.m.a(this.f28696b, f9.f28696b) && kotlin.jvm.internal.m.a(this.f28697c, f9.f28697c) && kotlin.jvm.internal.m.a(this.f28698d, f9.f28698d) && this.f28699e == f9.f28699e && kotlin.jvm.internal.m.a(this.f28700f, f9.f28700f) && this.g == f9.g && kotlin.jvm.internal.m.a(this.f28701h, f9.f28701h) && kotlin.jvm.internal.m.a(this.f28702i, f9.f28702i) && kotlin.jvm.internal.m.a(this.j, f9.j) && this.f28703k == f9.f28703k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28703k) + B2.a.b(B2.a.b(B2.a.b(p121o0.p.d(this.g, B2.a.b(p121o0.p.f(B2.a.a(B2.a.b(B2.a.b(this.f28695a.hashCode() * 31, 31, this.f28696b), 31, this.f28697c), 31, this.f28698d), 31, this.f28699e), 31, this.f28700f), 31), 31, this.f28701h), 31, this.f28702i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvContentMgmtUiState(type=");
        sb.append(this.f28695a);
        sb.append(", categories=");
        sb.append(this.f28696b);
        sb.append(", autoHiddenCategories=");
        sb.append(this.f28697c);
        sb.append(", sortOrder=");
        sb.append(this.f28698d);
        sb.append(", hasCustomOrder=");
        sb.append(this.f28699e);
        sb.append(", autoHideKeywords=");
        sb.append(this.f28700f);
        sb.append(", hiddenCategoryCount=");
        sb.append(this.g);
        sb.append(", hiddenItems=");
        sb.append(this.f28701h);
        sb.append(", lockedCategories=");
        sb.append(this.f28702i);
        sb.append(", lockedItems=");
        sb.append(this.j);
        sb.append(", parentalActive=");
        return M0.o(sb, this.f28703k, ")");
    }
}
