package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectReader implements io.sentry.ObjectReader {
    private final io.sentry.vendor.gson.stream.JsonReader jsonReader;

    public JsonObjectReader(java.io.Reader reader) {
        this.jsonReader = new io.sentry.vendor.gson.stream.JsonReader(reader);
    }

    @Override // io.sentry.ObjectReader
    public void beginArray() {
        this.jsonReader.beginArray();
    }

    @Override // io.sentry.ObjectReader
    public void beginObject() {
        this.jsonReader.beginObject();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.jsonReader.close();
    }

    @Override // io.sentry.ObjectReader
    public void endArray() {
        this.jsonReader.endArray();
    }

    @Override // io.sentry.ObjectReader
    public void endObject() {
        this.jsonReader.endObject();
    }

    @Override // io.sentry.ObjectReader
    public boolean hasNext() {
        return this.jsonReader.hasNext();
    }

    @Override // io.sentry.ObjectReader
    public boolean nextBoolean() {
        return this.jsonReader.nextBoolean();
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Boolean nextBooleanOrNull() throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return java.lang.Boolean.valueOf(this.jsonReader.nextBoolean());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public java.util.Date nextDateOrNull(io.sentry.ILogger iLogger) throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return io.sentry.ObjectReader.dateOrNull(this.jsonReader.nextString(), iLogger);
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public double nextDouble() {
        return this.jsonReader.nextDouble();
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Double nextDoubleOrNull() throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return java.lang.Double.valueOf(this.jsonReader.nextDouble());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public float nextFloat() {
        return (float) this.jsonReader.nextDouble();
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Float nextFloatOrNull() throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return java.lang.Float.valueOf(nextFloat());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public int nextInt() {
        return this.jsonReader.nextInt();
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Integer nextIntegerOrNull() throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return java.lang.Integer.valueOf(this.jsonReader.nextInt());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> java.util.List<T> nextListOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) throws java.io.IOException {
        if (this.jsonReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        this.jsonReader.beginArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.jsonReader.hasNext()) {
            do {
                try {
                    arrayList.add(jsonDeserializer.deserialize(this, iLogger));
                } catch (java.lang.Exception e6) {
                    iLogger.log(io.sentry.SentryLevel.WARNING, "Failed to deserialize object in list.", e6);
                }
            } while (this.jsonReader.peek() == io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT);
        }
        this.jsonReader.endArray();
        return arrayList;
    }

    @Override // io.sentry.ObjectReader
    public long nextLong() {
        return this.jsonReader.nextLong();
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Long nextLongOrNull() throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return java.lang.Long.valueOf(this.jsonReader.nextLong());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> java.util.Map<java.lang.String, java.util.List<T>> nextMapOfListOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) throws java.io.IOException {
        if (peek() == io.sentry.vendor.gson.stream.JsonToken.NULL) {
            nextNull();
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
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
    }

    @Override // io.sentry.ObjectReader
    public <T> java.util.Map<java.lang.String, T> nextMapOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) throws java.io.IOException {
        if (this.jsonReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        this.jsonReader.beginObject();
        java.util.HashMap map = new java.util.HashMap();
        if (this.jsonReader.hasNext()) {
            while (true) {
                try {
                    map.put(this.jsonReader.nextName(), jsonDeserializer.deserialize(this, iLogger));
                } catch (java.lang.Exception e6) {
                    iLogger.log(io.sentry.SentryLevel.WARNING, "Failed to deserialize object in map.", e6);
                }
                if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT && this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NAME) {
                    break;
                }
            }
        }
        this.jsonReader.endObject();
        return map;
    }

    @Override // io.sentry.ObjectReader
    public java.lang.String nextName() {
        return this.jsonReader.nextName();
    }

    @Override // io.sentry.ObjectReader
    public void nextNull() {
        this.jsonReader.nextNull();
    }

    @Override // io.sentry.ObjectReader
    public java.lang.Object nextObjectOrNull() {
        return new io.sentry.JsonObjectDeserializer().deserialize(this);
    }

    @Override // io.sentry.ObjectReader
    public <T> T nextOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer) throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return jsonDeserializer.deserialize(this, iLogger);
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public java.lang.String nextString() {
        return this.jsonReader.nextString();
    }

    @Override // io.sentry.ObjectReader
    public java.lang.String nextStringOrNull() throws java.io.IOException {
        if (this.jsonReader.peek() != io.sentry.vendor.gson.stream.JsonToken.NULL) {
            return this.jsonReader.nextString();
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public java.util.TimeZone nextTimeZoneOrNull(io.sentry.ILogger iLogger) throws java.io.IOException {
        if (this.jsonReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        try {
            return j$.util.DesugarTimeZone.getTimeZone(this.jsonReader.nextString());
        } catch (java.lang.Exception e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error when deserializing TimeZone", e6);
            return null;
        }
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
        return this.jsonReader.peek();
    }

    @Override // io.sentry.ObjectReader
    public void setLenient(boolean z6) {
        this.jsonReader.setLenient(z6);
    }

    @Override // io.sentry.ObjectReader
    public void skipValue() throws java.io.IOException {
        this.jsonReader.skipValue();
    }
}
