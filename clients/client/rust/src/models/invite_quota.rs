/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0-alpha.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// InviteQuota : Project invite quota



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct InviteQuota {
    #[serde(rename = "project_id", skip_serializing_if = "Option::is_none")]
    pub project_id: Option<String>,
    #[serde(rename = "remaining_seats", skip_serializing_if = "Option::is_none")]
    pub remaining_seats: Option<i64>,
    #[serde(rename = "total_seats", skip_serializing_if = "Option::is_none")]
    pub total_seats: Option<i64>,
}

impl Default for InviteQuota {
    fn default() -> Self {
        Self::new()
    }
}

impl InviteQuota {
    /// Project invite quota
    pub fn new() -> InviteQuota {
        InviteQuota {
                project_id: None,
                remaining_seats: None,
                total_seats: None,
        }
    }
}


