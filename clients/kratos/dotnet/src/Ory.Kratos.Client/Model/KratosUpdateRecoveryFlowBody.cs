/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.1
 * Contact: office@ory.sh
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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// Update Recovery Flow Request Body
    /// </summary>
    [JsonConverter(typeof(KratosUpdateRecoveryFlowBodyJsonConverter))]
    [DataContract(Name = "updateRecoveryFlowBody")]
    public partial class KratosUpdateRecoveryFlowBody : AbstractOpenAPISchema, IEquatable<KratosUpdateRecoveryFlowBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateRecoveryFlowBody" /> class
        /// with the <see cref="KratosUpdateRecoveryFlowWithCodeMethod" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of KratosUpdateRecoveryFlowWithCodeMethod.</param>
        public KratosUpdateRecoveryFlowBody(KratosUpdateRecoveryFlowWithCodeMethod actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateRecoveryFlowBody" /> class
        /// with the <see cref="KratosUpdateRecoveryFlowWithLinkMethod" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of KratosUpdateRecoveryFlowWithLinkMethod.</param>
        public KratosUpdateRecoveryFlowBody(KratosUpdateRecoveryFlowWithLinkMethod actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(KratosUpdateRecoveryFlowWithCodeMethod))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(KratosUpdateRecoveryFlowWithLinkMethod))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: KratosUpdateRecoveryFlowWithCodeMethod, KratosUpdateRecoveryFlowWithLinkMethod");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `KratosUpdateRecoveryFlowWithCodeMethod`. If the actual instance is not `KratosUpdateRecoveryFlowWithCodeMethod`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of KratosUpdateRecoveryFlowWithCodeMethod</returns>
        public KratosUpdateRecoveryFlowWithCodeMethod GetKratosUpdateRecoveryFlowWithCodeMethod()
        {
            return (KratosUpdateRecoveryFlowWithCodeMethod)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `KratosUpdateRecoveryFlowWithLinkMethod`. If the actual instance is not `KratosUpdateRecoveryFlowWithLinkMethod`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of KratosUpdateRecoveryFlowWithLinkMethod</returns>
        public KratosUpdateRecoveryFlowWithLinkMethod GetKratosUpdateRecoveryFlowWithLinkMethod()
        {
            return (KratosUpdateRecoveryFlowWithLinkMethod)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KratosUpdateRecoveryFlowBody {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, KratosUpdateRecoveryFlowBody.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of KratosUpdateRecoveryFlowBody
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of KratosUpdateRecoveryFlowBody</returns>
        public static KratosUpdateRecoveryFlowBody FromJson(string jsonString)
        {
            KratosUpdateRecoveryFlowBody newKratosUpdateRecoveryFlowBody = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newKratosUpdateRecoveryFlowBody;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(KratosUpdateRecoveryFlowWithCodeMethod).GetProperty("AdditionalProperties") == null)
                {
                    newKratosUpdateRecoveryFlowBody = new KratosUpdateRecoveryFlowBody(JsonConvert.DeserializeObject<KratosUpdateRecoveryFlowWithCodeMethod>(jsonString, KratosUpdateRecoveryFlowBody.SerializerSettings));
                }
                else
                {
                    newKratosUpdateRecoveryFlowBody = new KratosUpdateRecoveryFlowBody(JsonConvert.DeserializeObject<KratosUpdateRecoveryFlowWithCodeMethod>(jsonString, KratosUpdateRecoveryFlowBody.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("KratosUpdateRecoveryFlowWithCodeMethod");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into KratosUpdateRecoveryFlowWithCodeMethod: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(KratosUpdateRecoveryFlowWithLinkMethod).GetProperty("AdditionalProperties") == null)
                {
                    newKratosUpdateRecoveryFlowBody = new KratosUpdateRecoveryFlowBody(JsonConvert.DeserializeObject<KratosUpdateRecoveryFlowWithLinkMethod>(jsonString, KratosUpdateRecoveryFlowBody.SerializerSettings));
                }
                else
                {
                    newKratosUpdateRecoveryFlowBody = new KratosUpdateRecoveryFlowBody(JsonConvert.DeserializeObject<KratosUpdateRecoveryFlowWithLinkMethod>(jsonString, KratosUpdateRecoveryFlowBody.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("KratosUpdateRecoveryFlowWithLinkMethod");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into KratosUpdateRecoveryFlowWithLinkMethod: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newKratosUpdateRecoveryFlowBody;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KratosUpdateRecoveryFlowBody);
        }

        /// <summary>
        /// Returns true if KratosUpdateRecoveryFlowBody instances are equal
        /// </summary>
        /// <param name="input">Instance of KratosUpdateRecoveryFlowBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KratosUpdateRecoveryFlowBody input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
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
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
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

    /// <summary>
    /// Custom JSON converter for KratosUpdateRecoveryFlowBody
    /// </summary>
    public class KratosUpdateRecoveryFlowBodyJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(KratosUpdateRecoveryFlowBody).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return KratosUpdateRecoveryFlowBody.FromJson(JObject.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
