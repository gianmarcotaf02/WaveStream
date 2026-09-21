package D3;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D3.f f2108b;

    static {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = D3.i.f2109a;
        f2107a = 12451000;
        f2108b = new D3.f();
    }

    public android.content.Intent a(android.content.Context context, int i3, java.lang.String str) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            android.net.Uri uriFromParts = android.net.Uri.fromParts(io.sentry.protocol.SentryStackFrame.JsonKeys.PACKAGE, "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && O7.r.J(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("gcore_");
        sb.append(f2107a);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                D3.j jVarA = N3.b.a(context);
                sb.append(jVarA.f2115a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String string = sb.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder builderAppendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0207  */
    /* JADX WARN: Code duplicated, block: B:102:0x0209  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0190, please report this as an issue */
    public int b(android.content.Context context, int i3) {
        boolean z6;
        android.content.pm.PackageInfo packageInfo;
        int i9;
        int i10;
        android.content.pm.ApplicationInfo applicationInfo;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = D3.i.f2109a;
        try {
            context.getResources().getString(com.kiptv.tv.R.string.common_google_play_services_unknown_issue);
        } catch (java.lang.Throwable unused) {
            android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zA = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !D3.i.f2112d.get()) {
            synchronized (H3.q.f4000a) {
                try {
                    if (!H3.q.f4001b) {
                        H3.q.f4001b = true;
                        try {
                            android.os.Bundle bundle = N3.b.a(context).f2115a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                H3.q.f4002c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                            android.util.Log.wtf("MetadataValueReader", "This should never happen.", e6);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            int i11 = H3.q.f4002c;
            if (i11 == 0) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            }
            if (i11 != 12451000) {
                int i12 = f2107a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i12).length() + 104 + java.lang.String.valueOf(i11).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i12);
                sb.append(" but found ");
                sb.append(i11);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (O7.r.J(context)) {
            z6 = false;
        } else {
            if (O7.r.f8064c == null) {
                O7.r.f8064c = java.lang.Boolean.valueOf(C2.a.H() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (O7.r.f8064c.booleanValue()) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        H3.q.b(i3 >= 0);
        java.lang.String packageName = context.getPackageName();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        int i13 = 9;
        if (z6) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", android.os.Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", android.os.Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            D3.j.c(context);
            if (!D3.j.d(packageInfo2, true)) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z6) {
                H3.q.g(packageInfo);
                if (!D3.j.d(packageInfo, true)) {
                    android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z6 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i9 = packageInfo2.versionCode;
                    if (i9 == -1) {
                        i10 = -1;
                    } else {
                        i10 = i9 / 1000;
                    }
                    if (i10 < (i3 != -1 ? i3 / 1000 : -1)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 49 + java.lang.String.valueOf(i3).length() + 11 + java.lang.String.valueOf(i9).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i3);
                        sb2.append(" but found ");
                        sb2.append(i9);
                        android.util.Log.w("GooglePlayServicesUtil", sb2.toString());
                        i13 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (android.content.pm.PackageManager.NameNotFoundException e9) {
                                android.util.Log.wtf("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e9);
                                i13 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i13 = 0;
                        } else {
                            i13 = 3;
                        }
                    }
                } else {
                    android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z6) {
                i9 = packageInfo2.versionCode;
                if (i9 == -1) {
                    i10 = -1;
                } else {
                    i10 = i9 / 1000;
                }
                if (i10 < (i3 != -1 ? i3 / 1000 : -1)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 49 + java.lang.String.valueOf(i3).length() + 11 + java.lang.String.valueOf(i9).length());
                    sb3.append("Google Play services out of date for ");
                    sb3.append(packageName);
                    sb3.append(".  Requires ");
                    sb3.append(i3);
                    sb3.append(" but found ");
                    sb3.append(i9);
                    android.util.Log.w("GooglePlayServicesUtil", sb3.toString());
                    i13 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i13 = 3;
                    } else {
                        i13 = 0;
                    }
                }
            } else {
                i9 = packageInfo2.versionCode;
                if (i9 == -1) {
                    i10 = -1;
                } else {
                    i10 = i9 / 1000;
                }
                if (i10 < (i3 != -1 ? i3 / 1000 : -1)) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 49 + java.lang.String.valueOf(i3).length() + 11 + java.lang.String.valueOf(i9).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i3);
                    sb4.append(" but found ");
                    sb4.append(i9);
                    android.util.Log.w("GooglePlayServicesUtil", sb4.toString());
                    i13 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i13 = 3;
                    } else {
                        i13 = 0;
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i13 != 18) {
            zA = i13 == 1 ? D3.i.a(context) : false;
        }
        if (zA) {
            return 18;
        }
        return i13;
    }
}
