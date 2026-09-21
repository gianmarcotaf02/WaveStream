package F3;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class q implements Executor {

    public final int f3618h;

    public final Object f3619i;

    public q(int i3, Object obj) {
        this.f3618h = i3;
        this.f3619i = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f3618h) {
            case 0:
                ((Z3.d) this.f3619i).post(runnable);
                break;
            case 1:
                ((ExecutorService) this.f3619i).execute(new B3.r(10, runnable));
                break;
            default:
                ((Z3.d) this.f3619i).post(runnable);
                break;
        }
    }

    public q() {
        this.f3618h = 2;
        Z3.d dVar = new Z3.d(Looper.getMainLooper(), 3, false);
        Looper.getMainLooper();
        this.f3619i = dVar;
    }
}
