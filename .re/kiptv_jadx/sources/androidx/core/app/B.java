package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class B extends androidx.core.app.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f15969a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f15970b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.core.app.K f15971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f15972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f15973e;

    @Override // androidx.core.app.C
    public final void addCompatExtras(android.os.Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f15971c.f15998a);
        bundle.putBundle("android.messagingStyleUser", this.f15971c.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f15972d);
        if (this.f15972d != null && this.f15973e.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f15972d);
        }
        java.util.ArrayList arrayList = this.f15969a;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", androidx.core.app.A.a(arrayList));
        }
        java.util.ArrayList arrayList2 = this.f15970b;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", androidx.core.app.A.a(arrayList2));
        }
        java.lang.Boolean bool = this.f15973e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // androidx.core.app.C
    public final void apply(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        android.app.Notification.MessagingStyle messagingStyleB;
        androidx.core.app.n nVar = this.mBuilder;
        boolean zBooleanValue = false;
        if (nVar == null || nVar.f16045a.getApplicationInfo().targetSdkVersion >= 28 || this.f15973e != null) {
            java.lang.Boolean bool = this.f15973e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.f15972d != null) {
            zBooleanValue = true;
        }
        this.f15973e = java.lang.Boolean.valueOf(zBooleanValue);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.K k9 = this.f15971c;
            k9.getClass();
            messagingStyleB = androidx.core.app.x.a(D1.AbstractC0225j.u(k9));
        } else {
            messagingStyleB = androidx.core.app.v.b(this.f15971c.f15998a);
        }
        java.util.Iterator it = this.f15969a.iterator();
        while (it.hasNext()) {
            androidx.core.app.v.a(messagingStyleB, ((androidx.core.app.A) it.next()).c());
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.util.Iterator it2 = this.f15970b.iterator();
            while (it2.hasNext()) {
                androidx.core.app.w.a(messagingStyleB, ((androidx.core.app.A) it2.next()).c());
            }
        }
        if (this.f15973e.booleanValue() || android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.v.c(messagingStyleB, this.f15972d);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.x.b(messagingStyleB, this.f15973e.booleanValue());
        }
        messagingStyleB.setBuilder(((androidx.core.app.E) interfaceC1487g).f15975b);
    }

    @Override // androidx.core.app.C
    public final void clearCompatExtraKeys(android.os.Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // androidx.core.app.C
    public final java.lang.String getClassName() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // androidx.core.app.C
    public final void restoreFromCompatExtras(android.os.Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        java.util.ArrayList arrayList = this.f15969a;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f15971c = androidx.core.app.K.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            java.lang.String string = bundle.getString("android.selfDisplayName");
            androidx.core.app.K k9 = new androidx.core.app.K();
            k9.f15998a = string;
            k9.f15999b = null;
            k9.f16000c = null;
            k9.f16001d = null;
            k9.f16002e = false;
            k9.f16003f = false;
            this.f15971c = k9;
        }
        java.lang.CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f15972d = charSequence;
        if (charSequence == null) {
            this.f15972d = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(androidx.core.app.A.b(parcelableArray));
        }
        android.os.Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f15970b.addAll(androidx.core.app.A.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f15973e = java.lang.Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }
}
