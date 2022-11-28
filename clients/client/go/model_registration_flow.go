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
	"time"
)

// RegistrationFlow struct for RegistrationFlow
type RegistrationFlow struct {
	Active *IdentityCredentialsType `json:"active,omitempty"`
	// ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
	ExpiresAt time.Time `json:"expires_at"`
	// ID represents the flow's unique ID. When performing the registration flow, this represents the id in the registration ui's query parameter: http://<selfservice.flows.registration.ui_url>/?flow=<id>
	Id string `json:"id"`
	// IssuedAt is the time (UTC) when the flow occurred.
	IssuedAt time.Time `json:"issued_at"`
	Oauth2LoginChallenge NullableString `json:"oauth2_login_challenge,omitempty"`
	Oauth2LoginRequest *OAuth2LoginRequest `json:"oauth2_login_request,omitempty"`
	// RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.
	RequestUrl string `json:"request_url"`
	// ReturnTo contains the requested return_to URL.
	ReturnTo *string `json:"return_to,omitempty"`
	// The flow type can either be `api` or `browser`.
	Type string `json:"type"`
	Ui UiContainer `json:"ui"`
}

// NewRegistrationFlow instantiates a new RegistrationFlow object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRegistrationFlow(expiresAt time.Time, id string, issuedAt time.Time, requestUrl string, type_ string, ui UiContainer) *RegistrationFlow {
	this := RegistrationFlow{}
	this.ExpiresAt = expiresAt
	this.Id = id
	this.IssuedAt = issuedAt
	this.RequestUrl = requestUrl
	this.Type = type_
	this.Ui = ui
	return &this
}

// NewRegistrationFlowWithDefaults instantiates a new RegistrationFlow object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRegistrationFlowWithDefaults() *RegistrationFlow {
	this := RegistrationFlow{}
	return &this
}

// GetActive returns the Active field value if set, zero value otherwise.
func (o *RegistrationFlow) GetActive() IdentityCredentialsType {
	if o == nil || o.Active == nil {
		var ret IdentityCredentialsType
		return ret
	}
	return *o.Active
}

// GetActiveOk returns a tuple with the Active field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetActiveOk() (*IdentityCredentialsType, bool) {
	if o == nil || o.Active == nil {
		return nil, false
	}
	return o.Active, true
}

// HasActive returns a boolean if a field has been set.
func (o *RegistrationFlow) HasActive() bool {
	if o != nil && o.Active != nil {
		return true
	}

	return false
}

// SetActive gets a reference to the given IdentityCredentialsType and assigns it to the Active field.
func (o *RegistrationFlow) SetActive(v IdentityCredentialsType) {
	o.Active = &v
}

// GetExpiresAt returns the ExpiresAt field value
func (o *RegistrationFlow) GetExpiresAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.ExpiresAt
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ExpiresAt, true
}

// SetExpiresAt sets field value
func (o *RegistrationFlow) SetExpiresAt(v time.Time) {
	o.ExpiresAt = v
}

// GetId returns the Id field value
func (o *RegistrationFlow) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *RegistrationFlow) SetId(v string) {
	o.Id = v
}

// GetIssuedAt returns the IssuedAt field value
func (o *RegistrationFlow) GetIssuedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.IssuedAt
}

// GetIssuedAtOk returns a tuple with the IssuedAt field value
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetIssuedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.IssuedAt, true
}

// SetIssuedAt sets field value
func (o *RegistrationFlow) SetIssuedAt(v time.Time) {
	o.IssuedAt = v
}

// GetOauth2LoginChallenge returns the Oauth2LoginChallenge field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RegistrationFlow) GetOauth2LoginChallenge() string {
	if o == nil || o.Oauth2LoginChallenge.Get() == nil {
		var ret string
		return ret
	}
	return *o.Oauth2LoginChallenge.Get()
}

// GetOauth2LoginChallengeOk returns a tuple with the Oauth2LoginChallenge field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RegistrationFlow) GetOauth2LoginChallengeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Oauth2LoginChallenge.Get(), o.Oauth2LoginChallenge.IsSet()
}

// HasOauth2LoginChallenge returns a boolean if a field has been set.
func (o *RegistrationFlow) HasOauth2LoginChallenge() bool {
	if o != nil && o.Oauth2LoginChallenge.IsSet() {
		return true
	}

	return false
}

// SetOauth2LoginChallenge gets a reference to the given NullableString and assigns it to the Oauth2LoginChallenge field.
func (o *RegistrationFlow) SetOauth2LoginChallenge(v string) {
	o.Oauth2LoginChallenge.Set(&v)
}
// SetOauth2LoginChallengeNil sets the value for Oauth2LoginChallenge to be an explicit nil
func (o *RegistrationFlow) SetOauth2LoginChallengeNil() {
	o.Oauth2LoginChallenge.Set(nil)
}

// UnsetOauth2LoginChallenge ensures that no value is present for Oauth2LoginChallenge, not even an explicit nil
func (o *RegistrationFlow) UnsetOauth2LoginChallenge() {
	o.Oauth2LoginChallenge.Unset()
}

// GetOauth2LoginRequest returns the Oauth2LoginRequest field value if set, zero value otherwise.
func (o *RegistrationFlow) GetOauth2LoginRequest() OAuth2LoginRequest {
	if o == nil || o.Oauth2LoginRequest == nil {
		var ret OAuth2LoginRequest
		return ret
	}
	return *o.Oauth2LoginRequest
}

// GetOauth2LoginRequestOk returns a tuple with the Oauth2LoginRequest field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetOauth2LoginRequestOk() (*OAuth2LoginRequest, bool) {
	if o == nil || o.Oauth2LoginRequest == nil {
		return nil, false
	}
	return o.Oauth2LoginRequest, true
}

// HasOauth2LoginRequest returns a boolean if a field has been set.
func (o *RegistrationFlow) HasOauth2LoginRequest() bool {
	if o != nil && o.Oauth2LoginRequest != nil {
		return true
	}

	return false
}

// SetOauth2LoginRequest gets a reference to the given OAuth2LoginRequest and assigns it to the Oauth2LoginRequest field.
func (o *RegistrationFlow) SetOauth2LoginRequest(v OAuth2LoginRequest) {
	o.Oauth2LoginRequest = &v
}

// GetRequestUrl returns the RequestUrl field value
func (o *RegistrationFlow) GetRequestUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RequestUrl
}

// GetRequestUrlOk returns a tuple with the RequestUrl field value
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetRequestUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RequestUrl, true
}

// SetRequestUrl sets field value
func (o *RegistrationFlow) SetRequestUrl(v string) {
	o.RequestUrl = v
}

// GetReturnTo returns the ReturnTo field value if set, zero value otherwise.
func (o *RegistrationFlow) GetReturnTo() string {
	if o == nil || o.ReturnTo == nil {
		var ret string
		return ret
	}
	return *o.ReturnTo
}

// GetReturnToOk returns a tuple with the ReturnTo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetReturnToOk() (*string, bool) {
	if o == nil || o.ReturnTo == nil {
		return nil, false
	}
	return o.ReturnTo, true
}

// HasReturnTo returns a boolean if a field has been set.
func (o *RegistrationFlow) HasReturnTo() bool {
	if o != nil && o.ReturnTo != nil {
		return true
	}

	return false
}

// SetReturnTo gets a reference to the given string and assigns it to the ReturnTo field.
func (o *RegistrationFlow) SetReturnTo(v string) {
	o.ReturnTo = &v
}

// GetType returns the Type field value
func (o *RegistrationFlow) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *RegistrationFlow) SetType(v string) {
	o.Type = v
}

// GetUi returns the Ui field value
func (o *RegistrationFlow) GetUi() UiContainer {
	if o == nil {
		var ret UiContainer
		return ret
	}

	return o.Ui
}

// GetUiOk returns a tuple with the Ui field value
// and a boolean to check if the value has been set.
func (o *RegistrationFlow) GetUiOk() (*UiContainer, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Ui, true
}

// SetUi sets field value
func (o *RegistrationFlow) SetUi(v UiContainer) {
	o.Ui = v
}

func (o RegistrationFlow) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Active != nil {
		toSerialize["active"] = o.Active
	}
	if true {
		toSerialize["expires_at"] = o.ExpiresAt
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["issued_at"] = o.IssuedAt
	}
	if o.Oauth2LoginChallenge.IsSet() {
		toSerialize["oauth2_login_challenge"] = o.Oauth2LoginChallenge.Get()
	}
	if o.Oauth2LoginRequest != nil {
		toSerialize["oauth2_login_request"] = o.Oauth2LoginRequest
	}
	if true {
		toSerialize["request_url"] = o.RequestUrl
	}
	if o.ReturnTo != nil {
		toSerialize["return_to"] = o.ReturnTo
	}
	if true {
		toSerialize["type"] = o.Type
	}
	if true {
		toSerialize["ui"] = o.Ui
	}
	return json.Marshal(toSerialize)
}

type NullableRegistrationFlow struct {
	value *RegistrationFlow
	isSet bool
}

func (v NullableRegistrationFlow) Get() *RegistrationFlow {
	return v.value
}

func (v *NullableRegistrationFlow) Set(val *RegistrationFlow) {
	v.value = val
	v.isSet = true
}

func (v NullableRegistrationFlow) IsSet() bool {
	return v.isSet
}

func (v *NullableRegistrationFlow) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRegistrationFlow(val *RegistrationFlow) *NullableRegistrationFlow {
	return &NullableRegistrationFlow{value: val, isSet: true}
}

func (v NullableRegistrationFlow) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRegistrationFlow) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


