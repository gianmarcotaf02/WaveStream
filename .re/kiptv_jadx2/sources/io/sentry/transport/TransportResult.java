package io.sentry.transport;

public abstract class TransportResult {

    public static final class ErrorTransportResult extends TransportResult {
        private final int responseCode;

        public ErrorTransportResult(int i3) {
            super();
            this.responseCode = i3;
        }

        @Override
        public int getResponseCode() {
            return this.responseCode;
        }

        @Override
        public boolean isSuccess() {
            return false;
        }
    }

    public static final class SuccessTransportResult extends TransportResult {
        static final SuccessTransportResult INSTANCE = new SuccessTransportResult();

        private SuccessTransportResult() {
            super();
        }

        @Override
        public int getResponseCode() {
            return -1;
        }

        @Override
        public boolean isSuccess() {
            return true;
        }
    }

    public static TransportResult error(int i3) {
        return new ErrorTransportResult(i3);
    }

    public static TransportResult success() {
        return SuccessTransportResult.INSTANCE;
    }

    public abstract int getResponseCode();

    public abstract boolean isSuccess();

    private TransportResult() {
    }

    public static TransportResult error() {
        return error(-1);
    }
}
