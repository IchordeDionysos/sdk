/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v0.2.0-alpha.47
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ConsentRequest struct for ConsentRequest
type ConsentRequest struct {
	// ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
	Acr *string `json:"acr,omitempty"`
	Amr []string `json:"amr,omitempty"`
	// ID is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.
	Challenge string `json:"challenge"`
	Client *OAuth2Client `json:"client,omitempty"`
	Context map[string]interface{} `json:"context,omitempty"`
	// LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.
	LoginChallenge *string `json:"login_challenge,omitempty"`
	// LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It's value can generally be used to associate consecutive login requests by a certain user.
	LoginSessionId *string `json:"login_session_id,omitempty"`
	OidcContext *OpenIDConnectContext `json:"oidc_context,omitempty"`
	// RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
	RequestUrl *string `json:"request_url,omitempty"`
	RequestedAccessTokenAudience []string `json:"requested_access_token_audience,omitempty"`
	RequestedScope []string `json:"requested_scope,omitempty"`
	// Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
	Skip *bool `json:"skip,omitempty"`
	// Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
	Subject *string `json:"subject,omitempty"`
}

// NewConsentRequest instantiates a new ConsentRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConsentRequest(challenge string) *ConsentRequest {
	this := ConsentRequest{}
	this.Challenge = challenge
	return &this
}

// NewConsentRequestWithDefaults instantiates a new ConsentRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConsentRequestWithDefaults() *ConsentRequest {
	this := ConsentRequest{}
	return &this
}

// GetAcr returns the Acr field value if set, zero value otherwise.
func (o *ConsentRequest) GetAcr() string {
	if o == nil || o.Acr == nil {
		var ret string
		return ret
	}
	return *o.Acr
}

// GetAcrOk returns a tuple with the Acr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetAcrOk() (*string, bool) {
	if o == nil || o.Acr == nil {
		return nil, false
	}
	return o.Acr, true
}

// HasAcr returns a boolean if a field has been set.
func (o *ConsentRequest) HasAcr() bool {
	if o != nil && o.Acr != nil {
		return true
	}

	return false
}

// SetAcr gets a reference to the given string and assigns it to the Acr field.
func (o *ConsentRequest) SetAcr(v string) {
	o.Acr = &v
}

// GetAmr returns the Amr field value if set, zero value otherwise.
func (o *ConsentRequest) GetAmr() []string {
	if o == nil || o.Amr == nil {
		var ret []string
		return ret
	}
	return o.Amr
}

// GetAmrOk returns a tuple with the Amr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetAmrOk() ([]string, bool) {
	if o == nil || o.Amr == nil {
		return nil, false
	}
	return o.Amr, true
}

// HasAmr returns a boolean if a field has been set.
func (o *ConsentRequest) HasAmr() bool {
	if o != nil && o.Amr != nil {
		return true
	}

	return false
}

// SetAmr gets a reference to the given []string and assigns it to the Amr field.
func (o *ConsentRequest) SetAmr(v []string) {
	o.Amr = v
}

// GetChallenge returns the Challenge field value
func (o *ConsentRequest) GetChallenge() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Challenge
}

// GetChallengeOk returns a tuple with the Challenge field value
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetChallengeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Challenge, true
}

// SetChallenge sets field value
func (o *ConsentRequest) SetChallenge(v string) {
	o.Challenge = v
}

// GetClient returns the Client field value if set, zero value otherwise.
func (o *ConsentRequest) GetClient() OAuth2Client {
	if o == nil || o.Client == nil {
		var ret OAuth2Client
		return ret
	}
	return *o.Client
}

// GetClientOk returns a tuple with the Client field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetClientOk() (*OAuth2Client, bool) {
	if o == nil || o.Client == nil {
		return nil, false
	}
	return o.Client, true
}

// HasClient returns a boolean if a field has been set.
func (o *ConsentRequest) HasClient() bool {
	if o != nil && o.Client != nil {
		return true
	}

	return false
}

// SetClient gets a reference to the given OAuth2Client and assigns it to the Client field.
func (o *ConsentRequest) SetClient(v OAuth2Client) {
	o.Client = &v
}

// GetContext returns the Context field value if set, zero value otherwise.
func (o *ConsentRequest) GetContext() map[string]interface{} {
	if o == nil || o.Context == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Context
}

// GetContextOk returns a tuple with the Context field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetContextOk() (map[string]interface{}, bool) {
	if o == nil || o.Context == nil {
		return nil, false
	}
	return o.Context, true
}

// HasContext returns a boolean if a field has been set.
func (o *ConsentRequest) HasContext() bool {
	if o != nil && o.Context != nil {
		return true
	}

	return false
}

// SetContext gets a reference to the given map[string]interface{} and assigns it to the Context field.
func (o *ConsentRequest) SetContext(v map[string]interface{}) {
	o.Context = v
}

// GetLoginChallenge returns the LoginChallenge field value if set, zero value otherwise.
func (o *ConsentRequest) GetLoginChallenge() string {
	if o == nil || o.LoginChallenge == nil {
		var ret string
		return ret
	}
	return *o.LoginChallenge
}

// GetLoginChallengeOk returns a tuple with the LoginChallenge field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetLoginChallengeOk() (*string, bool) {
	if o == nil || o.LoginChallenge == nil {
		return nil, false
	}
	return o.LoginChallenge, true
}

// HasLoginChallenge returns a boolean if a field has been set.
func (o *ConsentRequest) HasLoginChallenge() bool {
	if o != nil && o.LoginChallenge != nil {
		return true
	}

	return false
}

// SetLoginChallenge gets a reference to the given string and assigns it to the LoginChallenge field.
func (o *ConsentRequest) SetLoginChallenge(v string) {
	o.LoginChallenge = &v
}

// GetLoginSessionId returns the LoginSessionId field value if set, zero value otherwise.
func (o *ConsentRequest) GetLoginSessionId() string {
	if o == nil || o.LoginSessionId == nil {
		var ret string
		return ret
	}
	return *o.LoginSessionId
}

// GetLoginSessionIdOk returns a tuple with the LoginSessionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetLoginSessionIdOk() (*string, bool) {
	if o == nil || o.LoginSessionId == nil {
		return nil, false
	}
	return o.LoginSessionId, true
}

// HasLoginSessionId returns a boolean if a field has been set.
func (o *ConsentRequest) HasLoginSessionId() bool {
	if o != nil && o.LoginSessionId != nil {
		return true
	}

	return false
}

// SetLoginSessionId gets a reference to the given string and assigns it to the LoginSessionId field.
func (o *ConsentRequest) SetLoginSessionId(v string) {
	o.LoginSessionId = &v
}

// GetOidcContext returns the OidcContext field value if set, zero value otherwise.
func (o *ConsentRequest) GetOidcContext() OpenIDConnectContext {
	if o == nil || o.OidcContext == nil {
		var ret OpenIDConnectContext
		return ret
	}
	return *o.OidcContext
}

// GetOidcContextOk returns a tuple with the OidcContext field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetOidcContextOk() (*OpenIDConnectContext, bool) {
	if o == nil || o.OidcContext == nil {
		return nil, false
	}
	return o.OidcContext, true
}

// HasOidcContext returns a boolean if a field has been set.
func (o *ConsentRequest) HasOidcContext() bool {
	if o != nil && o.OidcContext != nil {
		return true
	}

	return false
}

// SetOidcContext gets a reference to the given OpenIDConnectContext and assigns it to the OidcContext field.
func (o *ConsentRequest) SetOidcContext(v OpenIDConnectContext) {
	o.OidcContext = &v
}

// GetRequestUrl returns the RequestUrl field value if set, zero value otherwise.
func (o *ConsentRequest) GetRequestUrl() string {
	if o == nil || o.RequestUrl == nil {
		var ret string
		return ret
	}
	return *o.RequestUrl
}

// GetRequestUrlOk returns a tuple with the RequestUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetRequestUrlOk() (*string, bool) {
	if o == nil || o.RequestUrl == nil {
		return nil, false
	}
	return o.RequestUrl, true
}

// HasRequestUrl returns a boolean if a field has been set.
func (o *ConsentRequest) HasRequestUrl() bool {
	if o != nil && o.RequestUrl != nil {
		return true
	}

	return false
}

// SetRequestUrl gets a reference to the given string and assigns it to the RequestUrl field.
func (o *ConsentRequest) SetRequestUrl(v string) {
	o.RequestUrl = &v
}

// GetRequestedAccessTokenAudience returns the RequestedAccessTokenAudience field value if set, zero value otherwise.
func (o *ConsentRequest) GetRequestedAccessTokenAudience() []string {
	if o == nil || o.RequestedAccessTokenAudience == nil {
		var ret []string
		return ret
	}
	return o.RequestedAccessTokenAudience
}

// GetRequestedAccessTokenAudienceOk returns a tuple with the RequestedAccessTokenAudience field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetRequestedAccessTokenAudienceOk() ([]string, bool) {
	if o == nil || o.RequestedAccessTokenAudience == nil {
		return nil, false
	}
	return o.RequestedAccessTokenAudience, true
}

// HasRequestedAccessTokenAudience returns a boolean if a field has been set.
func (o *ConsentRequest) HasRequestedAccessTokenAudience() bool {
	if o != nil && o.RequestedAccessTokenAudience != nil {
		return true
	}

	return false
}

// SetRequestedAccessTokenAudience gets a reference to the given []string and assigns it to the RequestedAccessTokenAudience field.
func (o *ConsentRequest) SetRequestedAccessTokenAudience(v []string) {
	o.RequestedAccessTokenAudience = v
}

// GetRequestedScope returns the RequestedScope field value if set, zero value otherwise.
func (o *ConsentRequest) GetRequestedScope() []string {
	if o == nil || o.RequestedScope == nil {
		var ret []string
		return ret
	}
	return o.RequestedScope
}

// GetRequestedScopeOk returns a tuple with the RequestedScope field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetRequestedScopeOk() ([]string, bool) {
	if o == nil || o.RequestedScope == nil {
		return nil, false
	}
	return o.RequestedScope, true
}

// HasRequestedScope returns a boolean if a field has been set.
func (o *ConsentRequest) HasRequestedScope() bool {
	if o != nil && o.RequestedScope != nil {
		return true
	}

	return false
}

// SetRequestedScope gets a reference to the given []string and assigns it to the RequestedScope field.
func (o *ConsentRequest) SetRequestedScope(v []string) {
	o.RequestedScope = v
}

// GetSkip returns the Skip field value if set, zero value otherwise.
func (o *ConsentRequest) GetSkip() bool {
	if o == nil || o.Skip == nil {
		var ret bool
		return ret
	}
	return *o.Skip
}

// GetSkipOk returns a tuple with the Skip field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetSkipOk() (*bool, bool) {
	if o == nil || o.Skip == nil {
		return nil, false
	}
	return o.Skip, true
}

// HasSkip returns a boolean if a field has been set.
func (o *ConsentRequest) HasSkip() bool {
	if o != nil && o.Skip != nil {
		return true
	}

	return false
}

// SetSkip gets a reference to the given bool and assigns it to the Skip field.
func (o *ConsentRequest) SetSkip(v bool) {
	o.Skip = &v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *ConsentRequest) GetSubject() string {
	if o == nil || o.Subject == nil {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConsentRequest) GetSubjectOk() (*string, bool) {
	if o == nil || o.Subject == nil {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *ConsentRequest) HasSubject() bool {
	if o != nil && o.Subject != nil {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *ConsentRequest) SetSubject(v string) {
	o.Subject = &v
}

func (o ConsentRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Acr != nil {
		toSerialize["acr"] = o.Acr
	}
	if o.Amr != nil {
		toSerialize["amr"] = o.Amr
	}
	if true {
		toSerialize["challenge"] = o.Challenge
	}
	if o.Client != nil {
		toSerialize["client"] = o.Client
	}
	if o.Context != nil {
		toSerialize["context"] = o.Context
	}
	if o.LoginChallenge != nil {
		toSerialize["login_challenge"] = o.LoginChallenge
	}
	if o.LoginSessionId != nil {
		toSerialize["login_session_id"] = o.LoginSessionId
	}
	if o.OidcContext != nil {
		toSerialize["oidc_context"] = o.OidcContext
	}
	if o.RequestUrl != nil {
		toSerialize["request_url"] = o.RequestUrl
	}
	if o.RequestedAccessTokenAudience != nil {
		toSerialize["requested_access_token_audience"] = o.RequestedAccessTokenAudience
	}
	if o.RequestedScope != nil {
		toSerialize["requested_scope"] = o.RequestedScope
	}
	if o.Skip != nil {
		toSerialize["skip"] = o.Skip
	}
	if o.Subject != nil {
		toSerialize["subject"] = o.Subject
	}
	return json.Marshal(toSerialize)
}

type NullableConsentRequest struct {
	value *ConsentRequest
	isSet bool
}

func (v NullableConsentRequest) Get() *ConsentRequest {
	return v.value
}

func (v *NullableConsentRequest) Set(val *ConsentRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableConsentRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableConsentRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConsentRequest(val *ConsentRequest) *NullableConsentRequest {
	return &NullableConsentRequest{value: val, isSet: true}
}

func (v NullableConsentRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConsentRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


