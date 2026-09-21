package p147r2;

import android.content.Context;
import androidx.media3.exoplayer.dash.offline.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class e implements Runnable {

    public final int f26816h;

    public final Context f26817i;

    public e(Context context, int i3) {
        this.f26816h = i3;
        this.f26817i = context;
    }

    @Override
    public final void run() {
        switch (this.f26816h) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f26817i, 1));
                break;
            default:
                c.t(this.f26817i, new a(), c.f26806a, false);
                break;
        }
    }
}
