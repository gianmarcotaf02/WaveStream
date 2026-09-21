package p105m2;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import p072i.d;

public final class T implements IBinder.DeathRecipient {

    public final Messenger f25234a;

    public final d f25235b;

    public final Messenger f25236c;

    public int f25239f;
    public int g;

    public final Y f25241i;

    public int f25237d = 1;

    public int f25238e = 1;

    public final SparseArray f25240h = new SparseArray();

    public T(Y y, Messenger messenger) {
        this.f25241i = y;
        this.f25234a = messenger;
        d dVar = new d(this);
        this.f25235b = dVar;
        this.f25236c = new Messenger(dVar);
    }

    public final void a(int i3) {
        int i9 = this.f25237d;
        this.f25237d = i9 + 1;
        b(5, i9, i3, null, null);
    }

    public final boolean b(int i3, int i9, int i10, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i3;
        messageObtain.arg1 = i9;
        messageObtain.arg2 = i10;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.f25236c;
        try {
            this.f25234a.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e6) {
            if (i3 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e6);
            return false;
        }
    }

    @Override
    public final void binderDied() {
        Y y = this.f25241i;
        y.f25257q.post(new S(this, 1));
    }

    public final void c(int i3, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i9);
        int i10 = this.f25237d;
        this.f25237d = i10 + 1;
        b(7, i10, i3, null, bundle);
    }

    public final void d(int i3, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i9);
        int i10 = this.f25237d;
        this.f25237d = i10 + 1;
        b(8, i10, i3, null, bundle);
    }
}
