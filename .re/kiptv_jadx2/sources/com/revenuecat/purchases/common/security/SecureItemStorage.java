package com.revenuecat.purchases.common.security;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/security/SecureItemStorage;", "", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "containsItem", "(Ljava/lang/String;)Z", "", "allItemIdentifiers", "()Ljava/util/List;", "", "readItem", "(Ljava/lang/String;)[B", "contents", "Lcom/revenuecat/purchases/common/security/SecureItemAttributes;", "attributes", "Lh6/A;", "modifyItem", "(Ljava/lang/String;[BLcom/revenuecat/purchases/common/security/SecureItemAttributes;)V", "saveItem", "deleteItem", "(Ljava/lang/String;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SecureItemStorage {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean containsItem(SecureItemStorage secureItemStorage, String identifier) {
            m.e(identifier, "identifier");
            return SecureItemStorage.super.containsItem(identifier);
        }

        @Deprecated
        public static void modifyItem(SecureItemStorage secureItemStorage, String identifier, byte[] bArr, SecureItemAttributes attributes) {
            m.e(identifier, "identifier");
            m.e(attributes, "attributes");
            SecureItemStorage.super.modifyItem(identifier, bArr, attributes);
        }
    }

    static void modifyItem$default(SecureItemStorage secureItemStorage, String str, byte[] bArr, SecureItemAttributes secureItemAttributes, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modifyItem");
        }
        if ((i3 & 4) != 0) {
            secureItemAttributes = new SecureItemAttributes(false, 1, null);
        }
        secureItemStorage.modifyItem(str, bArr, secureItemAttributes);
    }

    static void saveItem$default(SecureItemStorage secureItemStorage, String str, byte[] bArr, SecureItemAttributes secureItemAttributes, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveItem");
        }
        if ((i3 & 4) != 0) {
            secureItemAttributes = new SecureItemAttributes(false, 1, null);
        }
        secureItemStorage.saveItem(str, bArr, secureItemAttributes);
    }

    List<String> allItemIdentifiers();

    default boolean containsItem(String identifier) {
        m.e(identifier, "identifier");
        return allItemIdentifiers().contains(identifier);
    }

    void deleteItem(String identifier);

    default void modifyItem(String identifier, byte[] contents, SecureItemAttributes attributes) {
        m.e(identifier, "identifier");
        m.e(attributes, "attributes");
        if (contents != null) {
            saveItem(identifier, contents, attributes);
        } else {
            deleteItem(identifier);
        }
    }

    byte[] readItem(String identifier);

    void saveItem(String identifier, byte[] contents, SecureItemAttributes attributes);
}
