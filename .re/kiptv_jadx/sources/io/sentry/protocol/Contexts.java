package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public class Contexts implements io.sentry.JsonSerializable {
    public static final java.lang.String REPLAY_ID = "replay_id";
    private static final long serialVersionUID = 252445813254943011L;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> internalStorage = new java.util.concurrent.ConcurrentHashMap<>();
    protected final io.sentry.util.AutoClosableReentrantLock responseLock = new io.sentry.util.AutoClosableReentrantLock();

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Contexts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Contexts deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.Contexts contexts = new io.sentry.protocol.Contexts();
            objectReader.beginObject();
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "device":
                        contexts.setDevice(new io.sentry.protocol.Device.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "spring":
                        contexts.setSpring(new io.sentry.protocol.Spring.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "response":
                        contexts.setResponse(new io.sentry.protocol.Response.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "os":
                        contexts.setOperatingSystem(new io.sentry.protocol.OperatingSystem.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "app":
                        contexts.setApp(new io.sentry.protocol.App.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "gpu":
                        contexts.setGpu(new io.sentry.protocol.Gpu.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "trace":
                        contexts.setTrace(new io.sentry.SpanContext.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "browser":
                        contexts.setBrowser(new io.sentry.protocol.Browser.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    case "runtime":
                        contexts.setRuntime(new io.sentry.protocol.SentryRuntime.Deserializer().deserialize(objectReader, iLogger));
                        break;
                    default:
                        java.lang.Object objNextObjectOrNull = objectReader.nextObjectOrNull();
                        if (objNextObjectOrNull == null) {
                            break;
                        } else {
                            contexts.put(strNextName, objNextObjectOrNull);
                            break;
                        }
                        break;
                }
            }
            objectReader.endObject();
            return contexts;
        }
    }

    public Contexts() {
    }

    private <T> T toContextType(java.lang.String str, java.lang.Class<T> cls) {
        java.lang.Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public boolean containsKey(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return this.internalStorage.containsKey(obj);
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> entrySet() {
        return this.internalStorage.entrySet();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof io.sentry.protocol.Contexts)) {
            return false;
        }
        return this.internalStorage.equals(((io.sentry.protocol.Contexts) obj).internalStorage);
    }

    public java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return this.internalStorage.get(obj);
    }

    public io.sentry.protocol.App getApp() {
        return (io.sentry.protocol.App) toContextType(io.sentry.protocol.App.TYPE, io.sentry.protocol.App.class);
    }

    public io.sentry.protocol.Browser getBrowser() {
        return (io.sentry.protocol.Browser) toContextType(io.sentry.protocol.Browser.TYPE, io.sentry.protocol.Browser.class);
    }

    public io.sentry.protocol.Device getDevice() {
        return (io.sentry.protocol.Device) toContextType(io.sentry.protocol.Device.TYPE, io.sentry.protocol.Device.class);
    }

    public io.sentry.protocol.Gpu getGpu() {
        return (io.sentry.protocol.Gpu) toContextType(io.sentry.protocol.Gpu.TYPE, io.sentry.protocol.Gpu.class);
    }

    public io.sentry.protocol.OperatingSystem getOperatingSystem() {
        return (io.sentry.protocol.OperatingSystem) toContextType(io.sentry.protocol.OperatingSystem.TYPE, io.sentry.protocol.OperatingSystem.class);
    }

    public io.sentry.protocol.Response getResponse() {
        return (io.sentry.protocol.Response) toContextType(io.sentry.protocol.Response.TYPE, io.sentry.protocol.Response.class);
    }

    public io.sentry.protocol.SentryRuntime getRuntime() {
        return (io.sentry.protocol.SentryRuntime) toContextType(io.sentry.protocol.SentryRuntime.TYPE, io.sentry.protocol.SentryRuntime.class);
    }

    public int getSize() {
        return size();
    }

    public io.sentry.protocol.Spring getSpring() {
        return (io.sentry.protocol.Spring) toContextType(io.sentry.protocol.Spring.TYPE, io.sentry.protocol.Spring.class);
    }

    public io.sentry.SpanContext getTrace() {
        return (io.sentry.SpanContext) toContextType("trace", io.sentry.SpanContext.class);
    }

    public int hashCode() {
        return this.internalStorage.hashCode();
    }

    public boolean isEmpty() {
        return this.internalStorage.isEmpty();
    }

    public java.util.Enumeration<java.lang.String> keys() {
        return this.internalStorage.keys();
    }

    public java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.internalStorage.remove(str) : this.internalStorage.put(str, obj);
    }

    public void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.Object> map) {
        if (map == null) {
            return;
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        this.internalStorage.putAll(map2);
    }

    public java.lang.Object remove(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return this.internalStorage.remove(obj);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        java.util.ArrayList<java.lang.String> list = java.util.Collections.list(keys());
        java.util.Collections.sort(list);
        for (java.lang.String str : list) {
            java.lang.Object obj = get(str);
            if (obj != null) {
                objectWriter.name(str).value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public java.lang.Object set(java.lang.String str, java.lang.Object obj) {
        return put(str, obj);
    }

    public void setApp(io.sentry.protocol.App app) {
        put(io.sentry.protocol.App.TYPE, app);
    }

    public void setBrowser(io.sentry.protocol.Browser browser) {
        put(io.sentry.protocol.Browser.TYPE, browser);
    }

    public void setDevice(io.sentry.protocol.Device device) {
        put(io.sentry.protocol.Device.TYPE, device);
    }

    public void setGpu(io.sentry.protocol.Gpu gpu) {
        put(io.sentry.protocol.Gpu.TYPE, gpu);
    }

    public void setOperatingSystem(io.sentry.protocol.OperatingSystem operatingSystem) {
        put(io.sentry.protocol.OperatingSystem.TYPE, operatingSystem);
    }

    public void setResponse(io.sentry.protocol.Response response) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.responseLock.acquire();
        try {
            put(io.sentry.protocol.Response.TYPE, response);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void setRuntime(io.sentry.protocol.SentryRuntime sentryRuntime) {
        put(io.sentry.protocol.SentryRuntime.TYPE, sentryRuntime);
    }

    public void setSpring(io.sentry.protocol.Spring spring) {
        put(io.sentry.protocol.Spring.TYPE, spring);
    }

    public void setTrace(io.sentry.SpanContext spanContext) {
        io.sentry.util.Objects.requireNonNull(spanContext, "traceContext is required");
        put("trace", spanContext);
    }

    public int size() {
        return this.internalStorage.size();
    }

    public void withResponse(io.sentry.util.HintUtils.SentryConsumer<io.sentry.protocol.Response> sentryConsumer) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.responseLock.acquire();
        try {
            io.sentry.protocol.Response response = getResponse();
            if (response != null) {
                sentryConsumer.accept(response);
            } else {
                io.sentry.protocol.Response response2 = new io.sentry.protocol.Response();
                setResponse(response2);
                sentryConsumer.accept(response2);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Contexts(io.sentry.protocol.Contexts contexts) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contexts.entrySet()) {
            if (entry != null) {
                java.lang.Object value = entry.getValue();
                if (io.sentry.protocol.App.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.App)) {
                    setApp(new io.sentry.protocol.App((io.sentry.protocol.App) value));
                } else if (io.sentry.protocol.Browser.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.Browser)) {
                    setBrowser(new io.sentry.protocol.Browser((io.sentry.protocol.Browser) value));
                } else if (io.sentry.protocol.Device.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.Device)) {
                    setDevice(new io.sentry.protocol.Device((io.sentry.protocol.Device) value));
                } else if (io.sentry.protocol.OperatingSystem.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.OperatingSystem)) {
                    setOperatingSystem(new io.sentry.protocol.OperatingSystem((io.sentry.protocol.OperatingSystem) value));
                } else if (io.sentry.protocol.SentryRuntime.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.SentryRuntime)) {
                    setRuntime(new io.sentry.protocol.SentryRuntime((io.sentry.protocol.SentryRuntime) value));
                } else if (io.sentry.protocol.Gpu.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.Gpu)) {
                    setGpu(new io.sentry.protocol.Gpu((io.sentry.protocol.Gpu) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof io.sentry.SpanContext)) {
                    setTrace(new io.sentry.SpanContext((io.sentry.SpanContext) value));
                } else if (io.sentry.protocol.Response.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.Response)) {
                    setResponse(new io.sentry.protocol.Response((io.sentry.protocol.Response) value));
                } else if (io.sentry.protocol.Spring.TYPE.equals(entry.getKey()) && (value instanceof io.sentry.protocol.Spring)) {
                    setSpring(new io.sentry.protocol.Spring((io.sentry.protocol.Spring) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }

    public void putAll(io.sentry.protocol.Contexts contexts) {
        if (contexts == null) {
            return;
        }
        this.internalStorage.putAll(contexts.internalStorage);
    }
}
