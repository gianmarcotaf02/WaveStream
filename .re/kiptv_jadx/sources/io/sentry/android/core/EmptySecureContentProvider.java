package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
abstract class EmptySecureContentProvider extends android.content.ContentProvider {
    private final io.sentry.android.core.internal.util.ContentProviderSecurityChecker securityChecker = new io.sentry.android.core.internal.util.ContentProviderSecurityChecker();

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return 0;
    }
}
