package D3;

import O7.r;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.kiptv.tv.R;
import io.sentry.protocol.SentryStackFrame;
import java.util.concurrent.atomic.AtomicBoolean;

public class f {

    public static final int f2107a;

    public static final f f2108b;

    static {
        AtomicBoolean atomicBoolean = i.f2109a;
        f2107a = 12451000;
        f2108b = new f();
    }

    public Intent a(Context context, int i3, String str) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && r.J(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f2107a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                j jVarA = N3.b.a(context);
                sb.append(jVarA.f2115a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(Context context, int i3) {
        boolean z6;
        PackageInfo packageInfo;
        int i9;
        int i10;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = i.f2109a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zA = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !i.f2112d.get()) {
            synchronized (H3.q.f4000a) {
                try {
                    if (!H3.q.f4001b) {
                        H3.q.f4001b = true;
                        try {
                            Bundle bundle = N3.b.a(context).f2115a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                H3.q.f4002c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e6) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i11 = H3.q.f4002c;
            if (i11 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i11 != 12451000) {
                int i12 = f2107a;
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 104 + String.valueOf(i11).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i12);
                sb.append(" but found ");
                sb.append(i11);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (r.J(context)) {
            z6 = false;
        } else {
            if (r.f8064c == null) {
                r.f8064c = Boolean.valueOf(C2.a.H() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (r.f8064c.booleanValue()) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        H3.q.b(i3 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i13 = 9;
        if (z6) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            j.c(context);
            if (!j.d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z6) {
                H3.q.g(packageInfo);
                if (!j.d(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z6 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i9 = packageInfo2.versionCode;
                    if (i9 == -1) {
                        i10 = -1;
                    } else {
                        i10 = i9 / 1000;
                    }
                    if (i10 < (i3 != -1 ? i3 / 1000 : -1)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i3).length() + 11 + String.valueOf(i9).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i3);
                        sb2.append(" but found ");
                        sb2.append(i9);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        i13 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e9) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e9);
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
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z6) {
                i9 = packageInfo2.versionCode;
                if (i9 == -1) {
                    i10 = -1;
                } else {
                    i10 = i9 / 1000;
                }
                if (i10 < (i3 != -1 ? i3 / 1000 : -1)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i3).length() + 11 + String.valueOf(i9).length());
                    sb3.append("Google Play services out of date for ");
                    sb3.append(packageName);
                    sb3.append(".  Requires ");
                    sb3.append(i3);
                    sb3.append(" but found ");
                    sb3.append(i9);
                    Log.w("GooglePlayServicesUtil", sb3.toString());
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
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i3).length() + 11 + String.valueOf(i9).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i3);
                    sb4.append(" but found ");
                    sb4.append(i9);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
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
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i13 != 18) {
            zA = i13 == 1 ? i.a(context) : false;
        }
        if (zA) {
            return 18;
        }
        return i13;
    }
}
