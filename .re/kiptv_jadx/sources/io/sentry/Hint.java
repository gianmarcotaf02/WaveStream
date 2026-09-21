package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Hint {
    private static final java.util.Map<java.lang.String, java.lang.Class<?>> PRIMITIVE_MAPPINGS;
    private final java.util.Map<java.lang.String, java.lang.Object> internalStorage = new java.util.HashMap();
    private final java.util.List<io.sentry.Attachment> attachments = new java.util.ArrayList();
    private final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();
    private io.sentry.Attachment screenshot = null;
    private io.sentry.Attachment viewHierarchy = null;
    private io.sentry.Attachment threadDump = null;
    private io.sentry.ReplayRecording replayRecording = null;

    static {
        java.util.HashMap map = new java.util.HashMap();
        PRIMITIVE_MAPPINGS = map;
        map.put("boolean", java.lang.Boolean.class);
        map.put("char", java.lang.Character.class);
        map.put(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_BYTES, java.lang.Byte.class);
        map.put("short", java.lang.Short.class);
        map.put("int", java.lang.Integer.class);
        map.put("long", java.lang.Long.class);
        map.put("float", java.lang.Float.class);
        map.put("double", java.lang.Double.class);
    }

    private boolean isCastablePrimitive(java.lang.Object obj, java.lang.Class<?> cls) {
        java.lang.Class<?> cls2 = PRIMITIVE_MAPPINGS.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public static io.sentry.Hint withAttachment(io.sentry.Attachment attachment) {
        io.sentry.Hint hint = new io.sentry.Hint();
        hint.addAttachment(attachment);
        return hint;
    }

    public static io.sentry.Hint withAttachments(java.util.List<io.sentry.Attachment> list) {
        io.sentry.Hint hint = new io.sentry.Hint();
        hint.addAttachments(list);
        return hint;
    }

    public void addAttachment(io.sentry.Attachment attachment) {
        if (attachment != null) {
            this.attachments.add(attachment);
        }
    }

    public void addAttachments(java.util.List<io.sentry.Attachment> list) {
        if (list != null) {
            this.attachments.addAll(list);
        }
    }

    public void clear() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> it = this.internalStorage.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<java.lang.String, java.lang.Object> next = it.next();
                if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                    it.remove();
                }
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

    public void clearAttachments() {
        this.attachments.clear();
    }

    public java.lang.Object get(java.lang.String str) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            java.lang.Object obj = this.internalStorage.get(str);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return obj;
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

    public <T> T getAs(java.lang.String str, java.lang.Class<T> cls) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            T t9 = (T) this.internalStorage.get(str);
            if (cls.isInstance(t9)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return t9;
                }
            } else {
                if (!isCastablePrimitive(t9, cls)) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return null;
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            }
            return t9;
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

    public java.util.List<io.sentry.Attachment> getAttachments() {
        return new java.util.ArrayList(this.attachments);
    }

    public io.sentry.ReplayRecording getReplayRecording() {
        return this.replayRecording;
    }

    public io.sentry.Attachment getScreenshot() {
        return this.screenshot;
    }

    public io.sentry.Attachment getThreadDump() {
        return this.threadDump;
    }

    public io.sentry.Attachment getViewHierarchy() {
        return this.viewHierarchy;
    }

    public void remove(java.lang.String str) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.internalStorage.remove(str);
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

    public void replaceAttachments(java.util.List<io.sentry.Attachment> list) {
        clearAttachments();
        addAttachments(list);
    }

    public void set(java.lang.String str, java.lang.Object obj) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.internalStorage.put(str, obj);
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

    public void setReplayRecording(io.sentry.ReplayRecording replayRecording) {
        this.replayRecording = replayRecording;
    }

    public void setScreenshot(io.sentry.Attachment attachment) {
        this.screenshot = attachment;
    }

    public void setThreadDump(io.sentry.Attachment attachment) {
        this.threadDump = attachment;
    }

    public void setViewHierarchy(io.sentry.Attachment attachment) {
        this.viewHierarchy = attachment;
    }
}
