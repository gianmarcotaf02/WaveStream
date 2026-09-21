package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public class ContentMetadataMutations {
    private final java.util.Map<java.lang.String, java.lang.Object> editedValues = new java.util.HashMap();
    private final java.util.List<java.lang.String> removedValues = new java.util.ArrayList();

    private androidx.media3.datasource.cache.ContentMetadataMutations checkAndSet(java.lang.String str, java.lang.Object obj) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.editedValues;
        str.getClass();
        obj.getClass();
        map.put(str, obj);
        this.removedValues.remove(str);
        return this;
    }

    public static androidx.media3.datasource.cache.ContentMetadataMutations setContentLength(androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations, long j) {
        return contentMetadataMutations.set(androidx.media3.datasource.cache.ContentMetadata.KEY_CONTENT_LENGTH, j);
    }

    public static androidx.media3.datasource.cache.ContentMetadataMutations setRedirectedUri(androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations, android.net.Uri uri) {
        return uri == null ? contentMetadataMutations.remove(androidx.media3.datasource.cache.ContentMetadata.KEY_REDIRECTED_URI) : contentMetadataMutations.set(androidx.media3.datasource.cache.ContentMetadata.KEY_REDIRECTED_URI, uri.toString());
    }

    public java.util.Map<java.lang.String, java.lang.Object> getEditedValues() {
        java.util.HashMap map = new java.util.HashMap(this.editedValues);
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(java.util.Arrays.copyOf(bArr, bArr.length));
            }
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    public java.util.List<java.lang.String> getRemovedValues() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.removedValues));
    }

    public androidx.media3.datasource.cache.ContentMetadataMutations remove(java.lang.String str) {
        this.removedValues.add(str);
        this.editedValues.remove(str);
        return this;
    }

    public androidx.media3.datasource.cache.ContentMetadataMutations set(java.lang.String str, java.lang.String str2) {
        return checkAndSet(str, str2);
    }

    public androidx.media3.datasource.cache.ContentMetadataMutations set(java.lang.String str, long j) {
        return checkAndSet(str, java.lang.Long.valueOf(j));
    }

    public androidx.media3.datasource.cache.ContentMetadataMutations set(java.lang.String str, byte[] bArr) {
        return checkAndSet(str, java.util.Arrays.copyOf(bArr, bArr.length));
    }
}
