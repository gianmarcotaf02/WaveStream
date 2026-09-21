package D3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends D3.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f2105c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D3.e f2106d = new D3.e();

    public static android.app.AlertDialog d(android.app.Activity activity, int i3, H3.l lVar, android.content.DialogInterface.OnCancelListener onCancelListener) {
        java.lang.String string;
        if (i3 == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        builder.setMessage(H3.k.b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        android.content.res.Resources resources = activity.getResources();
        if (i3 == 1) {
            string = resources.getString(com.kiptv.tv.R.string.common_google_play_services_install_button);
        } else if (i3 != 2) {
            string = i3 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.kiptv.tv.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.kiptv.tv.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, lVar);
        }
        java.lang.String strC = H3.k.c(activity, i3);
        if (strC != null) {
            builder.setTitle(strC);
        }
        android.util.Log.w("GoogleApiAvailability", com.google.android.gms.internal.play_billing.M0.l(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new java.lang.IllegalArgumentException());
        return builder.create();
    }

    public static void e(android.app.Activity activity, android.app.AlertDialog alertDialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof com.google.android.gms.auth.api.signin.internal.SignInHubActivity) {
                Y1.q qVar = (Y1.q) ((com.google.android.gms.auth.api.signin.internal.SignInHubActivity) activity).f18608B.f9i;
                D3.k kVar = new D3.k();
                H3.q.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f2116n0 = alertDialog;
                if (onCancelListener != null) {
                    kVar.f2117o0 = onCancelListener;
                }
                kVar.f11281k0 = false;
                kVar.f11282l0 = true;
                Y1.D d4 = qVar.f11339u;
                d4.getClass();
                Y1.C1016a c1016a = new Y1.C1016a(d4);
                c1016a.f11242o = true;
                c1016a.e(0, kVar, str);
                c1016a.d(false);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        D3.c cVar = new D3.c();
        H3.q.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f2100h = alertDialog;
        if (onCancelListener != null) {
            cVar.f2101i = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(com.google.android.gms.common.api.GoogleApiActivity googleApiActivity, int i3, com.google.android.gms.common.api.GoogleApiActivity googleApiActivity2) {
        android.app.AlertDialog alertDialogD = d(googleApiActivity, i3, new H3.l(super.a(googleApiActivity, i3, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(android.content.Context context, int i3, android.app.PendingIntent pendingIntent) {
        int i9;
        android.util.Log.w("GoogleApiAvailability", Y6.f.f(i3, "GMS core API Availability. ConnectionResult=", ", tag=null"), new java.lang.IllegalArgumentException());
        if (i3 == 18) {
            new D3.l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        java.lang.String strE = i3 == 6 ? H3.k.e(context, "common_google_play_services_resolution_required_title") : H3.k.c(context, i3);
        if (strE == null) {
            strE = context.getResources().getString(com.kiptv.tv.R.string.common_google_play_services_notification_ticker);
        }
        java.lang.String strD = (i3 == 6 || i3 == 19) ? H3.k.d(context, "common_google_play_services_resolution_required_text", H3.k.a(context)) : H3.k.b(context, i3);
        android.content.res.Resources resources = context.getResources();
        java.lang.Object systemService = context.getSystemService("notification");
        H3.q.g(systemService);
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        androidx.core.app.n nVar = new androidx.core.app.n(context, null);
        nVar.f16057o = true;
        nVar.c(16, true);
        nVar.f16049e = androidx.core.app.n.b(strE);
        androidx.core.app.C1493m c1493m = new androidx.core.app.C1493m(0);
        c1493m.f16043b = androidx.core.app.n.b(strD);
        nVar.e(c1493m);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (O7.r.f8062a == null) {
            O7.r.f8062a = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (O7.r.f8062a.booleanValue()) {
            nVar.f16067z.icon = context.getApplicationInfo().icon;
            nVar.f16052i = 2;
            if (O7.r.J(context)) {
                nVar.f16046b.add(new androidx.core.app.C1489i(2131230863, pendingIntent, resources.getString(com.kiptv.tv.R.string.common_open_on_phone)));
            } else {
                nVar.g = pendingIntent;
            }
        } else {
            nVar.f16067z.icon = android.R.drawable.stat_sys_warning;
            nVar.f16067z.tickerText = androidx.core.app.n.b(resources.getString(com.kiptv.tv.R.string.common_google_play_services_notification_ticker));
            nVar.f16067z.when = java.lang.System.currentTimeMillis();
            nVar.g = pendingIntent;
            nVar.f16050f = androidx.core.app.n.b(strD);
        }
        if (C2.a.H()) {
            if (!C2.a.H()) {
                throw new java.lang.IllegalStateException();
            }
            synchronized (f2105c) {
            }
            android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            java.lang.String string = context.getResources().getString(com.kiptv.tv.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(B1.a.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            nVar.f16064v = "com.google.android.gms.availability";
        }
        android.app.Notification notificationA = nVar.a();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            D3.i.f2109a.set(false);
            i9 = 10436;
        } else {
            i9 = 39789;
        }
        notificationManager.notify(i9, notificationA);
    }

    public final void g(android.app.Activity activity, F3.InterfaceC0367g interfaceC0367g, int i3, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.AlertDialog alertDialogD = d(activity, i3, new H3.l(super.a(activity, i3, "d"), interfaceC0367g, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
