package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final java.util.ArrayList f16044A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f16045a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f16049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f16050f;
    public android.app.PendingIntent g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.core.graphics.drawable.IconCompat f16051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16052i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.core.app.C f16054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f16055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f16056n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.String f16060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public android.os.Bundle f16061s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.lang.String f16064v;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final android.app.Notification f16067z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f16046b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f16047c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f16048d = new java.util.ArrayList();
    public boolean j = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16057o = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16062t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16063u = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16065w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16066x = 0;

    public n(android.content.Context context, java.lang.String str) {
        android.app.Notification notification = new android.app.Notification();
        this.f16067z = notification;
        this.f16045a = context;
        this.f16064v = str;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f16052i = 0;
        this.f16044A = new java.util.ArrayList();
        this.y = true;
    }

    public static java.lang.CharSequence b(java.lang.CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final android.app.Notification a() {
        android.os.Bundle bundle;
        android.widget.RemoteViews remoteViewsMakeHeadsUpContentView;
        android.widget.RemoteViews remoteViewsMakeBigContentView;
        androidx.core.app.E e6 = new androidx.core.app.E(this);
        androidx.core.app.n nVar = e6.f15976c;
        androidx.core.app.C c9 = nVar.f16054l;
        if (c9 != null) {
            c9.apply(e6);
        }
        android.widget.RemoteViews remoteViewsMakeContentView = c9 != null ? c9.makeContentView(e6) : null;
        int i3 = android.os.Build.VERSION.SDK_INT;
        android.app.Notification.Builder builder = e6.f15975b;
        android.app.Notification notificationBuild = i3 >= 26 ? builder.build() : builder.build();
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
        android.app.Notification notification = this.f16067z;
        if (z6) {
            notification.flags = i3 | notification.flags;
        } else {
            notification.flags = (~i3) & notification.flags;
        }
    }

    public final void d(android.graphics.Bitmap bitmap) {
        androidx.core.graphics.drawable.IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (android.os.Build.VERSION.SDK_INT < 27) {
                android.content.res.Resources resources = this.f16045a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = java.lang.Math.min(((double) dimensionPixelSize) / ((double) java.lang.Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) java.lang.Math.max(1, bitmap.getHeight())));
                    bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.ceil(((double) bitmap.getWidth()) * dMin), (int) java.lang.Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            android.graphics.PorterDuff.Mode mode = androidx.core.graphics.drawable.IconCompat.f16076k;
            bitmap.getClass();
            androidx.core.graphics.drawable.IconCompat iconCompat2 = new androidx.core.graphics.drawable.IconCompat(1);
            iconCompat2.f16078b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f16051h = iconCompat;
    }

    public final void e(androidx.core.app.C c9) {
        if (this.f16054l != c9) {
            this.f16054l = c9;
            c9.setBuilder(this);
        }
    }
}
