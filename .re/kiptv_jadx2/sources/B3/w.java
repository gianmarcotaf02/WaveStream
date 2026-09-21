package B3;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.cast.AbstractC1818z;

public final class w extends X3.g implements g {

    public final int f673d;

    public final p059g4.d f674e;

    public w(int i3, p059g4.d dVar) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 3);
        this.f673d = i3;
        this.f674e = dVar;
    }

    @Override
    public final void K(Bundle bundle) {
        switch (this.f673d) {
            case 0:
                this.f674e.b(bundle);
                break;
            case 1:
                this.f674e.b(bundle);
                break;
            default:
                this.f674e.b(bundle);
                break;
        }
    }

    @Override
    public final boolean c0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1818z.a(parcel, Bundle.CREATOR);
        AbstractC1818z.b(parcel);
        K(bundle);
        return true;
    }
}
