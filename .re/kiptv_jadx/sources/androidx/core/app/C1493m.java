package androidx.core.app;

/* JADX INFO: renamed from: androidx.core.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1493m extends androidx.core.app.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f16043b;

    public C1493m(int i3) {
        this.f16042a = i3;
        switch (i3) {
            case 1:
                this.f16043b = new java.util.ArrayList();
                break;
        }
    }

    @Override // androidx.core.app.C
    public final void apply(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        switch (this.f16042a) {
            case 0:
                android.app.Notification.BigTextStyle bigTextStyleBigText = new android.app.Notification.BigTextStyle(((androidx.core.app.E) interfaceC1487g).f15975b).setBigContentTitle(this.mBigContentTitle).bigText((java.lang.CharSequence) this.f16043b);
                if (this.mSummaryTextSet) {
                    bigTextStyleBigText.setSummaryText(this.mSummaryText);
                }
                break;
            default:
                android.app.Notification.InboxStyle bigContentTitle = new android.app.Notification.InboxStyle(((androidx.core.app.E) interfaceC1487g).f15975b).setBigContentTitle(this.mBigContentTitle);
                if (this.mSummaryTextSet) {
                    bigContentTitle.setSummaryText(this.mSummaryText);
                }
                java.util.Iterator it = ((java.util.ArrayList) this.f16043b).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((java.lang.CharSequence) it.next());
                }
                break;
        }
    }

    @Override // androidx.core.app.C
    public final void clearCompatExtraKeys(android.os.Bundle bundle) {
        switch (this.f16042a) {
            case 0:
                super.clearCompatExtraKeys(bundle);
                bundle.remove("android.bigText");
                break;
            default:
                super.clearCompatExtraKeys(bundle);
                bundle.remove("android.textLines");
                break;
        }
    }

    @Override // androidx.core.app.C
    public final java.lang.String getClassName() {
        switch (this.f16042a) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // androidx.core.app.C
    public final void restoreFromCompatExtras(android.os.Bundle bundle) {
        switch (this.f16042a) {
            case 0:
                super.restoreFromCompatExtras(bundle);
                this.f16043b = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.restoreFromCompatExtras(bundle);
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f16043b;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    java.util.Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                }
                break;
        }
    }
}
