package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.String) ((java.util.Map.Entry) obj2).getKey()).length() - ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).length();
    }
}
