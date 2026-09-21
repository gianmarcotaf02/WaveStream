package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class CpuInfoUtils {
    static final java.lang.String CPUINFO_MAX_FREQ_PATH = "cpufreq/cpuinfo_max_freq";
    private static final java.lang.String SYSTEM_CPU_PATH = "/sys/devices/system/cpu";
    private static final io.sentry.android.core.internal.util.CpuInfoUtils instance = new io.sentry.android.core.internal.util.CpuInfoUtils();
    private final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();
    private final java.util.List<java.lang.Integer> cpuMaxFrequenciesMhz = new java.util.ArrayList();

    private CpuInfoUtils() {
    }

    public static io.sentry.android.core.internal.util.CpuInfoUtils getInstance() {
        return instance;
    }

    public final void clear() {
        this.cpuMaxFrequenciesMhz.clear();
    }

    public java.lang.String getSystemCpuPath() {
        return SYSTEM_CPU_PATH;
    }

    public java.util.List<java.lang.Integer> readMaxFrequencies() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.cpuMaxFrequenciesMhz.isEmpty()) {
                java.util.List<java.lang.Integer> list = this.cpuMaxFrequenciesMhz;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return list;
            }
            java.io.File[] fileArrListFiles = new java.io.File(getSystemCpuPath()).listFiles();
            if (fileArrListFiles == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return arrayList;
            }
            for (java.io.File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    java.io.File file2 = new java.io.File(file, CPUINFO_MAX_FREQ_PATH);
                    if (file2.exists() && file2.canRead()) {
                        try {
                            java.lang.String text = io.sentry.util.FileUtils.readText(file2);
                            if (text != null) {
                                this.cpuMaxFrequenciesMhz.add(java.lang.Integer.valueOf((int) (java.lang.Long.parseLong(text.trim()) / 1000)));
                            }
                        } catch (java.io.IOException | java.lang.NumberFormatException unused) {
                        }
                    }
                }
            }
            java.util.List<java.lang.Integer> list2 = this.cpuMaxFrequenciesMhz;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return list2;
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

    public void setCpuMaxFrequencies(java.util.List<java.lang.Integer> list) {
        this.cpuMaxFrequenciesMhz.clear();
        this.cpuMaxFrequenciesMhz.addAll(list);
    }
}
