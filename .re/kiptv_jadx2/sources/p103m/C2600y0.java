package p103m;

import android.database.DataSetObserver;

public final class C2600y0 extends DataSetObserver {

    public final B0 f25150a;

    public C2600y0(B0 b9) {
        this.f25150a = b9;
    }

    @Override
    public final void onChanged() {
        B0 b9 = this.f25150a;
        if (b9.f24884F.isShowing()) {
            b9.e();
        }
    }

    @Override
    public final void onInvalidated() {
        this.f25150a.dismiss();
    }
}
