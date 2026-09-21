package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.M0;

public final class m0 extends IllegalArgumentException {
    public m0(int i3, int i9) {
        super(M0.k(i3, i9, "Unpaired surrogate at index ", " of "));
    }
}
