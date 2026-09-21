package io.sentry.internal.modules;

/* JADX INFO: loaded from: classes4.dex */
public final class ManifestModulesLoader extends io.sentry.internal.modules.ModulesLoader {
    private final java.util.regex.Pattern NAME_AND_VERSION;
    private final java.util.regex.Pattern URL_LIB_PATTERN;
    private final java.lang.ClassLoader classLoader;

    public static final class Module {
        private final java.lang.String name;
        private final java.lang.String version;

        public Module(java.lang.String str, java.lang.String str2) {
            this.name = str;
            this.version = str2;
        }
    }

    public ManifestModulesLoader(io.sentry.ILogger iLogger) {
        this(io.sentry.internal.modules.ManifestModulesLoader.class.getClassLoader(), iLogger);
    }

    private io.sentry.internal.modules.ManifestModulesLoader.Module convertOriginalNameToModule(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = this.NAME_AND_VERSION.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new io.sentry.internal.modules.ManifestModulesLoader.Module(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    private java.util.List<io.sentry.internal.modules.ManifestModulesLoader.Module> detectModulesViaManifestFiles() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Enumeration<java.net.URL> resources = this.classLoader.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                io.sentry.internal.modules.ManifestModulesLoader.Module moduleConvertOriginalNameToModule = convertOriginalNameToModule(extractDependencyNameFromUrl(resources.nextElement()));
                if (moduleConvertOriginalNameToModule != null) {
                    arrayList.add(moduleConvertOriginalNameToModule);
                }
            }
        } catch (java.lang.Throwable th) {
            this.logger.log(io.sentry.SentryLevel.ERROR, "Unable to detect modules via manifest files.", th);
        }
        return arrayList;
    }

    private java.lang.String extractDependencyNameFromUrl(java.net.URL url) {
        java.util.regex.Matcher matcher = this.URL_LIB_PATTERN.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public java.util.Map<java.lang.String, java.lang.String> loadModules() {
        java.util.HashMap map = new java.util.HashMap();
        for (io.sentry.internal.modules.ManifestModulesLoader.Module module : detectModulesViaManifestFiles()) {
            map.put(module.name, module.version);
        }
        return map;
    }

    public ManifestModulesLoader(java.lang.ClassLoader classLoader, io.sentry.ILogger iLogger) {
        super(iLogger);
        this.URL_LIB_PATTERN = java.util.regex.Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.NAME_AND_VERSION = java.util.regex.Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.classLoader = io.sentry.util.ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
