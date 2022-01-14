/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.45
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// SessionAuthenticationMethod : A singular authenticator used during authentication / login.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SessionAuthenticationMethod {
    /// When the authentication challenge was completed.
    #[serde(rename = "completed_at", skip_serializing_if = "Option::is_none")]
    pub completed_at: Option<String>,
    #[serde(rename = "method", skip_serializing_if = "Option::is_none")]
    pub method: Option<Method>,
}

impl SessionAuthenticationMethod {
    /// A singular authenticator used during authentication / login.
    pub fn new() -> SessionAuthenticationMethod {
        SessionAuthenticationMethod {
            completed_at: None,
            method: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Method {
    #[serde(rename = "link_recovery")]
    LinkRecovery,
    #[serde(rename = "password")]
    Password,
    #[serde(rename = "totp")]
    Totp,
    #[serde(rename = "oidc")]
    Oidc,
    #[serde(rename = "webauthn")]
    Webauthn,
}
