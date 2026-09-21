package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionUtils {

    public interface Mapper<T, R> {
        R map(T t9);
    }

    public interface Predicate<T> {
        boolean test(T t9);
    }

    private CollectionUtils() {
    }

    public static <T> boolean contains(T[] tArr, T t9) {
        for (T t10 : tArr) {
            if (t9.equals(t10)) {
                return true;
            }
        }
        return false;
    }

    public static <T> java.util.List<T> filterListEntries(java.util.List<T> list, io.sentry.util.CollectionUtils.Predicate<T> predicate) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (T t9 : list) {
            if (predicate.test(t9)) {
                arrayList.add(t9);
            }
        }
        return arrayList;
    }

    public static <K, V> java.util.Map<K, V> filterMapEntries(java.util.Map<K, V> map, io.sentry.util.CollectionUtils.Predicate<java.util.Map.Entry<K, V>> predicate) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public static <T, R> java.util.List<R> map(java.util.List<T> list, io.sentry.util.CollectionUtils.Mapper<T, R> mapper) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map(it.next()));
        }
        return arrayList;
    }

    public static <T> java.util.List<T> newArrayList(java.util.List<T> list) {
        if (list != null) {
            return new java.util.ArrayList(list);
        }
        return null;
    }

    public static <K, V> java.util.Map<K, V> newConcurrentHashMap(java.util.Map<K, V> map) {
        if (map == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static <K, V> java.util.Map<K, V> newHashMap(java.util.Map<K, V> map) {
        if (map != null) {
            return new java.util.HashMap(map);
        }
        return null;
    }

    public static <T> java.util.ListIterator<T> reverseListIterator(java.util.concurrent.CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList(copyOnWriteArrayList);
        return copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
    }

    public static int size(java.lang.Iterable<?> iterable) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).size();
        }
        java.util.Iterator<?> it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            it.next();
            i3++;
        }
        return i3;
    }
}
