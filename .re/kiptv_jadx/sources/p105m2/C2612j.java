package p105m2;

/* JADX INFO: renamed from: m2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2612j extends p105m2.AbstractC2621t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f25331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p105m2.C2611i f25332b;

    public C2612j(java.lang.String str, p105m2.C2611i c2611i) {
        this.f25331a = str;
        this.f25332b = c2611i;
    }

    @Override // p105m2.AbstractC2621t
    public final void f(int i3) {
        p105m2.C2611i c2611i;
        android.media.MediaRouter2.RoutingController routingController;
        android.os.Messenger messenger;
        java.lang.String str = this.f25331a;
        if (str == null || (c2611i = this.f25332b) == null || (routingController = c2611i.g) == null || routingController.isReleased() || (messenger = c2611i.f25324h) == null) {
            return;
        }
        int andIncrement = c2611i.f25327l.getAndIncrement();
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("volume", i3);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = c2611i.f25325i;
        try {
            messenger.send(messageObtain);
        } catch (android.os.DeadObjectException unused) {
        } catch (android.os.RemoteException e6) {
            android.util.Log.e("MR2Provider", "Could not send control request to service.", e6);
        }
    }

    @Override // p105m2.AbstractC2621t
    public final void i(int i3) {
        p105m2.C2611i c2611i;
        android.media.MediaRouter2.RoutingController routingController;
        android.os.Messenger messenger;
        java.lang.String str = this.f25331a;
        if (str == null || (c2611i = this.f25332b) == null || (routingController = c2611i.g) == null || routingController.isReleased() || (messenger = c2611i.f25324h) == null) {
            return;
        }
        int andIncrement = c2611i.f25327l.getAndIncrement();
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("volume", i3);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = c2611i.f25325i;
        try {
            messenger.send(messageObtain);
        } catch (android.os.DeadObjectException unused) {
        } catch (android.os.RemoteException e6) {
            android.util.Log.e("MR2Provider", "Could not send control request to service.", e6);
        }
    }
}
