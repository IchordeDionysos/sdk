/*
 * ORY Keto
 *
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.55
 * Contact: hi@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Keto.Client.Client.OpenAPIDateConverter;

namespace Ory.Keto.Client.Model
{
    /// <summary>
    /// KetoAddOryAccessControlPolicyRoleMembersBody
    /// </summary>
    [DataContract(Name = "addOryAccessControlPolicyRoleMembersBody")]
    public partial class KetoAddOryAccessControlPolicyRoleMembersBody : IEquatable<KetoAddOryAccessControlPolicyRoleMembersBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KetoAddOryAccessControlPolicyRoleMembersBody" /> class.
        /// </summary>
        /// <param name="members">The members to be added..</param>
        public KetoAddOryAccessControlPolicyRoleMembersBody(List<string> members = default(List<string>))
        {
            this.Members = members;
        }

        /// <summary>
        /// The members to be added.
        /// </summary>
        /// <value>The members to be added.</value>
        [DataMember(Name = "members", EmitDefaultValue = false)]
        public List<string> Members { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KetoAddOryAccessControlPolicyRoleMembersBody {\n");
            sb.Append("  Members: ").Append(Members).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KetoAddOryAccessControlPolicyRoleMembersBody);
        }

        /// <summary>
        /// Returns true if KetoAddOryAccessControlPolicyRoleMembersBody instances are equal
        /// </summary>
        /// <param name="input">Instance of KetoAddOryAccessControlPolicyRoleMembersBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KetoAddOryAccessControlPolicyRoleMembersBody input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Members == input.Members ||
                    this.Members != null &&
                    input.Members != null &&
                    this.Members.SequenceEqual(input.Members)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Members != null)
                    hashCode = hashCode * 59 + this.Members.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
