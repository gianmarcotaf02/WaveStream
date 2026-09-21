package com.revenuecat.purchases.common.security;

import S7.AbstractC0906w;
import S7.C;
import S7.M;
import Z7.d;
import Z7.e;
import android.content.Context;
import android.util.AtomicFile;
import android.util.Base64;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import io.sentry.protocol.Request;
import io.sentry.protocol.ViewHierarchyNode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p070h6.k;
import p078i6.I;
import p078i6.o;
import p100l6.c;
import p109m6.a;
import p121o0.p;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 /2\u00020\u0001:\u0002/0B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB5\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120!H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/common/security/EncryptedItemStorage;", "Lcom/revenuecat/purchases/common/security/SecureItemStorage;", "Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;", "backup", "noBackup", "Ljavax/crypto/SecretKey;", SubscriberAttributeKt.JSON_NAME_KEY, "LS7/w;", "computationDispatcher", "ioDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;Ljavax/crypto/SecretKey;LS7/w;LS7/w;)V", "Ljava/io/File;", "backupFile", "noBackupFile", "(Ljava/io/File;Ljava/io/File;Ljavax/crypto/SecretKey;LS7/w;LS7/w;)V", "", "plaintext", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "encrypt", "([BLjava/lang/String;)[B", "data", "decrypt", "file", "", "contents", "Lh6/A;", "saveContents", "(Ljava/io/File;Ljava/util/Map;)V", "", "containsItem", "(Ljava/lang/String;)Z", "", "allItemIdentifiers", "()Ljava/util/List;", "readItem", "(Ljava/lang/String;)[B", "Lcom/revenuecat/purchases/common/security/SecureItemAttributes;", "attributes", "saveItem", "(Ljava/lang/String;[BLcom/revenuecat/purchases/common/security/SecureItemAttributes;)V", "deleteItem", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;", "Ljavax/crypto/SecretKey;", "LS7/w;", "Companion", "Partition", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EncryptedItemStorage implements SecureItemStorage {
    private static final String CIPHER_TRANSFORMATION = "AES/GCM/NoPadding";

    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_SALT = "revenuecat";
    private static final String DEFAULT_STORAGE_NAME = "rc_secure";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH_BITS = 128;
    private static final String KEY_ALGORITHM = "AES";
    private static final int KEY_LENGTH_BITS = 256;
    private static final String PBKDF2_ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final int PBKDF2_ITERATIONS = 100000;
    private final Partition backup;
    private final AbstractC0906w computationDispatcher;
    private final AbstractC0906w ioDispatcher;
    private final SecretKey key;
    private final Partition noBackup;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001c¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "password", "", "salt", "LS7/w;", "computationDispatcher", "ioDispatcher", "Lcom/revenuecat/purchases/common/security/EncryptedItemStorage;", "create", "(Landroid/content/Context;[CLjava/lang/String;LS7/w;LS7/w;Ll6/c;)Ljava/lang/Object;", "Ljava/io/File;", "file", "", "loadStore$purchases_defaultsRelease", "(Ljava/io/File;)Ljava/util/Map;", "loadStore", "CIPHER_TRANSFORMATION", "Ljava/lang/String;", "DEFAULT_SALT", "DEFAULT_STORAGE_NAME", "", "GCM_IV_LENGTH", "I", "GCM_TAG_LENGTH_BITS", "KEY_ALGORITHM", "KEY_LENGTH_BITS", "PBKDF2_ALGORITHM", "PBKDF2_ITERATIONS", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public static Object create$default(Companion companion, Context context, char[] cArr, String str, AbstractC0906w abstractC0906w, AbstractC0906w abstractC0906w2, c cVar, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                str = EncryptedItemStorage.DEFAULT_SALT;
            }
            String str2 = str;
            if ((i3 & 8) != 0) {
                abstractC0906w = M.f9549a;
            }
            AbstractC0906w abstractC0906w3 = abstractC0906w;
            if ((i3 & 16) != 0) {
                e eVar = M.f9549a;
                abstractC0906w2 = d.f13044i;
            }
            return companion.create(context, cArr, str2, abstractC0906w3, abstractC0906w2, cVar);
        }

        public final Object create(Context context, char[] cArr, String str, AbstractC0906w abstractC0906w, AbstractC0906w abstractC0906w2, c cVar) throws Throwable {
            EncryptedItemStorage$Companion$create$1 encryptedItemStorage$Companion$create$1;
            SecretKeySpec secretKeySpec;
            AbstractC0906w abstractC0906w3;
            AbstractC0906w abstractC0906w4;
            if (cVar instanceof EncryptedItemStorage$Companion$create$1) {
                encryptedItemStorage$Companion$create$1 = (EncryptedItemStorage$Companion$create$1) cVar;
                int i3 = encryptedItemStorage$Companion$create$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    encryptedItemStorage$Companion$create$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    encryptedItemStorage$Companion$create$1 = new EncryptedItemStorage$Companion$create$1(this, cVar);
                }
            } else {
                encryptedItemStorage$Companion$create$1 = new EncryptedItemStorage$Companion$create$1(this, cVar);
            }
            Object objK = encryptedItemStorage$Companion$create$1.result;
            a aVar = a.f25430h;
            int i9 = encryptedItemStorage$Companion$create$1.label;
            if (i9 == 0) {
                P.u0(objK);
                EncryptedItemStorage$Companion$create$key$1 encryptedItemStorage$Companion$create$key$1 = new EncryptedItemStorage$Companion$create$key$1(str, cArr, null);
                encryptedItemStorage$Companion$create$1.L$0 = context;
                encryptedItemStorage$Companion$create$1.L$1 = abstractC0906w;
                encryptedItemStorage$Companion$create$1.L$2 = abstractC0906w2;
                encryptedItemStorage$Companion$create$1.label = 1;
                objK = C.K(abstractC0906w, encryptedItemStorage$Companion$create$key$1, encryptedItemStorage$Companion$create$1);
                if (objK != aVar) {
                }
                return aVar;
            }
            if (i9 == 1) {
                abstractC0906w2 = (AbstractC0906w) encryptedItemStorage$Companion$create$1.L$2;
                abstractC0906w = (AbstractC0906w) encryptedItemStorage$Companion$create$1.L$1;
                context = (Context) encryptedItemStorage$Companion$create$1.L$0;
                P.u0(objK);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SecretKeySpec secretKeySpec2 = (SecretKeySpec) encryptedItemStorage$Companion$create$1.L$2;
                AbstractC0906w abstractC0906w5 = (AbstractC0906w) encryptedItemStorage$Companion$create$1.L$1;
                AbstractC0906w abstractC0906w6 = (AbstractC0906w) encryptedItemStorage$Companion$create$1.L$0;
                P.u0(objK);
                secretKeySpec = secretKeySpec2;
                abstractC0906w4 = abstractC0906w5;
                abstractC0906w3 = abstractC0906w6;
            }
            k kVar = (k) objK;
            return new EncryptedItemStorage((Partition) kVar.f22539h, (Partition) kVar.f22540i, secretKeySpec, abstractC0906w3, abstractC0906w4, null);
            SecretKeySpec secretKeySpec3 = (SecretKeySpec) objK;
            EncryptedItemStorage$Companion$create$2 encryptedItemStorage$Companion$create$2 = new EncryptedItemStorage$Companion$create$2(new File(context.getFilesDir(), "rc_secure_backup.json"), new File(context.getNoBackupFilesDir(), "rc_secure_no_backup.json"), null);
            encryptedItemStorage$Companion$create$1.L$0 = abstractC0906w;
            encryptedItemStorage$Companion$create$1.L$1 = abstractC0906w2;
            encryptedItemStorage$Companion$create$1.L$2 = secretKeySpec3;
            encryptedItemStorage$Companion$create$1.label = 2;
            objK = C.K(abstractC0906w2, encryptedItemStorage$Companion$create$2, encryptedItemStorage$Companion$create$1);
            if (objK != aVar) {
                secretKeySpec = secretKeySpec3;
                abstractC0906w3 = abstractC0906w;
                abstractC0906w4 = abstractC0906w2;
                k kVar2 = (k) objK;
                return new EncryptedItemStorage((Partition) kVar2.f22539h, (Partition) kVar2.f22540i, secretKeySpec, abstractC0906w3, abstractC0906w4, null);
            }
            return aVar;
        }

        public final Map<String, String> loadStore$purchases_defaultsRelease(File file) {
            m.e(file, "file");
            if (!file.exists()) {
                return new LinkedHashMap();
            }
            try {
                byte[] bytes = new AtomicFile(file).readFully();
                m.d(bytes, "bytes");
                return p078i6.C.Z0(JSONObjectExtensionsKt.toMap$default(new JSONObject(new String(bytes, O7.a.f8024b)), false, 1, null));
            } catch (Exception e6) {
                LogLevel logLevel = LogLevel.WARN;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.w(M0.m(logLevel, new StringBuilder("[Purchases] - ")), "Failed to load secure store from " + file.getName() + ", starting empty: " + e6);
                }
                return new LinkedHashMap();
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/security/EncryptedItemStorage$Partition;", "", "file", "Ljava/io/File;", "contents", "", "", "(Ljava/io/File;Ljava/util/Map;)V", "getContents", "()Ljava/util/Map;", "getFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Partition {
        private final Map<String, String> contents;
        private final File file;

        public Partition(File file, Map<String, String> contents) {
            m.e(file, "file");
            m.e(contents, "contents");
            this.file = file;
            this.contents = contents;
        }

        public static Partition copy$default(Partition partition, File file, Map map, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                file = partition.file;
            }
            if ((i3 & 2) != 0) {
                map = partition.contents;
            }
            return partition.copy(file, map);
        }

        public final File getFile() {
            return this.file;
        }

        public final Map<String, String> component2() {
            return this.contents;
        }

        public final Partition copy(File file, Map<String, String> contents) {
            m.e(file, "file");
            m.e(contents, "contents");
            return new Partition(file, contents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Partition)) {
                return false;
            }
            Partition partition = (Partition) other;
            return m.a(this.file, partition.file) && m.a(this.contents, partition.contents);
        }

        public final Map<String, String> getContents() {
            return this.contents;
        }

        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.contents.hashCode() + (this.file.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Partition(file=");
            sb.append(this.file);
            sb.append(", contents=");
            return p.r(sb, this.contents, ')');
        }
    }

    public EncryptedItemStorage(Partition partition, Partition partition2, SecretKey secretKey, AbstractC0906w abstractC0906w, AbstractC0906w abstractC0906w2, AbstractC2541f abstractC2541f) {
        this(partition, partition2, secretKey, abstractC0906w, abstractC0906w2);
    }

    private final byte[] decrypt(byte[] data, String identifier) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrF0 = p078i6.m.f0(data, 0, 12);
        byte[] bArrF1 = p078i6.m.f0(data, 12, data.length);
        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
        cipher.init(2, this.key, new GCMParameterSpec(128, bArrF0));
        byte[] bytes = identifier.getBytes(O7.a.f8024b);
        m.d(bytes, "getBytes(...)");
        cipher.updateAAD(bytes);
        byte[] bArrDoFinal = cipher.doFinal(bArrF1);
        m.d(bArrDoFinal, "cipher.doFinal(ciphertext)");
        return bArrDoFinal;
    }

    private final byte[] encrypt(byte[] plaintext, String identifier) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
        cipher.init(1, this.key);
        byte[] bytes = identifier.getBytes(O7.a.f8024b);
        m.d(bytes, "getBytes(...)");
        cipher.updateAAD(bytes);
        byte[] ciphertext = cipher.doFinal(plaintext);
        byte[] iv = cipher.getIV();
        m.d(iv, "cipher.iv");
        m.d(ciphertext, "ciphertext");
        return p078i6.m.x0(iv, ciphertext);
    }

    private final void saveContents(File file, Map<String, String> contents) throws JSONException, SecureStorageException, IOException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : contents.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        AtomicFile atomicFile = new AtomicFile(file);
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            String string = jSONObject.toString();
            m.d(string, "json.toString()");
            byte[] bytes = string.getBytes(O7.a.f8024b);
            m.d(bytes, "getBytes(...)");
            fileOutputStreamStartWrite.write(bytes);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Exception e6) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw new SecureStorageException("Failed to write secure store to " + file.getName(), e6);
        }
    }

    @Override
    public List<String> allItemIdentifiers() {
        List<String> listN1;
        synchronized (this) {
            listN1 = o.N1(I.o0(this.backup.getContents().keySet(), this.noBackup.getContents().keySet()));
        }
        return listN1;
    }

    @Override
    public boolean containsItem(String identifier) {
        boolean z6;
        m.e(identifier, "identifier");
        synchronized (this) {
            z6 = this.backup.getContents().containsKey(identifier) || this.noBackup.getContents().containsKey(identifier);
        }
        return z6;
    }

    @Override
    public void deleteItem(String identifier) {
        m.e(identifier, "identifier");
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public byte[] readItem(String identifier) throws SecureStorageException {
        String str;
        m.e(identifier, "identifier");
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
            byte[] bArrDecode = Base64.decode(str, 2);
            m.d(bArrDecode, "decode(encoded, Base64.NO_WRAP)");
            return decrypt(bArrDecode, identifier);
        } catch (Exception e6) {
            throw new SecureStorageException(B2.a.i('\'', "Failed to read item '", identifier), e6);
        }
    }

    @Override
    public void saveItem(String identifier, byte[] contents, SecureItemAttributes attributes) throws SecureStorageException {
        m.e(identifier, "identifier");
        m.e(contents, "contents");
        m.e(attributes, "attributes");
        try {
            String encoded = Base64.encodeToString(encrypt(contents, identifier), 2);
            Partition partition = attributes.getIncludedInBackup() ? this.backup : this.noBackup;
            Partition partition2 = attributes.getIncludedInBackup() ? this.noBackup : this.backup;
            synchronized (this) {
                try {
                    boolean zContainsKey = partition2.getContents().containsKey(identifier);
                    if (zContainsKey) {
                        saveContents(partition2.getFile(), p078i6.C.O0(identifier, partition2.getContents()));
                    }
                    saveContents(partition.getFile(), p078i6.C.S0(partition.getContents(), new k(identifier, encoded)));
                    if (zContainsKey) {
                        partition2.getContents().remove(identifier);
                    }
                    Map<String, String> contents2 = partition.getContents();
                    m.d(encoded, "encoded");
                    contents2.put(identifier, encoded);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e6) {
            throw new SecureStorageException(B2.a.i('\'', "Failed to save item '", identifier), e6);
        }
    }

    public EncryptedItemStorage(Partition partition, Partition partition2, SecretKey secretKey, AbstractC0906w abstractC0906w, AbstractC0906w abstractC0906w2, int i3, AbstractC2541f abstractC2541f) {
        AbstractC0906w abstractC0906w3 = (i3 & 8) != 0 ? M.f9549a : abstractC0906w;
        if ((i3 & 16) != 0) {
            e eVar = M.f9549a;
            abstractC0906w2 = d.f13044i;
        }
        this(partition, partition2, secretKey, abstractC0906w3, abstractC0906w2);
    }

    public EncryptedItemStorage(File file, File file2, SecretKey secretKey, AbstractC0906w abstractC0906w, AbstractC0906w abstractC0906w2, int i3, AbstractC2541f abstractC2541f) {
        AbstractC0906w abstractC0906w3 = (i3 & 8) != 0 ? M.f9549a : abstractC0906w;
        if ((i3 & 16) != 0) {
            e eVar = M.f9549a;
            abstractC0906w2 = d.f13044i;
        }
        this(file, file2, secretKey, abstractC0906w3, abstractC0906w2);
    }

    private EncryptedItemStorage(Partition partition, Partition partition2, SecretKey secretKey, AbstractC0906w abstractC0906w, AbstractC0906w abstractC0906w2) {
        this.backup = partition;
        this.noBackup = partition2;
        this.key = secretKey;
        this.computationDispatcher = abstractC0906w;
        this.ioDispatcher = abstractC0906w2;
    }

    public EncryptedItemStorage(File backupFile, File noBackupFile, SecretKey key, AbstractC0906w computationDispatcher, AbstractC0906w ioDispatcher) {
        m.e(backupFile, "backupFile");
        m.e(noBackupFile, "noBackupFile");
        m.e(key, "key");
        m.e(computationDispatcher, "computationDispatcher");
        m.e(ioDispatcher, "ioDispatcher");
        Companion companion = INSTANCE;
        this(new Partition(backupFile, companion.loadStore$purchases_defaultsRelease(backupFile)), new Partition(noBackupFile, companion.loadStore$purchases_defaultsRelease(noBackupFile)), key, computationDispatcher, ioDispatcher);
    }
}
