package u5;

/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.EnumC1937d f28695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f28696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f28697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f28698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f28700f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f28701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f28702i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f28703k;

    public F(com.kiptv.core.model.EnumC1937d type, java.util.List categories, java.util.List autoHiddenCategories, java.lang.String sortOrder, boolean z6, java.util.List autoHideKeywords, int i3, java.util.List hiddenItems, java.util.List lockedCategories, java.util.List lockedItems, boolean z9) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.F)) {
            return false;
        }
        u5.F f9 = (u5.F) obj;
        return this.f28695a == f9.f28695a && kotlin.jvm.internal.m.a(this.f28696b, f9.f28696b) && kotlin.jvm.internal.m.a(this.f28697c, f9.f28697c) && kotlin.jvm.internal.m.a(this.f28698d, f9.f28698d) && this.f28699e == f9.f28699e && kotlin.jvm.internal.m.a(this.f28700f, f9.f28700f) && this.g == f9.g && kotlin.jvm.internal.m.a(this.f28701h, f9.f28701h) && kotlin.jvm.internal.m.a(this.f28702i, f9.f28702i) && kotlin.jvm.internal.m.a(this.j, f9.j) && this.f28703k == f9.f28703k;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f28703k) + B2.a.b(B2.a.b(B2.a.b(p121o0.p.d(this.g, B2.a.b(p121o0.p.f(B2.a.a(B2.a.b(B2.a.b(this.f28695a.hashCode() * 31, 31, this.f28696b), 31, this.f28697c), 31, this.f28698d), 31, this.f28699e), 31, this.f28700f), 31), 31, this.f28701h), 31, this.f28702i), 31, this.j);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvContentMgmtUiState(type=");
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
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f28703k, ")");
    }
}
