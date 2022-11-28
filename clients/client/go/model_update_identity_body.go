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

// UpdateIdentityBody Update Identity Body
type UpdateIdentityBody struct {
	Credentials *IdentityWithCredentials `json:"credentials,omitempty"`
	// Store metadata about the user which is only accessible through admin APIs such as `GET /admin/identities/<id>`.
	MetadataAdmin interface{} `json:"metadata_admin,omitempty"`
	// Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
	MetadataPublic interface{} `json:"metadata_public,omitempty"`
	// SchemaID is the ID of the JSON Schema to be used for validating the identity's traits. If set will update the Identity's SchemaID.
	SchemaId string `json:"schema_id"`
	State IdentityState `json:"state"`
	// Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_id`.
	Traits map[string]interface{} `json:"traits"`
}

// NewUpdateIdentityBody instantiates a new UpdateIdentityBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateIdentityBody(schemaId string, state IdentityState, traits map[string]interface{}) *UpdateIdentityBody {
	this := UpdateIdentityBody{}
	this.SchemaId = schemaId
	this.State = state
	this.Traits = traits
	return &this
}

// NewUpdateIdentityBodyWithDefaults instantiates a new UpdateIdentityBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateIdentityBodyWithDefaults() *UpdateIdentityBody {
	this := UpdateIdentityBody{}
	return &this
}

// GetCredentials returns the Credentials field value if set, zero value otherwise.
func (o *UpdateIdentityBody) GetCredentials() IdentityWithCredentials {
	if o == nil || o.Credentials == nil {
		var ret IdentityWithCredentials
		return ret
	}
	return *o.Credentials
}

// GetCredentialsOk returns a tuple with the Credentials field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateIdentityBody) GetCredentialsOk() (*IdentityWithCredentials, bool) {
	if o == nil || o.Credentials == nil {
		return nil, false
	}
	return o.Credentials, true
}

// HasCredentials returns a boolean if a field has been set.
func (o *UpdateIdentityBody) HasCredentials() bool {
	if o != nil && o.Credentials != nil {
		return true
	}

	return false
}

// SetCredentials gets a reference to the given IdentityWithCredentials and assigns it to the Credentials field.
func (o *UpdateIdentityBody) SetCredentials(v IdentityWithCredentials) {
	o.Credentials = &v
}

// GetMetadataAdmin returns the MetadataAdmin field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UpdateIdentityBody) GetMetadataAdmin() interface{} {
	if o == nil {
		var ret interface{}
		return ret
	}
	return o.MetadataAdmin
}

// GetMetadataAdminOk returns a tuple with the MetadataAdmin field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UpdateIdentityBody) GetMetadataAdminOk() (*interface{}, bool) {
	if o == nil || o.MetadataAdmin == nil {
		return nil, false
	}
	return &o.MetadataAdmin, true
}

// HasMetadataAdmin returns a boolean if a field has been set.
func (o *UpdateIdentityBody) HasMetadataAdmin() bool {
	if o != nil && o.MetadataAdmin != nil {
		return true
	}

	return false
}

// SetMetadataAdmin gets a reference to the given interface{} and assigns it to the MetadataAdmin field.
func (o *UpdateIdentityBody) SetMetadataAdmin(v interface{}) {
	o.MetadataAdmin = v
}

// GetMetadataPublic returns the MetadataPublic field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UpdateIdentityBody) GetMetadataPublic() interface{} {
	if o == nil {
		var ret interface{}
		return ret
	}
	return o.MetadataPublic
}

// GetMetadataPublicOk returns a tuple with the MetadataPublic field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UpdateIdentityBody) GetMetadataPublicOk() (*interface{}, bool) {
	if o == nil || o.MetadataPublic == nil {
		return nil, false
	}
	return &o.MetadataPublic, true
}

// HasMetadataPublic returns a boolean if a field has been set.
func (o *UpdateIdentityBody) HasMetadataPublic() bool {
	if o != nil && o.MetadataPublic != nil {
		return true
	}

	return false
}

// SetMetadataPublic gets a reference to the given interface{} and assigns it to the MetadataPublic field.
func (o *UpdateIdentityBody) SetMetadataPublic(v interface{}) {
	o.MetadataPublic = v
}

// GetSchemaId returns the SchemaId field value
func (o *UpdateIdentityBody) GetSchemaId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SchemaId
}

// GetSchemaIdOk returns a tuple with the SchemaId field value
// and a boolean to check if the value has been set.
func (o *UpdateIdentityBody) GetSchemaIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SchemaId, true
}

// SetSchemaId sets field value
func (o *UpdateIdentityBody) SetSchemaId(v string) {
	o.SchemaId = v
}

// GetState returns the State field value
func (o *UpdateIdentityBody) GetState() IdentityState {
	if o == nil {
		var ret IdentityState
		return ret
	}

	return o.State
}

// GetStateOk returns a tuple with the State field value
// and a boolean to check if the value has been set.
func (o *UpdateIdentityBody) GetStateOk() (*IdentityState, bool) {
	if o == nil {
		return nil, false
	}
	return &o.State, true
}

// SetState sets field value
func (o *UpdateIdentityBody) SetState(v IdentityState) {
	o.State = v
}

// GetTraits returns the Traits field value
func (o *UpdateIdentityBody) GetTraits() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Traits
}

// GetTraitsOk returns a tuple with the Traits field value
// and a boolean to check if the value has been set.
func (o *UpdateIdentityBody) GetTraitsOk() (map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Traits, true
}

// SetTraits sets field value
func (o *UpdateIdentityBody) SetTraits(v map[string]interface{}) {
	o.Traits = v
}

func (o UpdateIdentityBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Credentials != nil {
		toSerialize["credentials"] = o.Credentials
	}
	if o.MetadataAdmin != nil {
		toSerialize["metadata_admin"] = o.MetadataAdmin
	}
	if o.MetadataPublic != nil {
		toSerialize["metadata_public"] = o.MetadataPublic
	}
	if true {
		toSerialize["schema_id"] = o.SchemaId
	}
	if true {
		toSerialize["state"] = o.State
	}
	if true {
		toSerialize["traits"] = o.Traits
	}
	return json.Marshal(toSerialize)
}

type NullableUpdateIdentityBody struct {
	value *UpdateIdentityBody
	isSet bool
}

func (v NullableUpdateIdentityBody) Get() *UpdateIdentityBody {
	return v.value
}

func (v *NullableUpdateIdentityBody) Set(val *UpdateIdentityBody) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateIdentityBody) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateIdentityBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateIdentityBody(val *UpdateIdentityBody) *NullableUpdateIdentityBody {
	return &NullableUpdateIdentityBody{value: val, isSet: true}
}

func (v NullableUpdateIdentityBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateIdentityBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


