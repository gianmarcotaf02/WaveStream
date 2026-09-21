package io.github.jan.supabase.auth.exception;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bY\b\u0086\u0081\u0002\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001[B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZ¨\u0006\\"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UnexpectedFailure", "ValidationFailed", "BadJson", "EmailExists", "PhoneExists", "BadJwt", "NotAdmin", "NoAuthorization", "UserNotFound", "SessionNotFound", "SessionExpired", "RefreshTokenNotFound", "RefreshTokenAlreadyUsed", "FlowStateNotFound", "FlowStateExpired", "SignupDisabled", "UserBanned", "ProviderEmailNeedsVerification", "InviteNotFound", "BadOauthState", "BadOauthCallback", "OauthProviderNotSupported", "UnexpectedAudience", "SingleIdentityNotDeletable", "EmailConflictIdentityNotDeletable", "IdentityAlreadyExists", "EmailProviderDisabled", "PhoneProviderDisabled", "TooManyEnrolledMfaFactors", "MfaFactorNameConflict", "MfaFactorNotFound", "MfaIpAddressMismatch", "MfaChallengeExpired", "MfaVerificationFailed", "MfaVerificationRejected", "InsufficientAal", "CaptchaFailed", "SamlProviderDisabled", "ManualLinkingDisabled", "SmsSendFailed", "EmailNotConfirmed", "PhoneNotConfirmed", "ReauthNonceMissing", "SamlRelayStateNotFound", "SamlRelayStateExpired", "SamlIdpNotFound", "SamlAssertionNoUserId", "SamlAssertionNoEmail", "UserAlreadyExists", "SsoProviderNotFound", "SamlMetadataFetchFailed", "SamlIdpAlreadyExists", "SsoDomainAlreadyExists", "SamlEntityIdMismatch", "Conflict", "ProviderDisabled", "UserSsoManaged", "ReauthenticationNeeded", "SamePassword", "ReauthenticationNotValid", "OtpExpired", "OtpDisabled", "IdentityNotFound", "WeakPassword", "OverRequestRateLimit", "OverEmailSendRateLimit", "OverSmsSendRateLimit", "BadCodeVerifier", "InvalidCredentials", "EmailAddressNotAuthorized", "AnonymousProviderDisabled", "HookTimeout", "HookTimeoutAfterRetry", "HookPayloadOverSizeLimit", "HookPayloadInvalidContentType", "RequestTimeout", "MfaPhoneEnrollDisabled", "MfaPhoneVerifyDisabled", "MfaTotpEnrollDisabled", "MfaTotpVerifyDisabled", "MfaWebAuthnEnrollDisabled", "MfaWebAuthnVerifyDisabled", "MfaVerifiedFactorExists", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum AuthErrorCode {
    UnexpectedFailure("unexpected_failure"),
    ValidationFailed("validation_failed"),
    BadJson("bad_json"),
    EmailExists("email_exists"),
    PhoneExists("phone_exists"),
    BadJwt("bad_jwt"),
    NotAdmin("not_admin"),
    NoAuthorization("no_authorization"),
    UserNotFound("user_not_found"),
    SessionNotFound(io.github.jan.supabase.auth.exception.AuthSessionMissingException.CODE),
    SessionExpired("session_expired"),
    RefreshTokenNotFound("refresh_token_not_found"),
    RefreshTokenAlreadyUsed("refresh_token_already_used"),
    FlowStateNotFound("flow_state_not_found"),
    FlowStateExpired("flow_state_expired"),
    SignupDisabled("signup_disabled"),
    UserBanned("user_banned"),
    ProviderEmailNeedsVerification("provider_email_needs_verification"),
    InviteNotFound("invite_not_found"),
    BadOauthState("bad_oauth_state"),
    BadOauthCallback("bad_oauth_callback"),
    OauthProviderNotSupported("oauth_provider_not_supported"),
    UnexpectedAudience("unexpected_audience"),
    SingleIdentityNotDeletable("single_identity_not_deletable"),
    EmailConflictIdentityNotDeletable("email_conflict_identity_not_deletable"),
    IdentityAlreadyExists("identity_already_exists"),
    EmailProviderDisabled("email_provider_disabled"),
    PhoneProviderDisabled("phone_provider_disabled"),
    TooManyEnrolledMfaFactors("too_many_enrolled_mfa_factors"),
    MfaFactorNameConflict("mfa_factor_name_conflict"),
    MfaFactorNotFound("mfa_factor_not_found"),
    MfaIpAddressMismatch("mfa_ip_address_mismatch"),
    MfaChallengeExpired("mfa_challenge_expired"),
    MfaVerificationFailed("mfa_verification_failed"),
    MfaVerificationRejected("mfa_verification_rejected"),
    InsufficientAal("insufficient_aal"),
    CaptchaFailed("captcha_failed"),
    SamlProviderDisabled("saml_provider_disabled"),
    ManualLinkingDisabled("manual_linking_disabled"),
    SmsSendFailed("sms_send_failed"),
    EmailNotConfirmed("email_not_confirmed"),
    PhoneNotConfirmed("phone_not_confirmed"),
    ReauthNonceMissing("reauth_nonce_missing"),
    SamlRelayStateNotFound("saml_relay_state_not_found"),
    SamlRelayStateExpired("saml_relay_state_expired"),
    SamlIdpNotFound("saml_idp_not_found"),
    SamlAssertionNoUserId("saml_assertion_no_user_id"),
    SamlAssertionNoEmail("saml_assertion_no_email"),
    UserAlreadyExists("user_already_exists"),
    SsoProviderNotFound("sso_provider_not_found"),
    SamlMetadataFetchFailed("saml_metadata_fetch_failed"),
    SamlIdpAlreadyExists("saml_idp_already_exists"),
    SsoDomainAlreadyExists("sso_domain_already_exists"),
    SamlEntityIdMismatch("saml_entity_id_mismatch"),
    Conflict("conflict"),
    ProviderDisabled("provider_disabled"),
    UserSsoManaged("user_sso_managed"),
    ReauthenticationNeeded("reauthentication_needed"),
    SamePassword("same_password"),
    ReauthenticationNotValid("reauthentication_not_valid"),
    OtpExpired("otp_expired"),
    OtpDisabled("otp_disabled"),
    IdentityNotFound("identity_not_found"),
    WeakPassword(io.github.jan.supabase.auth.exception.AuthWeakPasswordException.CODE),
    OverRequestRateLimit("over_request_rate_limit"),
    OverEmailSendRateLimit("over_email_send_rate_limit"),
    OverSmsSendRateLimit("over_sms_send_rate_limit"),
    BadCodeVerifier("bad_code_verifier"),
    InvalidCredentials("invalid_credentials"),
    EmailAddressNotAuthorized("email_address_not_authorized"),
    AnonymousProviderDisabled("anonymous_provider_disabled"),
    HookTimeout("hook_timeout"),
    HookTimeoutAfterRetry("hook_timeout_after_retry"),
    HookPayloadOverSizeLimit("hook_payload_over_size_limit"),
    HookPayloadInvalidContentType("hook_payload_invalid_content_type"),
    RequestTimeout("request_timeout"),
    MfaPhoneEnrollDisabled("mfa_phone_enroll_not_enabled"),
    MfaPhoneVerifyDisabled("mfa_phone_verify_not_enabled"),
    MfaTotpEnrollDisabled("mfa_totp_enroll_not_enabled"),
    MfaTotpVerifyDisabled("mfa_totp_verify_not_enabled"),
    MfaWebAuthnEnrollDisabled("mfa_webauthn_enroll_not_enabled"),
    MfaWebAuthnVerifyDisabled("mfa_webauthn_verify_not_enabled"),
    MfaVerifiedFactorExists("mfa_verified_factor_exists");

    private final java.lang.String value;
    private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.exception.AuthErrorCode.Companion INSTANCE = new io.github.jan.supabase.auth.exception.AuthErrorCode.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthErrorCode$Companion;", "", "<init>", "()V", "fromValue", "Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "value", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.github.jan.supabase.auth.exception.AuthErrorCode fromValue(java.lang.String value) {
            java.lang.Object next;
            kotlin.jvm.internal.m.e(value, "value");
            java.util.Iterator<E> it = io.github.jan.supabase.auth.exception.AuthErrorCode.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (kotlin.jvm.internal.m.a(((io.github.jan.supabase.auth.exception.AuthErrorCode) next).getValue(), value)) {
                    return (io.github.jan.supabase.auth.exception.AuthErrorCode) next;
                }
            }
            next = null;
            return (io.github.jan.supabase.auth.exception.AuthErrorCode) next;
        }

        private Companion() {
        }
    }

    AuthErrorCode(java.lang.String str) {
        this.value = str;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public final java.lang.String getValue() {
        return this.value;
    }
}
