package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements java.util.Comparator<androidx.media3.common.DrmInitData.SchemeData>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.common.DrmInitData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.DrmInitData>() { // from class: androidx.media3.common.DrmInitData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.DrmInitData createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.common.DrmInitData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.DrmInitData[] newArray(int i3) {
            return new androidx.media3.common.DrmInitData[i3];
        }
    };
    private int hashCode;
    public final int schemeDataCount;
    private final androidx.media3.common.DrmInitData.SchemeData[] schemeDatas;
    public final java.lang.String schemeType;

    public static final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.common.DrmInitData.SchemeData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.DrmInitData.SchemeData>() { // from class: androidx.media3.common.DrmInitData.SchemeData.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.common.DrmInitData.SchemeData createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.common.DrmInitData.SchemeData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.common.DrmInitData.SchemeData[] newArray(int i3) {
                return new androidx.media3.common.DrmInitData.SchemeData[i3];
            }
        };
        public final byte[] data;
        private int hashCode;
        public final java.lang.String licenseServerUrl;
        public final java.lang.String mimeType;
        public final java.util.UUID uuid;

        public SchemeData(java.util.UUID uuid, java.lang.String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean canReplace(androidx.media3.common.DrmInitData.SchemeData schemeData) {
            return hasData() && !schemeData.hasData() && matches(schemeData.uuid);
        }

        public androidx.media3.common.DrmInitData.SchemeData copyWithData(byte[] bArr) {
            return new androidx.media3.common.DrmInitData.SchemeData(this.uuid, this.licenseServerUrl, this.mimeType, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.common.DrmInitData.SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            androidx.media3.common.DrmInitData.SchemeData schemeData = (androidx.media3.common.DrmInitData.SchemeData) obj;
            return java.util.Objects.equals(this.licenseServerUrl, schemeData.licenseServerUrl) && java.util.Objects.equals(this.mimeType, schemeData.mimeType) && java.util.Objects.equals(this.uuid, schemeData.uuid) && java.util.Arrays.equals(this.data, schemeData.data);
        }

        public boolean hasData() {
            return this.data != null;
        }

        public int hashCode() {
            if (this.hashCode == 0) {
                int iHashCode = this.uuid.hashCode() * 31;
                java.lang.String str = this.licenseServerUrl;
                this.hashCode = java.util.Arrays.hashCode(this.data) + B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.mimeType);
            }
            return this.hashCode;
        }

        public boolean matches(java.util.UUID uuid) {
            return androidx.media3.common.C.UUID_NIL.equals(this.uuid) || uuid.equals(this.uuid);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.licenseServerUrl);
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            uuid.getClass();
            this.uuid = uuid;
            this.licenseServerUrl = str;
            str2.getClass();
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str2);
            this.data = bArr;
        }

        public SchemeData(android.os.Parcel parcel) {
            this.uuid = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.licenseServerUrl = parcel.readString();
            this.mimeType = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
            this.data = parcel.createByteArray();
        }
    }

    public DrmInitData(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        this(null, false, (androidx.media3.common.DrmInitData.SchemeData[]) list.toArray(new androidx.media3.common.DrmInitData.SchemeData[0]));
    }

    private static boolean containsSchemeDataWithUuid(java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList, int i3, java.util.UUID uuid) {
        for (int i9 = 0; i9 < i3; i9++) {
            if (arrayList.get(i9).uuid.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static androidx.media3.common.DrmInitData createSessionCreationData(androidx.media3.common.DrmInitData drmInitData, androidx.media3.common.DrmInitData drmInitData2) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (drmInitData != null) {
            str = drmInitData.schemeType;
            for (androidx.media3.common.DrmInitData.SchemeData schemeData : drmInitData.schemeDatas) {
                if (schemeData.hasData()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.schemeType;
            }
            int size = arrayList.size();
            for (androidx.media3.common.DrmInitData.SchemeData schemeData2 : drmInitData2.schemeDatas) {
                if (schemeData2.hasData() && !containsSchemeDataWithUuid(arrayList, size, schemeData2.uuid)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.DrmInitData(str, arrayList);
    }

    public androidx.media3.common.DrmInitData copyWithSchemeType(java.lang.String str) {
        return java.util.Objects.equals(this.schemeType, str) ? this : new androidx.media3.common.DrmInitData(str, false, this.schemeDatas);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.DrmInitData.class == obj.getClass()) {
            androidx.media3.common.DrmInitData drmInitData = (androidx.media3.common.DrmInitData) obj;
            if (java.util.Objects.equals(this.schemeType, drmInitData.schemeType) && java.util.Arrays.equals(this.schemeDatas, drmInitData.schemeDatas)) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.common.DrmInitData.SchemeData get(int i3) {
        return this.schemeDatas[i3];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            java.lang.String str = this.schemeType;
            this.hashCode = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.schemeDatas);
        }
        return this.hashCode;
    }

    public androidx.media3.common.DrmInitData merge(androidx.media3.common.DrmInitData drmInitData) {
        java.lang.String str;
        java.lang.String str2 = this.schemeType;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(str2 == null || (str = drmInitData.schemeType) == null || android.text.TextUtils.equals(str2, str));
        java.lang.String str3 = this.schemeType;
        if (str3 == null) {
            str3 = drmInitData.schemeType;
        }
        return new androidx.media3.common.DrmInitData(str3, (androidx.media3.common.DrmInitData.SchemeData[]) androidx.media3.common.util.Util.nullSafeArrayConcatenation(this.schemeDatas, drmInitData.schemeDatas));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    public DrmInitData(java.lang.String str, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        this(str, false, (androidx.media3.common.DrmInitData.SchemeData[]) list.toArray(new androidx.media3.common.DrmInitData.SchemeData[0]));
    }

    @Override // java.util.Comparator
    public int compare(androidx.media3.common.DrmInitData.SchemeData schemeData, androidx.media3.common.DrmInitData.SchemeData schemeData2) {
        java.util.UUID uuid = androidx.media3.common.C.UUID_NIL;
        if (uuid.equals(schemeData.uuid)) {
            return uuid.equals(schemeData2.uuid) ? 0 : 1;
        }
        return schemeData.uuid.compareTo(schemeData2.uuid);
    }

    public DrmInitData(androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this((java.lang.String) null, schemeDataArr);
    }

    public DrmInitData(java.lang.String str, androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(java.lang.String str, boolean z6, androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this.schemeType = str;
        schemeDataArr = z6 ? (androidx.media3.common.DrmInitData.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
        java.util.Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(android.os.Parcel parcel) {
        this.schemeType = parcel.readString();
        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr = (androidx.media3.common.DrmInitData.SchemeData[]) androidx.media3.common.util.Util.castNonNull((androidx.media3.common.DrmInitData.SchemeData[]) parcel.createTypedArray(androidx.media3.common.DrmInitData.SchemeData.CREATOR));
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }
}
