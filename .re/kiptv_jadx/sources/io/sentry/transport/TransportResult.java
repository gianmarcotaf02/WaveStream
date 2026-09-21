package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransportResult {

    public static final class ErrorTransportResult extends io.sentry.transport.TransportResult {
        private final int responseCode;

        public ErrorTransportResult(int i3) {
            super();
            this.responseCode = i3;
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return this.responseCode;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return false;
        }
    }

    public static final class SuccessTransportResult extends io.sentry.transport.TransportResult {
        static final io.sentry.transport.TransportResult.SuccessTransportResult INSTANCE = new io.sentry.transport.TransportResult.SuccessTransportResult();

        private SuccessTransportResult() {
            super();
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return -1;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return true;
        }
    }

    public static io.sentry.transport.TransportResult error(int i3) {
        return new io.sentry.transport.TransportResult.ErrorTransportResult(i3);
    }

    public static io.sentry.transport.TransportResult success() {
        return io.sentry.transport.TransportResult.SuccessTransportResult.INSTANCE;
    }

    public abstract int getResponseCode();

    public abstract boolean isSuccess();

    private TransportResult() {
    }

    public static io.sentry.transport.TransportResult error() {
        return error(-1);
    }
}
