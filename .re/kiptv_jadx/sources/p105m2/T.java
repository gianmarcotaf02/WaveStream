package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class T implements android.os.IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Messenger f25234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p072i.d f25235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Messenger f25236c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25239f;
    public int g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p105m2.Y f25241i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25237d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25238e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f25240h = new android.util.SparseArray();

    public T(p105m2.Y y, android.os.Messenger messenger) {
        this.f25241i = y;
        this.f25234a = messenger;
        p072i.d dVar = new p072i.d(this);
        this.f25235b = dVar;
        this.f25236c = new android.os.Messenger(dVar);
    }

    public final void a(int i3) {
        int i9 = this.f25237d;
        this.f25237d = i9 + 1;
        b(5, i9, i3, null, null);
    }

    public final boolean b(int i3, int i9, int i10, android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = i3;
        messageObtain.arg1 = i9;
        messageObtain.arg2 = i10;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.f25236c;
        try {
            this.f25234a.send(messageObtain);
            return true;
        } catch (android.os.DeadObjectException unused) {
            return false;
        } catch (android.os.RemoteException e6) {
            if (i3 == 2) {
                return false;
            }
            android.util.Log.e("MediaRouteProviderProxy", "Could not send message to service.", e6);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        p105m2.Y y = this.f25241i;
        y.f25257q.post(new p105m2.S(this, 1));
    }

    public final void c(int i3, int i9) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("volume", i9);
        int i10 = this.f25237d;
        this.f25237d = i10 + 1;
        b(7, i10, i3, null, bundle);
    }

    public final void d(int i3, int i9) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("volume", i9);
        int i10 = this.f25237d;
        this.f25237d = i10 + 1;
        b(8, i10, i3, null, bundle);
    }
}
