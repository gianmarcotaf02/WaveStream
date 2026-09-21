package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectWriter implements io.sentry.ObjectWriter {
    private final io.sentry.JsonObjectSerializer jsonObjectSerializer;
    private final io.sentry.vendor.gson.stream.JsonWriter jsonWriter;

    public JsonObjectWriter(java.io.Writer writer, int i3) {
        this.jsonWriter = new io.sentry.vendor.gson.stream.JsonWriter(writer);
        this.jsonObjectSerializer = new io.sentry.JsonObjectSerializer(i3);
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.ObjectWriter jsonValue(java.lang.String str) throws java.io.IOException {
        this.jsonWriter.jsonValue(str);
        return this;
    }

    public void setIndent(java.lang.String str) {
        this.jsonWriter.setIndent(str);
    }

    @Override // io.sentry.ObjectWriter
    public void setLenient(boolean z6) {
        this.jsonWriter.setLenient(z6);
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter beginArray() throws java.io.IOException {
        this.jsonWriter.beginArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter beginObject() throws java.io.IOException {
        this.jsonWriter.beginObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter endArray() {
        this.jsonWriter.endArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter endObject() {
        this.jsonWriter.endObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter name(java.lang.String str) {
        this.jsonWriter.name(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter nullValue() throws java.io.IOException {
        this.jsonWriter.nullValue();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter value(java.lang.String str) throws java.io.IOException {
        this.jsonWriter.value(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter value(boolean z6) throws java.io.IOException {
        this.jsonWriter.value(z6);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter value(java.lang.Boolean bool) throws java.io.IOException {
        this.jsonWriter.value(bool);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter value(double d4) throws java.io.IOException {
        this.jsonWriter.value(d4);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter value(long j) throws java.io.IOException {
        this.jsonWriter.value(j);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter value(java.lang.Number number) throws java.io.IOException {
        this.jsonWriter.value(number);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.JsonObjectWriter value(io.sentry.ILogger iLogger, java.lang.Object obj) {
        this.jsonObjectSerializer.serialize(this, iLogger, obj);
        return this;
    }
}
