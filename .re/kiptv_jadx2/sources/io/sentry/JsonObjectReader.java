package io.sentry;

import io.sentry.vendor.gson.stream.JsonReader;
import io.sentry.vendor.gson.stream.JsonToken;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public final class JsonObjectReader implements ObjectReader {
    private final JsonReader jsonReader;

    public JsonObjectReader(Reader reader) {
        this.jsonReader = new JsonReader(reader);
    }

    @Override
    public void beginArray() {
        this.jsonReader.beginArray();
    }

    @Override
    public void beginObject() {
        this.jsonReader.beginObject();
    }

    @Override
    public void close() throws IOException {
        this.jsonReader.close();
    }

    @Override
    public void endArray() {
        this.jsonReader.endArray();
    }

    @Override
    public void endObject() {
        this.jsonReader.endObject();
    }

    @Override
    public boolean hasNext() {
        return this.jsonReader.hasNext();
    }

    @Override
    public boolean nextBoolean() {
        return this.jsonReader.nextBoolean();
    }

    @Override
    public Boolean nextBooleanOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Boolean.valueOf(this.jsonReader.nextBoolean());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public Date nextDateOrNull(ILogger iLogger) throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return ObjectReader.dateOrNull(this.jsonReader.nextString(), iLogger);
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public double nextDouble() {
        return this.jsonReader.nextDouble();
    }

    @Override
    public Double nextDoubleOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Double.valueOf(this.jsonReader.nextDouble());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public float nextFloat() {
        return (float) this.jsonReader.nextDouble();
    }

    @Override
    public Float nextFloatOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public int nextInt() {
        return this.jsonReader.nextInt();
    }

    @Override
    public Integer nextIntegerOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Integer.valueOf(this.jsonReader.nextInt());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public <T> List<T> nextListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (this.jsonReader.peek() == JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        this.jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        if (this.jsonReader.hasNext()) {
            do {
                try {
                    arrayList.add(jsonDeserializer.deserialize(this, iLogger));
                } catch (Exception e6) {
                    iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in list.", e6);
                }
            } while (this.jsonReader.peek() == JsonToken.BEGIN_OBJECT);
        }
        this.jsonReader.endArray();
        return arrayList;
    }

    @Override
    public long nextLong() {
        return this.jsonReader.nextLong();
    }

    @Override
    public Long nextLongOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Long.valueOf(this.jsonReader.nextLong());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public <T> Map<String, List<T>> nextMapOfListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        HashMap map = new HashMap();
        beginObject();
        if (hasNext()) {
            while (true) {
                String strNextName = nextName();
                List<T> listNextListOrNull = nextListOrNull(iLogger, jsonDeserializer);
                if (listNextListOrNull != null) {
                    map.put(strNextName, listNextListOrNull);
                }
                if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                    break;
                }
            }
        }
        endObject();
        return map;
    }

    @Override
    public <T> Map<String, T> nextMapOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (this.jsonReader.peek() == JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        this.jsonReader.beginObject();
        HashMap map = new HashMap();
        if (this.jsonReader.hasNext()) {
            while (true) {
                try {
                    map.put(this.jsonReader.nextName(), jsonDeserializer.deserialize(this, iLogger));
                } catch (Exception e6) {
                    iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in map.", e6);
                }
                if (this.jsonReader.peek() != JsonToken.BEGIN_OBJECT && this.jsonReader.peek() != JsonToken.NAME) {
                    break;
                }
            }
        }
        this.jsonReader.endObject();
        return map;
    }

    @Override
    public String nextName() {
        return this.jsonReader.nextName();
    }

    @Override
    public void nextNull() {
        this.jsonReader.nextNull();
    }

    @Override
    public Object nextObjectOrNull() {
        return new JsonObjectDeserializer().deserialize(this);
    }

    @Override
    public <T> T nextOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return jsonDeserializer.deserialize(this, iLogger);
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public String nextString() {
        return this.jsonReader.nextString();
    }

    @Override
    public String nextStringOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return this.jsonReader.nextString();
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override
    public TimeZone nextTimeZoneOrNull(ILogger iLogger) throws IOException {
        if (this.jsonReader.peek() == JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(this.jsonReader.nextString());
        } catch (Exception e6) {
            iLogger.log(SentryLevel.ERROR, "Error when deserializing TimeZone", e6);
            return null;
        }
    }

    @Override
    public void nextUnknown(ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, nextObjectOrNull());
        } catch (Exception e6) {
            iLogger.log(SentryLevel.ERROR, e6, "Error deserializing unknown key: %s", str);
        }
    }

    @Override
    public JsonToken peek() {
        return this.jsonReader.peek();
    }

    @Override
    public void setLenient(boolean z6) {
        this.jsonReader.setLenient(z6);
    }

    @Override
    public void skipValue() throws IOException {
        this.jsonReader.skipValue();
    }
}
