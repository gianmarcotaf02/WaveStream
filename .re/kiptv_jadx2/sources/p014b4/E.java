package p014b4;

import android.os.IBinder;
import android.os.IInterface;

public final class E implements IInterface {

    public final IBinder f17875c;

    public final String f17876d;

    public E(IBinder iBinder, String str) {
        this.f17875c = iBinder;
        this.f17876d = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f17875c;
    }
}
