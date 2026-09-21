package p075i2;

import V3.b;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class c extends FutureTask {

    public final a f22761h;

    public c(a aVar, b bVar) {
        super(bVar);
        this.f22761h = aVar;
    }

    @Override
    public final void done() {
        a aVar = this.f22761h;
        try {
            Object obj = get();
            if (aVar.f22756l.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e6) {
            Log.w("AsyncTask", e6);
        } catch (CancellationException unused) {
            if (aVar.f22756l.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e9) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e9.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
