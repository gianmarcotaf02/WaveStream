package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class MapObjectReader implements io.sentry.ObjectReader {
    private final java.util.Deque<java.util.Map.Entry<java.lang.String, java.lang.Object>> stack;

    public MapObjectReader(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.stack = arrayDeque;
        arrayDeque.addLast(new java.util.AbstractMap.SimpleEntry(null, map));
    }

    private <T> T nextValueOrNull() throws java.io.IOException {
        try {
            return (T) nextValueOrNull(null, null);
        } catch (java.lang.Exception e6) {
            throw new java.io.IOException(e6);
        }
    }

    @Override // io.sentry.ObjectReader
    public void beginArray() throws java.io.IOException {
        java.util.Map.Entry<java.lang.String, java.lang.Object> entryRemoveLast = this.stack.removeLast();
        if (entryRemoveLast == null) {
            throw new java.io.IOException("No more entries");
        }
        java.lang.Object value = entryRemoveLast.getValue();
        if (!(value instanceof java.util.List)) {
            throw new java.io.IOException("Current token is not an object");
        }
        this.stack.addLast(new java.util.AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.JsonToken.END_ARRAY));
        java.util.List list = (java.util.List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.stack.addLast(new java.util.AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.ObjectReader
    public void beginObject() throws java.io.IOException {
        java.util.Map.Entry<java.lang.String, java.lang.Object> entryRemoveLast = this.stack.removeLast();
        if (entryRemoveLast == null) {
            throw new java.io.IOException("No more entries");
        }
        java.lang.Object value = entryRemoveLast.getValue();
        if (!(value instanceof java.util.Map)) {
            throw new java.io.IOException("Current token is not an object");
        }
        this.stack.addLast(new java.util.AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.JsonToken.END_OBJECT));
        java.util.Iterator it = ((java.util.Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.stack.addLast((java.util.Map.Entry) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stack.clear();
    }

    @Override // io.sentry.ObjectReader
    public void endArray() {
        if (this.stack.size() > 1) {
            this.stack.removeLast();
        }
    }

    @Override // io.sentry.ObjectReader
    public void endObject() {
        if (this.stack.size() > 1) {
            this.stack.removeLast();
        }
    }

    @Override // io.sentry.ObjectReader
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    @Override // io.sentry.ObjectReader
    public boolean nextBoolean() throws java.io.IOException {
        java.lang.Boolean bool = (java.lang.Boolean) nextValueOrNull();
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new java.io.IOException("Expected boolean");
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Boolean nextBooleanOrNull() {
        return (java.lang.Boolean) nextValueOrNull();
    }

    @Override // io.sentry.ObjectReader
    public java.util.Date nextDateOrNull(io.sentry.ILogger iLogger) {
        return io.sentry.ObjectReader.dateOrNull(nextStringOrNull(), iLogger);
    }

    @Override // io.sentry.ObjectReader
    public double nextDouble() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return ((java.lang.Number) objNextValueOrNull).doubleValue();
        }
        throw new java.io.IOException("Expected double");
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Double nextDoubleOrNull() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return java.lang.Double.valueOf(((java.lang.Number) objNextValueOrNull).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public float nextFloat() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return ((java.lang.Number) objNextValueOrNull).floatValue();
        }
        throw new java.io.IOException("Expected float");
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Float nextFloatOrNull() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return java.lang.Float.valueOf(((java.lang.Number) objNextValueOrNull).floatValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public int nextInt() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return ((java.lang.Number) objNextValueOrNull).intValue();
        }
        throw new java.io.IOException("Expected int");
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Integer nextIntegerOrNull() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return java.lang.Integer.valueOf(((java.lang.Number) objNextValueOrNull).intValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> java.util.List<T> nextListOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) throws java.io.IOException {
        if (peek() == io.sentry.vendor.gson.stream.JsonToken.NULL) {
            nextNull();
            return null;
        }
        try {
            beginArray();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(jsonDeserializer.deserialize(this, iLogger));
                    } catch (java.lang.Exception e6) {
                        iLogger.log(io.sentry.SentryLevel.WARNING, "Failed to deserialize object in list.", e6);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT);
            }
            endArray();
            return arrayList;
        } catch (java.lang.Exception e9) {
            throw new java.io.IOException(e9);
        }
    }

    @Override // io.sentry.ObjectReader
    public long nextLong() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return ((java.lang.Number) objNextValueOrNull).longValue();
        }
        throw new java.io.IOException("Expected long");
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Long nextLongOrNull() throws java.io.IOException {
        java.lang.Object objNextValueOrNull = nextValueOrNull();
        if (objNextValueOrNull instanceof java.lang.Number) {
            return java.lang.Long.valueOf(((java.lang.Number) objNextValueOrNull).longValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> java.util.Map<java.lang.String, java.util.List<T>> nextMapOfListOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) throws java.io.IOException {
        if (peek() == io.sentry.vendor.gson.stream.JsonToken.NULL) {
            nextNull();
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        try {
            beginObject();
            if (hasNext()) {
                while (true) {
                    java.lang.String strNextName = nextName();
                    java.util.List<T> listNextListOrNull = nextListOrNull(iLogger, jsonDeserializer);
                    if (listNextListOrNull != null) {
                        map.put(strNextName, listNextListOrNull);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.JsonToken.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (java.lang.Exception e6) {
            throw new java.io.IOException(e6);
        }
    }

    @Override // io.sentry.ObjectReader
    public <T> java.util.Map<java.lang.String, T> nextMapOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) throws java.io.IOException {
        if (peek() == io.sentry.vendor.gson.stream.JsonToken.NULL) {
            nextNull();
            return null;
        }
        try {
            beginObject();
            java.util.HashMap map = new java.util.HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(nextName(), jsonDeserializer.deserialize(this, iLogger));
                    } catch (java.lang.Exception e6) {
                        iLogger.log(io.sentry.SentryLevel.WARNING, "Failed to deserialize object in map.", e6);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.JsonToken.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (java.lang.Exception e9) {
            throw new java.io.IOException(e9);
        }
    }

    @Override // io.sentry.ObjectReader
    public java.lang.String nextName() throws java.io.IOException {
        java.util.Map.Entry<java.lang.String, java.lang.Object> entryPeekLast = this.stack.peekLast();
        if (entryPeekLast != null && entryPeekLast.getKey() != null) {
            return entryPeekLast.getKey();
        }
        throw new java.io.IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.ObjectReader
    public void nextNull() throws java.io.IOException {
        if (nextValueOrNull() == null) {
            return;
        }
        throw new java.io.IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Object nextObjectOrNull() {
        return nextValueOrNull();
    }

    @Override // io.sentry.ObjectReader
    public <T> T nextOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) {
        return (T) nextValueOrNull(iLogger, jsonDeserializer);
    }

    @Override // io.sentry.ObjectReader
    public java.lang.String nextString() throws java.io.IOException {
        java.lang.String str = (java.lang.String) nextValueOrNull();
        if (str != null) {
            return str;
        }
        throw new java.io.IOException("Expected string");
    }

    @Override // io.sentry.ObjectReader
    public java.lang.String nextStringOrNull() {
        return (java.lang.String) nextValueOrNull();
    }

    @Override // io.sentry.ObjectReader
    public java.util.TimeZone nextTimeZoneOrNull(io.sentry.ILogger iLogger) {
        java.lang.String strNextStringOrNull = nextStringOrNull();
        if (strNextStringOrNull != null) {
            return j$.util.DesugarTimeZone.getTimeZone(strNextStringOrNull);
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public void nextUnknown(io.sentry.ILogger iLogger, java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
        try {
            map.put(str, nextObjectOrNull());
        } catch (java.lang.Exception e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, e6, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.ObjectReader
    public io.sentry.vendor.gson.stream.JsonToken peek() {
        if (this.stack.isEmpty()) {
            return io.sentry.vendor.gson.stream.JsonToken.END_DOCUMENT;
        }
        java.util.Map.Entry<java.lang.String, java.lang.Object> entryPeekLast = this.stack.peekLast();
        if (entryPeekLast == null) {
            return io.sentry.vendor.gson.stream.JsonToken.END_DOCUMENT;
        }
        if (entryPeekLast.getKey() != null) {
            return io.sentry.vendor.gson.stream.JsonToken.NAME;
        }
        java.lang.Object value = entryPeekLast.getValue();
        if (value instanceof java.util.Map) {
            return io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT;
        }
        if (value instanceof java.util.List) {
            return io.sentry.vendor.gson.stream.JsonToken.BEGIN_ARRAY;
        }
        if (value instanceof java.lang.String) {
            return io.sentry.vendor.gson.stream.JsonToken.STRING;
        }
        if (value instanceof java.lang.Number) {
            return io.sentry.vendor.gson.stream.JsonToken.NUMBER;
        }
        if (value instanceof java.lang.Boolean) {
            return io.sentry.vendor.gson.stream.JsonToken.BOOLEAN;
        }
        return value instanceof io.sentry.vendor.gson.stream.JsonToken ? (io.sentry.vendor.gson.stream.JsonToken) value : io.sentry.vendor.gson.stream.JsonToken.END_DOCUMENT;
    }

    @Override // io.sentry.ObjectReader
    public void setLenient(boolean z6) {
    }

    @Override // io.sentry.ObjectReader
    public void skipValue() {
    }

    private <T> T nextValueOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) {
        java.util.Map.Entry<java.lang.String, java.lang.Object> entryPeekLast = this.stack.peekLast();
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
