/*
 * Ory Oathkeeper API
 *
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v0.8.0-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// PatchDelta : PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta patch delta



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PatchDelta {
    /// action
    #[serde(rename = "action", skip_serializing_if = "Option::is_none")]
    pub action: Option<Action>,
    #[serde(rename = "relation_tuple", skip_serializing_if = "Option::is_none")]
    pub relation_tuple: Option<Box<crate::models::InternalRelationTuple>>,
}

impl PatchDelta {
    /// PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta PatchDelta patch delta
    pub fn new() -> PatchDelta {
        PatchDelta {
            action: None,
            relation_tuple: None,
        }
    }
}

/// action
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Action {
    #[serde(rename = "[[[[[[[[[[insert delete]]]]]]]]]]")]
    InsertDelete,
}

