package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    java.lang.CharSequence mBigContentTitle;
    protected androidx.core.app.n mBuilder;
    java.lang.CharSequence mSummaryText;
    boolean mSummaryTextSet = false;

    public static androidx.core.app.C constructCompatStyleByName(java.lang.String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                return new androidx.core.app.u();
            case "androidx.core.app.NotificationCompat$BigPictureStyle":
                return new androidx.core.app.C1492l();
            case "androidx.core.app.NotificationCompat$CallStyle":
                return new androidx.core.app.s();
            case "androidx.core.app.NotificationCompat$InboxStyle":
                return new androidx.core.app.C1493m(1);
            case "androidx.core.app.NotificationCompat$BigTextStyle":
                return new androidx.core.app.C1493m(0);
            case "androidx.core.app.NotificationCompat$MessagingStyle":
                return new androidx.core.app.B();
            default:
                return null;
        }
    }

    public static androidx.core.app.C constructCompatStyleForBundle(android.os.Bundle bundle) {
        androidx.core.app.C cConstructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
        if (cConstructCompatStyleByName != null) {
            return cConstructCompatStyleByName;
        }
        if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
            return new androidx.core.app.B();
        }
        if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
            return new androidx.core.app.C1492l();
        }
        if (bundle.containsKey("android.bigText")) {
            return new androidx.core.app.C1493m(0);
        }
        if (bundle.containsKey("android.textLines")) {
            return new androidx.core.app.C1493m(1);
        }
        if (bundle.containsKey("android.callType")) {
            return new androidx.core.app.s();
        }
        java.lang.String string = bundle.getString("android.template");
        if (string == null) {
            return null;
        }
        if (string.equals(android.app.Notification.BigPictureStyle.class.getName())) {
            return new androidx.core.app.C1492l();
        }
        if (string.equals(android.app.Notification.BigTextStyle.class.getName())) {
            return new androidx.core.app.C1493m(0);
        }
        if (string.equals(android.app.Notification.InboxStyle.class.getName())) {
            return new androidx.core.app.C1493m(1);
        }
        if (string.equals(android.app.Notification.MessagingStyle.class.getName())) {
            return new androidx.core.app.B();
        }
        if (string.equals(android.app.Notification.DecoratedCustomViewStyle.class.getName())) {
            return new androidx.core.app.u();
        }
        return null;
    }

    public static androidx.core.app.C constructStyleForExtras(android.os.Bundle bundle) {
        androidx.core.app.C cConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
        if (cConstructCompatStyleForBundle == null) {
            return null;
        }
        try {
            cConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
            return cConstructCompatStyleForBundle;
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public static androidx.core.app.C extractStyleFromNotification(android.app.Notification notification) {
        android.os.Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        return constructStyleForExtras(bundle);
    }

    public final android.graphics.Bitmap a(androidx.core.graphics.drawable.IconCompat iconCompat, int i3, int i9) {
        java.lang.Object obj;
        android.content.res.Resources resourcesForApplication;
        android.content.Context context = this.mBuilder.f16045a;
        if (iconCompat.f16077a == 2 && (obj = iconCompat.f16078b) != null) {
            java.lang.String str = (java.lang.String) obj;
            if (str.contains(":")) {
                java.lang.String str2 = str.split(":", -1)[1];
                java.lang.String str3 = str2.split("/", -1)[0];
                java.lang.String str4 = str2.split("/", -1)[1];
                java.lang.String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    android.util.Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    java.lang.String strG = iconCompat.g();
                    if (com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM.equals(strG)) {
                        resourcesForApplication = android.content.res.Resources.getSystem();
                    } else {
                        android.content.pm.PackageManager packageManager = context.getPackageManager();
                        try {
                            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strG, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                            android.util.Log.e("IconCompat", "Unable to find pkg=" + strG + " for icon", e6);
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (iconCompat.f16081e != identifier) {
                        android.util.Log.i("IconCompat", "Id has changed for " + strG + io.ktor.sse.ServerSentEventKt.SPACE + str);
                        iconCompat.f16081e = identifier;
                    }
                }
            }
        }
        android.graphics.drawable.Drawable drawableLoadDrawable = iconCompat.i(context).loadDrawable(context);
        int intrinsicWidth = i9 == 0 ? drawableLoadDrawable.getIntrinsicWidth() : i9;
        if (i9 == 0) {
            i9 = drawableLoadDrawable.getIntrinsicHeight();
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(intrinsicWidth, i9, android.graphics.Bitmap.Config.ARGB_8888);
        drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i9);
        if (i3 != 0) {
            drawableLoadDrawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i3, android.graphics.PorterDuff.Mode.SRC_IN));
        }
        drawableLoadDrawable.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public void addCompatExtras(android.os.Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        java.lang.CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        java.lang.String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public abstract void apply(androidx.core.app.InterfaceC1487g interfaceC1487g);

    public android.widget.RemoteViews applyStandardTemplate(boolean z6, int i3, boolean z9) {
        boolean z10;
        int i9;
        android.content.res.Resources resources = this.mBuilder.f16045a.getResources();
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.mBuilder.f16045a.getPackageName(), i3);
        androidx.core.app.n nVar = this.mBuilder;
        int i10 = nVar.f16052i;
        if (nVar.f16051h != null) {
            remoteViews.setViewVisibility(com.kiptv.tv.R.id.icon, 0);
            remoteViews.setImageViewBitmap(com.kiptv.tv.R.id.icon, createColoredBitmap(this.mBuilder.f16051h, 0));
            if (z6 && this.mBuilder.f16067z.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_small_icon_background_padding) * 2);
                androidx.core.app.n nVar2 = this.mBuilder;
                remoteViews.setImageViewBitmap(com.kiptv.tv.R.id.right_icon, b(nVar2.f16067z.icon, dimensionPixelSize, dimensionPixelSize2, nVar2.f16062t));
                remoteViews.setViewVisibility(com.kiptv.tv.R.id.right_icon, 0);
            }
        } else if (z6 && nVar.f16067z.icon != 0) {
            remoteViews.setViewVisibility(com.kiptv.tv.R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_big_circle_margin);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_small_icon_size_as_large);
            androidx.core.app.n nVar3 = this.mBuilder;
            remoteViews.setImageViewBitmap(com.kiptv.tv.R.id.icon, b(nVar3.f16067z.icon, dimensionPixelSize3, dimensionPixelSize4, nVar3.f16062t));
        }
        java.lang.CharSequence charSequence = this.mBuilder.f16049e;
        if (charSequence != null) {
            remoteViews.setTextViewText(com.kiptv.tv.R.id.title, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.mBuilder.f16050f;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(com.kiptv.tv.R.id.text, charSequence2);
            z10 = true;
        } else {
            z10 = false;
        }
        this.mBuilder.getClass();
        this.mBuilder.getClass();
        remoteViews.setViewVisibility(com.kiptv.tv.R.id.info, 8);
        java.lang.CharSequence charSequence3 = this.mBuilder.f16055m;
        if (charSequence3 != null) {
            remoteViews.setTextViewText(com.kiptv.tv.R.id.text, charSequence3);
            java.lang.CharSequence charSequence4 = this.mBuilder.f16050f;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(com.kiptv.tv.R.id.text2, charSequence4);
                remoteViews.setViewVisibility(com.kiptv.tv.R.id.text2, 0);
                if (z9) {
                    remoteViews.setTextViewTextSize(com.kiptv.tv.R.id.text, 0, resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_subtext_size));
                }
                remoteViews.setViewPadding(com.kiptv.tv.R.id.line1, 0, 0, 0, 0);
            } else {
                remoteViews.setViewVisibility(com.kiptv.tv.R.id.text2, 8);
            }
        }
        androidx.core.app.n nVar4 = this.mBuilder;
        if ((nVar4.j ? nVar4.f16067z.when : 0L) != 0) {
            if (nVar4.f16053k) {
                remoteViews.setViewVisibility(com.kiptv.tv.R.id.chronometer, 0);
                androidx.core.app.n nVar5 = this.mBuilder;
                remoteViews.setLong(com.kiptv.tv.R.id.chronometer, "setBase", (android.os.SystemClock.elapsedRealtime() - java.lang.System.currentTimeMillis()) + (nVar5.j ? nVar5.f16067z.when : 0L));
                remoteViews.setBoolean(com.kiptv.tv.R.id.chronometer, "setStarted", true);
                this.mBuilder.getClass();
            } else {
                remoteViews.setViewVisibility(com.kiptv.tv.R.id.time, 0);
                androidx.core.app.n nVar6 = this.mBuilder;
                remoteViews.setLong(com.kiptv.tv.R.id.time, "setTime", nVar6.j ? nVar6.f16067z.when : 0L);
            }
            i9 = 0;
        } else {
            i9 = 8;
        }
        remoteViews.setViewVisibility(com.kiptv.tv.R.id.right_side, i9);
        remoteViews.setViewVisibility(com.kiptv.tv.R.id.line3, z10 ? 0 : 8);
        return remoteViews;
    }

    public final android.graphics.Bitmap b(int i3, int i9, int i10, int i11) {
        if (i11 == 0) {
            i11 = 0;
        }
        android.graphics.Bitmap bitmapA = a(androidx.core.graphics.drawable.IconCompat.d(this.mBuilder.f16045a, com.kiptv.tv.R.drawable.notification_icon_background), i11, i9);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapA);
        android.graphics.drawable.Drawable drawableMutate = this.mBuilder.f16045a.getResources().getDrawable(i3).mutate();
        drawableMutate.setFilterBitmap(true);
        int i12 = (i9 - i10) / 2;
        int i13 = i10 + i12;
        drawableMutate.setBounds(i12, i12, i13, i13);
        drawableMutate.setColorFilter(new android.graphics.PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP));
        drawableMutate.draw(canvas);
        return bitmapA;
    }

    public android.app.Notification build() {
        androidx.core.app.n nVar = this.mBuilder;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    public void buildIntoRemoteViews(android.widget.RemoteViews remoteViews, android.widget.RemoteViews remoteViews2) {
        remoteViews.setViewVisibility(com.kiptv.tv.R.id.title, 8);
        remoteViews.setViewVisibility(com.kiptv.tv.R.id.text2, 8);
        remoteViews.setViewVisibility(com.kiptv.tv.R.id.text, 8);
        remoteViews.removeAllViews(com.kiptv.tv.R.id.notification_main_column);
        remoteViews.addView(com.kiptv.tv.R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(com.kiptv.tv.R.id.notification_main_column, 0);
        android.content.res.Resources resources = this.mBuilder.f16045a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.notification_top_pad_large_text);
        float f9 = resources.getConfiguration().fontScale;
        if (f9 < 1.0f) {
            f9 = 1.0f;
        } else if (f9 > 1.3f) {
            f9 = 1.3f;
        }
        float f10 = (f9 - 1.0f) / 0.29999995f;
        remoteViews.setViewPadding(com.kiptv.tv.R.id.notification_main_column_container, 0, java.lang.Math.round((f10 * dimensionPixelSize2) + ((1.0f - f10) * dimensionPixelSize)), 0, 0);
    }

    public void clearCompatExtraKeys(android.os.Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat iconCompat, int i3) {
        return a(iconCompat, i3, 0);
    }

    public boolean displayCustomViewInline() {
        return false;
    }

    public java.lang.String getClassName() {
        return null;
    }

    public android.widget.RemoteViews makeBigContentView(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        return null;
    }

    public android.widget.RemoteViews makeContentView(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        return null;
    }

    public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        return null;
    }

    public void restoreFromCompatExtras(android.os.Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.mSummaryText = bundle.getCharSequence("android.summaryText");
            this.mSummaryTextSet = true;
        }
        this.mBigContentTitle = bundle.getCharSequence("android.title.big");
    }

    public void setBuilder(androidx.core.app.n nVar) {
        if (this.mBuilder != nVar) {
            this.mBuilder = nVar;
            if (nVar != null) {
                nVar.e(this);
            }
        }
    }

    public android.graphics.Bitmap createColoredBitmap(int i3, int i9) {
        return a(androidx.core.graphics.drawable.IconCompat.d(this.mBuilder.f16045a, i3), i9, 0);
    }
}
