package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.ObjectReader;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public final class MapObjectReader implements ObjectReader {
    private final Deque<Map.Entry<String, Object>> stack;

    public MapObjectReader(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.stack = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private <T> T nextValueOrNull() throws IOException {
        try {
            return (T) nextValueOrNull(null, null);
        } catch (Exception e6) {
            throw new IOException(e6);
        }
    }

    @Override
    public void beginArray() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.stack.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.stack.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.stack.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override
    public void beginObject() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.stack.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.stack.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.stack.addLast((Map.Entry) it.next());
        }
    }

    @Override
    public void close() {
        this.stack.clear();
    }

    @Override
    public void endArray() {
        if (this.stack.size() > 1) {
            this.stack.removeLast();
        }
    }

    @Override
    public void endObject() {
        if (this.stack.size() > 1) {
            this.stack.removeLast();
        }
    }

    @Override
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    @Override
    public boolean nextBoolean() throws IOException {
        Boolean bool = (Boolean) nextValueOrNull();
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IOException("Expected boolean");
    }

    @Override
    public Boolean nextBooleanOrNull() {
        return (Boolean) nextValueOrNull();
    }

    @Override
    public Date nextDateOrNull(ILogger iLogger) {
        return ObjectReader.dateOrNull(nextStringOrNull(), iLogger);
    }

    @Override
    public double nextDouble() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return ((Number) objNextValueOrNull).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override
    public Double nextDoubleOrNull() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return Double.valueOf(((Number) objNextValueOrNull).doubleValue());
        }
        return null;
    }

    @Override
    public float nextFloat() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return ((Number) objNextValueOrNull).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override
    public Float nextFloatOrNull() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return Float.valueOf(((Number) objNextValueOrNull).floatValue());
        }
        return null;
    }

    @Override
    public int nextInt() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return ((Number) objNextValueOrNull).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override
    public Integer nextIntegerOrNull() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return Integer.valueOf(((Number) objNextValueOrNull).intValue());
        }
        return null;
    }

    @Override
    public <T> List<T> nextListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        try {
            beginArray();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(jsonDeserializer.deserialize(this, iLogger));
                    } catch (Exception e6) {
                        iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in list.", e6);
                    }
                } while (peek() == JsonToken.BEGIN_OBJECT);
            }
            endArray();
            return arrayList;
        } catch (Exception e9) {
            throw new IOException(e9);
        }
    }

    @Override
    public long nextLong() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return ((Number) objNextValueOrNull).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override
    public Long nextLongOrNull() throws IOException {
        Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof Number) {
            return Long.valueOf(((Number) objNextValueOrNull).longValue());
        }
        return null;
    }

    @Override
    public <T> Map<String, List<T>> nextMapOfListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        HashMap map = new HashMap();
        try {
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
        } catch (Exception e6) {
            throw new IOException(e6);
        }
    }

    @Override
    public <T> Map<String, T> nextMapOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        try {
            beginObject();
            HashMap map = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(nextName(), jsonDeserializer.deserialize(this, iLogger));
                    } catch (Exception e6) {
                        iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in map.", e6);
                    }
                    if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (Exception e9) {
            throw new IOException(e9);
        }
    }

    @Override
    public String nextName() throws IOException {
        Map.Entry<String, Object> entryPeekLast = this.stack.peekLast();
        if (entryPeekLast != null && entryPeekLast.getKey() != null) {
            return entryPeekLast.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override
    public void nextNull() throws IOException {
        if (nextValueOrNull() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override
    public Object nextObjectOrNull() {
        return nextValueOrNull();
    }

    @Override
    public <T> T nextOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) {
        return (T) nextValueOrNull(iLogger, jsonDeserializer);
    }

    @Override
    public String nextString() throws IOException {
        String str = (String) nextValueOrNull();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override
    public String nextStringOrNull() {
        return (String) nextValueOrNull();
    }

    @Override
    public TimeZone nextTimeZoneOrNull(ILogger iLogger) {
        String strNextStringOrNull = nextStringOrNull();
        if (strNextStringOrNull != null) {
            return DesugarTimeZone.getTimeZone(strNextStringOrNull);
        }
        return null;
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
        if (this.stack.isEmpty()) {
            return JsonToken.END_DOCUMENT;
        }
        Map.Entry<String, Object> entryPeekLast = this.stack.peekLast();
        if (entryPeekLast == null) {
            return JsonToken.END_DOCUMENT;
        }
        if (entryPeekLast.getKey() != null) {
            return JsonToken.NAME;
        }
        Object value = entryPeekLast.getValue();
        if (value instanceof Map) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (value instanceof List) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (value instanceof String) {
            return JsonToken.STRING;
        }
        if (value instanceof Number) {
            return JsonToken.NUMBER;
        }
        if (value instanceof Boolean) {
            return JsonToken.BOOLEAN;
        }
        return value instanceof JsonToken ? (JsonToken) value : JsonToken.END_DOCUMENT;
    }

    @Override
    public void setLenient(boolean z6) {
    }

    @Override
    public void skipValue() {
    }

    private <T> T nextValueOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) {
        Map.Entry<String, Object> entryPeekLast = this.stack.peekLast();
        if (entryPeekLast == null) {
            return null;
        }
        T t9 = (T) entryPeekLast.getValue();
        if (jsonDeserializer != null && iLogger != null) {
            return jsonDeserializer.deserialize(this, iLogger);
        }
        this.stack.removeLast();
        return t9;
    }
}
