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
    /// KetoOryAccessControlPolicy
    /// </summary>
    [DataContract(Name = "oryAccessControlPolicy")]
    public partial class KetoOryAccessControlPolicy : IEquatable<KetoOryAccessControlPolicy>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KetoOryAccessControlPolicy" /> class.
        /// </summary>
        /// <param name="actions">Actions is an array representing all the actions this ORY Access Policy applies to..</param>
        /// <param name="conditions">Conditions represents a keyed object of conditions under which this ORY Access Policy is active..</param>
        /// <param name="description">Description is an optional, human-readable description..</param>
        /// <param name="effect">Effect is the effect of this ORY Access Policy. It can be \&quot;allow\&quot; or \&quot;deny\&quot;..</param>
        /// <param name="id">ID is the unique identifier of the ORY Access Policy. It is used to query, update, and remove the ORY Access Policy..</param>
        /// <param name="resources">Resources is an array representing all the resources this ORY Access Policy applies to..</param>
        /// <param name="subjects">Subjects is an array representing all the subjects this ORY Access Policy applies to..</param>
        public KetoOryAccessControlPolicy(List<string> actions = default(List<string>), Object conditions = default(Object), string description = default(string), string effect = default(string), string id = default(string), List<string> resources = default(List<string>), List<string> subjects = default(List<string>))
        {
            this.Actions = actions;
            this.Conditions = conditions;
            this.Description = description;
            this.Effect = effect;
            this.Id = id;
            this.Resources = resources;
            this.Subjects = subjects;
        }

        /// <summary>
        /// Actions is an array representing all the actions this ORY Access Policy applies to.
        /// </summary>
        /// <value>Actions is an array representing all the actions this ORY Access Policy applies to.</value>
        [DataMember(Name = "actions", EmitDefaultValue = false)]
        public List<string> Actions { get; set; }

        /// <summary>
        /// Conditions represents a keyed object of conditions under which this ORY Access Policy is active.
        /// </summary>
        /// <value>Conditions represents a keyed object of conditions under which this ORY Access Policy is active.</value>
        [DataMember(Name = "conditions", EmitDefaultValue = false)]
        public Object Conditions { get; set; }

        /// <summary>
        /// Description is an optional, human-readable description.
        /// </summary>
        /// <value>Description is an optional, human-readable description.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Effect is the effect of this ORY Access Policy. It can be \&quot;allow\&quot; or \&quot;deny\&quot;.
        /// </summary>
        /// <value>Effect is the effect of this ORY Access Policy. It can be \&quot;allow\&quot; or \&quot;deny\&quot;.</value>
        [DataMember(Name = "effect", EmitDefaultValue = false)]
        public string Effect { get; set; }

        /// <summary>
        /// ID is the unique identifier of the ORY Access Policy. It is used to query, update, and remove the ORY Access Policy.
        /// </summary>
        /// <value>ID is the unique identifier of the ORY Access Policy. It is used to query, update, and remove the ORY Access Policy.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Resources is an array representing all the resources this ORY Access Policy applies to.
        /// </summary>
        /// <value>Resources is an array representing all the resources this ORY Access Policy applies to.</value>
        [DataMember(Name = "resources", EmitDefaultValue = false)]
        public List<string> Resources { get; set; }

        /// <summary>
        /// Subjects is an array representing all the subjects this ORY Access Policy applies to.
        /// </summary>
        /// <value>Subjects is an array representing all the subjects this ORY Access Policy applies to.</value>
        [DataMember(Name = "subjects", EmitDefaultValue = false)]
        public List<string> Subjects { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KetoOryAccessControlPolicy {\n");
            sb.Append("  Actions: ").Append(Actions).Append("\n");
            sb.Append("  Conditions: ").Append(Conditions).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Effect: ").Append(Effect).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Resources: ").Append(Resources).Append("\n");
            sb.Append("  Subjects: ").Append(Subjects).Append("\n");
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
            return this.Equals(input as KetoOryAccessControlPolicy);
        }

        /// <summary>
        /// Returns true if KetoOryAccessControlPolicy instances are equal
        /// </summary>
        /// <param name="input">Instance of KetoOryAccessControlPolicy to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KetoOryAccessControlPolicy input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Actions == input.Actions ||
                    this.Actions != null &&
                    input.Actions != null &&
                    this.Actions.SequenceEqual(input.Actions)
                ) && 
                (
                    this.Conditions == input.Conditions ||
                    (this.Conditions != null &&
                    this.Conditions.Equals(input.Conditions))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Effect == input.Effect ||
                    (this.Effect != null &&
                    this.Effect.Equals(input.Effect))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Resources == input.Resources ||
                    this.Resources != null &&
                    input.Resources != null &&
                    this.Resources.SequenceEqual(input.Resources)
                ) && 
                (
                    this.Subjects == input.Subjects ||
                    this.Subjects != null &&
                    input.Subjects != null &&
                    this.Subjects.SequenceEqual(input.Subjects)
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
                if (this.Actions != null)
                    hashCode = hashCode * 59 + this.Actions.GetHashCode();
                if (this.Conditions != null)
                    hashCode = hashCode * 59 + this.Conditions.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Effect != null)
                    hashCode = hashCode * 59 + this.Effect.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Resources != null)
                    hashCode = hashCode * 59 + this.Resources.GetHashCode();
                if (this.Subjects != null)
                    hashCode = hashCode * 59 + this.Subjects.GetHashCode();
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
