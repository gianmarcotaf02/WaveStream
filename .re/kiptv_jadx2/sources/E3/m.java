package E3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class m extends BasePendingResult {
    public final Status y;

    public m(Status status) {
        super(null);
        this.y = status;
    }

    @Override
    public final k k0(Status status) {
        return this.y;
    }
}
