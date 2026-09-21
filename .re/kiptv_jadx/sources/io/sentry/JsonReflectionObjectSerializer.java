package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonReflectionObjectSerializer {
    private final int maxDepth;
    private final java.util.Set<java.lang.Object> visiting = new java.util.HashSet();

    public JsonReflectionObjectSerializer(int i3) {
        this.maxDepth = i3;
    }

    private java.util.List<java.lang.Object> list(java.lang.Object[] objArr, io.sentry.ILogger iLogger) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            arrayList.add(serialize(obj, iLogger));
        }
        return arrayList;
    }

    private java.util.Map<java.lang.String, java.lang.Object> map(java.util.Map<?, ?> map, io.sentry.ILogger iLogger) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.lang.Object obj : map.keySet()) {
            java.lang.Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), serialize(obj2, iLogger));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public java.lang.Object serialize(java.lang.Object obj, io.sentry.ILogger iLogger) {
        java.lang.Object string;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.lang.Character) {
            return obj.toString();
        }
        if ((obj instanceof java.lang.Number) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.String)) {
            return obj;
        }
        if (obj instanceof java.util.Locale) {
            return obj.toString();
        }
        if (obj instanceof java.util.concurrent.atomic.AtomicIntegerArray) {
            return io.sentry.util.JsonSerializationUtils.atomicIntegerArrayToList((java.util.concurrent.atomic.AtomicIntegerArray) obj);
        }
        if (obj instanceof java.util.concurrent.atomic.AtomicBoolean) {
            return java.lang.Boolean.valueOf(((java.util.concurrent.atomic.AtomicBoolean) obj).get());
        }
        if (obj instanceof java.net.URI) {
            return obj.toString();
        }
        if (obj instanceof java.net.InetAddress) {
            return obj.toString();
        }
        if (obj instanceof java.util.UUID) {
            return obj.toString();
        }
        if (obj instanceof java.util.Currency) {
            return obj.toString();
        }
        if (obj instanceof java.util.Calendar) {
            return io.sentry.util.JsonSerializationUtils.calendarToMap((java.util.Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (this.visiting.contains(obj)) {
            iLogger.log(io.sentry.SentryLevel.INFO, "Cyclic reference detected. Calling toString() on object.", new java.lang.Object[0]);
            return obj.toString();
        }
        this.visiting.add(obj);
        try {
            if (this.visiting.size() > this.maxDepth) {
                this.visiting.remove(obj);
                iLogger.log(io.sentry.SentryLevel.INFO, "Max depth exceeded. Calling toString() on object.", new java.lang.Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    string = list((java.lang.Object[]) obj, iLogger);
                } else if (obj instanceof java.util.Collection) {
                    string = list((java.util.Collection<?>) obj, iLogger);
                } else if (obj instanceof java.util.Map) {
                    string = map((java.util.Map) obj, iLogger);
                } else {
                    java.util.Map<java.lang.String, java.lang.Object> mapSerializeObject = serializeObject(obj, iLogger);
                    string = mapSerializeObject.isEmpty() ? obj.toString() : mapSerializeObject;
                }
                return string;
            } catch (java.lang.Exception e6) {
                iLogger.log(io.sentry.SentryLevel.INFO, "Not serializing object due to throwing sub-path.", e6);
                return null;
            }
        } finally {
            this.visiting.remove(obj);
        }
    }

    public java.util.Map<java.lang.String, java.lang.Object> serializeObject(java.lang.Object obj, io.sentry.ILogger iLogger) {
        java.lang.reflect.Field[] declaredFields = obj.getClass().getDeclaredFields();
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.reflect.Field field : declaredFields) {
            if (!java.lang.reflect.Modifier.isTransient(field.getModifiers()) && !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                java.lang.String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, serialize(field.get(obj), iLogger));
                    field.setAccessible(false);
                } catch (java.lang.Exception unused) {
                    iLogger.log(io.sentry.SentryLevel.INFO, Y6.f.h("Cannot access field ", name, "."), new java.lang.Object[0]);
                }
            }
        }
        return map;
    }

    private java.util.List<java.lang.Object> list(java.util.Collection<?> collection, io.sentry.ILogger iLogger) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(serialize(it.next(), iLogger));
        }
        return arrayList;
    }
}
