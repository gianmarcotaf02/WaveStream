package io.ktor.http.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R$\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lio/ktor/http/cio/HttpHeadersMap;", "", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "", "nameHash", "valueHash", "nameStartIndex", "nameEndIndex", "valueStartIndex", "valueEndIndex", "Lh6/A;", "put", "(IIIIII)V", "", "name", "fromIndex", "find", "(Ljava/lang/String;I)I", "", "get", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "LN7/m;", "getAll", "(Ljava/lang/String;)LN7/m;", "idx", "nameAt", "(I)Ljava/lang/CharSequence;", "valueAt", "release", "()V", "toString", "()Ljava/lang/String;", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "value", "size", "I", "getSize", "()I", "", "indexes", "[I", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpHeadersMap {
    private final io.ktor.http.cio.internals.CharArrayBuilder builder;
    private int[] indexes;
    private int size;

    public HttpHeadersMap(io.ktor.http.cio.internals.CharArrayBuilder builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        this.builder = builder;
        this.indexes = (int[]) io.ktor.http.cio.HttpHeadersMapKt.IntArrayPool.borrow();
    }

    public static /* synthetic */ int find$default(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, java.lang.String str, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        return httpHeadersMap.find(str, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer getAll$lambda$0(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, int i3) {
        int i9 = i3 + 1;
        if (i9 >= httpHeadersMap.size) {
            return null;
        }
        return java.lang.Integer.valueOf(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getAll$lambda$1(int i3) {
        return i3 * 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAll$lambda$2(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, int i3, int i9) {
        return httpHeadersMap.indexes[i9] == i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence getAll$lambda$3(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, int i3) {
        io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder = httpHeadersMap.builder;
        int[] iArr = httpHeadersMap.indexes;
        return charArrayBuilder.subSequence(iArr[i3 + 4], iArr[i3 + 5]);
    }

    public final int find(java.lang.String name, int fromIndex) {
        kotlin.jvm.internal.m.e(name, "name");
        int iHashCodeLowerCase$default = io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(name, 0, 0, 3, null);
        int i3 = this.size;
        while (fromIndex < i3) {
            if (this.indexes[fromIndex * 8] == iHashCodeLowerCase$default) {
                return fromIndex;
            }
            fromIndex++;
        }
        return -1;
    }

    public final java.lang.CharSequence get(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        int iHashCodeLowerCase$default = io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(name, 0, 0, 3, null);
        int i3 = this.size;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = i9 * 8;
            int[] iArr = this.indexes;
            if (iArr[i10] == iHashCodeLowerCase$default) {
                return this.builder.subSequence(iArr[i10 + 4], iArr[i10 + 5]);
            }
        }
        return null;
    }

    public final N7.m getAll(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        final int i3 = 0;
        final int i9 = 1;
        return N7.o.p0(N7.o.k0(N7.o.p0(N7.o.m0(0, new p194x6.j(this) { // from class: io.ktor.http.cio.b

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.ktor.http.cio.HttpHeadersMap f23386i;

            {
                this.f23386i = this;
            }

            @Override // p194x6.j
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i10 = i3;
                int iIntValue = ((java.lang.Integer) obj).intValue();
                switch (i10) {
                    case 0:
                        return io.ktor.http.cio.HttpHeadersMap.getAll$lambda$0(this.f23386i, iIntValue);
                    default:
                        return io.ktor.http.cio.HttpHeadersMap.getAll$lambda$3(this.f23386i, iIntValue);
                }
            }
        }), new io.ktor.http.b(6)), new D.y(this, io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(name, 0, 0, 3, null), 3)), new p194x6.j(this) { // from class: io.ktor.http.cio.b

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.ktor.http.cio.HttpHeadersMap f23386i;

            {
                this.f23386i = this;
            }

            @Override // p194x6.j
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i10 = i9;
                int iIntValue = ((java.lang.Integer) obj).intValue();
                switch (i10) {
                    case 0:
                        return io.ktor.http.cio.HttpHeadersMap.getAll$lambda$0(this.f23386i, iIntValue);
                    default:
                        return io.ktor.http.cio.HttpHeadersMap.getAll$lambda$3(this.f23386i, iIntValue);
                }
            }
        });
    }

    public final int getSize() {
        return this.size;
    }

    public final java.lang.CharSequence nameAt(int idx) {
        if (idx < 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (idx >= this.size) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        int i3 = idx * 8;
        int[] iArr = this.indexes;
        return this.builder.subSequence(iArr[i3 + 2], iArr[i3 + 3]);
    }

    public final void put(int nameHash, int valueHash, int nameStartIndex, int nameEndIndex, int valueStartIndex, int valueEndIndex) {
        int i3 = this.size;
        int i9 = i3 * 8;
        int[] iArr = this.indexes;
        if (i9 >= iArr.length) {
            throw new p070h6.j("An operation is not implemented: Implement headers overflow");
        }
        iArr[i9] = nameHash;
        iArr[i9 + 1] = valueHash;
        iArr[i9 + 2] = nameStartIndex;
        iArr[i9 + 3] = nameEndIndex;
        iArr[i9 + 4] = valueStartIndex;
        iArr[i9 + 5] = valueEndIndex;
        iArr[i9 + 6] = -1;
        iArr[i9 + 7] = -1;
        this.size = i3 + 1;
    }

    public final void release() {
        this.size = 0;
        int[] iArr = this.indexes;
        this.indexes = io.ktor.http.cio.HttpHeadersMapKt.EMPTY_INT_LIST;
        if (iArr != io.ktor.http.cio.HttpHeadersMapKt.EMPTY_INT_LIST) {
            io.ktor.http.cio.HttpHeadersMapKt.IntArrayPool.recycle(iArr);
        }
    }

    public java.lang.String toString() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        io.ktor.http.cio.HttpHeadersMapKt.dumpTo(this, "", sb);
        return sb.toString();
    }

    public final java.lang.CharSequence valueAt(int idx) {
        if (idx < 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (idx >= this.size) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        int i3 = idx * 8;
        int[] iArr = this.indexes;
        return this.builder.subSequence(iArr[i3 + 4], iArr[i3 + 5]);
    }
}
