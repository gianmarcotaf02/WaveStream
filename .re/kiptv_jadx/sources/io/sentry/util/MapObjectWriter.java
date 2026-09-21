package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class MapObjectWriter implements io.sentry.ObjectWriter {
    final java.util.Map<java.lang.String, java.lang.Object> root;
    final java.util.ArrayDeque<java.lang.Object> stack;

    public MapObjectWriter(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.root = map;
        java.util.ArrayDeque<java.lang.Object> arrayDeque = new java.util.ArrayDeque<>();
        this.stack = arrayDeque;
        arrayDeque.addLast(map);
    }

    private java.util.Map<java.lang.String, java.lang.Object> peekObject() {
        java.lang.Object objPeekLast = this.stack.peekLast();
        if (objPeekLast == null) {
            throw new java.lang.IllegalStateException("Stack is empty.");
        }
        if (objPeekLast instanceof java.util.Map) {
            return (java.util.Map) objPeekLast;
        }
        throw new java.lang.IllegalStateException("Stack element is not a Map.");
    }

    private void postValue(java.lang.Object obj) {
        java.lang.Object objPeekLast = this.stack.peekLast();
        if (objPeekLast instanceof java.util.List) {
            ((java.util.List) objPeekLast).add(obj);
        } else {
            if (!(objPeekLast instanceof java.lang.String)) {
                throw new java.lang.IllegalStateException("Invalid stack state, expected array or string on top");
            }
            peekObject().put((java.lang.String) this.stack.removeLast(), obj);
        }
    }

    private void serializeCollection(io.sentry.ILogger iLogger, java.util.Collection<?> collection) {
        beginArray();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            value(iLogger, it.next());
        }
        endArray();
    }

    private void serializeDate(io.sentry.ILogger iLogger, java.util.Date date) {
        try {
            value(io.sentry.DateUtils.getTimestamp(date));
        } catch (java.lang.Exception e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error when serializing Date", e6);
            nullValue();
        }
    }

    private void serializeMap(io.sentry.ILogger iLogger, java.util.Map<?, ?> map) {
        beginObject();
        for (java.lang.Object obj : map.keySet()) {
            if (obj instanceof java.lang.String) {
                name((java.lang.String) obj);
                value(iLogger, map.get(obj));
            }
        }
        endObject();
    }

    private void serializeTimeZone(io.sentry.ILogger iLogger, java.util.TimeZone timeZone) {
        try {
            value(timeZone.getID());
        } catch (java.lang.Exception e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error when serializing TimeZone", e6);
            nullValue();
        }
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.ObjectWriter jsonValue(java.lang.String str) {
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public void setLenient(boolean z6) {
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter beginArray() {
        this.stack.add(new java.util.ArrayList());
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter beginObject() {
        this.stack.addLast(new java.util.HashMap());
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter endArray() {
        endObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter endObject() {
        postValue(this.stack.removeLast());
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter name(java.lang.String str) {
        this.stack.add(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter nullValue() {
        postValue(null);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter value(io.sentry.ILogger iLogger, java.lang.Object obj) {
        if (obj == null) {
            nullValue();
            return this;
        }
        if (obj instanceof java.lang.Character) {
            value(java.lang.Character.toString(((java.lang.Character) obj).charValue()));
            return this;
        }
        if (obj instanceof java.lang.String) {
            value((java.lang.String) obj);
            return this;
        }
        if (obj instanceof java.lang.Boolean) {
            value(((java.lang.Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof java.lang.Number) {
            value((java.lang.Number) obj);
            return this;
        }
        if (obj instanceof java.util.Date) {
            serializeDate(iLogger, (java.util.Date) obj);
            return this;
        }
        if (obj instanceof java.util.TimeZone) {
            serializeTimeZone(iLogger, (java.util.TimeZone) obj);
            return this;
        }
        if (obj instanceof io.sentry.JsonSerializable) {
            ((io.sentry.JsonSerializable) obj).serialize(this, iLogger);
            return this;
        }
        if (obj instanceof java.util.Collection) {
            serializeCollection(iLogger, (java.util.Collection) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            serializeCollection(iLogger, java.util.Arrays.asList((java.lang.Object[]) obj));
            return this;
        }
        if (obj instanceof java.util.Map) {
            serializeMap(iLogger, (java.util.Map) obj);
            return this;
        }
        if (obj instanceof java.util.Locale) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof java.util.concurrent.atomic.AtomicIntegerArray) {
            serializeCollection(iLogger, io.sentry.util.JsonSerializationUtils.atomicIntegerArrayToList((java.util.concurrent.atomic.AtomicIntegerArray) obj));
            return this;
        }
        if (obj instanceof java.util.concurrent.atomic.AtomicBoolean) {
            value(((java.util.concurrent.atomic.AtomicBoolean) obj).get());
            return this;
        }
        if (obj instanceof java.net.URI) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof java.net.InetAddress) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof java.util.UUID) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof java.util.Currency) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof java.util.Calendar) {
            serializeMap(iLogger, io.sentry.util.JsonSerializationUtils.calendarToMap((java.util.Calendar) obj));
            return this;
        }
        if (obj.getClass().isEnum()) {
            value(obj.toString());
            return this;
        }
        iLogger.log(io.sentry.SentryLevel.WARNING, "Failed serializing unknown object.", obj);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter value(java.lang.String str) {
        postValue(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter value(boolean z6) {
        postValue(java.lang.Boolean.valueOf(z6));
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter value(java.lang.Boolean bool) {
        postValue(bool);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter value(double d4) {
        postValue(java.lang.Double.valueOf(d4));
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter value(long j) {
        postValue(java.lang.Long.valueOf(j));
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public io.sentry.util.MapObjectWriter value(java.lang.Number number) {
        postValue(number);
        return this;
    }
}
