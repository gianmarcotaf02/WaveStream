package p105m2;

/* JADX INFO: renamed from: m2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2613k extends android.media.MediaRouter2$RouteCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p105m2.C2615m f25334b;

    public /* synthetic */ C2613k(p105m2.C2615m c2615m, int i3) {
        this.f25333a = i3;
        this.f25334b = c2615m;
    }

    public void onRoutesAdded(java.util.List list) {
        switch (this.f25333a) {
            case 0:
                this.f25334b.i();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    public void onRoutesChanged(java.util.List list) {
        switch (this.f25333a) {
            case 0:
                this.f25334b.i();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    public void onRoutesRemoved(java.util.List list) {
        switch (this.f25333a) {
            case 0:
                this.f25334b.i();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    public void onRoutesUpdated(java.util.List list) {
        switch (this.f25333a) {
            case 1:
                this.f25334b.i();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
