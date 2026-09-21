package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelopeItemHeader implements io.sentry.JsonSerializable, io.sentry.JsonUnknown {
    private final java.lang.String attachmentType;
    private final java.lang.String contentType;
    private final java.lang.String fileName;
    private final java.util.concurrent.Callable<java.lang.Integer> getLength;
    private final int length;
    private final io.sentry.SentryItemType type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryEnvelopeItemHeader> {
        private java.lang.Exception missingRequiredFieldException(java.lang.String str, io.sentry.ILogger iLogger) {
            java.lang.String strH = Y6.f.h("Missing required field \"", str, "\"");
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(strH);
            iLogger.log(io.sentry.SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryEnvelopeItemHeader deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) throws java.lang.Exception {
            objectReader.beginObject();
            java.util.HashMap map = null;
            io.sentry.SentryItemType sentryItemType = null;
            java.lang.String strNextStringOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.lang.String strNextStringOrNull3 = null;
            int iNextInt = 0;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "length":
                        iNextInt = objectReader.nextInt();
                        break;
                    case "filename":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "attachment_type":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        sentryItemType = (io.sentry.SentryItemType) objectReader.nextOrNull(iLogger, new io.sentry.SentryItemType.Deserializer());
                        break;
                    case "content_type":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new java.util.HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            if (sentryItemType == null) {
                throw missingRequiredFieldException("type", iLogger);
            }
            io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeader = new io.sentry.SentryEnvelopeItemHeader(sentryItemType, iNextInt, strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3);
            sentryEnvelopeItemHeader.setUnknown(map);
            objectReader.endObject();
            return sentryEnvelopeItemHeader;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ATTACHMENT_TYPE = "attachment_type";
        public static final java.lang.String CONTENT_TYPE = "content_type";
        public static final java.lang.String FILENAME = "filename";
        public static final java.lang.String LENGTH = "length";
        public static final java.lang.String TYPE = "type";
    }

    public SentryEnvelopeItemHeader(io.sentry.SentryItemType sentryItemType, int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.type = (io.sentry.SentryItemType) io.sentry.util.Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = i3;
        this.fileName = str2;
        this.getLength = null;
        this.attachmentType = str3;
    }

    public java.lang.String getAttachmentType() {
        return this.attachmentType;
    }

    public java.lang.String getContentType() {
        return this.contentType;
    }

    public java.lang.String getFileName() {
        return this.fileName;
    }

    public int getLength() {
        java.util.concurrent.Callable<java.lang.Integer> callable = this.getLength;
        if (callable == null) {
            return this.length;
        }
        try {
            return callable.call().intValue();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public io.sentry.SentryItemType getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.contentType != null) {
            objectWriter.name(io.sentry.SentryEnvelopeItemHeader.JsonKeys.CONTENT_TYPE).value(this.contentType);
        }
        if (this.fileName != null) {
            objectWriter.name("filename").value(this.fileName);
        }
        objectWriter.name("type").value(iLogger, this.type);
        if (this.attachmentType != null) {
            objectWriter.name(io.sentry.SentryEnvelopeItemHeader.JsonKeys.ATTACHMENT_TYPE).value(this.attachmentType);
        }
        objectWriter.name(io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH).value(getLength());
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SentryEnvelopeItemHeader(io.sentry.SentryItemType sentryItemType, java.util.concurrent.Callable<java.lang.Integer> callable, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.type = (io.sentry.SentryItemType) io.sentry.util.Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = -1;
        this.fileName = str2;
        this.getLength = callable;
        this.attachmentType = str3;
    }

    public SentryEnvelopeItemHeader(io.sentry.SentryItemType sentryItemType, java.util.concurrent.Callable<java.lang.Integer> callable, java.lang.String str, java.lang.String str2) {
        this(sentryItemType, callable, str, str2, (java.lang.String) null);
    }
}
