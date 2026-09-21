package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends java.io.IOException {

    @java.lang.Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int i3) {
        this.reason = i3;
    }

    public static boolean isCausedByPositionOutOfRange(java.io.IOException iOException) {
        for (java.lang.Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof androidx.media3.datasource.DataSourceException) && ((androidx.media3.datasource.DataSourceException) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(java.lang.Throwable th, int i3) {
        super(th);
        this.reason = i3;
    }

    public DataSourceException(java.lang.String str, int i3) {
        super(str);
        this.reason = i3;
    }

    public DataSourceException(java.lang.String str, java.lang.Throwable th, int i3) {
        super(str, th);
        this.reason = i3;
    }
}
