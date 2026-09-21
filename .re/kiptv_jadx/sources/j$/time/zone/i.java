package j$.time.zone;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f23863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f23864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile java.util.Set f23865d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Set f23866a;

    static {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        f23863b = copyOnWriteArrayList;
        f23864c = new java.util.concurrent.ConcurrentHashMap(512, 0.75f, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.security.AccessController.doPrivileged(new j$.time.zone.h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static j$.time.zone.f a(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "zoneId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f23864c;
        j$.time.zone.i iVar = (j$.time.zone.i) concurrentHashMap.get(str);
        if (iVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new j$.time.zone.g("No time-zone data files registered");
            }
            throw new j$.time.zone.g("Unknown time-zone ID: ".concat(str));
        }
        if (iVar.f23866a.contains(str)) {
            return new j$.time.zone.f(java.util.TimeZone.getTimeZone(str));
        }
        throw new j$.time.zone.g("Not a built-in time zone: ".concat(str));
    }

    public static void b(j$.time.zone.i iVar) {
        java.util.Objects.requireNonNull(iVar, "provider");
        synchronized (j$.time.zone.i.class) {
            try {
                for (java.lang.String str : iVar.f23866a) {
                    java.util.Objects.requireNonNull(str, "zoneId");
                    if (((j$.time.zone.i) f23864c.putIfAbsent(str, iVar)) != null) {
                        throw new j$.time.zone.g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                    }
                }
                f23865d = java.util.Collections.unmodifiableSet(new java.util.HashSet(f23864c.keySet()));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        f23863b.add(iVar);
    }

    public i() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str : java.util.TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f23866a = java.util.Collections.unmodifiableSet(linkedHashSet);
    }
}
