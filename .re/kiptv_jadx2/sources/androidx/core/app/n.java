package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.kiptv.tv.R;
import java.util.ArrayList;

public final class n {

    public final ArrayList f16044A;

    public final Context f16045a;

    public CharSequence f16049e;

    public CharSequence f16050f;
    public PendingIntent g;

    public IconCompat f16051h;

    public int f16052i;

    public boolean f16053k;

    public C f16054l;

    public CharSequence f16055m;

    public String f16056n;

    public boolean f16058p;

    public boolean f16059q;

    public String f16060r;

    public Bundle f16061s;

    public String f16064v;
    public final boolean y;

    public final Notification f16067z;

    public final ArrayList f16046b = new ArrayList();

    public final ArrayList f16047c = new ArrayList();

    public final ArrayList f16048d = new ArrayList();
    public boolean j = true;

    public boolean f16057o = false;

    public int f16062t = 0;

    public int f16063u = 0;

    public int f16065w = 0;

    public int f16066x = 0;

    public n(Context context, String str) {
        Notification notification = new Notification();
        this.f16067z = notification;
        this.f16045a = context;
        this.f16064v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f16052i = 0;
        this.f16044A = new ArrayList();
        this.y = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        E e6 = new E(this);
        n nVar = e6.f15976c;
        C c9 = nVar.f16054l;
        if (c9 != null) {
            c9.apply(e6);
        }
        RemoteViews remoteViewsMakeContentView = c9 != null ? c9.makeContentView(e6) : null;
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = e6.f15975b;
        Notification notificationBuild = i3 >= 26 ? builder.build() : builder.build();
        if (remoteViewsMakeContentView != null) {
            notificationBuild.contentView = remoteViewsMakeContentView;
        }
        if (c9 != null && (remoteViewsMakeBigContentView = c9.makeBigContentView(e6)) != null) {
            notificationBuild.bigContentView = remoteViewsMakeBigContentView;
        }
        if (c9 != null && (remoteViewsMakeHeadsUpContentView = nVar.f16054l.makeHeadsUpContentView(e6)) != null) {
            notificationBuild.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (c9 != null && (bundle = notificationBuild.extras) != null) {
            c9.addCompatExtras(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i3, boolean z6) {
        Notification notification = this.f16067z;
        if (z6) {
            notification.flags = i3 | notification.flags;
        } else {
            notification.flags = (~i3) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f16045a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f16076k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f16078b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f16051h = iconCompat;
    }

    public final void e(C c9) {
        if (this.f16054l != c9) {
            this.f16054l = c9;
            c9.setBuilder(this);
        }
    }
}
