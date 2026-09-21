package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0005H\u0000\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0002\u001a\f\u0010\u0013\u001a\u00020\b*\u00020\bH\u0007\u001a\f\u0010\u0014\u001a\u00020\b*\u00020\bH\u0007\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u001a\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0015"}, d2 = {"canUsePaywallUI", "", "getCanUsePaywallUI", "()Z", "isDeviceProtectedStorageCompat", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "playServicesVersionName", "", "getPlayServicesVersionName", "(Landroid/content/Context;)Ljava/lang/String;", "playStoreVersionName", "getPlayStoreVersionName", "versionName", "getVersionName", "getLocale", "Ljava/util/Locale;", "packageVersionName", "packageName", "sha1", com.revenuecat.purchases.common.verification.SigningManager.POST_PARAMS_ALGORITHM, "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    public static final boolean getCanUsePaywallUI() {
        try {
            java.lang.Class.forName("com.revenuecat.purchases.ui.revenuecatui.PaywallKt");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static final java.util.Locale getLocale(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "<this>");
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static final java.lang.String getPlayServicesVersionName(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "<this>");
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final java.lang.String getPlayStoreVersionName(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "<this>");
        return packageVersionName(context, "com.android.vending");
    }

    public static final java.lang.String getVersionName(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    public static final boolean isDeviceProtectedStorageCompat(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "<this>");
        return context.isDeviceProtectedStorage();
    }

    private static final java.lang.String packageVersionName(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final java.lang.String sha1(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
        java.nio.charset.Charset charset = O7.a.f8024b;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        byte[] bArrEncode = android.util.Base64.encode(messageDigest.digest(bytes), 2);
        kotlin.jvm.internal.m.d(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new java.lang.String(bArrEncode, charset);
    }

    public static final java.lang.String sha256(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        java.nio.charset.Charset charset = O7.a.f8024b;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        byte[] bArrEncode = android.util.Base64.encode(messageDigest.digest(bytes), 2);
        kotlin.jvm.internal.m.d(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new java.lang.String(bArrEncode, charset);
    }
}
