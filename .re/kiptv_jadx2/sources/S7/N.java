package S7;

import java.util.concurrent.ScheduledFuture;

public final class N implements O {

    public final ScheduledFuture f9551h;

    public N(ScheduledFuture scheduledFuture) {
        this.f9551h = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.f9551h.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f9551h + ']';
    }
}
