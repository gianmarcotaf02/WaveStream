package F3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class m extends BasePendingResult {
    public final int y;

    public m(v vVar, int i3) {
        super(vVar);
        this.y = i3;
    }

    @Override
    public final E3.k k0(Status status) {
        switch (this.y) {
            case 0:
                return status;
            default:
                return new p199y3.k(status, 0);
        }
    }
}
