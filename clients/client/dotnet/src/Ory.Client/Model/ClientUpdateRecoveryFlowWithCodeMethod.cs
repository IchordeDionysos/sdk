/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0-alpha.0
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
    /// Update Recovery Flow with Code Method
    /// </summary>
    [DataContract(Name = "updateRecoveryFlowWithCodeMethod")]
    public partial class ClientUpdateRecoveryFlowWithCodeMethod : IEquatable<ClientUpdateRecoveryFlowWithCodeMethod>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUpdateRecoveryFlowWithCodeMethod" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientUpdateRecoveryFlowWithCodeMethod()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUpdateRecoveryFlowWithCodeMethod" /> class.
        /// </summary>
        /// <param name="code">Code from recovery email  Sent to the user once a recovery has been initiated and is used to prove that the user is in possession of the email.</param>
        /// <param name="csrfToken">Sending the anti-csrf token is only required for browser login flows..</param>
        /// <param name="email">Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email.</param>
        /// <param name="method">Method supports &#x60;link&#x60; and &#x60;code&#x60; only right now. (required).</param>
        public ClientUpdateRecoveryFlowWithCodeMethod(string code = default(string), string csrfToken = default(string), string email = default(string), string method = default(string))
        {
            // to ensure "method" is required (not null)
            if (method == null) {
                throw new ArgumentNullException("method is a required property for ClientUpdateRecoveryFlowWithCodeMethod and cannot be null");
            }
            this.Method = method;
            this.Code = code;
            this.CsrfToken = csrfToken;
            this.Email = email;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Code from recovery email  Sent to the user once a recovery has been initiated and is used to prove that the user is in possession of the email
        /// </summary>
        /// <value>Code from recovery email  Sent to the user once a recovery has been initiated and is used to prove that the user is in possession of the email</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Sending the anti-csrf token is only required for browser login flows.
        /// </summary>
        /// <value>Sending the anti-csrf token is only required for browser login flows.</value>
        [DataMember(Name = "csrf_token", EmitDefaultValue = false)]
        public string CsrfToken { get; set; }

        /// <summary>
        /// Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
        /// </summary>
        /// <value>Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email</value>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// Method supports &#x60;link&#x60; and &#x60;code&#x60; only right now.
        /// </summary>
        /// <value>Method supports &#x60;link&#x60; and &#x60;code&#x60; only right now.</value>
        [DataMember(Name = "method", IsRequired = true, EmitDefaultValue = false)]
        public string Method { get; set; }

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
            sb.Append("class ClientUpdateRecoveryFlowWithCodeMethod {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  CsrfToken: ").Append(CsrfToken).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
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
            return this.Equals(input as ClientUpdateRecoveryFlowWithCodeMethod);
        }

        /// <summary>
        /// Returns true if ClientUpdateRecoveryFlowWithCodeMethod instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientUpdateRecoveryFlowWithCodeMethod to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientUpdateRecoveryFlowWithCodeMethod input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.CsrfToken == input.CsrfToken ||
                    (this.CsrfToken != null &&
                    this.CsrfToken.Equals(input.CsrfToken))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Method == input.Method ||
                    (this.Method != null &&
                    this.Method.Equals(input.Method))
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.CsrfToken != null)
                {
                    hashCode = (hashCode * 59) + this.CsrfToken.GetHashCode();
                }
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.Method != null)
                {
                    hashCode = (hashCode * 59) + this.Method.GetHashCode();
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
