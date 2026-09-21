package io.sentry.internal.modules;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeModulesLoader extends io.sentry.internal.modules.ModulesLoader {
    private final java.util.List<io.sentry.internal.modules.IModulesLoader> loaders;

    public CompositeModulesLoader(java.util.List<io.sentry.internal.modules.IModulesLoader> list, io.sentry.ILogger iLogger) {
        super(iLogger);
        this.loaders = list;
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public java.util.Map<java.lang.String, java.lang.String> loadModules() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.util.Iterator<io.sentry.internal.modules.IModulesLoader> it = this.loaders.iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.lang.String> orLoadModules = it.next().getOrLoadModules();
            if (orLoadModules != null) {
                treeMap.putAll(orLoadModules);
            }
        }
        return treeMap;
    }
}
