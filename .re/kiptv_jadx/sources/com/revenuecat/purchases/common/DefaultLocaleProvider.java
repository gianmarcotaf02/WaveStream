package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/DefaultLocaleProvider;", "Lcom/revenuecat/purchases/common/LocaleProvider;", "<init>", "()V", "", "localeString", "Lh6/A;", "setPreferredLocaleOverride", "(Ljava/lang/String;)V", "preferredLocaleOverride", "Ljava/lang/String;", "getCurrentLocalesLanguageTags", "()Ljava/lang/String;", "currentLocalesLanguageTags", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultLocaleProvider implements com.revenuecat.purchases.common.LocaleProvider {
    private java.lang.String preferredLocaleOverride;

    @Override // com.revenuecat.purchases.common.LocaleProvider
    public java.lang.String getCurrentLocalesLanguageTags() {
        java.lang.String str = this.preferredLocaleOverride;
        if (str != null) {
            p204z1.b bVar = p204z1.b.f32139b;
            java.lang.String languageTags = android.os.LocaleList.getDefault().toLanguageTags();
            kotlin.jvm.internal.m.d(languageTags, "getDefault().toLanguageTags()");
            if (languageTags.length() != 0) {
                str = str + ',' + languageTags;
            }
            if (str != null) {
                return str;
            }
        }
        p204z1.b bVar2 = p204z1.b.f32139b;
        java.lang.String languageTags2 = android.os.LocaleList.getDefault().toLanguageTags();
        kotlin.jvm.internal.m.d(languageTags2, "getDefault().toLanguageTags()");
        return languageTags2;
    }

    public final void setPreferredLocaleOverride(java.lang.String localeString) {
        this.preferredLocaleOverride = localeString;
    }
}
