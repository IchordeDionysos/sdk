/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0-alpha.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// ActiveProjectInConsole : The Active Project ID



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ActiveProjectInConsole {
    /// The Active Project ID  format: uuid
    #[serde(rename = "project_id", skip_serializing_if = "Option::is_none")]
    pub project_id: Option<String>,
}

impl Default for ActiveProjectInConsole {
    fn default() -> Self {
        Self::new()
    }
}

impl ActiveProjectInConsole {
    /// The Active Project ID
    pub fn new() -> ActiveProjectInConsole {
        ActiveProjectInConsole {
                project_id: None,
        }
    }
}


