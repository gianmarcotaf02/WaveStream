package D3;

import F3.InterfaceC0367g;
import O7.r;
import Y1.C1016a;
import Y1.D;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.C1489i;
import androidx.core.app.C1493m;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.play_billing.M0;

public final class e extends f {

    public static final Object f2105c = new Object();

    public static final e f2106d = new e();

    public static AlertDialog d(Activity activity, int i3, H3.l lVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(H3.k.b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i3 == 1) {
            string = resources.getString(com.kiptv.tv.R.string.common_google_play_services_install_button);
        } else if (i3 != 2) {
            string = i3 != 3 ? resources.getString(R.string.ok) : resources.getString(com.kiptv.tv.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.kiptv.tv.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, lVar);
        }
        String strC = H3.k.c(activity, i3);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", M0.l(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof SignInHubActivity) {
                Y1.q qVar = (Y1.q) ((SignInHubActivity) activity).f18608B.f9i;
                k kVar = new k();
                H3.q.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f2116n0 = alertDialog;
                if (onCancelListener != null) {
                    kVar.f2117o0 = onCancelListener;
                }
                kVar.f11281k0 = false;
                kVar.f11282l0 = true;
                D d4 = qVar.f11339u;
                d4.getClass();
                C1016a c1016a = new C1016a(d4);
                c1016a.f11242o = true;
                c1016a.e(0, kVar, str);
                c1016a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        H3.q.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f2100h = alertDialog;
        if (onCancelListener != null) {
            cVar.f2101i = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i3, new H3.l(super.a(googleApiActivity, i3, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i3, PendingIntent pendingIntent) {
        int i9;
        Log.w("GoogleApiAvailability", Y6.f.f(i3, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i3 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i3 == 6 ? H3.k.e(context, "common_google_play_services_resolution_required_title") : H3.k.c(context, i3);
        if (strE == null) {
            strE = context.getResources().getString(com.kiptv.tv.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i3 == 6 || i3 == 19) ? H3.k.d(context, "common_google_play_services_resolution_required_text", H3.k.a(context)) : H3.k.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        H3.q.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        androidx.core.app.n nVar = new androidx.core.app.n(context, null);
        nVar.f16057o = true;
        nVar.c(16, true);
        nVar.f16049e = androidx.core.app.n.b(strE);
        C1493m c1493m = new C1493m(0);
        c1493m.f16043b = androidx.core.app.n.b(strD);
        nVar.e(c1493m);
        PackageManager packageManager = context.getPackageManager();
        if (r.f8062a == null) {
            r.f8062a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (r.f8062a.booleanValue()) {
            nVar.f16067z.icon = context.getApplicationInfo().icon;
            nVar.f16052i = 2;
            if (r.J(context)) {
                nVar.f16046b.add(new C1489i(2131230863, pendingIntent, resources.getString(com.kiptv.tv.R.string.common_open_on_phone)));
            } else {
                nVar.g = pendingIntent;
            }
        } else {
            nVar.f16067z.icon = R.drawable.stat_sys_warning;
            nVar.f16067z.tickerText = androidx.core.app.n.b(resources.getString(com.kiptv.tv.R.string.common_google_play_services_notification_ticker));
            nVar.f16067z.when = System.currentTimeMillis();
            nVar.g = pendingIntent;
            nVar.f16050f = androidx.core.app.n.b(strD);
        }
        if (C2.a.H()) {
            if (!C2.a.H()) {
                throw new IllegalStateException();
            }
            synchronized (f2105c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.kiptv.tv.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(B1.a.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            nVar.f16064v = "com.google.android.gms.availability";
        }
        Notification notificationA = nVar.a();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i.f2109a.set(false);
            i9 = 10436;
        } else {
            i9 = 39789;
        }
        notificationManager.notify(i9, notificationA);
    }

    public final void g(Activity activity, InterfaceC0367g interfaceC0367g, int i3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i3, new H3.l(super.a(activity, i3, "d"), interfaceC0367g, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
