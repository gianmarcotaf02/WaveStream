package F3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class H {

    public final int f3566a;

    public H(int i3) {
        this.f3566a = i3;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(s sVar);

    public abstract void d(S.p pVar, boolean z6);
}
