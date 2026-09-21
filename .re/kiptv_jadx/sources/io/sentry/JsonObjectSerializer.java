package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectSerializer {
    public static final java.lang.String OBJECT_PLACEHOLDER = "[OBJECT]";
    public final io.sentry.JsonReflectionObjectSerializer jsonReflectionObjectSerializer;

    public JsonObjectSerializer(int i3) {
        this.jsonReflectionObjectSerializer = new io.sentry.JsonReflectionObjectSerializer(i3);
    }

    private void serializeCollection(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger, java.util.Collection<?> collection) {
        objectWriter.beginArray();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            serialize(objectWriter, iLogger, it.next());
        }
        objectWriter.endArray();
    }

    private void serializeDate(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger, java.util.Date date) {
        try {
            objectWriter.value(io.sentry.DateUtils.getTimestamp(date));
        } catch (java.lang.Exception e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error when serializing Date", e6);
            objectWriter.nullValue();
        }
    }

    private void serializeMap(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger, java.util.Map<?, ?> map) {
        objectWriter.beginObject();
        for (java.lang.Object obj : map.keySet()) {
            if (obj instanceof java.lang.String) {
                objectWriter.name((java.lang.String) obj);
                serialize(objectWriter, iLogger, map.get(obj));
            }
        }
        objectWriter.endObject();
    }

    private void serializeTimeZone(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger, java.util.TimeZone timeZone) {
        try {
            objectWriter.value(timeZone.getID());
        } catch (java.lang.Exception e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error when serializing TimeZone", e6);
            objectWriter.nullValue();
        }
    }

    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger, java.lang.Object obj) {
        if (obj == null) {
            objectWriter.nullValue();
            return;
        }
        if (obj instanceof java.lang.Character) {
            objectWriter.value(java.lang.Character.toString(((java.lang.Character) obj).charValue()));
            return;
        }
        if (obj instanceof java.lang.String) {
            objectWriter.value((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            objectWriter.value(((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.Number) {
            objectWriter.value((java.lang.Number) obj);
            return;
        }
        if (obj instanceof java.util.Date) {
            serializeDate(objectWriter, iLogger, (java.util.Date) obj);
            return;
        }
        if (obj instanceof java.util.TimeZone) {
            serializeTimeZone(objectWriter, iLogger, (java.util.TimeZone) obj);
            return;
        }
        if (obj instanceof io.sentry.JsonSerializable) {
            ((io.sentry.JsonSerializable) obj).serialize(objectWriter, iLogger);
            return;
        }
        if (obj instanceof java.util.Collection) {
            serializeCollection(objectWriter, iLogger, (java.util.Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            serializeCollection(objectWriter, iLogger, java.util.Arrays.asList((java.lang.Object[]) obj));
            return;
        }
        if (obj instanceof java.util.Map) {
            serializeMap(objectWriter, iLogger, (java.util.Map) obj);
            return;
        }
        if (obj instanceof java.util.Locale) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof java.util.concurrent.atomic.AtomicIntegerArray) {
            serializeCollection(objectWriter, iLogger, io.sentry.util.JsonSerializationUtils.atomicIntegerArrayToList((java.util.concurrent.atomic.AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof java.util.concurrent.atomic.AtomicBoolean) {
            objectWriter.value(((java.util.concurrent.atomic.AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof java.net.URI) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof java.net.InetAddress) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof java.util.UUID) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof java.util.Currency) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof java.util.Calendar) {
            serializeMap(objectWriter, iLogger, io.sentry.util.JsonSerializationUtils.calendarToMap((java.util.Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            objectWriter.value(obj.toString());
            return;
        }
        try {
            serialize(objectWriter, iLogger, this.jsonReflectionObjectSerializer.serialize(obj, iLogger));
        } catch (java.lang.Exception e6) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Failed serializing unknown object.", e6);
            objectWriter.value(OBJECT_PLACEHOLDER);
        }
    }
}
