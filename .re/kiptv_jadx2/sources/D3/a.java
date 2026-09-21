package D3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import androidx.media3.exoplayer.Renderer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a implements ServiceConnection {

    public boolean f2093h = false;

    public final LinkedBlockingQueue f2094i = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        }
        if (this.f2093h) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f2093h = true;
        IBinder iBinder = (IBinder) this.f2094i.poll(Renderer.DEFAULT_DURATION_TO_PROGRESS_US, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2094i.add(iBinder);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
