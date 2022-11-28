/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.0.0-alpha.0
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// AcceptOAuth2LoginRequest struct for AcceptOAuth2LoginRequest
type AcceptOAuth2LoginRequest struct {
	// ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
	Acr *string `json:"acr,omitempty"`
	Amr []string `json:"amr,omitempty"`
	Context map[string]interface{} `json:"context,omitempty"`
	// ForceSubjectIdentifier forces the \"pairwise\" user ID of the end-user that authenticated. The \"pairwise\" user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\"user\") identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if `pairwise` is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via `subject_type` key in the client's configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.
	ForceSubjectIdentifier *string `json:"force_subject_identifier,omitempty"`
	// Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.
	Remember *bool `json:"remember,omitempty"`
	// RememberFor sets how long the authentication should be remembered for in seconds. If set to `0`, the authorization will be remembered for the duration of the browser session (using a session cookie).
	RememberFor *int64 `json:"remember_for,omitempty"`
	// Subject is the user ID of the end-user that authenticated.
	Subject string `json:"subject"`
}

// NewAcceptOAuth2LoginRequest instantiates a new AcceptOAuth2LoginRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAcceptOAuth2LoginRequest(subject string) *AcceptOAuth2LoginRequest {
	this := AcceptOAuth2LoginRequest{}
	this.Subject = subject
	return &this
}

// NewAcceptOAuth2LoginRequestWithDefaults instantiates a new AcceptOAuth2LoginRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAcceptOAuth2LoginRequestWithDefaults() *AcceptOAuth2LoginRequest {
	this := AcceptOAuth2LoginRequest{}
	return &this
}

// GetAcr returns the Acr field value if set, zero value otherwise.
func (o *AcceptOAuth2LoginRequest) GetAcr() string {
	if o == nil || o.Acr == nil {
		var ret string
		return ret
	}
	return *o.Acr
}

// GetAcrOk returns a tuple with the Acr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AcceptOAuth2LoginRequest) GetAcrOk() (*string, bool) {
	if o == nil || o.Acr == nil {
		return nil, false
	}
	return o.Acr, true
}

// HasAcr returns a boolean if a field has been set.
func (o *AcceptOAuth2LoginRequest) HasAcr() bool {
	if o != nil && o.Acr != nil {
		return true
	}

	return false
}

// SetAcr gets a reference to the given string and assigns it to the Acr field.
func (o *AcceptOAuth2LoginRequest) SetAcr(v string) {
	o.Acr = &v
}

// GetAmr returns the Amr field value if set, zero value otherwise.
func (o *AcceptOAuth2LoginRequest) GetAmr() []string {
	if o == nil || o.Amr == nil {
		var ret []string
		return ret
	}
	return o.Amr
}

// GetAmrOk returns a tuple with the Amr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AcceptOAuth2LoginRequest) GetAmrOk() ([]string, bool) {
	if o == nil || o.Amr == nil {
		return nil, false
	}
	return o.Amr, true
}

// HasAmr returns a boolean if a field has been set.
func (o *AcceptOAuth2LoginRequest) HasAmr() bool {
	if o != nil && o.Amr != nil {
		return true
	}

	return false
}

// SetAmr gets a reference to the given []string and assigns it to the Amr field.
func (o *AcceptOAuth2LoginRequest) SetAmr(v []string) {
	o.Amr = v
}

// GetContext returns the Context field value if set, zero value otherwise.
func (o *AcceptOAuth2LoginRequest) GetContext() map[string]interface{} {
	if o == nil || o.Context == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Context
}

// GetContextOk returns a tuple with the Context field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AcceptOAuth2LoginRequest) GetContextOk() (map[string]interface{}, bool) {
	if o == nil || o.Context == nil {
		return nil, false
	}
	return o.Context, true
}

// HasContext returns a boolean if a field has been set.
func (o *AcceptOAuth2LoginRequest) HasContext() bool {
	if o != nil && o.Context != nil {
		return true
	}

	return false
}

// SetContext gets a reference to the given map[string]interface{} and assigns it to the Context field.
func (o *AcceptOAuth2LoginRequest) SetContext(v map[string]interface{}) {
	o.Context = v
}

// GetForceSubjectIdentifier returns the ForceSubjectIdentifier field value if set, zero value otherwise.
func (o *AcceptOAuth2LoginRequest) GetForceSubjectIdentifier() string {
	if o == nil || o.ForceSubjectIdentifier == nil {
		var ret string
		return ret
	}
	return *o.ForceSubjectIdentifier
}

// GetForceSubjectIdentifierOk returns a tuple with the ForceSubjectIdentifier field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AcceptOAuth2LoginRequest) GetForceSubjectIdentifierOk() (*string, bool) {
	if o == nil || o.ForceSubjectIdentifier == nil {
		return nil, false
	}
	return o.ForceSubjectIdentifier, true
}

// HasForceSubjectIdentifier returns a boolean if a field has been set.
func (o *AcceptOAuth2LoginRequest) HasForceSubjectIdentifier() bool {
	if o != nil && o.ForceSubjectIdentifier != nil {
		return true
	}

	return false
}

// SetForceSubjectIdentifier gets a reference to the given string and assigns it to the ForceSubjectIdentifier field.
func (o *AcceptOAuth2LoginRequest) SetForceSubjectIdentifier(v string) {
	o.ForceSubjectIdentifier = &v
}

// GetRemember returns the Remember field value if set, zero value otherwise.
func (o *AcceptOAuth2LoginRequest) GetRemember() bool {
	if o == nil || o.Remember == nil {
		var ret bool
		return ret
	}
	return *o.Remember
}

// GetRememberOk returns a tuple with the Remember field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AcceptOAuth2LoginRequest) GetRememberOk() (*bool, bool) {
	if o == nil || o.Remember == nil {
		return nil, false
	}
	return o.Remember, true
}

// HasRemember returns a boolean if a field has been set.
func (o *AcceptOAuth2LoginRequest) HasRemember() bool {
	if o != nil && o.Remember != nil {
		return true
	}

	return false
}

// SetRemember gets a reference to the given bool and assigns it to the Remember field.
func (o *AcceptOAuth2LoginRequest) SetRemember(v bool) {
	o.Remember = &v
}

// GetRememberFor returns the RememberFor field value if set, zero value otherwise.
func (o *AcceptOAuth2LoginRequest) GetRememberFor() int64 {
	if o == nil || o.RememberFor == nil {
		var ret int64
		return ret
	}
	return *o.RememberFor
}

// GetRememberForOk returns a tuple with the RememberFor field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AcceptOAuth2LoginRequest) GetRememberForOk() (*int64, bool) {
	if o == nil || o.RememberFor == nil {
		return nil, false
	}
	return o.RememberFor, true
}

// HasRememberFor returns a boolean if a field has been set.
func (o *AcceptOAuth2LoginRequest) HasRememberFor() bool {
	if o != nil && o.RememberFor != nil {
		return true
	}

	return false
}

// SetRememberFor gets a reference to the given int64 and assigns it to the RememberFor field.
func (o *AcceptOAuth2LoginRequest) SetRememberFor(v int64) {
	o.RememberFor = &v
}

// GetSubject returns the Subject field value
func (o *AcceptOAuth2LoginRequest) GetSubject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value
// and a boolean to check if the value has been set.
func (o *AcceptOAuth2LoginRequest) GetSubjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Subject, true
}

// SetSubject sets field value
func (o *AcceptOAuth2LoginRequest) SetSubject(v string) {
	o.Subject = v
}

func (o AcceptOAuth2LoginRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Acr != nil {
		toSerialize["acr"] = o.Acr
	}
	if o.Amr != nil {
		toSerialize["amr"] = o.Amr
	}
	if o.Context != nil {
		toSerialize["context"] = o.Context
	}
	if o.ForceSubjectIdentifier != nil {
		toSerialize["force_subject_identifier"] = o.ForceSubjectIdentifier
	}
	if o.Remember != nil {
		toSerialize["remember"] = o.Remember
	}
	if o.RememberFor != nil {
		toSerialize["remember_for"] = o.RememberFor
	}
	if true {
		toSerialize["subject"] = o.Subject
	}
	return json.Marshal(toSerialize)
}

type NullableAcceptOAuth2LoginRequest struct {
	value *AcceptOAuth2LoginRequest
	isSet bool
}

func (v NullableAcceptOAuth2LoginRequest) Get() *AcceptOAuth2LoginRequest {
	return v.value
}

func (v *NullableAcceptOAuth2LoginRequest) Set(val *AcceptOAuth2LoginRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableAcceptOAuth2LoginRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableAcceptOAuth2LoginRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAcceptOAuth2LoginRequest(val *AcceptOAuth2LoginRequest) *NullableAcceptOAuth2LoginRequest {
	return &NullableAcceptOAuth2LoginRequest{value: val, isSet: true}
}

func (v NullableAcceptOAuth2LoginRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAcceptOAuth2LoginRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


