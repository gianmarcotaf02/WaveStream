package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class E implements androidx.core.app.InterfaceC1487g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f15974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.app.Notification.Builder f15975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.core.app.n f15976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f15977d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v35, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence[]] */
    /* JADX WARN: Type inference failed for: r6v43, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r6v44, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.os.Bundle] */
    public E(androidx.core.app.n nVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        int i3;
        ?? r9;
        java.util.ArrayList arrayList;
        androidx.core.app.C1489i c1489iC;
        new java.util.ArrayList();
        this.f15977d = new android.os.Bundle();
        this.f15976c = nVar;
        android.content.Context context = nVar.f16045a;
        this.f15974a = context;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f15975b = D1.AbstractC0229n.a(context, nVar.f16064v);
        } else {
            this.f15975b = new android.app.Notification.Builder(nVar.f16045a);
        }
        android.app.Notification notification = nVar.f16067z;
        java.lang.Throwable th2 = null;
        int i9 = 2;
        this.f15975b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nVar.f16049e).setContentText(nVar.f16050f).setContentInfo(null).setContentIntent(nVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        android.app.Notification.Builder builder = this.f15975b;
        androidx.core.graphics.drawable.IconCompat iconCompat = nVar.f16051h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.i(context));
        this.f15975b.setSubText(nVar.f16055m).setUsesChronometer(nVar.f16053k).setPriority(nVar.f16052i);
        androidx.core.app.C c9 = nVar.f16054l;
        if (c9 instanceof androidx.core.app.s) {
            androidx.core.app.s sVar = (androidx.core.app.s) c9;
            android.app.PendingIntent pendingIntent = sVar.f16071d;
            androidx.core.app.C1489i c1489iC2 = pendingIntent == null ? sVar.c(com.kiptv.tv.R.drawable.ic_call_decline, com.kiptv.tv.R.string.call_notification_hang_up_action, sVar.f16074h, com.kiptv.tv.R.color.call_notification_decline_color, sVar.f16072e) : sVar.c(com.kiptv.tv.R.drawable.ic_call_decline, com.kiptv.tv.R.string.call_notification_decline_action, sVar.f16074h, com.kiptv.tv.R.color.call_notification_decline_color, pendingIntent);
            android.app.PendingIntent pendingIntent2 = sVar.f16070c;
            if (pendingIntent2 == null) {
                c1489iC = null;
            } else {
                boolean z6 = sVar.f16073f;
                c1489iC = sVar.c(z6 ? com.kiptv.tv.R.drawable.ic_call_answer_video : com.kiptv.tv.R.drawable.ic_call_answer, z6 ? com.kiptv.tv.R.string.call_notification_answer_video_action : com.kiptv.tv.R.string.call_notification_answer_action, sVar.g, com.kiptv.tv.R.color.call_notification_answer_color, pendingIntent2);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
            arrayList2.add(c1489iC2);
            java.util.ArrayList<androidx.core.app.C1489i> arrayList3 = sVar.mBuilder.f16046b;
            if (arrayList3 != null) {
                for (androidx.core.app.C1489i c1489i : arrayList3) {
                    c1489i.getClass();
                    if (!c1489i.f16031a.getBoolean("key_action_priority") && i9 > 1) {
                        arrayList2.add(c1489i);
                        i9--;
                    }
                    if (c1489iC != null && i9 == 1) {
                        arrayList2.add(c1489iC);
                        i9--;
                    }
                }
            }
            if (c1489iC != null && i9 >= 1) {
                arrayList2.add(c1489iC);
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                a((androidx.core.app.C1489i) it.next());
            }
        } else {
            java.util.Iterator it2 = nVar.f16046b.iterator();
            while (it2.hasNext()) {
                a((androidx.core.app.C1489i) it2.next());
            }
        }
        android.os.Bundle bundle = nVar.f16061s;
        if (bundle != null) {
            this.f15977d.putAll(bundle);
        }
        int i10 = android.os.Build.VERSION.SDK_INT;
        this.f15975b.setShowWhen(nVar.j);
        this.f15975b.setLocalOnly(nVar.f16057o);
        this.f15975b.setGroup(nVar.f16056n);
        this.f15975b.setSortKey(null);
        this.f15975b.setGroupSummary(false);
        this.f15975b.setCategory(nVar.f16060r);
        this.f15975b.setColor(nVar.f16062t);
        this.f15975b.setVisibility(nVar.f16063u);
        this.f15975b.setPublicVersion(null);
        this.f15975b.setSound(notification.sound, notification.audioAttributes);
        java.util.ArrayList arrayList4 = nVar.f16044A;
        java.util.ArrayList<androidx.core.app.K> arrayList5 = nVar.f16047c;
        if (i10 < 28) {
            if (arrayList5 == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(arrayList5.size());
                for (androidx.core.app.K k9 : arrayList5) {
                    java.lang.String str = k9.f16000c;
                    if (str == null) {
                        java.lang.CharSequence charSequence = k9.f15998a;
                        str = charSequence != null ? "name:" + ((java.lang.Object) charSequence) : "";
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList;
                } else {
                    p136q.C2662f c2662f = new p136q.C2662f(arrayList4.size() + arrayList.size());
                    c2662f.addAll(arrayList);
                    c2662f.addAll(arrayList4);
                    arrayList4 = new java.util.ArrayList(c2662f);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            java.util.Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                this.f15975b.addPerson((java.lang.String) it3.next());
            }
        }
        java.util.ArrayList arrayList6 = nVar.f16048d;
        if (arrayList6.size() > 0) {
            if (nVar.f16061s == null) {
                nVar.f16061s = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = nVar.f16061s.getBundle("android.car.EXTENSIONS");
            ?? bundle3 = bundle2 == null ? new android.os.Bundle() : bundle2;
            ?? bundle4 = new android.os.Bundle((android.os.Bundle) bundle3);
            ?? bundle5 = new android.os.Bundle();
            int i11 = 0;
            while (i11 < arrayList6.size()) {
                java.lang.String string = java.lang.Integer.toString(i11);
                androidx.core.app.C1489i c1489i2 = (androidx.core.app.C1489i) arrayList6.get(i11);
                ?? bundle6 = new android.os.Bundle();
                androidx.core.graphics.drawable.IconCompat iconCompatA = c1489i2.a();
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.f() : 0);
                bundle6.putCharSequence(io.ktor.http.LinkHeader.Parameters.Title, c1489i2.g);
                bundle6.putParcelable("actionIntent", c1489i2.f16037h);
                android.os.Bundle bundle7 = c1489i2.f16031a;
                android.os.Bundle bundle8 = bundle7 != null ? new android.os.Bundle(bundle7) : new android.os.Bundle();
                java.lang.Throwable th3 = th2;
                bundle8.putBoolean("android.support.allowGeneratedReplies", c1489i2.f16034d);
                bundle6.putBundle("extras", bundle8);
                androidx.core.app.M[] mArr = c1489i2.f16033c;
                if (mArr == null) {
                    r9 = th3;
                } else {
                    r9 = new android.os.Bundle[mArr.length];
                    if (mArr.length > 0) {
                        androidx.core.app.M m8 = mArr[0];
                        new android.os.Bundle();
                        throw th3;
                    }
                }
                bundle6.putParcelableArray("remoteInputs", r9);
                bundle6.putBoolean("showsUserInterface", c1489i2.f16035e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i11++;
                th2 = th3;
            }
            th = th2;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (nVar.f16061s == null) {
                nVar.f16061s = new android.os.Bundle();
            }
            nVar.f16061s.putBundle("android.car.EXTENSIONS", bundle3);
            this.f15977d.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            th = null;
        }
        int i12 = android.os.Build.VERSION.SDK_INT;
        this.f15975b.setExtras(nVar.f16061s);
        this.f15975b.setRemoteInputHistory(th);
        if (i12 >= 26) {
            D1.AbstractC0229n.k(this.f15975b, nVar.f16065w);
            D1.AbstractC0229n.r(this.f15975b);
            D1.AbstractC0229n.s(this.f15975b);
            D1.AbstractC0229n.t(this.f15975b);
            D1.AbstractC0229n.n(this.f15975b);
            if (nVar.f16059q) {
                D1.AbstractC0229n.l(this.f15975b, nVar.f16058p);
            }
            if (!android.text.TextUtils.isEmpty(nVar.f16064v)) {
                this.f15975b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            for (androidx.core.app.K k10 : arrayList5) {
                android.app.Notification.Builder builder2 = this.f15975b;
                k10.getClass();
                D1.AbstractC0225j.a(builder2, D1.AbstractC0225j.u(k10));
            }
        }
        int i13 = android.os.Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            U0.b.j(this.f15975b, nVar.y);
            U0.b.k(this.f15975b);
        }
        if (i13 < 31 || (i3 = nVar.f16066x) == 0) {
            return;
        }
        androidx.core.app.D.b(this.f15975b, i3);
    }

    public final void a(androidx.core.app.C1489i c1489i) {
        androidx.core.graphics.drawable.IconCompat iconCompatA = c1489i.a();
        android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompatA != null ? iconCompatA.i(null) : null, c1489i.g, c1489i.f16037h);
        androidx.core.app.M[] mArr = c1489i.f16033c;
        if (mArr != null) {
            android.app.RemoteInput[] remoteInputArr = new android.app.RemoteInput[mArr.length];
            if (mArr.length > 0) {
                androidx.core.app.M m8 = mArr[0];
                throw null;
            }
            for (android.app.RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        android.os.Bundle bundle = c1489i.f16031a;
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        boolean z6 = c1489i.f16034d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z6);
        int i3 = android.os.Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z6);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i3 >= 28) {
            D1.AbstractC0225j.s(builder);
        }
        if (i3 >= 29) {
            U0.b.l(builder);
        }
        if (i3 >= 31) {
            androidx.core.app.D.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", c1489i.f16035e);
        builder.addExtras(bundle2);
        this.f15975b.addAction(builder.build());
    }
}
