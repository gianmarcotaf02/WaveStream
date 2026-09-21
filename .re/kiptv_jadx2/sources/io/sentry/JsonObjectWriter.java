package io.sentry;

import io.sentry.vendor.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;

public final class JsonObjectWriter implements ObjectWriter {
    private final JsonObjectSerializer jsonObjectSerializer;
    private final JsonWriter jsonWriter;

    public JsonObjectWriter(Writer writer, int i3) {
        this.jsonWriter = new JsonWriter(writer);
        this.jsonObjectSerializer = new JsonObjectSerializer(i3);
    }

    @Override
    public ObjectWriter jsonValue(String str) throws IOException {
        this.jsonWriter.jsonValue(str);
        return this;
    }

    public void setIndent(String str) {
        this.jsonWriter.setIndent(str);
    }

    @Override
    public void setLenient(boolean z6) {
        this.jsonWriter.setLenient(z6);
    }

    @Override
    public JsonObjectWriter beginArray() throws IOException {
        this.jsonWriter.beginArray();
        return this;
    }

    @Override
    public JsonObjectWriter beginObject() throws IOException {
        this.jsonWriter.beginObject();
        return this;
    }

    @Override
    public JsonObjectWriter endArray() {
        this.jsonWriter.endArray();
        return this;
    }

    @Override
    public JsonObjectWriter endObject() {
        this.jsonWriter.endObject();
        return this;
    }

    @Override
    public JsonObjectWriter name(String str) {
        this.jsonWriter.name(str);
        return this;
    }

    @Override
    public JsonObjectWriter nullValue() throws IOException {
        this.jsonWriter.nullValue();
        return this;
    }

    @Override
    public JsonObjectWriter value(String str) throws IOException {
        this.jsonWriter.value(str);
        return this;
    }

    @Override
    public JsonObjectWriter value(boolean z6) throws IOException {
        this.jsonWriter.value(z6);
        return this;
    }

    @Override
    public JsonObjectWriter value(Boolean bool) throws IOException {
        this.jsonWriter.value(bool);
        return this;
    }

    @Override
    public JsonObjectWriter value(double d4) throws IOException {
        this.jsonWriter.value(d4);
        return this;
    }

    @Override
    public JsonObjectWriter value(long j) throws IOException {
        this.jsonWriter.value(j);
        return this;
    }

    @Override
    public JsonObjectWriter value(Number number) throws IOException {
        this.jsonWriter.value(number);
        return this;
    }

    @Override
    public JsonObjectWriter value(ILogger iLogger, Object obj) {
        this.jsonObjectSerializer.serialize(this, iLogger, obj);
        return this;
    }
}
