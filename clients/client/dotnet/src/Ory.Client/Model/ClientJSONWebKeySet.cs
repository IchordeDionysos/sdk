/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.47
 * Contact: support@ory.sh
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
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// It is important that this model object is named JSONWebKeySet for \&quot;swagger generate spec\&quot; to generate only on definition of a JSONWebKeySet. Since one with the same name is previously defined as client.Client.JSONWebKeys and this one is last, this one will be effectively written in the swagger spec.
    /// </summary>
    [DataContract(Name = "JSONWebKeySet")]
    public partial class ClientJSONWebKeySet : IEquatable<ClientJSONWebKeySet>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientJSONWebKeySet" /> class.
        /// </summary>
        /// <param name="keys">The value of the \&quot;keys\&quot; parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired..</param>
        public ClientJSONWebKeySet(List<ClientJSONWebKey> keys = default(List<ClientJSONWebKey>))
        {
            this.Keys = keys;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The value of the \&quot;keys\&quot; parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.
        /// </summary>
        /// <value>The value of the \&quot;keys\&quot; parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.</value>
        [DataMember(Name = "keys", EmitDefaultValue = false)]
        public List<ClientJSONWebKey> Keys { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClientJSONWebKeySet {\n");
            sb.Append("  Keys: ").Append(Keys).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
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
            return this.Equals(input as ClientJSONWebKeySet);
        }

        /// <summary>
        /// Returns true if ClientJSONWebKeySet instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientJSONWebKeySet to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientJSONWebKeySet input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Keys == input.Keys ||
                    this.Keys != null &&
                    input.Keys != null &&
                    this.Keys.SequenceEqual(input.Keys)
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
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
                if (this.Keys != null)
                {
                    hashCode = (hashCode * 59) + this.Keys.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
