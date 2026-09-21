package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface MeasurementUnit {
    public static final java.lang.String NONE = "none";

    public static final class Custom implements io.sentry.MeasurementUnit {
        private final java.lang.String name;

        public Custom(java.lang.String str) {
            this.name = str;
        }

        @Override // io.sentry.MeasurementUnit
        public java.lang.String apiName() {
            return name().toLowerCase(java.util.Locale.ROOT);
        }

        @Override // io.sentry.MeasurementUnit
        public java.lang.String name() {
            return this.name;
        }
    }

    public enum Duration implements io.sentry.MeasurementUnit {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.MeasurementUnit
        public java.lang.String apiName() {
            return name().toLowerCase(java.util.Locale.ROOT);
        }
    }

    public enum Fraction implements io.sentry.MeasurementUnit {
        RATIO,
        PERCENT;

        @Override // io.sentry.MeasurementUnit
        public java.lang.String apiName() {
            return name().toLowerCase(java.util.Locale.ROOT);
        }
    }

    public enum Information implements io.sentry.MeasurementUnit {
        BIT,
        BYTE,
        KILOBYTE,
        KIBIBYTE,
        MEGABYTE,
        MEBIBYTE,
        GIGABYTE,
        GIBIBYTE,
        TERABYTE,
        TEBIBYTE,
        PETABYTE,
        PEBIBYTE,
        EXABYTE,
        EXBIBYTE;

        @Override // io.sentry.MeasurementUnit
        public java.lang.String apiName() {
            return name().toLowerCase(java.util.Locale.ROOT);
        }
    }

    java.lang.String apiName();

    java.lang.String name();
}
