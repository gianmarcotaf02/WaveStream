package androidx.media3.datasource;

import java.io.IOException;

public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int i3) {
        this.reason = i3;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th, int i3) {
        super(th);
        this.reason = i3;
    }

    public DataSourceException(String str, int i3) {
        super(str);
        this.reason = i3;
    }

    public DataSourceException(String str, Throwable th, int i3) {
        super(str, th);
        this.reason = i3;
    }
}
