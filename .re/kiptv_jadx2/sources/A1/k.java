package A1;

import android.os.Process;

public final class k extends Thread {

    public final int f154h;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f154h = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f154h);
        super.run();
    }
}
