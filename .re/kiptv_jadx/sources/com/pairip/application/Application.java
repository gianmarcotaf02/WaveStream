package com.pairip.application;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends com.kiptv.tv.KIPTVTvApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        com.pairip.licensecheck.LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
