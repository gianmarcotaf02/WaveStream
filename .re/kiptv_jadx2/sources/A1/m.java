package A1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class m implements Executor {

    public final int f155h;

    public final Handler f156i;

    public m(Handler handler, int i3) {
        this.f155h = i3;
        this.f156i = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f155h) {
            case 0:
                runnable.getClass();
                Handler handler = this.f156i;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f156i;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
