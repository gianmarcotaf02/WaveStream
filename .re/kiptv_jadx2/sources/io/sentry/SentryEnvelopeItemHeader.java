package io.sentry;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class SentryEnvelopeItemHeader implements JsonSerializable, JsonUnknown {
    private final String attachmentType;
    private final String contentType;
    private final String fileName;
    private final Callable<Integer> getLength;
    private final int length;
    private final SentryItemType type;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<SentryEnvelopeItemHeader> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strH = Y6.f.h("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strH);
            iLogger.log(SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        @Override
        public SentryEnvelopeItemHeader deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            HashMap map = null;
            SentryItemType sentryItemType = null;
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            int iNextInt = 0;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
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
                        sentryItemType = (SentryItemType) objectReader.nextOrNull(iLogger, new SentryItemType.Deserializer());
                        break;
                    case "content_type":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            if (sentryItemType == null) {
                throw missingRequiredFieldException("type", iLogger);
            }
            SentryEnvelopeItemHeader sentryEnvelopeItemHeader = new SentryEnvelopeItemHeader(sentryItemType, iNextInt, strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3);
            sentryEnvelopeItemHeader.setUnknown(map);
            objectReader.endObject();
            return sentryEnvelopeItemHeader;
        }
    }

    public static final class JsonKeys {
        public static final String ATTACHMENT_TYPE = "attachment_type";
        public static final String CONTENT_TYPE = "content_type";
        public static final String FILENAME = "filename";
        public static final String LENGTH = "length";
        public static final String TYPE = "type";
    }

    public SentryEnvelopeItemHeader(SentryItemType sentryItemType, int i3, String str, String str2, String str3) {
        this.type = (SentryItemType) Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = i3;
        this.fileName = str2;
        this.getLength = null;
        this.attachmentType = str3;
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getLength() {
        Callable<Integer> callable = this.getLength;
        if (callable == null) {
            return this.length;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public SentryItemType getType() {
        return this.type;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.contentType != null) {
            objectWriter.name(JsonKeys.CONTENT_TYPE).value(this.contentType);
        }
        if (this.fileName != null) {
            objectWriter.name("filename").value(this.fileName);
        }
        objectWriter.name("type").value(iLogger, this.type);
        if (this.attachmentType != null) {
            objectWriter.name(JsonKeys.ATTACHMENT_TYPE).value(this.attachmentType);
        }
        objectWriter.name(JsonKeys.LENGTH).value(getLength());
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryEnvelopeItemHeader(SentryItemType sentryItemType, Callable<Integer> callable, String str, String str2, String str3) {
        this.type = (SentryItemType) Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = -1;
        this.fileName = str2;
        this.getLength = callable;
        this.attachmentType = str3;
    }

    public SentryEnvelopeItemHeader(SentryItemType sentryItemType, Callable<Integer> callable, String str, String str2) {
        this(sentryItemType, callable, str, str2, (String) null);
    }
}
