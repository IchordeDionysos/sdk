/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.7
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct QuotaBrandingThemes {
    #[serde(rename = "can_add", skip_serializing_if = "Option::is_none")]
    pub can_add: Option<bool>,
}

impl Default for QuotaBrandingThemes {
    fn default() -> Self {
        Self::new()
    }
}

impl QuotaBrandingThemes {
    pub fn new() -> QuotaBrandingThemes {
        QuotaBrandingThemes {
                can_add: None,
        }
    }
}


