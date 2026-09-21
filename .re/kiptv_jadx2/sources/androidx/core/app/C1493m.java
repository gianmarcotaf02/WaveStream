package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class C1493m extends C {

    public final int f16042a;

    public Object f16043b;

    public C1493m(int i3) {
        this.f16042a = i3;
        switch (i3) {
            case 1:
                this.f16043b = new ArrayList();
                break;
        }
    }

    @Override
    public final void apply(InterfaceC1487g interfaceC1487g) {
        switch (this.f16042a) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((E) interfaceC1487g).f15975b).setBigContentTitle(this.mBigContentTitle).bigText((CharSequence) this.f16043b);
                if (this.mSummaryTextSet) {
                    bigTextStyleBigText.setSummaryText(this.mSummaryText);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((E) interfaceC1487g).f15975b).setBigContentTitle(this.mBigContentTitle);
                if (this.mSummaryTextSet) {
                    bigContentTitle.setSummaryText(this.mSummaryText);
                }
                Iterator it = ((ArrayList) this.f16043b).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override
    public final void clearCompatExtraKeys(Bundle bundle) {
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

    @Override
    public final String getClassName() {
        switch (this.f16042a) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override
    public final void restoreFromCompatExtras(Bundle bundle) {
        switch (this.f16042a) {
            case 0:
                super.restoreFromCompatExtras(bundle);
                this.f16043b = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.restoreFromCompatExtras(bundle);
                ArrayList arrayList = (ArrayList) this.f16043b;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                }
                break;
        }
    }
}
