package androidx.core.app;

import D1.AbstractC0225j;
import D1.AbstractC0229n;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.kiptv.tv.R;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import p136q.C2662f;

public final class E implements InterfaceC1487g {

    public final Context f15974a;

    public final Notification.Builder f15975b;

    public final n f15976c;

    public final Bundle f15977d;

    public E(n nVar) throws Throwable {
        Throwable th;
        int i3;
        ?? r9;
        ArrayList arrayList;
        C1489i c1489iC;
        new ArrayList();
        this.f15977d = new Bundle();
        this.f15976c = nVar;
        Context context = nVar.f16045a;
        this.f15974a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15975b = AbstractC0229n.a(context, nVar.f16064v);
        } else {
            this.f15975b = new Notification.Builder(nVar.f16045a);
        }
        Notification notification = nVar.f16067z;
        Throwable th2 = null;
        int i9 = 2;
        this.f15975b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nVar.f16049e).setContentText(nVar.f16050f).setContentInfo(null).setContentIntent(nVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = this.f15975b;
        IconCompat iconCompat = nVar.f16051h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.i(context));
        this.f15975b.setSubText(nVar.f16055m).setUsesChronometer(nVar.f16053k).setPriority(nVar.f16052i);
        C c9 = nVar.f16054l;
        if (c9 instanceof s) {
            s sVar = (s) c9;
            PendingIntent pendingIntent = sVar.f16071d;
            C1489i c1489iC2 = pendingIntent == null ? sVar.c(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, sVar.f16074h, R.color.call_notification_decline_color, sVar.f16072e) : sVar.c(R.drawable.ic_call_decline, R.string.call_notification_decline_action, sVar.f16074h, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = sVar.f16070c;
            if (pendingIntent2 == null) {
                c1489iC = null;
            } else {
                boolean z6 = sVar.f16073f;
                c1489iC = sVar.c(z6 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z6 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, sVar.g, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(c1489iC2);
            ArrayList<C1489i> arrayList3 = sVar.mBuilder.f16046b;
            if (arrayList3 != null) {
                for (C1489i c1489i : arrayList3) {
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
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                a((C1489i) it.next());
            }
        } else {
            Iterator it2 = nVar.f16046b.iterator();
            while (it2.hasNext()) {
                a((C1489i) it2.next());
            }
        }
        Bundle bundle = nVar.f16061s;
        if (bundle != null) {
            this.f15977d.putAll(bundle);
        }
        int i10 = Build.VERSION.SDK_INT;
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
        ArrayList arrayList4 = nVar.f16044A;
        ArrayList<K> arrayList5 = nVar.f16047c;
        if (i10 < 28) {
            if (arrayList5 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList5.size());
                for (K k9 : arrayList5) {
                    String str = k9.f16000c;
                    if (str == null) {
                        CharSequence charSequence = k9.f15998a;
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList;
                } else {
                    C2662f c2662f = new C2662f(arrayList4.size() + arrayList.size());
                    c2662f.addAll(arrayList);
                    c2662f.addAll(arrayList4);
                    arrayList4 = new ArrayList(c2662f);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                this.f15975b.addPerson((String) it3.next());
            }
        }
        ArrayList arrayList6 = nVar.f16048d;
        if (arrayList6.size() > 0) {
            if (nVar.f16061s == null) {
                nVar.f16061s = new Bundle();
            }
            Bundle bundle2 = nVar.f16061s.getBundle("android.car.EXTENSIONS");
            ?? bundle3 = bundle2 == null ? new Bundle() : bundle2;
            ?? bundle4 = new Bundle((Bundle) bundle3);
            ?? bundle5 = new Bundle();
            int i11 = 0;
            while (i11 < arrayList6.size()) {
                String string = Integer.toString(i11);
                C1489i c1489i2 = (C1489i) arrayList6.get(i11);
                ?? bundle6 = new Bundle();
                IconCompat iconCompatA = c1489i2.a();
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.f() : 0);
                bundle6.putCharSequence(LinkHeader.Parameters.Title, c1489i2.g);
                bundle6.putParcelable("actionIntent", c1489i2.f16037h);
                Bundle bundle7 = c1489i2.f16031a;
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                Throwable th3 = th2;
                bundle8.putBoolean("android.support.allowGeneratedReplies", c1489i2.f16034d);
                bundle6.putBundle("extras", bundle8);
                M[] mArr = c1489i2.f16033c;
                if (mArr == null) {
                    r9 = th3;
                } else {
                    r9 = new Bundle[mArr.length];
                    if (mArr.length > 0) {
                        M m8 = mArr[0];
                        new Bundle();
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
                nVar.f16061s = new Bundle();
            }
            nVar.f16061s.putBundle("android.car.EXTENSIONS", bundle3);
            this.f15977d.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            th = null;
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f15975b.setExtras(nVar.f16061s);
        this.f15975b.setRemoteInputHistory(th);
        if (i12 >= 26) {
            AbstractC0229n.k(this.f15975b, nVar.f16065w);
            AbstractC0229n.r(this.f15975b);
            AbstractC0229n.s(this.f15975b);
            AbstractC0229n.t(this.f15975b);
            AbstractC0229n.n(this.f15975b);
            if (nVar.f16059q) {
                AbstractC0229n.l(this.f15975b, nVar.f16058p);
            }
            if (!TextUtils.isEmpty(nVar.f16064v)) {
                this.f15975b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            for (K k10 : arrayList5) {
                Notification.Builder builder2 = this.f15975b;
                k10.getClass();
                AbstractC0225j.a(builder2, AbstractC0225j.u(k10));
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            U0.b.j(this.f15975b, nVar.y);
            U0.b.k(this.f15975b);
        }
        if (i13 < 31 || (i3 = nVar.f16066x) == 0) {
            return;
        }
        D.b(this.f15975b, i3);
    }

    public final void a(C1489i c1489i) {
        IconCompat iconCompatA = c1489i.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.i(null) : null, c1489i.g, c1489i.f16037h);
        M[] mArr = c1489i.f16033c;
        if (mArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[mArr.length];
            if (mArr.length > 0) {
                M m8 = mArr[0];
                throw null;
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = c1489i.f16031a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z6 = c1489i.f16034d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z6);
        int i3 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z6);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i3 >= 28) {
            AbstractC0225j.s(builder);
        }
        if (i3 >= 29) {
            U0.b.l(builder);
        }
        if (i3 >= 31) {
            D.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", c1489i.f16035e);
        builder.addExtras(bundle2);
        this.f15975b.addAction(builder.build());
    }
}
