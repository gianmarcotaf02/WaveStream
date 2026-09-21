package com.revenuecat.purchases.common.security;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 /2\u00020\u0001:\u0002/0B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB5\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120!H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/common/security/EncryptedItemStorage;", "Lcom/revenuecat/purchases/common/security/SecureItemStorage;", "Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;", "backup", "noBackup", "Ljavax/crypto/SecretKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "LS7/w;", "computationDispatcher", "ioDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;Ljavax/crypto/SecretKey;LS7/w;LS7/w;)V", "Ljava/io/File;", "backupFile", "noBackupFile", "(Ljava/io/File;Ljava/io/File;Ljavax/crypto/SecretKey;LS7/w;LS7/w;)V", "", "plaintext", "", io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER, "encrypt", "([BLjava/lang/String;)[B", "data", "decrypt", "file", "", "contents", "Lh6/A;", "saveContents", "(Ljava/io/File;Ljava/util/Map;)V", "", "containsItem", "(Ljava/lang/String;)Z", "", "allItemIdentifiers", "()Ljava/util/List;", "readItem", "(Ljava/lang/String;)[B", "Lcom/revenuecat/purchases/common/security/SecureItemAttributes;", "attributes", "saveItem", "(Ljava/lang/String;[BLcom/revenuecat/purchases/common/security/SecureItemAttributes;)V", "deleteItem", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;", "Ljavax/crypto/SecretKey;", "LS7/w;", "Companion", "Partition", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EncryptedItemStorage implements com.revenuecat.purchases.common.security.SecureItemStorage {
    private static final java.lang.String CIPHER_TRANSFORMATION = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.security.EncryptedItemStorage.Companion INSTANCE = new com.revenuecat.purchases.common.security.EncryptedItemStorage.Companion(null);
    private static final java.lang.String DEFAULT_SALT = "revenuecat";
    private static final java.lang.String DEFAULT_STORAGE_NAME = "rc_secure";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH_BITS = 128;
    private static final java.lang.String KEY_ALGORITHM = "AES";
    private static final int KEY_LENGTH_BITS = 256;
    private static final java.lang.String PBKDF2_ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final int PBKDF2_ITERATIONS = 100000;
    private final com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition backup;
    private final S7.AbstractC0906w computationDispatcher;
    private final S7.AbstractC0906w ioDispatcher;
    private final javax.crypto.SecretKey key;
    private final com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition noBackup;

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001c¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "password", "", "salt", "LS7/w;", "computationDispatcher", "ioDispatcher", "Lcom/revenuecat/purchases/common/security/EncryptedItemStorage;", "create", "(Landroid/content/Context;[CLjava/lang/String;LS7/w;LS7/w;Ll6/c;)Ljava/lang/Object;", "Ljava/io/File;", "file", "", "loadStore$purchases_defaultsRelease", "(Ljava/io/File;)Ljava/util/Map;", "loadStore", "CIPHER_TRANSFORMATION", "Ljava/lang/String;", "DEFAULT_SALT", "DEFAULT_STORAGE_NAME", "", "GCM_IV_LENGTH", "I", "GCM_TAG_LENGTH_BITS", "KEY_ALGORITHM", "KEY_LENGTH_BITS", "PBKDF2_ALGORITHM", "PBKDF2_ITERATIONS", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public static java.lang.Object create$default(com.revenuecat.purchases.common.security.EncryptedItemStorage.Companion companion, android.content.Context context, char[] cArr, java.lang.String str, S7.AbstractC0906w abstractC0906w, S7.AbstractC0906w abstractC0906w2, p100l6.c cVar, int i3, java.lang.Object obj) {
            if ((i3 & 4) != 0) {
                str = com.revenuecat.purchases.common.security.EncryptedItemStorage.DEFAULT_SALT;
            }
            java.lang.String str2 = str;
            if ((i3 & 8) != 0) {
                abstractC0906w = S7.M.f9549a;
            }
            S7.AbstractC0906w abstractC0906w3 = abstractC0906w;
            if ((i3 & 16) != 0) {
                Z7.e eVar = S7.M.f9549a;
                abstractC0906w2 = Z7.d.f13044i;
            }
            return companion.create(context, cArr, str2, abstractC0906w3, abstractC0906w2, cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final java.lang.Object create(android.content.Context context, char[] cArr, java.lang.String str, S7.AbstractC0906w abstractC0906w, S7.AbstractC0906w abstractC0906w2, p100l6.c cVar) throws java.lang.Throwable {
            com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$1 encryptedItemStorage$Companion$create$1;
            javax.crypto.spec.SecretKeySpec secretKeySpec;
            S7.AbstractC0906w abstractC0906w3;
            S7.AbstractC0906w abstractC0906w4;
            if (cVar instanceof com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$1) {
                encryptedItemStorage$Companion$create$1 = (com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$1) cVar;
                int i3 = encryptedItemStorage$Companion$create$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    encryptedItemStorage$Companion$create$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    encryptedItemStorage$Companion$create$1 = new com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$1(this, cVar);
                }
            } else {
                encryptedItemStorage$Companion$create$1 = new com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$1(this, cVar);
            }
            java.lang.Object objK = encryptedItemStorage$Companion$create$1.result;
            p109m6.a aVar = p109m6.a.f25430h;
            int i9 = encryptedItemStorage$Companion$create$1.label;
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objK);
                com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$key$1 encryptedItemStorage$Companion$create$key$1 = new com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$key$1(str, cArr, null);
                encryptedItemStorage$Companion$create$1.L$0 = context;
                encryptedItemStorage$Companion$create$1.L$1 = abstractC0906w;
                encryptedItemStorage$Companion$create$1.L$2 = abstractC0906w2;
                encryptedItemStorage$Companion$create$1.label = 1;
                objK = S7.C.K(abstractC0906w, encryptedItemStorage$Companion$create$key$1, encryptedItemStorage$Companion$create$1);
                if (objK != aVar) {
                }
                return aVar;
            }
            if (i9 == 1) {
                abstractC0906w2 = (S7.AbstractC0906w) encryptedItemStorage$Companion$create$1.L$2;
                abstractC0906w = (S7.AbstractC0906w) encryptedItemStorage$Companion$create$1.L$1;
                context = (android.content.Context) encryptedItemStorage$Companion$create$1.L$0;
                com.google.common.util.concurrent.P.u0(objK);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                javax.crypto.spec.SecretKeySpec secretKeySpec2 = (javax.crypto.spec.SecretKeySpec) encryptedItemStorage$Companion$create$1.L$2;
                S7.AbstractC0906w abstractC0906w5 = (S7.AbstractC0906w) encryptedItemStorage$Companion$create$1.L$1;
                S7.AbstractC0906w abstractC0906w6 = (S7.AbstractC0906w) encryptedItemStorage$Companion$create$1.L$0;
                com.google.common.util.concurrent.P.u0(objK);
                secretKeySpec = secretKeySpec2;
                abstractC0906w4 = abstractC0906w5;
                abstractC0906w3 = abstractC0906w6;
            }
            p070h6.k kVar = (p070h6.k) objK;
            return new com.revenuecat.purchases.common.security.EncryptedItemStorage((com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition) kVar.f22539h, (com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition) kVar.f22540i, secretKeySpec, abstractC0906w3, abstractC0906w4, null);
            javax.crypto.spec.SecretKeySpec secretKeySpec3 = (javax.crypto.spec.SecretKeySpec) objK;
            com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$2 encryptedItemStorage$Companion$create$2 = new com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion$create$2(new java.io.File(context.getFilesDir(), "rc_secure_backup.json"), new java.io.File(context.getNoBackupFilesDir(), "rc_secure_no_backup.json"), null);
            encryptedItemStorage$Companion$create$1.L$0 = abstractC0906w;
            encryptedItemStorage$Companion$create$1.L$1 = abstractC0906w2;
            encryptedItemStorage$Companion$create$1.L$2 = secretKeySpec3;
            encryptedItemStorage$Companion$create$1.label = 2;
            objK = S7.C.K(abstractC0906w2, encryptedItemStorage$Companion$create$2, encryptedItemStorage$Companion$create$1);
            if (objK != aVar) {
                secretKeySpec = secretKeySpec3;
                abstractC0906w3 = abstractC0906w;
                abstractC0906w4 = abstractC0906w2;
                p070h6.k kVar2 = (p070h6.k) objK;
                return new com.revenuecat.purchases.common.security.EncryptedItemStorage((com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition) kVar2.f22539h, (com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition) kVar2.f22540i, secretKeySpec, abstractC0906w3, abstractC0906w4, null);
            }
            return aVar;
        }

        public final java.util.Map<java.lang.String, java.lang.String> loadStore$purchases_defaultsRelease(java.io.File file) {
            kotlin.jvm.internal.m.e(file, "file");
            if (!file.exists()) {
                return new java.util.LinkedHashMap();
            }
            try {
                byte[] bytes = new android.util.AtomicFile(file).readFully();
                kotlin.jvm.internal.m.d(bytes, "bytes");
                return p078i6.C.Z0(com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap$default(new org.json.JSONObject(new java.lang.String(bytes, O7.a.f8024b)), false, 1, null));
            } catch (java.lang.Exception e6) {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Failed to load secure store from " + file.getName() + ", starting empty: " + e6);
                }
                return new java.util.LinkedHashMap();
            }
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;", "", "file", "Ljava/io/File;", "contents", "", "", "(Ljava/io/File;Ljava/util/Map;)V", "getContents", "()Ljava/util/Map;", "getFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Partition {
        private final java.util.Map<java.lang.String, java.lang.String> contents;
        private final java.io.File file;

        public Partition(java.io.File file, java.util.Map<java.lang.String, java.lang.String> contents) {
            kotlin.jvm.internal.m.e(file, "file");
            kotlin.jvm.internal.m.e(contents, "contents");
            this.file = file;
            this.contents = contents;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition copy$default(com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition, java.io.File file, java.util.Map map, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                file = partition.file;
            }
            if ((i3 & 2) != 0) {
                map = partition.contents;
            }
            return partition.copy(file, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.io.File getFile() {
            return this.file;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.contents;
        }

        public final com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition copy(java.io.File file, java.util.Map<java.lang.String, java.lang.String> contents) {
            kotlin.jvm.internal.m.e(file, "file");
            kotlin.jvm.internal.m.e(contents, "contents");
            return new com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition(file, contents);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition)) {
                return false;
            }
            com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition = (com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition) other;
            return kotlin.jvm.internal.m.a(this.file, partition.file) && kotlin.jvm.internal.m.a(this.contents, partition.contents);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getContents() {
            return this.contents;
        }

        public final java.io.File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.contents.hashCode() + (this.file.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Partition(file=");
            sb.append(this.file);
            sb.append(", contents=");
            return p121o0.p.r(sb, this.contents, ')');
        }
    }

    public /* synthetic */ EncryptedItemStorage(com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition, com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition2, javax.crypto.SecretKey secretKey, S7.AbstractC0906w abstractC0906w, S7.AbstractC0906w abstractC0906w2, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(partition, partition2, secretKey, abstractC0906w, abstractC0906w2);
    }

    private final byte[] decrypt(byte[] data, java.lang.String identifier) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        byte[] bArrF0 = p078i6.m.f0(data, 0, 12);
        byte[] bArrF1 = p078i6.m.f0(data, 12, data.length);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(CIPHER_TRANSFORMATION);
        cipher.init(2, this.key, new javax.crypto.spec.GCMParameterSpec(128, bArrF0));
        byte[] bytes = identifier.getBytes(O7.a.f8024b);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        cipher.updateAAD(bytes);
        byte[] bArrDoFinal = cipher.doFinal(bArrF1);
        kotlin.jvm.internal.m.d(bArrDoFinal, "cipher.doFinal(ciphertext)");
        return bArrDoFinal;
    }

    private final byte[] encrypt(byte[] plaintext, java.lang.String identifier) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(CIPHER_TRANSFORMATION);
        cipher.init(1, this.key);
        byte[] bytes = identifier.getBytes(O7.a.f8024b);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        cipher.updateAAD(bytes);
        byte[] ciphertext = cipher.doFinal(plaintext);
        byte[] iv = cipher.getIV();
        kotlin.jvm.internal.m.d(iv, "cipher.iv");
        kotlin.jvm.internal.m.d(ciphertext, "ciphertext");
        return p078i6.m.x0(iv, ciphertext);
    }

    private final void saveContents(java.io.File file, java.util.Map<java.lang.String, java.lang.String> contents) throws org.json.JSONException, com.revenuecat.purchases.common.security.SecureStorageException, java.io.IOException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : contents.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        android.util.AtomicFile atomicFile = new android.util.AtomicFile(file);
        java.io.FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            java.lang.String string = jSONObject.toString();
            kotlin.jvm.internal.m.d(string, "json.toString()");
            byte[] bytes = string.getBytes(O7.a.f8024b);
            kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
            fileOutputStreamStartWrite.write(bytes);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (java.lang.Exception e6) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw new com.revenuecat.purchases.common.security.SecureStorageException("Failed to write secure store to " + file.getName(), e6);
        }
    }

    @Override // com.revenuecat.purchases.common.security.SecureItemStorage
    public java.util.List<java.lang.String> allItemIdentifiers() {
        java.util.List<java.lang.String> listN1;
        synchronized (this) {
            listN1 = p078i6.o.N1(p078i6.I.o0(this.backup.getContents().keySet(), this.noBackup.getContents().keySet()));
        }
        return listN1;
    }

    @Override // com.revenuecat.purchases.common.security.SecureItemStorage
    public boolean containsItem(java.lang.String identifier) {
        boolean z6;
        kotlin.jvm.internal.m.e(identifier, "identifier");
        synchronized (this) {
            z6 = this.backup.getContents().containsKey(identifier) || this.noBackup.getContents().containsKey(identifier);
        }
        return z6;
    }

    @Override // com.revenuecat.purchases.common.security.SecureItemStorage
    public void deleteItem(java.lang.String identifier) {
        kotlin.jvm.internal.m.e(identifier, "identifier");
        synchronized (this) {
            try {
                boolean zContainsKey = this.backup.getContents().containsKey(identifier);
                boolean zContainsKey2 = this.noBackup.getContents().containsKey(identifier);
                if (zContainsKey) {
                    saveContents(this.backup.getFile(), p078i6.C.O0(identifier, this.backup.getContents()));
                }
                if (zContainsKey2) {
                    saveContents(this.noBackup.getFile(), p078i6.C.O0(identifier, this.noBackup.getContents()));
                }
                if (zContainsKey) {
                    this.backup.getContents().remove(identifier);
                }
                if (zContainsKey2) {
                    this.noBackup.getContents().remove(identifier);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.security.SecureItemStorage
    public byte[] readItem(java.lang.String identifier) throws com.revenuecat.purchases.common.security.SecureStorageException {
        java.lang.String str;
        kotlin.jvm.internal.m.e(identifier, "identifier");
        synchronized (this) {
            str = this.backup.getContents().get(identifier);
            if (str == null) {
                str = this.noBackup.getContents().get(identifier);
            }
        }
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(str, 2);
            kotlin.jvm.internal.m.d(bArrDecode, "decode(encoded, Base64.NO_WRAP)");
            return decrypt(bArrDecode, identifier);
        } catch (java.lang.Exception e6) {
            throw new com.revenuecat.purchases.common.security.SecureStorageException(B2.a.i('\'', "Failed to read item '", identifier), e6);
        }
    }

    @Override // com.revenuecat.purchases.common.security.SecureItemStorage
    public void saveItem(java.lang.String identifier, byte[] contents, com.revenuecat.purchases.common.security.SecureItemAttributes attributes) throws com.revenuecat.purchases.common.security.SecureStorageException {
        kotlin.jvm.internal.m.e(identifier, "identifier");
        kotlin.jvm.internal.m.e(contents, "contents");
        kotlin.jvm.internal.m.e(attributes, "attributes");
        try {
            java.lang.String encoded = android.util.Base64.encodeToString(encrypt(contents, identifier), 2);
            com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition = attributes.getIncludedInBackup() ? this.backup : this.noBackup;
            com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition2 = attributes.getIncludedInBackup() ? this.noBackup : this.backup;
            synchronized (this) {
                try {
                    boolean zContainsKey = partition2.getContents().containsKey(identifier);
                    if (zContainsKey) {
                        saveContents(partition2.getFile(), p078i6.C.O0(identifier, partition2.getContents()));
                    }
                    saveContents(partition.getFile(), p078i6.C.S0(partition.getContents(), new p070h6.k(identifier, encoded)));
                    if (zContainsKey) {
                        partition2.getContents().remove(identifier);
                    }
                    java.util.Map<java.lang.String, java.lang.String> contents2 = partition.getContents();
                    kotlin.jvm.internal.m.d(encoded, "encoded");
                    contents2.put(identifier, encoded);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.Exception e6) {
            throw new com.revenuecat.purchases.common.security.SecureStorageException(B2.a.i('\'', "Failed to save item '", identifier), e6);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EncryptedItemStorage(com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition, com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition2, javax.crypto.SecretKey secretKey, S7.AbstractC0906w abstractC0906w, S7.AbstractC0906w abstractC0906w2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        S7.AbstractC0906w abstractC0906w3 = (i3 & 8) != 0 ? S7.M.f9549a : abstractC0906w;
        if ((i3 & 16) != 0) {
            Z7.e eVar = S7.M.f9549a;
            abstractC0906w2 = Z7.d.f13044i;
        }
        this(partition, partition2, secretKey, abstractC0906w3, abstractC0906w2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EncryptedItemStorage(java.io.File file, java.io.File file2, javax.crypto.SecretKey secretKey, S7.AbstractC0906w abstractC0906w, S7.AbstractC0906w abstractC0906w2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        S7.AbstractC0906w abstractC0906w3 = (i3 & 8) != 0 ? S7.M.f9549a : abstractC0906w;
        if ((i3 & 16) != 0) {
            Z7.e eVar = S7.M.f9549a;
            abstractC0906w2 = Z7.d.f13044i;
        }
        this(file, file2, secretKey, abstractC0906w3, abstractC0906w2);
    }

    private EncryptedItemStorage(com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition, com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition partition2, javax.crypto.SecretKey secretKey, S7.AbstractC0906w abstractC0906w, S7.AbstractC0906w abstractC0906w2) {
        this.backup = partition;
        this.noBackup = partition2;
        this.key = secretKey;
        this.computationDispatcher = abstractC0906w;
        this.ioDispatcher = abstractC0906w2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EncryptedItemStorage(java.io.File backupFile, java.io.File noBackupFile, javax.crypto.SecretKey key, S7.AbstractC0906w computationDispatcher, S7.AbstractC0906w ioDispatcher) {
        kotlin.jvm.internal.m.e(backupFile, "backupFile");
        kotlin.jvm.internal.m.e(noBackupFile, "noBackupFile");
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(computationDispatcher, "computationDispatcher");
        kotlin.jvm.internal.m.e(ioDispatcher, "ioDispatcher");
        com.revenuecat.purchases.common.security.EncryptedItemStorage.Companion companion = INSTANCE;
        this(new com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition(backupFile, companion.loadStore$purchases_defaultsRelease(backupFile)), new com.revenuecat.purchases.common.security.EncryptedItemStorage.Partition(noBackupFile, companion.loadStore$purchases_defaultsRelease(noBackupFile)), key, computationDispatcher, ioDispatcher);
    }
}
