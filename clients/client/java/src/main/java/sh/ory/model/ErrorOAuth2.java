/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0-alpha.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * Error
 */
@ApiModel(description = "Error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T09:00:20.924958308Z[Etc/UTC]")
public class ErrorOAuth2 {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ERROR_DEBUG = "error_debug";
  @SerializedName(SERIALIZED_NAME_ERROR_DEBUG)
  private String errorDebug;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "error_description";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private String errorDescription;

  public static final String SERIALIZED_NAME_ERROR_HINT = "error_hint";
  @SerializedName(SERIALIZED_NAME_ERROR_HINT)
  private String errorHint;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Long statusCode;

  public ErrorOAuth2() { 
  }

  public ErrorOAuth2 error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public ErrorOAuth2 errorDebug(String errorDebug) {
    
    this.errorDebug = errorDebug;
    return this;
  }

   /**
   * Error Debug Information  Only available in dev mode.
   * @return errorDebug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error Debug Information  Only available in dev mode.")

  public String getErrorDebug() {
    return errorDebug;
  }


  public void setErrorDebug(String errorDebug) {
    this.errorDebug = errorDebug;
  }


  public ErrorOAuth2 errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Error Description
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error Description")

  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public ErrorOAuth2 errorHint(String errorHint) {
    
    this.errorHint = errorHint;
    return this;
  }

   /**
   * Error Hint  Helps the user identify the error cause.
   * @return errorHint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The redirect URL is not allowed.", value = "Error Hint  Helps the user identify the error cause.")

  public String getErrorHint() {
    return errorHint;
  }


  public void setErrorHint(String errorHint) {
    this.errorHint = errorHint;
  }


  public ErrorOAuth2 statusCode(Long statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * HTTP Status Code
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "401", value = "HTTP Status Code")

  public Long getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorOAuth2 errorOAuth2 = (ErrorOAuth2) o;
    return Objects.equals(this.error, errorOAuth2.error) &&
        Objects.equals(this.errorDebug, errorOAuth2.errorDebug) &&
        Objects.equals(this.errorDescription, errorOAuth2.errorDescription) &&
        Objects.equals(this.errorHint, errorOAuth2.errorHint) &&
        Objects.equals(this.statusCode, errorOAuth2.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDebug, errorDescription, errorHint, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorOAuth2 {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDebug: ").append(toIndentedString(errorDebug)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorHint: ").append(toIndentedString(errorHint)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("error");
    openapiFields.add("error_debug");
    openapiFields.add("error_description");
    openapiFields.add("error_hint");
    openapiFields.add("status_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ErrorOAuth2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ErrorOAuth2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorOAuth2 is not found in the empty JSON string", ErrorOAuth2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ErrorOAuth2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorOAuth2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if (jsonObj.get("error_debug") != null && !jsonObj.get("error_debug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_debug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_debug").toString()));
      }
      if (jsonObj.get("error_description") != null && !jsonObj.get("error_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_description").toString()));
      }
      if (jsonObj.get("error_hint") != null && !jsonObj.get("error_hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_hint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorOAuth2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorOAuth2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorOAuth2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorOAuth2.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorOAuth2>() {
           @Override
           public void write(JsonWriter out, ErrorOAuth2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorOAuth2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrorOAuth2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorOAuth2
  * @throws IOException if the JSON string is invalid with respect to ErrorOAuth2
  */
  public static ErrorOAuth2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorOAuth2.class);
  }

 /**
  * Convert an instance of ErrorOAuth2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

