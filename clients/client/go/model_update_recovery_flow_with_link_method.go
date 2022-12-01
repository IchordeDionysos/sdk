/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.0.1
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// UpdateRecoveryFlowWithLinkMethod Update Recovery Flow with Link Method
type UpdateRecoveryFlowWithLinkMethod struct {
	// Sending the anti-csrf token is only required for browser login flows.
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
	Email string `json:"email"`
	// Method supports `link` only right now.
	Method string `json:"method"`
}

// NewUpdateRecoveryFlowWithLinkMethod instantiates a new UpdateRecoveryFlowWithLinkMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateRecoveryFlowWithLinkMethod(email string, method string) *UpdateRecoveryFlowWithLinkMethod {
	this := UpdateRecoveryFlowWithLinkMethod{}
	this.Email = email
	this.Method = method
	return &this
}

// NewUpdateRecoveryFlowWithLinkMethodWithDefaults instantiates a new UpdateRecoveryFlowWithLinkMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateRecoveryFlowWithLinkMethodWithDefaults() *UpdateRecoveryFlowWithLinkMethod {
	this := UpdateRecoveryFlowWithLinkMethod{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *UpdateRecoveryFlowWithLinkMethod) GetCsrfToken() string {
	if o == nil || o.CsrfToken == nil {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateRecoveryFlowWithLinkMethod) GetCsrfTokenOk() (*string, bool) {
	if o == nil || o.CsrfToken == nil {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *UpdateRecoveryFlowWithLinkMethod) HasCsrfToken() bool {
	if o != nil && o.CsrfToken != nil {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *UpdateRecoveryFlowWithLinkMethod) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetEmail returns the Email field value
func (o *UpdateRecoveryFlowWithLinkMethod) GetEmail() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Email
}

// GetEmailOk returns a tuple with the Email field value
// and a boolean to check if the value has been set.
func (o *UpdateRecoveryFlowWithLinkMethod) GetEmailOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Email, true
}

// SetEmail sets field value
func (o *UpdateRecoveryFlowWithLinkMethod) SetEmail(v string) {
	o.Email = v
}

// GetMethod returns the Method field value
func (o *UpdateRecoveryFlowWithLinkMethod) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *UpdateRecoveryFlowWithLinkMethod) GetMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *UpdateRecoveryFlowWithLinkMethod) SetMethod(v string) {
	o.Method = v
}

func (o UpdateRecoveryFlowWithLinkMethod) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CsrfToken != nil {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	if true {
		toSerialize["email"] = o.Email
	}
	if true {
		toSerialize["method"] = o.Method
	}
	return json.Marshal(toSerialize)
}

type NullableUpdateRecoveryFlowWithLinkMethod struct {
	value *UpdateRecoveryFlowWithLinkMethod
	isSet bool
}

func (v NullableUpdateRecoveryFlowWithLinkMethod) Get() *UpdateRecoveryFlowWithLinkMethod {
	return v.value
}

func (v *NullableUpdateRecoveryFlowWithLinkMethod) Set(val *UpdateRecoveryFlowWithLinkMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateRecoveryFlowWithLinkMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateRecoveryFlowWithLinkMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateRecoveryFlowWithLinkMethod(val *UpdateRecoveryFlowWithLinkMethod) *NullableUpdateRecoveryFlowWithLinkMethod {
	return &NullableUpdateRecoveryFlowWithLinkMethod{value: val, isSet: true}
}

func (v NullableUpdateRecoveryFlowWithLinkMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateRecoveryFlowWithLinkMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

