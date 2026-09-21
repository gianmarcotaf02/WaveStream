package M8;

import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

public final class J extends C0678f {

    public final Socket f7230m;

    public J(Socket socket) {
        this.f7230m = socket;
    }

    @Override
    public final void k() {
        Socket socket = this.f7230m;
        try {
            socket.close();
        } catch (AssertionError e6) {
            if (!AbstractC0674b.f(e6)) {
                throw e6;
            }
            y.f7290a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        } catch (Exception e9) {
            y.f7290a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
