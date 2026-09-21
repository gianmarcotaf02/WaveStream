package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugImagesLoader implements io.sentry.android.core.IDebugImagesLoader {
    private static volatile java.util.List<io.sentry.protocol.DebugImage> debugImages;
    protected static final io.sentry.util.AutoClosableReentrantLock debugImagesLock = new io.sentry.util.AutoClosableReentrantLock();
    private final io.sentry.ndk.NativeModuleListLoader moduleListLoader;
    private final io.sentry.SentryOptions options;

    public DebugImagesLoader(io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions, io.sentry.ndk.NativeModuleListLoader nativeModuleListLoader) {
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.moduleListLoader = (io.sentry.ndk.NativeModuleListLoader) io.sentry.util.Objects.requireNonNull(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }

    private java.util.Set<io.sentry.protocol.DebugImage> filterImagesByAddresses(java.util.List<io.sentry.protocol.DebugImage> list, java.util.Set<java.lang.String> set) {
        long jLongValue;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i3 = 0;
        while (i3 < list.size()) {
            io.sentry.protocol.DebugImage debugImage = list.get(i3);
            i3++;
            io.sentry.protocol.DebugImage debugImage2 = i3 < list.size() ? list.get(i3) : null;
            java.lang.String imageAddr = debugImage2 != null ? debugImage2.getImageAddr() : null;
            java.util.Iterator<java.lang.String> it = set.iterator();
            while (it.hasNext()) {
                try {
                    long j = java.lang.Long.parseLong(it.next().replace("0x", ""), 16);
                    java.lang.String imageAddr2 = debugImage.getImageAddr();
                    if (imageAddr2 != null) {
                        long j9 = java.lang.Long.parseLong(imageAddr2.replace("0x", ""), 16);
                        java.lang.Long imageSize = debugImage.getImageSize();
                        if (imageSize != null) {
                            jLongValue = imageSize.longValue() + j9;
                        } else {
                            jLongValue = imageAddr != null ? java.lang.Long.parseLong(imageAddr.replace("0x", ""), 16) : Long.MAX_VALUE;
                        }
                        if (j >= j9 && j < jLongValue) {
                            hashSet.add(debugImage);
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return hashSet;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = debugImagesLock.acquire();
        try {
            try {
                this.moduleListLoader.clearModuleList();
                this.options.getLogger().log(io.sentry.SentryLevel.INFO, "Debug images cleared.", new java.lang.Object[0]);
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
        } catch (java.lang.Throwable th3) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, th3, "Failed to clear debug images.", new java.lang.Object[0]);
        }
        debugImages = null;
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
    }

    public java.util.List<io.sentry.protocol.DebugImage> getCachedDebugImages() {
        return debugImages;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public java.util.List<io.sentry.protocol.DebugImage> loadDebugImages() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = debugImagesLock.acquire();
        try {
            if (debugImages == null) {
                try {
                    io.sentry.ndk.DebugImage[] debugImageArrLoadModuleList = this.moduleListLoader.loadModuleList();
                    if (debugImageArrLoadModuleList != null) {
                        debugImages = new java.util.ArrayList(debugImageArrLoadModuleList.length);
                        for (io.sentry.ndk.DebugImage debugImage : debugImageArrLoadModuleList) {
                            io.sentry.protocol.DebugImage debugImage2 = new io.sentry.protocol.DebugImage();
                            debugImage2.setCodeFile(debugImage.getCodeFile());
                            debugImage2.setDebugFile(debugImage.getDebugFile());
                            debugImage2.setUuid(debugImage.getUuid());
                            debugImage2.setType(debugImage.getType());
                            debugImage2.setDebugId(debugImage.getDebugId());
                            debugImage2.setCodeId(debugImage.getCodeId());
                            debugImage2.setImageAddr(debugImage.getImageAddr());
                            debugImage2.setImageSize(debugImage.getImageSize());
                            debugImage2.setArch(debugImage.getArch());
                            debugImages.add(debugImage2);
                        }
                        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Debug images loaded: %d", java.lang.Integer.valueOf(debugImages.size()));
                    }
                } catch (java.lang.Throwable th) {
                    this.options.getLogger().log(io.sentry.SentryLevel.ERROR, th, "Failed to load debug images.", new java.lang.Object[0]);
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return debugImages;
        } catch (java.lang.Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public java.util.Set<io.sentry.protocol.DebugImage> loadDebugImagesForAddresses(java.util.Set<java.lang.String> set) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = debugImagesLock.acquire();
        try {
            java.util.List<io.sentry.protocol.DebugImage> listLoadDebugImages = loadDebugImages();
            if (listLoadDebugImages == null) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            if (set.isEmpty()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            java.util.Set<io.sentry.protocol.DebugImage> setFilterImagesByAddresses = filterImagesByAddresses(listLoadDebugImages, set);
            if (!setFilterImagesByAddresses.isEmpty()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return setFilterImagesByAddresses;
            }
            this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "No debug images found for any of the %d addresses.", java.lang.Integer.valueOf(set.size()));
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
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
}
