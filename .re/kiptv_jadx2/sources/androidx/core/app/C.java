package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.kiptv.tv.R;
import com.revenuecat.purchases.common.events.BackendEvent;
import io.ktor.sse.ServerSentEventKt;

public abstract class C {
    CharSequence mBigContentTitle;
    protected n mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet = false;

    public static C constructCompatStyleByName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                return new u();
            case "androidx.core.app.NotificationCompat$BigPictureStyle":
                return new C1492l();
            case "androidx.core.app.NotificationCompat$CallStyle":
                return new s();
            case "androidx.core.app.NotificationCompat$InboxStyle":
                return new C1493m(1);
            case "androidx.core.app.NotificationCompat$BigTextStyle":
                return new C1493m(0);
            case "androidx.core.app.NotificationCompat$MessagingStyle":
                return new B();
            default:
                return null;
        }
    }

    public static C constructCompatStyleForBundle(Bundle bundle) {
        C cConstructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
        if (cConstructCompatStyleByName != null) {
            return cConstructCompatStyleByName;
        }
        if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
            return new B();
        }
        if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
            return new C1492l();
        }
        if (bundle.containsKey("android.bigText")) {
            return new C1493m(0);
        }
        if (bundle.containsKey("android.textLines")) {
            return new C1493m(1);
        }
        if (bundle.containsKey("android.callType")) {
            return new s();
        }
        String string = bundle.getString("android.template");
        if (string == null) {
            return null;
        }
        if (string.equals(Notification.BigPictureStyle.class.getName())) {
            return new C1492l();
        }
        if (string.equals(Notification.BigTextStyle.class.getName())) {
            return new C1493m(0);
        }
        if (string.equals(Notification.InboxStyle.class.getName())) {
            return new C1493m(1);
        }
        if (string.equals(Notification.MessagingStyle.class.getName())) {
            return new B();
        }
        if (string.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
            return new u();
        }
        return null;
    }

    public static C constructStyleForExtras(Bundle bundle) {
        C cConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
        if (cConstructCompatStyleForBundle == null) {
            return null;
        }
        try {
            cConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
            return cConstructCompatStyleForBundle;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static C extractStyleFromNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        return constructStyleForExtras(bundle);
    }

    public final Bitmap a(IconCompat iconCompat, int i3, int i9) {
        Object obj;
        Resources resourcesForApplication;
        Context context = this.mBuilder.f16045a;
        if (iconCompat.f16077a == 2 && (obj = iconCompat.f16078b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String strG = iconCompat.g();
                    if (BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM.equals(strG)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strG, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException e6) {
                            Log.e("IconCompat", "Unable to find pkg=" + strG + " for icon", e6);
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (iconCompat.f16081e != identifier) {
                        Log.i("IconCompat", "Id has changed for " + strG + ServerSentEventKt.SPACE + str);
                        iconCompat.f16081e = identifier;
                    }
                }
            }
        }
        Drawable drawableLoadDrawable = iconCompat.i(context).loadDrawable(context);
        int intrinsicWidth = i9 == 0 ? drawableLoadDrawable.getIntrinsicWidth() : i9;
        if (i9 == 0) {
            i9 = drawableLoadDrawable.getIntrinsicHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i9, Bitmap.Config.ARGB_8888);
        drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i9);
        if (i3 != 0) {
            drawableLoadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
        drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public void addCompatExtras(Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public abstract void apply(InterfaceC1487g interfaceC1487g);

    public RemoteViews applyStandardTemplate(boolean z6, int i3, boolean z9) {
        boolean z10;
        int i9;
        Resources resources = this.mBuilder.f16045a.getResources();
        RemoteViews remoteViews = new RemoteViews(this.mBuilder.f16045a.getPackageName(), i3);
        n nVar = this.mBuilder;
        int i10 = nVar.f16052i;
        if (nVar.f16051h != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            remoteViews.setImageViewBitmap(R.id.icon, createColoredBitmap(this.mBuilder.f16051h, 0));
            if (z6 && this.mBuilder.f16067z.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
                n nVar2 = this.mBuilder;
                remoteViews.setImageViewBitmap(R.id.right_icon, b(nVar2.f16067z.icon, dimensionPixelSize, dimensionPixelSize2, nVar2.f16062t));
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (z6 && nVar.f16067z.icon != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            n nVar3 = this.mBuilder;
            remoteViews.setImageViewBitmap(R.id.icon, b(nVar3.f16067z.icon, dimensionPixelSize3, dimensionPixelSize4, nVar3.f16062t));
        }
        CharSequence charSequence = this.mBuilder.f16049e;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.mBuilder.f16050f;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z10 = true;
        } else {
            z10 = false;
        }
        this.mBuilder.getClass();
        this.mBuilder.getClass();
        remoteViews.setViewVisibility(R.id.info, 8);
        CharSequence charSequence3 = this.mBuilder.f16055m;
        if (charSequence3 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence3);
            CharSequence charSequence4 = this.mBuilder.f16050f;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(R.id.text2, charSequence4);
                remoteViews.setViewVisibility(R.id.text2, 0);
                if (z9) {
                    remoteViews.setTextViewTextSize(R.id.text, 0, resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                }
                remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
            } else {
                remoteViews.setViewVisibility(R.id.text2, 8);
            }
        }
        n nVar4 = this.mBuilder;
        if ((nVar4.j ? nVar4.f16067z.when : 0L) != 0) {
            if (nVar4.f16053k) {
                remoteViews.setViewVisibility(R.id.chronometer, 0);
                n nVar5 = this.mBuilder;
                remoteViews.setLong(R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + (nVar5.j ? nVar5.f16067z.when : 0L));
                remoteViews.setBoolean(R.id.chronometer, "setStarted", true);
                this.mBuilder.getClass();
            } else {
                remoteViews.setViewVisibility(R.id.time, 0);
                n nVar6 = this.mBuilder;
                remoteViews.setLong(R.id.time, "setTime", nVar6.j ? nVar6.f16067z.when : 0L);
            }
            i9 = 0;
        } else {
            i9 = 8;
        }
        remoteViews.setViewVisibility(R.id.right_side, i9);
        remoteViews.setViewVisibility(R.id.line3, z10 ? 0 : 8);
        return remoteViews;
    }

    public final Bitmap b(int i3, int i9, int i10, int i11) {
        if (i11 == 0) {
            i11 = 0;
        }
        Bitmap bitmapA = a(IconCompat.d(this.mBuilder.f16045a, R.drawable.notification_icon_background), i11, i9);
        Canvas canvas = new Canvas(bitmapA);
        Drawable drawableMutate = this.mBuilder.f16045a.getResources().getDrawable(i3).mutate();
        drawableMutate.setFilterBitmap(true);
        int i12 = (i9 - i10) / 2;
        int i13 = i10 + i12;
        drawableMutate.setBounds(i12, i12, i13, i13);
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        drawableMutate.draw(canvas);
        return bitmapA;
    }

    public Notification build() {
        n nVar = this.mBuilder;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources = this.mBuilder.f16045a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        float f9 = resources.getConfiguration().fontScale;
        if (f9 < 1.0f) {
            f9 = 1.0f;
        } else if (f9 > 1.3f) {
            f9 = 1.3f;
        }
        float f10 = (f9 - 1.0f) / 0.29999995f;
        remoteViews.setViewPadding(R.id.notification_main_column_container, 0, Math.round((f10 * dimensionPixelSize2) + ((1.0f - f10) * dimensionPixelSize)), 0, 0);
    }

    public void clearCompatExtraKeys(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public Bitmap createColoredBitmap(IconCompat iconCompat, int i3) {
        return a(iconCompat, i3, 0);
    }

    public boolean displayCustomViewInline() {
        return false;
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(InterfaceC1487g interfaceC1487g) {
        return null;
    }

    public RemoteViews makeContentView(InterfaceC1487g interfaceC1487g) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(InterfaceC1487g interfaceC1487g) {
        return null;
    }

    public void restoreFromCompatExtras(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.mSummaryText = bundle.getCharSequence("android.summaryText");
            this.mSummaryTextSet = true;
        }
        this.mBigContentTitle = bundle.getCharSequence("android.title.big");
    }

    public void setBuilder(n nVar) {
        if (this.mBuilder != nVar) {
            this.mBuilder = nVar;
            if (nVar != null) {
                nVar.e(this);
            }
        }
    }

    public Bitmap createColoredBitmap(int i3, int i9) {
        return a(IconCompat.d(this.mBuilder.f16045a, i3), i9, 0);
    }
}
