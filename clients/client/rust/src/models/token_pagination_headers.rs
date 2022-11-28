/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0-alpha.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct TokenPaginationHeaders {
    /// The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header
    #[serde(rename = "link", skip_serializing_if = "Option::is_none")]
    pub link: Option<String>,
    /// The total number of clients.  in: header
    #[serde(rename = "x-total-count", skip_serializing_if = "Option::is_none")]
    pub x_total_count: Option<String>,
}

impl Default for TokenPaginationHeaders {
    fn default() -> Self {
        Self::new()
    }
}

impl TokenPaginationHeaders {
    pub fn new() -> TokenPaginationHeaders {
        TokenPaginationHeaders {
                link: None,
                x_total_count: None,
        }
    }
}


