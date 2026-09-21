package androidx.core.app;

import D1.AbstractC0225j;
import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class B extends C {

    public final ArrayList f15969a = new ArrayList();

    public final ArrayList f15970b = new ArrayList();

    public K f15971c;

    public CharSequence f15972d;

    public Boolean f15973e;

    @Override
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f15971c.f15998a);
        bundle.putBundle("android.messagingStyleUser", this.f15971c.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f15972d);
        if (this.f15972d != null && this.f15973e.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f15972d);
        }
        ArrayList arrayList = this.f15969a;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", A.a(arrayList));
        }
        ArrayList arrayList2 = this.f15970b;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", A.a(arrayList2));
        }
        Boolean bool = this.f15973e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void apply(InterfaceC1487g interfaceC1487g) {
        Notification.MessagingStyle messagingStyleB;
        n nVar = this.mBuilder;
        boolean zBooleanValue = false;
        if (nVar == null || nVar.f16045a.getApplicationInfo().targetSdkVersion >= 28 || this.f15973e != null) {
            Boolean bool = this.f15973e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.f15972d != null) {
            zBooleanValue = true;
        }
        this.f15973e = Boolean.valueOf(zBooleanValue);
        if (Build.VERSION.SDK_INT >= 28) {
            K k9 = this.f15971c;
            k9.getClass();
            messagingStyleB = x.a(AbstractC0225j.u(k9));
        } else {
            messagingStyleB = v.b(this.f15971c.f15998a);
        }
        Iterator it = this.f15969a.iterator();
        while (it.hasNext()) {
            v.a(messagingStyleB, ((A) it.next()).c());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it2 = this.f15970b.iterator();
            while (it2.hasNext()) {
                w.a(messagingStyleB, ((A) it2.next()).c());
            }
        }
        if (this.f15973e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            v.c(messagingStyleB, this.f15972d);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            x.b(messagingStyleB, this.f15973e.booleanValue());
        }
        messagingStyleB.setBuilder(((E) interfaceC1487g).f15975b);
    }

    @Override
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.f15969a;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f15971c = K.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            K k9 = new K();
            k9.f15998a = string;
            k9.f15999b = null;
            k9.f16000c = null;
            k9.f16001d = null;
            k9.f16002e = false;
            k9.f16003f = false;
            this.f15971c = k9;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f15972d = charSequence;
        if (charSequence == null) {
            this.f15972d = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(A.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f15970b.addAll(A.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f15973e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }
}
