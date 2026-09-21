package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest> CREATOR = new android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.offline.DownloadRequest createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.exoplayer.offline.DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.offline.DownloadRequest[] newArray(int i3) {
            return new androidx.media3.exoplayer.offline.DownloadRequest[i3];
        }
    };
    public final androidx.media3.exoplayer.offline.DownloadRequest.ByteRange byteRange;
    public final java.lang.String customCacheKey;
    public final byte[] data;
    public final java.lang.String id;
    public final byte[] keySetId;
    public final java.lang.String mimeType;
    public final java.util.List<androidx.media3.common.StreamKey> streamKeys;
    public final androidx.media3.exoplayer.offline.DownloadRequest.TimeRange timeRange;
    public final android.net.Uri uri;

    public static class Builder {
        private java.lang.String customCacheKey;
        private byte[] data;
        private final java.lang.String id;
        private byte[] keySetId;
        private java.lang.String mimeType;
        private java.util.List<androidx.media3.common.StreamKey> streamKeys;
        private final android.net.Uri uri;
        private androidx.media3.exoplayer.offline.DownloadRequest.ByteRange byteRange = null;
        private androidx.media3.exoplayer.offline.DownloadRequest.TimeRange timeRange = null;

        public Builder(java.lang.String str, android.net.Uri uri) {
            this.id = str;
            this.uri = uri;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest build() {
            java.lang.String str = this.id;
            android.net.Uri uri = this.uri;
            java.lang.String str2 = this.mimeType;
            java.util.List list = this.streamKeys;
            if (list == null) {
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                list = p076i4.S0.f22832l;
            }
            return new androidx.media3.exoplayer.offline.DownloadRequest(str, uri, str2, list, this.keySetId, this.customCacheKey, this.data, this.byteRange, this.timeRange);
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setByteRange(long j, long j9) {
            this.byteRange = new androidx.media3.exoplayer.offline.DownloadRequest.ByteRange(j, j9);
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setCustomCacheKey(java.lang.String str) {
            this.customCacheKey = str;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setData(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setKeySetId(byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setMimeType(java.lang.String str) {
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setStreamKeys(java.util.List<androidx.media3.common.StreamKey> list) {
            this.streamKeys = list;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadRequest.Builder setTimeRange(long j, long j9) {
            this.timeRange = new androidx.media3.exoplayer.offline.DownloadRequest.TimeRange(j, j9);
            return this;
        }
    }

    public static class UnsupportedRequestException extends java.io.IOException {
    }

    public androidx.media3.exoplayer.offline.DownloadRequest copyWithId(java.lang.String str) {
        return new androidx.media3.exoplayer.offline.DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data, this.byteRange, this.timeRange);
    }

    public androidx.media3.exoplayer.offline.DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new androidx.media3.exoplayer.offline.DownloadRequest(this.id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data, this.byteRange, this.timeRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public androidx.media3.exoplayer.offline.DownloadRequest copyWithMergedRequest(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        ?? arrayList;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(this.id.equals(downloadRequest.id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            arrayList = java.util.Collections.EMPTY_LIST;
        } else {
            arrayList = new java.util.ArrayList(this.streamKeys);
            for (int i3 = 0; i3 < downloadRequest.streamKeys.size(); i3++) {
                androidx.media3.common.StreamKey streamKey = downloadRequest.streamKeys.get(i3);
                if (!arrayList.contains(streamKey)) {
                    arrayList.add(streamKey);
                }
            }
        }
        return new androidx.media3.exoplayer.offline.DownloadRequest(this.id, downloadRequest.uri, downloadRequest.mimeType, arrayList, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data, downloadRequest.byteRange, downloadRequest.timeRange);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.exoplayer.offline.DownloadRequest)) {
            return false;
        }
        androidx.media3.exoplayer.offline.DownloadRequest downloadRequest = (androidx.media3.exoplayer.offline.DownloadRequest) obj;
        return this.id.equals(downloadRequest.id) && this.uri.equals(downloadRequest.uri) && java.util.Objects.equals(this.mimeType, downloadRequest.mimeType) && this.streamKeys.equals(downloadRequest.streamKeys) && java.util.Arrays.equals(this.keySetId, downloadRequest.keySetId) && java.util.Objects.equals(this.customCacheKey, downloadRequest.customCacheKey) && java.util.Arrays.equals(this.data, downloadRequest.data) && java.util.Objects.equals(this.byteRange, downloadRequest.byteRange) && java.util.Objects.equals(this.timeRange, downloadRequest.timeRange);
    }

    public int hashCode() {
        int iHashCode = (this.uri.hashCode() + (this.id.hashCode() * 961)) * 31;
        java.lang.String str = this.mimeType;
        int iHashCode2 = (java.util.Arrays.hashCode(this.keySetId) + ((this.streamKeys.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        java.lang.String str2 = this.customCacheKey;
        int iHashCode3 = (java.util.Arrays.hashCode(this.data) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        androidx.media3.exoplayer.offline.DownloadRequest.ByteRange byteRange = this.byteRange;
        int iHashCode4 = (iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0)) * 31;
        androidx.media3.exoplayer.offline.DownloadRequest.TimeRange timeRange = this.timeRange;
        return iHashCode4 + (timeRange != null ? timeRange.hashCode() : 0);
    }

    public androidx.media3.common.MediaItem toMediaItem() {
        return toMediaItem(new androidx.media3.common.MediaItem.Builder());
    }

    public java.lang.String toString() {
        return this.mimeType + ":" + this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i9 = 0; i9 < this.streamKeys.size(); i9++) {
            parcel.writeParcelable(this.streamKeys.get(i9), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
        parcel.writeParcelable(this.byteRange, 0);
        parcel.writeParcelable(this.timeRange, 0);
    }

    private DownloadRequest(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.util.List<androidx.media3.common.StreamKey> list, byte[] bArr, java.lang.String str3, byte[] bArr2, androidx.media3.exoplayer.offline.DownloadRequest.ByteRange byteRange, androidx.media3.exoplayer.offline.DownloadRequest.TimeRange timeRange) {
        int iInferContentTypeForUriAndMimeType = androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(uri, str2);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 2 || iInferContentTypeForUriAndMimeType == 1) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.J(iInferContentTypeForUriAndMimeType, "customCacheKey must be null for type: %s", str3 == null);
            this.byteRange = null;
            this.timeRange = timeRange;
        } else {
            this.byteRange = byteRange;
            this.timeRange = null;
        }
        this.id = str;
        this.uri = uri;
        this.mimeType = str2;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList);
        this.streamKeys = java.util.Collections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? java.util.Arrays.copyOf(bArr2, bArr2.length) : androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    public androidx.media3.common.MediaItem toMediaItem(androidx.media3.common.MediaItem.Builder builder) {
        return builder.setMediaId(this.id).setUri(this.uri).setCustomCacheKey(this.customCacheKey).setMimeType(this.mimeType).setStreamKeys(this.streamKeys).build();
    }

    public static final class TimeRange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest.TimeRange> CREATOR = new android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest.TimeRange>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.TimeRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.exoplayer.offline.DownloadRequest.TimeRange createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.exoplayer.offline.DownloadRequest.TimeRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.exoplayer.offline.DownloadRequest.TimeRange[] newArray(int i3) {
                return new androidx.media3.exoplayer.offline.DownloadRequest.TimeRange[i3];
            }
        };
        public final long durationUs;
        public final long startPositionUs;

        public TimeRange(long j, long j9) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j9 >= 0 || j9 == androidx.media3.common.C.TIME_UNSET);
            this.startPositionUs = j;
            this.durationUs = j9;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.exoplayer.offline.DownloadRequest.TimeRange)) {
                return false;
            }
            androidx.media3.exoplayer.offline.DownloadRequest.TimeRange timeRange = (androidx.media3.exoplayer.offline.DownloadRequest.TimeRange) obj;
            return this.startPositionUs == timeRange.startPositionUs && this.durationUs == timeRange.durationUs;
        }

        public int hashCode() {
            return (((int) this.startPositionUs) * 961) + ((int) this.durationUs);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            parcel.writeLong(this.startPositionUs);
            parcel.writeLong(this.durationUs);
        }

        public TimeRange(android.os.Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    public static final class ByteRange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest.ByteRange> CREATOR = new android.os.Parcelable.Creator<androidx.media3.exoplayer.offline.DownloadRequest.ByteRange>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.ByteRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.exoplayer.offline.DownloadRequest.ByteRange createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.exoplayer.offline.DownloadRequest.ByteRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.exoplayer.offline.DownloadRequest.ByteRange[] newArray(int i3) {
                return new androidx.media3.exoplayer.offline.DownloadRequest.ByteRange[i3];
            }
        };
        public final long length;
        public final long offset;

        public ByteRange(long j, long j9) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= 0);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j9 >= 0 || j9 == -1);
            this.offset = j;
            this.length = j9;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.exoplayer.offline.DownloadRequest.ByteRange)) {
                return false;
            }
            androidx.media3.exoplayer.offline.DownloadRequest.ByteRange byteRange = (androidx.media3.exoplayer.offline.DownloadRequest.ByteRange) obj;
            return this.offset == byteRange.offset && this.length == byteRange.length;
        }

        public int hashCode() {
            return (((int) this.offset) * 961) + ((int) this.length);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            parcel.writeLong(this.offset);
            parcel.writeLong(this.length);
        }

        public ByteRange(android.os.Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    public DownloadRequest(android.os.Parcel parcel) {
        this.id = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.uri = android.net.Uri.parse((java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString()));
        this.mimeType = parcel.readString();
        int i3 = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i3);
        for (int i9 = 0; i9 < i3; i9++) {
            arrayList.add((androidx.media3.common.StreamKey) parcel.readParcelable(androidx.media3.common.StreamKey.class.getClassLoader()));
        }
        this.streamKeys = java.util.Collections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
        this.byteRange = (androidx.media3.exoplayer.offline.DownloadRequest.ByteRange) parcel.readParcelable(androidx.media3.exoplayer.offline.DownloadRequest.ByteRange.class.getClassLoader());
        this.timeRange = (androidx.media3.exoplayer.offline.DownloadRequest.TimeRange) parcel.readParcelable(androidx.media3.exoplayer.offline.DownloadRequest.TimeRange.class.getClassLoader());
    }
}
