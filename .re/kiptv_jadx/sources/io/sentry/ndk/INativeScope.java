package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public interface INativeScope {
    void addBreadcrumb(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6);

    void removeExtra(java.lang.String str);

    void removeTag(java.lang.String str);

    void removeUser();

    void setExtra(java.lang.String str, java.lang.String str2);

    void setTag(java.lang.String str, java.lang.String str2);

    void setTrace(java.lang.String str, java.lang.String str2);

    void setUser(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);
}
