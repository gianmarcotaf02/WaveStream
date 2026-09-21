package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class BundleableByteArray {
    private static final java.lang.String FIELD_IN_PROCESS_BINDER = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_SHARED_MEMORY = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_SPLIT_ARRAY_RETRIEVER = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String TAG = "BundleableByteArray";
    private final byte[] byteArray;
    private final androidx.media3.common.BundleableByteArray.InProcessBinder inProcessBinder = new androidx.media3.common.BundleableByteArray.InProcessBinder();
    androidx.media3.common.BundleableByteArray.SharedMemoryApi27 sharedMemoryApi27;
    androidx.media3.common.BundleableByteArray.SplitArrayRetriever splitArrayRetriever;

    public final class InProcessBinder extends android.os.Binder {
        private InProcessBinder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] getByteArray() {
            return androidx.media3.common.BundleableByteArray.this.byteArray;
        }
    }

    public static final class SharedMemoryApi27 {
        private final android.os.SharedMemory sharedMemory;

        private SharedMemoryApi27(android.os.SharedMemory sharedMemory) {
            this.sharedMemory = sharedMemory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static androidx.media3.common.BundleableByteArray.SharedMemoryApi27 create(byte[] bArr) {
            android.os.SharedMemory sharedMemoryCreate;
            try {
                sharedMemoryCreate = android.os.SharedMemory.create("BundleableByteArray", bArr.length);
                try {
                    java.nio.ByteBuffer byteBufferMapReadWrite = sharedMemoryCreate.mapReadWrite();
                    byteBufferMapReadWrite.put(bArr);
                    android.os.SharedMemory.unmap(byteBufferMapReadWrite);
                    int i3 = android.system.OsConstants.PROT_READ;
                    sharedMemoryCreate.setProtect(android.system.OsConstants.PROT_READ);
                    return new androidx.media3.common.BundleableByteArray.SharedMemoryApi27(sharedMemoryCreate);
                } catch (java.lang.Exception e6) {
                    e = e6;
                    androidx.media3.common.util.Log.w(androidx.media3.common.BundleableByteArray.TAG, "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
                    if (sharedMemoryCreate != null) {
                        sharedMemoryCreate.close();
                    }
                    return null;
                }
            } catch (java.lang.Exception e9) {
                e = e9;
                sharedMemoryCreate = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] readFromBundle(android.os.Bundle bundle) throws java.lang.Throwable {
            java.nio.ByteBuffer byteBufferMapReadOnly;
            android.os.SharedMemory sharedMemoryC = P3.a.c(bundle.getParcelable(androidx.media3.common.BundleableByteArray.FIELD_SHARED_MEMORY));
            try {
                if (sharedMemoryC == null) {
                    return null;
                }
                try {
                    byteBufferMapReadOnly = sharedMemoryC.mapReadOnly();
                    try {
                        byte[] bArr = new byte[sharedMemoryC.getSize()];
                        byteBufferMapReadOnly.get(bArr);
                        android.os.SharedMemory.unmap(byteBufferMapReadOnly);
                        sharedMemoryC.close();
                        return bArr;
                    } catch (java.lang.Exception e6) {
                        e = e6;
                        androidx.media3.common.util.Log.w(androidx.media3.common.BundleableByteArray.TAG, "Failed to read byte array from shared memory", e);
                        if (byteBufferMapReadOnly != null) {
                            android.os.SharedMemory.unmap(byteBufferMapReadOnly);
                        }
                        sharedMemoryC.close();
                        return null;
                    }
                } catch (java.lang.Exception e9) {
                    e = e9;
                    byteBufferMapReadOnly = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (0 != 0) {
                        android.os.SharedMemory.unmap(null);
                    }
                    sharedMemoryC.close();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToBundle(android.os.Bundle bundle) {
            bundle.putParcelable(androidx.media3.common.BundleableByteArray.FIELD_SHARED_MEMORY, this.sharedMemory);
        }
    }

    public static final class SplitArrayRetriever {
        private static final java.lang.String BUNDLE_KEY = "bytes";
        private static final int CHUNK_SIZE = androidx.media3.common.C.SUGGESTED_MAX_IPC_SIZE;
        private final androidx.media3.common.BundleListRetriever bundleListRetriever;

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] readFromBundle(android.os.Bundle bundle) {
            android.os.IBinder binder = bundle.getBinder(androidx.media3.common.BundleableByteArray.FIELD_SPLIT_ARRAY_RETRIEVER);
            if (binder == null) {
                return null;
            }
            try {
                p076i4.AbstractC2186b0 list = androidx.media3.common.BundleListRetriever.getList(binder);
                if (list.isEmpty()) {
                    return androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
                }
                byte[] byteArray = ((android.os.Bundle) p076i4.AbstractC2230y.l(list)).getByteArray(BUNDLE_KEY);
                if (byteArray == null) {
                    return null;
                }
                int size = list.size() - 1;
                int i3 = CHUNK_SIZE;
                byte[] bArr = new byte[(size * i3) + byteArray.length];
                java.lang.System.arraycopy(byteArray, 0, bArr, i3 * size, byteArray.length);
                for (int i9 = 0; i9 < size; i9++) {
                    byte[] byteArray2 = ((android.os.Bundle) list.get(i9)).getByteArray(BUNDLE_KEY);
                    if (byteArray2 != null) {
                        int length = byteArray2.length;
                        int i10 = CHUNK_SIZE;
                        if (length == i10) {
                            java.lang.System.arraycopy(byteArray2, 0, bArr, i9 * i10, i10);
                        }
                    }
                    return null;
                }
                return bArr;
            } catch (java.lang.RuntimeException e6) {
                androidx.media3.common.util.Log.w(androidx.media3.common.BundleableByteArray.TAG, "Failed to read byte array from bundle list retriever", e6);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToBundle(android.os.Bundle bundle) {
            bundle.putBinder(androidx.media3.common.BundleableByteArray.FIELD_SPLIT_ARRAY_RETRIEVER, this.bundleListRetriever);
        }

        private SplitArrayRetriever(byte[] bArr) {
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            int iCeilDivide = androidx.media3.common.util.Util.ceilDivide(bArr.length, CHUNK_SIZE);
            for (int i3 = 0; i3 < iCeilDivide; i3++) {
                android.os.Bundle bundle = new android.os.Bundle();
                int i9 = CHUNK_SIZE;
                int i10 = i3 * i9;
                bundle.putByteArray(BUNDLE_KEY, java.util.Arrays.copyOfRange(bArr, i10, java.lang.Math.min(i9 + i10, bArr.length)));
                yS.c(bundle);
            }
            this.bundleListRetriever = new androidx.media3.common.BundleListRetriever(yS.f());
        }
    }

    public BundleableByteArray(byte[] bArr) {
        this.byteArray = bArr;
    }

    public static byte[] fromBundle(android.os.Bundle bundle) {
        byte[] fromBundle;
        android.os.IBinder binder = bundle.getBinder(FIELD_IN_PROCESS_BINDER);
        if (binder == null) {
            return null;
        }
        if (binder instanceof androidx.media3.common.BundleableByteArray.InProcessBinder) {
            return ((androidx.media3.common.BundleableByteArray.InProcessBinder) binder).getByteArray();
        }
        return (android.os.Build.VERSION.SDK_INT < 27 || (fromBundle = androidx.media3.common.BundleableByteArray.SharedMemoryApi27.readFromBundle(bundle)) == null) ? androidx.media3.common.BundleableByteArray.SplitArrayRetriever.readFromBundle(bundle) : fromBundle;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBinder(FIELD_IN_PROCESS_BINDER, this.inProcessBinder);
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            byte[] bArr = this.byteArray;
            if (bArr.length > 0) {
                if (this.sharedMemoryApi27 == null) {
                    this.sharedMemoryApi27 = androidx.media3.common.BundleableByteArray.SharedMemoryApi27.create(bArr);
                }
                androidx.media3.common.BundleableByteArray.SharedMemoryApi27 sharedMemoryApi27 = this.sharedMemoryApi27;
                if (sharedMemoryApi27 != null) {
                    sharedMemoryApi27.writeToBundle(bundle);
                    return bundle;
                }
            }
        }
        if (this.splitArrayRetriever == null) {
            this.splitArrayRetriever = new androidx.media3.common.BundleableByteArray.SplitArrayRetriever(this.byteArray);
        }
        this.splitArrayRetriever.writeToBundle(bundle);
        return bundle;
    }
}
